package com.bytedance.sdk.openadsdk.core.co.lr.ik;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends com.bytedance.adsdk.ugeno.lr.ri<com.bytedance.adsdk.ugeno.jbs.lr.ri> {
    public lr(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.jbs.lr.ri ri() {
        ri riVar = new ri(this.lr);
        riVar.ri(this);
        return riVar;
    }

    public com.bytedance.adsdk.ugeno.jbs.lr.ri ka() {
        return ((ri) this.fi).getPlayableView();
    }
}
