package nixlab.phone.cleaner.freeup.storage.ui.similar.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import nixlab.phone.cleaner.freeup.storage.R
import nixlab.phone.cleaner.freeup.storage.data.model.MediaAsset
import nixlab.phone.cleaner.freeup.storage.databinding.ItemMediaGridBinding
import nixlab.phone.cleaner.freeup.storage.util.FileUtils

class MediaListAdapter(
    private var items: MutableList<MediaAsset>,
    private val onSelectionChanged: () -> Unit
) : RecyclerView.Adapter<MediaListAdapter.MediaViewHolder>() {

    fun updateData(newItems: List<MediaAsset>) {
        items = newItems.toMutableList()
        notifyDataSetChanged()
    }

    fun getSelectedAssets(): List<MediaAsset> = items.filter { it.isSelected }

    fun selectAll(select: Boolean) {
        items.forEach { it.isSelected = select }
        notifyDataSetChanged()
        onSelectionChanged()
    }

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

            val sizeStr = FileUtils.formatBytes(asset.size)
            binding.tvSize.text = if (asset.isVideo) {
                val mins = (asset.durationMs / 1000) / 60
                val secs = (asset.durationMs / 1000) % 60
                String.format("%02d:%02d • %s", mins, secs, sizeStr)
            } else {
                "${asset.resolutionText} • $sizeStr"
            }

            updateCheckState(asset)

            binding.cardMedia.setOnClickListener {
                asset.isSelected = !asset.isSelected
                updateCheckState(asset)
                onSelectionChanged()
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
