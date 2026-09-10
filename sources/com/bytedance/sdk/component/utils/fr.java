package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class fr {
    private static volatile String ri;

    public static String ri() {
        if (!TextUtils.isEmpty(ri)) {
            return ri;
        }
        String str = Build.MODEL;
        ri = str;
        return str;
    }

    public static int ri(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().icon;
        } catch (Exception unused) {
            return 0;
        }
    }
}
