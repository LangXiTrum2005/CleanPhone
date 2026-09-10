package com.bytedance.sdk.openadsdk.core.co;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.settings.sf;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    public static String ri(String str) {
        return TextUtils.isEmpty(str) ? str : ri(sf.lr().ac(), str);
    }

    public static String ri(String str, String str2) {
        if (TextUtils.isEmpty(str2) || str2.startsWith("http://") || str2.startsWith("https://")) {
            return str2;
        }
        if (!TextUtils.isEmpty(str) && !str.endsWith("/")) {
            return str + "/static/" + str2;
        }
        return str + "static/" + str2;
    }
}
