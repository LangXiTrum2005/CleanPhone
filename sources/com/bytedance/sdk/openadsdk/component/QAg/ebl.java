package com.bytedance.sdk.openadsdk.component.QAg;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class ebl extends com.bytedance.sdk.openadsdk.core.JXs.ebl {
    private final com.bytedance.sdk.openadsdk.core.JXs.ZU LD;
    private final com.bytedance.sdk.openadsdk.core.JXs.ZU Lxb;

    public ebl(@NonNull Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        le.lk(context, 12.0f);
        int iLk = le.lk(context, 16.0f);
        int iLk2 = le.lk(context, 20.0f);
        le.lk(context, 24.0f);
        int iLk3 = le.lk(context, 28.0f);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        this.Lxb = zu;
        zu.setId(520093713);
        int iLk4 = le.lk(getContext(), 5.0f);
        zu.setPadding(iLk4, iLk4, iLk4, iLk4);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        zu.setScaleType(scaleType);
        zu.setBackground(com.bytedance.sdk.openadsdk.core.widget.ZU.Lxb());
        zu.setImageResource(tD.ZU(kqm.Lxb(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iLk3, iLk3);
        layoutParams.topMargin = iLk2;
        layoutParams.leftMargin = iLk;
        layoutParams.setMarginStart(iLk);
        zu.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu2 = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        this.LD = zu2;
        zu2.setId(520093714);
        zu2.setPadding(iLk4, iLk4, iLk4, iLk4);
        zu2.setScaleType(scaleType);
        zu2.setBackground(com.bytedance.sdk.openadsdk.core.widget.ZU.Lxb());
        zu2.setImageResource(tD.ZU(kqm.Lxb(), "tt_close_btn"));
        if (zu2.getDrawable() != null) {
            zu2.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iLk3, iLk3);
        layoutParams2.topMargin = iLk2;
        layoutParams2.rightMargin = iLk;
        layoutParams2.setMarginEnd(iLk);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        zu2.setLayoutParams(layoutParams2);
        addView(zu);
        addView(zu2);
    }

    public View getTopDislike() {
        return this.Lxb;
    }

    public com.bytedance.sdk.openadsdk.core.JXs.ZU getTopSkip() {
        return this.LD;
    }
}
