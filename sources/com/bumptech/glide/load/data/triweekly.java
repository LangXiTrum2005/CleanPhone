package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: StreamLocalUriFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public class triweekly extends formularize<InputStream> {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final UriMatcher f17616polloi;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f17616polloi = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public triweekly(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.wireman
    public Class<InputStream> attabal() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.formularize
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public void dern(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    public final InputStream cutely(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.bumptech.glide.load.data.formularize
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public InputStream beachfront(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamTaiyuan = taiyuan(uri, contentResolver);
        if (inputStreamTaiyuan != null) {
            return inputStreamTaiyuan;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    public final InputStream taiyuan(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f17616polloi.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return cutely(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return cutely(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }
}
