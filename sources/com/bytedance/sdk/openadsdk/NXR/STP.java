package com.bytedance.sdk.openadsdk.NXR;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class STP extends com.bytedance.sdk.openadsdk.core.JXs.ebl {
    public STP(Context context) {
        this(context, null);
    }

    private void Lxb(Context context) {
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int iLk = le.lk(context, 60.0f);
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        lkVar.setId(com.bytedance.sdk.openadsdk.utils.STP.Bj);
        lkVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        lkVar.setBackgroundColor(0);
        addView(lkVar);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        zu.setId(com.bytedance.sdk.openadsdk.utils.STP.FtP);
        zu.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        zu.setScaleType(ImageView.ScaleType.CENTER_CROP);
        lkVar.addView(zu);
        com.bytedance.sdk.openadsdk.core.JXs.lc lcVar = new com.bytedance.sdk.openadsdk.core.JXs.lc(context);
        lcVar.setId(com.bytedance.sdk.openadsdk.utils.STP.goy);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLk, iLk);
        layoutParams.gravity = 17;
        lcVar.setLayoutParams(layoutParams);
        lcVar.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_video_loading_progress_bar"));
        lkVar.addView(lcVar);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu2 = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        zu2.setId(com.bytedance.sdk.openadsdk.utils.STP.nH);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        zu2.setLayoutParams(layoutParams2);
        zu2.setScaleType(ImageView.ScaleType.CENTER);
        zu2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_play_movebar_textpage"));
        zu2.setVisibility(8);
        addView(zu2);
        View sln = new sLN(context);
        sln.setId(com.bytedance.sdk.openadsdk.utils.STP.owi);
        sln.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(sln);
    }

    public STP(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public STP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lxb(context);
    }
}
