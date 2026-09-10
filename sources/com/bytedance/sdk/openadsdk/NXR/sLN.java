package com.bytedance.sdk.openadsdk.NXR;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class sLN extends com.bytedance.sdk.openadsdk.core.JXs.ebl {
    public sLN(Context context) {
        this(context, null);
    }

    private void Lxb(Context context) {
        setId(com.bytedance.sdk.openadsdk.utils.STP.owi);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(getContext());
        zu.setId(com.bytedance.sdk.openadsdk.utils.STP.ek);
        zu.setScaleType(ImageView.ScaleType.CENTER_CROP);
        zu.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        zu.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        zu.setBackgroundColor(Color.parseColor("#7f000000"));
        zu.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(zu);
        com.bytedance.sdk.openadsdk.core.JXs.ebl eblVar = new com.bytedance.sdk.openadsdk.core.JXs.ebl(context);
        eblVar.setId(com.bytedance.sdk.openadsdk.utils.STP.TA);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        eblVar.setLayoutParams(layoutParams);
        addView(eblVar);
        int iLk = le.lk(context, 44.0f);
        com.bytedance.sdk.openadsdk.core.widget.Lxb lxb = new com.bytedance.sdk.openadsdk.core.widget.Lxb(context);
        int i = com.bytedance.sdk.openadsdk.utils.STP.dR;
        lxb.setId(i);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iLk, iLk);
        layoutParams2.addRule(14);
        lxb.setLayoutParams(layoutParams2);
        lxb.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        eblVar.addView(lxb);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy.setId(com.bytedance.sdk.openadsdk.utils.STP.NDz);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iLk, iLk);
        layoutParams3.addRule(8, i);
        layoutParams3.addRule(19, i);
        layoutParams3.addRule(5, i);
        layoutParams3.addRule(7, i);
        layoutParams3.addRule(18, i);
        layoutParams3.addRule(6, i);
        layoutParams3.addRule(14);
        oy.setLayoutParams(layoutParams3);
        oy.setBackground(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_circle_solid_mian"));
        oy.setGravity(17);
        oy.setTextColor(-1);
        oy.setTextSize(2, 19.0f);
        oy.setTypeface(Typeface.defaultFromStyle(1));
        oy.setVisibility(8);
        eblVar.addView(oy);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy2 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        int i2 = com.bytedance.sdk.openadsdk.utils.STP.JJ;
        oy2.setId(i2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, i);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = le.lk(context, 6.0f);
        oy2.setLayoutParams(layoutParams4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        oy2.setEllipsize(truncateAt);
        oy2.setMaxLines(1);
        oy2.setTextColor(-1);
        oy2.setTextSize(2, 12.0f);
        eblVar.addView(oy2);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy3 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy3.setId(com.bytedance.sdk.openadsdk.utils.STP.VU);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(le.lk(context, 100.0f), le.lk(context, 28.0f));
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, i2);
        layoutParams5.topMargin = le.lk(context, 20.0f);
        oy3.setLayoutParams(layoutParams5);
        oy3.setMinWidth(le.lk(context, 72.0f));
        oy3.setMaxLines(1);
        oy3.setEllipsize(truncateAt);
        oy3.setTextColor(-1);
        oy3.setTextSize(2, 14.0f);
        oy3.setBackground(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_ad_cover_btn_begin_bg"));
        oy3.setGravity(17);
        int iLk2 = le.lk(context, 10.0f);
        int iLk3 = le.lk(context, 2.0f);
        oy3.setPadding(iLk2, iLk3, iLk2, iLk3);
        oy3.setVisibility(8);
        eblVar.addView(oy3);
    }

    public sLN(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public sLN(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lxb(context);
    }
}
