package com.p004ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes5.dex */
public enum hi {
    f2232(-1),
    f2235(0),
    f2233(1),
    f2231(2),
    f2234(3),
    f2228(4),
    f2230(5),
    f2227(6),
    f2229(7);


    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2223 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f2225 = 0;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2226 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final int f2236;

    static {
        m2193();
        f2226 = (f2225 + 15) % 128;
    }

    hi(int i2) {
        this.f2236 = i2;
    }

    public static hi valueOf(String str) {
        int i2 = f2225 + 121;
        f2226 = i2 % 128;
        if (i2 % 2 != 0) {
            return (hi) Enum.valueOf(hi.class, str);
        }
        Enum.valueOf(hi.class, str);
        throw null;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static hi[] valuesCustom() throws CloneNotSupportedException {
        int i2 = f2226 + 41;
        f2225 = i2 % 128;
        if (i2 % 2 != 0) {
            values().clone();
            throw null;
        }
        hi[] hiVarArr = (hi[]) values().clone();
        f2225 = (f2226 + 71) % 128;
        return hiVarArr;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2193() {
        f2223 = 93;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2194(int i2, int i3, int i4, String str, boolean z2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f672) {
            try {
                char[] cArr2 = new char[i3];
                b.f673 = 0;
                while (true) {
                    int i5 = b.f673;
                    if (i5 >= i3) {
                        break;
                    }
                    b.f671 = cArr[i5];
                    cArr2[b.f673] = (char) (b.f671 + i4);
                    int i6 = b.f673;
                    cArr2[i6] = (char) (cArr2[i6] - f2223);
                    b.f673 = i6 + 1;
                }
                if (i2 > 0) {
                    b.f674 = i2;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    int i7 = b.f674;
                    System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                    int i8 = b.f674;
                    System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    b.f673 = 0;
                    while (true) {
                        int i9 = b.f673;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr4[i9] = cArr2[(i3 - i9) - 1];
                        b.f673 = i9 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int m2195() {
        int i2 = f2225;
        int i3 = this.f2236;
        int i4 = i2 + 89;
        f2226 = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static hi m2192(int i2) {
        int i3 = f2226;
        int i4 = (i3 + 5) % 128;
        f2225 = i4;
        switch (i2) {
            case -1:
                return f2232;
            case 0:
                hi hiVar = f2235;
                f2225 = (i3 + 31) % 128;
                return hiVar;
            case 1:
                hi hiVar2 = f2233;
                int i5 = i4 + 87;
                f2226 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 84 / 0;
                }
                return hiVar2;
            case 2:
                hi hiVar3 = f2231;
                int i7 = i4 + 9;
                f2226 = i7 % 128;
                if (i7 % 2 != 0) {
                    return hiVar3;
                }
                throw null;
            case 3:
                return f2234;
            case 4:
                return f2228;
            case 5:
                return f2230;
            case 6:
                return f2227;
            case 7:
                return f2229;
            default:
                return null;
        }
    }
}
