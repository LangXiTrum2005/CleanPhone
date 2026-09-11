package nixlab.phone.cleaner.freeup.storage.ui.compressor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import nixlab.phone.cleaner.freeup.storage.R
import nixlab.phone.cleaner.freeup.storage.data.model.ApkAsset
import nixlab.phone.cleaner.freeup.storage.databinding.ItemApkFileBinding
import nixlab.phone.cleaner.freeup.storage.util.FileUtils

class ApkCleanAdapter(
    private var items: MutableList<ApkAsset>,
    private val onSelectionChanged: () -> Unit
) : RecyclerView.Adapter<ApkCleanAdapter.ApkViewHolder>() {

    fun updateData(newItems: List<ApkAsset>) {
        items = newItems.toMutableList()
        notifyDataSetChanged()
        onSelectionChanged()
    }

    fun selectAll(select: Boolean) {
        items.forEach { it.isSelected = select }
        notifyDataSetChanged()
        onSelectionChanged()
    }

    fun getSelectedItems(): List<ApkAsset> {
        return items.filter { it.isSelected }
    }

    fun getItems(): List<ApkAsset> {
        return items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApkViewHolder {
        val binding = ItemApkFileBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ApkViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ApkViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class ApkViewHolder(private val binding: ItemApkFileBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(asset: ApkAsset) {
            binding.tvAppName.text = asset.displayName
            val verText = if (asset.versionName.isNotEmpty()) "v${asset.versionName}" else ""
            val pkgText = if (asset.packageName.isNotEmpty()) "${asset.packageName} $verText".trim() else asset.path
            binding.tvPackageName.text = pkgText
            binding.tvApkSize.text = FileUtils.formatBytes(asset.size)

            if (asset.iconDrawable != null) {
                binding.ivApkIcon.setImageDrawable(asset.iconDrawable)
            } else {
                binding.ivApkIcon.setImageResource(R.drawable.ic_nav_apk)
            }

            if (asset.isInstalled) {
                binding.tvInstalledBadge.visibility = View.VISIBLE
                binding.tvInstalledBadge.setText(R.string.apk_installed)
            } else {
                binding.tvInstalledBadge.visibility = View.VISIBLE
                binding.tvInstalledBadge.setText(R.string.apk_not_installed)
            }

            binding.cbSelect.isChecked = asset.isSelected

            if (asset.isSelected) {
                binding.cardApkItem.strokeColor = binding.root.context.getColor(R.color.primary_glow)
                binding.cardApkItem.strokeWidth = 3
                binding.cardApkItem.setCardBackgroundColor(binding.root.context.getColor(R.color.bg_card_highlight))
            } else {
                binding.cardApkItem.strokeColor = binding.root.context.getColor(R.color.border_subtle)
                binding.cardApkItem.strokeWidth = 1
                binding.cardApkItem.setCardBackgroundColor(binding.root.context.getColor(R.color.bg_card))
            }

            binding.cardApkItem.setOnClickListener {
                asset.isSelected = !asset.isSelected
                val pos = bindingAdapterPosition
                if (pos != RecyclerView.NO_POSITION) {
                    notifyItemChanged(pos)
                }
                onSelectionChanged()
            }
        }
    }
}
