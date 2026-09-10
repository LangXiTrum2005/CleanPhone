package com.bytedance.sdk.openadsdk.component.jbs;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.bu;
import com.bytedance.sdk.openadsdk.core.widget.slm;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.sf;

/* JADX INFO: loaded from: classes2.dex */
public class di extends ik {
    private final com.bytedance.sdk.openadsdk.core.di.fi aw;
    private final slm bgr;

    public di(Context context, wjv wjvVar) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#EDFCFF"), Color.parseColor("#FFF6FD")}));
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        this.aw = fiVar;
        fiVar.setId(520093758);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = qd.lr(context, 24.0f);
        layoutParams.topMargin = qd.lr(context, 56.0f);
        fiVar.setLayoutParams(layoutParams);
        fiVar.setClickable(false);
        fiVar.setGravity(16);
        fiVar.setOrientation(0);
        bu buVar = new bu(context);
        this.di = buVar;
        buVar.setId(520093759);
        this.di.setLayoutParams(new LinearLayout.LayoutParams(qd.lr(context, 24.0f), qd.lr(context, 24.0f)));
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.xha = mjVar;
        mjVar.setId(520093761);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = qd.lr(context, 8.0f);
        this.xha.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar2 = this.xha;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mjVar2.setEllipsize(truncateAt);
        this.xha.setMaxLines(2);
        this.xha.setTextColor(Color.parseColor("#161823"));
        this.xha.setTextSize(12.0f);
        com.bytedance.sdk.openadsdk.core.di.xha xhaVar = new com.bytedance.sdk.openadsdk.core.di.xha(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(qd.lr(context, 327.0f), -2);
        layoutParams3.addRule(13);
        layoutParams3.leftMargin = qd.lr(context, 24.0f);
        layoutParams3.rightMargin = qd.lr(context, 24.0f);
        xhaVar.setLayoutParams(layoutParams3);
        bu buVar2 = new bu(context);
        this.jbs = buVar2;
        int i = com.bytedance.sdk.openadsdk.utils.slm.zyu;
        buVar2.setId(i);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(qd.lr(context, 80.0f), qd.lr(context, 80.0f));
        layoutParams4.addRule(14);
        this.jbs.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar3 = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.qt = mjVar3;
        int i2 = com.bytedance.sdk.openadsdk.utils.slm.rko;
        mjVar3.setId(i2);
        this.qt.setTextSize(24.0f);
        this.qt.setTextColor(Color.parseColor("#161823"));
        this.qt.setGravity(17);
        this.qt.setMaxLines(1);
        this.qt.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, i);
        layoutParams5.topMargin = qd.lr(context, 12.0f);
        layoutParams5.addRule(14);
        this.qt.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar4 = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.sf = mjVar4;
        int i3 = com.bytedance.sdk.openadsdk.utils.slm.quz;
        mjVar4.setId(i3);
        this.sf.setTextSize(16.0f);
        this.sf.setTextColor(Color.parseColor("#80161823"));
        this.sf.setGravity(17);
        this.sf.setMaxLines(2);
        this.sf.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(3, i2);
        layoutParams6.topMargin = qd.lr(context, 4.0f);
        layoutParams6.addRule(14);
        this.sf.setLayoutParams(layoutParams6);
        slm slmVar = new slm(context);
        this.bgr = slmVar;
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(14);
        layoutParams7.topMargin = qd.lr(context, 12.0f);
        slmVar.setLayoutParams(layoutParams7);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar5 = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.fi = mjVar5;
        mjVar5.setId(520093717);
        this.fi.setBackground(sf.ri(context, "tt_reward_full_video_backup_btn_bg"));
        this.fi.setEllipsize(truncateAt);
        this.fi.setLines(1);
        this.fi.setGravity(17);
        this.fi.setTextColor(-1);
        this.fi.setTextSize(16.0f);
        this.fi.setTag("open_ad_click_button_tag");
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, qd.lr(context, 44.0f));
        layoutParams8.addRule(3, i3);
        layoutParams8.topMargin = qd.lr(context, 54.0f);
        layoutParams8.addRule(14);
        this.fi.setLayoutParams(layoutParams8);
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, wjvVar);
        this.ka = pAGLogoViewCreatePAGLogoViewByMaterial;
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093757);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, qd.lr(context, 14.0f));
        layoutParams9.leftMargin = qd.lr(context, 16.0f);
        layoutParams9.bottomMargin = qd.lr(context, 24.0f);
        layoutParams9.addRule(12);
        this.ka.setLayoutParams(layoutParams9);
        addView(this.mj);
        fiVar.addView(this.di);
        fiVar.addView(this.xha);
        addView(fiVar);
        xhaVar.addView(this.jbs);
        xhaVar.addView(this.qt);
        xhaVar.addView(this.sf);
        xhaVar.addView(slmVar);
        xhaVar.addView(this.fi);
        addView(xhaVar);
        addView(this.ka);
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.ik
    public com.bytedance.sdk.openadsdk.core.di.ka getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.ik
    public com.bytedance.sdk.openadsdk.core.di.mj getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.ik
    public slm getScoreBar() {
        return this.bgr;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.ik
    public View getUserInfo() {
        return this.aw;
    }
}
