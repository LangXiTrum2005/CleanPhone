package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class dy {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1821 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1822 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1823 = {AbstractJsonLexerKt.COLON};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1824 = -370601061070029443L;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f1825;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private e f1826;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1827;

    public enum e {
        f1837,
        f1836,
        f1839,
        f1838,
        f1835,
        f1830,
        f1833,
        f1831;


        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static int f1828 = 1;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private static int f1829;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static char[] f1832;

        static {
            m2069();
            int i2 = f1828 + 107;
            f1829 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        public static e valueOf(String str) {
            f1829 = (f1828 + 53) % 128;
            e eVar = (e) Enum.valueOf(e.class, str);
            f1828 = (f1829 + 97) % 128;
            return eVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() {
            e[] eVarArr;
            int i2 = f1828 + 49;
            f1829 = i2 % 128;
            if (i2 % 2 != 0) {
                eVarArr = (e[]) values().clone();
                int i3 = 37 / 0;
            } else {
                eVarArr = (e[]) values().clone();
            }
            int i4 = f1829 + 45;
            f1828 = i4 % 128;
            if (i4 % 2 != 0) {
                return eVarArr;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2068(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
            String str2;
            Object bytes = str;
            if (str != null) {
                bytes = str.getBytes(CharEncoding.ISO_8859_1);
            }
            byte[] bArr = (byte[]) bytes;
            synchronized (h.f2186) {
                try {
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    int i5 = iArr[3];
                    char[] cArr = new char[i3];
                    System.arraycopy(f1832, i2, cArr, 0, i3);
                    if (bArr != null) {
                        char[] cArr2 = new char[i3];
                        h.f2185 = 0;
                        char c2 = 0;
                        while (true) {
                            int i6 = h.f2185;
                            if (i6 >= i3) {
                                break;
                            }
                            if (bArr[i6] == 1) {
                                cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                            } else {
                                cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                            }
                            c2 = cArr2[i6];
                            h.f2185 = i6 + 1;
                        }
                        cArr = cArr2;
                    }
                    if (i5 > 0) {
                        char[] cArr3 = new char[i3];
                        System.arraycopy(cArr, 0, cArr3, 0, i3);
                        int i7 = i3 - i5;
                        System.arraycopy(cArr3, 0, cArr, i7, i5);
                        System.arraycopy(cArr3, i5, cArr, 0, i7);
                    }
                    if (z2) {
                        char[] cArr4 = new char[i3];
                        h.f2185 = 0;
                        while (true) {
                            int i8 = h.f2185;
                            if (i8 >= i3) {
                                break;
                            }
                            cArr4[i8] = cArr[(i3 - i8) - 1];
                            h.f2185 = i8 + 1;
                        }
                        cArr = cArr4;
                    }
                    if (i4 > 0) {
                        h.f2185 = 0;
                        while (true) {
                            int i9 = h.f2185;
                            if (i9 >= i3) {
                                break;
                            }
                            cArr[i9] = (char) (cArr[i9] - iArr[2]);
                            h.f2185 = i9 + 1;
                        }
                    }
                    str2 = new String(cArr);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static void m2069() {
            f1832 = new char[]{')', 'P', 'S', 'X', 'O', 'H', 'G', 'B', 130, 128, 133, 141, 138, 131, 131, 131, 135, 140, 277, 276, 276, 275, 270, 271, 269, 141, 282, 276, 274, 273, 276, '#', 'F', 'K', 'M', 'K', 'Q', 'L', '4', 'n', 'o', 'k', 'p', 'y', 129, 252, 248, 253, 258, 260, 253, 'b', 191, 195, 203, 194};
        }
    }

    public dy(e eVar, String str, int i2) {
        this.f1826 = eVar;
        this.f1827 = str;
        this.f1825 = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1826);
        sb.append(m2054((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1)).intern());
        sb.append(this.f1827);
        String string = sb.toString();
        int i2 = f1822 + 87;
        f1821 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public final boolean m2055() {
        if (m2065() != e.f1836) {
            f1821 = (f1822 + 17) % 128;
            return false;
        }
        int i2 = f1822 + 13;
        f1821 = i2 % 128;
        if (i2 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final boolean m2056() {
        f1822 = (f1821 + 63) % 128;
        if (m2065() != e.f1837) {
            f1821 = (f1822 + 9) % 128;
            return false;
        }
        int i2 = f1821 + 43;
        f1822 = i2 % 128;
        return i2 % 2 != 0;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m2057() {
        f1822 = (f1821 + 75) % 128;
        if (m2065() != e.f1835) {
            f1821 = (f1822 + 47) % 128;
            return false;
        }
        int i2 = f1821 + 15;
        f1822 = i2 % 128;
        return i2 % 2 != 0;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m2058() {
        int i2 = f1822 + 39;
        f1821 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 55 / 0;
            if (m2065() == e.f1831) {
                return true;
            }
        } else if (m2065() == e.f1831) {
            return true;
        }
        f1822 = (f1821 + 71) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final boolean m2059() {
        if (m2065() == e.f1839) {
            int i2 = f1822 + 35;
            f1821 = i2 % 128;
            return i2 % 2 == 0;
        }
        int i3 = f1822 + 35;
        f1821 = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m2060() {
        f1822 = (f1821 + 53) % 128;
        if (m2065() != e.f1833) {
            return false;
        }
        int i2 = f1822 + 33;
        f1821 = i2 % 128;
        return i2 % 2 == 0;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m2061() {
        if (m2065() != e.f1830) {
            return false;
        }
        int i2 = (f1822 + 55) % 128;
        f1821 = i2;
        int i3 = i2 + 37;
        f1822 = i3 % 128;
        if (i3 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2063(String str) {
        f1821 = (f1822 + 5) % 128;
        boolean zEquals = this.f1827.equals(str);
        int i2 = f1822 + 89;
        f1821 = i2 % 128;
        if (i2 % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final int m2064() {
        int i2 = f1822 + 53;
        f1821 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1825;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final e m2065() {
        int i2 = f1821;
        e eVar = this.f1826;
        int i3 = i2 + 21;
        f1822 = i3 % 128;
        if (i3 % 2 != 0) {
            return eVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m2066() {
        int i2 = f1821 + 123;
        f1822 = i2 % 128;
        if (i2 % 2 == 0) {
            m2062();
            throw null;
        }
        if (m2062() || m2057()) {
            return true;
        }
        int i3 = f1821 + 25;
        f1822 = i3 % 128;
        if (i3 % 2 != 0) {
            return m2061() || m2060();
        }
        m2061();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2067() {
        int i2 = f1821;
        int i3 = i2 + 55;
        f1822 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.f1827;
        int i4 = i2 + 19;
        f1822 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2054(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f1823[i3 + i4]) ^ (((long) i4) * f1824)) ^ ((long) c2));
                        a.f69 = i4 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2062() {
        f1822 = (f1821 + 63) % 128;
        if (m2065() == e.f1838) {
            return true;
        }
        f1822 = (f1821 + 49) % 128;
        return false;
    }
}
