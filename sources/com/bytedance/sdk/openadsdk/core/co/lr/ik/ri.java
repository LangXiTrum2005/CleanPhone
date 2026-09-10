package com.bytedance.sdk.openadsdk.core.co.lr.ik;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends com.bytedance.adsdk.ugeno.jbs.lr.ri {
    private final com.bytedance.adsdk.ugeno.jbs.lr.ri ri;

    public ri(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.jbs.lr.ri riVar = new com.bytedance.adsdk.ugeno.jbs.lr.ri(context);
        this.ri = riVar;
        addView(riVar, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.jbs.lr.ri getPlayableView() {
        return this.ri;
    }
}
