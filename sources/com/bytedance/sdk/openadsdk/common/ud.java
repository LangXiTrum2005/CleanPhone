package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.gy;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    private static String qdl;

    public static String lnr() {
        return BuildConfig.VERSION_NAME;
    }

    public static String mml() {
        return gy.jpc();
    }

    public static String mo() {
        return com.bytedance.sdk.component.utils.jl.wd(com.bytedance.sdk.openadsdk.core.yt.qdl());
    }

    public static String mzz() {
        return com.bytedance.sdk.openadsdk.core.tvp.ud().jpc();
    }

    public static String qdl() {
        return "open_news";
    }

    public static String ud() {
        return "1371";
    }

    public static String wd() {
        try {
            if (!TextUtils.isEmpty(qdl)) {
                return qdl;
            }
            String strQdl = com.bytedance.sdk.openadsdk.core.tvp.qdl("sdk_app_sha1", 259200000L);
            qdl = strQdl;
            if (qdl(strQdl)) {
                return qdl;
            }
            String strQdl2 = com.bytedance.sdk.component.utils.lnr.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl());
            qdl = strQdl2;
            if (!qdl(strQdl2)) {
                return "";
            }
            String upperCase = qdl.toUpperCase();
            qdl = upperCase;
            com.bytedance.sdk.openadsdk.core.tvp.qdl("sdk_app_sha1", upperCase);
            return qdl;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String qdl(Context context) {
        return com.bytedance.sdk.openadsdk.core.fs.qdl(context);
    }

    private static boolean qdl(String str) {
        String[] strArrSplit;
        if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(":")) != null && strArrSplit.length >= 20) {
            for (String str2 : strArrSplit) {
                if (!"00".equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
