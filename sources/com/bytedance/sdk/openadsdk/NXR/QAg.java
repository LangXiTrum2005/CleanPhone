package com.bytedance.sdk.openadsdk.NXR;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.kqm;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class QAg extends nBu {
    public QAg(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.NXR.nBu
    public com.bytedance.sdk.openadsdk.core.JXs.OY LD(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy.setEllipsize(TextUtils.TruncateAt.END);
        oy.setGravity(16);
        oy.setMaxWidth(le.lk(context, 153.0f));
        oy.setSingleLine();
        oy.setText("Pangle");
        oy.setTextColor(-1);
        oy.setTextSize(2, 14.0f);
        return oy;
    }

    @Override // com.bytedance.sdk.openadsdk.NXR.nBu
    public void Lxb(Context context) {
        int iLk = le.lk(context, 10.0f);
        int iLk2 = le.lk(context, 6.0f);
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
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, le.lk(context, 48.0f));
        layoutParams2.addRule(12);
        eblVar2.setLayoutParams(layoutParams2);
        eblVar2.setBackgroundColor(Color.parseColor("#26000000"));
        eblVar2.setGravity(16);
        eblVar2.setPadding(iLk4, 0, 0, 0);
        eblVar.addView(eblVar2);
        kqm kqmVarEbl = ebl(context);
        this.lk = kqmVarEbl;
        int i2 = com.bytedance.sdk.openadsdk.utils.STP.FV;
        kqmVarEbl.setId(i2);
        int iLk5 = le.lk(context, 40.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iLk5, iLk5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        layoutParams3.leftMargin = iLk;
        layoutParams3.setMarginStart(iLk);
        this.lk.setLayoutParams(layoutParams3);
        eblVar2.addView(this.lk);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(17, i2);
        layoutParams4.addRule(1, i2);
        jXs.setLayoutParams(layoutParams4);
        jXs.setGravity(16);
        jXs.setOrientation(1);
        eblVar2.addView(jXs);
        com.bytedance.sdk.openadsdk.core.JXs.OY oyLD = LD(context);
        this.ZU = oyLD;
        oyLD.setId(com.bytedance.sdk.openadsdk.utils.STP.Rt);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(le.lk(context, 130.0f), le.lk(context, 20.0f));
        layoutParams5.leftMargin = iLk2;
        layoutParams5.setMarginStart(iLk2);
        this.ZU.setLayoutParams(layoutParams5);
        jXs.addView(this.ZU);
        com.bytedance.sdk.openadsdk.core.JXs.OY oyLk = lk(context);
        this.JXs = oyLk;
        oyLk.setId(com.bytedance.sdk.openadsdk.utils.STP.pyu);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = iLk2;
        layoutParams6.setMarginStart(iLk2);
        this.JXs.setLayoutParams(layoutParams6);
        jXs.addView(this.JXs);
        com.bytedance.sdk.openadsdk.core.JXs.OY oyZU = ZU(context);
        this.lc = oyZU;
        oyZU.setId(com.bytedance.sdk.openadsdk.utils.STP.JD);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(le.lk(context, 80.0f), le.lk(context, 30.0f));
        layoutParams7.addRule(21);
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        layoutParams7.rightMargin = iLk;
        layoutParams7.setMarginEnd(iLk);
        this.lc.setLayoutParams(layoutParams7);
        eblVar2.addView(this.lc);
        View viewOY = OY(context);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(2, i);
        layoutParams8.leftMargin = iLk3;
        layoutParams8.bottomMargin = iLk;
        viewOY.setLayoutParams(layoutParams8);
        eblVar.addView(viewOY);
    }

    @Override // com.bytedance.sdk.openadsdk.NXR.nBu
    public com.bytedance.sdk.openadsdk.core.JXs.OY ZU(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.OY oyZU = super.ZU(context);
        oyZU.setBackground(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_download_corner_bg"));
        oyZU.setTextSize(2, 14.0f);
        return oyZU;
    }

    @Override // com.bytedance.sdk.openadsdk.NXR.nBu
    public com.bytedance.sdk.openadsdk.core.JXs.OY lk(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.OY oyLk = super.lk(context);
        oyLk.setGravity(16);
        oyLk.setMaxWidth(le.lk(context, 153.0f));
        oyLk.setTextColor(-1);
        oyLk.setTextSize(2, 13.0f);
        return oyLk;
    }

    public QAg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QAg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
