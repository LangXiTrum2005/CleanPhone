package com.bytedance.sdk.openadsdk.core.JVA.LD.Lxb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends com.bytedance.adsdk.ugeno.QAg.LD.Lxb {
    private final com.bytedance.adsdk.ugeno.QAg.LD.Lxb LD;
    private final com.bytedance.adsdk.ugeno.QAg.LD.Lxb Lxb;

    public Lxb(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.QAg.LD.Lxb lxb = new com.bytedance.adsdk.ugeno.QAg.LD.Lxb(context);
        this.Lxb = lxb;
        addView(lxb, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.QAg.LD.Lxb lxb2 = new com.bytedance.adsdk.ugeno.QAg.LD.Lxb(context);
        this.LD = lxb2;
        lxb2.setBackgroundColor(0);
        addView(lxb2, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.QAg.LD.Lxb getVideoView() {
        return this.Lxb;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.LD.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.LD.setOnTouchListener(onTouchListener);
    }
}
