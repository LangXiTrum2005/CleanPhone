package com.bytedance.adsdk.qdl.ud.ud.qdl;

/* JADX INFO: loaded from: classes.dex */
public abstract class yt implements com.bytedance.adsdk.qdl.ud.ud.qdl {
    protected com.bytedance.adsdk.qdl.ud.mml.lnr lnr;
    protected com.bytedance.adsdk.qdl.ud.ud.qdl qdl;
    protected com.bytedance.adsdk.qdl.ud.ud.qdl ud;

    public yt(com.bytedance.adsdk.qdl.ud.mml.lnr lnrVar) {
        this.lnr = lnrVar;
    }

    public void qdl(com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar) {
        this.qdl = qdlVar;
    }

    public String toString() {
        return ud();
    }

    public void ud(com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar) {
        this.ud = qdlVar;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public com.bytedance.adsdk.qdl.ud.mml.mzz qdl() {
        return com.bytedance.adsdk.qdl.ud.mml.mo.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public String ud() {
        return this.qdl.ud() + this.lnr.qdl() + this.ud.ud();
    }
}
