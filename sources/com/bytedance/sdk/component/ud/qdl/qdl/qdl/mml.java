package com.bytedance.sdk.component.ud.qdl.qdl.qdl;

import android.text.TextUtils;
import com.bytedance.sdk.component.ud.qdl.fs;
import com.bytedance.sdk.component.ud.qdl.rq;

/* JADX INFO: loaded from: classes.dex */
public class mml extends rq {
    public mo jpc;
    public qdl tvp;

    public mml(rq.qdl qdlVar) {
        super(qdlVar);
        mo moVar = new mo();
        this.jpc = moVar;
        this.tvp = new qdl(moVar.ud());
    }

    @Override // com.bytedance.sdk.component.ud.qdl.rq
    public com.bytedance.sdk.component.ud.qdl.mml qdl() {
        return this.jpc;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.rq
    public com.bytedance.sdk.component.ud.qdl.ud qdl(fs fsVar) {
        fsVar.qdl(this);
        if (fsVar.ud() == null || fsVar.ud().qdl() == null || TextUtils.isEmpty(fsVar.ud().qdl().toString())) {
            return null;
        }
        if (qdl.qdl == null || !qdl.qdl.ud() || !this.tvp.mzz() || "setting".equals(fsVar.mo())) {
            ud udVar = new ud(fsVar, this.jpc);
            this.jpc.lnr().add(udVar);
            return udVar;
        }
        ud udVar2 = new ud(fsVar, this.tvp);
        this.tvp.lnr().add(udVar2);
        return udVar2;
    }
}
