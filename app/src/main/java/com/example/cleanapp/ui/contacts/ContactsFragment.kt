package com.example.cleanapp.ui.contacts

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cleanapp.R
import com.example.cleanapp.data.model.ContactBackupItem
import com.example.cleanapp.data.model.ContactDuplicateGroup
import com.example.cleanapp.data.model.ContactItem
import com.example.cleanapp.data.model.ContactMissingType
import com.example.cleanapp.data.repository.ContactsRepository
import com.example.cleanapp.databinding.FragmentContactsBinding
import com.example.cleanapp.ui.contacts.adapter.ContactBackupAdapter
import com.example.cleanapp.ui.contacts.adapter.ContactListAdapter
import com.example.cleanapp.ui.contacts.adapter.DuplicateGroupAdapter
import com.example.cleanapp.util.PermissionUtils
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.coroutines.launch

class ContactsFragment : Fragment() {

    enum class ContactTab {
        DUPLICATES,
        INCOMPLETE,
        ALL,
        BACKUPS
    }

    private var _binding: FragmentContactsBinding? = null
    private val binding get() = _binding!!

    private lateinit var repository: ContactsRepository

    private lateinit var duplicateAdapter: DuplicateGroupAdapter
    private lateinit var incompleteAdapter: ContactListAdapter
    private lateinit var allContactsAdapter: ContactListAdapter
    private lateinit var backupAdapter: ContactBackupAdapter

    private var allContactsList = listOf<ContactItem>()
    private var filteredAllContactsList = listOf<ContactItem>()
    private var duplicateGroupsList = listOf<ContactDuplicateGroup>()
    private var incompleteContactsList = listOf<ContactItem>()
    private var filteredIncompleteList = listOf<ContactItem>()
    private var backupsList = listOf<ContactBackupItem>()

    private var currentTab: ContactTab = ContactTab.DUPLICATES
    private var currentIncompleteFilter: ContactMissingType? = null // null means ALL

    private val permissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        val granted = permissions.values.any { it } || (context != null && PermissionUtils.hasContactsPermissions(requireContext()))
        updatePermissionUi(granted)
        if (granted) {
            loadContactsData()
        } else {
            context?.let {
                Toast.makeText(it, getString(R.string.contacts_need_access_subtitle), Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentContactsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        repository = ContactsRepository(requireContext())
        setupViews()
        setupTabs()

        val hasPermission = PermissionUtils.hasContactsPermissions(requireContext())
        updatePermissionUi(hasPermission)

        if (hasPermission) {
            loadContactsData()
        } else {
            permissionLauncher.launch(PermissionUtils.getRequiredContactsPermissions())
        }

        viewLifecycleOwner.lifecycleScope.launch {
            com.example.cleanapp.util.MediaStoreSyncManager.contactsUpdateFlow.collect {
                val currentCtx = context
                if (currentCtx != null && PermissionUtils.hasContactsPermissions(currentCtx)) {
                    loadContactsData()
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        val currentCtx = context
        if (currentCtx != null && PermissionUtils.hasContactsPermissions(currentCtx)) {
            loadContactsData()
        }
    }

    private fun updatePermissionUi(hasPermission: Boolean) {
        if (hasPermission) {
            binding.viewPermissionMissing.visibility = View.GONE
            binding.layoutCategoryCards.visibility = View.VISIBLE
            binding.btnQuickBackup.visibility = View.VISIBLE
        } else {
            binding.viewPermissionMissing.visibility = View.VISIBLE
            binding.layoutCategoryCards.visibility = View.GONE
            binding.btnQuickBackup.visibility = View.GONE
            binding.viewDuplicates.visibility = View.GONE
            binding.viewIncomplete.visibility = View.GONE
            binding.viewAll.visibility = View.GONE
            binding.viewBackups.visibility = View.GONE
            binding.tvContactsSummary.text = getString(R.string.contacts_need_access_title)
        }
    }

    private fun setupViews() {
        // Permission Request Button
        binding.btnGrantPermission.setOnClickListener {
            if (shouldShowRequestPermissionRationale(android.Manifest.permission.READ_CONTACTS)) {
                permissionLauncher.launch(PermissionUtils.getRequiredContactsPermissions())
            } else {
                try {
                    val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                        data = Uri.fromParts("package", requireContext().packageName, null)
                    }
                    startActivity(intent)
                } catch (e: Exception) {
                    permissionLauncher.launch(PermissionUtils.getRequiredContactsPermissions())
                }
            }
        }

        // 1. Duplicates Recycler View
        duplicateAdapter = DuplicateGroupAdapter(
            groups = mutableListOf(),
            onPreviewClick = { group ->
                showMergePreview(group)
            },
            onMergeClick = { group ->
                promptMergeWithBackupOption(group)
            }
        )
        binding.rvDuplicates.layoutManager = LinearLayoutManager(requireContext())
        binding.rvDuplicates.adapter = duplicateAdapter

        // 2. Incomplete Contacts Recycler View
        incompleteAdapter = ContactListAdapter(
            items = mutableListOf(),
            isSelectionEnabled = true,
            onItemClick = { contact ->
                showContactDetail(contact)
            },
            onSelectionChanged = { selected ->
                val count = selected.size
                binding.tvIncompleteSelectedCount.text = getString(R.string.contacts_selected_count_fmt, count)
                binding.btnDeleteIncomplete.isEnabled = count > 0
                binding.btnDeleteIncomplete.text = if (count > 0) getString(R.string.contacts_delete_with_count_fmt, count) else getString(R.string.btn_delete)
                binding.cbSelectAllIncomplete.isChecked = count > 0 && count == incompleteAdapter.itemCount
            }
        )
        binding.rvIncomplete.layoutManager = LinearLayoutManager(requireContext())
        binding.rvIncomplete.adapter = incompleteAdapter

        // Incomplete Chips Filter
        binding.chipFilterAll.setOnClickListener { applyIncompleteFilter(null) }
        binding.chipFilterNoName.setOnClickListener { applyIncompleteFilter(ContactMissingType.NO_NAME) }
        binding.chipFilterNoPhone.setOnClickListener { applyIncompleteFilter(ContactMissingType.NO_PHONE) }
        binding.chipFilterNoInfo.setOnClickListener { applyIncompleteFilter(ContactMissingType.NO_PHONE_AND_EMAIL) }

        // 3. All Contacts Recycler View
        allContactsAdapter = ContactListAdapter(
            items = mutableListOf(),
            isSelectionEnabled = true,
            onItemClick = { contact ->
                showContactDetail(contact)
            },
            onSelectionChanged = { selected ->
                val count = selected.size
                binding.tvAllSelectedCount.text = getString(R.string.contacts_selected_count_fmt, count)
                binding.btnDeleteSelectedAll.visibility = if (count > 0) View.VISIBLE else View.GONE
                binding.btnDeleteSelectedAll.text = getString(R.string.contacts_delete_with_count_fmt, count)
                binding.cbSelectAllContacts.isChecked = count > 0 && count == allContactsAdapter.itemCount
            }
        )
        binding.rvAllContacts.layoutManager = LinearLayoutManager(requireContext())
        binding.rvAllContacts.adapter = allContactsAdapter

        // 4. Backups Recycler View
        backupAdapter = ContactBackupAdapter(
            items = mutableListOf(),
            onRestoreClick = { backupItem ->
                promptRestoreBackup(backupItem)
            },
            onShareClick = { backupItem ->
                val shareIntent = repository.getShareIntent(backupItem)
                startActivity(Intent.createChooser(shareIntent, getString(R.string.contacts_share_title)))
            },
            onDeleteClick = { backupItem ->
                promptDeleteBackup(backupItem)
            }
        )
        binding.rvBackups.layoutManager = LinearLayoutManager(requireContext())
        binding.rvBackups.adapter = backupAdapter

        // Quick Backup top bar button
        binding.btnQuickBackup.setOnClickListener {
            createNewBackup()
        }

        // Tab Create Backup button
        binding.btnCreateBackupTab.setOnClickListener {
            createNewBackup()
        }

        // Merge All Button
        binding.btnMergeAll.setOnClickListener {
            if (duplicateGroupsList.isEmpty()) return@setOnClickListener
            promptMergeAllWithBackupOption()
        }

        // Incomplete Select All
        binding.cbSelectAllIncomplete.setOnClickListener {
            val isChecked = binding.cbSelectAllIncomplete.isChecked
            incompleteAdapter.selectAll(isChecked)
        }

        // Incomplete Delete Selected
        binding.btnDeleteIncomplete.setOnClickListener {
            val selected = incompleteAdapter.getSelected()
            if (selected.isEmpty()) return@setOnClickListener
            promptDeleteContacts(selected)
        }

        // All Contacts Search
        binding.etSearchContact.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val query = s?.toString()?.trim() ?: ""
                binding.btnClearSearch.visibility = if (query.isNotEmpty()) View.VISIBLE else View.GONE
                filterAllContacts(query)
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        binding.btnClearSearch.setOnClickListener {
            binding.etSearchContact.setText("")
        }

        // All Contacts Select All
        binding.cbSelectAllContacts.setOnClickListener {
            val isChecked = binding.cbSelectAllContacts.isChecked
            allContactsAdapter.selectAll(isChecked)
        }

        // All Contacts Delete Selected
        binding.btnDeleteSelectedAll.setOnClickListener {
            val selected = allContactsAdapter.getSelected()
            if (selected.isEmpty()) return@setOnClickListener
            promptDeleteContacts(selected)
        }
    }

    private fun setupTabs() {
        binding.tabDuplicates.setOnClickListener { selectTab(ContactTab.DUPLICATES) }
        binding.tabIncomplete.setOnClickListener { selectTab(ContactTab.INCOMPLETE) }
        binding.tabAll.setOnClickListener { selectTab(ContactTab.ALL) }
        binding.tabBackups.setOnClickListener { selectTab(ContactTab.BACKUPS) }
        updateTabStyles()
    }

    private fun selectTab(tab: ContactTab) {
        currentTab = tab
        updateTabStyles()

        binding.viewDuplicates.visibility = if (tab == ContactTab.DUPLICATES) View.VISIBLE else View.GONE
        binding.viewIncomplete.visibility = if (tab == ContactTab.INCOMPLETE) View.VISIBLE else View.GONE
        binding.viewAll.visibility = if (tab == ContactTab.ALL) View.VISIBLE else View.GONE
        binding.viewBackups.visibility = if (tab == ContactTab.BACKUPS) View.VISIBLE else View.GONE
    }

    private fun updateTabStyles() {
        val selectedStroke = ContextCompat.getColor(requireContext(), R.color.accent_cyan)
        val defaultStroke = ContextCompat.getColor(requireContext(), R.color.border_subtle)
        val selectedBg = ContextCompat.getColor(requireContext(), R.color.bg_surface)
        val defaultBg = ContextCompat.getColor(requireContext(), R.color.bg_card)

        binding.tabDuplicates.strokeColor = if (currentTab == ContactTab.DUPLICATES) selectedStroke else defaultStroke
        binding.tabDuplicates.strokeWidth = if (currentTab == ContactTab.DUPLICATES) 4 else 2
        binding.tabDuplicates.setCardBackgroundColor(if (currentTab == ContactTab.DUPLICATES) selectedBg else defaultBg)

        binding.tabIncomplete.strokeColor = if (currentTab == ContactTab.INCOMPLETE) selectedStroke else defaultStroke
        binding.tabIncomplete.strokeWidth = if (currentTab == ContactTab.INCOMPLETE) 4 else 2
        binding.tabIncomplete.setCardBackgroundColor(if (currentTab == ContactTab.INCOMPLETE) selectedBg else defaultBg)

        binding.tabAll.strokeColor = if (currentTab == ContactTab.ALL) selectedStroke else defaultStroke
        binding.tabAll.strokeWidth = if (currentTab == ContactTab.ALL) 4 else 2
        binding.tabAll.setCardBackgroundColor(if (currentTab == ContactTab.ALL) selectedBg else defaultBg)

        binding.tabBackups.strokeColor = if (currentTab == ContactTab.BACKUPS) selectedStroke else defaultStroke
        binding.tabBackups.strokeWidth = if (currentTab == ContactTab.BACKUPS) 4 else 2
        binding.tabBackups.setCardBackgroundColor(if (currentTab == ContactTab.BACKUPS) selectedBg else defaultBg)
    }

    private fun loadContactsData() {
        if (!PermissionUtils.hasContactsPermissions(requireContext())) return

        binding.progressBar.visibility = View.VISIBLE
        viewLifecycleOwner.lifecycleScope.launch {
            try {
                allContactsList = repository.getAllContacts()
                duplicateGroupsList = repository.getDuplicateGroups()
                incompleteContactsList = repository.getIncompleteContacts()
                backupsList = repository.getBackups()

                // Header and Tab Counts
                binding.tvContactsSummary.text = getString(R.string.contacts_found_summary_fmt, allContactsList.size)
                binding.tvTabDuplicateCount.text = getString(R.string.contacts_duplicate_groups_fmt, duplicateGroupsList.size)
                binding.tvTabIncompleteCount.text = getString(R.string.contacts_incomplete_count_fmt, incompleteContactsList.size)
                binding.tvTabAllCount.text = getString(R.string.contacts_count_badge_fmt, allContactsList.size)
                binding.tvTabBackupsCount.text = getString(R.string.contacts_backups_saved_fmt, backupsList.size)

                // 1. Update Duplicates View
                duplicateAdapter.updateData(duplicateGroupsList)
                binding.tvDuplicateSectionTitle.text = getString(R.string.contacts_duplicate_section_title_fmt, duplicateGroupsList.size, duplicateGroupsList.sumOf { it.contacts.size })
                binding.btnMergeAll.text = getString(R.string.btn_merge_all, duplicateGroupsList.size)
                binding.headerMergeAllLayout.visibility = if (duplicateGroupsList.isNotEmpty()) View.VISIBLE else View.GONE
                binding.emptyDuplicatesView.visibility = if (duplicateGroupsList.isEmpty()) View.VISIBLE else View.GONE

                // 2. Update Incomplete View & Chips
                val noNameCount = incompleteContactsList.count { it.missingType == ContactMissingType.NO_NAME }
                val noPhoneCount = incompleteContactsList.count { it.missingType == ContactMissingType.NO_PHONE }
                val noInfoCount = incompleteContactsList.count { it.missingType == ContactMissingType.NO_PHONE_AND_EMAIL }

                binding.chipFilterAll.text = getString(R.string.contacts_filter_all, incompleteContactsList.size)
                binding.chipFilterNoName.text = getString(R.string.contacts_filter_no_name, noNameCount)
                binding.chipFilterNoPhone.text = getString(R.string.contacts_filter_no_phone, noPhoneCount)
                binding.chipFilterNoInfo.text = getString(R.string.contacts_filter_no_info, noInfoCount)

                applyIncompleteFilter(currentIncompleteFilter)

                // 3. Update All Contacts View
                val query = binding.etSearchContact.text?.toString()?.trim() ?: ""
                filterAllContacts(query)

                // 4. Update Backups View
                backupAdapter.updateData(backupsList)
                binding.emptyBackupsView.visibility = if (backupsList.isEmpty()) View.VISIBLE else View.GONE

            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                binding.progressBar.visibility = View.GONE
            }
        }
    }

    private fun applyIncompleteFilter(type: ContactMissingType?) {
        currentIncompleteFilter = type
        filteredIncompleteList = if (type == null) {
            incompleteContactsList
        } else {
            incompleteContactsList.filter { it.missingType == type }
        }

        incompleteAdapter.updateData(filteredIncompleteList)
        binding.emptyIncompleteView.visibility = if (filteredIncompleteList.isEmpty()) View.VISIBLE else View.GONE
        binding.cbSelectAllIncomplete.isChecked = false
        binding.tvIncompleteSelectedCount.text = getString(R.string.contacts_selected_count_fmt, 0)
        binding.btnDeleteIncomplete.isEnabled = false
    }

    private fun filterAllContacts(query: String) {
        filteredAllContactsList = if (query.isBlank()) {
            allContactsList
        } else {
            allContactsList.filter {
                it.displayName.contains(query, ignoreCase = true) ||
                it.phoneNumbers.any { p -> p.contains(query, ignoreCase = true) } ||
                it.emails.any { e -> e.contains(query, ignoreCase = true) } ||
                it.company.contains(query, ignoreCase = true)
            }
        }

        allContactsAdapter.updateData(filteredAllContactsList)
        val isEmpty = filteredAllContactsList.isEmpty()
        binding.emptyAllView.visibility = if (isEmpty) View.VISIBLE else View.GONE
        if (isEmpty) {
            if (query.isNotBlank()) {
                binding.ivEmptyAllIllustration.setImageResource(R.drawable.img_contacts_no_search)
                binding.tvEmptyAllTitle.text = getString(R.string.contacts_no_search_result_title)
            } else {
                binding.ivEmptyAllIllustration.setImageResource(R.drawable.img_empty_all_contacts)
                binding.tvEmptyAllTitle.text = getString(R.string.all_contacts_empty_state_title)
            }
        }
    }

    private fun showContactDetail(contact: ContactItem) {
        val dialog = ContactDetailBottomSheetDialog(contact) { contactToDelete ->
            promptDeleteContacts(listOf(contactToDelete))
        }
        dialog.show(parentFragmentManager, ContactDetailBottomSheetDialog.TAG)
    }

    private fun showMergePreview(group: ContactDuplicateGroup) {
        val dialog = MergePreviewBottomSheetDialog(group) { confirmedGroup ->
            promptMergeWithBackupOption(confirmedGroup)
        }
        dialog.show(parentFragmentManager, MergePreviewBottomSheetDialog.TAG)
    }

    private fun promptMergeWithBackupOption(group: ContactDuplicateGroup) {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(getString(R.string.contacts_backup_popup_title))
            .setMessage(getString(R.string.contacts_backup_popup_subtitle))
            .setPositiveButton(getString(R.string.contacts_backup_popup_primary_action_text)) { _, _ ->
                viewLifecycleOwner.lifecycleScope.launch {
                    repository.createBackup()
                    performMerge(listOf(group))
                }
            }
            .setNegativeButton(getString(R.string.contacts_backup_popup_secondary_action_text)) { _, _ ->
                performMerge(listOf(group))
            }
            .setNeutralButton(getString(R.string.btn_cancel), null)
            .show()
    }

    private fun promptMergeAllWithBackupOption() {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(getString(R.string.contacts_merge_popup_title))
            .setMessage(getString(R.string.contacts_merge_all_confirm_msg, duplicateGroupsList.size))
            .setPositiveButton(getString(R.string.contacts_backup_popup_primary_action_text)) { _, _ ->
                viewLifecycleOwner.lifecycleScope.launch {
                    repository.createBackup()
                    performMerge(duplicateGroupsList)
                }
            }
            .setNegativeButton(getString(R.string.contacts_merge_without_backup)) { _, _ ->
                performMerge(duplicateGroupsList)
            }
            .setNeutralButton(getString(R.string.btn_cancel), null)
            .show()
    }

    private fun performMerge(groups: List<ContactDuplicateGroup>) {
        viewLifecycleOwner.lifecycleScope.launch {
            binding.progressBar.visibility = View.VISIBLE
            var successCount = 0
            for (g in groups) {
                if (repository.mergeContacts(g)) {
                    successCount++
                }
            }
            binding.progressBar.visibility = View.GONE
            Toast.makeText(requireContext(), getString(R.string.contacts_merge_success_fmt, successCount), Toast.LENGTH_SHORT).show()
            loadContactsData()
        }
    }

    private fun promptDeleteContacts(contacts: List<ContactItem>) {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(getString(R.string.delete_contacts_popup_title))
            .setMessage(getString(R.string.contacts_delete_confirm_msg, contacts.size))
            .setPositiveButton(getString(R.string.btn_delete)) { _, _ ->
                viewLifecycleOwner.lifecycleScope.launch {
                    binding.progressBar.visibility = View.VISIBLE
                    val ok = repository.deleteContacts(contacts)
                    binding.progressBar.visibility = View.GONE
                    if (ok) {
                        Toast.makeText(requireContext(), getString(R.string.deletion_success_popup_title), Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(requireContext(), getString(R.string.contacts_delete_error), Toast.LENGTH_SHORT).show()
                    }
                    loadContactsData()
                }
            }
            .setNegativeButton(getString(R.string.btn_cancel), null)
            .show()
    }

    private fun createNewBackup() {
        viewLifecycleOwner.lifecycleScope.launch {
            binding.progressBar.visibility = View.VISIBLE
            val backup = repository.createBackup()
            binding.progressBar.visibility = View.GONE
            if (backup != null) {
                Toast.makeText(requireContext(), "${getString(R.string.contacts_backup_popup_backup_success_title)} (${getString(R.string.contacts_count_badge_fmt, backup.contactCount)})", Toast.LENGTH_SHORT).show()
                loadContactsData()
            } else {
                Toast.makeText(requireContext(), getString(R.string.contacts_backup_failed), Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun promptRestoreBackup(backupItem: ContactBackupItem) {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(getString(R.string.contacts_restore_backup))
            .setMessage(getString(R.string.contacts_restore_confirm_msg, backupItem.fileName, backupItem.contactCount))
            .setPositiveButton(getString(R.string.contacts_restore_backup)) { _, _ ->
                viewLifecycleOwner.lifecycleScope.launch {
                    binding.progressBar.visibility = View.VISIBLE
                    val restored = repository.restoreBackup(backupItem)
                    binding.progressBar.visibility = View.GONE
                    Toast.makeText(requireContext(), getString(R.string.contacts_restore_success_fmt, restored), Toast.LENGTH_LONG).show()
                    loadContactsData()
                }
            }
            .setNegativeButton(getString(R.string.btn_cancel), null)
            .show()
    }

    private fun promptDeleteBackup(backupItem: ContactBackupItem) {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(getString(R.string.contacts_delete_backup_popup_title))
            .setMessage(getString(R.string.contacts_delete_backup_popup_subtitle))
            .setPositiveButton(getString(R.string.contacts_delete_backup_popup_primary_action_text)) { _, _ ->
                viewLifecycleOwner.lifecycleScope.launch {
                    repository.deleteBackup(backupItem)
                    Toast.makeText(requireContext(), getString(R.string.backup_deletion_success_popup_title), Toast.LENGTH_SHORT).show()
                    loadContactsData()
                }
            }
            .setNegativeButton(getString(R.string.btn_cancel), null)
            .show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance() = ContactsFragment()
    }
}
