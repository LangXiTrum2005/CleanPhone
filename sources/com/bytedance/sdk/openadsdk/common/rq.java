package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class rq {
    private com.bytedance.sdk.openadsdk.core.widget.jpc lnr;
    private com.bytedance.sdk.openadsdk.core.widget.yt mml;
    private com.bytedance.sdk.openadsdk.core.mo.jpc mzz;
    protected View qdl = mzz();
    protected Context ud;

    public rq(Context context) {
        this.ud = context;
    }

    private View mzz() {
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(this.ud);
        mzzVar.setGravity(1);
        mzzVar.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.yt ytVar = new com.bytedance.sdk.openadsdk.core.widget.yt(this.ud);
        this.mml = ytVar;
        ytVar.setId(520093745);
        int iUd = ax.ud(this.ud, 64.0f);
        mzzVar.addView(this.mml, new LinearLayout.LayoutParams(iUd, iUd));
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(this.ud);
        this.mzz = jpcVar;
        jpcVar.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ax.ud(this.ud, 219.0f), -2);
        layoutParams.topMargin = ax.ud(this.ud, 16.0f);
        this.mzz.setLayoutParams(layoutParams);
        this.mzz.setEllipsize(TextUtils.TruncateAt.END);
        this.mzz.setGravity(17);
        this.mzz.setMaxWidth(ax.ud(this.ud, 150.0f));
        this.mzz.setMaxLines(2);
        this.mzz.setTextColor(-1);
        this.mzz.setTextSize(1, 16.0f);
        mzzVar.addView(this.mzz);
        this.lnr = new com.bytedance.sdk.openadsdk.core.widget.jpc(this.ud);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(ax.ud(this.ud, 219.0f), ax.ud(this.ud, 6.0f));
        layoutParams2.topMargin = ax.ud(this.ud, 32.0f);
        mzzVar.addView(this.lnr, layoutParams2);
        return mzzVar;
    }

    public com.bytedance.sdk.openadsdk.core.mo.jpc lnr() {
        return this.mzz;
    }

    public void mml() {
        this.qdl = null;
        this.ud = null;
    }

    public View qdl() {
        return this.qdl;
    }

    public com.bytedance.sdk.openadsdk.core.widget.yt ud() {
        return this.mml;
    }

    public void qdl(int i2) {
        this.lnr.setProgress(i2);
    }
}
