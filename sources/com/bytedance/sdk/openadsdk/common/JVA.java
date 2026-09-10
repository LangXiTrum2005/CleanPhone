package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class JVA {
    private com.bytedance.sdk.openadsdk.core.JXs.OY JXs;
    protected Context LD;
    protected View Lxb = JXs();
    private com.bytedance.sdk.openadsdk.core.widget.kqm ZU;
    private com.bytedance.sdk.openadsdk.core.widget.QAg lk;

    public JVA(Context context) {
        this.LD = context;
    }

    private View JXs() {
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(this.LD);
        jXs.setGravity(1);
        jXs.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.kqm kqmVar = new com.bytedance.sdk.openadsdk.core.widget.kqm(this.LD);
        this.ZU = kqmVar;
        kqmVar.setId(520093745);
        int iLk = le.lk(this.LD, 64.0f);
        jXs.addView(this.ZU, new LinearLayout.LayoutParams(iLk, iLk));
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(this.LD);
        this.JXs = oy;
        oy.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(le.lk(this.LD, 219.0f), -2);
        layoutParams.topMargin = le.lk(this.LD, 16.0f);
        this.JXs.setLayoutParams(layoutParams);
        this.JXs.setEllipsize(TextUtils.TruncateAt.END);
        this.JXs.setGravity(17);
        this.JXs.setMaxWidth(le.lk(this.LD, 150.0f));
        this.JXs.setMaxLines(2);
        this.JXs.setTextColor(-1);
        this.JXs.setTextSize(1, 16.0f);
        jXs.addView(this.JXs);
        this.lk = new com.bytedance.sdk.openadsdk.core.widget.QAg(this.LD);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(le.lk(this.LD, 219.0f), le.lk(this.LD, 6.0f));
        layoutParams2.topMargin = le.lk(this.LD, 32.0f);
        jXs.addView(this.lk, layoutParams2);
        return jXs;
    }

    public com.bytedance.sdk.openadsdk.core.widget.kqm LD() {
        return this.ZU;
    }

    public View Lxb() {
        return this.Lxb;
    }

    public void ZU() {
        this.Lxb = null;
        this.LD = null;
    }

    public com.bytedance.sdk.openadsdk.core.JXs.OY lk() {
        return this.JXs;
    }

    public void Lxb(int i) {
        this.lk.setProgress(i);
    }
}
