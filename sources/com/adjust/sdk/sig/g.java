package com.adjust.sdk.sig;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f6959a;

    static {
        Object j2Var;
        int length;
        int i10;
        boolean z10;
        int i11;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            if (property != null && (length = property.length()) != 0) {
                int i12 = 0;
                char cCharAt = property.charAt(0);
                int i13 = -2147483647;
                if (cCharAt < '0') {
                    z10 = true;
                    if (length != 1) {
                        if (cCharAt == '+') {
                            i10 = 1;
                            z10 = false;
                        } else if (cCharAt == '-') {
                            i13 = Integer.MIN_VALUE;
                            i10 = 1;
                        }
                    }
                    j2Var = null;
                    break;
                }
                i10 = 0;
                z10 = false;
                int i14 = -59652323;
                while (true) {
                    if (i10 >= length) {
                        if (!z10) {
                            j2Var = Integer.valueOf(-i12);
                            break;
                        } else {
                            j2Var = Integer.valueOf(i12);
                            break;
                        }
                    }
                    int iDigit = Character.digit((int) property.charAt(i10), 10);
                    if (iDigit >= 0 && ((i12 >= i14 || (i14 == -59652323 && i12 >= (i14 = i13 / 10))) && (i11 = i12 * 10) >= i13 + iDigit)) {
                        i12 = i11 - iDigit;
                        i10++;
                    }
                    j2Var = null;
                    break;
                }
            }
            j2Var = null;
            break;
        } catch (Throwable th2) {
            j2Var = new j2(th2);
        }
        Integer num = (Integer) (j2Var instanceof j2 ? null : j2Var);
        f6959a = num != null ? num.intValue() : 2097152;
    }
}
