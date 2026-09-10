package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class tvp extends FrameLayout {
    private ljh jpc;
    private TextView lnr;
    private jtx mml;
    private PAGLogoView mo;
    private TextView mzz;
    private boolean qdl;
    private com.bytedance.sdk.openadsdk.core.lnr.qdl rq;
    private boolean to;
    private String tvp;
    private yt ud;
    private com.bytedance.sdk.openadsdk.core.mo.jpc wd;

    public tvp(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.jtx.ji);
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar) {
        this.rq = qdlVar;
        TextView textView = this.mzz;
        if (textView != null) {
            textView.setOnClickListener(qdlVar);
            this.mzz.setOnTouchListener(this.rq);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 == 0) {
            qdl();
        }
    }

    private void ud() {
        Context context = getContext();
        boolean z2 = this.jpc.jb() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar.setGravity(1);
        mzzVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z2 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(ax.ud(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iUd = ax.ud(context, 24.0f);
        layoutParams.rightMargin = iUd;
        layoutParams.leftMargin = iUd;
        addView(mzzVar, layoutParams);
        yt ytVar = new yt(context);
        this.ud = ytVar;
        ytVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(ax.ud(context, 80.0f), ax.ud(context, 80.0f));
        layoutParams2.bottomMargin = ax.ud(context, 12.0f);
        mzzVar.addView(this.ud, layoutParams2);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.lnr = jpcVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        jpcVar.setEllipsize(truncateAt);
        this.lnr.setGravity(17);
        this.lnr.setMaxLines(2);
        this.lnr.setMaxWidth(ax.ud(context, 180.0f));
        this.lnr.setTextColor(-1);
        this.lnr.setTextSize(2, 24.0f);
        mzzVar.addView(this.lnr, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar2 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.wd = jpcVar2;
        jpcVar2.setEllipsize(truncateAt);
        this.wd.setGravity(17);
        this.wd.setMaxLines(2);
        this.wd.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.wd.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = ax.ud(context, 8.0f);
        mzzVar.addView(this.wd, layoutParams3);
        this.mml = new jtx(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, ax.ud(context, 16.0f));
        layoutParams4.topMargin = ax.ud(context, 12.0f);
        this.mml.setVisibility(8);
        mzzVar.addView(this.mml, layoutParams4);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar3 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.mzz = jpcVar3;
        jpcVar3.setId(520093707);
        this.mzz.setGravity(17);
        this.mzz.setText(com.bytedance.sdk.component.utils.ljh.qdl(context, "tt_video_download_apk"));
        this.mzz.setTextColor(-1);
        this.mzz.setTextSize(2, 16.0f);
        this.mzz.setBackground(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, ax.ud(context, 44.0f));
        layoutParams5.topMargin = ax.ud(context, 54.0f);
        mzzVar.addView(this.mzz, layoutParams5);
        if (!this.to && this.jpc.qur() && vu.lnr(this.jpc)) {
            this.mzz.setVisibility(8);
        }
        this.mo = PAGLogoView.createPAGLogoViewByMaterial(context, this.jpc);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, ax.ud(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = ax.ud(context, 18.0f);
        if (z2) {
            layoutParams6.bottomMargin = ax.ud(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = ax.ud(context, 24.0f);
        }
        addView(this.mo, layoutParams6);
    }

    public void qdl(ljh ljhVar, String str, com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar, boolean z2) {
        this.jpc = ljhVar;
        this.tvp = str;
        this.to = z2;
        this.rq = qdlVar;
    }

    private void qdl() {
        if (this.qdl) {
            return;
        }
        this.qdl = true;
        ud();
        this.mzz.setOnClickListener(this.rq);
        this.mzz.setOnTouchListener(this.rq);
        String strUvi = this.jpc.uvi();
        if (!TextUtils.isEmpty(strUvi)) {
            this.mzz.setText(strUvi);
        }
        if (this.ud != null && this.jpc.hcs() != null && !TextUtils.isEmpty(this.jpc.hcs().qdl())) {
            com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.jpc.hcs(), this.ud, this.jpc);
        }
        jtx jtxVar = this.mml;
        if (jtxVar != null) {
            ax.qdl((TextView) null, jtxVar, this.jpc);
            if (this.jpc.fhs() != null) {
                this.mml.setVisibility(0);
            }
        }
        if (this.lnr != null) {
            if (this.jpc.fhs() != null && !TextUtils.isEmpty(this.jpc.fhs().ud())) {
                this.lnr.setText(this.jpc.fhs().ud());
            } else if (!TextUtils.isEmpty(this.jpc.ca())) {
                this.lnr.setText(this.jpc.ca());
            } else {
                this.lnr.setVisibility(8);
            }
        }
        if (this.wd != null) {
            String strGsv = this.jpc.gsv();
            if (!TextUtils.isEmpty(strGsv)) {
                this.wd.setText(strGsv);
            } else {
                this.wd.setVisibility(8);
            }
        }
        this.mo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.tvp.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.qdl(tvp.this.getContext(), tvp.this.jpc, tvp.this.tvp);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
