package com.bytedance.sdk.component.di.ri.ri.ri;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    public static void ri(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ri.ri(context).ri().ri(str, (String) null, contentValues);
        } catch (Throwable unused) {
        }
    }

    public static void ri(Context context, String str, List<com.bytedance.sdk.component.di.ri.ka.ri> list) {
        if (list == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ri.ri(context).ri().ri(str, (String) null, list);
        } catch (Throwable unused) {
        }
    }

    public static int ri(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return ri.ri(context).ri().ri(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int ri(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            try {
                return ri.ri(context).ri().ri(str, contentValues, str2, strArr);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static Cursor ri(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return ri.ri(context).ri().ri(str, strArr, str2, strArr2, null, null, str5);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void ri(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ri.ri(context).ri().ri(Uri.decode(str));
        } catch (Throwable unused) {
        }
    }
}
