package com.bytedance.sdk.openadsdk.vr;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.di.di;
import com.bytedance.sdk.openadsdk.core.di.xha;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.sf;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends xha {
    public ka(Context context) {
        this(context, null);
    }

    private void ri(Context context) {
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int iLr = qd.lr(context, 60.0f);
        com.bytedance.sdk.openadsdk.core.di.ik ikVar = new com.bytedance.sdk.openadsdk.core.di.ik(context);
        ikVar.setId(slm.evm);
        ikVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        ikVar.setBackgroundColor(0);
        addView(ikVar);
        com.bytedance.sdk.openadsdk.core.di.ka kaVar = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        kaVar.setId(slm.sz);
        kaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        kaVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ikVar.addView(kaVar);
        di diVar = new di(context);
        diVar.setId(slm.fb);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLr, iLr);
        layoutParams.gravity = 17;
        diVar.setLayoutParams(layoutParams);
        diVar.setIndeterminateDrawable(sf.ri(context, "tt_video_loading_progress_bar"));
        ikVar.addView(diVar);
        com.bytedance.sdk.openadsdk.core.di.ka kaVar2 = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        kaVar2.setId(slm.bzf);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        kaVar2.setLayoutParams(layoutParams2);
        kaVar2.setScaleType(ImageView.ScaleType.CENTER);
        kaVar2.setImageDrawable(sf.ri(context, "tt_play_movebar_textpage"));
        kaVar2.setVisibility(8);
        addView(kaVar2);
        View lrVar = new lr(context);
        lrVar.setId(slm.jm);
        lrVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(lrVar);
    }

    public ka(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ka(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ri(context);
    }
}
