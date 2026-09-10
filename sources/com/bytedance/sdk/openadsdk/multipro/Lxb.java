package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface Lxb {
    int Lxb(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr);

    int Lxb(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr);

    Cursor Lxb(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2);

    Uri Lxb(@NonNull Uri uri, @Nullable ContentValues contentValues);

    @NonNull
    String Lxb();

    String Lxb(@NonNull Uri uri);
}
