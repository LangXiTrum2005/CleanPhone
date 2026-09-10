package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public class xan {
    private static String Lxb;

    public static String LD() {
        if (TextUtils.isEmpty(Lxb)) {
            Lxb = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return Lxb;
    }

    public static boolean Lxb() {
        return com.bytedance.sdk.component.utils.sLN.ZU() && com.bytedance.sdk.openadsdk.core.QAg.LD().kqm() && com.bytedance.sdk.openadsdk.core.QAg.LD().brP();
    }

    public static boolean lk() {
        return false;
    }

    public static String Lxb(String str) {
        try {
            if (!Lxb()) {
                return str;
            }
            String strTD = com.bytedance.sdk.openadsdk.core.QAg.LD().tD();
            if (TextUtils.isEmpty(strTD)) {
                return str;
            }
            "AnyDoorId=".concat(String.valueOf(strTD));
            return Uri.parse(str).buildUpon().appendQueryParameter(LD(), strTD).appendQueryParameter("aid", "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
