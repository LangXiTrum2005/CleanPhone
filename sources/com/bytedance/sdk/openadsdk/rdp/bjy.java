package com.bytedance.sdk.openadsdk.rdp;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;

/* JADX INFO: loaded from: classes3.dex */
public class bjy extends com.bytedance.sdk.openadsdk.core.mo.wd {
    public bjy(Context context) {
        this(context, null);
    }

    private void qdl(Context context) {
        setId(jtx.skm);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        int i2 = jtx.az;
        jpcVar.setId(i2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        jpcVar.setLayoutParams(layoutParams);
        jpcVar.setIncludeFontPadding(false);
        jpcVar.setText(ljh.qdl(context, "tt_video_without_wifi_tips"));
        jpcVar.setTextColor(Color.parseColor("#cacaca"));
        jpcVar.setTextSize(2, 14.0f);
        addView(jpcVar);
        com.bytedance.sdk.openadsdk.core.mo.wd wdVar = new com.bytedance.sdk.openadsdk.core.mo.wd(context);
        wdVar.setId(jtx.fhs);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, i2);
        layoutParams2.addRule(13);
        wdVar.setLayoutParams(layoutParams2);
        addView(wdVar);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        mmlVar.setId(jtx.bo);
        int iUd = ax.ud(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iUd, iUd);
        layoutParams3.addRule(15);
        mmlVar.setLayoutParams(layoutParams3);
        mmlVar.setImageDrawable(ljh.lnr(context, "tt_new_play_video"));
        mmlVar.setScaleType(ImageView.ScaleType.FIT_XY);
        wdVar.addView(mmlVar);
    }

    public bjy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public bjy(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        qdl(context);
    }
}
