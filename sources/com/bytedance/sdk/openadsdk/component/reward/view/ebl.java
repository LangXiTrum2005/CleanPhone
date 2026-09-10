package com.bytedance.sdk.openadsdk.component.reward.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class ebl extends com.bytedance.sdk.openadsdk.core.JXs.lk {
    private final com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb Lxb;

    public ebl(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        super(lxb.NDz);
        this.Lxb = lxb;
        if (lxb.FGm != null || Build.VERSION.SDK_INT < 35) {
            return;
        }
        setFitsSystemWindows(true);
    }

    public void Lxb(com.bytedance.sdk.openadsdk.component.reward.LD.LD ld) {
        RFEndCardBackUpLayout rFEndCardBackUpLayoutOY;
        ld.Lxb(this);
        if (this.Lxb.Lxb != 1 && (rFEndCardBackUpLayoutOY = ld.OY()) != null) {
            addView(rFEndCardBackUpLayoutOY, new FrameLayout.LayoutParams(-1, -1));
        }
        Lxb(ld.QAg(), this);
        Lxb(ld.nBu(), this);
    }

    private void Lxb(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
