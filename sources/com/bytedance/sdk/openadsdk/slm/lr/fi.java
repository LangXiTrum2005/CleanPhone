package com.bytedance.sdk.openadsdk.slm.lr;

/* JADX INFO: loaded from: classes2.dex */
class fi implements ik {
    private static volatile fi ri;

    private fi() {
    }

    @Override // com.bytedance.sdk.openadsdk.slm.lr.ik
    public void ri(com.bytedance.sdk.openadsdk.slm.lr lrVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.slm.lr.ik
    public void ri(com.bytedance.sdk.openadsdk.slm.lr lrVar, boolean z) {
    }

    public static fi ri() {
        if (ri == null) {
            synchronized (fi.class) {
                try {
                    if (ri == null) {
                        ri = new fi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }
}
