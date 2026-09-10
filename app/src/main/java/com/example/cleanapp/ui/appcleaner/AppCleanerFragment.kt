package com.example.cleanapp.ui.appcleaner

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cleanapp.R
import com.example.cleanapp.data.model.AppItem
import com.example.cleanapp.data.repository.AppManagerRepository
import com.example.cleanapp.databinding.FragmentAppCleanerBinding
import com.example.cleanapp.ui.appcleaner.adapter.AppListAdapter
import com.example.cleanapp.util.FileUtils
import com.example.cleanapp.util.PermissionUtils
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.coroutines.launch

class AppCleanerFragment : Fragment() {

    private var _binding: FragmentAppCleanerBinding? = null
    private val binding get() = _binding!!

    private lateinit var repository: AppManagerRepository
    private lateinit var adapter: AppListAdapter
    private var allApps = listOf<AppItem>()

    private val pendingUninstallQueue = mutableListOf<AppItem>()
    private var trackedUninstallPackages = mutableSetOf<String>()
    private var isUninstalling = false

    private val uninstallLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        processNextUninstallOrFinish()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAppCleanerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        repository = AppManagerRepository(requireContext())
        setupViews()
        checkPermissionAndLoad()
    }

    override fun onResume() {
        super.onResume()
        checkPermissionAndLoad()
        checkAndReloadAfterUninstall()
    }

    private fun setupViews() {
        // Permission Guide Screen Click Listeners
        com.example.cleanapp.util.TouchAnimationUtils.attachTouchAnimation(binding.btnGoToSettings) {
            openUsageAccessSettings()
        }

        binding.cardStep1.setOnClickListener {
            openUsageAccessSettings()
        }

        binding.cardStep2.setOnClickListener {
            openUsageAccessSettings()
        }

        com.example.cleanapp.util.TouchAnimationUtils.attachTouchAnimation(binding.btnHowToGrant) {
            showHowToGrantDialog()
        }

        // App List Screen Setup
        adapter = AppListAdapter(mutableListOf()) {
            updateBottomActionState()
        }
        binding.rvApps.layoutManager = LinearLayoutManager(requireContext())
        binding.rvApps.adapter = adapter

        binding.chipGroupSort.setOnCheckedStateChangeListener { _, _ ->
            applyCurrentSorting()
        }

        com.example.cleanapp.util.TouchAnimationUtils.attachTouchAnimation(binding.btnRetry) {
            loadApps()
        }

        com.example.cleanapp.util.TouchAnimationUtils.attachTouchAnimation(binding.btnUninstall) {
            val selected = adapter.getSelectedApps()
            if (selected.isNotEmpty()) {
                pendingUninstallQueue.clear()
                pendingUninstallQueue.addAll(selected)
                trackedUninstallPackages.clear()
                trackedUninstallPackages.addAll(selected.map { it.packageName })
                isUninstalling = true
                processNextUninstallOrFinish()
            }
        }
    }

    private fun checkPermissionAndLoad() {
        val ctx = context ?: return
        val hasPermission = PermissionUtils.hasUsageStatsPermission(ctx)
        if (hasPermission) {
            binding.viewPermissionGuide.visibility = View.GONE
            binding.layoutAppsContent.visibility = View.VISIBLE
            loadApps()
        } else {
            binding.viewPermissionGuide.visibility = View.VISIBLE
            binding.layoutAppsContent.visibility = View.GONE
            binding.bottomActionCard.visibility = View.GONE
        }
    }

    private fun showHowToGrantDialog() {
        val ctx = context ?: return
        MaterialAlertDialogBuilder(ctx)
            .setTitle(R.string.app_cleaner_how_dialog_title)
            .setMessage(R.string.app_cleaner_how_dialog_msg)
            .setPositiveButton(R.string.app_cleaner_btn_go_to_settings) { _, _ ->
                openUsageAccessSettings()
            }
            .setNegativeButton(R.string.btn_close, null)
            .show()
    }

    private fun openUsageAccessSettings() {
        val ctx = context ?: return
        val packageUri = Uri.parse("package:${ctx.packageName}")
        val intents = listOf(
            Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS, packageUri),
            Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS),
            Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, packageUri),
            Intent(Settings.ACTION_SETTINGS)
        )
        for (intent in intents) {
            try {
                startActivity(intent)
                return
            } catch (_: Exception) {
            }
        }
        if (isAdded) {
            Toast.makeText(requireContext(), R.string.error_open_settings, Toast.LENGTH_SHORT).show()
        }
    }

    private fun processNextUninstallOrFinish() {
        if (pendingUninstallQueue.isNotEmpty()) {
            val nextApp = pendingUninstallQueue.removeAt(0)
            try {
                val intent = Intent(Intent.ACTION_DELETE).apply {
                    data = Uri.parse("package:${nextApp.packageName}")
                }
                uninstallLauncher.launch(intent)
            } catch (e: Exception) {
                try {
                    @Suppress("DEPRECATION")
                    val fallbackIntent = Intent(Intent.ACTION_UNINSTALL_PACKAGE).apply {
                        data = Uri.parse("package:${nextApp.packageName}")
                    }
                    uninstallLauncher.launch(fallbackIntent)
                } catch (e2: Exception) {
                    processNextUninstallOrFinish()
                }
            }
        } else {
            // Finished processing all uninstall requests
            isUninstalling = false
            onUninstallFlowCompleted()
        }
    }

    private fun onUninstallFlowCompleted() {
        adapter.clearSelection()
        updateBottomActionState()
        loadApps()
        if (isAdded) {
            Toast.makeText(requireContext(), R.string.uninstall_success, Toast.LENGTH_SHORT).show()
        }
    }

    private fun checkAndReloadAfterUninstall() {
        if (trackedUninstallPackages.isNotEmpty()) {
            viewLifecycleOwner.lifecycleScope.launch {
                val currentInstalled = repository.getInstalledUserApps()
                if (!isAdded || _binding == null) return@launch
                val currentPackageNames = currentInstalled.map { it.packageName }.toSet()
                val uninstalledAny = trackedUninstallPackages.any { it !in currentPackageNames }
                if (uninstalledAny) {
                    trackedUninstallPackages.clear()
                    isUninstalling = false
                    adapter.clearSelection()
                    updateBottomActionState()
                    if (isAdded) {
                        Toast.makeText(requireContext(), R.string.uninstall_success, Toast.LENGTH_SHORT).show()
                    }
                }
                allApps = currentInstalled
                applyCurrentSorting()
                updateSummaryDisplay()
            }
        }
    }

    private fun applyCurrentSorting() {
        if (_binding == null || !isAdded) return
        val sorted = when {
            binding.chipLargestSize.isChecked -> allApps.sortedByDescending { it.sizeBytes }
            binding.chipLeastUsed.isChecked -> allApps.sortedWith(
                compareBy<AppItem> { if (it.lastUsedTimestamp <= 0) 0 else 1 }
                    .thenBy { it.lastUsedTimestamp }
            )
            binding.chipMostUsed.isChecked -> allApps.sortedWith(
                compareByDescending<AppItem> { it.totalTimeInForegroundMs }
                    .thenByDescending { it.lastUsedTimestamp }
            )
            else -> allApps
        }
        adapter.updateData(sorted)
        updateBottomActionState()
    }

    private fun loadApps() {
        if (_binding == null || !isAdded) return
        binding.progressBar.visibility = View.VISIBLE
        viewLifecycleOwner.lifecycleScope.launch {
            allApps = repository.getInstalledUserApps()
            if (!isAdded || _binding == null) return@launch
            binding.progressBar.visibility = View.GONE

            if (allApps.isEmpty()) {
                binding.layoutEmptyState.visibility = View.VISIBLE
                binding.rvApps.visibility = View.GONE
            } else {
                binding.layoutEmptyState.visibility = View.GONE
                binding.rvApps.visibility = View.VISIBLE
                applyCurrentSorting()
                updateSummaryDisplay()
            }
        }
    }

    private fun updateSummaryDisplay() {
        if (_binding == null || !isAdded) return
        val totalSize = allApps.sumOf { it.sizeBytes }
        binding.tvAppSubtitle.text = getString(
            R.string.app_cleaner_stats_summary_fmt,
            allApps.size,
            FileUtils.formatBytes(totalSize)
        )
    }

    private fun updateBottomActionState() {
        if (_binding == null || !isAdded) return
        val selected = adapter.getSelectedApps()
        if (selected.isNotEmpty()) {
            binding.bottomActionCard.visibility = View.VISIBLE
            val totalSize = selected.sumOf { it.sizeBytes }
            val count = selected.size
            binding.tvSelectedAppInfo.text = getString(R.string.apps_selected_fmt, count, FileUtils.formatBytes(totalSize))
        } else {
            binding.bottomActionCard.visibility = View.GONE
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance() = AppCleanerFragment()
    }
}
