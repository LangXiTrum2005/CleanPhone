package com.bytedance.sdk.component.qdl;

import android.support.v4.media.a;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
class exc {
    private static boolean qdl;

    public static String qdl(Throwable th) {
        return a.i(th instanceof jtx ? ((jtx) th).qdl : 0, "}", new StringBuilder("{\"code\":"));
    }

    public static String qdl(String str, boolean z2) {
        String strF;
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        if (qdl && !z2) {
            strF = a.f(1, 1, str);
        } else {
            strF = "";
        }
        String strConcat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (!strF.isEmpty()) {
            return androidx.media3.extractor.text.ttml.a.n(strConcat, ",", strF, "}");
        }
        return a.m(strConcat, "}");
    }

    public static String qdl() {
        return "";
    }

    public static void qdl(boolean z2) {
        qdl = z2;
    }
}
