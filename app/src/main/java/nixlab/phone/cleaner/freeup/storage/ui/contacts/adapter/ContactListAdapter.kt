package nixlab.phone.cleaner.freeup.storage.ui.contacts.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import nixlab.phone.cleaner.freeup.storage.R
import nixlab.phone.cleaner.freeup.storage.data.model.ContactItem
import nixlab.phone.cleaner.freeup.storage.data.model.ContactMissingType
import nixlab.phone.cleaner.freeup.storage.databinding.ItemContactEntryBinding

class ContactListAdapter(
    private var items: MutableList<ContactItem>,
    private val isSelectionEnabled: Boolean = true,
    private val onItemClick: ((ContactItem) -> Unit)? = null,
    private val onSelectionChanged: ((List<ContactItem>) -> Unit)? = null
) : RecyclerView.Adapter<ContactListAdapter.ContactViewHolder>() {

    fun updateData(newItems: List<ContactItem>) {
        items = newItems.toMutableList()
        notifyDataSetChanged()
    }

    fun selectAll(select: Boolean) {
        items.forEach { it.isSelected = select }
        notifyDataSetChanged()
        onSelectionChanged?.invoke(getSelected())
    }

    fun getSelected(): List<ContactItem> = items.filter { it.isSelected }

    fun getItems(): List<ContactItem> = items

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ItemContactEntryBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class ContactViewHolder(
        private val binding: ItemContactEntryBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ContactItem) {
            val context = binding.root.context

            // 1. Display Name
            if (item.displayName.isNotBlank() && !item.displayName.equals("No name", ignoreCase = true)) {
                binding.tvDisplayName.text = item.displayName
                binding.tvAvatarInitial.text = item.initial
            } else {
                binding.tvDisplayName.text = context.getString(R.string.contacts_no_name)
                binding.tvAvatarInitial.text = "?"
            }

            // 2. Photo or Initial
            if (!item.photoUri.isNullOrBlank()) {
                try {
                    binding.ivAvatar.setImageURI(Uri.parse(item.photoUri))
                    binding.tvAvatarInitial.visibility = View.GONE
                } catch (e: Exception) {
                    binding.ivAvatar.setImageDrawable(null)
                    binding.tvAvatarInitial.visibility = View.VISIBLE
                }
            } else {
                binding.ivAvatar.setImageDrawable(null)
                binding.tvAvatarInitial.visibility = View.VISIBLE
            }

            // 3. Subtitle / Phone & Company
            if (item.primaryPhone.isNotBlank()) {
                val phoneText = if (item.company.isNotBlank()) "${item.primaryPhone} • ${item.company}" else item.primaryPhone
                binding.tvPhone.text = phoneText
                binding.tvPhone.visibility = View.VISIBLE
            } else if (item.primaryEmail.isNotBlank()) {
                binding.tvPhone.text = item.primaryEmail
                binding.tvPhone.visibility = View.VISIBLE
            } else {
                binding.tvPhone.text = context.getString(R.string.contacts_no_phone)
                binding.tvPhone.visibility = View.VISIBLE
            }

            // 4. Missing Badge
            when (item.missingType) {
                ContactMissingType.NO_NAME -> {
                    binding.tvMissingBadge.text = context.getString(R.string.contacts_no_name)
                    binding.tvMissingBadge.visibility = View.VISIBLE
                }
                ContactMissingType.NO_PHONE -> {
                    binding.tvMissingBadge.text = context.getString(R.string.contacts_no_phone)
                    binding.tvMissingBadge.visibility = View.VISIBLE
                }
                ContactMissingType.NO_PHONE_AND_EMAIL -> {
                    binding.tvMissingBadge.text = context.getString(R.string.contacts_no_contact_info)
                    binding.tvMissingBadge.visibility = View.VISIBLE
                }
                ContactMissingType.NONE -> {
                    binding.tvMissingBadge.visibility = View.GONE
                }
            }

            // 5. Selection and Click
            if (isSelectionEnabled) {
                binding.cbSelect.visibility = View.VISIBLE
                binding.cbSelect.isChecked = item.isSelected
                binding.cbSelect.setOnCheckedChangeListener(null)
                binding.cbSelect.setOnCheckedChangeListener { _, isChecked ->
                    item.isSelected = isChecked
                    onSelectionChanged?.invoke(getSelected())
                }

                binding.cardContact.setOnClickListener {
                    if (onItemClick != null) {
                        onItemClick.invoke(item)
                    } else {
                        item.isSelected = !item.isSelected
                        binding.cbSelect.isChecked = item.isSelected
                        onSelectionChanged?.invoke(getSelected())
                    }
                }
            } else {
                binding.cbSelect.visibility = View.GONE
                binding.cardContact.setOnClickListener {
                    onItemClick?.invoke(item)
                }
            }
        }
    }
}
