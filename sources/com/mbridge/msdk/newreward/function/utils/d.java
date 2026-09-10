package com.mbridge.msdk.newreward.function.utils;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.t0;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return SameMD5.getMD5(t0.d());
        }
        try {
            String[] strArrSplit = str.split("_");
            String str2 = (strArrSplit == null || strArrSplit.length < 3) ? "" : strArrSplit[2];
            return TextUtils.isEmpty(str2) ? SameMD5.getMD5(t0.d()) : str2;
        } catch (Exception unused) {
            return SameMD5.getMD5(t0.d());
        }
    }
}
