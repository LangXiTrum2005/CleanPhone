package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class sf {
    private com.bytedance.sdk.openadsdk.core.di.mj fi;
    private com.bytedance.sdk.openadsdk.core.widget.mj ik;
    private com.bytedance.sdk.openadsdk.core.widget.bu ka;
    protected Context lr;
    protected View ri = fi();

    public sf(Context context) {
        this.lr = context;
    }

    private View fi() {
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(this.lr);
        fiVar.setGravity(1);
        fiVar.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.bu buVar = new com.bytedance.sdk.openadsdk.core.widget.bu(this.lr);
        this.ka = buVar;
        buVar.setId(520093745);
        int iLr = qd.lr(this.lr, 64.0f);
        fiVar.addView(this.ka, new LinearLayout.LayoutParams(iLr, iLr));
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(this.lr);
        this.fi = mjVar;
        mjVar.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qd.lr(this.lr, 219.0f), -2);
        layoutParams.topMargin = qd.lr(this.lr, 16.0f);
        this.fi.setLayoutParams(layoutParams);
        this.fi.setEllipsize(TextUtils.TruncateAt.END);
        this.fi.setGravity(17);
        this.fi.setMaxWidth(qd.lr(this.lr, 150.0f));
        this.fi.setMaxLines(2);
        this.fi.setTextColor(-1);
        this.fi.setTextSize(1, 16.0f);
        fiVar.addView(this.fi);
        this.ik = new com.bytedance.sdk.openadsdk.core.widget.mj(this.lr);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(qd.lr(this.lr, 219.0f), qd.lr(this.lr, 6.0f));
        layoutParams2.topMargin = qd.lr(this.lr, 32.0f);
        fiVar.addView(this.ik, layoutParams2);
        return fiVar;
    }

    public com.bytedance.sdk.openadsdk.core.di.mj ik() {
        return this.fi;
    }

    public void ka() {
        this.ri = null;
        this.lr = null;
    }

    public com.bytedance.sdk.openadsdk.core.widget.bu lr() {
        return this.ka;
    }

    public View ri() {
        return this.ri;
    }

    public void ri(int i) {
        this.ik.setProgress(i);
    }
}
