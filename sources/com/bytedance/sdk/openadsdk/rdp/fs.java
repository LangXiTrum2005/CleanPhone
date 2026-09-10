package com.bytedance.sdk.openadsdk.rdp;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;

/* JADX INFO: loaded from: classes3.dex */
public class fs extends com.bytedance.sdk.openadsdk.core.mo.wd {
    public fs(Context context) {
        this(context, null);
    }

    private void qdl(Context context) {
        setId(jtx.syy);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(getContext());
        mmlVar.setId(jtx.ca);
        mmlVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mmlVar.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        mmlVar.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        mmlVar.setBackgroundColor(Color.parseColor("#7f000000"));
        mmlVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(mmlVar);
        com.bytedance.sdk.openadsdk.core.mo.wd wdVar = new com.bytedance.sdk.openadsdk.core.mo.wd(context);
        wdVar.setId(jtx.tdy);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        wdVar.setLayoutParams(layoutParams);
        addView(wdVar);
        int iUd = ax.ud(context, 44.0f);
        com.bytedance.sdk.openadsdk.core.widget.qdl qdlVar = new com.bytedance.sdk.openadsdk.core.widget.qdl(context);
        int i2 = jtx.ax;
        qdlVar.setId(i2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iUd, iUd);
        layoutParams2.addRule(14);
        qdlVar.setLayoutParams(layoutParams2);
        qdlVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        wdVar.addView(qdlVar);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar.setId(jtx.ag);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iUd, iUd);
        layoutParams3.addRule(8, i2);
        layoutParams3.addRule(19, i2);
        layoutParams3.addRule(5, i2);
        layoutParams3.addRule(7, i2);
        layoutParams3.addRule(18, i2);
        layoutParams3.addRule(6, i2);
        layoutParams3.addRule(14);
        jpcVar.setLayoutParams(layoutParams3);
        jpcVar.setBackground(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_circle_solid_mian"));
        jpcVar.setGravity(17);
        jpcVar.setTextColor(-1);
        jpcVar.setTextSize(2, 19.0f);
        jpcVar.setTypeface(Typeface.defaultFromStyle(1));
        jpcVar.setVisibility(8);
        wdVar.addView(jpcVar);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar2 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        int i3 = jtx.wc;
        jpcVar2.setId(i3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, i2);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = ax.ud(context, 6.0f);
        jpcVar2.setLayoutParams(layoutParams4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        jpcVar2.setEllipsize(truncateAt);
        jpcVar2.setMaxLines(1);
        jpcVar2.setTextColor(-1);
        jpcVar2.setTextSize(2, 12.0f);
        wdVar.addView(jpcVar2);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar3 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar3.setId(jtx.om);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(ax.ud(context, 100.0f), ax.ud(context, 28.0f));
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, i3);
        layoutParams5.topMargin = ax.ud(context, 20.0f);
        jpcVar3.setLayoutParams(layoutParams5);
        jpcVar3.setMinWidth(ax.ud(context, 72.0f));
        jpcVar3.setMaxLines(1);
        jpcVar3.setEllipsize(truncateAt);
        jpcVar3.setTextColor(-1);
        jpcVar3.setTextSize(2, 14.0f);
        jpcVar3.setBackground(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_ad_cover_btn_begin_bg"));
        jpcVar3.setGravity(17);
        int iUd2 = ax.ud(context, 10.0f);
        int iUd3 = ax.ud(context, 2.0f);
        jpcVar3.setPadding(iUd2, iUd3, iUd2, iUd3);
        jpcVar3.setVisibility(8);
        wdVar.addView(jpcVar3);
    }

    public fs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public fs(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        qdl(context);
    }
}
