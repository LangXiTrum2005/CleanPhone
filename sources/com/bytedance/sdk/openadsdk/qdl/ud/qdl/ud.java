package com.bytedance.sdk.openadsdk.qdl.ud.qdl;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp.aaj;
import com.bytedance.sdk.openadsdk.core.tvp.exc;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends lnr {
    public ud(Context context, ljh ljhVar, AdSlot adSlot) {
        super(context, ljhVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.ud.qdl.lnr
    public void qdl() {
        exc excVar = new exc(((lnr) this).jpc, this.ud, ((lnr) this).tvp, this.rq, false);
        this.to = excVar;
        this.qdl.qdl(excVar.getVideoController());
        lnr();
    }

    public com.bytedance.sdk.openadsdk.multipro.ud.qdl ud() {
        aaj aajVar = this.to;
        if (aajVar != null) {
            return ((exc) aajVar).getVideoModel();
        }
        return null;
    }
}
