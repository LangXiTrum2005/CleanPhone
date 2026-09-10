package com.bytedance.sdk.openadsdk.utils;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.tD> Lxb;

    public static com.bytedance.sdk.openadsdk.core.model.tD Lxb() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.tD> softReference = Lxb;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (tDVar == null) {
            return;
        }
        Lxb = new SoftReference<>(tDVar);
    }
}
