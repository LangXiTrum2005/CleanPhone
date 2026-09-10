package com.bytedance.sdk.openadsdk.core.rq.ud.mzz;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class qdl extends com.bytedance.adsdk.ugeno.tvp.ud.qdl {
    private final com.bytedance.adsdk.ugeno.tvp.ud.qdl qdl;
    private final com.bytedance.adsdk.ugeno.tvp.ud.qdl ud;

    public qdl(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.tvp.ud.qdl qdlVar = new com.bytedance.adsdk.ugeno.tvp.ud.qdl(context);
        this.qdl = qdlVar;
        addView(qdlVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.tvp.ud.qdl qdlVar2 = new com.bytedance.adsdk.ugeno.tvp.ud.qdl(context);
        this.ud = qdlVar2;
        qdlVar2.setBackgroundColor(0);
        addView(qdlVar2, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.tvp.ud.qdl getMarkView() {
        return this.ud;
    }

    public com.bytedance.adsdk.ugeno.tvp.ud.qdl getVideoView() {
        return this.qdl;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.ud.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.ud.setOnTouchListener(onTouchListener);
    }
}
