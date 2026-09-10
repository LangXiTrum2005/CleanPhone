package com.bytedance.sdk.openadsdk.utils;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.ljh> qdl;
    private static Boolean ud;

    public static boolean qdl() {
        try {
            if (ud == null) {
                boolean z2 = true;
                if (com.bytedance.sdk.openadsdk.jyq.qdl.qdl("enable_get_ad_new", 0) != 1) {
                    z2 = false;
                }
                ud = Boolean.valueOf(z2);
            }
            return ud.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static com.bytedance.sdk.openadsdk.core.model.ljh ud() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.ljh> softReference = qdl;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (ljhVar == null) {
            return;
        }
        qdl = new SoftReference<>(ljhVar);
    }
}
