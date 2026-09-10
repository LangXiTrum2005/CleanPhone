package com.bytedance.sdk.component.mo.qdl.qdl.qdl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class lnr {
    public static void qdl(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            qdl.qdl(context).qdl().qdl(str, (String) null, contentValues);
        } catch (Throwable unused) {
        }
    }

    public static void qdl(Context context, String str, List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list) {
        if (list == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            qdl.qdl(context).qdl().qdl(str, (String) null, list);
        } catch (Throwable unused) {
        }
    }

    public static int qdl(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return qdl.qdl(context).qdl().qdl(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int qdl(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            try {
                return qdl.qdl(context).qdl().qdl(str, contentValues, str2, strArr);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static Cursor qdl(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return qdl.qdl(context).qdl().qdl(str, strArr, str2, strArr2, null, null, str5);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void qdl(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            qdl.qdl(context).qdl().qdl(Uri.decode(str));
        } catch (Throwable unused) {
        }
    }
}
