package com.bytedance.sdk.component.mzz.mml.ud;

import android.text.TextUtils;
import com.bytedance.sdk.component.mzz.exc;
import com.bytedance.sdk.component.utils.jtx;

/* JADX INFO: loaded from: classes.dex */
public class ud implements mo {
    @Override // com.bytedance.sdk.component.mzz.mml.ud.mo
    public boolean qdl(com.bytedance.sdk.component.mzz.mml.lnr.lnr lnrVar, exc excVar, com.bytedance.sdk.component.mzz.mml.lnr.qdl qdlVar) {
        if (TextUtils.isEmpty(lnrVar.to())) {
            String strQdl = qdl(lnrVar);
            lnrVar.ud(strQdl);
            lnrVar.qdl(strQdl);
        }
        lnrVar.qdl();
        return true;
    }

    @Override // com.bytedance.sdk.component.mzz.mml.ud.mo
    public String qdl() {
        return "generate_key";
    }

    private String qdl(com.bytedance.sdk.component.mzz.mml.lnr.lnr lnrVar) {
        return jtx.qdl(lnrVar.qdl());
    }
}
