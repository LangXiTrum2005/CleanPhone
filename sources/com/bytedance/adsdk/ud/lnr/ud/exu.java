package com.bytedance.adsdk.ud.lnr.ud;

/* JADX INFO: loaded from: classes.dex */
public class exu implements lnr {
    private final String qdl;
    private final com.bytedance.adsdk.ud.lnr.qdl.exu<Float, Float> ud;

    public exu(String str, com.bytedance.adsdk.ud.lnr.qdl.exu<Float, Float> exuVar) {
        this.qdl = str;
        this.ud = exuVar;
    }

    public String qdl() {
        return this.qdl;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.exu<Float, Float> ud() {
        return this.ud;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.yt(tvpVar, qdlVar, this);
    }
}
