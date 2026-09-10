package com.bytedance.sdk.openadsdk.ZU.Lxb;

/* JADX INFO: loaded from: classes2.dex */
class QAg implements com.bytedance.sdk.component.lc.Lxb.JXs.ZU {
    private final com.bytedance.sdk.component.ebl.LD Lxb;

    public QAg(com.bytedance.sdk.component.ebl.LD ld) {
        this.Lxb = ld;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs.ZU
    public int LD() {
        com.bytedance.sdk.component.ebl.LD ld = this.Lxb;
        if (ld != null) {
            return ld.Lxb();
        }
        return -1;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs.ZU
    public boolean Lxb() {
        com.bytedance.sdk.component.ebl.LD ld = this.Lxb;
        if (ld != null) {
            return ld.lc();
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs.ZU
    public String lk() {
        com.bytedance.sdk.component.ebl.LD ld = this.Lxb;
        return ld != null ? ld.LD() : "";
    }
}
