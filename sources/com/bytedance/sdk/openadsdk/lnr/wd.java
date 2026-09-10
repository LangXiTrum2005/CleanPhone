package com.bytedance.sdk.openadsdk.lnr;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class wd extends LinearLayout {
    private final to lnr;
    private final FilterWord qdl;
    private jpc ud;

    public wd(Context context, FilterWord filterWord, to toVar) {
        super(context);
        setOrientation(1);
        this.qdl = filterWord;
        this.lnr = toVar;
        qdl();
    }

    private void lnr() {
        String name = this.qdl.getName();
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = ax.ud(getContext(), 12.0f);
        layoutParams.gravity = 17;
        jpcVar.setGravity(17);
        jpcVar.setText(name);
        jpcVar.setTextColor(Color.argb(85, 22, 24, 35));
        jpcVar.setTextSize(this.lnr.tvp() ? 14 : 10);
        addView(jpcVar, layoutParams);
    }

    private void qdl() {
        lnr();
        ud();
    }

    private void ud() {
        this.ud = new jpc(getContext(), this.lnr);
        new LinearLayout.LayoutParams(-1, -2);
        this.ud.qdl(this.qdl.getOptions());
        addView(this.ud);
    }
}
