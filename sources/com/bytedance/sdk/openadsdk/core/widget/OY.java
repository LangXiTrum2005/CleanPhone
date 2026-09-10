package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.utils.id;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;

/* JADX INFO: loaded from: classes2.dex */
public class OY extends com.bytedance.sdk.openadsdk.core.JXs.ebl {
    private com.bytedance.sdk.openadsdk.core.JXs.ZU JXs;
    private com.bytedance.sdk.openadsdk.core.JXs.OY LD;
    private kqm Lxb;
    private com.bytedance.sdk.openadsdk.core.JXs.OY ZU;
    private boolean ebl;
    private boolean lc;
    private QAg lk;

    public OY(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (Lxb()) {
            LD();
        }
    }

    public void LD() {
        if (this.lc) {
            return;
        }
        this.lc = true;
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        kqm kqmVar = new kqm(context);
        this.Lxb = kqmVar;
        kqmVar.setId(520093745);
        int iLk = le.lk(context, 64.0f);
        this.Lxb.setLayoutParams(new RelativeLayout.LayoutParams(iLk, iLk));
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.LD = oy;
        oy.setId(520093746);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(le.lk(context, 219.0f), -2);
        layoutParams2.topMargin = le.lk(context, 16.0f);
        this.LD.setLayoutParams(layoutParams2);
        this.LD.setEllipsize(TextUtils.TruncateAt.END);
        this.LD.setGravity(17);
        this.LD.setMaxWidth(le.lk(context, 150.0f));
        this.LD.setMaxLines(2);
        this.LD.setTextColor(-1);
        this.LD.setTextSize(1, 16.0f);
        QAg qAg = new QAg(context);
        this.lk = qAg;
        qAg.setId(520093748);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(le.lk(context, 219.0f), le.lk(context, 6.0f));
        layoutParams3.topMargin = le.lk(context, 24.0f);
        this.lk.setLayoutParams(layoutParams3);
        this.ZU = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(le.lk(context, 138.0f), le.lk(context, 42.0f));
        layoutParams4.topMargin = le.lk(context, 48.0f);
        this.ZU.setLayoutParams(layoutParams4);
        this.ZU.setTextColor(-1);
        this.ZU.setTextSize(16.0f);
        this.ZU.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(2, -1);
        gradientDrawable.setCornerRadius(layoutParams4.height / 2);
        this.ZU.setBackground(gradientDrawable);
        linearLayout.addView(this.Lxb);
        linearLayout.addView(this.LD);
        linearLayout.addView(this.lk);
        linearLayout.addView(this.ZU);
        Lxb(context);
        addView(linearLayout);
        addView(this.JXs);
    }

    public boolean Lxb() {
        return true;
    }

    @Nullable
    public com.bytedance.sdk.openadsdk.core.JXs.OY getDownloadButton() {
        return this.ZU;
    }

    @Nullable
    public QAg getLoadingProgressBar() {
        return this.lk;
    }

    public void setProgress(int i) {
        QAg qAg = this.lk;
        if (qAg != null) {
            qAg.setProgress(i);
        }
    }

    public void Lxb(final com.bytedance.sdk.openadsdk.core.model.tD tDVar, int i) {
        if (!this.lc || tDVar == null || this.ebl) {
            return;
        }
        this.ebl = true;
        boolean zLd = tDVar.Ld();
        if (zLd || tDVar.Lpq() == null || TextUtils.isEmpty(tDVar.Lpq().Lxb())) {
            this.Lxb.setVisibility(8);
        } else {
            try {
                com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(tDVar.Lpq()).Lxb(new com.bytedance.sdk.openadsdk.QAg.LD(tDVar, tDVar.Lpq().Lxb(), new id(this.Lxb)));
            } catch (Throwable unused) {
                this.Lxb.setVisibility(8);
            }
        }
        if (zLd) {
            this.LD.setText("Loading");
        } else if (TextUtils.isEmpty(tDVar.FD())) {
            this.LD.setVisibility(8);
        } else {
            this.LD.setText(tDVar.FD());
        }
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = this.ZU;
        if (oy != null) {
            oy.setText(tDVar.xr());
        }
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = this.JXs;
        if (zu != null) {
            zu.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.OY.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Context context = OY.this.getContext();
                    com.bytedance.sdk.openadsdk.core.model.tD tDVar2 = tDVar;
                    TTWebsiteActivity.Lxb(context, tDVar2, nJ.Lxb(tDVar2));
                }
            });
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.JXs.getLayoutParams();
            if (i == 1) {
                marginLayoutParams.width = le.lk(getContext(), 64.0f);
                marginLayoutParams.height = le.lk(getContext(), 24.0f);
                marginLayoutParams.bottomMargin = le.lk(getContext(), 60.0f);
            } else {
                marginLayoutParams.width = le.lk(getContext(), 41.0f);
                marginLayoutParams.height = le.lk(getContext(), 15.0f);
                marginLayoutParams.bottomMargin = le.lk(getContext(), 24.0f);
            }
            this.JXs.setLayoutParams(marginLayoutParams);
        }
    }

    public void Lxb(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        this.JXs = zu;
        zu.setImageDrawable(com.bytedance.sdk.component.utils.tD.lk(context, "tt_ad_logo_big"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(le.lk(context, 64.0f), le.lk(context, 24.0f));
        layoutParams.bottomMargin = le.lk(context, 60.0f);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.JXs.setLayoutParams(layoutParams);
    }
}
