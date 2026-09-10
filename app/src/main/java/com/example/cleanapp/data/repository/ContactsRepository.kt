package com.example.cleanapp.data.repository

import android.content.ContentProviderOperation
import android.content.Context
import android.content.Intent
import android.database.Cursor
import android.net.Uri
import android.provider.ContactsContract
import androidx.core.content.FileProvider
import com.example.cleanapp.data.model.ContactBackupItem
import com.example.cleanapp.data.model.ContactDuplicateGroup
import com.example.cleanapp.data.model.ContactEmail
import com.example.cleanapp.data.model.ContactItem
import com.example.cleanapp.data.model.ContactPhone
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStreamReader
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class ContactsRepository(private val context: Context) {

    private val backupDir: File by lazy {
        val dir = File(context.getExternalFilesDir(null), "contacts_backups")
        if (!dir.exists()) {
            dir.mkdirs()
        }
        dir
    }

    suspend fun getAllContacts(): List<ContactItem> = withContext(Dispatchers.IO) {
        val contactsMap = LinkedHashMap<Long, ContactItem>()

        // 1. Query Basic Contacts Info
        val contactProjection = arrayOf(
            ContactsContract.Contacts._ID,
            ContactsContract.Contacts.LOOKUP_KEY,
            ContactsContract.Contacts.DISPLAY_NAME_PRIMARY,
            ContactsContract.Contacts.PHOTO_THUMBNAIL_URI
        )

        try {
            val cursor = context.contentResolver.query(
                ContactsContract.Contacts.CONTENT_URI,
                contactProjection,
                null,
                null,
                "${ContactsContract.Contacts.DISPLAY_NAME_PRIMARY} COLLATE NOCASE ASC"
            )

            cursor?.use { c ->
                val idCol = c.getColumnIndex(ContactsContract.Contacts._ID)
                val lookupCol = c.getColumnIndex(ContactsContract.Contacts.LOOKUP_KEY)
                val nameCol = c.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME_PRIMARY)
                val photoCol = c.getColumnIndex(ContactsContract.Contacts.PHOTO_THUMBNAIL_URI)

                while (c.moveToNext()) {
                    val id = if (idCol >= 0) c.getLong(idCol) else continue
                    val lookup = if (lookupCol >= 0) c.getString(lookupCol) ?: "" else ""
                    val name = if (nameCol >= 0) c.getString(nameCol) ?: "" else ""
                    val photo = if (photoCol >= 0) c.getString(photoCol) else null

                    contactsMap[id] = ContactItem(
                        id = id,
                        lookupKey = lookup,
                        displayName = name.trim(),
                        photoUri = photo
                    )
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        // 2. Query Details via ContactsContract.Data
        val dataProjection = arrayOf(
            ContactsContract.Data.CONTACT_ID,
            ContactsContract.Data.RAW_CONTACT_ID,
            ContactsContract.Data.MIMETYPE,
            ContactsContract.Data.DATA1, // Phone number, Email address, Company, Note, Formatted Address
            ContactsContract.Data.DATA2, // Phone Type, Email Type, Job Title
            ContactsContract.Data.DATA3  // Phone Label, Email Label
        )

        try {
            val dataCursor = context.contentResolver.query(
                ContactsContract.Data.CONTENT_URI,
                dataProjection,
                null,
                null,
                null
            )

            dataCursor?.use { c ->
                val contactIdCol = c.getColumnIndex(ContactsContract.Data.CONTACT_ID)
                val rawContactIdCol = c.getColumnIndex(ContactsContract.Data.RAW_CONTACT_ID)
                val mimeCol = c.getColumnIndex(ContactsContract.Data.MIMETYPE)
                val data1Col = c.getColumnIndex(ContactsContract.Data.DATA1)
                val data2Col = c.getColumnIndex(ContactsContract.Data.DATA2)
                val data3Col = c.getColumnIndex(ContactsContract.Data.DATA3)

                while (c.moveToNext()) {
                    val contactId = if (contactIdCol >= 0) c.getLong(contactIdCol) else continue
                    val item = contactsMap[contactId] ?: continue

                    val rawId = if (rawContactIdCol >= 0) c.getLong(rawContactIdCol) else -1L
                    val mime = if (mimeCol >= 0) c.getString(mimeCol) ?: "" else ""
                    val data1 = if (data1Col >= 0) c.getString(data1Col) ?: "" else ""
                    val data2 = if (data2Col >= 0) c.getString(data2Col) ?: "" else ""
                    val data3 = if (data3Col >= 0) c.getString(data3Col) ?: "" else ""

                    val updatedRawIds = if (rawId > 0 && !item.rawContactIds.contains(rawId)) {
                        item.rawContactIds + rawId
                    } else {
                        item.rawContactIds
                    }

                    var updatedItem = item.copy(rawContactIds = updatedRawIds)

                    when (mime) {
                        ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE -> {
                            if (data1.isNotBlank()) {
                                val typeInt = data2.toIntOrNull() ?: ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE
                                val customLabel = if (typeInt == ContactsContract.CommonDataKinds.Phone.TYPE_CUSTOM) data3 else ""
                                val newPhone = ContactPhone(data1.trim(), typeInt, customLabel)
                                if (!updatedItem.phoneEntries.any { it.number == newPhone.number }) {
                                    updatedItem = updatedItem.copy(phoneEntries = updatedItem.phoneEntries + newPhone)
                                }
                            }
                        }
                        ContactsContract.CommonDataKinds.Email.CONTENT_ITEM_TYPE -> {
                            if (data1.isNotBlank()) {
                                val typeInt = data2.toIntOrNull() ?: ContactsContract.CommonDataKinds.Email.TYPE_HOME
                                val customLabel = if (typeInt == ContactsContract.CommonDataKinds.Email.TYPE_CUSTOM) data3 else ""
                                val newEmail = ContactEmail(data1.trim(), typeInt, customLabel)
                                if (!updatedItem.emailEntries.any { it.address.equals(newEmail.address, ignoreCase = true) }) {
                                    updatedItem = updatedItem.copy(emailEntries = updatedItem.emailEntries + newEmail)
                                }
                            }
                        }
                        ContactsContract.CommonDataKinds.Organization.CONTENT_ITEM_TYPE -> {
                            val comp = if (data1.isNotBlank()) data1.trim() else updatedItem.company
                            val title = if (data2.isNotBlank()) data2.trim() else updatedItem.jobTitle
                            updatedItem = updatedItem.copy(company = comp, jobTitle = title)
                        }
                        ContactsContract.CommonDataKinds.Note.CONTENT_ITEM_TYPE -> {
                            if (data1.isNotBlank() && updatedItem.note.isBlank()) {
                                updatedItem = updatedItem.copy(note = data1.trim())
                            }
                        }
                        ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_ITEM_TYPE -> {
                            if (data1.isNotBlank() && !updatedItem.addresses.contains(data1.trim())) {
                                updatedItem = updatedItem.copy(addresses = updatedItem.addresses + data1.trim())
                            }
                        }
                    }

                    contactsMap[contactId] = updatedItem
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        contactsMap.values.toList().sortedWith(compareBy(String.CASE_INSENSITIVE_ORDER) { it.displayName })
    }

    suspend fun getDuplicateGroups(): List<ContactDuplicateGroup> = withContext(Dispatchers.IO) {
        val all = getAllContacts()
        val groups = mutableListOf<ContactDuplicateGroup>()
        val assignedContactIds = HashSet<Long>()

        // 1. Group by Normalized Phone Numbers (Matches last 8+ digits)
        val phoneMap = mutableMapOf<String, MutableList<ContactItem>>()
        for (c in all) {
            for (p in c.phoneEntries) {
                val normalized = p.normalizedNumber
                val key = if (normalized.length >= 8) normalized.takeLast(8) else normalized
                if (key.length >= 6) {
                    phoneMap.getOrPut(key) { mutableListOf() }.add(c)
                }
            }
        }

        phoneMap.forEach { (phoneKey, list) ->
            val distinctList = list.distinctBy { it.id }
            if (distinctList.size > 1) {
                distinctList.forEach { assignedContactIds.add(it.id) }
                val displayPhone = distinctList.flatMap { it.phoneEntries }.firstOrNull()?.number ?: phoneKey
                groups.add(ContactDuplicateGroup("Phone: $displayPhone", distinctList))
            }
        }

        // 2. Group by Name (for contacts not already in phone duplicate groups)
        val nameMap = mutableMapOf<String, MutableList<ContactItem>>()
        for (c in all) {
            if (c.displayName.isNotBlank() && !c.displayName.equals("No name", ignoreCase = true) && !assignedContactIds.contains(c.id)) {
                val normName = c.displayName.trim().lowercase(Locale.getDefault())
                nameMap.getOrPut(normName) { mutableListOf() }.add(c)
            }
        }

        nameMap.forEach { (_, list) ->
            val distinctList = list.distinctBy { it.id }
            if (distinctList.size > 1) {
                distinctList.forEach { assignedContactIds.add(it.id) }
                groups.add(ContactDuplicateGroup("Name: ${distinctList[0].displayName}", distinctList))
            }
        }

        // 3. Group by Email
        val emailMap = mutableMapOf<String, MutableList<ContactItem>>()
        for (c in all) {
            if (!assignedContactIds.contains(c.id)) {
                for (e in c.emailEntries) {
                    val normEmail = e.address.trim().lowercase(Locale.getDefault())
                    if (normEmail.isNotBlank()) {
                        emailMap.getOrPut(normEmail) { mutableListOf() }.add(c)
                    }
                }
            }
        }

        emailMap.forEach { (emailKey, list) ->
            val distinctList = list.distinctBy { it.id }
            if (distinctList.size > 1) {
                groups.add(ContactDuplicateGroup("Email: $emailKey", distinctList))
            }
        }

        groups
    }

    suspend fun getIncompleteContacts(): List<ContactItem> = withContext(Dispatchers.IO) {
        getAllContacts().filter { it.isIncomplete }
    }

    suspend fun deleteContacts(contacts: List<ContactItem>): Boolean = withContext(Dispatchers.IO) {
        if (contacts.isEmpty()) return@withContext true
        try {
            // Apply in chunks of 50 to avoid binder limits
            contacts.chunked(50).forEach { chunk ->
                val ops = ArrayList<ContentProviderOperation>()
                for (c in chunk) {
                    val uri = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_LOOKUP_URI, c.lookupKey)
                    ops.add(ContentProviderOperation.newDelete(uri).build())
                }
                context.contentResolver.applyBatch(ContactsContract.AUTHORITY, ops)
            }
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    suspend fun mergeContacts(group: ContactDuplicateGroup): Boolean = withContext(Dispatchers.IO) {
        if (group.contacts.size < 2) return@withContext false
        try {
            val mergedTarget = group.previewMergedContact
            val primary = group.contacts.firstOrNull { it.id == mergedTarget.id } ?: group.contacts[0]
            val others = group.contacts.filter { it.id != primary.id }

            val targetRawContactId = primary.rawContactIds.firstOrNull() ?: primary.id

            // 1. Delete secondary duplicate contacts
            deleteContacts(others)

            // 2. Insert missing phone numbers, emails, organization, notes to primary raw contact
            val ops = ArrayList<ContentProviderOperation>()

            // Phones
            for (p in mergedTarget.phoneEntries) {
                if (!primary.phoneEntries.any { it.number == p.number }) {
                    ops.add(
                        ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                            .withValue(ContactsContract.Data.RAW_CONTACT_ID, targetRawContactId)
                            .withValue(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
                            .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, p.number)
                            .withValue(ContactsContract.CommonDataKinds.Phone.TYPE, p.type)
                            .apply {
                                if (p.customLabel.isNotBlank()) {
                                    withValue(ContactsContract.CommonDataKinds.Phone.LABEL, p.customLabel)
                                }
                            }
                            .build()
                    )
                }
            }

            // Emails
            for (e in mergedTarget.emailEntries) {
                if (!primary.emailEntries.any { it.address.equals(e.address, ignoreCase = true) }) {
                    ops.add(
                        ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                            .withValue(ContactsContract.Data.RAW_CONTACT_ID, targetRawContactId)
                            .withValue(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Email.CONTENT_ITEM_TYPE)
                            .withValue(ContactsContract.CommonDataKinds.Email.ADDRESS, e.address)
                            .withValue(ContactsContract.CommonDataKinds.Email.TYPE, e.type)
                            .apply {
                                if (e.customLabel.isNotBlank()) {
                                    withValue(ContactsContract.CommonDataKinds.Email.LABEL, e.customLabel)
                                }
                            }
                            .build()
                    )
                }
            }

            // Organization if missing
            if (primary.company.isBlank() && mergedTarget.company.isNotBlank()) {
                ops.add(
                    ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                        .withValue(ContactsContract.Data.RAW_CONTACT_ID, targetRawContactId)
                        .withValue(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Organization.CONTENT_ITEM_TYPE)
                        .withValue(ContactsContract.CommonDataKinds.Organization.COMPANY, mergedTarget.company)
                        .withValue(ContactsContract.CommonDataKinds.Organization.TITLE, mergedTarget.jobTitle)
                        .build()
                )
            }

            // Notes if missing
            if (primary.note.isBlank() && mergedTarget.note.isNotBlank()) {
                ops.add(
                    ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                        .withValue(ContactsContract.Data.RAW_CONTACT_ID, targetRawContactId)
                        .withValue(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Note.CONTENT_ITEM_TYPE)
                        .withValue(ContactsContract.CommonDataKinds.Note.NOTE, mergedTarget.note)
                        .build()
                )
            }

            if (ops.isNotEmpty()) {
                context.contentResolver.applyBatch(ContactsContract.AUTHORITY, ops)
            }
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    suspend fun createBackup(): ContactBackupItem? = withContext(Dispatchers.IO) {
        try {
            val contacts = getAllContacts()
            val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Date())
            val file = File(backupDir, "contacts_backup_$timeStamp.vcf")

            val builder = StringBuilder()
            for (c in contacts) {
                builder.append("BEGIN:VCARD\n")
                builder.append("VERSION:3.0\n")
                builder.append("FN:${escapeVCard(c.displayName)}\n")
                builder.append("N:;${escapeVCard(c.displayName)};;;\n")

                if (c.company.isNotBlank()) {
                    builder.append("ORG:${escapeVCard(c.company)}\n")
                }
                if (c.jobTitle.isNotBlank()) {
                    builder.append("TITLE:${escapeVCard(c.jobTitle)}\n")
                }

                for (p in c.phoneEntries) {
                    val typeStr = when (p.type) {
                        ContactsContract.CommonDataKinds.Phone.TYPE_WORK -> "WORK"
                        ContactsContract.CommonDataKinds.Phone.TYPE_HOME -> "HOME"
                        ContactsContract.CommonDataKinds.Phone.TYPE_MAIN -> "MAIN"
                        ContactsContract.CommonDataKinds.Phone.TYPE_FAX_WORK, ContactsContract.CommonDataKinds.Phone.TYPE_FAX_HOME -> "FAX"
                        else -> "CELL"
                    }
                    builder.append("TEL;TYPE=$typeStr:${p.number}\n")
                }

                for (e in c.emailEntries) {
                    val typeStr = when (e.type) {
                        ContactsContract.CommonDataKinds.Email.TYPE_WORK -> "WORK"
                        else -> "HOME"
                    }
                    builder.append("EMAIL;TYPE=$typeStr:${e.address}\n")
                }

                if (c.note.isNotBlank()) {
                    builder.append("NOTE:${escapeVCard(c.note)}\n")
                }

                for (a in c.addresses) {
                    builder.append("ADR;TYPE=HOME:;;${escapeVCard(a)};;;;\n")
                }

                builder.append("END:VCARD\n")
            }

            FileOutputStream(file).use { it.write(builder.toString().toByteArray(Charsets.UTF_8)) }

            val sizeKb = file.length() / 1024.0
            val sizeFormatted = if (sizeKb >= 1024) String.format("%.1f MB", sizeKb / 1024.0) else String.format("%.1f KB", sizeKb)

            ContactBackupItem(
                file = file,
                fileName = file.name,
                createdTimestamp = file.lastModified(),
                contactCount = contacts.size,
                sizeFormatted = sizeFormatted
            )
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    suspend fun getBackups(): List<ContactBackupItem> = withContext(Dispatchers.IO) {
        val list = mutableListOf<ContactBackupItem>()
        val files = backupDir.listFiles { _, name -> name.endsWith(".vcf", ignoreCase = true) } ?: return@withContext emptyList()

        for (f in files.sortedByDescending { it.lastModified() }) {
            var count = 0
            try {
                BufferedReader(InputStreamReader(FileInputStream(f), Charsets.UTF_8)).use { reader ->
                    var line: String?
                    while (reader.readLine().also { line = it } != null) {
                        if (line?.trim()?.equals("BEGIN:VCARD", ignoreCase = true) == true) {
                            count++
                        }
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

            val sizeKb = f.length() / 1024.0
            val sizeFormatted = if (sizeKb >= 1024) String.format("%.1f MB", sizeKb / 1024.0) else String.format("%.1f KB", sizeKb)

            list.add(
                ContactBackupItem(
                    file = f,
                    fileName = f.name,
                    createdTimestamp = f.lastModified(),
                    contactCount = count,
                    sizeFormatted = sizeFormatted
                )
            )
        }
        list
    }

    suspend fun deleteBackup(backupItem: ContactBackupItem): Boolean = withContext(Dispatchers.IO) {
        try {
            if (backupItem.file.exists()) {
                backupItem.file.delete()
            } else true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    suspend fun restoreBackup(backupItem: ContactBackupItem): Int = withContext(Dispatchers.IO) {
        var restoredCount = 0
        try {
            val ops = ArrayList<ContentProviderOperation>()

            BufferedReader(InputStreamReader(FileInputStream(backupItem.file), Charsets.UTF_8)).use { reader ->
                var name = ""
                var company = ""
                var jobTitle = ""
                var note = ""
                val phones = mutableListOf<Pair<String, Int>>()
                val emails = mutableListOf<Pair<String, Int>>()
                var inVcard = false

                var line: String?
                while (reader.readLine().also { line = it } != null) {
                    val trimmed = line?.trim() ?: continue
                    if (trimmed.equals("BEGIN:VCARD", ignoreCase = true)) {
                        inVcard = true
                        name = ""
                        company = ""
                        jobTitle = ""
                        note = ""
                        phones.clear()
                        emails.clear()
                    } else if (trimmed.equals("END:VCARD", ignoreCase = true)) {
                        if (inVcard && (name.isNotBlank() || phones.isNotEmpty() || emails.isNotEmpty())) {
                            val rawIndex = ops.size
                            ops.add(
                                ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI)
                                    .withValue(ContactsContract.RawContacts.ACCOUNT_TYPE, null)
                                    .withValue(ContactsContract.RawContacts.ACCOUNT_NAME, null)
                                    .build()
                            )

                            if (name.isNotBlank()) {
                                ops.add(
                                    ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                                        .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, rawIndex)
                                        .withValue(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)
                                        .withValue(ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME, unescapeVCard(name))
                                        .build()
                                )
                            }

                            if (company.isNotBlank() || jobTitle.isNotBlank()) {
                                ops.add(
                                    ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                                        .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, rawIndex)
                                        .withValue(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Organization.CONTENT_ITEM_TYPE)
                                        .withValue(ContactsContract.CommonDataKinds.Organization.COMPANY, unescapeVCard(company))
                                        .withValue(ContactsContract.CommonDataKinds.Organization.TITLE, unescapeVCard(jobTitle))
                                        .build()
                                )
                            }

                            if (note.isNotBlank()) {
                                ops.add(
                                    ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                                        .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, rawIndex)
                                        .withValue(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Note.CONTENT_ITEM_TYPE)
                                        .withValue(ContactsContract.CommonDataKinds.Note.NOTE, unescapeVCard(note))
                                        .build()
                                )
                            }

                            for ((p, type) in phones) {
                                ops.add(
                                    ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                                        .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, rawIndex)
                                        .withValue(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
                                        .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, p)
                                        .withValue(ContactsContract.CommonDataKinds.Phone.TYPE, type)
                                        .build()
                                )
                            }

                            for ((e, type) in emails) {
                                ops.add(
                                    ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                                        .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, rawIndex)
                                        .withValue(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Email.CONTENT_ITEM_TYPE)
                                        .withValue(ContactsContract.CommonDataKinds.Email.ADDRESS, e)
                                        .withValue(ContactsContract.CommonDataKinds.Email.TYPE, type)
                                        .build()
                                )
                            }

                            restoredCount++

                            if (ops.size >= 100) {
                                context.contentResolver.applyBatch(ContactsContract.AUTHORITY, ops)
                                ops.clear()
                            }
                        }
                        inVcard = false
                    } else if (inVcard) {
                        if (trimmed.startsWith("FN:", ignoreCase = true)) {
                            name = trimmed.substring(3).trim()
                        } else if (trimmed.startsWith("ORG:", ignoreCase = true)) {
                            company = trimmed.substring(4).trim()
                        } else if (trimmed.startsWith("TITLE:", ignoreCase = true)) {
                            jobTitle = trimmed.substring(6).trim()
                        } else if (trimmed.startsWith("NOTE:", ignoreCase = true)) {
                            note = trimmed.substring(5).trim()
                        } else if (trimmed.startsWith("TEL", ignoreCase = true)) {
                            val colonIndex = trimmed.indexOf(':')
                            if (colonIndex != -1) {
                                val phone = trimmed.substring(colonIndex + 1).trim()
                                val type = if (trimmed.contains("WORK", ignoreCase = true)) ContactsContract.CommonDataKinds.Phone.TYPE_WORK
                                           else if (trimmed.contains("HOME", ignoreCase = true)) ContactsContract.CommonDataKinds.Phone.TYPE_HOME
                                           else ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE
                                if (phone.isNotBlank()) phones.add(phone to type)
                            }
                        } else if (trimmed.startsWith("EMAIL", ignoreCase = true)) {
                            val colonIndex = trimmed.indexOf(':')
                            if (colonIndex != -1) {
                                val email = trimmed.substring(colonIndex + 1).trim()
                                val type = if (trimmed.contains("WORK", ignoreCase = true)) ContactsContract.CommonDataKinds.Email.TYPE_WORK
                                           else ContactsContract.CommonDataKinds.Email.TYPE_HOME
                                if (email.isNotBlank()) emails.add(email to type)
                            }
                        }
                    }
                }
            }

            if (ops.isNotEmpty()) {
                context.contentResolver.applyBatch(ContactsContract.AUTHORITY, ops)
                ops.clear()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        restoredCount
    }

    fun getShareIntent(backupItem: ContactBackupItem): Intent {
        val uri = FileProvider.getUriForFile(
            context,
            "${context.packageName}.fileprovider",
            backupItem.file
        )
        return Intent(Intent.ACTION_SEND).apply {
            type = "text/x-vcard"
            putExtra(Intent.EXTRA_STREAM, uri)
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        }
    }

    private fun escapeVCard(value: String): String {
        return value.replace("\\", "\\\\")
            .replace(",", "\\,")
            .replace(";", "\\;")
            .replace("\n", "\\n")
    }

    private fun unescapeVCard(value: String): String {
        return value.replace("\\n", "\n")
            .replace("\\;", ";")
            .replace("\\,", ",")
            .replace("\\\\", "\\")
    }
}
