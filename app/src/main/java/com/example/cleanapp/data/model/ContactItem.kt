package com.example.cleanapp.data.model

import java.io.File
import java.io.Serializable

enum class ContactMissingType {
    NONE,
    NO_NAME,
    NO_PHONE,
    NO_PHONE_AND_EMAIL
}

data class ContactPhone(
    val number: String,
    val type: Int = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE,
    val customLabel: String = ""
) : Serializable {
    val normalizedNumber: String
        get() = number.replace(Regex("[^0-9+]"), "")
}

data class ContactEmail(
    val address: String,
    val type: Int = android.provider.ContactsContract.CommonDataKinds.Email.TYPE_HOME,
    val customLabel: String = ""
) : Serializable

data class ContactItem(
    val id: Long,
    val lookupKey: String = "",
    val displayName: String = "",
    val phoneEntries: List<ContactPhone> = emptyList(),
    val emailEntries: List<ContactEmail> = emptyList(),
    val company: String = "",
    val jobTitle: String = "",
    val note: String = "",
    val addresses: List<String> = emptyList(),
    val photoUri: String? = null,
    val rawContactIds: List<Long> = emptyList(),
    var isSelected: Boolean = false
) : Serializable {

    constructor(
        id: Long,
        lookupKey: String = "",
        displayName: String = "",
        phoneNumbers: List<String> = emptyList(),
        emails: List<String> = emptyList(),
        photoUri: String? = null,
        isSelected: Boolean = false
    ) : this(
        id = id,
        lookupKey = lookupKey,
        displayName = displayName,
        phoneEntries = phoneNumbers.map { ContactPhone(it) },
        emailEntries = emails.map { ContactEmail(it) },
        company = "",
        jobTitle = "",
        note = "",
        addresses = emptyList(),
        photoUri = photoUri,
        rawContactIds = emptyList(),
        isSelected = isSelected
    )

    val phoneNumbers: List<String>
        get() = phoneEntries.map { it.number }

    val emails: List<String>
        get() = emailEntries.map { it.address }

    val missingType: ContactMissingType
        get() {
            val noName = displayName.isBlank() || displayName.equals("No name", ignoreCase = true)
            val noPhone = phoneEntries.isEmpty()
            val noEmail = emailEntries.isEmpty()
            return when {
                noPhone && noEmail -> ContactMissingType.NO_PHONE_AND_EMAIL
                noPhone -> ContactMissingType.NO_PHONE
                noName -> ContactMissingType.NO_NAME
                else -> ContactMissingType.NONE
            }
        }

    val isIncomplete: Boolean
        get() = missingType != ContactMissingType.NONE

    val primaryPhone: String
        get() = phoneEntries.firstOrNull()?.number ?: ""

    val primaryEmail: String
        get() = emailEntries.firstOrNull()?.address ?: ""

    val initial: String
        get() = if (displayName.isNotBlank()) displayName.first().uppercase() else "?"

    val displaySubtitle: String
        get() = when {
            primaryPhone.isNotBlank() && company.isNotBlank() -> "$primaryPhone • $company"
            primaryPhone.isNotBlank() -> primaryPhone
            primaryEmail.isNotBlank() -> primaryEmail
            company.isNotBlank() -> company
            else -> "No contact details"
        }
}

data class ContactDuplicateGroup(
    val key: String, // phone or name
    val contacts: List<ContactItem>,
    var isSelected: Boolean = false
) : Serializable {

    val previewMergedContact: ContactItem
        get() {
            val primary = contacts.maxByOrNull {
                var score = 0
                if (!it.photoUri.isNullOrBlank()) score += 50
                if (it.displayName.isNotBlank()) score += it.displayName.length
                if (it.phoneEntries.isNotEmpty()) score += it.phoneEntries.size * 10
                if (it.emailEntries.isNotEmpty()) score += it.emailEntries.size * 10
                if (it.company.isNotBlank()) score += 10
                score
            } ?: contacts.first()

            // Distinct phone entries by normalized number
            val seenPhones = HashSet<String>()
            val combinedPhones = mutableListOf<ContactPhone>()
            for (c in contacts) {
                for (p in c.phoneEntries) {
                    val norm = p.normalizedNumber
                    val key = if (norm.length >= 8) norm.takeLast(8) else norm
                    if (key.isNotBlank() && seenPhones.add(key)) {
                        combinedPhones.add(p)
                    } else if (key.isBlank() && seenPhones.add(p.number)) {
                        combinedPhones.add(p)
                    }
                }
            }

            // Distinct email entries
            val seenEmails = HashSet<String>()
            val combinedEmails = mutableListOf<ContactEmail>()
            for (c in contacts) {
                for (e in c.emailEntries) {
                    val key = e.address.trim().lowercase()
                    if (key.isNotBlank() && seenEmails.add(key)) {
                        combinedEmails.add(e)
                    }
                }
            }

            // Company, JobTitle, Note
            val bestCompany = contacts.firstOrNull { it.company.isNotBlank() }?.company ?: primary.company
            val bestJobTitle = contacts.firstOrNull { it.jobTitle.isNotBlank() }?.jobTitle ?: primary.jobTitle
            val combinedNotes = contacts.mapNotNull { it.note.takeIf { n -> n.isNotBlank() } }.distinct().joinToString("\n")
            val combinedAddresses = contacts.flatMap { it.addresses }.distinct()
            val allRawIds = contacts.flatMap { it.rawContactIds }.distinct()

            return primary.copy(
                phoneEntries = combinedPhones,
                emailEntries = combinedEmails,
                company = bestCompany,
                jobTitle = bestJobTitle,
                note = combinedNotes,
                addresses = combinedAddresses,
                rawContactIds = allRawIds
            )
        }
}

data class ContactBackupItem(
    val file: File,
    val fileName: String,
    val createdTimestamp: Long,
    val contactCount: Int,
    val sizeFormatted: String
) : Serializable
