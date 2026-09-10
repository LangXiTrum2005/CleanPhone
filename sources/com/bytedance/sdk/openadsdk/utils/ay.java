package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class ay {
    public static boolean ri() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            return i >= 32 && ri(RequestConfiguration.MAX_AD_CONTENT_RATING_T, Build.VERSION.CODENAME);
        }
        return true;
    }

    public static boolean ri(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }
}
