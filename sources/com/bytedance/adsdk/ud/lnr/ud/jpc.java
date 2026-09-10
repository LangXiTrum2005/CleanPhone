package com.bytedance.adsdk.ud.lnr.ud;

/* JADX INFO: loaded from: classes.dex */
public class jpc {
    private final com.bytedance.adsdk.ud.lnr.qdl.mml lnr;
    private final boolean mml;
    private final qdl qdl;
    private final com.bytedance.adsdk.ud.lnr.qdl.jpc ud;

    public enum qdl {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public jpc(qdl qdlVar, com.bytedance.adsdk.ud.lnr.qdl.jpc jpcVar, com.bytedance.adsdk.ud.lnr.qdl.mml mmlVar, boolean z2) {
        this.qdl = qdlVar;
        this.ud = jpcVar;
        this.lnr = mmlVar;
        this.mml = z2;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mml lnr() {
        return this.lnr;
    }

    public boolean mml() {
        return this.mml;
    }

    public qdl qdl() {
        return this.qdl;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.jpc ud() {
        return this.ud;
    }
}
