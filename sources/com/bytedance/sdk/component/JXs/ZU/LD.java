package com.bytedance.sdk.component.JXs.ZU;

/* JADX INFO: loaded from: classes2.dex */
public class LD implements QAg {
    private com.bytedance.sdk.component.JXs.lc LD;
    private byte[] Lxb;

    public LD(byte[] bArr, com.bytedance.sdk.component.JXs.lc lcVar) {
        this.Lxb = bArr;
        this.LD = lcVar;
    }

    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public void Lxb(com.bytedance.sdk.component.JXs.lk.lk lkVar) {
        QAg jva;
        int iSLN = lkVar.sLN();
        lkVar.Lxb(this.Lxb.length);
        if (iSLN != 2) {
            if (iSLN != 3) {
                boolean zLD = com.bytedance.sdk.component.JXs.lk.lk.Lxb.LD(this.Lxb);
                jva = (!zLD && com.bytedance.sdk.component.JXs.lk.lk.Lxb.Lxb(this.Lxb)) ? new JXs(this.Lxb, this.LD) : new NXR(this.Lxb, this.LD, zLD);
            } else {
                byte[] bArr = this.Lxb;
                jva = new NXR(bArr, this.LD, com.bytedance.sdk.component.JXs.lk.lk.Lxb.LD(bArr));
            }
        } else if (com.bytedance.sdk.component.JXs.lk.lk.Lxb.Lxb(this.Lxb)) {
            jva = new JXs(this.Lxb, this.LD);
        } else {
            jva = this.LD == null ? new JVA() : new OY(1001, "not image format", null);
        }
        lkVar.Lxb(jva);
    }

    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public String Lxb() {
        return "image_type";
    }
}
