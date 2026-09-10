package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.koa;

/* JADX INFO: loaded from: classes3.dex */
public class wd extends com.bytedance.sdk.openadsdk.core.mo.wd {
    private jpc lnr;
    private com.bytedance.sdk.openadsdk.core.mo.jpc mml;
    private boolean mo;
    private boolean mzz;
    private yt qdl;
    private com.bytedance.sdk.openadsdk.core.mo.jpc ud;

    public wd(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (qdl()) {
            ud();
        }
    }

    public com.bytedance.sdk.openadsdk.core.mo.jpc getDownloadButton() {
        return this.mml;
    }

    public jpc getLoadingProgressBar() {
        return this.lnr;
    }

    public boolean qdl() {
        return true;
    }

    public void setProgress(int i2) {
        jpc jpcVar = this.lnr;
        if (jpcVar != null) {
            jpcVar.setProgress(i2);
        }
    }

    public void ud() {
        if (this.mzz) {
            return;
        }
        this.mzz = true;
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        yt ytVar = new yt(context);
        this.qdl = ytVar;
        ytVar.setId(520093745);
        int iUd = ax.ud(context, 64.0f);
        this.qdl.setLayoutParams(new RelativeLayout.LayoutParams(iUd, iUd));
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.ud = jpcVar;
        jpcVar.setId(520093746);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ax.ud(context, 219.0f), -2);
        layoutParams2.topMargin = ax.ud(context, 16.0f);
        this.ud.setLayoutParams(layoutParams2);
        this.ud.setEllipsize(TextUtils.TruncateAt.END);
        this.ud.setGravity(17);
        this.ud.setMaxWidth(ax.ud(context, 150.0f));
        this.ud.setMaxLines(2);
        this.ud.setTextColor(-1);
        this.ud.setTextSize(1, 16.0f);
        jpc jpcVar2 = new jpc(context);
        this.lnr = jpcVar2;
        jpcVar2.setId(520093748);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(ax.ud(context, 219.0f), ax.ud(context, 6.0f));
        layoutParams3.topMargin = ax.ud(context, 24.0f);
        this.lnr.setLayoutParams(layoutParams3);
        this.mml = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(ax.ud(context, 138.0f), ax.ud(context, 42.0f));
        layoutParams4.topMargin = ax.ud(context, 48.0f);
        this.mml.setLayoutParams(layoutParams4);
        this.mml.setTextColor(-1);
        this.mml.setTextSize(16.0f);
        this.mml.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(2, -1);
        gradientDrawable.setCornerRadius(layoutParams4.height / 2);
        this.mml.setBackground(gradientDrawable);
        linearLayout.addView(this.qdl);
        linearLayout.addView(this.ud);
        linearLayout.addView(this.lnr);
        linearLayout.addView(this.mml);
        addView(linearLayout);
    }

    public void qdl(ljh ljhVar, int i2) {
        if (!this.mzz || ljhVar == null || this.mo) {
            return;
        }
        this.mo = true;
        boolean zSe = ljhVar.se();
        if (zSe || ljhVar.hcs() == null || TextUtils.isEmpty(ljhVar.hcs().qdl())) {
            this.qdl.setVisibility(8);
        } else {
            try {
                com.bytedance.sdk.openadsdk.tvp.mml.qdl(ljhVar.hcs()).lnr(1).qdl(new com.bytedance.sdk.openadsdk.tvp.ud(ljhVar, ljhVar.hcs().qdl(), new koa(this.qdl)));
            } catch (Throwable unused) {
                this.qdl.setVisibility(8);
            }
        }
        if (zSe) {
            this.ud.setText("Loading");
        } else if (TextUtils.isEmpty(ljhVar.gsv())) {
            this.ud.setVisibility(8);
        } else {
            this.ud.setText(ljhVar.gsv());
        }
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = this.mml;
        if (jpcVar != null) {
            jpcVar.setText(ljhVar.uvi());
        }
    }
}
