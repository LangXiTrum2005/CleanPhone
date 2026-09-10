package com.bytedance.sdk.openadsdk.core.co.lr.di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends com.bytedance.adsdk.ugeno.jbs.lr.ri {
    private final com.bytedance.adsdk.ugeno.jbs.lr.ri lr;
    private final com.bytedance.adsdk.ugeno.jbs.lr.ri ri;

    public ri(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.jbs.lr.ri riVar = new com.bytedance.adsdk.ugeno.jbs.lr.ri(context);
        this.ri = riVar;
        addView(riVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.jbs.lr.ri riVar2 = new com.bytedance.adsdk.ugeno.jbs.lr.ri(context);
        this.lr = riVar2;
        riVar2.setBackgroundColor(0);
        addView(riVar2, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.jbs.lr.ri getMarkView() {
        return this.lr;
    }

    public com.bytedance.adsdk.ugeno.jbs.lr.ri getVideoView() {
        return this.ri;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.lr.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.lr.setOnTouchListener(onTouchListener);
    }
}
