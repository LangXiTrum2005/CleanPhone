package com.example.cleanapp.ui.swipe

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
import com.example.cleanapp.databinding.ActivityTrashBinBinding
import com.example.cleanapp.ui.base.BaseActivity
import com.example.cleanapp.ui.similar.adapter.MediaListAdapter
import com.example.cleanapp.util.FileUtils
import com.example.cleanapp.util.SafeAreaUtils
import kotlinx.coroutines.launch

class TrashBinActivity : BaseActivity() {

    private lateinit var binding: ActivityTrashBinBinding
    private lateinit var repository: StorageScannerRepository
    private lateinit var adapter: MediaListAdapter

    private val deleteLauncher = registerForActivityResult(
        ActivityResultContracts.StartIntentSenderForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            trashList.clear()
            Toast.makeText(this, getString(R.string.success), Toast.LENGTH_SHORT).show()
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTrashBinBinding.inflate(layoutInflater)
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
            val sideMargin = SafeAreaUtils.dpToPx(this, 16)
            val lp = binding.btnClearTrash.layoutParams as? android.view.ViewGroup.MarginLayoutParams
            lp?.let {
                it.leftMargin = insets.left + sideMargin
                it.rightMargin = insets.right + sideMargin
                it.bottomMargin = insets.bottom + sideMargin
                binding.btnClearTrash.layoutParams = it
            }
            binding.rvTrash.setPadding(
                insets.left,
                0,
                insets.right,
                insets.bottom + SafeAreaUtils.dpToPx(this, 90)
            )
            windowInsets
        }

        repository = StorageScannerRepository(this)
        setupViews()
        loadData()
    }

    private fun setupViews() {
        binding.btnBack.setOnClickListener { finish() }

        adapter = MediaListAdapter(trashList) {
            // No-op or selection
        }
        binding.rvTrash.layoutManager = GridLayoutManager(this, 3)
        binding.rvTrash.adapter = adapter

        binding.btnRecoverAll.setOnClickListener {
            trashList.clear()
            Toast.makeText(this, getString(R.string.trash_restored_all), Toast.LENGTH_SHORT).show()
            finish()
        }

        binding.btnClearTrash.setOnClickListener {
            if (trashList.isNotEmpty()) {
                deleteTrashItems()
            }
        }
    }

    private fun loadData() {
        if (trashList.isEmpty()) {
            binding.emptyLayout.visibility = View.VISIBLE
            binding.rvTrash.visibility = View.GONE
            binding.btnClearTrash.visibility = View.GONE
            binding.tvStats.text = ""
        } else {
            binding.emptyLayout.visibility = View.GONE
            binding.rvTrash.visibility = View.VISIBLE
            binding.btnClearTrash.visibility = View.VISIBLE
            adapter.updateData(trashList)
            binding.tvStats.text = getString(R.string.trash_stats_fmt, trashList.size, FileUtils.formatBytes(trashList.sumOf { it.size }))
        }
    }

    private fun deleteTrashItems() {
        lifecycleScope.launch {
            val uris = trashList.map { it.uri }
            val intentSender = repository.createDeleteRequest(uris)?.intentSender
            if (intentSender != null) {
                val request = IntentSenderRequest.Builder(intentSender).build()
                deleteLauncher.launch(request)
            } else {
                trashList.clear()
                Toast.makeText(this@TrashBinActivity, getString(R.string.success), Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }

    companion object {
        val trashList = mutableListOf<MediaAsset>()

        fun start(context: Context) {
            val intent = Intent(context, TrashBinActivity::class.java)
            context.startActivity(intent)
        }
    }
}
