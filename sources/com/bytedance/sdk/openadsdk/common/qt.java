package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class qt extends RelativeLayout {
    public qt(Context context) {
        super(context);
        ri();
    }

    private void ri() {
        Context context = getContext();
        int iLr = qd.lr(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, qd.lr(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.di.ka kaVar = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        kaVar.setId(520093720);
        kaVar.setClickable(true);
        kaVar.setFocusable(true);
        kaVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.sf.ri(context, "tt_leftbackicon_selector"));
        int iLr2 = qd.lr(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iLr2, iLr2);
        layoutParams.leftMargin = iLr;
        layoutParams.addRule(15);
        addView(kaVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.di.ka kaVar2 = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        kaVar2.setId(520093716);
        kaVar2.setClickable(true);
        kaVar2.setFocusable(true);
        kaVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.sf.ri(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iLr2, iLr2);
        layoutParams2.leftMargin = iLr;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(kaVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.di.ka kaVar3 = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        int i = com.bytedance.sdk.openadsdk.utils.slm.jxw;
        kaVar3.setId(i);
        kaVar3.setImageDrawable(uq.ik(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iLr2, iLr2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = iLr;
        addView(kaVar3, layoutParams3);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        mjVar.setId(com.bytedance.sdk.openadsdk.utils.slm.nh);
        mjVar.setSingleLine(true);
        mjVar.setEllipsize(TextUtils.TruncateAt.END);
        mjVar.setGravity(17);
        mjVar.setTextColor(-16777216);
        mjVar.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(qd.lr(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, i);
        int iLr3 = qd.lr(context, 25.0f);
        layoutParams4.rightMargin = iLr3;
        layoutParams4.leftMargin = iLr3;
        addView(mjVar, layoutParams4);
    }
}
