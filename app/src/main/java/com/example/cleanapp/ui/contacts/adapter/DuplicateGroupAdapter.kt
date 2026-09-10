package com.example.cleanapp.ui.contacts.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cleanapp.R
import com.example.cleanapp.data.model.ContactDuplicateGroup
import com.example.cleanapp.databinding.ItemContactDuplicateGroupBinding
import com.example.cleanapp.databinding.ItemContactDuplicateSubItemBinding

class DuplicateGroupAdapter(
    private var groups: MutableList<ContactDuplicateGroup>,
    private val onPreviewClick: (ContactDuplicateGroup) -> Unit,
    private val onMergeClick: (ContactDuplicateGroup) -> Unit
) : RecyclerView.Adapter<DuplicateGroupAdapter.GroupViewHolder>() {

    fun updateData(newGroups: List<ContactDuplicateGroup>) {
        groups.clear()
        groups.addAll(newGroups)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val binding = ItemContactDuplicateGroupBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return GroupViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        holder.bind(groups[position])
    }

    override fun getItemCount(): Int = groups.size

    inner class GroupViewHolder(
        private val binding: ItemContactDuplicateGroupBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(group: ContactDuplicateGroup) {
            val context = binding.root.context
            binding.tvGroupKey.text = group.key
            binding.tvGroupCount.text = context.getString(R.string.contacts_duplicate_profiles_fmt, group.contacts.size)
            binding.tvGroupBadge.text = context.getString(R.string.contacts_count_badge_fmt, group.contacts.size)

            binding.containerSubItems.removeAllViews()
            val inflater = LayoutInflater.from(context)

            for (c in group.contacts) {
                val subBinding = ItemContactDuplicateSubItemBinding.inflate(
                    inflater, binding.containerSubItems, false
                )
                subBinding.tvSubInitial.text = c.initial
                subBinding.tvSubName.text = if (c.displayName.isNotBlank()) c.displayName else context.getString(R.string.contacts_no_name)
                
                val subtitle = when {
                    c.primaryPhone.isNotBlank() && c.company.isNotBlank() -> "${c.primaryPhone} • ${c.company}"
                    c.primaryPhone.isNotBlank() -> c.primaryPhone
                    c.primaryEmail.isNotBlank() -> c.primaryEmail
                    else -> context.getString(R.string.contacts_no_contact_info)
                }
                subBinding.tvSubPhone.text = subtitle
                binding.containerSubItems.addView(subBinding.root)
            }

            binding.btnPreview.setOnClickListener {
                onPreviewClick(group)
            }

            binding.btnMerge.setOnClickListener {
                onMergeClick(group)
            }
        }
    }
}
