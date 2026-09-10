package nixlab.phone.cleaner.freeup.storage.ui.contacts.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import nixlab.phone.cleaner.freeup.storage.data.model.ContactBackupItem
import nixlab.phone.cleaner.freeup.storage.databinding.ItemContactBackupBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class ContactBackupAdapter(
    private var items: MutableList<ContactBackupItem>,
    private val onRestoreClick: (ContactBackupItem) -> Unit,
    private val onShareClick: (ContactBackupItem) -> Unit,
    private val onDeleteClick: (ContactBackupItem) -> Unit
) : RecyclerView.Adapter<ContactBackupAdapter.BackupViewHolder>() {

    private val dateFormat = SimpleDateFormat("MMM dd, yyyy • HH:mm", Locale.getDefault())

    fun updateData(newItems: List<ContactBackupItem>) {
        items = newItems.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BackupViewHolder {
        val binding = ItemContactBackupBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return BackupViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BackupViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class BackupViewHolder(
        private val binding: ItemContactBackupBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ContactBackupItem) {
            binding.tvBackupFileName.text = item.fileName
            val dateStr = dateFormat.format(Date(item.createdTimestamp))
            binding.tvBackupMeta.text = "$dateStr • ${item.sizeFormatted}"
            binding.tvBackupCountBadge.text = binding.root.context.getString(nixlab.phone.cleaner.freeup.storage.R.string.contacts_count_badge_fmt, item.contactCount)

            binding.btnRestore.setOnClickListener { onRestoreClick(item) }
            binding.btnShare.setOnClickListener { onShareClick(item) }
            binding.btnDelete.setOnClickListener { onDeleteClick(item) }
        }
    }
}
