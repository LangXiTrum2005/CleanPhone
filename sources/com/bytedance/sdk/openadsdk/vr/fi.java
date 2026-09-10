package com.bytedance.sdk.openadsdk.vr;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.core.di.mj;
import com.bytedance.sdk.openadsdk.core.di.xha;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends xha {
    public fi(Context context) {
        this(context, null);
    }

    private void ri(Context context) {
        setId(slm.vz);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        mj mjVar = new mj(context);
        int i = slm.ib;
        mjVar.setId(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        mjVar.setLayoutParams(layoutParams);
        mjVar.setIncludeFontPadding(false);
        mjVar.setText(uq.ri(context, "tt_video_without_wifi_tips"));
        mjVar.setTextColor(Color.parseColor("#cacaca"));
        mjVar.setTextSize(2, 14.0f);
        addView(mjVar);
        xha xhaVar = new xha(context);
        xhaVar.setId(slm.mvf);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, i);
        layoutParams2.addRule(13);
        xhaVar.setLayoutParams(layoutParams2);
        addView(xhaVar);
        com.bytedance.sdk.openadsdk.core.di.ka kaVar = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        kaVar.setId(slm.cem);
        int iLr = qd.lr(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iLr, iLr);
        layoutParams3.addRule(15);
        kaVar.setLayoutParams(layoutParams3);
        kaVar.setImageDrawable(uq.ik(context, "tt_new_play_video"));
        kaVar.setScaleType(ImageView.ScaleType.FIT_XY);
        xhaVar.addView(kaVar);
    }

    public fi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public fi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ri(context);
    }
}
