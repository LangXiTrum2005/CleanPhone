package com.bytedance.sdk.openadsdk.NXR;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.kqm;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends nBu {
    public lk(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.NXR.nBu
    public com.bytedance.sdk.openadsdk.core.JXs.OY LD(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.OY oyLD = super.LD(context);
        oyLD.setTextColor(-1);
        return oyLD;
    }

    @Override // com.bytedance.sdk.openadsdk.NXR.nBu
    public void Lxb(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        jXs.setOrientation(1);
        addView(jXs);
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 337.0f;
        lkVar.setLayoutParams(layoutParams);
        jXs.addView(lkVar);
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVarJXs = JXs(context);
        this.Lxb = lkVarJXs;
        lkVarJXs.setId(com.bytedance.sdk.openadsdk.utils.STP.chu);
        this.Lxb.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        lkVar.addView(this.Lxb);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zuLc = lc(context);
        this.LD = zuLc;
        zuLc.setId(com.bytedance.sdk.openadsdk.utils.STP.mb);
        this.LD.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        lkVar.addView(this.LD);
        PAGLogoView pAGLogoViewOY = OY(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        int iLk = le.lk(context, 10.0f);
        layoutParams2.leftMargin = iLk;
        layoutParams2.topMargin = iLk;
        layoutParams2.bottomMargin = iLk;
        pAGLogoViewOY.setLayoutParams(layoutParams2);
        lkVar.addView(pAGLogoViewOY);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs2 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 263.0f;
        jXs2.setLayoutParams(layoutParams3);
        jXs2.setOrientation(1);
        jXs2.setGravity(81);
        int iLk2 = le.lk(context, 16.0f);
        jXs2.setPadding(iLk2, iLk2, iLk2, iLk2);
        jXs.addView(jXs2);
        kqm kqmVarEbl = ebl(context);
        this.lk = kqmVarEbl;
        kqmVarEbl.setId(com.bytedance.sdk.openadsdk.utils.STP.FV);
        int iLk3 = le.lk(context, 45.0f);
        this.lk.setLayoutParams(new LinearLayout.LayoutParams(iLk3, iLk3));
        jXs2.addView(this.lk);
        com.bytedance.sdk.openadsdk.core.JXs.OY oyLD = LD(context);
        this.ZU = oyLD;
        oyLD.setId(com.bytedance.sdk.openadsdk.utils.STP.Rt);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = le.lk(context, 4.0f);
        this.ZU.setLayoutParams(layoutParams4);
        jXs2.addView(this.ZU);
        com.bytedance.sdk.openadsdk.core.JXs.OY oyLk = lk(context);
        this.JXs = oyLk;
        oyLk.setId(com.bytedance.sdk.openadsdk.utils.STP.pyu);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = iLk;
        layoutParams5.bottomMargin = le.lk(context, 25.0f);
        this.JXs.setLayoutParams(layoutParams5);
        jXs2.addView(this.JXs);
        com.bytedance.sdk.openadsdk.core.JXs.OY oyZU = ZU(context);
        this.lc = oyZU;
        oyZU.setId(com.bytedance.sdk.openadsdk.utils.STP.JD);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, le.lk(context, 32.0f));
        layoutParams6.topMargin = iLk2;
        this.lc.setLayoutParams(layoutParams6);
        jXs2.addView(this.lc);
    }

    public lk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public lk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
