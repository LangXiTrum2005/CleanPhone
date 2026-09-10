package com.bytedance.sdk.openadsdk.NXR;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class IeN extends com.bytedance.sdk.openadsdk.core.JXs.ebl {
    public IeN(Context context) {
        this(context, null);
    }

    private void Lxb(Context context) {
        setId(com.bytedance.sdk.openadsdk.utils.STP.cR);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        int i = com.bytedance.sdk.openadsdk.utils.STP.IG;
        oy.setId(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        oy.setLayoutParams(layoutParams);
        oy.setIncludeFontPadding(false);
        oy.setText(tD.Lxb(context, "tt_video_without_wifi_tips"));
        oy.setTextColor(Color.parseColor("#cacaca"));
        oy.setTextSize(2, 14.0f);
        addView(oy);
        com.bytedance.sdk.openadsdk.core.JXs.ebl eblVar = new com.bytedance.sdk.openadsdk.core.JXs.ebl(context);
        eblVar.setId(com.bytedance.sdk.openadsdk.utils.STP.qEi);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, i);
        layoutParams2.addRule(13);
        eblVar.setLayoutParams(layoutParams2);
        addView(eblVar);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        zu.setId(com.bytedance.sdk.openadsdk.utils.STP.mW);
        int iLk = le.lk(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iLk, iLk);
        layoutParams3.addRule(15);
        zu.setLayoutParams(layoutParams3);
        zu.setImageDrawable(tD.lk(context, "tt_new_play_video"));
        zu.setScaleType(ImageView.ScaleType.FIT_XY);
        eblVar.addView(zu);
    }

    public IeN(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IeN(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lxb(context);
    }
}
