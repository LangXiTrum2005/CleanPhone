package com.bytedance.sdk.openadsdk.mml.qdl;

/* JADX INFO: loaded from: classes3.dex */
class mml implements com.bytedance.sdk.component.mo.qdl.mzz.lnr {
    private final com.bytedance.sdk.component.wd.ud.ud qdl;

    public mml() {
        com.bytedance.sdk.component.wd.ud.ud udVarLnr = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().lnr();
        this.qdl = udVarLnr;
        udVarLnr.qdl(7);
        udVarLnr.qdl("track_url");
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz.lnr
    public void qdl(String str) {
        this.qdl.ud(str);
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz.lnr
    public void qdl(String str, String str2) {
        this.qdl.ud(str, str2);
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz.lnr
    public com.bytedance.sdk.component.mo.qdl.mzz.mml qdl() {
        return new mo(this.qdl.qdl());
    }
}
