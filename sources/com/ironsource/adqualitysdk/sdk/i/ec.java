package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ec {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1884 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1885 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1886 = 28018248313169802L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1887;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private d f1888;

    public ec(d dVar, String str) {
        this.f1888 = dVar;
        this.f1887 = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1888);
        sb2.append(m2128("枰", (ViewConfiguration.getTouchSlop() >> 8) + 2381).intern());
        sb2.append(this.f1887);
        String string = sb2.toString();
        f1884 = (f1885 + 73) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public final boolean m2129() {
        if (m2135() == d.f1907) {
            f1884 = (f1885 + InterfaceC0435l1.d.b.f29107d) % 128;
            return true;
        }
        f1885 = (f1884 + InterfaceC0435l1.d.b.f29110g) % 128;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r3 == com.ironsource.adqualitysdk.sdk.i.ec.d.f1908) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r3 == com.ironsource.adqualitysdk.sdk.i.ec.d.f1908) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ec.f1884 = (com.ironsource.adqualitysdk.sdk.i.ec.f1885 + 41) % 128;
     */
    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2130() {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ec.f1884
            int r0 = r0 + 79
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ec.f1885 = r1
            int r0 = r0 % 2
            r1 = 0
            com.ironsource.adqualitysdk.sdk.i.ec$d r3 = r3.m2135()
            if (r0 != 0) goto L19
            com.ironsource.adqualitysdk.sdk.i.ec$d r0 = com.ironsource.adqualitysdk.sdk.i.ec.d.f1908
            r2 = 94
            int r2 = r2 / r1
            if (r3 != r0) goto L27
            goto L1d
        L19:
            com.ironsource.adqualitysdk.sdk.i.ec$d r0 = com.ironsource.adqualitysdk.sdk.i.ec.d.f1908
            if (r3 != r0) goto L27
        L1d:
            int r3 = com.ironsource.adqualitysdk.sdk.i.ec.f1885
            int r3 = r3 + 41
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.ec.f1884 = r3
            r3 = 1
            return r3
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ec.m2130():boolean");
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m2131() {
        int i10 = f1884 + 17;
        f1885 = i10 % 128;
        if (i10 % 2 == 0) {
            m2135();
            d dVar = d.f1907;
            throw null;
        }
        if (m2135() == d.f1905) {
            f1885 = (f1884 + 77) % 128;
            return true;
        }
        int i11 = f1884 + 19;
        f1885 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 14 / 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final boolean m2132() {
        int i10 = f1884 + 29;
        f1885 = i10 % 128;
        if (i10 % 2 == 0) {
            m2135();
            d dVar = d.f1907;
            throw null;
        }
        if (m2135() == d.f1901) {
            return true;
        }
        f1885 = (f1884 + 3) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m2133() {
        int i10 = f1885 + 119;
        f1884 = i10 % 128;
        if (i10 % 2 != 0) {
            m2135();
            d dVar = d.f1907;
            throw null;
        }
        if (m2135() != d.f1903) {
            return false;
        }
        f1884 = (f1885 + 51) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m2134() {
        if (m2135() != d.f1904) {
            f1885 = (f1884 + 99) % 128;
            return false;
        }
        int i10 = (f1884 + 91) % 128;
        f1885 = i10;
        int i11 = i10 + 69;
        f1884 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 98 / 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final d m2135() {
        int i10 = f1885;
        d dVar = this.f1888;
        f1884 = (i10 + 123) % 128;
        return dVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m2136() {
        if (m2139() || m2137()) {
            return true;
        }
        f1885 = (f1884 + 85) % 128;
        if (m2132() || m2133()) {
            return true;
        }
        f1884 = (f1885 + 81) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m2137() {
        if (m2135() == d.f1909) {
            f1884 = (f1885 + 99) % 128;
            return true;
        }
        f1885 = (f1884 + 49) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2138() {
        int i10 = f1884;
        String str = this.f1887;
        int i11 = i10 + 79;
        f1885 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m2140(String str) {
        int i10 = f1884 + 77;
        f1885 = i10 % 128;
        int i11 = i10 % 2;
        String str2 = this.f1887;
        if (i11 == 0) {
            str2.equals(str);
            throw null;
        }
        boolean zEquals = str2.equals(str);
        f1884 = (f1885 + 91) % 128;
        return zEquals;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2128(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2435) {
            try {
                i.f2436 = i10;
                char[] cArr2 = new char[cArr.length];
                i.f2434 = 0;
                while (true) {
                    int i11 = i.f2434;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f1886);
                        i.f2434++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m2139() {
        if (m2135() == d.f1906) {
            f1885 = (f1884 + 41) % 128;
            return true;
        }
        f1884 = (f1885 + InterfaceC0435l1.d.b.f29107d) % 128;
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum d {
        f1907,
        f1905,
        f1908,
        f1906,
        f1909,
        f1901,
        f1903,
        f1904,
        f1900,
        f1902,
        f1895;


        /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
        private static int f1889 = 1;

        /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
        private static short[] f1890;

        /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
        private static long f1891;

        /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
        private static int f1892;

        /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
        private static char[] f1893;

        /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
        private static byte[] f1894;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private static int f1896;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static int f1897;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private static int f1899;

        static {
            m2143();
            int i10 = f1889 + 49;
            f1892 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        public static d valueOf(String str) {
            f1892 = (f1889 + 97) % 128;
            d dVar = (d) Enum.valueOf(d.class, str);
            int i10 = f1889 + 47;
            f1892 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 9 / 0;
            }
            return dVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            f1892 = (f1889 + 87) % 128;
            d[] dVarArr = (d[]) values().clone();
            int i10 = f1892 + 33;
            f1889 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 20 / 0;
            }
            return dVarArr;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m2142(short s10, int i10, int i11, int i12, byte b10) {
            String string;
            synchronized (n.f3070) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f1899;
                    int i14 = i11 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f1894;
                        i14 = bArr != null ? (byte) (bArr[f1897 + i12] + i13) : (short) (f1890[f1897 + i12] + i13);
                    }
                    if (i14 > 0) {
                        n.f3072 = ((i12 + i14) - 2) + f1897 + i15;
                        n.f3073 = b10;
                        char c4 = (char) (i10 + f1896);
                        n.f3074 = c4;
                        sb2.append(c4);
                        n.f3075 = n.f3074;
                        n.f3071 = 1;
                        while (n.f3071 < i14) {
                            byte[] bArr2 = f1894;
                            if (bArr2 != null) {
                                int i16 = n.f3072;
                                n.f3072 = i16 - 1;
                                n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                            } else {
                                short[] sArr = f1890;
                                int i17 = n.f3072;
                                n.f3072 = i17 - 1;
                                n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                            }
                            sb2.append(n.f3074);
                            n.f3075 = n.f3074;
                            n.f3071++;
                        }
                    }
                    string = sb2.toString();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return string;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static void m2143() {
            f1897 = 1399776678;
            f1899 = 100;
            f1896 = -660843947;
            f1894 = new byte[]{-14, 3, -8, -2, 20, -6, 13, -4, 3, -3, -11, 6, 9, 1, -5, 3, -5, 19, -17, 13, -11, 1, -7, 5, -9, -2, 1, -7, 10, -19, 6, 11, 13, -4, -7, -3, 0, 13, 2, 2, -15, -3, 14, -15, 11, 1, -15, 6, 9, -8, 0, -2, 12, -28, 26, -9, 5, -3, -5, -3, 11, -21, 8, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            f1893 = new char[]{'I', 46742, 28132, 9421, 56103, 37501, 18754, 'C', 46740, 28145, 9435, 56115};
            f1891 = 1163780088487982808L;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m2141(char c4, int i10, int i11) {
            String str;
            synchronized (c.f1153) {
                try {
                    char[] cArr = new char[i11];
                    c.f1154 = 0;
                    while (true) {
                        int i12 = c.f1154;
                        if (i12 < i11) {
                            cArr[i12] = (char) ((((long) f1893[i10 + i12]) ^ (((long) i12) * f1891)) ^ ((long) c4));
                            c.f1154 = i12 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str;
        }
    }
}
