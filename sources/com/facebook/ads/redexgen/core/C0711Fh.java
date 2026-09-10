package com.facebook.ads.redexgen.core;

import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0711Fh extends LinearLayout {
    public static final int A06 = (int) (CP.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C1828k1 A04;
    public final C0712Fi[] A05;

    public C0711Fh(C1828k1 c1828k1, int i, int i2, int i3, int i4) {
        super(c1828k1);
        this.A00 = A06;
        this.A04 = c1828k1;
        setOrientation(0);
        this.A03 = i;
        this.A01 = i3;
        this.A02 = i4;
        this.A05 = new C0712Fi[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            this.A05[i5] = A00();
            addView(this.A05[i5]);
        }
        A01();
    }

    private C0712Fi A00() {
        C0712Fi c0712Fi = new C0712Fi(this.A04, this.A01, this.A02);
        LinearLayout.LayoutParams starRatingViewParams = new LinearLayout.LayoutParams(this.A03, this.A03);
        starRatingViewParams.gravity = 16;
        c0712Fi.setLayoutParams(starRatingViewParams);
        return c0712Fi;
    }

    private void A01() {
        int i = 0;
        while (i < i) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A05[i].getLayoutParams();
            int i2 = i == 0 ? 0 : this.A00;
            layoutParams.leftMargin = i2;
            i++;
        }
        requestLayout();
    }

    private void A02(float f) {
        for (int i = 0; i < i; i++) {
            float fillRatio = Math.min(1.0f, f - i);
            if (fillRatio < 0.0f) {
                fillRatio = 0.0f;
            }
            this.A05[i].setFillRatio(fillRatio);
        }
    }

    public void setItemSpacing(int i) {
        this.A00 = i;
        A01();
    }

    public void setRating(float f) {
        A02(f);
    }
}
