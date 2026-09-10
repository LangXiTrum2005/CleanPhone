package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class xmv {
    private static volatile String qdl;

    public static String qdl() {
        if (!TextUtils.isEmpty(qdl)) {
            return qdl;
        }
        String str = Build.MODEL;
        qdl = str;
        return str;
    }
}
