package nixlab.phone.cleaner.freeup.storage.ui.contacts

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nixlab.phone.cleaner.freeup.storage.R
import nixlab.phone.cleaner.freeup.storage.data.model.ContactItem
import nixlab.phone.cleaner.freeup.storage.databinding.BottomSheetContactDetailBinding
import nixlab.phone.cleaner.freeup.storage.databinding.ItemContactDetailEmailEntryBinding
import nixlab.phone.cleaner.freeup.storage.databinding.ItemContactDetailPhoneEntryBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ContactDetailBottomSheetDialog(
    private val contact: ContactItem,
    private val onDeleteContact: (ContactItem) -> Unit
) : BottomSheetDialogFragment() {

    private var _binding: BottomSheetContactDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BottomSheetContactDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 1. Avatar & Initial
        if (!contact.photoUri.isNullOrBlank()) {
            try {
                binding.ivDetailAvatar.setImageURI(Uri.parse(contact.photoUri))
                binding.tvDetailInitial.visibility = View.GONE
            } catch (e: Exception) {
                binding.ivDetailAvatar.setImageDrawable(null)
                binding.tvDetailInitial.visibility = View.VISIBLE
            }
        } else {
            binding.ivDetailAvatar.setImageDrawable(null)
            binding.tvDetailInitial.visibility = View.VISIBLE
        }
        binding.tvDetailInitial.text = contact.initial

        // 2. Name & Company
        binding.tvDetailName.text = if (contact.displayName.isNotBlank()) contact.displayName else getString(R.string.contacts_no_name)

        val companySubtitle = when {
            contact.company.isNotBlank() && contact.jobTitle.isNotBlank() -> "${contact.company} • ${contact.jobTitle}"
            contact.company.isNotBlank() -> contact.company
            contact.jobTitle.isNotBlank() -> contact.jobTitle
            else -> ""
        }
        if (companySubtitle.isNotBlank()) {
            binding.tvDetailCompany.text = companySubtitle
            binding.tvDetailCompany.visibility = View.VISIBLE
        } else {
            binding.tvDetailCompany.visibility = View.GONE
        }

        // 3. Quick Actions
        binding.btnQuickCall.setOnClickListener {
            if (contact.primaryPhone.isNotBlank()) {
                val dialIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${contact.primaryPhone}"))
                startActivity(dialIntent)
            }
        }

        binding.btnQuickMessage.setOnClickListener {
            if (contact.primaryPhone.isNotBlank()) {
                val smsIntent = Intent(Intent.ACTION_VIEW, Uri.parse("sms:${contact.primaryPhone}"))
                startActivity(smsIntent)
            }
        }

        binding.btnQuickShare.setOnClickListener {
            val shareText = buildString {
                append(contact.displayName)
                if (contact.phoneNumbers.isNotEmpty()) {
                    append("\nTel: ").append(contact.phoneNumbers.joinToString(", "))
                }
                if (contact.emails.isNotEmpty()) {
                    append("\nEmail: ").append(contact.emails.joinToString(", "))
                }
                if (contact.company.isNotBlank()) {
                    append("\nOrg: ").append(contact.company)
                }
            }
            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, shareText)
            }
            startActivity(Intent.createChooser(shareIntent, getString(R.string.contact_detail_share)))
        }

        binding.btnQuickDelete.setOnClickListener {
            dismiss()
            onDeleteContact(contact)
        }

        binding.btnCloseDetail.setOnClickListener {
            dismiss()
        }

        // 4. Phones Container
        val inflater = LayoutInflater.from(requireContext())
        binding.containerDetailPhones.removeAllViews()
        if (contact.phoneEntries.isNotEmpty()) {
            binding.tvPhonesHeader.visibility = View.VISIBLE
            binding.containerDetailPhones.visibility = View.VISIBLE
            for (p in contact.phoneEntries) {
                val pBinding = ItemContactDetailPhoneEntryBinding.inflate(inflater, binding.containerDetailPhones, false)
                pBinding.tvEntryNumber.text = p.number

                val labelStr = if (p.customLabel.isNotBlank()) {
                    p.customLabel
                } else {
                    when (p.type) {
                        ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE -> getString(R.string.contact_label_mobile)
                        ContactsContract.CommonDataKinds.Phone.TYPE_HOME -> getString(R.string.contact_label_home)
                        ContactsContract.CommonDataKinds.Phone.TYPE_WORK -> getString(R.string.contact_label_work)
                        ContactsContract.CommonDataKinds.Phone.TYPE_MAIN -> getString(R.string.contact_label_main)
                        else -> getString(R.string.contact_label_other)
                    }
                }
                pBinding.tvEntryLabel.text = labelStr

                pBinding.btnEntryCall.setOnClickListener {
                    startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:${p.number}")))
                }
                pBinding.btnEntrySms.setOnClickListener {
                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("sms:${p.number}")))
                }
                binding.containerDetailPhones.addView(pBinding.root)
            }
        } else {
            binding.tvPhonesHeader.visibility = View.GONE
            binding.containerDetailPhones.visibility = View.GONE
        }

        // 5. Emails Container
        binding.containerDetailEmails.removeAllViews()
        if (contact.emailEntries.isNotEmpty()) {
            binding.tvEmailsHeader.visibility = View.VISIBLE
            binding.containerDetailEmails.visibility = View.VISIBLE
            for (e in contact.emailEntries) {
                val eBinding = ItemContactDetailEmailEntryBinding.inflate(inflater, binding.containerDetailEmails, false)
                eBinding.tvEmailAddress.text = e.address

                val labelStr = if (e.customLabel.isNotBlank()) {
                    e.customLabel
                } else {
                    when (e.type) {
                        ContactsContract.CommonDataKinds.Email.TYPE_HOME -> getString(R.string.contact_label_home)
                        ContactsContract.CommonDataKinds.Email.TYPE_WORK -> getString(R.string.contact_label_work)
                        else -> getString(R.string.contact_label_other)
                    }
                }
                eBinding.tvEmailLabel.text = labelStr

                eBinding.btnSendEmail.setOnClickListener {
                    startActivity(Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:${e.address}")))
                }
                binding.containerDetailEmails.addView(eBinding.root)
            }
        } else {
            binding.tvEmailsHeader.visibility = View.GONE
            binding.containerDetailEmails.visibility = View.GONE
        }

        // 6. Notes
        if (contact.note.isNotBlank()) {
            binding.tvNotesHeader.visibility = View.VISIBLE
            binding.cardNotes.visibility = View.VISIBLE
            binding.tvDetailNote.text = contact.note
        } else {
            binding.tvNotesHeader.visibility = View.GONE
            binding.cardNotes.visibility = View.GONE
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "ContactDetailBottomSheetDialog"
    }
}
