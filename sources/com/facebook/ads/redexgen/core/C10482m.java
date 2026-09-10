package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10482m {
    public static String[] A02 = {"GJxubYlXsZiu90nLIAtZt0ZPoHJfDn5s", "BS8EJfUuntSU9isaC3nv1ANhy", "Gs0aOb6gQMfpDwhZyZjPrCKqfhvLXKwh", "iN3iHRJ6T765oBofKZIxuh5bzIdVCLFB", "wNf5fiO3vn7igkhJYRlF92Iu10jGyY95", "PRW1z97xqqsLulYYbCVWRoDib", "FY0aCr3Onb0", "4J82hMkwk7B8La5ZKR1JgNOMoJvqL0p2"};
    public boolean A00;
    public final SparseBooleanArray A01 = new SparseBooleanArray();

    public final C10482m A00(int i2) {
        AbstractC10843y.A08(!this.A00);
        this.A01.append(i2, true);
        return this;
    }

    public final C10482m A01(int i2, boolean z2) {
        if (z2) {
            C10482m c10482mA00 = A00(i2);
            if (A02[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "oVNjkypXGUiIrzEYrZV4GsKas1KVyN3y";
            strArr[3] = "tIVTdGxG4MXYUs0uHZXzBbuDNAp7p6hg";
            return c10482mA00;
        }
        return this;
    }

    public final C10482m A02(C10492n c10492n) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = c10492n.A01(i2);
            A00(i3);
        }
        return this;
    }

    public final C10482m A03(int... iArr) {
        for (int i2 : iArr) {
            A00(i2);
        }
        return this;
    }

    public final C10492n A04() {
        AbstractC10843y.A08(!this.A00);
        this.A00 = true;
        return new C10492n(this.A01);
    }
}
