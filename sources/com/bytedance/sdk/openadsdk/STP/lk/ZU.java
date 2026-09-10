package com.bytedance.sdk.openadsdk.STP.lk;

/* JADX INFO: loaded from: classes2.dex */
class ZU implements LD {
    private static volatile ZU Lxb;

    private ZU() {
    }

    @Override // com.bytedance.sdk.openadsdk.STP.lk.LD
    public void Lxb(com.bytedance.sdk.openadsdk.STP.LD ld) {
    }

    @Override // com.bytedance.sdk.openadsdk.STP.lk.LD
    public void Lxb(com.bytedance.sdk.openadsdk.STP.LD ld, boolean z) {
    }

    public static ZU Lxb() {
        if (Lxb == null) {
            synchronized (ZU.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new ZU();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }
}
