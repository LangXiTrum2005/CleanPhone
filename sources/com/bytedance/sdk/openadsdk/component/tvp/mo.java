package com.bytedance.sdk.openadsdk.component.tvp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.media3.extractor.text.ttml.a;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.jtx;
import com.bytedance.sdk.openadsdk.core.widget.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.rq;

/* JADX INFO: loaded from: classes3.dex */
public class mo extends lnr {
    private final com.bytedance.sdk.openadsdk.core.mo.mzz exu;
    private final jtx rdp;

    public mo(Context context, ljh ljhVar) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#EDFCFF"), Color.parseColor("#FFF6FD")}));
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        this.exu = mzzVar;
        mzzVar.setId(520093758);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = ax.ud(context, 24.0f);
        layoutParams.topMargin = ax.ud(context, 56.0f);
        mzzVar.setLayoutParams(layoutParams);
        mzzVar.setClickable(false);
        mzzVar.setGravity(16);
        mzzVar.setOrientation(0);
        yt ytVar = new yt(context);
        this.mo = ytVar;
        ytVar.setId(520093759);
        this.mo.setLayoutParams(new LinearLayout.LayoutParams(ax.ud(context, 24.0f), ax.ud(context, 24.0f)));
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.wd = jpcVar;
        jpcVar.setId(520093761);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = ax.ud(context, 8.0f);
        this.wd.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar2 = this.wd;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        jpcVar2.setEllipsize(truncateAt);
        this.wd.setMaxLines(2);
        this.wd.setTextColor(Color.parseColor("#161823"));
        this.wd.setTextSize(12.0f);
        com.bytedance.sdk.openadsdk.core.mo.wd wdVar = new com.bytedance.sdk.openadsdk.core.mo.wd(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(ax.ud(context, 327.0f), -2);
        layoutParams3.addRule(13);
        layoutParams3.leftMargin = ax.ud(context, 24.0f);
        layoutParams3.rightMargin = ax.ud(context, 24.0f);
        wdVar.setLayoutParams(layoutParams3);
        yt ytVar2 = new yt(context);
        this.tvp = ytVar2;
        int i2 = com.bytedance.sdk.openadsdk.utils.jtx.ujt;
        ytVar2.setId(i2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(ax.ud(context, 80.0f), ax.ud(context, 80.0f));
        layoutParams4.addRule(14);
        this.tvp.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar3 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.to = jpcVar3;
        int i3 = com.bytedance.sdk.openadsdk.utils.jtx.ab;
        jpcVar3.setId(i3);
        this.to.setTextSize(24.0f);
        this.to.setTextColor(Color.parseColor("#161823"));
        this.to.setGravity(17);
        this.to.setMaxLines(1);
        this.to.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, i2);
        layoutParams5.topMargin = ax.ud(context, 12.0f);
        layoutParams5.addRule(14);
        this.to.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar4 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.rq = jpcVar4;
        int i4 = com.bytedance.sdk.openadsdk.utils.jtx.icv;
        jpcVar4.setId(i4);
        this.rq.setTextSize(16.0f);
        this.rq.setTextColor(Color.parseColor("#80161823"));
        this.rq.setGravity(17);
        this.rq.setMaxLines(2);
        this.rq.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(3, i3);
        layoutParams6.topMargin = ax.ud(context, 4.0f);
        layoutParams6.addRule(14);
        this.rq.setLayoutParams(layoutParams6);
        jtx jtxVar = new jtx(context);
        this.rdp = jtxVar;
        RelativeLayout.LayoutParams layoutParamsF = a.f(-2, -2, 14);
        layoutParamsF.topMargin = ax.ud(context, 12.0f);
        jtxVar.setLayoutParams(layoutParamsF);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar5 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.mzz = jpcVar5;
        jpcVar5.setId(520093717);
        this.mzz.setBackground(rq.qdl(context, "tt_reward_full_video_backup_btn_bg"));
        this.mzz.setEllipsize(truncateAt);
        this.mzz.setLines(1);
        this.mzz.setGravity(17);
        this.mzz.setTextColor(-1);
        this.mzz.setTextSize(16.0f);
        this.mzz.setTag("open_ad_click_button_tag");
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, ax.ud(context, 44.0f));
        layoutParams7.addRule(3, i4);
        layoutParams7.topMargin = ax.ud(context, 54.0f);
        layoutParams7.addRule(14);
        this.mzz.setLayoutParams(layoutParams7);
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, ljhVar);
        this.mml = pAGLogoViewCreatePAGLogoViewByMaterial;
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093757);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, ax.ud(context, 14.0f));
        layoutParams8.leftMargin = ax.ud(context, 16.0f);
        layoutParams8.bottomMargin = ax.ud(context, 24.0f);
        layoutParams8.addRule(12);
        this.mml.setLayoutParams(layoutParams8);
        addView(this.jpc);
        mzzVar.addView(this.mo);
        mzzVar.addView(this.wd);
        addView(mzzVar);
        wdVar.addView(this.tvp);
        wdVar.addView(this.to);
        wdVar.addView(this.rq);
        wdVar.addView(jtxVar);
        wdVar.addView(this.mzz);
        addView(wdVar);
        addView(this.mml);
    }

    @Override // com.bytedance.sdk.openadsdk.component.tvp.lnr
    public com.bytedance.sdk.openadsdk.core.mo.mml getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.tvp.lnr
    public com.bytedance.sdk.openadsdk.core.mo.jpc getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.tvp.lnr
    public jtx getScoreBar() {
        return this.rdp;
    }

    @Override // com.bytedance.sdk.openadsdk.component.tvp.lnr
    public View getUserInfo() {
        return this.exu;
    }
}
