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
public class ZU extends nBu {
    public ZU(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.NXR.nBu
    public void Lxb(Context context) {
        int iLk = le.lk(context, 10.0f);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        jXs.setLayoutParams(layoutParams);
        layoutParams.gravity = 17;
        jXs.setOrientation(1);
        jXs.setPadding(iLk, iLk, iLk, iLk);
        addView(jXs);
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 3.0f;
        lkVar.setLayoutParams(layoutParams2);
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
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        layoutParams3.leftMargin = iLk;
        layoutParams3.topMargin = iLk;
        layoutParams3.bottomMargin = iLk;
        pAGLogoViewOY.setLayoutParams(layoutParams3);
        lkVar.addView(pAGLogoViewOY);
        com.bytedance.sdk.openadsdk.core.JXs.ebl eblVar = new com.bytedance.sdk.openadsdk.core.JXs.ebl(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 1.0f;
        eblVar.setLayoutParams(layoutParams4);
        jXs.addView(eblVar);
        kqm kqmVarEbl = ebl(context);
        this.lk = kqmVarEbl;
        int i = com.bytedance.sdk.openadsdk.utils.STP.FV;
        kqmVarEbl.setId(i);
        int iLk2 = le.lk(context, 40.0f);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(iLk2, iLk2);
        layoutParams5.addRule(15);
        this.lk.setLayoutParams(layoutParams5);
        eblVar.addView(this.lk);
        com.bytedance.sdk.openadsdk.core.JXs.OY oyLD = LD(context);
        this.ZU = oyLD;
        oyLD.setId(com.bytedance.sdk.openadsdk.utils.STP.Rt);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(15);
        layoutParams6.leftMargin = iLk;
        layoutParams6.setMarginStart(iLk);
        layoutParams6.addRule(1, i);
        layoutParams6.addRule(17, i);
        this.ZU.setLayoutParams(layoutParams6);
        eblVar.addView(this.ZU);
        com.bytedance.sdk.openadsdk.core.JXs.OY oyZU = ZU(context);
        this.lc = oyZU;
        oyZU.setId(com.bytedance.sdk.openadsdk.utils.STP.JD);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(le.lk(context, 100.0f), le.lk(context, 32.0f));
        layoutParams7.addRule(11);
        layoutParams7.addRule(21);
        layoutParams7.addRule(15);
        this.lc.setLayoutParams(layoutParams7);
        eblVar.addView(this.lc);
    }

    public ZU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ZU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
