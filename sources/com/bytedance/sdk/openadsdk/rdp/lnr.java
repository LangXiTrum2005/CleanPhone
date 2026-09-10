package com.bytedance.sdk.openadsdk.rdp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;

/* JADX INFO: loaded from: classes3.dex */
public class lnr extends to {
    public lnr(Context context) {
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
        mzzVar2.setGravity(81);
        int iUd2 = ax.ud(context, 16.0f);
        mzzVar2.setPadding(iUd2, iUd2, iUd2, iUd2);
        mzzVar.addView(mzzVar2);
        yt ytVarWd = wd(context);
        this.lnr = ytVarWd;
        ytVarWd.setId(jtx.bx);
        int iUd3 = ax.ud(context, 45.0f);
        this.lnr.setLayoutParams(new LinearLayout.LayoutParams(iUd3, iUd3));
        mzzVar2.addView(this.lnr);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarUd = ud(context);
        this.mml = jpcVarUd;
        jpcVarUd.setId(jtx.xdk);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = ax.ud(context, 4.0f);
        this.mml.setLayoutParams(layoutParams4);
        mzzVar2.addView(this.mml);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarLnr = lnr(context);
        this.mzz = jpcVarLnr;
        jpcVarLnr.setId(jtx.dps);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = iUd;
        layoutParams5.bottomMargin = ax.ud(context, 25.0f);
        this.mzz.setLayoutParams(layoutParams5);
        mzzVar2.addView(this.mzz);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarMml = mml(context);
        this.mo = jpcVarMml;
        jpcVarMml.setId(jtx.jut);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, ax.ud(context, 32.0f));
        layoutParams6.topMargin = iUd2;
        this.mo.setLayoutParams(layoutParams6);
        mzzVar2.addView(this.mo);
    }

    @Override // com.bytedance.sdk.openadsdk.rdp.to
    public com.bytedance.sdk.openadsdk.core.mo.jpc ud(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarUd = super.ud(context);
        jpcVarUd.setTextColor(-1);
        return jpcVarUd;
    }

    public lnr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public lnr(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
