package com.bytedance.sdk.component.mzz.mzz;

import com.bytedance.sdk.component.mzz.jtx;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class exu<T> extends qdl {
    private boolean lnr;
    private T qdl;
    private com.bytedance.sdk.component.mzz.mo ud;

    public exu(T t, com.bytedance.sdk.component.mzz.mo moVar, boolean z2) {
        this.qdl = t;
        this.ud = moVar;
        this.lnr = z2;
    }

    private Map<String, String> ud() {
        com.bytedance.sdk.component.mzz.mo moVar = this.ud;
        if (moVar != null) {
            return moVar.mzz();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public void qdl(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        String strOth = lnrVar.oth();
        Map<String, List<com.bytedance.sdk.component.mzz.lnr.lnr>> mapJpc = lnrVar.jl().jpc();
        List<com.bytedance.sdk.component.mzz.lnr.lnr> list = mapJpc.get(strOth);
        if (list == null) {
            ud(lnrVar);
            return;
        }
        synchronized (list) {
            try {
                Iterator<com.bytedance.sdk.component.mzz.lnr.lnr> it = list.iterator();
                while (it.hasNext()) {
                    ud(it.next());
                }
                list.clear();
                mapJpc.remove(strOth);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void ud(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        jtx jtxVarJpc = lnrVar.jpc();
        if (jtxVarJpc != null) {
            jtxVarJpc.qdl(new com.bytedance.sdk.component.mzz.lnr.mml().qdl(lnrVar, this.qdl, ud(), this.lnr));
        }
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public String qdl() {
        return "success";
    }
}
