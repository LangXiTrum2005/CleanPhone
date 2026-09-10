package com.bytedance.sdk.openadsdk.ZU.Lxb;

/* JADX INFO: loaded from: classes2.dex */
class ebl implements com.bytedance.sdk.component.lc.Lxb.JXs.lk {
    private final com.bytedance.sdk.component.ebl.LD.LD Lxb;

    public ebl() {
        com.bytedance.sdk.component.ebl.LD.LD ldLk = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().lk();
        this.Lxb = ldLk;
        ldLk.Lxb(7);
        ldLk.Lxb("track_url");
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs.lk
    public void Lxb(String str) {
        this.Lxb.LD(str);
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs.lk
    public void Lxb(String str, String str2) {
        this.Lxb.LD(str, str2);
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs.lk
    public com.bytedance.sdk.component.lc.Lxb.JXs.ZU Lxb() {
        return new QAg(this.Lxb.Lxb());
    }
}
