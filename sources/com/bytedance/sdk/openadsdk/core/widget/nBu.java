package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class nBu extends FrameLayout {
    private TextView JXs;
    private kqm LD;
    private boolean Lxb;
    private com.bytedance.sdk.openadsdk.core.model.tD OY;
    private String QAg;
    private VVE ZU;
    private com.bytedance.sdk.openadsdk.core.JXs.OY ebl;
    private PAGLogoView lc;
    private TextView lk;
    private com.bytedance.sdk.openadsdk.core.LD.Lxb nBu;

    public nBu(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.STP.wCT);
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.LD.Lxb lxb) {
        this.nBu = lxb;
        TextView textView = this.JXs;
        if (textView != null) {
            textView.setOnClickListener(lxb);
            this.JXs.setOnTouchListener(this.nBu);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            Lxb();
        }
    }

    private void LD() {
        Context context = getContext();
        boolean z = this.OY.wCT() == 1;
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs.setGravity(1);
        jXs.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(le.lk(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iLk = le.lk(context, 24.0f);
        layoutParams.rightMargin = iLk;
        layoutParams.leftMargin = iLk;
        addView(jXs, layoutParams);
        kqm kqmVar = new kqm(context);
        this.LD = kqmVar;
        kqmVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(le.lk(context, 80.0f), le.lk(context, 80.0f));
        layoutParams2.bottomMargin = le.lk(context, 12.0f);
        jXs.addView(this.LD, layoutParams2);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.lk = oy;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        oy.setEllipsize(truncateAt);
        this.lk.setGravity(17);
        this.lk.setMaxLines(2);
        this.lk.setMaxWidth(le.lk(context, 180.0f));
        this.lk.setTextColor(-1);
        this.lk.setTextSize(2, 24.0f);
        jXs.addView(this.lk, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.JXs.OY oy2 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.ebl = oy2;
        oy2.setEllipsize(truncateAt);
        this.ebl.setGravity(17);
        this.ebl.setMaxLines(2);
        this.ebl.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.ebl.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = le.lk(context, 8.0f);
        jXs.addView(this.ebl, layoutParams3);
        this.ZU = new VVE(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, le.lk(context, 16.0f));
        layoutParams4.topMargin = le.lk(context, 12.0f);
        this.ZU.setVisibility(8);
        jXs.addView(this.ZU, layoutParams4);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy3 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.JXs = oy3;
        oy3.setId(520093707);
        this.JXs.setGravity(17);
        this.JXs.setText(com.bytedance.sdk.component.utils.tD.Lxb(context, "tt_video_download_apk"));
        this.JXs.setTextColor(-1);
        this.JXs.setTextSize(2, 16.0f);
        this.JXs.setBackground(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, le.lk(context, 44.0f));
        layoutParams5.topMargin = le.lk(context, 54.0f);
        jXs.addView(this.JXs, layoutParams5);
        this.lc = new PAGLogoView(context);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, le.lk(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = le.lk(context, 18.0f);
        if (z) {
            layoutParams6.bottomMargin = le.lk(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = le.lk(context, 24.0f);
        }
        addView(this.lc, layoutParams6);
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, String str, com.bytedance.sdk.openadsdk.core.LD.Lxb lxb) {
        this.OY = tDVar;
        this.QAg = str;
        this.nBu = lxb;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void Lxb() {
        if (this.Lxb) {
            return;
        }
        this.Lxb = true;
        LD();
        this.JXs.setOnClickListener(this.nBu);
        this.JXs.setOnTouchListener(this.nBu);
        String strXr = this.OY.xr();
        if (!TextUtils.isEmpty(strXr)) {
            this.JXs.setText(strXr);
        }
        if (this.LD != null && this.OY.Lpq() != null && !TextUtils.isEmpty(this.OY.Lpq().Lxb())) {
            com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.OY.Lpq(), this.LD, this.OY);
        }
        VVE vve = this.ZU;
        if (vve != null) {
            le.Lxb((TextView) null, vve, this.OY);
            if (this.OY.MGT() != null) {
                this.ZU.setVisibility(0);
            }
        }
        if (this.lk != null) {
            if (this.OY.MGT() != null && !TextUtils.isEmpty(this.OY.MGT().LD())) {
                this.lk.setText(this.OY.MGT().LD());
            } else if (!TextUtils.isEmpty(this.OY.VU())) {
                this.lk.setText(this.OY.VU());
            } else {
                this.lk.setVisibility(8);
            }
        }
        if (this.ebl != null) {
            String strFD = this.OY.FD();
            if (!TextUtils.isEmpty(strFD)) {
                this.ebl.setText(strFD);
            } else {
                this.ebl.setVisibility(8);
            }
        }
        this.lc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.nBu.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.Lxb(nBu.this.getContext(), nBu.this.OY, nBu.this.QAg);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
