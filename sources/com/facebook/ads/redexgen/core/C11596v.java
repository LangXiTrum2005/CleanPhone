package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C11596v extends C2370hr {
    public static String[] A08 = {"3Z4oVcBXIxTGfHDkJENHcNR3oKWZn0O4", "rFv82zPhlr6ageKpcxYW53i7WQEhI", "2tYR0SC80tVMegpE61nD", "NxUbiyfiYIyXyrFLuBvPtjT94e88s", "0hjSAQsR9gnR7LOOW", "3YJcpQnZmcsLDiaVOnEQeEpmcgGPkAOH", "Bqc2ZUTwiywYobMvaWapE1roD64Q2E5u", "7wlgBc9wtLyqXjV7RP"};
    public float A00;
    public int A01;
    public int A02;
    public C11606w A03;
    public int[] A04;
    public final C2300gi A05;
    public final C2132dz A06;
    public final C2133e0 A07;

    public C11596v(C2300gi c2300gi, C2133e0 c2133e0, C2132dz c2132dz) {
        super(c2300gi);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c2300gi;
        this.A07 = c2133e0;
        this.A06 = c2132dz;
        this.A01 = -1;
        this.A03 = new C11606w(this, this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final void A1L(RA ra, RH rh, int i2, int widthMode) {
        int[] iArrA02;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(widthMode);
        if ((mode == 1073741824 && A28() == 1) || (mode2 == 1073741824 && A28() == 0)) {
            super.A1L(ra, rh, i2, widthMode);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(widthMode);
        if (this.A06.A01(this.A01)) {
            iArrA02 = this.A06.A02(this.A01);
        } else {
            iArrA02 = new int[]{0, 0};
            if (rh.A03() >= 1) {
                int i3 = A0Y() > 0 ? 1 : A0Y();
                for (int heightMode = 0; heightMode < i3; heightMode++) {
                    View viewA1o = A1o(heightMode);
                    if (viewA1o == null) {
                        break;
                    }
                    this.A04 = this.A07.A00(viewA1o, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (A28() == 0) {
                        iArrA02[0] = iArrA02[0] + this.A04[0];
                        if (heightMode == 0) {
                            iArrA02[1] = this.A04[1] + A0i() + A0f();
                        }
                    } else {
                        iArrA02[1] = iArrA02[1] + this.A04[1];
                        if (heightMode == 0) {
                            iArrA02[0] = this.A04[0] + A0g() + A0h();
                        }
                    }
                }
                int i4 = this.A01;
                String[] strArr = A08;
                if (strArr[1].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[0] = "c7gaApi93PYPuTyj4vut3Dl9rZW6DyZw";
                strArr2[7] = "eCokdcVdwhThfuMVf9";
                if (i4 != -1) {
                    this.A06.A00(this.A01, iArrA02);
                }
            }
        }
        if (mode == 1073741824) {
            iArrA02[0] = size;
        }
        if (mode2 == 1073741824) {
            iArrA02[1] = size2;
        }
        A15(iArrA02[0], iArrA02[1]);
    }

    @Override // com.facebook.ads.redexgen.core.C2370hr, com.facebook.ads.redexgen.core.R2
    public final void A1r(int i2) {
        A2D(i2, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.C2370hr, com.facebook.ads.redexgen.core.R2
    public final void A1z(C7M c7m, RH rh, int i2) {
        this.A03.A0A(i2);
        A1N(this.A03);
    }

    public final void A2I(double d) {
        if (d <= 0.0d) {
            d = 1.0d;
        }
        this.A00 = (float) (50.0d / d);
        this.A03 = new C11606w(this, this.A05);
    }

    public final void A2J(int i2) {
        this.A01 = i2;
    }

    public final void A2K(int i2) {
        this.A02 = i2;
    }
}
