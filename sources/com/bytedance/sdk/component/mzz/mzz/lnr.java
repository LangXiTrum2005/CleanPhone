package com.bytedance.sdk.component.mzz.mzz;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class lnr extends qdl {
    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public void qdl(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        if (TextUtils.isEmpty(lnrVar.to())) {
            com.bytedance.sdk.component.mzz.fs fsVarMo = lnrVar.jl().mo();
            lnrVar.ud(fsVarMo.qdl(lnrVar));
            lnrVar.qdl(fsVarMo.ud(lnrVar));
        }
        lnrVar.qdl(new wd());
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public String qdl() {
        return "generate_key";
    }
}
