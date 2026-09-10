package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public interface qdl {
    int qdl(Uri uri, ContentValues contentValues, String str, String[] strArr);

    int qdl(Uri uri, String str, String[] strArr);

    Cursor qdl(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    Uri qdl(Uri uri, ContentValues contentValues);

    String qdl();

    String qdl(Uri uri);
}
