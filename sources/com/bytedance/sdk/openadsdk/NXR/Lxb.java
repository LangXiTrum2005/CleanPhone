package com.bytedance.sdk.openadsdk.NXR;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.kqm;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends nBu {
    public Lxb(Context context) {
        this(context, null);
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
        int iLk2 = le.lk(context, 16.0f);
        jXs2.setPadding(iLk2, iLk2, iLk2, iLk2);
        jXs.addView(jXs2);
        com.bytedance.sdk.openadsdk.core.JXs.ebl eblVar = new com.bytedance.sdk.openadsdk.core.JXs.ebl(context);
        eblVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        jXs2.addView(eblVar);
        kqm kqmVarEbl = ebl(context);
        this.lk = kqmVarEbl;
        kqmVarEbl.setId(com.bytedance.sdk.openadsdk.utils.STP.FV);
        int iLk3 = le.lk(context, 45.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iLk3, iLk3);
        layoutParams4.rightMargin = iLk;
        layoutParams4.setMarginEnd(iLk);
        this.lk.setLayoutParams(layoutParams4);
        eblVar.addView(this.lk);
        com.bytedance.sdk.openadsdk.core.JXs.OY oyLD = LD(context);
        this.ZU = oyLD;
        oyLD.setId(com.bytedance.sdk.openadsdk.utils.STP.Rt);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(1, this.lk.getId());
        layoutParams5.addRule(17, this.lk.getId());
        this.ZU.setLayoutParams(layoutParams5);
        eblVar.addView(this.ZU);
        com.bytedance.sdk.openadsdk.core.JXs.OY oyLk = lk(context);
        this.JXs = oyLk;
        oyLk.setId(com.bytedance.sdk.openadsdk.utils.STP.pyu);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(3, this.ZU.getId());
        layoutParams6.addRule(1, this.lk.getId());
        layoutParams6.addRule(17, this.lk.getId());
        this.JXs.setLayoutParams(layoutParams6);
        eblVar.addView(this.JXs);
        com.bytedance.sdk.openadsdk.core.JXs.OY oyZU = ZU(context);
        this.lc = oyZU;
        oyZU.setId(com.bytedance.sdk.openadsdk.utils.STP.JD);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, le.lk(context, 32.0f));
        layoutParams7.topMargin = iLk2;
        this.lc.setLayoutParams(layoutParams7);
        jXs2.addView(this.lc);
    }

    public Lxb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Lxb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
