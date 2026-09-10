package com.bytedance.sdk.openadsdk.ik;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends LinearLayout {
    private final qt ik;
    private mj lr;
    private final FilterWord ri;

    public xha(Context context, FilterWord filterWord, qt qtVar) {
        super(context);
        setOrientation(1);
        this.ri = filterWord;
        this.ik = qtVar;
        ri();
    }

    private void ik() {
        String name = this.ri.getName();
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = qd.lr(getContext(), 12.0f);
        layoutParams.gravity = 17;
        mjVar.setGravity(17);
        mjVar.setText(name);
        mjVar.setTextColor(Color.argb(85, 22, 24, 35));
        mjVar.setTextSize(this.ik.jbs() ? 14 : 10);
        addView(mjVar, layoutParams);
    }

    private void lr() {
        this.lr = new mj(getContext(), this.ik);
        new LinearLayout.LayoutParams(-1, -2);
        this.lr.ri(this.ri.getOptions());
        addView(this.lr);
    }

    private void ri() {
        ik();
        lr();
    }
}
