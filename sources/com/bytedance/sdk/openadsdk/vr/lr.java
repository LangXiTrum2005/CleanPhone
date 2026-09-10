package com.bytedance.sdk.openadsdk.vr;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.di.mj;
import com.bytedance.sdk.openadsdk.core.di.xha;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.sf;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends xha {
    public lr(Context context) {
        this(context, null);
    }

    private void ri(Context context) {
        setId(slm.jm);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        com.bytedance.sdk.openadsdk.core.di.ka kaVar = new com.bytedance.sdk.openadsdk.core.di.ka(getContext());
        kaVar.setId(slm.ezp);
        kaVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        kaVar.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        kaVar.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        kaVar.setBackgroundColor(Color.parseColor("#7f000000"));
        kaVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(kaVar);
        xha xhaVar = new xha(context);
        xhaVar.setId(slm.adz);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        xhaVar.setLayoutParams(layoutParams);
        addView(xhaVar);
        int iLr = qd.lr(context, 44.0f);
        com.bytedance.sdk.openadsdk.core.widget.ri riVar = new com.bytedance.sdk.openadsdk.core.widget.ri(context);
        int i = slm.kt;
        riVar.setId(i);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iLr, iLr);
        layoutParams2.addRule(14);
        riVar.setLayoutParams(layoutParams2);
        riVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        xhaVar.addView(riVar);
        mj mjVar = new mj(context);
        mjVar.setId(slm.feb);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iLr, iLr);
        layoutParams3.addRule(8, i);
        layoutParams3.addRule(19, i);
        layoutParams3.addRule(5, i);
        layoutParams3.addRule(7, i);
        layoutParams3.addRule(18, i);
        layoutParams3.addRule(6, i);
        layoutParams3.addRule(14);
        mjVar.setLayoutParams(layoutParams3);
        mjVar.setBackground(sf.ri(context, "tt_circle_solid_mian"));
        mjVar.setGravity(17);
        mjVar.setTextColor(-1);
        mjVar.setTextSize(2, 19.0f);
        mjVar.setTypeface(Typeface.defaultFromStyle(1));
        mjVar.setVisibility(8);
        xhaVar.addView(mjVar);
        mj mjVar2 = new mj(context);
        int i2 = slm.zyn;
        mjVar2.setId(i2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, i);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = qd.lr(context, 6.0f);
        mjVar2.setLayoutParams(layoutParams4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mjVar2.setEllipsize(truncateAt);
        mjVar2.setMaxLines(1);
        mjVar2.setTextColor(-1);
        mjVar2.setTextSize(2, 12.0f);
        xhaVar.addView(mjVar2);
        mj mjVar3 = new mj(context);
        mjVar3.setId(slm.tnn);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(qd.lr(context, 100.0f), qd.lr(context, 28.0f));
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, i2);
        layoutParams5.topMargin = qd.lr(context, 20.0f);
        mjVar3.setLayoutParams(layoutParams5);
        mjVar3.setMinWidth(qd.lr(context, 72.0f));
        mjVar3.setMaxLines(1);
        mjVar3.setEllipsize(truncateAt);
        mjVar3.setTextColor(-1);
        mjVar3.setTextSize(2, 14.0f);
        mjVar3.setBackground(sf.ri(context, "tt_ad_cover_btn_begin_bg"));
        mjVar3.setGravity(17);
        int iLr2 = qd.lr(context, 10.0f);
        int iLr3 = qd.lr(context, 2.0f);
        mjVar3.setPadding(iLr2, iLr3, iLr2, iLr3);
        mjVar3.setVisibility(8);
        xhaVar.addView(mjVar3);
    }

    public lr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public lr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ri(context);
    }
}
