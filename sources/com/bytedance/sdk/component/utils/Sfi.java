package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class Sfi {
    private static volatile String Lxb;

    public static String Lxb() {
        if (!TextUtils.isEmpty(Lxb)) {
            return Lxb;
        }
        String str = Build.MODEL;
        Lxb = str;
        return str;
    }
}
