package com.bytedance.sdk.component.JXs.ZU;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class lc extends Lxb {
    private byte[] LD(com.bytedance.sdk.component.JXs.lk.lk lkVar, String str) {
        com.bytedance.sdk.component.JXs.lk lkVarLk = lkVar.tD().lk(lkVar.DY());
        if (lkVarLk == null) {
            return null;
        }
        return lkVarLk.Lxb(str);
    }

    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public void Lxb(com.bytedance.sdk.component.JXs.lk.lk lkVar) {
        String strNBu = lkVar.nBu();
        byte[] bArrLxb = (lkVar.Sfi() || lkVar.DY().lc()) ? Lxb(lkVar, strNBu) : LD(lkVar, strNBu);
        if (bArrLxb == null) {
            lkVar.Lxb(new JVA());
        } else {
            lkVar.Lxb(new LD(bArrLxb, null));
            lkVar.tD().LD(lkVar.DY()).Lxb(strNBu, bArrLxb);
        }
    }

    private byte[] Lxb(com.bytedance.sdk.component.JXs.lk.lk lkVar, String str) {
        lkVar.tD().lk(lkVar.DY());
        Collection<com.bytedance.sdk.component.JXs.lk> collectionLk = lkVar.tD().lk();
        if (collectionLk == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.JXs.lk> it = collectionLk.iterator();
        while (it.hasNext()) {
            byte[] bArrLxb = it.next().Lxb(str);
            if (bArrLxb != null) {
                return bArrLxb;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public String Lxb() {
        return "disk_cache";
    }
}
