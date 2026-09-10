package com.bytedance.sdk.openadsdk.component.jpc;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy;
import com.bytedance.sdk.openadsdk.mml.wd;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends com.bytedance.sdk.openadsdk.core.exu.mml.qdl {
    public ud(Context context, ViewGroup viewGroup, ljh ljhVar) {
        super(context, viewGroup, ljhVar, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.qdl
    public void jtx() {
        bjy.qdl qdlVar = new bjy.qdl();
        qdlVar.ud(mo());
        qdlVar.mml(tvp());
        qdlVar.lnr(wd());
        qdlVar.mml(jpc());
        com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.mzz(this.wd, qdlVar);
    }

    public void qdl(bjy.qdl qdlVar) {
        com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(this.wd, qdlVar, (wd) null);
    }
}
