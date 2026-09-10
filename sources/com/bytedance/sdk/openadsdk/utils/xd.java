package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.C3724ra;

/* JADX INFO: loaded from: classes2.dex */
public class xd {
    private static String ri;

    public static boolean ik() {
        return false;
    }

    public static String lr() {
        if (TextUtils.isEmpty(ri)) {
            ri = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return ri;
    }

    public static boolean ri() {
        return com.bytedance.sdk.component.utils.vr.ik() && com.bytedance.sdk.openadsdk.core.qt.lr().vr() && com.bytedance.sdk.openadsdk.core.qt.lr().bu();
    }

    public static String ri(String str) {
        try {
            if (!ri()) {
                return str;
            }
            String strNr = com.bytedance.sdk.openadsdk.core.qt.lr().nr();
            if (TextUtils.isEmpty(strNr)) {
                return str;
            }
            "AnyDoorId=".concat(String.valueOf(strNr));
            return Uri.parse(str).buildUpon().appendQueryParameter(lr(), strNr).appendQueryParameter(C3724ra.b, "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
