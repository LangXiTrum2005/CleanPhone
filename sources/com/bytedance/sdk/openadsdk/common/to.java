package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class to extends RelativeLayout {
    public to(Context context) {
        super(context);
        qdl();
    }

    private void qdl() {
        Context context = getContext();
        int iUd = ax.ud(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, ax.ud(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        mmlVar.setId(520093720);
        mmlVar.setClickable(true);
        mmlVar.setFocusable(true);
        mmlVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_leftbackicon_selector"));
        int iUd2 = ax.ud(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iUd2, iUd2);
        layoutParams.leftMargin = iUd;
        layoutParams.addRule(15);
        addView(mmlVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar2 = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        mmlVar2.setId(520093716);
        mmlVar2.setClickable(true);
        mmlVar2.setFocusable(true);
        mmlVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iUd2, iUd2);
        layoutParams2.leftMargin = iUd;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(mmlVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar3 = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        int i2 = com.bytedance.sdk.openadsdk.utils.jtx.gg;
        mmlVar3.setId(i2);
        mmlVar3.setImageDrawable(ljh.lnr(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iUd2, iUd2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = iUd;
        addView(mmlVar3, layoutParams3);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar.setId(com.bytedance.sdk.openadsdk.utils.jtx.rzg);
        jpcVar.setSingleLine(true);
        jpcVar.setEllipsize(TextUtils.TruncateAt.END);
        jpcVar.setGravity(17);
        jpcVar.setTextColor(-16777216);
        jpcVar.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(ax.ud(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, i2);
        int iUd3 = ax.ud(context, 25.0f);
        layoutParams4.rightMargin = iUd3;
        layoutParams4.leftMargin = iUd3;
        addView(jpcVar, layoutParams4);
    }
}
