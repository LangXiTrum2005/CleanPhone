package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C08792m {
    public static String[] A02 = {"GJxubYlXsZiu90nLIAtZt0ZPoHJfDn5s", "BS8EJfUuntSU9isaC3nv1ANhy", "Gs0aOb6gQMfpDwhZyZjPrCKqfhvLXKwh", "iN3iHRJ6T765oBofKZIxuh5bzIdVCLFB", "wNf5fiO3vn7igkhJYRlF92Iu10jGyY95", "PRW1z97xqqsLulYYbCVWRoDib", "FY0aCr3Onb0", "4J82hMkwk7B8La5ZKR1JgNOMoJvqL0p2"};
    public boolean A00;
    public final SparseBooleanArray A01 = new SparseBooleanArray();

    public final C08792m A00(int i) {
        AbstractC09153y.A08(!this.A00);
        this.A01.append(i, true);
        return this;
    }

    public final C08792m A01(int i, boolean z) {
        if (z) {
            C08792m c08792mA00 = A00(i);
            if (A02[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "oVNjkypXGUiIrzEYrZV4GsKas1KVyN3y";
            strArr[3] = "tIVTdGxG4MXYUs0uHZXzBbuDNAp7p6hg";
            return c08792mA00;
        }
        return this;
    }

    public final C08792m A02(C08802n c08802n) {
        for (int i = 0; i < i; i++) {
            int i2 = c08802n.A01(i);
            A00(i2);
        }
        return this;
    }

    public final C08792m A03(int... iArr) {
        for (int i : iArr) {
            A00(i);
        }
        return this;
    }

    public final C08802n A04() {
        AbstractC09153y.A08(!this.A00);
        this.A00 = true;
        return new C08802n(this.A01);
    }
}
