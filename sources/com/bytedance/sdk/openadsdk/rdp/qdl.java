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
public class qdl extends to {
    public qdl(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.rdp.to
    public void qdl(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        mzzVar.setOrientation(1);
        addView(mzzVar);
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 337.0f;
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
        layoutParams3.weight = 263.0f;
        mzzVar2.setLayoutParams(layoutParams3);
        mzzVar2.setOrientation(1);
        int iUd2 = ax.ud(context, 16.0f);
        mzzVar2.setPadding(iUd2, iUd2, iUd2, iUd2);
        mzzVar.addView(mzzVar2);
        com.bytedance.sdk.openadsdk.core.mo.wd wdVar = new com.bytedance.sdk.openadsdk.core.mo.wd(context);
        wdVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        mzzVar2.addView(wdVar);
        yt ytVarWd = wd(context);
        this.lnr = ytVarWd;
        ytVarWd.setId(jtx.bx);
        int iUd3 = ax.ud(context, 45.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iUd3, iUd3);
        layoutParams4.rightMargin = iUd;
        layoutParams4.setMarginEnd(iUd);
        this.lnr.setLayoutParams(layoutParams4);
        wdVar.addView(this.lnr);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarUd = ud(context);
        this.mml = jpcVarUd;
        jpcVarUd.setId(jtx.xdk);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(1, this.lnr.getId());
        layoutParams5.addRule(17, this.lnr.getId());
        this.mml.setLayoutParams(layoutParams5);
        wdVar.addView(this.mml);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarLnr = lnr(context);
        this.mzz = jpcVarLnr;
        jpcVarLnr.setId(jtx.dps);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(3, this.mml.getId());
        layoutParams6.addRule(1, this.lnr.getId());
        layoutParams6.addRule(17, this.lnr.getId());
        this.mzz.setLayoutParams(layoutParams6);
        wdVar.addView(this.mzz);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarMml = mml(context);
        this.mo = jpcVarMml;
        jpcVarMml.setId(jtx.jut);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, ax.ud(context, 32.0f));
        layoutParams7.topMargin = iUd2;
        this.mo.setLayoutParams(layoutParams7);
        mzzVar2.addView(this.mo);
    }

    public qdl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public qdl(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
