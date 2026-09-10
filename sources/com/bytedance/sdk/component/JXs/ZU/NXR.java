package com.bytedance.sdk.component.JXs.ZU;

import com.bytedance.sdk.component.JXs.VVE;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class NXR<T> extends Lxb {
    private com.bytedance.sdk.component.JXs.lc LD;
    private T Lxb;
    private boolean lk;

    public NXR(T t, com.bytedance.sdk.component.JXs.lc lcVar, boolean z) {
        this.Lxb = t;
        this.LD = lcVar;
        this.lk = z;
    }

    private Map<String, String> LD() {
        com.bytedance.sdk.component.JXs.lc lcVar = this.LD;
        if (lcVar != null) {
            return lcVar.JXs();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public void Lxb(com.bytedance.sdk.component.JXs.lk.lk lkVar) {
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

    private void LD(com.bytedance.sdk.component.JXs.lk.lk lkVar) {
        VVE vveQAg = lkVar.QAg();
        if (vveQAg != null) {
            vveQAg.Lxb(new com.bytedance.sdk.component.JXs.lk.ZU().Lxb(lkVar, this.Lxb, LD(), this.lk));
        }
    }

    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public String Lxb() {
        return "success";
    }
}
