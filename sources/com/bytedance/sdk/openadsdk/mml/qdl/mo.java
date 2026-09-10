package com.bytedance.sdk.openadsdk.mml.qdl;

/* JADX INFO: loaded from: classes3.dex */
class mo implements com.bytedance.sdk.component.mo.qdl.mzz.mml {
    private final com.bytedance.sdk.component.wd.ud qdl;

    public mo(com.bytedance.sdk.component.wd.ud udVar) {
        this.qdl = udVar;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz.mml
    public String lnr() {
        com.bytedance.sdk.component.wd.ud udVar = this.qdl;
        return udVar != null ? udVar.ud() : "";
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz.mml
    public boolean qdl() {
        com.bytedance.sdk.component.wd.ud udVar = this.qdl;
        if (udVar != null) {
            return udVar.mo();
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz.mml
    public int ud() {
        com.bytedance.sdk.component.wd.ud udVar = this.qdl;
        if (udVar != null) {
            return udVar.qdl();
        }
        return -1;
    }
}
