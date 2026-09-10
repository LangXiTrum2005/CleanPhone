package com.bytedance.sdk.openadsdk.component.reward.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class mj extends com.bytedance.sdk.openadsdk.core.di.ik {
    private final com.bytedance.sdk.openadsdk.component.reward.ri.ri ri;

    public mj(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        super(riVar.srn);
        this.ri = riVar;
        if (riVar.ajz != null || Build.VERSION.SDK_INT < 35) {
            return;
        }
        setFitsSystemWindows(true);
    }

    public void ri(com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar) {
        RFEndCardBackUpLayout rFEndCardBackUpLayoutXha;
        lrVar.ri(this);
        if (this.ri.ri != 1 && (rFEndCardBackUpLayoutXha = lrVar.xha()) != null) {
            addView(rFEndCardBackUpLayoutXha, new FrameLayout.LayoutParams(-1, -1));
        }
        ri(lrVar.mj(), this);
        ri(lrVar.jbs(), this);
    }

    private void ri(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
