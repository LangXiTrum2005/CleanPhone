package com.bytedance.sdk.openadsdk.rdp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends to {
    public ud(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.rdp.to
    public com.bytedance.sdk.openadsdk.core.mo.jpc lnr(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarLnr = super.lnr(context);
        jpcVarLnr.setTextColor(-1);
        return jpcVarLnr;
    }

    @Override // com.bytedance.sdk.openadsdk.rdp.to
    public void qdl(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        mzzVar.setOrientation(1);
        addView(mzzVar);
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 2.0f;
        lnrVar.setLayoutParams(layoutParams);
        mzzVar.addView(lnrVar);
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVarMzz = mzz(context);
        this.qdl = lnrVarMzz;
        lnrVarMzz.setId(jtx.lme);
        this.qdl.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        lnrVar.addView(this.qdl);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVarMo = mo(context);
        this.ud = mmlVarMo;
        mmlVarMo.setId(jtx.iw);
        this.ud.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        lnrVar.addView(this.ud);
        PAGLogoView pAGLogoViewJpc = jpc(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        int iUd = ax.ud(context, 10.0f);
        layoutParams2.leftMargin = iUd;
        layoutParams2.topMargin = iUd;
        layoutParams2.bottomMargin = iUd;
        pAGLogoViewJpc.setLayoutParams(layoutParams2);
        lnrVar.addView(pAGLogoViewJpc);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar2 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 1.0f;
        mzzVar2.setLayoutParams(layoutParams3);
        mzzVar2.setOrientation(1);
        mzzVar2.setGravity(81);
        int iUd2 = ax.ud(context, 16.0f);
        mzzVar2.setPadding(iUd2, iUd2, iUd2, iUd2);
        mzzVar.addView(mzzVar2);
        com.bytedance.sdk.openadsdk.core.mo.wd wdVar = new com.bytedance.sdk.openadsdk.core.mo.wd(context);
        wdVar.setId(jtx.zpu);
        wdVar.setLayoutParams(new LinearLayout.LayoutParams(-2, ax.ud(context, 40.0f)));
        wdVar.setGravity(17);
        mzzVar2.addView(wdVar);
        yt ytVarWd = wd(context);
        this.lnr = ytVarWd;
        ytVarWd.setId(jtx.bx);
        int iUd3 = ax.ud(context, 35.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iUd3, iUd3);
        layoutParams4.addRule(20);
        layoutParams4.addRule(9);
        layoutParams4.addRule(15);
        this.lnr.setLayoutParams(layoutParams4);
        wdVar.addView(this.lnr);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarUd = ud(context);
        this.mml = jpcVarUd;
        jpcVarUd.setId(jtx.xdk);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, iUd * 2);
        int iUd4 = ax.ud(context, 6.0f);
        layoutParams5.leftMargin = iUd4;
        layoutParams5.setMarginStart(iUd4);
        layoutParams5.addRule(1, this.lnr.getId());
        layoutParams5.addRule(17, this.lnr.getId());
        this.mml.setLayoutParams(layoutParams5);
        wdVar.addView(this.mml);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarLnr = lnr(context);
        this.mzz = jpcVarLnr;
        jpcVarLnr.setId(jtx.dps);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, ax.ud(context, 20.0f));
        layoutParams6.addRule(3, this.mml.getId());
        layoutParams6.addRule(8, this.lnr.getId());
        layoutParams6.addRule(17, this.lnr.getId());
        layoutParams6.addRule(1, this.lnr.getId());
        layoutParams6.leftMargin = iUd4;
        layoutParams6.setMarginStart(iUd4);
        this.mzz.setLayoutParams(layoutParams6);
        wdVar.addView(this.mzz);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarMml = mml(context);
        this.mo = jpcVarMml;
        jpcVarMml.setId(jtx.jut);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, ax.ud(context, 22.0f));
        layoutParams7.topMargin = iUd2;
        this.mo.setLayoutParams(layoutParams7);
        mzzVar2.addView(this.mo);
    }

    @Override // com.bytedance.sdk.openadsdk.rdp.to
    public com.bytedance.sdk.openadsdk.core.mo.jpc ud(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarUd = super.ud(context);
        jpcVarUd.setTextColor(-1);
        jpcVarUd.setTextSize(2, 13.0f);
        jpcVarUd.setText("Pangle");
        return jpcVarUd;
    }

    public ud(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ud(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
