package com.bytedance.sdk.component.mzz.mzz;

import com.bytedance.sdk.component.mzz.jtx;
import com.p004ironsource.d9;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class jpc extends qdl {
    private String lnr;
    private Throwable qdl;
    private int ud;

    public jpc(int i2, String str, Throwable th) {
        this.ud = i2;
        this.lnr = str;
        this.qdl = th;
    }

    private void ud(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        jtx jtxVarJpc = lnrVar.jpc();
        if (jtxVarJpc != null) {
            jtxVarJpc.qdl(this.ud, this.lnr, this.qdl);
        }
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public void qdl(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        lnrVar.qdl(new com.bytedance.sdk.component.mzz.lnr.qdl(this.ud, this.lnr, this.qdl));
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

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public String qdl() {
        return d9.h.t;
    }
}
