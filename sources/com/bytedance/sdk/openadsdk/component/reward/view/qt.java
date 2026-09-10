package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: loaded from: classes2.dex */
public class qt extends sf {
    public qt(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        super(riVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.sf
    public boolean ri() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.sf
    public void ri(int i, int i2) {
        super.ri(i, i2);
        if (wjv.fi(this.ka) && this.ka.hws() == 3 && this.ka.jxw() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.ik.pv.findViewById(slm.f18175co);
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.ka.bbu() == 1) {
                    int iLr = qd.lr(nr.ri(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = iLr;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
