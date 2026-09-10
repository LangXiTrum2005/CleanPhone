package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0882Lx extends C1900lC {
    public static String[] A08 = {"3Z4oVcBXIxTGfHDkJENHcNR3oKWZn0O4", "rFv82zPhlr6ageKpcxYW53i7WQEhI", "2tYR0SC80tVMegpE61nD", "NxUbiyfiYIyXyrFLuBvPtjT94e88s", "0hjSAQsR9gnR7LOOW", "3YJcpQnZmcsLDiaVOnEQeEpmcgGPkAOH", "Bqc2ZUTwiywYobMvaWapE1roD64Q2E5u", "7wlgBc9wtLyqXjV7RP"};
    public float A00;
    public int A01;
    public int A02;
    public C0883Ly A03;
    public int[] A04;
    public final C1828k1 A05;
    public final HV A06;
    public final HW A07;

    public C0882Lx(C1828k1 c1828k1, HW hw, HV hv) {
        super(c1828k1);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c1828k1;
        this.A07 = hw;
        this.A06 = hv;
        this.A01 = -1;
        this.A03 = new C0883Ly(this, this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final void A1J(C6A c6a, C6H c6h, int i, int widthMode) {
        int[] iArrA02;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(widthMode);
        if ((mode == 1073741824 && A26() == 1) || (mode2 == 1073741824 && A26() == 0)) {
            super.A1J(c6a, c6h, i, widthMode);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(widthMode);
        if (this.A06.A01(this.A01)) {
            iArrA02 = this.A06.A02(this.A01);
        } else {
            iArrA02 = new int[]{0, 0};
            if (c6h.A03() >= 1) {
                int i2 = A0W() > 0 ? 1 : A0W();
                for (int heightMode = 0; heightMode < i2; heightMode++) {
                    View viewA1m = A1m(heightMode);
                    if (viewA1m == null) {
                        break;
                    }
                    this.A04 = this.A07.A00(viewA1m, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (A26() == 0) {
                        iArrA02[0] = iArrA02[0] + this.A04[0];
                        if (heightMode == 0) {
                            iArrA02[1] = this.A04[1] + A0g() + A0d();
                        }
                    } else {
                        iArrA02[1] = iArrA02[1] + this.A04[1];
                        if (heightMode == 0) {
                            iArrA02[0] = this.A04[0] + A0e() + A0f();
                        }
                    }
                }
                int i3 = this.A01;
                String[] strArr = A08;
                if (strArr[1].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[0] = "c7gaApi93PYPuTyj4vut3Dl9rZW6DyZw";
                strArr2[7] = "eCokdcVdwhThfuMVf9";
                if (i3 != -1) {
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
        A13(iArrA02[0], iArrA02[1]);
    }

    @Override // com.facebook.ads.redexgen.core.C1900lC, com.facebook.ads.redexgen.core.AnonymousClass62
    public final void A1p(int i) {
        A2B(i, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.C1900lC, com.facebook.ads.redexgen.core.AnonymousClass62
    public final void A1x(MG mg, C6H c6h, int i) {
        this.A03.A0A(i);
        A1L(this.A03);
    }

    public final void A2G(double d) {
        if (d <= 0.0d) {
            d = 1.0d;
        }
        this.A00 = (float) (50.0d / d);
        this.A03 = new C0883Ly(this, this.A05);
    }

    public final void A2H(int i) {
        this.A01 = i;
    }

    public final void A2I(int i) {
        this.A02 = i;
    }
}
