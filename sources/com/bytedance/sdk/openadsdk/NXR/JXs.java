package com.bytedance.sdk.openadsdk.NXR;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends nBu {
    private com.bytedance.sdk.openadsdk.core.JXs.OY OY;
    private com.bytedance.sdk.openadsdk.core.JXs.ZU ebl;

    public JXs(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.NXR.nBu
    public void Lxb(Context context) {
        int iLk = le.lk(context, 6.0f);
        setPadding(iLk, iLk, iLk, iLk);
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVarJXs = JXs(context);
        this.Lxb = lkVarJXs;
        lkVarJXs.setId(com.bytedance.sdk.openadsdk.utils.STP.chu);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int iLk2 = le.lk(context, 26.0f);
        layoutParams.topMargin = iLk2;
        this.Lxb.setLayoutParams(layoutParams);
        addView(this.Lxb);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        this.ebl = zu;
        zu.setId(com.bytedance.sdk.openadsdk.utils.STP.SlV);
        this.ebl.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = iLk2;
        this.ebl.setLayoutParams(layoutParams2);
        addView(this.ebl);
        PAGLogoView pAGLogoViewOY = OY(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        int iLk3 = le.lk(context, 10.0f);
        layoutParams3.leftMargin = iLk3;
        layoutParams3.topMargin = iLk3;
        layoutParams3.bottomMargin = iLk3;
        pAGLogoViewOY.setLayoutParams(layoutParams3);
        addView(pAGLogoViewOY);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        jXs.setOrientation(0);
        jXs.setGravity(17);
        addView(jXs);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.OY = oy;
        oy.setId(com.bytedance.sdk.openadsdk.utils.STP.Iyd);
        this.OY.setEllipsize(TextUtils.TruncateAt.END);
        this.OY.setMaxLines(1);
        this.OY.setTextColor(-1);
        this.OY.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.OY.setLayoutParams(layoutParams4);
        jXs.addView(this.OY);
    }

    public com.bytedance.sdk.openadsdk.core.JXs.OY getTtBuDescTV() {
        return this.OY;
    }

    public com.bytedance.sdk.openadsdk.core.JXs.ZU getTtBuImg() {
        return this.ebl;
    }

    public JXs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public JXs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
