package com.bytedance.sdk.component.adexpress.qdl.qdl;

import android.content.ContentValues;
import android.database.Cursor;

/* JADX INFO: loaded from: classes.dex */
public interface ud {
    int qdl(String str, ContentValues contentValues, String str2, String[] strArr);

    int qdl(String str, String str2, String[] strArr);

    Cursor qdl(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5);

    void qdl(String str, ContentValues contentValues);
}
