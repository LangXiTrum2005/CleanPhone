package com.yoadx.ad.lib.utils;

import android.text.TextUtils;

/* JADX INFO: compiled from: AdmobStringUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {
    public static String attabal(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("~");
        return strArrSplit.length > 0 ? strArrSplit[0] : "";
    }
}
