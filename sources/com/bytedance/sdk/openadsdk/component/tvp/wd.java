package com.bytedance.sdk.openadsdk.component.tvp;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class wd extends com.bytedance.sdk.openadsdk.core.mo.wd {
    private final com.bytedance.sdk.openadsdk.core.mo.jpc lnr;
    private final com.bytedance.sdk.openadsdk.core.mo.mml qdl;
    private final com.bytedance.sdk.openadsdk.core.mo.mml ud;

    public wd(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int iUd = ax.ud(context, 12.0f);
        int iUd2 = ax.ud(context, 16.0f);
        int iUd3 = ax.ud(context, 20.0f);
        int iUd4 = ax.ud(context, 24.0f);
        int iUd5 = ax.ud(context, 28.0f);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        this.qdl = mmlVar;
        mmlVar.setId(520093713);
        int iUd6 = ax.ud(getContext(), 5.0f);
        mmlVar.setPadding(iUd6, iUd6, iUd6, iUd6);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        mmlVar.setScaleType(scaleType);
        mmlVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.mml.qdl());
        mmlVar.setImageResource(ljh.mml(yt.qdl(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iUd5, iUd5);
        layoutParams.topMargin = iUd3;
        layoutParams.leftMargin = iUd2;
        layoutParams.setMarginStart(iUd2);
        mmlVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar2 = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        this.ud = mmlVar2;
        mmlVar2.setId(520093714);
        mmlVar2.setPadding(iUd6, iUd6, iUd6, iUd6);
        mmlVar2.setScaleType(scaleType);
        mmlVar2.setBackground(com.bytedance.sdk.openadsdk.core.widget.mml.qdl());
        mmlVar2.setImageResource(ljh.mml(yt.qdl(), "tt_close_btn"));
        if (mmlVar2.getDrawable() != null) {
            mmlVar2.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iUd5, iUd5);
        layoutParams2.topMargin = iUd3;
        layoutParams2.rightMargin = iUd2;
        layoutParams2.setMarginEnd(iUd2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        mmlVar2.setLayoutParams(layoutParams2);
        mmlVar2.setVisibility(4);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.lnr = jpcVar;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, iUd4);
        layoutParams3.topMargin = iUd3;
        layoutParams3.rightMargin = iUd2;
        layoutParams3.addRule(11);
        layoutParams3.setMarginEnd(iUd2);
        layoutParams3.addRule(21);
        jpcVar.setLayoutParams(layoutParams3);
        jpcVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.mml.ud());
        jpcVar.setGravity(17);
        jpcVar.setPadding(iUd, 0, iUd, 0);
        jpcVar.setTextColor(-1);
        jpcVar.setTextSize(1, 14.0f);
        jpcVar.setVisibility(4);
        addView(mmlVar);
        addView(jpcVar);
        addView(mmlVar2);
    }

    public com.bytedance.sdk.openadsdk.core.mo.jpc getTopCountDown() {
        return this.lnr;
    }

    public View getTopDislike() {
        return this.qdl;
    }

    public com.bytedance.sdk.openadsdk.core.mo.mml getTopSkip() {
        return this.ud;
    }
}
