package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.ig;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private static String ri;

    public static String di() {
        return com.bytedance.sdk.component.utils.nr.xha(com.bytedance.sdk.openadsdk.core.nr.ri());
    }

    public static String fi() {
        return com.bytedance.sdk.openadsdk.core.qt.lr().mj();
    }

    public static String ik() {
        return BuildConfig.VERSION_NAME;
    }

    public static String ka() {
        return ig.mj();
    }

    public static String lr() {
        return "1371";
    }

    public static String ri() {
        return "open_news";
    }

    public static String xha() {
        try {
            if (!TextUtils.isEmpty(ri)) {
                return ri;
            }
            String strRi = com.bytedance.sdk.openadsdk.core.qt.ri("sdk_app_sha1", 259200000L);
            ri = strRi;
            if (ri(strRi)) {
                return ri;
            }
            String strRi2 = com.bytedance.sdk.component.utils.ik.ri(com.bytedance.sdk.openadsdk.core.nr.ri());
            ri = strRi2;
            if (!ri(strRi2)) {
                return "";
            }
            String upperCase = ri.toUpperCase();
            ri = upperCase;
            com.bytedance.sdk.openadsdk.core.qt.ri("sdk_app_sha1", upperCase);
            return ri;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String ri(Context context) {
        return com.bytedance.sdk.openadsdk.core.aw.ri(context);
    }

    private static boolean ri(String str) {
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
