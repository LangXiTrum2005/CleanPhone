package com.bytedance.sdk.openadsdk.component.jbs;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends com.bytedance.sdk.openadsdk.core.di.xha {
    private final com.bytedance.sdk.openadsdk.core.di.mj ik;
    private final com.bytedance.sdk.openadsdk.core.di.ka lr;
    private final com.bytedance.sdk.openadsdk.core.di.ka ri;

    public xha(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int iLr = qd.lr(context, 12.0f);
        int iLr2 = qd.lr(context, 16.0f);
        int iLr3 = qd.lr(context, 20.0f);
        int iLr4 = qd.lr(context, 24.0f);
        int iLr5 = qd.lr(context, 28.0f);
        com.bytedance.sdk.openadsdk.core.di.ka kaVar = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        this.ri = kaVar;
        kaVar.setId(520093713);
        int iLr6 = qd.lr(getContext(), 5.0f);
        kaVar.setPadding(iLr6, iLr6, iLr6, iLr6);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        kaVar.setScaleType(scaleType);
        kaVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.ka.ri());
        kaVar.setImageResource(uq.ka(nr.ri(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iLr5, iLr5);
        layoutParams.topMargin = iLr3;
        layoutParams.leftMargin = iLr2;
        layoutParams.setMarginStart(iLr2);
        kaVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.di.ka kaVar2 = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        this.lr = kaVar2;
        kaVar2.setId(520093714);
        kaVar2.setPadding(iLr6, iLr6, iLr6, iLr6);
        kaVar2.setScaleType(scaleType);
        kaVar2.setBackground(com.bytedance.sdk.openadsdk.core.widget.ka.ri());
        kaVar2.setImageResource(uq.ka(nr.ri(), "tt_close_btn"));
        if (kaVar2.getDrawable() != null) {
            kaVar2.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iLr5, iLr5);
        layoutParams2.topMargin = iLr3;
        layoutParams2.rightMargin = iLr2;
        layoutParams2.setMarginEnd(iLr2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        kaVar2.setLayoutParams(layoutParams2);
        kaVar2.setVisibility(4);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.ik = mjVar;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, iLr4);
        layoutParams3.topMargin = iLr3;
        layoutParams3.rightMargin = iLr2;
        layoutParams3.addRule(11);
        layoutParams3.setMarginEnd(iLr2);
        layoutParams3.addRule(21);
        mjVar.setLayoutParams(layoutParams3);
        mjVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.ka.lr());
        mjVar.setGravity(17);
        mjVar.setPadding(iLr, 0, iLr, 0);
        mjVar.setTextColor(-1);
        mjVar.setTextSize(1, 14.0f);
        mjVar.setVisibility(4);
        addView(kaVar);
        addView(mjVar);
        addView(kaVar2);
    }

    public com.bytedance.sdk.openadsdk.core.di.mj getTopCountDown() {
        return this.ik;
    }

    public View getTopDislike() {
        return this.ri;
    }

    public com.bytedance.sdk.openadsdk.core.di.ka getTopSkip() {
        return this.lr;
    }
}
