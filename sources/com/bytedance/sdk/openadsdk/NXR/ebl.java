package com.bytedance.sdk.openadsdk.NXR;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.kqm;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class ebl extends nBu {
    public ebl(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.NXR.nBu
    public com.bytedance.sdk.openadsdk.core.JXs.OY LD(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.OY oyLD = super.LD(context);
        oyLD.setGravity(16);
        oyLD.setMaxWidth(le.lk(context, 150.0f));
        oyLD.setTextColor(Color.parseColor("#B7B7B7"));
        oyLD.setTextSize(2, 15.0f);
        oyLD.setText("APP NAME");
        return oyLD;
    }

    @Override // com.bytedance.sdk.openadsdk.NXR.nBu
    public void Lxb(Context context) {
        int iLk = le.lk(context, 10.0f);
        int iLk2 = le.lk(context, 5.0f);
        int iLk3 = le.lk(context, 16.0f);
        int iLk4 = le.lk(context, 15.0f);
        com.bytedance.sdk.openadsdk.core.JXs.ebl eblVar = new com.bytedance.sdk.openadsdk.core.JXs.ebl(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        eblVar.setLayoutParams(layoutParams);
        addView(eblVar);
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVarJXs = JXs(context);
        this.Lxb = lkVarJXs;
        lkVarJXs.setId(com.bytedance.sdk.openadsdk.utils.STP.chu);
        this.Lxb.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        eblVar.addView(this.Lxb);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zuLc = lc(context);
        this.LD = zuLc;
        zuLc.setId(com.bytedance.sdk.openadsdk.utils.STP.mb);
        this.LD.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        eblVar.addView(this.LD);
        com.bytedance.sdk.openadsdk.core.JXs.ebl eblVar2 = new com.bytedance.sdk.openadsdk.core.JXs.ebl(context);
        int i = com.bytedance.sdk.openadsdk.utils.STP.wPa;
        eblVar2.setId(i);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, le.lk(context, 60.0f));
        layoutParams2.addRule(12);
        eblVar2.setBackgroundColor(Color.parseColor("#26000000"));
        eblVar2.setLayoutParams(layoutParams2);
        eblVar.addView(eblVar2);
        kqm kqmVarEbl = ebl(context);
        this.lk = kqmVarEbl;
        int i2 = com.bytedance.sdk.openadsdk.utils.STP.FV;
        kqmVarEbl.setId(i2);
        int iLk5 = le.lk(context, 50.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iLk5, iLk5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        layoutParams3.leftMargin = iLk4;
        layoutParams3.setMarginStart(iLk4);
        this.lk.setLayoutParams(layoutParams3);
        eblVar2.addView(this.lk);
        com.bytedance.sdk.openadsdk.core.JXs.OY oyLD = LD(context);
        this.ZU = oyLD;
        oyLD.setId(com.bytedance.sdk.openadsdk.utils.STP.Rt);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15);
        layoutParams4.leftMargin = iLk2;
        layoutParams4.setMarginStart(iLk2);
        layoutParams4.addRule(1, i2);
        layoutParams4.addRule(17, i2);
        this.ZU.setLayoutParams(layoutParams4);
        eblVar2.addView(this.ZU);
        com.bytedance.sdk.openadsdk.core.JXs.OY oyZU = ZU(context);
        this.lc = oyZU;
        oyZU.setId(com.bytedance.sdk.openadsdk.utils.STP.JD);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(le.lk(context, 70.0f), le.lk(context, 36.0f));
        layoutParams5.addRule(21);
        layoutParams5.addRule(11);
        layoutParams5.addRule(15);
        layoutParams5.rightMargin = iLk4;
        layoutParams5.setMarginEnd(iLk4);
        this.lc.setLayoutParams(layoutParams5);
        eblVar2.addView(this.lc);
        View viewOY = OY(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(2, i);
        layoutParams6.leftMargin = iLk3;
        layoutParams6.bottomMargin = iLk;
        viewOY.setLayoutParams(layoutParams6);
        eblVar.addView(viewOY);
    }

    @Override // com.bytedance.sdk.openadsdk.NXR.nBu
    public com.bytedance.sdk.openadsdk.core.JXs.OY ZU(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.OY oyZU = super.ZU(context);
        oyZU.setBackground(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_download_corner_bg"));
        oyZU.setTextSize(2, 14.0f);
        return oyZU;
    }

    public ebl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ebl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
