package com.bytedance.sdk.component.mzz.mzz;

/* JADX INFO: loaded from: classes.dex */
public class fs extends qdl {
    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public void qdl(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        byte[] bArrQdl = lnrVar.jl().ud(lnrVar.exc()).qdl(lnrVar.tvp());
        if (bArrQdl == null) {
            lnrVar.qdl(new mo());
        } else {
            lnrVar.qdl(new ud(bArrQdl, null));
        }
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public String qdl() {
        return "raw_cache";
    }
}
