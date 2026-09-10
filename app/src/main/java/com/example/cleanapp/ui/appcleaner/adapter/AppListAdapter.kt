package com.example.cleanapp.ui.appcleaner.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cleanapp.R
import com.example.cleanapp.data.model.AppItem
import com.example.cleanapp.databinding.ItemAppInfoBinding
import com.example.cleanapp.util.FileUtils

class AppListAdapter(
    private var items: MutableList<AppItem>,
    private val onSelectionChanged: () -> Unit
) : RecyclerView.Adapter<AppListAdapter.AppViewHolder>() {

    fun updateData(newItems: List<AppItem>) {
        val selectedPackageNames = items.filter { it.isSelected }.map { it.packageName }.toSet()
        items = newItems.toMutableList()
        items.forEach {
            if (it.packageName in selectedPackageNames) {
                it.isSelected = true
            }
        }
        notifyDataSetChanged()
        onSelectionChanged()
    }

    fun clearSelection() {
        items.forEach { it.isSelected = false }
        notifyDataSetChanged()
        onSelectionChanged()
    }

    fun getSelectedApps(): List<AppItem> = items.filter { it.isSelected }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val binding = ItemAppInfoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AppViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class AppViewHolder(private val binding: ItemAppInfoBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: AppItem) {
            val context = binding.root.context
            binding.tvAppName.text = item.appName
            if (item.icon != null) {
                binding.ivAppIcon.setImageDrawable(item.icon)
            } else {
                binding.ivAppIcon.setImageResource(R.mipmap.ic_launcher)
            }

            val sizeStr = FileUtils.formatBytes(item.sizeBytes)
            val usageStr = if (item.lastUsedTimestamp > 0) {
                context.getString(R.string.app_last_used_fmt, FileUtils.formatDate(item.lastUsedTimestamp))
            } else {
                context.getString(R.string.app_rarely_used)
            }
            binding.tvAppDetails.text = "$sizeStr • $usageStr"

            updateCheckState(item)

            binding.root.setOnClickListener {
                item.isSelected = !item.isSelected
                updateCheckState(item)
                onSelectionChanged()
            }
        }

        private fun updateCheckState(item: AppItem) {
            val context = binding.root.context
            binding.ivCheck.visibility = if (item.isSelected) View.VISIBLE else View.GONE
            if (item.isSelected) {
                binding.cardApp.strokeColor = androidx.core.content.ContextCompat.getColor(context, R.color.primary_glow)
                binding.cardApp.strokeWidth = 3
            } else {
                binding.cardApp.strokeColor = androidx.core.content.ContextCompat.getColor(context, R.color.border_subtle)
                binding.cardApp.strokeWidth = 1
            }
        }
    }
}
