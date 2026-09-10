package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private static volatile ik ri;

    private ik() {
    }

    public static ik ri() {
        if (ri == null) {
            synchronized (ik.class) {
                try {
                    if (ri == null) {
                        ri = new ik();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public String lr(String str, String str2) {
        return com.bytedance.sdk.openadsdk.tan.ka.ri.lr("ttopenadsdk", str, str2);
    }

    public int lr(String str, int i) {
        return com.bytedance.sdk.openadsdk.tan.ka.ri.ri("ttopenadsdk", str, i);
    }

    public Long lr(String str, long j) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.tan.ka.ri.ri("ttopenadsdk", str, j));
    }

    public void ri(String str, String str2) {
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("ttopenadsdk", str, str2);
    }

    public void ri(String str, int i) {
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("ttopenadsdk", str, Integer.valueOf(i));
    }

    public void ri(String str, long j) {
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("ttopenadsdk", str, Long.valueOf(j));
    }

    public void ri(String str) {
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("ttopenadsdk", str);
    }
}
