package com.bytedance.sdk.openadsdk.core.rq.ud.ud;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class qdl extends com.bytedance.adsdk.ugeno.tvp.ud.qdl {
    private final com.bytedance.adsdk.ugeno.tvp.ud.qdl qdl;

    public qdl(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.tvp.ud.qdl qdlVar = new com.bytedance.adsdk.ugeno.tvp.ud.qdl(context);
        this.qdl = qdlVar;
        addView(qdlVar, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.tvp.ud.qdl getPlayableView() {
        return this.qdl;
    }
}
