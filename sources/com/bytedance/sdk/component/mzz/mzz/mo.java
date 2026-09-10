package com.bytedance.sdk.component.mzz.mzz;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class mo extends qdl {
    private byte[] ud(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar, String str) {
        com.bytedance.sdk.component.mzz.lnr lnrVarLnr = lnrVar.jl().lnr(lnrVar.exc());
        if (lnrVarLnr == null) {
            return null;
        }
        return lnrVarLnr.qdl(str);
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public void qdl(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        String strTvp = lnrVar.tvp();
        byte[] bArrQdl = (lnrVar.aaj() || lnrVar.exc().tvp()) ? qdl(lnrVar, strTvp) : ud(lnrVar, strTvp);
        if (bArrQdl == null) {
            lnrVar.qdl(new rq());
        } else {
            lnrVar.qdl(new ud(bArrQdl, null));
            lnrVar.jl().ud(lnrVar.exc()).qdl(strTvp, bArrQdl);
        }
    }

    private byte[] qdl(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar, String str) {
        lnrVar.jl().lnr(lnrVar.exc());
        Collection<com.bytedance.sdk.component.mzz.lnr> collectionLnr = lnrVar.jl().lnr();
        if (collectionLnr == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.mzz.lnr> it = collectionLnr.iterator();
        while (it.hasNext()) {
            byte[] bArrQdl = it.next().qdl(str);
            if (bArrQdl != null) {
                return bArrQdl;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public String qdl() {
        return "disk_cache";
    }
}
