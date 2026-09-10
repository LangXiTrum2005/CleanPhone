package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.nJ;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private static String Lxb;

    public static String JXs() {
        return com.bytedance.sdk.openadsdk.core.QAg.LD().lc();
    }

    public static String LD() {
        return "1371";
    }

    public static String Lxb() {
        return "open_news";
    }

    public static String ZU() {
        return nJ.ebl();
    }

    public static String ebl() {
        try {
            if (!TextUtils.isEmpty(Lxb)) {
                return Lxb;
            }
            String strLxb = com.bytedance.sdk.openadsdk.core.QAg.Lxb("sdk_app_sha1", 259200000L);
            Lxb = strLxb;
            if (Lxb(strLxb)) {
                return Lxb;
            }
            String strLxb2 = com.bytedance.sdk.component.utils.lk.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
            Lxb = strLxb2;
            if (!Lxb(strLxb2)) {
                return "";
            }
            String upperCase = Lxb.toUpperCase();
            Lxb = upperCase;
            com.bytedance.sdk.openadsdk.core.QAg.Lxb("sdk_app_sha1", upperCase);
            return Lxb;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String lc() {
        return com.bytedance.sdk.component.utils.IeN.ebl(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
    }

    public static String lk() {
        return BuildConfig.VERSION_NAME;
    }

    public static String Lxb(Context context) {
        return com.bytedance.sdk.openadsdk.core.sLN.Lxb(context);
    }

    private static boolean Lxb(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str) || (strArrSplit = str.split(":")) == null || strArrSplit.length < 20) {
            return false;
        }
        for (String str2 : strArrSplit) {
            if (!"00".equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
