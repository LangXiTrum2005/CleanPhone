package com.bytedance.sdk.openadsdk.component.QAg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.VVE;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends lk {
    Lxb NXR;

    public interface Lxb {
        void Lxb(View view, int i);
    }

    public JXs(Context context, tD tDVar) {
        super(context);
        Lxb(context, tDVar);
    }

    private void Lxb(Context context, tD tDVar) {
        com.bytedance.sdk.openadsdk.core.OY.JXs jXs = new com.bytedance.sdk.openadsdk.core.OY.JXs(context);
        com.bytedance.sdk.openadsdk.core.OY.ZU.Lxb().lk(jXs);
        jXs.Lxb(tDVar, new com.bytedance.sdk.openadsdk.core.OY.JXs.LD() { // from class: com.bytedance.sdk.openadsdk.component.QAg.JXs.1
            @Override // com.bytedance.sdk.openadsdk.core.OY.JXs.LD
            public View LD() {
                return JXs.this;
            }

            @Override // com.bytedance.sdk.openadsdk.core.OY.JXs.LD
            public void Lxb(int i, int i2) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.OY.JXs.LD
            public void e_() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.OY.JXs.LD
            public View Lxb() {
                ebl eblVar = JXs.this.OY;
                if (eblVar != null) {
                    return eblVar.getTopDislike();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.core.OY.JXs.LD
            public void Lxb(View view, int i) {
                Lxb lxb = JXs.this.NXR;
                if (lxb != null) {
                    lxb.Lxb(view, i);
                }
            }
        }, "open_ad");
        addView(jXs, new ViewGroup.LayoutParams(-1, -1));
        jXs.VVE();
        int iLk = le.lk(context, 9.0f);
        int iLk2 = le.lk(context, 10.0f);
        this.ZU = new PAGLogoView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, le.lk(context, 14.0f));
        layoutParams.leftMargin = iLk2;
        layoutParams.bottomMargin = iLk2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.ZU, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.lk lkVar = new com.bytedance.sdk.openadsdk.core.widget.lk(context);
        this.sLN = lkVar;
        lkVar.setPadding(iLk, 0, iLk, 0);
        this.sLN.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(le.lk(context, 32.0f), le.lk(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, iLk2, iLk2);
        addView(this.sLN, layoutParams2);
        View view = this.OY;
        if (view != null) {
            addView(view);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.QAg.lk
    public com.bytedance.sdk.openadsdk.core.JXs.ZU getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.QAg.lk
    public com.bytedance.sdk.openadsdk.core.JXs.OY getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.QAg.lk
    public VVE getScoreBar() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.QAg.lk
    public View getUserInfo() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.NXR = null;
    }

    public void setRenderListener(Lxb lxb) {
        this.NXR = lxb;
    }
}
