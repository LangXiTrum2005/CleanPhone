package com.bytedance.sdk.openadsdk.rdp;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.Z;
import com.bytedance.sdk.openadsdk.core.widget.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;

/* JADX INFO: loaded from: classes3.dex */
public class mo extends to {
    public mo(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.rdp.to
    public com.bytedance.sdk.openadsdk.core.mo.jpc lnr(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarLnr = super.lnr(context);
        jpcVarLnr.setGravity(16);
        jpcVarLnr.setMaxWidth(ax.ud(context, 53.0f));
        jpcVarLnr.setTextColor(-1);
        jpcVarLnr.setTextSize(2, 8.0f);
        return jpcVarLnr;
    }

    @Override // com.bytedance.sdk.openadsdk.rdp.to
    public com.bytedance.sdk.openadsdk.core.mo.jpc mml(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarMml = super.mml(context);
        jpcVarMml.setBackground(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_download_corner_bg"));
        jpcVarMml.setTextSize(2, 8.0f);
        return jpcVarMml;
    }

    @Override // com.bytedance.sdk.openadsdk.rdp.to
    public void qdl(Context context) {
        int iUd = ax.ud(context, 10.0f);
        int iUd2 = ax.ud(context, 5.0f);
        int iUd3 = ax.ud(context, 6.0f);
        int iUd4 = ax.ud(context, 16.0f);
        com.bytedance.sdk.openadsdk.core.mo.wd wdVar = new com.bytedance.sdk.openadsdk.core.mo.wd(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        wdVar.setLayoutParams(layoutParams);
        addView(wdVar);
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVarMzz = mzz(context);
        this.qdl = lnrVarMzz;
        lnrVarMzz.setId(jtx.lme);
        this.qdl.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        wdVar.addView(this.qdl);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVarMo = mo(context);
        this.ud = mmlVarMo;
        mmlVarMo.setId(jtx.iw);
        this.ud.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        wdVar.addView(this.ud);
        com.bytedance.sdk.openadsdk.core.mo.wd wdVar2 = new com.bytedance.sdk.openadsdk.core.mo.wd(context);
        int i2 = jtx.zvv;
        wdVar2.setId(i2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, ax.ud(context, 48.0f));
        layoutParams2.setMargins(iUd2, iUd2, iUd2, iUd2);
        layoutParams2.addRule(12);
        wdVar2.setBackgroundColor(Color.parseColor("#26000000"));
        wdVar2.setGravity(16);
        wdVar2.setLayoutParams(layoutParams2);
        wdVar.addView(wdVar2);
        yt ytVarWd = wd(context);
        this.lnr = ytVarWd;
        int i3 = jtx.bx;
        ytVarWd.setId(i3);
        int iUd5 = ax.ud(context, 25.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iUd5, iUd5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        this.lnr.setLayoutParams(layoutParams3);
        wdVar2.addView(this.lnr);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        RelativeLayout.LayoutParams layoutParamsG = Z.g(-2, -1, 17, i3);
        layoutParamsG.addRule(1, i3);
        mzzVar.setLayoutParams(layoutParamsG);
        mzzVar.setGravity(16);
        mzzVar.setOrientation(1);
        wdVar2.addView(mzzVar);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarUd = ud(context);
        this.mml = jpcVarUd;
        jpcVarUd.setId(jtx.xdk);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = iUd3;
        layoutParams4.setMarginStart(iUd3);
        this.mml.setLayoutParams(layoutParams4);
        mzzVar.addView(this.mml);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarLnr = lnr(context);
        this.mzz = jpcVarLnr;
        jpcVarLnr.setId(jtx.dps);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = iUd3;
        layoutParams5.setMarginStart(iUd3);
        this.mzz.setLayoutParams(layoutParams5);
        mzzVar.addView(this.mzz);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarMml = mml(context);
        this.mo = jpcVarMml;
        jpcVarMml.setId(jtx.jut);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(21);
        layoutParams6.addRule(11);
        layoutParams6.addRule(15);
        this.mo.setLayoutParams(layoutParams6);
        int iUd6 = ax.ud(context, 4.0f);
        this.mo.setPadding(iUd6, iUd6, iUd6, iUd6);
        wdVar2.addView(this.mo);
        View viewJpc = jpc(context);
        RelativeLayout.LayoutParams layoutParamsG2 = Z.g(-2, -2, 2, i2);
        layoutParamsG2.leftMargin = iUd4;
        layoutParamsG2.bottomMargin = iUd;
        viewJpc.setLayoutParams(layoutParamsG2);
        wdVar.addView(viewJpc);
    }

    @Override // com.bytedance.sdk.openadsdk.rdp.to
    public com.bytedance.sdk.openadsdk.core.mo.jpc ud(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarUd = super.ud(context);
        jpcVarUd.setGravity(16);
        jpcVarUd.setMaxWidth(ax.ud(context, 53.0f));
        jpcVarUd.setTextColor(-1);
        jpcVarUd.setTextSize(2, 10.0f);
        return jpcVarUd;
    }

    public mo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public mo(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
