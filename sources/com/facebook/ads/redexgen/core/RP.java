package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class RP {
    public RM A00 = new RM();
    public final RN A01;

    public RP(RN rn) {
        this.A01 = rn;
    }

    public final View A00(int i2, int i3, int i4, int i5) {
        int iA8h = this.A01.A8h();
        int next = this.A01.A8g();
        int childEnd = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View viewA7H = this.A01.A7H(i2);
            int iA7K = this.A01.A7K(viewA7H);
            int i6 = this.A01.A7J(viewA7H);
            this.A00.A03(iA8h, next, iA7K, i6);
            if (i4 != 0) {
                this.A00.A01();
                this.A00.A02(i4);
                if (this.A00.A04()) {
                    return viewA7H;
                }
            }
            if (i5 != 0) {
                this.A00.A01();
                this.A00.A02(i5);
                if (this.A00.A04()) {
                    view = viewA7H;
                }
            }
            i2 += childEnd;
        }
        return view;
    }
}
