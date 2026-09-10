package com.bytedance.sdk.openadsdk.lk;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class ebl extends LinearLayout {
    private OY LD;
    private final FilterWord Lxb;
    private final nBu lk;

    public ebl(Context context, FilterWord filterWord, nBu nbu) {
        super(context);
        setOrientation(1);
        this.Lxb = filterWord;
        this.lk = nbu;
        Lxb();
    }

    private void LD() {
        this.LD = new OY(getContext(), this.lk);
        new LinearLayout.LayoutParams(-1, -2);
        this.LD.Lxb(this.Lxb.getOptions());
        addView(this.LD);
    }

    private void Lxb() {
        lk();
        LD();
    }

    private void lk() {
        String name = this.Lxb.getName();
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = le.lk(getContext(), 12.0f);
        layoutParams.gravity = 17;
        oy.setGravity(17);
        oy.setText(name);
        oy.setTextColor(Color.argb(85, 22, 24, 35));
        oy.setTextSize(this.lk.QAg() ? 14 : 10);
        addView(oy, layoutParams);
    }
}
