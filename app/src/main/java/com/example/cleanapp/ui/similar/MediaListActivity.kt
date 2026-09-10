package com.example.cleanapp.ui.similar

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cleanapp.R
import com.example.cleanapp.data.model.MediaAsset
import com.example.cleanapp.data.repository.StorageScannerRepository
import com.example.cleanapp.databinding.ActivityMediaListBinding
import com.example.cleanapp.ui.base.BaseActivity
import com.example.cleanapp.ui.similar.adapter.MediaListAdapter
import com.example.cleanapp.util.FileUtils
import com.example.cleanapp.util.SafeAreaUtils
import kotlinx.coroutines.launch

class MediaListActivity : BaseActivity() {

    private lateinit var binding: ActivityMediaListBinding
    private lateinit var repository: StorageScannerRepository
    private lateinit var adapter: MediaListAdapter
    private var isSelectAll = false

    private var pendingDeletedAssets: List<MediaAsset> = emptyList()

    private val deleteLauncher = registerForActivityResult(
        ActivityResultContracts.StartIntentSenderForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            handleDeletionSuccess(pendingDeletedAssets)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMediaListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, windowInsets ->
            val insets = windowInsets.getInsets(
                WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout()
            )
            binding.headerLayout.setPadding(
                insets.left + SafeAreaUtils.dpToPx(this, 16),
                insets.top + SafeAreaUtils.dpToPx(this, 8),
                insets.right + SafeAreaUtils.dpToPx(this, 16),
                SafeAreaUtils.dpToPx(this, 8)
            )
            binding.tvStatsInfo.setPadding(
                insets.left + SafeAreaUtils.dpToPx(this, 20),
                0,
                insets.right + SafeAreaUtils.dpToPx(this, 20),
                SafeAreaUtils.dpToPx(this, 8)
            )
            val sideMargin = SafeAreaUtils.dpToPx(this, 16)
            val lp = binding.bottomActionCard.layoutParams as? android.view.ViewGroup.MarginLayoutParams
            lp?.let {
                it.leftMargin = insets.left + sideMargin
                it.rightMargin = insets.right + sideMargin
                it.bottomMargin = insets.bottom + sideMargin
                binding.bottomActionCard.layoutParams = it
            }
            binding.rvMedia.setPadding(
                insets.left,
                0,
                insets.right,
                insets.bottom + SafeAreaUtils.dpToPx(this, 100)
            )
            binding.emptyLayout.setPadding(
                insets.left + SafeAreaUtils.dpToPx(this, 24),
                0,
                insets.right + SafeAreaUtils.dpToPx(this, 24),
                0
            )
            windowInsets
        }

        repository = StorageScannerRepository(this)
        setupViews()
        loadData()
    }

    private fun setupViews() {
        binding.btnBack.setOnClickListener { finish() }

        val title = intent.getStringExtra(EXTRA_TITLE) ?: getString(R.string.category_screenshots)
        binding.tvTitle.text = title

        adapter = MediaListAdapter(mutableListOf()) {
            updateBottomActionState()
        }
        binding.rvMedia.layoutManager = GridLayoutManager(this, 3)
        binding.rvMedia.adapter = adapter

        binding.btnSelectAll.setOnClickListener {
            isSelectAll = !isSelectAll
            binding.btnSelectAll.text = if (isSelectAll) getString(R.string.deselect_all) else getString(R.string.select_all)
            adapter.selectAll(isSelectAll)
            updateBottomActionState()
        }

        binding.btnDelete.setOnClickListener {
            val selected = adapter.getSelectedAssets()
            if (selected.isNotEmpty()) {
                deleteSelectedAssets(selected)
            }
        }
    }

    private fun loadData() {
        val items = currentMediaList
        if (items.isNullOrEmpty()) {
            binding.emptyLayout.visibility = View.VISIBLE
            binding.rvMedia.visibility = View.GONE
            binding.bottomActionCard.visibility = View.GONE
        } else {
            binding.emptyLayout.visibility = View.GONE
            binding.rvMedia.visibility = View.VISIBLE
            binding.bottomActionCard.visibility = View.VISIBLE
            adapter.updateData(items)
            binding.tvStatsInfo.text = getString(R.string.stat_files_size_fmt, items.size, FileUtils.formatBytes(items.sumOf { it.size }))
            updateBottomActionState()
        }
    }

    private fun updateBottomActionState() {
        val selected = adapter.getSelectedAssets()
        val count = selected.size
        val size = selected.sumOf { it.size }

        binding.tvSelectedCount.text = getString(R.string.stat_selected_count_fmt, count)
        binding.tvSelectedSize.text = getString(R.string.stat_save_prefix, FileUtils.formatBytes(size))
        binding.btnDelete.isEnabled = count > 0
        binding.btnDelete.alpha = if (count > 0) 1.0f else 0.5f
    }

    private fun deleteSelectedAssets(selected: List<MediaAsset>) {
        pendingDeletedAssets = selected
        lifecycleScope.launch {
            val uris = selected.map { it.uri }
            val intentSender = repository.createDeleteRequest(uris)?.intentSender
            if (intentSender != null) {
                val request = IntentSenderRequest.Builder(intentSender).build()
                deleteLauncher.launch(request)
            } else {
                handleDeletionSuccess(selected)
            }
        }
    }

    private fun handleDeletionSuccess(deleted: List<MediaAsset>) {
        val deletedIds = deleted.map { it.id }.toSet()
        val current = currentMediaList?.toMutableList() ?: mutableListOf()
        current.removeAll { it.id in deletedIds }
        currentMediaList = current

        if (current.isEmpty()) {
            binding.emptyLayout.visibility = View.VISIBLE
            binding.rvMedia.visibility = View.GONE
            binding.bottomActionCard.visibility = View.GONE
            binding.tvStatsInfo.text = "0 files • 0 B"
        } else {
            binding.emptyLayout.visibility = View.GONE
            binding.rvMedia.visibility = View.VISIBLE
            binding.bottomActionCard.visibility = View.VISIBLE
            adapter.updateData(current)
            binding.tvStatsInfo.text = "${current.size} files • " + FileUtils.formatBytes(current.sumOf { it.size })
        }
        isSelectAll = false
        binding.btnSelectAll.text = getString(R.string.select_all)
        updateBottomActionState()
        Toast.makeText(this, getString(R.string.success), Toast.LENGTH_SHORT).show()
    }

    companion object {
        private const val EXTRA_TITLE = "extra_title"
        var currentMediaList: List<MediaAsset>? = null

        fun start(context: Context, title: String, items: List<MediaAsset>) {
            currentMediaList = items.map { it.copy() }
            val intent = Intent(context, MediaListActivity::class.java).apply {
                putExtra(EXTRA_TITLE, title)
            }
            context.startActivity(intent)
        }
    }
}
