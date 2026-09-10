package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0868Li extends C1361cL {
    public C0868Li(C1828k1 c1828k1) {
        super(c1828k1);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int newWidthSpec = View.MeasureSpec.getMode(i);
        if (newWidthSpec == 1073741824) {
            i2 = i;
        } else {
            int newWidthSpec2 = View.MeasureSpec.getMode(i2);
            if (newWidthSpec2 == 1073741824) {
                i = i2;
            }
        }
        super.onMeasure(i, i2);
    }
}
