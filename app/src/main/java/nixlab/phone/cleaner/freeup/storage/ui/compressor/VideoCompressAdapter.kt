package nixlab.phone.cleaner.freeup.storage.ui.compressor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import nixlab.phone.cleaner.freeup.storage.R
import nixlab.phone.cleaner.freeup.storage.data.model.MediaAsset
import nixlab.phone.cleaner.freeup.storage.databinding.ItemVideoCompressBinding
import nixlab.phone.cleaner.freeup.storage.util.FileUtils

class VideoCompressAdapter(
    private var items: MutableList<MediaAsset>,
    private val onVideoSelected: (MediaAsset) -> Unit
) : RecyclerView.Adapter<VideoCompressAdapter.VideoViewHolder>() {

    private var selectedAssetId: Long? = null

    fun updateData(newItems: List<MediaAsset>) {
        items = newItems.toMutableList()
        if (selectedAssetId == null && items.isNotEmpty()) {
            selectedAssetId = items[0].id
            onVideoSelected(items[0])
        }
        notifyDataSetChanged()
    }

    fun setSelectedVideo(asset: MediaAsset) {
        selectedAssetId = asset.id
        notifyDataSetChanged()
        onVideoSelected(asset)
    }

    fun getSelectedVideo(): MediaAsset? {
        return items.firstOrNull { it.id == selectedAssetId } ?: items.firstOrNull()
    }

    fun removeVideo(assetId: Long) {
        val index = items.indexOfFirst { it.id == assetId }
        if (index >= 0) {
            items.removeAt(index)
            notifyItemRemoved(index)
            if (selectedAssetId == assetId) {
                selectedAssetId = items.firstOrNull()?.id
                selectedAssetId?.let { nextId ->
                    items.firstOrNull { it.id == nextId }?.let { onVideoSelected(it) }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val binding = ItemVideoCompressBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VideoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class VideoViewHolder(private val binding: ItemVideoCompressBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(asset: MediaAsset) {
            val isSelected = asset.id == selectedAssetId

            Glide.with(binding.ivThumbnail.context)
                .load(asset.uri)
                .transform(CenterCrop())
                .into(binding.ivThumbnail)

            // Duration format
            val totalSecs = (asset.durationMs / 1000).coerceAtLeast(0)
            val mins = totalSecs / 60
            val secs = totalSecs % 60
            binding.tvDuration.text = String.format("%02d:%02d", mins, secs)

            // Resolution
            binding.tvResolution.text = when {
                asset.height >= 2160 || asset.width >= 3840 -> "4K"
                asset.height >= 1080 || asset.width >= 1920 -> "1080p"
                asset.height >= 720 || asset.width >= 1280 -> "720p"
                asset.height > 0 -> "${asset.height}p"
                else -> ""
            }

            // Size
            binding.tvSize.text = FileUtils.formatBytes(asset.size)

            // Selection state styling
            if (isSelected) {
                binding.ivCheck.visibility = View.VISIBLE
                binding.cardVideo.strokeColor = binding.root.context.getColor(R.color.primary_glow)
                binding.cardVideo.strokeWidth = 5
                binding.cardVideo.setCardBackgroundColor(binding.root.context.getColor(R.color.bg_card_highlight))
            } else {
                binding.ivCheck.visibility = View.GONE
                binding.cardVideo.strokeColor = binding.root.context.getColor(R.color.border_subtle)
                binding.cardVideo.strokeWidth = 2
                binding.cardVideo.setCardBackgroundColor(binding.root.context.getColor(R.color.bg_card))
            }

            binding.cardVideo.setOnClickListener {
                selectedAssetId = asset.id
                notifyDataSetChanged()
                onVideoSelected(asset)
            }
        }
    }
}
