package com.bytedance.sdk.openadsdk.rdp;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;

/* JADX INFO: loaded from: classes3.dex */
public class rdp extends com.bytedance.sdk.openadsdk.core.mo.wd {
    public rdp(Context context) {
        this(context, null);
    }

    private void qdl(Context context) {
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int iUd = ax.ud(context, 60.0f);
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        lnrVar.setId(jtx.gsp);
        lnrVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        lnrVar.setBackgroundColor(0);
        addView(lnrVar);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        mmlVar.setId(jtx.ygv);
        mmlVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        mmlVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        lnrVar.addView(mmlVar);
        com.bytedance.sdk.openadsdk.core.mo.mo moVar = new com.bytedance.sdk.openadsdk.core.mo.mo(context);
        moVar.setId(jtx.hr);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iUd, iUd);
        layoutParams.gravity = 17;
        moVar.setLayoutParams(layoutParams);
        moVar.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_video_loading_progress_bar"));
        lnrVar.addView(moVar);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar2 = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        mmlVar2.setId(jtx.hd);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        mmlVar2.setLayoutParams(layoutParams2);
        mmlVar2.setScaleType(ImageView.ScaleType.CENTER);
        mmlVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_play_movebar_textpage"));
        mmlVar2.setVisibility(8);
        addView(mmlVar2);
        View fsVar = new fs(context);
        fsVar.setId(jtx.syy);
        fsVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(fsVar);
    }

    public rdp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public rdp(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        qdl(context);
    }
}
