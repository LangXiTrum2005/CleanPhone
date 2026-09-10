package nixlab.phone.cleaner.freeup.storage.ui.contacts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nixlab.phone.cleaner.freeup.storage.data.model.ContactDuplicateGroup
import nixlab.phone.cleaner.freeup.storage.databinding.BottomSheetMergePreviewBinding
import nixlab.phone.cleaner.freeup.storage.databinding.ItemContactDuplicateSubItemBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MergePreviewBottomSheetDialog(
    private val group: ContactDuplicateGroup,
    private val onMergeConfirmed: (ContactDuplicateGroup) -> Unit
) : BottomSheetDialogFragment() {

    private var _binding: BottomSheetMergePreviewBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BottomSheetMergePreviewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvOriginalHeader.text = getString(nixlab.phone.cleaner.freeup.storage.R.string.merge_preview_current_duplicates_fmt, group.contacts.size)

        // Populate original duplicate contacts
        binding.containerOriginalContacts.removeAllViews()
        val inflater = LayoutInflater.from(requireContext())
        for (c in group.contacts) {
            val subBinding = ItemContactDuplicateSubItemBinding.inflate(
                inflater, binding.containerOriginalContacts, false
            )
            subBinding.tvSubInitial.text = c.initial
            subBinding.tvSubName.text = if (c.displayName.isNotBlank()) c.displayName else getString(nixlab.phone.cleaner.freeup.storage.R.string.contacts_no_name)
            subBinding.tvSubPhone.text = if (c.primaryPhone.isNotBlank()) {
                c.phoneNumbers.joinToString(", ")
            } else if (c.emails.isNotEmpty()) {
                c.emails.joinToString(", ")
            } else {
                getString(nixlab.phone.cleaner.freeup.storage.R.string.contacts_no_contact_info)
            }
            binding.containerOriginalContacts.addView(subBinding.root)
        }

        // Populate merged result preview
        val merged = group.previewMergedContact
        binding.tvResultInitial.text = merged.initial
        binding.tvResultName.text = if (merged.displayName.isNotBlank()) merged.displayName else getString(nixlab.phone.cleaner.freeup.storage.R.string.merge_preview_unified_contact)

        val phones = merged.phoneNumbers
        if (phones.isNotEmpty()) {
            binding.tvResultPhones.text = getString(nixlab.phone.cleaner.freeup.storage.R.string.merge_preview_phones_fmt, phones.joinToString(", "))
            binding.tvResultPhones.visibility = View.VISIBLE
        } else {
            binding.tvResultPhones.visibility = View.GONE
        }

        val emails = merged.emails
        if (emails.isNotEmpty()) {
            binding.tvResultEmails.text = getString(nixlab.phone.cleaner.freeup.storage.R.string.merge_preview_emails_fmt, emails.joinToString(", "))
            binding.tvResultEmails.visibility = View.VISIBLE
        } else {
            binding.tvResultEmails.visibility = View.GONE
        }

        binding.btnCancelMerge.setOnClickListener {
            dismiss()
        }

        binding.btnConfirmMerge.setOnClickListener {
            dismiss()
            onMergeConfirmed(group)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "MergePreviewBottomSheetDialog"
    }
}
