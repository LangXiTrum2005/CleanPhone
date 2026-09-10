package nixlab.phone.cleaner.freeup.storage.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import nixlab.phone.cleaner.freeup.storage.R
import nixlab.phone.cleaner.freeup.storage.data.model.ScanResult
import nixlab.phone.cleaner.freeup.storage.databinding.FragmentDashboardBinding
import nixlab.phone.cleaner.freeup.storage.ui.paywall.PaywallActivity
import nixlab.phone.cleaner.freeup.storage.ui.similar.MediaListActivity
import nixlab.phone.cleaner.freeup.storage.ui.similar.SimilarMediaActivity
import nixlab.phone.cleaner.freeup.storage.util.FileUtils
import nixlab.phone.cleaner.freeup.storage.util.PermissionUtils
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    private val viewModel: DashboardViewModel by viewModels()
    private var scanResult: ScanResult? = null

    enum class PendingCategory {
        SCAN_ALL,
        SIMILAR,
        DUPLICATES,
        SCREENSHOTS,
        LARGE_VIDEOS
    }

    private var pendingCategory: PendingCategory? = null

    private val permissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        val granted = permissions.values.any { it } || (context != null && PermissionUtils.hasMediaPermissions(requireContext()))
        if (granted) {
            val pending = pendingCategory ?: PendingCategory.SCAN_ALL
            executeCategoryAction(pending)
        } else {
            pendingCategory = null
            context?.let {
                Toast.makeText(it, getString(R.string.permission_required), Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupListeners()
        observeViewModel()
        animateDashboardEntrance()

        val ctx = context
        if (ctx != null && PermissionUtils.hasMediaPermissions(ctx) && scanResult == null) {
            viewModel.startScan()
        }
    }

    private fun animateDashboardEntrance() {
        val cards = listOf(
            binding.gaugeCard,
            binding.btnScan,
            binding.cardSimilarPhotos,
            binding.cardDuplicates,
            binding.cardScreenshots,
            binding.cardLargeVideos
        )

        cards.forEachIndexed { index, card ->
            card.alpha = 0f
            card.translationY = 40f
            card.animate()
                .alpha(1.0f)
                .translationY(0f)
                .setDuration(500L)
                .setStartDelay(index * 70L)
                .setInterpolator(android.view.animation.DecelerateInterpolator())
                .start()
        }
    }

    private fun setupListeners() {
        nixlab.phone.cleaner.freeup.storage.util.TouchAnimationUtils.attachTouchAnimation(binding.btnScan) {
            handleCategoryClick(PendingCategory.SCAN_ALL)
        }

        nixlab.phone.cleaner.freeup.storage.util.TouchAnimationUtils.attachTouchAnimation(binding.gaugeCard) {
            handleCategoryClick(PendingCategory.SCAN_ALL)
        }

        nixlab.phone.cleaner.freeup.storage.util.TouchAnimationUtils.attachTouchAnimation(binding.btnSettings) {
            nixlab.phone.cleaner.freeup.storage.ui.settings.SettingsActivity.start(requireContext())
        }

        nixlab.phone.cleaner.freeup.storage.util.TouchAnimationUtils.attachTouchAnimation(binding.cardSimilarPhotos) {
            handleCategoryClick(PendingCategory.SIMILAR)
        }

        nixlab.phone.cleaner.freeup.storage.util.TouchAnimationUtils.attachTouchAnimation(binding.cardDuplicates) {
            handleCategoryClick(PendingCategory.DUPLICATES)
        }

        nixlab.phone.cleaner.freeup.storage.util.TouchAnimationUtils.attachTouchAnimation(binding.cardScreenshots) {
            handleCategoryClick(PendingCategory.SCREENSHOTS)
        }

        nixlab.phone.cleaner.freeup.storage.util.TouchAnimationUtils.attachTouchAnimation(binding.cardLargeVideos) {
            handleCategoryClick(PendingCategory.LARGE_VIDEOS)
        }
    }

    private fun handleCategoryClick(category: PendingCategory) {
        val ctx = context ?: return
        if (PermissionUtils.hasMediaPermissions(ctx)) {
            executeCategoryAction(category)
        } else {
            pendingCategory = category
            showPermissionConfirmationDialog()
        }
    }

    private fun showPermissionConfirmationDialog() {
        val ctx = context ?: return
        com.google.android.material.dialog.MaterialAlertDialogBuilder(ctx)
            .setTitle(getString(R.string.permission_media_confirm_title))
            .setMessage(getString(R.string.permission_media_confirm_msg))
            .setIcon(R.drawable.ic_image)
            .setPositiveButton(getString(R.string.btn_allow_and_continue)) { _, _ ->
                permissionLauncher.launch(PermissionUtils.getRequiredMediaPermissions())
            }
            .setNegativeButton(getString(R.string.btn_not_now)) { _, _ ->
                pendingCategory = null
            }
            .show()
    }

    private fun executeCategoryAction(category: PendingCategory) {
        val result = scanResult
        if (result != null) {
            navigateToCategory(category, result)
        } else {
            pendingCategory = category
            viewModel.startScan()
        }
    }

    private fun navigateToCategory(category: PendingCategory, result: ScanResult) {
        val ctx = context ?: return
        when (category) {
            PendingCategory.SIMILAR -> {
                if (result.similarGroups.isNotEmpty()) {
                    SimilarMediaActivity.start(
                        ctx,
                        getString(R.string.category_similar_photos),
                        result.similarGroups
                    )
                } else {
                    Toast.makeText(ctx, getString(R.string.no_items_found), Toast.LENGTH_SHORT).show()
                }
            }
            PendingCategory.DUPLICATES -> {
                if (result.duplicateGroups.isNotEmpty()) {
                    SimilarMediaActivity.start(
                        ctx,
                        getString(R.string.category_duplicates),
                        result.duplicateGroups
                    )
                } else {
                    Toast.makeText(ctx, getString(R.string.no_items_found), Toast.LENGTH_SHORT).show()
                }
            }
            PendingCategory.SCREENSHOTS -> {
                if (result.screenshots.isNotEmpty()) {
                    MediaListActivity.start(
                        ctx,
                        getString(R.string.category_screenshots),
                        result.screenshots
                    )
                } else {
                    Toast.makeText(ctx, getString(R.string.no_items_found), Toast.LENGTH_SHORT).show()
                }
            }
            PendingCategory.LARGE_VIDEOS -> {
                if (result.largeVideos.isNotEmpty()) {
                    MediaListActivity.start(
                        ctx,
                        getString(R.string.category_large_videos),
                        result.largeVideos
                    )
                } else {
                    Toast.makeText(ctx, getString(R.string.no_items_found), Toast.LENGTH_SHORT).show()
                }
            }
            PendingCategory.SCAN_ALL -> {
                if (result.similarGroups.isNotEmpty()) {
                    SimilarMediaActivity.start(
                        ctx,
                        getString(R.string.category_similar_photos),
                        result.similarGroups
                    )
                } else if (result.duplicateGroups.isNotEmpty()) {
                    SimilarMediaActivity.start(
                        ctx,
                        getString(R.string.category_duplicates),
                        result.duplicateGroups
                    )
                } else if (result.screenshots.isNotEmpty()) {
                    MediaListActivity.start(
                        ctx,
                        getString(R.string.category_screenshots),
                        result.screenshots
                    )
                } else if (result.largeVideos.isNotEmpty()) {
                    MediaListActivity.start(
                        ctx,
                        getString(R.string.category_large_videos),
                        result.largeVideos
                    )
                } else {
                    Toast.makeText(ctx, getString(R.string.no_items_found), Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun observeViewModel() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.storageStats.collectLatest { stats ->
                binding.storageGauge.setProgress(stats.usedPercentage)
                binding.tvUsedPercent.text = "${stats.usedPercentage}%"
                binding.tvStorageInfo.text = getString(
                    R.string.storage_used_fmt,
                    FileUtils.formatGbOnly(stats.usedBytes),
                    FileUtils.formatGbOnly(stats.totalBytes)
                )
                binding.tvFreeStorage.text = getString(
                    R.string.storage_free_fmt,
                    FileUtils.formatGbOnly(stats.freeBytes)
                )
            }
        }

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.uiState.collectLatest { state ->
                when (state) {
                    is DashboardViewModel.UiState.Idle -> {
                        binding.scanningCard.visibility = View.GONE
                        binding.btnScan.visibility = View.VISIBLE
                    }
                    is DashboardViewModel.UiState.Scanning -> {
                        binding.scanningCard.visibility = View.VISIBLE
                        binding.btnScan.visibility = View.GONE
                        binding.tvScanProgressMsg.text = state.message
                        binding.scanProgressBar.progress = state.progress
                    }
                    is DashboardViewModel.UiState.Success -> {
                        binding.scanningCard.visibility = View.GONE
                        binding.btnScan.visibility = View.VISIBLE
                        scanResult = state.result
                        updateScanResultView(state.result)
                        val pending = pendingCategory
                        if (pending != null) {
                            pendingCategory = null
                            navigateToCategory(pending, state.result)
                        }
                    }
                    is DashboardViewModel.UiState.Error -> {
                        binding.scanningCard.visibility = View.GONE
                        binding.btnScan.visibility = View.VISIBLE
                        pendingCategory = null
                        context?.let { ctx ->
                            Toast.makeText(ctx, state.message, Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
    }

    private fun updateScanResultView(result: ScanResult) {
        val similarCount = result.similarGroups.sumOf { it.allAssets.size }
        val similarSize = result.similarGroups.sumOf { it.reclaimableSize }
        binding.tvSimilarPhotosCount.text = getString(R.string.stat_photos_save_fmt, similarCount, FileUtils.formatBytes(similarSize))

        val dupCount = result.duplicateGroups.sumOf { it.allAssets.size }
        val dupSize = result.duplicateGroups.sumOf { it.reclaimableSize }
        binding.tvDuplicatesCount.text = getString(R.string.stat_files_save_fmt, dupCount, FileUtils.formatBytes(dupSize))

        val screenshotSize = result.screenshots.sumOf { it.size }
        binding.tvScreenshotsCount.text = getString(R.string.stat_files_save_fmt, result.screenshots.size, FileUtils.formatBytes(screenshotSize))

        val videoSize = result.largeVideos.sumOf { it.size }
        binding.tvLargeVideosCount.text = getString(R.string.stat_files_size_fmt, result.largeVideos.size, FileUtils.formatBytes(videoSize))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance() = DashboardFragment()
    }
}
