package com.bytedance.sdk.openadsdk.component.QAg;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.VVE;
import com.bytedance.sdk.openadsdk.core.widget.kqm;
import com.bytedance.sdk.openadsdk.utils.QAg;
import com.bytedance.sdk.openadsdk.utils.STP;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class lc extends lk {
    private final com.bytedance.sdk.openadsdk.core.JXs.JXs NXR;
    private final VVE STP;

    public lc(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#EDFCFF"), Color.parseColor("#FFF6FD")}));
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        this.NXR = jXs;
        jXs.setId(520093758);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = le.lk(context, 24.0f);
        layoutParams.topMargin = le.lk(context, 56.0f);
        jXs.setLayoutParams(layoutParams);
        jXs.setClickable(false);
        jXs.setGravity(16);
        jXs.setOrientation(0);
        kqm kqmVar = new kqm(context);
        this.lc = kqmVar;
        kqmVar.setId(520093759);
        this.lc.setLayoutParams(new LinearLayout.LayoutParams(le.lk(context, 24.0f), le.lk(context, 24.0f)));
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.ebl = oy;
        oy.setId(520093761);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = le.lk(context, 8.0f);
        this.ebl.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy2 = this.ebl;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        oy2.setEllipsize(truncateAt);
        this.ebl.setMaxLines(2);
        this.ebl.setTextColor(Color.parseColor("#161823"));
        this.ebl.setTextSize(12.0f);
        com.bytedance.sdk.openadsdk.core.JXs.ebl eblVar = new com.bytedance.sdk.openadsdk.core.JXs.ebl(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(le.lk(context, 327.0f), -2);
        layoutParams3.addRule(13);
        layoutParams3.leftMargin = le.lk(context, 24.0f);
        layoutParams3.rightMargin = le.lk(context, 24.0f);
        eblVar.setLayoutParams(layoutParams3);
        kqm kqmVar2 = new kqm(context);
        this.QAg = kqmVar2;
        int i = STP.uTT;
        kqmVar2.setId(i);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(le.lk(context, 80.0f), le.lk(context, 80.0f));
        layoutParams4.addRule(14);
        this.QAg.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy3 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.nBu = oy3;
        int i2 = STP.kVf;
        oy3.setId(i2);
        this.nBu.setTextSize(24.0f);
        this.nBu.setTextColor(Color.parseColor("#161823"));
        this.nBu.setGravity(17);
        this.nBu.setMaxLines(1);
        this.nBu.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, i);
        layoutParams5.topMargin = le.lk(context, 12.0f);
        layoutParams5.addRule(14);
        this.nBu.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy4 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.JVA = oy4;
        int i3 = STP.GX;
        oy4.setId(i3);
        this.JVA.setTextSize(16.0f);
        this.JVA.setTextColor(Color.parseColor("#80161823"));
        this.JVA.setGravity(17);
        this.JVA.setMaxLines(2);
        this.JVA.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(3, i2);
        layoutParams6.topMargin = le.lk(context, 4.0f);
        layoutParams6.addRule(14);
        this.JVA.setLayoutParams(layoutParams6);
        VVE vve = new VVE(context);
        this.STP = vve;
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(14);
        layoutParams7.topMargin = le.lk(context, 12.0f);
        vve.setLayoutParams(layoutParams7);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy5 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.JXs = oy5;
        oy5.setId(520093717);
        this.JXs.setBackground(QAg.Lxb(context, "tt_reward_full_video_backup_btn_bg"));
        this.JXs.setEllipsize(truncateAt);
        this.JXs.setLines(1);
        this.JXs.setGravity(17);
        this.JXs.setTextColor(-1);
        this.JXs.setTextSize(16.0f);
        this.JXs.setTag("open_ad_click_button_tag");
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, le.lk(context, 44.0f));
        layoutParams8.addRule(3, i3);
        layoutParams8.topMargin = le.lk(context, 54.0f);
        layoutParams8.addRule(14);
        this.JXs.setLayoutParams(layoutParams8);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.ZU = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, le.lk(context, 14.0f));
        layoutParams9.leftMargin = le.lk(context, 16.0f);
        layoutParams9.bottomMargin = le.lk(context, 24.0f);
        layoutParams9.addRule(12);
        this.ZU.setLayoutParams(layoutParams9);
        addView(this.OY);
        jXs.addView(this.lc);
        jXs.addView(this.ebl);
        addView(jXs);
        eblVar.addView(this.QAg);
        eblVar.addView(this.nBu);
        eblVar.addView(this.JVA);
        eblVar.addView(vve);
        eblVar.addView(this.JXs);
        addView(eblVar);
        addView(this.ZU);
    }

    @Override // com.bytedance.sdk.openadsdk.component.QAg.lk
    public com.bytedance.sdk.openadsdk.core.JXs.ZU getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.QAg.lk
    public com.bytedance.sdk.openadsdk.core.JXs.OY getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.QAg.lk
    public VVE getScoreBar() {
        return this.STP;
    }

    @Override // com.bytedance.sdk.openadsdk.component.QAg.lk
    public View getUserInfo() {
        return this.NXR;
    }
}
