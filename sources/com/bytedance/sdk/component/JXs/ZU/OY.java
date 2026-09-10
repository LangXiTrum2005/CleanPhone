package com.bytedance.sdk.component.JXs.ZU;

import com.bytedance.sdk.component.JXs.VVE;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class OY extends Lxb {
    private int LD;
    private Throwable Lxb;
    private String lk;

    public OY(int i, String str, Throwable th) {
        this.LD = i;
        this.lk = str;
        this.Lxb = th;
    }

    private void LD(com.bytedance.sdk.component.JXs.lk.lk lkVar) {
        VVE vveQAg = lkVar.QAg();
        if (vveQAg != null) {
            vveQAg.Lxb(this.LD, this.lk, this.Lxb);
        }
    }

    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public void Lxb(com.bytedance.sdk.component.JXs.lk.lk lkVar) {
        lkVar.Lxb(new com.bytedance.sdk.component.JXs.lk.Lxb(this.LD, this.lk, this.Lxb));
        String strEK = lkVar.eK();
        Map<String, List<com.bytedance.sdk.component.JXs.lk.lk>> mapEbl = lkVar.tD().ebl();
        List<com.bytedance.sdk.component.JXs.lk.lk> list = mapEbl.get(strEK);
        if (list == null) {
            LD(lkVar);
            return;
        }
        synchronized (list) {
            try {
                Iterator<com.bytedance.sdk.component.JXs.lk.lk> it = list.iterator();
                while (it.hasNext()) {
                    LD(it.next());
                }
                list.clear();
                mapEbl.remove(strEK);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public String Lxb() {
        return "failed";
    }
}
