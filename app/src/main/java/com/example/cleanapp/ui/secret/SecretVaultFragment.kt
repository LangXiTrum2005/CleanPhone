package com.example.cleanapp.ui.secret

import android.app.Activity
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cleanapp.R
import com.example.cleanapp.data.model.MediaAsset
import com.example.cleanapp.data.repository.SecretVaultRepository
import com.example.cleanapp.data.repository.StorageScannerRepository
import com.example.cleanapp.databinding.FragmentSecretVaultBinding
import com.example.cleanapp.ui.contacts.adapter.ContactListAdapter
import com.example.cleanapp.ui.similar.adapter.MediaListAdapter
import com.example.cleanapp.util.SafeAreaUtils
import com.example.cleanapp.util.SecurityUtils
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.coroutines.launch

class SecretVaultFragment : Fragment() {

    private var _binding: FragmentSecretVaultBinding? = null
    private val binding get() = _binding!!

    private lateinit var repository: SecretVaultRepository
    private lateinit var storageRepo: StorageScannerRepository
    private val enteredPin = StringBuilder()
    private var isCreatingPin = false

    private lateinit var mediaAdapter: MediaListAdapter
    private lateinit var contactAdapter: ContactListAdapter

    private var pendingDeleteUris: List<Uri>? = null

    private val deleteLauncher = registerForActivityResult(
        ActivityResultContracts.StartIntentSenderForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            Toast.makeText(requireContext(), getString(R.string.secret_original_removed), Toast.LENGTH_SHORT).show()
        }
        pendingDeleteUris = null
    }

    private val pickMediaLauncher = registerForActivityResult(
        ActivityResultContracts.GetMultipleContents()
    ) { uris: List<Uri>? ->
        if (!uris.isNullOrEmpty()) {
            viewLifecycleOwner.lifecycleScope.launch {
                var importedCount = 0
                val importedUris = mutableListOf<Uri>()
                for (uri in uris) {
                    val isVideo = requireContext().contentResolver.getType(uri)?.startsWith("video") == true
                    val success = repository.importMedia(uri, isVideo)
                    if (success) {
                        importedCount++
                        importedUris.add(uri)
                    }
                }
                if (importedCount > 0) {
                    Toast.makeText(requireContext(), getString(R.string.secret_vault_imported_fmt, importedCount), Toast.LENGTH_SHORT).show()
                    loadVaultMedia()

                    // Request deletion of the original files from the public photo gallery
                    pendingDeleteUris = importedUris
                    val intentSender = storageRepo.createDeleteRequest(importedUris)?.intentSender
                    if (intentSender != null) {
                        val request = IntentSenderRequest.Builder(intentSender).build()
                        deleteLauncher.launch(request)
                    }
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecretVaultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        repository = SecretVaultRepository(requireContext())
        storageRepo = StorageScannerRepository(requireContext())
        setupSafeArea()
        setupKeypad()
        setupVaultViews()
        checkInitialState()
    }

    private fun setupSafeArea() {
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, windowInsets ->
            val insets = windowInsets.getInsets(
                WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout()
            )

            val baseBottomNavPx = SafeAreaUtils.dpToPx(requireContext(), 72)
            val totalBottomPadding = baseBottomNavPx + insets.bottom

            // Ensure lockedLayout has safe bottom padding above navigation bar
            binding.lockedLayout.setPadding(
                insets.left,
                binding.lockedLayout.paddingTop,
                insets.right,
                totalBottomPadding + SafeAreaUtils.dpToPx(requireContext(), 8)
            )

            // Dynamic bottom margin for floating action button and bottom action card
            val fabMargin = totalBottomPadding + SafeAreaUtils.dpToPx(requireContext(), 16)
            (binding.fabAddSecret.layoutParams as? ViewGroup.MarginLayoutParams)?.let { lp ->
                lp.bottomMargin = fabMargin
                binding.fabAddSecret.layoutParams = lp
            }

            (binding.vaultBottomActionCard.layoutParams as? ViewGroup.MarginLayoutParams)?.let { lp ->
                lp.bottomMargin = fabMargin
                binding.vaultBottomActionCard.layoutParams = lp
            }

            // RecyclerView safe bottom padding
            binding.rvVaultContent.setPadding(
                binding.rvVaultContent.paddingLeft,
                binding.rvVaultContent.paddingTop,
                binding.rvVaultContent.paddingRight,
                totalBottomPadding + SafeAreaUtils.dpToPx(requireContext(), 80)
            )

            windowInsets
        }
    }

    private fun checkInitialState() {
        val ctx = context ?: return
        if (!SecurityUtils.isPinSet(ctx)) {
            isCreatingPin = true
            binding.tvPinTitle.text = getString(R.string.secret_pin_create)
        } else {
            isCreatingPin = false
            binding.tvPinTitle.text = getString(R.string.secret_pin_title)
            view?.post {
                if (isAdded && _binding != null && SecurityUtils.canAuthenticateBiometric(requireContext())) {
                    SecurityUtils.showBiometricPrompt(
                        this@SecretVaultFragment,
                        onSuccess = { unlockVault() },
                        onError = { /* fallback to PIN */ }
                    )
                }
            }
        }
    }

    private fun setupKeypad() {
        val numButtons = listOf(
            binding.btn0 to "0", binding.btn1 to "1", binding.btn2 to "2",
            binding.btn3 to "3", binding.btn4 to "4", binding.btn5 to "5",
            binding.btn6 to "6", binding.btn7 to "7", binding.btn8 to "8",
            binding.btn9 to "9"
        )

        numButtons.forEach { (btn, digit) ->
            com.example.cleanapp.util.TouchAnimationUtils.attachTouchAnimation(btn) {
                if (enteredPin.length < 6) {
                    enteredPin.append(digit)
                    updatePinDots()
                    if (enteredPin.length == 6) {
                        processEnteredPin()
                    }
                }
            }
        }

        com.example.cleanapp.util.TouchAnimationUtils.attachTouchAnimation(binding.btnBackspace) {
            if (enteredPin.isNotEmpty()) {
                enteredPin.deleteCharAt(enteredPin.length - 1)
                updatePinDots()
            }
        }

        com.example.cleanapp.util.TouchAnimationUtils.attachTouchAnimation(binding.btnBiometric) {
            val ctx = context ?: return@attachTouchAnimation
            if (SecurityUtils.canAuthenticateBiometric(ctx)) {
                SecurityUtils.showBiometricPrompt(
                    this@SecretVaultFragment,
                    onSuccess = { unlockVault() },
                    onError = { msg ->
                        context?.let {
                            Toast.makeText(it, msg, Toast.LENGTH_SHORT).show()
                        }
                    }
                )
            } else {
                Toast.makeText(ctx, getString(R.string.secret_biometric_unavailable), Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun updatePinDots() {
        val dots = listOf(binding.dot1, binding.dot2, binding.dot3, binding.dot4, binding.dot5, binding.dot6)
        dots.forEachIndexed { index, dot ->
            if (index < enteredPin.length) {
                dot.setImageResource(R.drawable.ic_pin_star_filled)
                dot.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100).withEndAction {
                    dot.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start()
                }.start()
            } else {
                dot.animate().cancel()
                dot.scaleX = 1.0f
                dot.scaleY = 1.0f
                dot.setImageResource(R.drawable.ic_pin_star_empty)
            }
        }
    }

    private fun processEnteredPin() {
        val pin = enteredPin.toString()
        if (isCreatingPin) {
            SecurityUtils.savePin(requireContext(), pin)
            Toast.makeText(requireContext(), getString(R.string.secret_pin_create_success), Toast.LENGTH_SHORT).show()
            unlockVault()
        } else {
            if (SecurityUtils.verifyPin(requireContext(), pin)) {
                unlockVault()
            } else {
                Toast.makeText(requireContext(), getString(R.string.secret_pin_wrong), Toast.LENGTH_SHORT).show()
                enteredPin.clear()
                updatePinDots()
            }
        }
    }

    private fun unlockVault() {
        enteredPin.clear()
        updatePinDots()
        binding.lockedLayout.visibility = View.GONE
        binding.unlockedLayout.visibility = View.VISIBLE
        loadVaultMedia()
    }

    private fun lockVault() {
        binding.unlockedLayout.visibility = View.GONE
        binding.lockedLayout.visibility = View.VISIBLE
        enteredPin.clear()
        updatePinDots()
    }

    private fun setupVaultViews() {
        binding.btnLockVault.setOnClickListener { lockVault() }

        binding.btnRestoreAll.setOnClickListener {
            showRestoreAllConfirmation()
        }

        mediaAdapter = MediaListAdapter(mutableListOf()) {
            updateVaultSelectionState()
        }
        contactAdapter = ContactListAdapter(mutableListOf()) { /* selection */ }

        binding.btnRestoreSelected.setOnClickListener {
            val selected = mediaAdapter.getSelectedAssets()
            if (selected.isNotEmpty()) {
                viewLifecycleOwner.lifecycleScope.launch {
                    var count = 0
                    for (asset in selected) {
                        if (repository.restoreMediaToGallery(asset)) {
                            count++
                        }
                    }
                    Toast.makeText(requireContext(), getString(R.string.secret_vault_restored_fmt, count), Toast.LENGTH_SHORT).show()
                    loadVaultMedia()
                }
            }
        }

        binding.btnDeleteSelectedVault.setOnClickListener {
            val selected = mediaAdapter.getSelectedAssets()
            if (selected.isNotEmpty()) {
                MaterialAlertDialogBuilder(requireContext())
                    .setTitle(R.string.confirm_delete_title)
                    .setMessage(R.string.confirm_delete_msg)
                    .setPositiveButton(R.string.btn_delete) { _, _ ->
                        viewLifecycleOwner.lifecycleScope.launch {
                            for (asset in selected) {
                                repository.deleteSecretMedia(asset)
                            }
                            Toast.makeText(requireContext(), getString(R.string.secret_deleted_fmt, selected.size), Toast.LENGTH_SHORT).show()
                            loadVaultMedia()
                        }
                    }
                    .setNegativeButton(R.string.btn_cancel, null)
                    .show()
            }
        }

        binding.chipGroupVault.setOnCheckedStateChangeListener { _, checkedIds ->
            if (checkedIds.contains(binding.chipSecretPhotos.id)) {
                binding.fabAddSecret.text = getString(R.string.secret_add_media)
                binding.fabAddSecret.setIconResource(R.drawable.ic_image)
                binding.btnRestoreAll.visibility = View.VISIBLE
                loadVaultMedia()
            } else {
                binding.fabAddSecret.text = getString(R.string.secret_add_contact)
                binding.fabAddSecret.setIconResource(R.drawable.ic_nav_contacts)
                binding.btnRestoreAll.visibility = View.GONE
                binding.vaultBottomActionCard.visibility = View.GONE
                loadVaultContacts()
            }
        }

        binding.fabAddSecret.setOnClickListener {
            if (binding.chipSecretPhotos.isChecked) {
                pickMediaLauncher.launch("*/*")
            } else {
                showAddContactDialog()
            }
        }
    }

    private fun updateVaultSelectionState() {
        val selected = mediaAdapter.getSelectedAssets()
        if (selected.isNotEmpty() && binding.chipSecretPhotos.isChecked) {
            binding.vaultBottomActionCard.visibility = View.VISIBLE
            binding.tvVaultSelectedCount.text = getString(R.string.stat_selected_count_fmt, selected.size)
            binding.fabAddSecret.hide()
        } else {
            binding.vaultBottomActionCard.visibility = View.GONE
            if (binding.chipSecretPhotos.isChecked || binding.chipSecretContacts.isChecked) {
                binding.fabAddSecret.show()
            }
        }
    }

    private fun showRestoreAllConfirmation() {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(R.string.secret_restore_all_title)
            .setMessage(R.string.secret_restore_all_msg)
            .setPositiveButton(R.string.secret_restore_all_btn) { _, _ ->
                viewLifecycleOwner.lifecycleScope.launch {
                    val count = repository.restoreAllToGallery()
                    Toast.makeText(requireContext(), getString(R.string.secret_vault_restored_fmt, count), Toast.LENGTH_SHORT).show()
                    loadVaultMedia()
                }
            }
            .setNegativeButton(R.string.btn_cancel, null)
            .show()
    }

    private fun loadVaultMedia() {
        binding.rvVaultContent.layoutManager = GridLayoutManager(requireContext(), 3)
        binding.rvVaultContent.adapter = mediaAdapter
        viewLifecycleOwner.lifecycleScope.launch {
            val list = repository.getSecretMedia()
            mediaAdapter.updateData(list)
        }
    }

    private fun loadVaultContacts() {
        binding.rvVaultContent.layoutManager = LinearLayoutManager(requireContext())
        binding.rvVaultContent.adapter = contactAdapter
        viewLifecycleOwner.lifecycleScope.launch {
            val list = repository.getSecretContacts()
            contactAdapter.updateData(list)
        }
    }

    private fun showAddContactDialog() {
        val layout = LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(48, 24, 48, 24)
        }
        val etName = EditText(requireContext()).apply {
            hint = getString(R.string.contact_name_hint)
            setTextColor(Color.WHITE)
            setHintTextColor(Color.GRAY)
        }
        val etPhone = EditText(requireContext()).apply {
            hint = getString(R.string.contact_phone_hint)
            setTextColor(Color.WHITE)
            setHintTextColor(Color.GRAY)
        }
        layout.addView(etName)
        layout.addView(etPhone)

        MaterialAlertDialogBuilder(requireContext())
            .setTitle(R.string.secret_add_contact)
            .setView(layout)
            .setPositiveButton(R.string.btn_save) { _, _ ->
                val name = etName.text.toString().trim()
                val phone = etPhone.text.toString().trim()
                if (name.isNotBlank() && phone.isNotBlank()) {
                    viewLifecycleOwner.lifecycleScope.launch {
                        repository.addSecretContact(name, phone)
                        loadVaultContacts()
                    }
                }
            }
            .setNegativeButton(R.string.btn_cancel, null)
            .show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance() = SecretVaultFragment()
    }
}
