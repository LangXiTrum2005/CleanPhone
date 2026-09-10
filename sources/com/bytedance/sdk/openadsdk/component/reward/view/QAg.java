package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.STP;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class QAg extends nBu {
    public QAg(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        super(lxb);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.nBu
    public boolean Lxb() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.nBu
    public void Lxb(int i, int i2) {
        super.Lxb(i, i2);
        if (tD.JXs(this.ZU) && this.ZU.Ivz() == 3 && this.ZU.nE() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.lk.rW.findViewById(STP.nBu);
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.ZU.wCT() == 1) {
                    int iLk = le.lk(kqm.Lxb(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = iLk;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
