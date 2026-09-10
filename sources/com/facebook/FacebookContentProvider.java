package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.internal.Utility;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/facebook/FacebookContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookContentProvider extends ContentProvider {
    public static final /* synthetic */ int X = 0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/facebook/FacebookContentProvider$Companion;", "", "", "ATTACHMENT_URL_BASE", "Ljava/lang/String;", "INVALID_FILE_NAME", "TAG", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        Intrinsics.f(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        Intrinsics.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        Intrinsics.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException {
        Pair pair;
        Intrinsics.f(uri, "uri");
        Intrinsics.f(mode, "mode");
        try {
            String path = uri.getPath();
            if (path == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String strSubstring = path.substring(1);
            Intrinsics.e(strSubstring, "(this as java.lang.String).substring(startIndex)");
            Object[] array = StringsKt.J(strSubstring, 0, 6, new String[]{"/"}).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            String str = strArr[0];
            String str2 = strArr[1];
            if ("..".contentEquals(str) || "..".contentEquals(str2)) {
                throw new Exception();
            }
            pair = new Pair(UUID.fromString(str), str2);
            if (pair == null) {
                throw new FileNotFoundException();
            }
            try {
                UUID uuid = (UUID) pair.first;
                String str3 = (String) pair.second;
                if (Utility.C(str3) || uuid == null) {
                    throw new FileNotFoundException();
                }
                try {
                    File fileB = NativeAppCallAttachmentStore.b(uuid, str3, false);
                    if (fileB != null) {
                        return ParcelFileDescriptor.open(fileB, 268435456);
                    }
                    throw new FileNotFoundException();
                } catch (IOException unused) {
                    throw new FileNotFoundException();
                }
            } catch (FileNotFoundException e2) {
                Log.e("com.facebook.FacebookContentProvider", "Got unexpected exception:" + e2);
                throw e2;
            }
        } catch (Exception unused2) {
            pair = null;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Intrinsics.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Intrinsics.f(uri, "uri");
        return 0;
    }
}
