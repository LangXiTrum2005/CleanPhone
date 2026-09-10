package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;

/* JADX INFO: loaded from: classes3.dex */
public class rq extends fs {
    public rq(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        super(qdlVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.fs
    public boolean qdl() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.fs
    public void qdl(int i2, int i3) {
        super.qdl(i2, i3);
        if (ljh.mzz(this.mml) && this.mml.fzn() == 3 && this.mml.gg() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.lnr.ax.findViewById(jtx.to);
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.mml.jb() == 1) {
                    int iUd = ax.ud(yt.qdl(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = iUd;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
