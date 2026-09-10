package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends FrameLayout {
    private PAGLogoView di;
    private TextView fi;
    private TextView ik;
    private String jbs;
    private slm ka;
    private bu lr;
    private wjv mj;
    private boolean qt;
    private boolean ri;
    private com.bytedance.sdk.openadsdk.core.ik.ri sf;
    private com.bytedance.sdk.openadsdk.core.di.mj xha;

    public jbs(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.slm.eb);
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.ik.ri riVar) {
        this.sf = riVar;
        TextView textView = this.fi;
        if (textView != null) {
            textView.setOnClickListener(riVar);
            this.fi.setOnTouchListener(this.sf);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            ri();
        }
    }

    private void lr() {
        Context context = getContext();
        boolean z = this.mj.bbu() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        fiVar.setGravity(1);
        fiVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(qd.lr(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iLr = qd.lr(context, 24.0f);
        layoutParams.rightMargin = iLr;
        layoutParams.leftMargin = iLr;
        addView(fiVar, layoutParams);
        bu buVar = new bu(context);
        this.lr = buVar;
        buVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(qd.lr(context, 80.0f), qd.lr(context, 80.0f));
        layoutParams2.bottomMargin = qd.lr(context, 12.0f);
        fiVar.addView(this.lr, layoutParams2);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.ik = mjVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mjVar.setEllipsize(truncateAt);
        this.ik.setGravity(17);
        this.ik.setMaxLines(2);
        this.ik.setMaxWidth(qd.lr(context, 180.0f));
        this.ik.setTextColor(-1);
        this.ik.setTextSize(2, 24.0f);
        fiVar.addView(this.ik, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.di.mj mjVar2 = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.xha = mjVar2;
        mjVar2.setEllipsize(truncateAt);
        this.xha.setGravity(17);
        this.xha.setMaxLines(2);
        this.xha.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.xha.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = qd.lr(context, 8.0f);
        fiVar.addView(this.xha, layoutParams3);
        this.ka = new slm(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, qd.lr(context, 16.0f));
        layoutParams4.topMargin = qd.lr(context, 12.0f);
        this.ka.setVisibility(8);
        fiVar.addView(this.ka, layoutParams4);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar3 = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.fi = mjVar3;
        mjVar3.setId(520093707);
        this.fi.setGravity(17);
        this.fi.setText(uq.ri(context, "tt_video_download_apk"));
        this.fi.setTextColor(-1);
        this.fi.setTextSize(2, 16.0f);
        this.fi.setBackground(com.bytedance.sdk.openadsdk.utils.sf.ri(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, qd.lr(context, 44.0f));
        layoutParams5.topMargin = qd.lr(context, 54.0f);
        fiVar.addView(this.fi, layoutParams5);
        if (!this.qt && this.mj.biu() && dw.ik(this.mj)) {
            this.fi.setVisibility(8);
        }
        this.di = PAGLogoView.createPAGLogoViewByMaterial(context, this.mj);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, qd.lr(context, 14.0f));
        layoutParams6.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_BOTTOM_START;
        layoutParams6.leftMargin = qd.lr(context, 18.0f);
        if (z) {
            layoutParams6.bottomMargin = qd.lr(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = qd.lr(context, 24.0f);
        }
        addView(this.di, layoutParams6);
    }

    public void ri(wjv wjvVar, String str, com.bytedance.sdk.openadsdk.core.ik.ri riVar, boolean z) {
        this.mj = wjvVar;
        this.jbs = str;
        this.qt = z;
        this.sf = riVar;
    }

    private void ri() {
        if (this.ri) {
            return;
        }
        this.ri = true;
        lr();
        this.fi.setOnClickListener(this.sf);
        this.fi.setOnTouchListener(this.sf);
        String strSkk = this.mj.skk();
        if (!TextUtils.isEmpty(strSkk)) {
            this.fi.setText(strSkk);
        }
        if (this.lr != null && this.mj.fb() != null && !TextUtils.isEmpty(this.mj.fb().ri())) {
            com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.mj.fb(), this.lr, this.mj);
        }
        slm slmVar = this.ka;
        if (slmVar != null) {
            qd.ri((TextView) null, slmVar, this.mj);
            if (this.mj.tyz() != null) {
                this.ka.setVisibility(0);
            }
        }
        if (this.ik != null) {
            if (this.mj.tyz() != null && !TextUtils.isEmpty(this.mj.tyz().lr())) {
                this.ik.setText(this.mj.tyz().lr());
            } else if (!TextUtils.isEmpty(this.mj.tpb())) {
                this.ik.setText(this.mj.tpb());
            } else {
                this.ik.setVisibility(8);
            }
        }
        if (this.xha != null) {
            String strXh = this.mj.xh();
            if (!TextUtils.isEmpty(strXh)) {
                this.xha.setText(strXh);
            } else {
                this.xha.setVisibility(8);
            }
        }
        this.di.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.jbs.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.ri(jbs.this.getContext(), jbs.this.mj, jbs.this.jbs);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
