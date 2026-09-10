package com.example.cleanapp.ui.swipe

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.ContentUris
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.example.cleanapp.R
import com.example.cleanapp.data.model.MediaAsset
import com.example.cleanapp.databinding.FragmentPhotoSwipeBinding
import com.example.cleanapp.util.FileUtils
import com.example.cleanapp.util.PermissionUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class PhotoSwipeFragment : Fragment() {

    private var _binding: FragmentPhotoSwipeBinding? = null
    private val binding get() = _binding!!

    private val allPhotos = mutableListOf<MediaAsset>()
    private var currentIndex = 0
    private val history = mutableListOf<Pair<MediaAsset, Boolean>>() // Pair(asset, isKept)

    private val permissionLauncher = registerForActivityResult(
        androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        val granted = permissions.values.any { it } || (context != null && PermissionUtils.hasMediaPermissions(requireContext()))
        if (granted) {
            loadPhotos()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPhotoSwipeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupListeners()
        val ctx = context
        if (ctx != null && PermissionUtils.hasMediaPermissions(ctx)) {
            loadPhotos()
        } else {
            permissionLauncher.launch(PermissionUtils.getRequiredMediaPermissions())
        }

        viewLifecycleOwner.lifecycleScope.launch {
            com.example.cleanapp.util.MediaStoreSyncManager.mediaUpdateFlow.collect {
                val currentCtx = context
                if (currentCtx != null && PermissionUtils.hasMediaPermissions(currentCtx)) {
                    loadPhotos(isAutoSync = true)
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        updateTrashCount()
        val ctx = context
        if (ctx != null && PermissionUtils.hasMediaPermissions(ctx)) {
            loadPhotos(isAutoSync = true)
        }
    }

    private fun setupListeners() {
        binding.btnOpenTrash.setOnClickListener {
            TrashBinActivity.start(requireContext())
        }

        binding.btnUndo.setOnClickListener {
            undoLastSwipe()
        }

        binding.btnSwipeKeep.setOnClickListener {
            swipeTopCard(isKeep = true)
        }

        binding.btnSwipeDelete.setOnClickListener {
            swipeTopCard(isKeep = false)
        }
    }

    private fun updateTrashCount() {
        binding.btnOpenTrash.text = getString(R.string.swipe_trash_btn_fmt, TrashBinActivity.trashList.size)
    }

    private fun loadPhotos(isAutoSync: Boolean = false) {
        val appContext = context?.applicationContext ?: return
        if (!PermissionUtils.hasMediaPermissions(appContext)) {
            return
        }

        viewLifecycleOwner.lifecycleScope.launch {
            val list = withContext(Dispatchers.IO) {
                fetchPhotos(appContext)
            }
            if (_binding == null) return@launch

            if (isAutoSync && allPhotos.isNotEmpty()) {
                val oldIds = allPhotos.map { it.id }
                val newIds = list.map { it.id }
                if (oldIds == newIds) {
                    return@launch
                }
            }

            allPhotos.clear()
            allPhotos.addAll(list)
            if (!isAutoSync || currentIndex >= allPhotos.size) {
                currentIndex = 0
                history.clear()
            }
            renderCardStack()
        }
    }

    private fun fetchPhotos(ctx: android.content.Context): List<MediaAsset> {
        val list = mutableListOf<MediaAsset>()
        try {
            val projection = arrayOf(
                MediaStore.Images.Media._ID,
                MediaStore.Images.Media.DISPLAY_NAME,
                MediaStore.Images.Media.DATA,
                MediaStore.Images.Media.MIME_TYPE,
                MediaStore.Images.Media.SIZE,
                MediaStore.Images.Media.DATE_ADDED,
                MediaStore.Images.Media.DATE_TAKEN,
                MediaStore.Images.Media.WIDTH,
                MediaStore.Images.Media.HEIGHT
            )
            val sortOrder = "${MediaStore.Images.Media.DATE_ADDED} DESC"
            val query = ctx.contentResolver.query(
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                projection,
                null,
                null,
                sortOrder
            )
            query?.use { cursor ->
                val idCol = cursor.getColumnIndex(MediaStore.Images.Media._ID)
                val nameCol = cursor.getColumnIndex(MediaStore.Images.Media.DISPLAY_NAME)
                val dataCol = cursor.getColumnIndex(MediaStore.Images.Media.DATA)
                val mimeCol = cursor.getColumnIndex(MediaStore.Images.Media.MIME_TYPE)
                val sizeCol = cursor.getColumnIndex(MediaStore.Images.Media.SIZE)
                val addedCol = cursor.getColumnIndex(MediaStore.Images.Media.DATE_ADDED)
                val takenCol = cursor.getColumnIndex(MediaStore.Images.Media.DATE_TAKEN)
                val widthCol = cursor.getColumnIndex(MediaStore.Images.Media.WIDTH)
                val heightCol = cursor.getColumnIndex(MediaStore.Images.Media.HEIGHT)

                while (cursor.moveToNext()) {
                    val id = if (idCol >= 0) cursor.getLong(idCol) else continue
                    val name = if (nameCol >= 0) cursor.getString(nameCol) ?: "" else ""
                    val path = if (dataCol >= 0) cursor.getString(dataCol) ?: "" else ""
                    val mime = if (mimeCol >= 0) cursor.getString(mimeCol) ?: "image/jpeg" else "image/jpeg"
                    val size = if (sizeCol >= 0) cursor.getLong(sizeCol) else 0L
                    val added = if (addedCol >= 0) cursor.getLong(addedCol) * 1000L else System.currentTimeMillis()
                    val taken = if (takenCol >= 0) {
                        val t = cursor.getLong(takenCol)
                        if (t > 0) t else added
                    } else added
                    val width = if (widthCol >= 0) cursor.getInt(widthCol) else 0
                    val height = if (heightCol >= 0) cursor.getInt(heightCol) else 0

                    val uri = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, id)
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
                                height = height
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

    private fun renderCardStack() {
        binding.cardStackContainer.removeAllViews()

        if (currentIndex >= allPhotos.size) {
            binding.emptyStateLayout.visibility = View.VISIBLE
            binding.tvSwipeProgress.text = getString(R.string.swipe_completed)
            return
        }

        binding.emptyStateLayout.visibility = View.GONE
        binding.tvSwipeProgress.text = getString(R.string.swipe_progress_fmt, currentIndex + 1, allPhotos.size)

        // Show next card behind if available
        if (currentIndex + 1 < allPhotos.size) {
            val nextCard = createCardView(allPhotos[currentIndex + 1], isTop = false)
            binding.cardStackContainer.addView(nextCard)
        }

        // Show current top card
        val topCard = createCardView(allPhotos[currentIndex], isTop = true)
        binding.cardStackContainer.addView(topCard)
    }

    private fun createCardView(asset: MediaAsset, isTop: Boolean): View {
        val view = layoutInflater.inflate(R.layout.item_swipe_card, binding.cardStackContainer, false)
        val ivPhoto = view.findViewById<ImageView>(R.id.ivPhoto)
        val tvKeepBadge = view.findViewById<TextView>(R.id.tvKeepBadge)
        val tvDeleteBadge = view.findViewById<TextView>(R.id.tvDeleteBadge)
        val tvDate = view.findViewById<TextView>(R.id.tvDate)
        val tvDimensions = view.findViewById<TextView>(R.id.tvDimensions)

        Glide.with(this)
            .load(asset.uri)
            .centerCrop()
            .into(ivPhoto)

        tvDate.text = FileUtils.formatDate(asset.dateTaken)
        tvDimensions.text = "${asset.resolutionText} • ${FileUtils.formatBytes(asset.size)}"

        if (!isTop) {
            view.scaleX = 0.95f
            view.scaleY = 0.95f
            view.translationY = 24f
            return view
        }

        // Drag Gesture Setup
        var dX = 0f
        var startX = 0f

        view.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    startX = event.rawX
                    dX = v.x - event.rawX
                    true
                }
                MotionEvent.ACTION_MOVE -> {
                    val currentX = event.rawX + dX
                    v.x = currentX
                    val deltaX = event.rawX - startX
                    v.rotation = (deltaX / v.width) * 18f

                    val progress = (Math.abs(deltaX) / (v.width * 0.4f)).coerceIn(0f, 1f)
                    if (deltaX > 0) {
                        tvKeepBadge.alpha = progress
                        tvDeleteBadge.alpha = 0f
                    } else {
                        tvDeleteBadge.alpha = progress
                        tvKeepBadge.alpha = 0f
                    }
                    true
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    val deltaX = event.rawX - startX
                    val threshold = v.width * 0.3f
                    if (deltaX > threshold) {
                        dismissCard(v, isKeep = true)
                    } else if (deltaX < -threshold) {
                        dismissCard(v, isKeep = false)
                    } else {
                        // Reset to center
                        v.animate()
                            .x(0f)
                            .rotation(0f)
                            .setDuration(200)
                            .setInterpolator(AccelerateDecelerateInterpolator())
                            .start()
                        tvKeepBadge.animate().alpha(0f).setDuration(200).start()
                        tvDeleteBadge.animate().alpha(0f).setDuration(200).start()
                    }
                    true
                }
                else -> false
            }
        }

        return view
    }

    private fun dismissCard(view: View, isKeep: Boolean) {
        val targetX = if (isKeep) view.width * 1.5f else -view.width * 1.5f
        view.animate()
            .x(targetX)
            .rotation(if (isKeep) 25f else -25f)
            .alpha(0f)
            .setDuration(250)
            .setListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    processSwipe(isKeep)
                }
            })
            .start()
    }

    private fun swipeTopCard(isKeep: Boolean) {
        val childCount = binding.cardStackContainer.childCount
        if (childCount == 0 || currentIndex >= allPhotos.size) return
        val topView = binding.cardStackContainer.getChildAt(childCount - 1)
        dismissCard(topView, isKeep)
    }

    private fun processSwipe(isKeep: Boolean) {
        if (currentIndex < allPhotos.size) {
            val asset = allPhotos[currentIndex]
            history.add(Pair(asset, isKeep))
            if (!isKeep) {
                TrashBinActivity.trashList.add(asset)
                updateTrashCount()
            }
            currentIndex++
            renderCardStack()
        }
    }

    private fun undoLastSwipe() {
        if (history.isNotEmpty() && currentIndex > 0) {
            val (lastAsset, wasKept) = history.removeAt(history.size - 1)
            if (!wasKept) {
                TrashBinActivity.trashList.remove(lastAsset)
                updateTrashCount()
            }
            currentIndex--
            renderCardStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance() = PhotoSwipeFragment()
    }
}
