package com.bytedance.sdk.openadsdk.lnr;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class rq extends View {
    private final int qdl;

    public rq(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        setMeasuredDimension(getMeasuredWidth(), this.qdl);
    }

    public rq(Context context, int i2) {
        super(context);
        setBackgroundColor(i2);
        this.qdl = ax.ud(getContext(), 0.66f);
    }
}
