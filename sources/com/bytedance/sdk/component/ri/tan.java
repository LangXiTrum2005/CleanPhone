package com.bytedance.sdk.component.ri;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
class tan {
    private static boolean ri;

    public static String ri(Throwable th) {
        StringBuilder sb = new StringBuilder("{\"code\":");
        sb.append(th instanceof slm ? ((slm) th).ri : 0);
        sb.append("}");
        return sb.toString();
    }

    public static String ri(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String strSubstring = (!ri || z) ? "" : str.substring(1, str.length() - 1);
        String strConcat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (strSubstring.isEmpty()) {
            return strConcat + "}";
        }
        return strConcat + "," + strSubstring + "}";
    }

    public static String ri() {
        return "";
    }

    public static void ri(boolean z) {
        ri = z;
    }
}
