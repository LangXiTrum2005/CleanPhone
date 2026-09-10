package com.facebook.ads.redexgen.core;

import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1465Qb implements Comparator<C1466Qc> {
    public static String[] A00 = {"RlDlwXS4AA55AOqx8zmN7uoMQ4", "FglEZvMIBCB6z", "AxTekMmYmWDdJoDxuavW255zDNKNRAPE", "pDpvZxom4p5NfzWuwibdxFCyrgD8wKok", "A10HdUhRMRjxQ62diLF5JQ0qPoODY0oj", "HiaacAz8KFEe90RKULVJfn7mD15J7Igj", "NHRqTP3H9N0qm1ewn1pnzRz0iIE8sZVk", "d5VyinGL3JDhuqMz7l90vG32rgbNgkhM"};

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(C1466Qc c1466Qc, C1466Qc c1466Qc2) {
        if ((c1466Qc.A03 == null) != (c1466Qc2.A03 == null)) {
            C7M c7m = c1466Qc.A03;
            if (A00[1].length() == 18) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "WTdcF3CBINcFCy4xHoe1W3dXr7HqLtJl";
            strArr[3] = "sYvRb4Jfa5Xca5GLbtDoWdBBrccl9kaR";
            return c7m == null ? 1 : -1;
        }
        if (c1466Qc.A04 != c1466Qc2.A04) {
            return c1466Qc.A04 ? -1 : 1;
        }
        int i = c1466Qc2.A02 - c1466Qc.A02;
        if (i != 0) {
            return i;
        }
        int i2 = c1466Qc.A00;
        int deltaViewVelocity = c1466Qc2.A00;
        int i3 = i2 - deltaViewVelocity;
        if (i3 != 0) {
            return i3;
        }
        return 0;
    }
}
