package com.bytedance.sdk.openadsdk.core.rq.ud.ud;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends com.bytedance.adsdk.ugeno.ud.qdl<com.bytedance.adsdk.ugeno.tvp.ud.qdl> {
    public ud(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    /* JADX INFO: renamed from: lnr, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.tvp.ud.qdl qdl() {
        qdl qdlVar = new qdl(this.ud);
        qdlVar.qdl(this);
        return qdlVar;
    }

    public com.bytedance.adsdk.ugeno.tvp.ud.qdl mml() {
        return ((qdl) this.mzz).getPlayableView();
    }
}
