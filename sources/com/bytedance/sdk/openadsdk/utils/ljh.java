package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class ljh {
    public static boolean qdl() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 33) {
            return i2 >= 32 && qdl(RequestConfiguration.MAX_AD_CONTENT_RATING_T, Build.VERSION.CODENAME);
        }
        return true;
    }

    public static boolean qdl(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }
}
