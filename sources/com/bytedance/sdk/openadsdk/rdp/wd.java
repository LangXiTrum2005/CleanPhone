package com.bytedance.sdk.openadsdk.rdp;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.Z;
import com.bytedance.sdk.openadsdk.core.widget.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;

/* JADX INFO: loaded from: classes3.dex */
public class wd extends to {
    public wd(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.rdp.to
    public com.bytedance.sdk.openadsdk.core.mo.jpc mml(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarMml = super.mml(context);
        jpcVarMml.setBackground(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_download_corner_bg"));
        jpcVarMml.setTextSize(2, 14.0f);
        return jpcVarMml;
    }

    @Override // com.bytedance.sdk.openadsdk.rdp.to
    public void qdl(Context context) {
        int iUd = ax.ud(context, 10.0f);
        int iUd2 = ax.ud(context, 5.0f);
        int iUd3 = ax.ud(context, 16.0f);
        int iUd4 = ax.ud(context, 15.0f);
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
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, ax.ud(context, 60.0f));
        layoutParams2.addRule(12);
        wdVar2.setBackgroundColor(Color.parseColor("#26000000"));
        wdVar2.setLayoutParams(layoutParams2);
        wdVar.addView(wdVar2);
        yt ytVarWd = wd(context);
        this.lnr = ytVarWd;
        int i3 = jtx.bx;
        ytVarWd.setId(i3);
        int iUd5 = ax.ud(context, 50.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iUd5, iUd5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        layoutParams3.leftMargin = iUd4;
        layoutParams3.setMarginStart(iUd4);
        this.lnr.setLayoutParams(layoutParams3);
        wdVar2.addView(this.lnr);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarUd = ud(context);
        this.mml = jpcVarUd;
        jpcVarUd.setId(jtx.xdk);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15);
        layoutParams4.leftMargin = iUd2;
        layoutParams4.setMarginStart(iUd2);
        layoutParams4.addRule(1, i3);
        layoutParams4.addRule(17, i3);
        this.mml.setLayoutParams(layoutParams4);
        wdVar2.addView(this.mml);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarMml = mml(context);
        this.mo = jpcVarMml;
        jpcVarMml.setId(jtx.jut);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(ax.ud(context, 70.0f), ax.ud(context, 36.0f));
        layoutParams5.addRule(21);
        layoutParams5.addRule(11);
        layoutParams5.addRule(15);
        layoutParams5.rightMargin = iUd4;
        layoutParams5.setMarginEnd(iUd4);
        this.mo.setLayoutParams(layoutParams5);
        wdVar2.addView(this.mo);
        View viewJpc = jpc(context);
        RelativeLayout.LayoutParams layoutParamsG = Z.g(-2, -2, 2, i2);
        layoutParamsG.leftMargin = iUd3;
        layoutParamsG.bottomMargin = iUd;
        viewJpc.setLayoutParams(layoutParamsG);
        wdVar.addView(viewJpc);
    }

    @Override // com.bytedance.sdk.openadsdk.rdp.to
    public com.bytedance.sdk.openadsdk.core.mo.jpc ud(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarUd = super.ud(context);
        jpcVarUd.setGravity(16);
        jpcVarUd.setMaxWidth(ax.ud(context, 150.0f));
        jpcVarUd.setTextColor(Color.parseColor("#B7B7B7"));
        jpcVarUd.setTextSize(2, 15.0f);
        jpcVarUd.setText("APP NAME");
        return jpcVarUd;
    }

    public wd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public wd(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
