package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ea {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1873 = 202;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f1874 = true;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1875 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1876 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f1877 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1878 = {236};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Object f1879;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f1880;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f1881;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f1882;

    public ea(Object obj) {
        this.f1879 = obj;
    }

    public final String toString() {
        int i10 = f1875 + 1;
        f1876 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (!(this.f1879 instanceof String)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f1879);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m2117(null, (ViewConfiguration.getScrollBarSize() >> 8) + 127, null, "\u0081").intern());
        sb3.append(this.f1879);
        String strM = f2.m(sb3, m2117(null, ExpandableListView.getPackedPositionChild(0L) + 128, null, "\u0081"));
        f1875 = (f1876 + InterfaceC0435l1.d.b.f29110g) % 128;
        return strM;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final ea m2118() {
        int i10 = f1876;
        int i11 = i10 + 71;
        f1875 = i11 % 128;
        int i12 = i11 % 2;
        this.f1880 = true;
        int i13 = i10 + 99;
        f1875 = i13 % 128;
        if (i13 % 2 != 0) {
            return this;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final ea m2119() {
        int i10 = f1875;
        this.f1881 = true;
        f1876 = (i10 + 9) % 128;
        return this;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final boolean m2120() {
        int i10 = f1876;
        boolean z10 = this.f1881;
        f1875 = (i10 + 121) % 128;
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if ((r0 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r4 = r4.f1879;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if ((r4 instanceof java.lang.Long) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        return (java.lang.Long) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if ((r4 instanceof java.lang.Double) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        return (java.lang.Double) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if ((r4.f1879 instanceof java.lang.Integer) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if ((r4.f1879 instanceof java.lang.Integer) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r4 = (java.lang.Integer) r4.f1879;
        r0 = r0 + 11;
        com.ironsource.adqualitysdk.sdk.i.ea.f1875 = r0 % 128;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Number m2121() {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ea.f1876
            int r1 = r0 + 51
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ea.f1875 = r2
            int r1 = r1 % 2
            r2 = 0
            if (r1 != 0) goto L18
            java.lang.Object r1 = r4.f1879
            boolean r1 = r1 instanceof java.lang.Integer
            r3 = 26
            int r3 = r3 / 0
            if (r1 == 0) goto L2e
            goto L1e
        L18:
            java.lang.Object r1 = r4.f1879
            boolean r1 = r1 instanceof java.lang.Integer
            if (r1 == 0) goto L2e
        L1e:
            java.lang.Object r4 = r4.f1879
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r0 = r0 + 11
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ea.f1875 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L2d
            return r4
        L2d:
            throw r2
        L2e:
            java.lang.Object r4 = r4.f1879
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L37
            java.lang.Long r4 = (java.lang.Long) r4
            return r4
        L37:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L3e
            java.lang.Double r4 = (java.lang.Double) r4
            return r4
        L3e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ea.m2121():java.lang.Number");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m2122() {
        int i10 = f1876 + 63;
        f1875 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1882;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m2124() {
        int i10 = f1876;
        Object obj = this.f1879;
        f1875 = (i10 + 11) % 128;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r7 = r7.f1879;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if ((r7 instanceof java.lang.Boolean) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        return ((java.lang.Boolean) r7).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if ((r7 instanceof java.lang.Integer) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if ((r7 instanceof java.lang.Long) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ea.f1876 = (r0 + 125) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (((java.lang.Long) r7).longValue() == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if ((r7 instanceof java.lang.Double) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        if (((java.lang.Double) r7).doubleValue() == 0.0d) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ea.f1875 = (com.ironsource.adqualitysdk.sdk.i.ea.f1876 + 21) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        if ((r7 instanceof java.lang.String) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
    
        if (android.text.TextUtils.isEmpty((java.lang.String) r7) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        r7 = (com.ironsource.adqualitysdk.sdk.i.ea.f1876 + com.ironsource.InterfaceC0435l1.d.b.f29109f) % 128;
        com.ironsource.adqualitysdk.sdk.i.ea.f1875 = r7;
        com.ironsource.adqualitysdk.sdk.i.ea.f1876 = (r7 + com.ironsource.InterfaceC0435l1.d.b.f29110g) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r7.f1879 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r7.f1879 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r2 = r2 + 13;
        com.ironsource.adqualitysdk.sdk.i.ea.f1875 = r2 % 128;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2125() {
        /*
            r7 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ea.f1875
            int r1 = r0 + 49
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ea.f1876 = r2
            int r1 = r1 % 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L15
            java.lang.Object r1 = r7.f1879
            r5 = 1
            int r5 = r5 / r3
            if (r1 != 0) goto L25
            goto L19
        L15:
            java.lang.Object r1 = r7.f1879
            if (r1 != 0) goto L25
        L19:
            int r2 = r2 + 13
            int r7 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.ea.f1875 = r7
            int r2 = r2 % 2
            if (r2 != 0) goto L24
            return r4
        L24:
            return r3
        L25:
            java.lang.Object r7 = r7.f1879
            boolean r1 = r7 instanceof java.lang.Boolean
            if (r1 == 0) goto L32
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L32:
            boolean r1 = r7 instanceof java.lang.Integer
            if (r1 == 0) goto L40
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 == 0) goto L3f
            return r4
        L3f:
            return r3
        L40:
            boolean r1 = r7 instanceof java.lang.Long
            if (r1 == 0) goto L58
            int r0 = r0 + 125
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ea.f1876 = r0
            java.lang.Long r7 = (java.lang.Long) r7
            long r0 = r7.longValue()
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 == 0) goto L57
            return r4
        L57:
            return r3
        L58:
            boolean r0 = r7 instanceof java.lang.Double
            if (r0 == 0) goto L72
            java.lang.Double r7 = (java.lang.Double) r7
            double r0 = r7.doubleValue()
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 == 0) goto L71
            int r7 = com.ironsource.adqualitysdk.sdk.i.ea.f1876
            int r7 = r7 + 21
            int r7 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.ea.f1875 = r7
            return r4
        L71:
            return r3
        L72:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L8e
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L8d
            int r7 = com.ironsource.adqualitysdk.sdk.i.ea.f1876
            int r7 = r7 + 105
            int r7 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.ea.f1875 = r7
            int r7 = r7 + 109
            int r7 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.ea.f1876 = r7
            return r4
        L8d:
            return r3
        L8e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ea.m2125():boolean");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m2126() {
        int i10 = f1875;
        boolean z10 = this.f1880;
        int i11 = i10 + 15;
        f1876 = i11 % 128;
        if (i11 % 2 == 0) {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2117(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2932) {
            try {
                char[] cArr2 = f1878;
                int i11 = f1873;
                if (f1877) {
                    int length = bArr.length;
                    k.f2931 = length;
                    char[] cArr3 = new char[length];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i12 = k.f2933;
                        int i13 = k.f2931 - 1;
                        int i14 = k.f2933;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        k.f2933 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f1874) {
                    int length2 = cArr.length;
                    k.f2931 = length2;
                    char[] cArr4 = new char[length2];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i15 = k.f2933;
                        int i16 = k.f2931 - 1;
                        int i17 = k.f2933;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        k.f2933 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                k.f2931 = length3;
                char[] cArr5 = new char[length3];
                k.f2933 = 0;
                while (k.f2933 < k.f2931) {
                    int i18 = k.f2933;
                    int i19 = k.f2931 - 1;
                    int i20 = k.f2933;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    k.f2933 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final ea m2123(boolean z10) {
        int i10 = f1876;
        int i11 = i10 + 115;
        f1875 = i11 % 128;
        if (i11 % 2 == 0) {
            this.f1882 = z10;
            int i12 = 28 / 0;
        } else {
            this.f1882 = z10;
        }
        int i13 = i10 + 115;
        f1875 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 99 / 0;
        }
        return this;
    }
}
