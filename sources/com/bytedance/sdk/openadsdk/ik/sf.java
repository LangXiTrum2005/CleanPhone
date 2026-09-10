package com.bytedance.sdk.openadsdk.ik;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class sf extends View {
    private final int ri;

    public sf(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), this.ri);
    }

    public sf(Context context, int i) {
        super(context);
        setBackgroundColor(i);
        this.ri = qd.lr(getContext(), 0.66f);
    }
}
