package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.zf;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends com.bytedance.sdk.openadsdk.core.di.xha {
    private boolean di;
    private boolean fi;
    private mj ik;
    private com.bytedance.sdk.openadsdk.core.di.mj ka;
    private com.bytedance.sdk.openadsdk.core.di.mj lr;
    private bu ri;

    public xha(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (ri()) {
            lr();
        }
    }

    public com.bytedance.sdk.openadsdk.core.di.mj getDownloadButton() {
        return this.ka;
    }

    public mj getLoadingProgressBar() {
        return this.ik;
    }

    public void lr() {
        if (this.fi) {
            return;
        }
        this.fi = true;
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        bu buVar = new bu(context);
        this.ri = buVar;
        buVar.setId(520093745);
        int iLr = qd.lr(context, 64.0f);
        this.ri.setLayoutParams(new RelativeLayout.LayoutParams(iLr, iLr));
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.lr = mjVar;
        mjVar.setId(520093746);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(qd.lr(context, 219.0f), -2);
        layoutParams2.topMargin = qd.lr(context, 16.0f);
        this.lr.setLayoutParams(layoutParams2);
        this.lr.setEllipsize(TextUtils.TruncateAt.END);
        this.lr.setGravity(17);
        this.lr.setMaxWidth(qd.lr(context, 150.0f));
        this.lr.setMaxLines(2);
        this.lr.setTextColor(-1);
        this.lr.setTextSize(1, 16.0f);
        mj mjVar2 = new mj(context);
        this.ik = mjVar2;
        mjVar2.setId(520093748);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(qd.lr(context, 219.0f), qd.lr(context, 6.0f));
        layoutParams3.topMargin = qd.lr(context, 24.0f);
        this.ik.setLayoutParams(layoutParams3);
        this.ka = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(qd.lr(context, 138.0f), qd.lr(context, 42.0f));
        layoutParams4.topMargin = qd.lr(context, 48.0f);
        this.ka.setLayoutParams(layoutParams4);
        this.ka.setTextColor(-1);
        this.ka.setTextSize(16.0f);
        this.ka.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(2, -1);
        gradientDrawable.setCornerRadius(layoutParams4.height / 2);
        this.ka.setBackground(gradientDrawable);
        linearLayout.addView(this.ri);
        linearLayout.addView(this.lr);
        linearLayout.addView(this.ik);
        linearLayout.addView(this.ka);
        addView(linearLayout);
    }

    public boolean ri() {
        return true;
    }

    public void setProgress(int i) {
        mj mjVar = this.ik;
        if (mjVar != null) {
            mjVar.setProgress(i);
        }
    }

    public void ri(wjv wjvVar, int i) {
        if (!this.fi || wjvVar == null || this.di) {
            return;
        }
        this.di = true;
        boolean zEvm = wjvVar.evm();
        if (zEvm || wjvVar.fb() == null || TextUtils.isEmpty(wjvVar.fb().ri())) {
            this.ri.setVisibility(8);
        } else {
            try {
                com.bytedance.sdk.openadsdk.qt.ka.ri(wjvVar.fb()).ik(1).ri(new com.bytedance.sdk.openadsdk.qt.lr(wjvVar, wjvVar.fb().ri(), new zf(this.ri)));
            } catch (Throwable unused) {
                this.ri.setVisibility(8);
            }
        }
        if (zEvm) {
            this.lr.setText("Loading");
        } else if (TextUtils.isEmpty(wjvVar.xh())) {
            this.lr.setVisibility(8);
        } else {
            this.lr.setText(wjvVar.xh());
        }
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = this.ka;
        if (mjVar != null) {
            mjVar.setText(wjvVar.skk());
        }
    }
}
