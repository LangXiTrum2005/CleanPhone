package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class QAg extends RelativeLayout {
    public QAg(Context context) {
        super(context);
        Lxb();
    }

    private void Lxb() {
        setId(com.bytedance.sdk.openadsdk.utils.STP.xr);
        setBackgroundColor(-1);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, le.lk(context, 44.0f)));
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        int i = com.bytedance.sdk.openadsdk.utils.STP.bG;
        zu.setId(i);
        zu.setClickable(true);
        zu.setFocusable(true);
        zu.setPadding(le.lk(context, 12.0f), le.lk(context, 14.0f), le.lk(context, 12.0f), le.lk(context, 14.0f));
        zu.setImageResource(tD.ZU(context, "tt_ad_xmark"));
        addView(zu, new RelativeLayout.LayoutParams(le.lk(context, 40.0f), le.lk(context, 44.0f)));
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu2 = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        int i2 = com.bytedance.sdk.openadsdk.utils.STP.MGT;
        zu2.setId(i2);
        zu2.setPadding(le.lk(context, 8.0f), le.lk(context, 10.0f), le.lk(context, 8.0f), le.lk(context, 10.0f));
        zu2.setImageResource(tD.ZU(context, "tt_ad_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(le.lk(context, 40.0f), le.lk(context, 44.0f));
        layoutParams.addRule(11);
        addView(zu2, layoutParams);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy.setId(com.bytedance.sdk.openadsdk.utils.STP.jeq);
        oy.setSingleLine(true);
        oy.setEllipsize(TextUtils.TruncateAt.END);
        oy.setGravity(17);
        oy.setTextColor(Color.parseColor("#222222"));
        oy.setTextSize(2, 17.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(le.lk(context, 191.0f), le.lk(context, 24.0f));
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, i2);
        layoutParams2.addRule(1, i);
        int iLk = le.lk(context, 10.0f);
        layoutParams2.leftMargin = iLk;
        layoutParams2.rightMargin = iLk;
        addView(oy, layoutParams2);
        com.bytedance.sdk.openadsdk.core.JXs.lc lcVar = new com.bytedance.sdk.openadsdk.core.JXs.lc(context, null, R.style.Widget.ProgressBar.Horizontal);
        lcVar.setId(com.bytedance.sdk.openadsdk.utils.STP.nTb);
        lcVar.setProgress(1);
        lcVar.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_privacy_progress_style"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, le.lk(context, 2.0f));
        layoutParams3.addRule(12);
        addView(lcVar, layoutParams3);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, le.lk(context, 0.5f));
        layoutParams4.addRule(12);
        addView(view, layoutParams4);
    }
}
