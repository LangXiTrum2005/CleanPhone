package com.bytedance.sdk.openadsdk.core;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private static volatile lk Lxb;

    private lk() {
    }

    public static lk Lxb(Context context) {
        if (Lxb == null) {
            synchronized (lk.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new lk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public String LD(String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD("ttopenadsdk", str, str2);
    }

    public int LD(String str, int i) {
        return com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("ttopenadsdk", str, i);
    }

    public Long LD(String str, long j) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("ttopenadsdk", str, j));
    }

    public void Lxb(String str, String str2) {
        com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("ttopenadsdk", str, str2);
    }

    public void Lxb(String str, int i) {
        com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("ttopenadsdk", str, Integer.valueOf(i));
    }

    public void Lxb(String str, long j) {
        com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("ttopenadsdk", str, Long.valueOf(j));
    }
}
