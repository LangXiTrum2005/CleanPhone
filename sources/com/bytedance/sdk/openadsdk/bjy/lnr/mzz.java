package com.bytedance.sdk.openadsdk.bjy.lnr;

/* JADX INFO: loaded from: classes3.dex */
class mzz implements lnr {
    private static volatile mzz qdl;

    private mzz() {
    }

    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.lnr
    public void qdl(com.bytedance.sdk.openadsdk.bjy.ud udVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.lnr
    public void qdl(com.bytedance.sdk.openadsdk.bjy.ud udVar, boolean z2) {
    }

    public static mzz qdl() {
        if (qdl == null) {
            synchronized (mzz.class) {
                try {
                    if (qdl == null) {
                        qdl = new mzz();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }
}
