package com.bytedance.sdk.component.mzz.mzz;

/* JADX INFO: loaded from: classes.dex */
public class mml extends qdl {
    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public void qdl(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        com.bytedance.sdk.component.mzz.ud udVarExc = lnrVar.exc();
        if (udVarExc != null) {
            if (udVarExc.mzz()) {
                lnrVar.qdl(new to());
                return;
            } else if (udVarExc.wd()) {
                lnrVar.qdl(new mo());
                return;
            }
        }
        lnrVar.qdl(new rq());
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public String qdl() {
        return "cache_policy";
    }
}
