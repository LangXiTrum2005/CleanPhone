package com.bytedance.sdk.openadsdk.component.reward.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class tvp extends com.bytedance.sdk.openadsdk.core.mo.lnr {
    private final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdl;

    public tvp(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        super(qdlVar.om);
        this.qdl = qdlVar;
        if (qdlVar.lq != null || Build.VERSION.SDK_INT < 35) {
            return;
        }
        setFitsSystemWindows(true);
    }

    public void qdl(com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar) {
        RFEndCardBackUpLayout rFEndCardBackUpLayoutJpc;
        udVar.qdl(this);
        if (this.qdl.qdl != 1 && (rFEndCardBackUpLayoutJpc = udVar.jpc()) != null) {
            addView(rFEndCardBackUpLayoutJpc, new FrameLayout.LayoutParams(-1, -1));
        }
        qdl(udVar.tvp(), this);
        qdl(udVar.to(), this);
    }

    private void qdl(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
