package com.bytedance.sdk.openadsdk.lk;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class JVA extends View {
    private final int Lxb;

    public JVA(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), this.Lxb);
    }

    public JVA(Context context, int i) {
        super(context);
        setBackgroundColor(i);
        this.Lxb = le.lk(getContext(), 0.66f);
    }
}
