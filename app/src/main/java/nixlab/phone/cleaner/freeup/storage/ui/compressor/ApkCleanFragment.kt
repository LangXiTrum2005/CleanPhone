package nixlab.phone.cleaner.freeup.storage.ui.compressor

import android.content.ContentUris
import android.content.Context
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import nixlab.phone.cleaner.freeup.storage.R
import nixlab.phone.cleaner.freeup.storage.data.model.ApkAsset
import nixlab.phone.cleaner.freeup.storage.databinding.FragmentApkCleanBinding
import nixlab.phone.cleaner.freeup.storage.util.FileUtils
import nixlab.phone.cleaner.freeup.storage.util.MediaStoreSyncManager
import nixlab.phone.cleaner.freeup.storage.util.PermissionUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.File

class ApkCleanFragment : Fragment() {

    private var _binding: FragmentApkCleanBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: ApkCleanAdapter
    private val apkList = mutableListOf<ApkAsset>()

    private val permissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        val granted = permissions.values.any { it } || (context != null && PermissionUtils.hasMediaPermissions(requireContext()))
        if (granted) {
            loadApkFiles()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentApkCleanBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupViews()

        val ctx = context
        if (ctx != null && PermissionUtils.hasMediaPermissions(ctx)) {
            loadApkFiles()
        } else {
            permissionLauncher.launch(PermissionUtils.getRequiredMediaPermissions())
        }

        viewLifecycleOwner.lifecycleScope.launch {
            MediaStoreSyncManager.mediaUpdateFlow.collect {
                val currentCtx = context
                if (currentCtx != null && PermissionUtils.hasMediaPermissions(currentCtx)) {
                    loadApkFiles()
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        val ctx = context
        if (ctx != null && PermissionUtils.hasMediaPermissions(ctx)) {
            loadApkFiles()
        }
    }

    private fun setupViews() {
        adapter = ApkCleanAdapter(mutableListOf()) {
            updateSelectionDisplay()
        }

        binding.rvApkFiles.layoutManager = LinearLayoutManager(requireContext())
        binding.rvApkFiles.adapter = adapter

        binding.btnSelectAll.setOnClickListener {
            val allSelected = adapter.getSelectedItems().size == adapter.getItems().size
            adapter.selectAll(!allSelected)
        }

        binding.btnCleanSelected.setOnClickListener {
            val selected = adapter.getSelectedItems()
            if (selected.isEmpty()) {
                Toast.makeText(requireContext(), R.string.select_video_hint, Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            confirmAndDeleteApks(selected)
        }
    }

    private fun updateSelectionDisplay() {
        if (_binding == null) return
        val allItems = adapter.getItems()
        val selectedItems = adapter.getSelectedItems()

        val isAllSelected = allItems.isNotEmpty() && selectedItems.size == allItems.size
        binding.btnSelectAll.text = getString(if (isAllSelected) R.string.apk_deselect_all else R.string.apk_select_all)

        val totalSelectedSize = selectedItems.sumOf { it.size }
        val sizeStr = FileUtils.formatBytes(totalSelectedSize)
        binding.btnCleanSelected.text = getString(R.string.apk_btn_clean_fmt, sizeStr)
        binding.btnCleanSelected.isEnabled = selectedItems.isNotEmpty()
    }

    private fun loadApkFiles() {
        val appContext = context?.applicationContext ?: return
        if (!PermissionUtils.hasMediaPermissions(appContext)) return

        viewLifecycleOwner.lifecycleScope.launch {
            val list = withContext(Dispatchers.IO) {
                scanApkFiles(appContext)
            }
            if (_binding == null) return@launch

            apkList.clear()
            apkList.addAll(list)

            if (apkList.isEmpty()) {
                binding.layoutEmptyState.visibility = View.VISIBLE
                binding.rvApkFiles.visibility = View.GONE
                binding.tvApkCount.text = getString(R.string.apk_count_fmt, 0)
                binding.tvTotalApkSize.text = "0 B"
                binding.bottomBar.visibility = View.GONE
            } else {
                binding.layoutEmptyState.visibility = View.GONE
                binding.rvApkFiles.visibility = View.VISIBLE
                binding.bottomBar.visibility = View.VISIBLE
                binding.tvApkCount.text = getString(R.string.apk_count_fmt, apkList.size)

                val totalSize = apkList.sumOf { it.size }
                binding.tvTotalApkSize.text = FileUtils.formatBytes(totalSize)

                adapter.updateData(apkList)
            }
        }
    }

    private fun scanApkFiles(ctx: Context): List<ApkAsset> {
        val list = mutableListOf<ApkAsset>()
        val pm = ctx.packageManager
        val seenPaths = HashSet<String>()

        // 1. Scan MediaStore.Files
        try {
            val projection = arrayOf(
                MediaStore.Files.FileColumns._ID,
                MediaStore.Files.FileColumns.DATA,
                MediaStore.Files.FileColumns.DISPLAY_NAME,
                MediaStore.Files.FileColumns.SIZE,
                MediaStore.Files.FileColumns.DATE_MODIFIED
            )
            val selection = "${MediaStore.Files.FileColumns.DATA} LIKE '%.apk'"
            val query = ctx.contentResolver.query(
                MediaStore.Files.getContentUri("external"),
                projection,
                selection,
                null,
                "${MediaStore.Files.FileColumns.SIZE} DESC"
            )

            query?.use { cursor ->
                val idCol = cursor.getColumnIndex(MediaStore.Files.FileColumns._ID)
                val dataCol = cursor.getColumnIndex(MediaStore.Files.FileColumns.DATA)
                val nameCol = cursor.getColumnIndex(MediaStore.Files.FileColumns.DISPLAY_NAME)
                val sizeCol = cursor.getColumnIndex(MediaStore.Files.FileColumns.SIZE)
                val modCol = cursor.getColumnIndex(MediaStore.Files.FileColumns.DATE_MODIFIED)

                while (cursor.moveToNext()) {
                    val id = if (idCol >= 0) cursor.getLong(idCol) else 0L
                    val path = if (dataCol >= 0) cursor.getString(dataCol) ?: "" else ""
                    val name = if (nameCol >= 0) cursor.getString(nameCol) ?: "" else ""
                    val size = if (sizeCol >= 0) cursor.getLong(sizeCol) else 0L
                    val mod = if (modCol >= 0) cursor.getLong(modCol) * 1000L else System.currentTimeMillis()

                    if (path.isNotEmpty() && seenPaths.add(path)) {
                        val file = File(path)
                        if (file.exists() && file.length() > 0) {
                            val apkSize = if (size > 0) size else file.length()
                            val asset = parseApkFile(pm, id, path, name.ifEmpty { file.name }, apkSize, mod)
                            list.add(asset)
                        }
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        // 2. Fallback Direct Folder Scan in Download & External Storage
        val searchDirs = arrayOf(
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
            Environment.getExternalStorageDirectory(),
            File(Environment.getExternalStorageDirectory(), "Download"),
            File(Environment.getExternalStorageDirectory(), "Downloads")
        )

        for (dir in searchDirs) {
            if (dir != null && dir.exists() && dir.isDirectory) {
                scanDirForApks(dir, pm, seenPaths, list)
            }
        }

        return list.sortedByDescending { it.size }
    }

    private fun scanDirForApks(
        dir: File,
        pm: PackageManager,
        seenPaths: HashSet<String>,
        list: MutableList<ApkAsset>,
        depth: Int = 0
    ) {
        if (depth > 3) return
        try {
            val files = dir.listFiles() ?: return
            for (file in files) {
                if (file.isDirectory) {
                    if (!file.name.startsWith(".")) {
                        scanDirForApks(file, pm, seenPaths, list, depth + 1)
                    }
                } else if (file.isFile && file.name.endsWith(".apk", ignoreCase = true)) {
                    val path = file.absolutePath
                    if (seenPaths.add(path) && file.length() > 0) {
                        val asset = parseApkFile(pm, System.currentTimeMillis(), path, file.name, file.length(), file.lastModified())
                        list.add(asset)
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun parseApkFile(
        pm: PackageManager,
        id: Long,
        path: String,
        displayName: String,
        size: Long,
        dateModified: Long
    ): ApkAsset {
        var pkgName = ""
        var verName = ""
        var iconDrawable: android.graphics.drawable.Drawable? = null
        var appName = displayName

        try {
            val pkgInfo = pm.getPackageArchiveInfo(path, 0)
            if (pkgInfo != null) {
                pkgName = pkgInfo.packageName ?: ""
                verName = pkgInfo.versionName ?: ""

                pkgInfo.applicationInfo?.let { appInfo ->
                    appInfo.sourceDir = path
                    appInfo.publicSourceDir = path
                    try {
                        val label = pm.getApplicationLabel(appInfo).toString()
                        if (label.isNotEmpty()) appName = label
                        iconDrawable = pm.getApplicationIcon(appInfo)
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        var isInstalled = false
        if (pkgName.isNotEmpty()) {
            try {
                pm.getPackageInfo(pkgName, 0)
                isInstalled = true
            } catch (_: Exception) {
                isInstalled = false
            }
        }

        val uri = MediaStore.Files.getContentUri("external")

        return ApkAsset(
            id = id,
            uri = uri,
            path = path,
            displayName = appName,
            packageName = pkgName,
            versionName = verName,
            size = size,
            dateModified = dateModified,
            iconDrawable = iconDrawable,
            isInstalled = isInstalled
        )
    }

    private fun confirmAndDeleteApks(selected: List<ApkAsset>) {
        val count = selected.size
        val totalBytes = selected.sumOf { it.size }
        val sizeStr = FileUtils.formatBytes(totalBytes)

        MaterialAlertDialogBuilder(requireContext())
            .setTitle(R.string.apk_delete_confirm_title)
            .setMessage(getString(R.string.apk_delete_confirm_msg, count))
            .setPositiveButton(android.R.string.ok) { dialog: DialogInterface, _ ->
                dialog.dismiss()
                deleteApks(selected, sizeStr)
            }
            .setNegativeButton(android.R.string.cancel) { dialog: DialogInterface, _ ->
                dialog.dismiss()
            }
            .show()
    }

    private fun deleteApks(selected: List<ApkAsset>, freedSizeStr: String) {
        viewLifecycleOwner.lifecycleScope.launch {
            var deletedCount = 0
            withContext(Dispatchers.IO) {
                for (asset in selected) {
                    try {
                        val file = File(asset.path)
                        if (file.exists() && file.delete()) {
                            deletedCount++
                        } else {
                            try {
                                requireContext().contentResolver.delete(
                                    MediaStore.Files.getContentUri("external"),
                                    "${MediaStore.Files.FileColumns.DATA} = ?",
                                    arrayOf(asset.path)
                                )
                                deletedCount++
                            } catch (e: Exception) {
                                e.printStackTrace()
                            }
                        }
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }

            if (_binding == null) return@launch
            MediaStoreSyncManager.notifyManualMediaChange()
            loadApkFiles()

            Toast.makeText(
                requireContext(),
                getString(R.string.apk_deleted_success, freedSizeStr),
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance() = ApkCleanFragment()
    }
}
