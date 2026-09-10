package com.bytedance.sdk.component.JXs.ZU;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends Lxb {
    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public void Lxb(com.bytedance.sdk.component.JXs.lk.lk lkVar) {
        com.bytedance.sdk.component.JXs.LD ldDY = lkVar.DY();
        if (ldDY != null) {
            if (ldDY.lk()) {
                lkVar.Lxb(new nBu());
                return;
            } else if (ldDY.ZU()) {
                lkVar.Lxb(new lc());
                return;
            }
        }
        lkVar.Lxb(new JVA());
    }

    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public String Lxb() {
        return "cache_policy";
    }
}
