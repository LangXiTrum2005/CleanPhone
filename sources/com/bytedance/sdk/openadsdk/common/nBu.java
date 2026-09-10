package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class nBu extends RelativeLayout {
    public nBu(Context context) {
        super(context);
        Lxb();
    }

    private void Lxb() {
        Context context = getContext();
        int iLk = le.lk(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, le.lk(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        zu.setId(520093720);
        zu.setClickable(true);
        zu.setFocusable(true);
        zu.setImageDrawable(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_leftbackicon_selector"));
        int iLk2 = le.lk(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iLk2, iLk2);
        layoutParams.leftMargin = iLk;
        layoutParams.addRule(15);
        addView(zu, layoutParams);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu2 = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        zu2.setId(520093716);
        zu2.setClickable(true);
        zu2.setFocusable(true);
        zu2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iLk2, iLk2);
        layoutParams2.leftMargin = iLk;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(zu2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu3 = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        int i = com.bytedance.sdk.openadsdk.utils.STP.Hu;
        zu3.setId(i);
        zu3.setImageDrawable(tD.lk(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iLk2, iLk2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = iLk;
        addView(zu3, layoutParams3);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy.setId(com.bytedance.sdk.openadsdk.utils.STP.AcC);
        oy.setSingleLine(true);
        oy.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        oy.setGravity(17);
        oy.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        oy.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(le.lk(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, i);
        int iLk3 = le.lk(context, 25.0f);
        layoutParams4.rightMargin = iLk3;
        layoutParams4.leftMargin = iLk3;
        addView(oy, layoutParams4);
    }
}
