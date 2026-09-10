package com.bytedance.sdk.component.JXs.ZU;

/* JADX INFO: loaded from: classes2.dex */
public class JVA extends Lxb {
    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public void Lxb(final com.bytedance.sdk.component.JXs.lk.lk lkVar) {
        final com.bytedance.sdk.component.JXs.lk.lc lcVarTD = lkVar.tD();
        com.bytedance.sdk.component.JXs.ZU ZU = lcVarTD.ZU();
        lkVar.Lxb(false);
        try {
            com.bytedance.sdk.component.JXs.lc lcVarLxb = ZU.Lxb(new com.bytedance.sdk.component.JXs.LD.lk(lkVar.Lxb(), lkVar.NXR(), lkVar.STP(), lkVar.HD()));
            int iLD = lcVarLxb.LD();
            lkVar.Lxb(lcVarLxb.Lxb());
            if (lcVarLxb.LD() != 200) {
                lcVarTD.OY();
                String.valueOf(lcVarLxb);
                Object objLk = lcVarLxb.lk();
                Lxb(iLD, lcVarLxb.ZU(), objLk instanceof Throwable ? (Throwable) objLk : null, lkVar);
                return;
            }
            final byte[] bArr = (byte[]) lcVarLxb.lk();
            lkVar.Lxb(new LD(bArr, lcVarLxb));
            final String strNBu = lkVar.nBu();
            final com.bytedance.sdk.component.JXs.LD ldDY = lkVar.DY();
            if (ldDY.lk()) {
                lcVarTD.LD(lkVar.DY()).Lxb(strNBu, bArr);
            }
            lcVarTD.lc().submit(new Runnable() { // from class: com.bytedance.sdk.component.JXs.ZU.JVA.1
                @Override // java.lang.Runnable
                public void run() {
                    if (ldDY.ZU()) {
                        lcVarTD.lk(lkVar.DY()).Lxb(strNBu, bArr);
                    }
                }
            });
        } catch (Throwable th) {
            Lxb(1004, "net request failed!", th, lkVar);
        }
    }

    private void Lxb(int i, String str, Throwable th, com.bytedance.sdk.component.JXs.lk.lk lkVar) {
        lkVar.Lxb(new OY(i, str, th));
    }

    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public String Lxb() {
        return "net_request";
    }
}
