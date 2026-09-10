package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2327h9 extends Pv {
    public int A00;

    public C2327h9(Context context) {
        super(context);
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i2) {
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.core.Pv, android.view.View
    public final void onMeasure(int i2, int i3) {
        int h2 = this.A00;
        for (int i4 = 0; i4 < height; i4++) {
            View childAt = getChildAt(i4);
            int height = View.MeasureSpec.makeMeasureSpec(0, 0);
            childAt.measure(i2, height);
            int height2 = childAt.getMeasuredHeight();
            if (height2 > h2) {
                h2 = height2;
            }
        }
        int height3 = View.MeasureSpec.makeMeasureSpec(h2, 1073741824);
        super.onMeasure(i2, height3);
    }
}
