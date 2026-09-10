package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1855kS extends C04604v {
    public int A00;

    public C1855kS(Context context) {
        super(context);
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i) {
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.C04604v, android.view.View
    public final void onMeasure(int i, int i2) {
        int h = this.A00;
        for (int i3 = 0; i3 < height; i3++) {
            View childAt = getChildAt(i3);
            int height = View.MeasureSpec.makeMeasureSpec(0, 0);
            childAt.measure(i, height);
            int height2 = childAt.getMeasuredHeight();
            if (height2 > h) {
                h = height2;
            }
        }
        int height3 = View.MeasureSpec.makeMeasureSpec(h, 1073741824);
        super.onMeasure(i, height3);
    }
}
