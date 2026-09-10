package com.bytedance.sdk.component.JXs.ZU;

/* JADX INFO: loaded from: classes2.dex */
public class sLN extends Lxb {
    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public void Lxb(com.bytedance.sdk.component.JXs.lk.lk lkVar) {
        byte[] bArrLxb = lkVar.tD().LD(lkVar.DY()).Lxb(lkVar.nBu());
        if (bArrLxb == null) {
            lkVar.Lxb(new lc());
        } else {
            lkVar.Lxb(new LD(bArrLxb, null));
        }
    }

    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public String Lxb() {
        return "raw_cache";
    }
}
