package com.bytedance.sdk.openadsdk.utils;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private static Boolean ik;
    private static Boolean lr;
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.wjv> ri;

    public static com.bytedance.sdk.openadsdk.core.model.wjv ik() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.wjv> softReference = ri;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static boolean lr() {
        try {
            if (ik == null) {
                boolean z = true;
                if (com.bytedance.sdk.openadsdk.wjv.fi.ri("iv_rv_load_show_new", 0) != 1) {
                    z = false;
                }
                ik = Boolean.valueOf(z);
            }
            return ik.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean ri() {
        try {
            if (lr == null) {
                boolean z = true;
                if (com.bytedance.sdk.openadsdk.wjv.fi.ri("net_opt_multiple_domain_retry", 0) != 1) {
                    z = false;
                }
                lr = Boolean.valueOf(z);
            }
            return lr.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar == null) {
            return;
        }
        ri = new SoftReference<>(wjvVar);
    }
}
