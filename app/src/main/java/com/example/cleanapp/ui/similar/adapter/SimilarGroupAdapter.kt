package com.example.cleanapp.ui.similar.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cleanapp.R
import com.example.cleanapp.data.model.MediaAsset
import com.example.cleanapp.data.model.SimilarGroup
import com.example.cleanapp.databinding.ItemMediaGridBinding
import com.example.cleanapp.databinding.ItemSimilarGroupBinding
import com.example.cleanapp.util.FileUtils

class SimilarGroupAdapter(
    private var groups: MutableList<SimilarGroup>,
    private val onSelectionChanged: () -> Unit
) : RecyclerView.Adapter<SimilarGroupAdapter.GroupViewHolder>() {

    fun updateData(newGroups: List<SimilarGroup>) {
        groups = newGroups.toMutableList()
        notifyDataSetChanged()
    }

    fun getSelectedAssets(): List<MediaAsset> {
        val list = mutableListOf<MediaAsset>()
        groups.forEach { group ->
            group.allAssets.forEach { asset ->
                if (asset.isSelected) {
                    list.add(asset)
                }
            }
        }
        return list
    }

    fun selectAll(select: Boolean) {
        groups.forEach { group ->
            group.allAssets.forEach { asset ->
                asset.isSelected = select
            }
        }
        notifyDataSetChanged()
        onSelectionChanged()
    }

    fun keepBestOnly() {
        groups.forEach { group ->
            group.bestAsset.isSelected = false
            group.duplicateAssets.forEach { it.isSelected = true }
        }
        notifyDataSetChanged()
        onSelectionChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val binding = ItemSimilarGroupBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GroupViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        holder.bind(groups[position])
    }

    override fun getItemCount(): Int = groups.size

    inner class GroupViewHolder(private val binding: ItemSimilarGroupBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(group: SimilarGroup) {
            binding.tvGroupTitle.text = group.title
            binding.tvGroupSize.text = FileUtils.formatBytes(group.totalGroupSize)

            val mediaAdapter = MediaItemAdapter(group.allAssets) {
                onSelectionChanged()
            }
            binding.rvGroupItems.layoutManager = GridLayoutManager(binding.root.context, 2)
            binding.rvGroupItems.adapter = mediaAdapter

            binding.btnKeepBest.setOnClickListener {
                group.bestAsset.isSelected = false
                group.duplicateAssets.forEach { it.isSelected = true }
                mediaAdapter.notifyDataSetChanged()
                onSelectionChanged()
            }
        }
    }

    inner class MediaItemAdapter(
        private val items: List<MediaAsset>,
        private val onItemClick: () -> Unit
    ) : RecyclerView.Adapter<MediaItemAdapter.MediaViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MediaViewHolder {
            val binding = ItemMediaGridBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return MediaViewHolder(binding)
        }

        override fun onBindViewHolder(holder: MediaViewHolder, position: Int) {
            holder.bind(items[position])
        }

        override fun getItemCount(): Int = items.size

        inner class MediaViewHolder(private val binding: ItemMediaGridBinding) : RecyclerView.ViewHolder(binding.root) {
            fun bind(asset: MediaAsset) {
                Glide.with(binding.ivThumbnail.context)
                    .load(asset.uri)
                    .centerCrop()
                    .into(binding.ivThumbnail)

                binding.tvSize.text = "${asset.resolutionText} • ${FileUtils.formatBytes(asset.size)}"

                if (asset.isBestResult) {
                    binding.tvBestBadge.visibility = View.VISIBLE
                } else {
                    binding.tvBestBadge.visibility = View.GONE
                }

                updateCheckState(asset)

                binding.cardMedia.setOnClickListener {
                    asset.isSelected = !asset.isSelected
                    updateCheckState(asset)
                    onItemClick()
                }
            }

            private fun updateCheckState(asset: MediaAsset) {
                if (asset.isSelected) {
                    binding.ivCheck.visibility = View.VISIBLE
                    binding.cardMedia.strokeColor = binding.root.context.getColor(R.color.primary_glow)
                    binding.cardMedia.strokeWidth = 4
                } else {
                    binding.ivCheck.visibility = View.GONE
                    binding.cardMedia.strokeColor = binding.root.context.getColor(R.color.border_subtle)
                    binding.cardMedia.strokeWidth = 2
                }
            }
        }
    }
}
