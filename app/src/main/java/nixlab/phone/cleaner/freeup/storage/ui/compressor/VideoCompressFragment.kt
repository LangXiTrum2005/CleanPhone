package nixlab.phone.cleaner.freeup.storage.ui.compressor

import android.app.Activity
import android.content.ContentUris
import android.content.Context
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import android.content.DialogInterface
import androidx.fragment.app.Fragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import nixlab.phone.cleaner.freeup.storage.R
import nixlab.phone.cleaner.freeup.storage.data.model.MediaAsset
import nixlab.phone.cleaner.freeup.storage.data.repository.StorageScannerRepository
import nixlab.phone.cleaner.freeup.storage.databinding.DialogVideoCompressProgressBinding
import nixlab.phone.cleaner.freeup.storage.databinding.FragmentVideoCompressBinding
import nixlab.phone.cleaner.freeup.storage.domain.compressor.VideoCompressor
import nixlab.phone.cleaner.freeup.storage.util.FileUtils
import nixlab.phone.cleaner.freeup.storage.util.PermissionUtils
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class VideoCompressFragment : Fragment() {

    private var _binding: FragmentVideoCompressBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: VideoCompressAdapter
    private val videoList = mutableListOf<MediaAsset>()
    private var selectedPreset = VideoCompressor.QualityPreset.ULTIMATE

    private lateinit var repository: StorageScannerRepository
    private var pendingDeleteAsset: MediaAsset? = null
    private var activeProgressDialog: BottomSheetDialog? = null
    private var compressionJob: Job? = null

    private val permissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        val granted = permissions.values.any { it } || (context != null && PermissionUtils.hasMediaPermissions(requireContext()))
        if (granted) {
            loadVideos()
        }
    }

    private val deleteLauncher = registerForActivityResult(
        ActivityResultContracts.StartIntentSenderForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            pendingDeleteAsset?.let { asset ->
                handleOriginalVideoDeleted(asset)
            }
        }
        pendingDeleteAsset = null
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentVideoCompressBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        repository = StorageScannerRepository(requireContext())

        setupViews()
        val ctx = context
        if (ctx != null && PermissionUtils.hasMediaPermissions(ctx)) {
            loadVideos()
        } else {
            permissionLauncher.launch(PermissionUtils.getRequiredMediaPermissions())
        }

        viewLifecycleOwner.lifecycleScope.launch {
            nixlab.phone.cleaner.freeup.storage.util.MediaStoreSyncManager.mediaUpdateFlow.collect {
                val currentCtx = context
                if (currentCtx != null && PermissionUtils.hasMediaPermissions(currentCtx)) {
                    loadVideos()
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        val ctx = context
        if (ctx != null && PermissionUtils.hasMediaPermissions(ctx)) {
            loadVideos()
        }
    }

    private fun setupViews() {
        adapter = VideoCompressAdapter(mutableListOf()) { selectedAsset ->
            updateSelectedVideoDisplay(selectedAsset)
        }

        binding.rvVideos.layoutManager = GridLayoutManager(requireContext(), 3)
        binding.rvVideos.adapter = adapter

        setupPresetSelection()

        binding.btnStartCompress.setOnClickListener {
            val selected = adapter.getSelectedVideo()
            if (selected == null) {
                Toast.makeText(requireContext(), R.string.select_video_hint, Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            startCompressionFlow(selected, selectedPreset)
        }
    }

    private fun setupPresetSelection() {
        binding.cardUltimate.setOnClickListener {
            setPreset(VideoCompressor.QualityPreset.ULTIMATE)
        }
        binding.cardModerate.setOnClickListener {
            setPreset(VideoCompressor.QualityPreset.MODERATE)
        }
        binding.cardLight.setOnClickListener {
            setPreset(VideoCompressor.QualityPreset.LIGHT)
        }
    }

    private fun setPreset(preset: VideoCompressor.QualityPreset) {
        selectedPreset = preset
        val ctx = requireContext()

        // Ultimate styling
        val isUlt = preset == VideoCompressor.QualityPreset.ULTIMATE
        binding.rbUltimate.isChecked = isUlt
        binding.cardUltimate.strokeColor = ctx.getColor(if (isUlt) R.color.primary_glow else R.color.border_subtle)
        binding.cardUltimate.strokeWidth = if (isUlt) 4 else 2
        binding.cardUltimate.setCardBackgroundColor(ctx.getColor(if (isUlt) R.color.bg_card_highlight else R.color.bg_card))

        // Moderate styling
        val isMod = preset == VideoCompressor.QualityPreset.MODERATE
        binding.rbModerate.isChecked = isMod
        binding.cardModerate.strokeColor = ctx.getColor(if (isMod) R.color.primary_glow else R.color.border_subtle)
        binding.cardModerate.strokeWidth = if (isMod) 4 else 2
        binding.cardModerate.setCardBackgroundColor(ctx.getColor(if (isMod) R.color.bg_card_highlight else R.color.bg_card))

        // Light styling
        val isLight = preset == VideoCompressor.QualityPreset.LIGHT
        binding.rbLight.isChecked = isLight
        binding.cardLight.strokeColor = ctx.getColor(if (isLight) R.color.primary_glow else R.color.border_subtle)
        binding.cardLight.strokeWidth = if (isLight) 4 else 2
        binding.cardLight.setCardBackgroundColor(ctx.getColor(if (isLight) R.color.bg_card_highlight else R.color.bg_card))
    }

    private fun updateSelectedVideoDisplay(asset: MediaAsset?) {
        if (_binding == null) return
        if (asset == null) {
            binding.cardPresetsSection.visibility = View.GONE
            return
        }

        binding.cardPresetsSection.visibility = View.VISIBLE
        val name = asset.displayName.ifEmpty { "Video" }
        val sizeStr = FileUtils.formatBytes(asset.size)
        binding.tvSelectedVideoInfo.text = "$name ($sizeStr)"

        val ultSaved = (asset.size * (1f - VideoCompressor.QualityPreset.ULTIMATE.bitrateRatio)).toLong()
        val modSaved = (asset.size * (1f - VideoCompressor.QualityPreset.MODERATE.bitrateRatio)).toLong()
        val lightSaved = (asset.size * (1f - VideoCompressor.QualityPreset.LIGHT.bitrateRatio)).toLong()

        binding.tvUltimateEst.text = getString(R.string.video_save_est_fmt, FileUtils.formatBytes(ultSaved))
        binding.tvModerateEst.text = getString(R.string.video_save_est_fmt, FileUtils.formatBytes(modSaved))
        binding.tvLightEst.text = getString(R.string.video_save_est_fmt, FileUtils.formatBytes(lightSaved))
    }

    private fun loadVideos() {
        val appContext = context?.applicationContext ?: return
        if (!PermissionUtils.hasMediaPermissions(appContext)) return

        viewLifecycleOwner.lifecycleScope.launch {
            val list = withContext(Dispatchers.IO) {
                fetchVideos(appContext)
            }
            if (_binding == null) return@launch

            videoList.clear()
            videoList.addAll(list)

            if (videoList.isEmpty()) {
                binding.layoutEmptyState.visibility = View.VISIBLE
                binding.rvVideos.visibility = View.GONE
                binding.cardPresetsSection.visibility = View.GONE
                binding.tvVideoCount.text = getString(R.string.video_count_fmt, 0)
                binding.tvMaxSavedSpace.text = "0 B"
            } else {
                binding.layoutEmptyState.visibility = View.GONE
                binding.rvVideos.visibility = View.VISIBLE
                binding.cardPresetsSection.visibility = View.VISIBLE
                binding.tvVideoCount.text = getString(R.string.video_count_fmt, videoList.size)

                val totalSize = videoList.sumOf { it.size }
                val maxSavings = (totalSize * 0.70).toLong()
                binding.tvMaxSavedSpace.text = FileUtils.formatBytes(maxSavings)

                adapter.updateData(videoList)
                updateSelectedVideoDisplay(adapter.getSelectedVideo())
            }
        }
    }

    private fun fetchVideos(ctx: Context): List<MediaAsset> {
        val list = mutableListOf<MediaAsset>()
        try {
            val projection = arrayOf(
                MediaStore.Video.Media._ID,
                MediaStore.Video.Media.DISPLAY_NAME,
                MediaStore.Video.Media.DATA,
                MediaStore.Video.Media.MIME_TYPE,
                MediaStore.Video.Media.SIZE,
                MediaStore.Video.Media.DATE_ADDED,
                MediaStore.Video.Media.DATE_TAKEN,
                MediaStore.Video.Media.WIDTH,
                MediaStore.Video.Media.HEIGHT,
                MediaStore.Video.Media.DURATION
            )
            val sortOrder = "${MediaStore.Video.Media.SIZE} DESC"
            val query = ctx.contentResolver.query(
                MediaStore.Video.Media.EXTERNAL_CONTENT_URI,
                projection,
                "${MediaStore.Video.Media.SIZE} > 0",
                null,
                sortOrder
            )

            query?.use { cursor ->
                val idCol = cursor.getColumnIndex(MediaStore.Video.Media._ID)
                val nameCol = cursor.getColumnIndex(MediaStore.Video.Media.DISPLAY_NAME)
                val dataCol = cursor.getColumnIndex(MediaStore.Video.Media.DATA)
                val mimeCol = cursor.getColumnIndex(MediaStore.Video.Media.MIME_TYPE)
                val sizeCol = cursor.getColumnIndex(MediaStore.Video.Media.SIZE)
                val addedCol = cursor.getColumnIndex(MediaStore.Video.Media.DATE_ADDED)
                val takenCol = cursor.getColumnIndex(MediaStore.Video.Media.DATE_TAKEN)
                val widthCol = cursor.getColumnIndex(MediaStore.Video.Media.WIDTH)
                val heightCol = cursor.getColumnIndex(MediaStore.Video.Media.HEIGHT)
                val durationCol = cursor.getColumnIndex(MediaStore.Video.Media.DURATION)

                while (cursor.moveToNext()) {
                    val id = if (idCol >= 0) cursor.getLong(idCol) else continue
                    val name = if (nameCol >= 0) cursor.getString(nameCol) ?: "" else ""
                    val path = if (dataCol >= 0) cursor.getString(dataCol) ?: "" else ""
                    val mime = if (mimeCol >= 0) cursor.getString(mimeCol) ?: "video/mp4" else "video/mp4"
                    val size = if (sizeCol >= 0) cursor.getLong(sizeCol) else 0L
                    val added = if (addedCol >= 0) cursor.getLong(addedCol) * 1000L else System.currentTimeMillis()
                    val taken = if (takenCol >= 0) {
                        val t = cursor.getLong(takenCol)
                        if (t > 0) t else added
                    } else added
                    val width = if (widthCol >= 0) cursor.getInt(widthCol) else 0
                    val height = if (heightCol >= 0) cursor.getInt(heightCol) else 0
                    val duration = if (durationCol >= 0) cursor.getLong(durationCol) else 0L

                    val uri = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, id)
                    if (size > 0) {
                        list.add(
                            MediaAsset(
                                id = id,
                                uri = uri,
                                path = path,
                                displayName = name,
                                mimeType = mime,
                                size = size,
                                dateAdded = added,
                                dateTaken = taken,
                                width = width,
                                height = height,
                                durationMs = duration,
                                isVideo = true
                            )
                        )
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return list
    }

    private fun startCompressionFlow(asset: MediaAsset, preset: VideoCompressor.QualityPreset) {
        val dialog = BottomSheetDialog(requireContext())
        val dialogBinding = DialogVideoCompressProgressBinding.inflate(layoutInflater)
        dialog.setContentView(dialogBinding.root)
        dialog.setCancelable(false)
        activeProgressDialog = dialog

        dialogBinding.layoutInProgress.visibility = View.VISIBLE
        dialogBinding.layoutCompleted.visibility = View.GONE
        dialogBinding.compressProgressBar.progress = 0
        dialogBinding.tvProgressPercent.text = "0%"

        dialogBinding.btnCancelCompress.setOnClickListener {
            showCancelConfirmation(dialog)
        }

        dialog.show()

        compressionJob = viewLifecycleOwner.lifecycleScope.launch {
            val result = VideoCompressor.compressVideo(
                requireContext(),
                asset,
                preset
            ) { progress ->
                dialogBinding.compressProgressBar.progress = progress
                dialogBinding.tvProgressPercent.text = "$progress%"
            }

            if (!result.success) {
                dialog.dismiss()
                Toast.makeText(requireContext(), R.string.video_compress_failed_title, Toast.LENGTH_SHORT).show()
                return@launch
            }

            // Show Completed State
            dialogBinding.layoutInProgress.visibility = View.GONE
            dialogBinding.layoutCompleted.visibility = View.VISIBLE
            dialog.setCancelable(true)

            dialogBinding.tvResultOriginalSize.text = FileUtils.formatBytes(result.originalSize)
            dialogBinding.tvResultCompressedSize.text = FileUtils.formatBytes(result.compressedSize)
            val percentSaved = if (result.originalSize > 0) {
                ((result.savedBytes.toDouble() / result.originalSize) * 100).toInt()
            } else 0
            dialogBinding.tvResultSavedSize.text = "🎉 " + getString(R.string.video_compress_congrats_saved) + " " + FileUtils.formatBytes(result.savedBytes) + " ($percentSaved%)"

            // Reload videos immediately so newly compressed video appears
            loadVideos()

            // Action: Keep Both Videos
            dialogBinding.btnKeepBoth.setOnClickListener {
                dialog.dismiss()
                Toast.makeText(
                    requireContext(),
                    getString(R.string.video_compress_progress_completed_title) + " (Movies/Cleanup)",
                    Toast.LENGTH_LONG
                ).show()
                loadVideos()
            }

            // Action: Remove Original Video
            dialogBinding.btnRemoveOriginal.setOnClickListener {
                pendingDeleteAsset = asset
                requestDeleteOriginalVideo(asset)
            }
        }
    }

    private fun showCancelConfirmation(dialog: BottomSheetDialog) {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(R.string.video_compress_exit_popup_title)
            .setMessage(R.string.video_compress_exit_popup_subtitle)
            .setPositiveButton(R.string.video_compress_exit_popup_primary_action) { d: DialogInterface, _ ->
                d.dismiss()
            }
            .setNegativeButton(R.string.video_compress_exit_popup_secondary_action) { d: DialogInterface, _ ->
                compressionJob?.cancel()
                dialog.dismiss()
                d.dismiss()
            }
            .show()
    }

    private fun requestDeleteOriginalVideo(asset: MediaAsset) {
        viewLifecycleOwner.lifecycleScope.launch {
            val intentSender = repository.createDeleteRequest(listOf(asset.uri))?.intentSender
            if (intentSender != null) {
                val request = IntentSenderRequest.Builder(intentSender).build()
                deleteLauncher.launch(request)
            } else {
                handleOriginalVideoDeleted(asset)
            }
        }
    }

    private fun handleOriginalVideoDeleted(asset: MediaAsset) {
        activeProgressDialog?.dismiss()
        activeProgressDialog = null
        adapter.removeVideo(asset.id)
        videoList.removeAll { it.id == asset.id }

        if (videoList.isEmpty()) {
            binding.layoutEmptyState.visibility = View.VISIBLE
            binding.rvVideos.visibility = View.GONE
            binding.cardPresetsSection.visibility = View.GONE
            binding.tvVideoCount.text = getString(R.string.video_count_fmt, 0)
            binding.tvMaxSavedSpace.text = "0 B"
        } else {
            binding.tvVideoCount.text = getString(R.string.video_count_fmt, videoList.size)
            val totalSize = videoList.sumOf { it.size }
            val maxSavings = (totalSize * 0.70).toLong()
            binding.tvMaxSavedSpace.text = FileUtils.formatBytes(maxSavings)
            updateSelectedVideoDisplay(adapter.getSelectedVideo())
        }

        Toast.makeText(
            requireContext(),
            getString(R.string.compress_saved_fmt, FileUtils.formatBytes(asset.size)),
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        compressionJob?.cancel()
        activeProgressDialog?.dismiss()
        _binding = null
    }

    companion object {
        fun newInstance() = VideoCompressFragment()
    }
}
