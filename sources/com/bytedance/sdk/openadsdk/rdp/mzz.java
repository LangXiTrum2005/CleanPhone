package com.bytedance.sdk.openadsdk.rdp;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;

/* JADX INFO: loaded from: classes3.dex */
public class mzz extends to {
    private com.bytedance.sdk.openadsdk.core.mo.jpc jpc;
    private com.bytedance.sdk.openadsdk.core.mo.mml wd;

    public mzz(Context context) {
        this(context, null);
    }

    public com.bytedance.sdk.openadsdk.core.mo.jpc getTtBuDescTV() {
        return this.jpc;
    }

    public com.bytedance.sdk.openadsdk.core.mo.mml getTtBuImg() {
        return this.wd;
    }

    @Override // com.bytedance.sdk.openadsdk.rdp.to
    public void qdl(Context context) {
        int iUd = ax.ud(context, 6.0f);
        setPadding(iUd, iUd, iUd, iUd);
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVarMzz = mzz(context);
        this.qdl = lnrVarMzz;
        lnrVarMzz.setId(jtx.lme);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int iUd2 = ax.ud(context, 26.0f);
        layoutParams.topMargin = iUd2;
        this.qdl.setLayoutParams(layoutParams);
        addView(this.qdl);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        this.wd = mmlVar;
        mmlVar.setId(jtx.kr);
        this.wd.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = iUd2;
        this.wd.setLayoutParams(layoutParams2);
        addView(this.wd);
        PAGLogoView pAGLogoViewJpc = jpc(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        int iUd3 = ax.ud(context, 10.0f);
        layoutParams3.leftMargin = iUd3;
        layoutParams3.topMargin = iUd3;
        layoutParams3.bottomMargin = iUd3;
        pAGLogoViewJpc.setLayoutParams(layoutParams3);
        addView(pAGLogoViewJpc);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        mzzVar.setOrientation(0);
        mzzVar.setGravity(17);
        addView(mzzVar);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.jpc = jpcVar;
        jpcVar.setId(jtx.xx);
        this.jpc.setEllipsize(TextUtils.TruncateAt.END);
        this.jpc.setMaxLines(1);
        this.jpc.setTextColor(-1);
        this.jpc.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.jpc.setLayoutParams(layoutParams4);
        mzzVar.addView(this.jpc);
    }

    public mzz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public mzz(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
