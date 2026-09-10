package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class tvp extends RelativeLayout {
    public tvp(Context context) {
        super(context);
        qdl();
    }

    private void qdl() {
        setId(com.bytedance.sdk.openadsdk.utils.jtx.dk);
        setBackgroundColor(-1);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, ax.ud(context, 44.0f)));
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        int i2 = com.bytedance.sdk.openadsdk.utils.jtx.ijp;
        mmlVar.setId(i2);
        mmlVar.setClickable(true);
        mmlVar.setFocusable(true);
        mmlVar.setPadding(ax.ud(context, 12.0f), ax.ud(context, 14.0f), ax.ud(context, 12.0f), ax.ud(context, 14.0f));
        mmlVar.setImageResource(ljh.mml(context, "tt_ad_xmark"));
        addView(mmlVar, new RelativeLayout.LayoutParams(ax.ud(context, 40.0f), ax.ud(context, 44.0f)));
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar2 = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        int i3 = com.bytedance.sdk.openadsdk.utils.jtx.en;
        mmlVar2.setId(i3);
        mmlVar2.setPadding(ax.ud(context, 8.0f), ax.ud(context, 10.0f), ax.ud(context, 8.0f), ax.ud(context, 10.0f));
        mmlVar2.setImageResource(ljh.mml(context, "tt_ad_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ax.ud(context, 40.0f), ax.ud(context, 44.0f));
        layoutParams.addRule(11);
        addView(mmlVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar.setId(com.bytedance.sdk.openadsdk.utils.jtx.zy);
        jpcVar.setSingleLine(true);
        jpcVar.setEllipsize(TextUtils.TruncateAt.END);
        jpcVar.setGravity(17);
        jpcVar.setTextColor(Color.parseColor("#222222"));
        jpcVar.setTextSize(2, 17.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ax.ud(context, 191.0f), ax.ud(context, 24.0f));
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, i3);
        layoutParams2.addRule(1, i2);
        int iUd = ax.ud(context, 10.0f);
        layoutParams2.leftMargin = iUd;
        layoutParams2.rightMargin = iUd;
        addView(jpcVar, layoutParams2);
        com.bytedance.sdk.openadsdk.core.mo.mo moVar = new com.bytedance.sdk.openadsdk.core.mo.mo(context, null, R.style.Widget.ProgressBar.Horizontal);
        moVar.setId(com.bytedance.sdk.openadsdk.utils.jtx.nz);
        moVar.setProgress(1);
        moVar.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_privacy_progress_style"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, ax.ud(context, 2.0f));
        layoutParams3.addRule(12);
        addView(moVar, layoutParams3);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, ax.ud(context, 0.5f));
        layoutParams4.addRule(12);
        addView(view, layoutParams4);
    }
}
