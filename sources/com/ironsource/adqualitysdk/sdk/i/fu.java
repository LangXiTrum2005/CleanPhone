package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.InterfaceC0435l1;
import java.io.UnsupportedEncodingException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class fu extends gc {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2088 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2089;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2090 = {'m', 214, 245, 281, '\\', 188, 16, 5, '2', 'h', 'o', 'l', 'B'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final ef f2091;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final gb f2092;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final gb f2093;

    public fu(ef efVar, gb gbVar, gb gbVar2, byte b10) {
        super(b10);
        this.f2091 = efVar;
        this.f2093 = gbVar;
        this.f2092 = gbVar2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2221(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2261) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f2090, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    h.f2262 = 0;
                    char c4 = 0;
                    while (true) {
                        int i14 = h.f2262;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                        }
                        c4 = cArr2[i14];
                        h.f2262 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    h.f2262 = 0;
                    while (true) {
                        int i16 = h.f2262;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        h.f2262 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    h.f2262 = 0;
                    while (true) {
                        int i17 = h.f2262;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        h.f2262 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        r0 = r0 + 85;
        com.ironsource.adqualitysdk.sdk.i.fu.f2089 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if ((r0 % 2) != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.fu.class == r5.getClass()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        r5 = (com.ironsource.adqualitysdk.sdk.i.fu) r5;
        r0 = r4.f2091;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r0.equals(r5.f2091) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r5.f2091 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r0 = r4.f2093;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        if (r0.equals(r5.f2093) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if (r5.f2093 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        r4 = r4.f2092;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r4 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        return r4.equals(r5.f2092);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
    
        if (r5.f2092 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0062, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.fu.f2089 + 19;
        com.ironsource.adqualitysdk.sdk.i.fu.f2088 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
    
        if ((r4 % 2) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006e, code lost:
    
        r4 = 75 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0073, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0074, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r5 == null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.fu.f2088
            int r1 = r0 + 83
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.fu.f2089 = r2
            int r1 = r1 % 2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            r1 = 13
            int r1 = r1 / r3
            if (r4 != r5) goto L17
            goto L16
        L14:
            if (r4 != r5) goto L17
        L16:
            return r2
        L17:
            if (r5 == 0) goto L74
            int r0 = r0 + 85
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fu.f2089 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L72
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.fu> r0 = com.ironsource.adqualitysdk.sdk.i.fu.class
            java.lang.Class r1 = r5.getClass()
            if (r0 == r1) goto L2c
            goto L74
        L2c:
            com.ironsource.adqualitysdk.sdk.i.fu r5 = (com.ironsource.adqualitysdk.sdk.i.fu) r5
            com.ironsource.adqualitysdk.sdk.i.ef r0 = r4.f2091
            if (r0 == 0) goto L3b
            com.ironsource.adqualitysdk.sdk.i.ef r1 = r5.f2091
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            goto L3f
        L3b:
            com.ironsource.adqualitysdk.sdk.i.ef r0 = r5.f2091
            if (r0 == 0) goto L40
        L3f:
            return r3
        L40:
            com.ironsource.adqualitysdk.sdk.i.gb r0 = r4.f2093
            if (r0 == 0) goto L4d
            com.ironsource.adqualitysdk.sdk.i.gb r1 = r5.f2093
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L52
            goto L51
        L4d:
            com.ironsource.adqualitysdk.sdk.i.gb r0 = r5.f2093
            if (r0 == 0) goto L52
        L51:
            return r3
        L52:
            com.ironsource.adqualitysdk.sdk.i.gb r4 = r4.f2092
            if (r4 == 0) goto L5d
            com.ironsource.adqualitysdk.sdk.i.gb r5 = r5.f2092
            boolean r4 = r4.equals(r5)
            return r4
        L5d:
            com.ironsource.adqualitysdk.sdk.i.gb r4 = r5.f2092
            if (r4 != 0) goto L62
            return r2
        L62:
            int r4 = com.ironsource.adqualitysdk.sdk.i.fu.f2089
            int r4 = r4 + 19
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.fu.f2088 = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L71
            r4 = 75
            int r4 = r4 / r3
        L71:
            return r3
        L72:
            r4 = 0
            throw r4
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fu.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        ef efVar = this.f2091;
        int iHashCode2 = 0;
        if (efVar != null) {
            int i10 = f2089 + 121;
            f2088 = i10 % 128;
            if (i10 % 2 == 0) {
                efVar.hashCode();
                throw null;
            }
            iHashCode = efVar.hashCode();
        } else {
            iHashCode = 0;
        }
        int i11 = iHashCode * 31;
        gb gbVar = this.f2093;
        int iHashCode3 = (i11 + (gbVar != null ? gbVar.hashCode() : 0)) * 31;
        gb gbVar2 = this.f2092;
        if (gbVar2 != null) {
            int i12 = f2089 + 91;
            f2088 = i12 % 128;
            if (i12 % 2 == 0) {
                gbVar2.hashCode();
                throw null;
            }
            iHashCode2 = gbVar2.hashCode();
        } else {
            f2089 = (f2088 + 61) % 128;
        }
        return iHashCode3 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2221("\u0000\u0000\u0000\u0001", new int[]{0, 4, 178, 0}, true).intern());
        sb2.append(this.f2091);
        sb2.append(m2221("\u0000\u0001", new int[]{4, 2, 152, 0}, true).intern());
        sb2.append(this.f2093);
        if (this.f2092 != null) {
            int i10 = (f2088 + 39) % 128;
            f2089 = i10;
            if (this.f2093 instanceof ft) {
                int i11 = i10 + 75;
                f2088 = i11 % 128;
                sb2.append((i11 % 2 == 0 ? m2221(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{6, 1, 0, 0}, false) : m2221(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{6, 1, 0, 0}, true)).intern());
            } else {
                sb2.append(m2221(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{7, 1, 0, 1}, true).intern());
                m2235(sb2);
            }
            sb2.append(m2221("\u0001\u0001\u0001\u0000\u0001", new int[]{8, 5, 0, 0}, false).intern());
            sb2.append(this.f2092);
        }
        return sb2.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ */
    public final ea mo2220(ee eeVar, cl clVar) {
        if (this.f2091.m2165(eeVar, clVar).m2125()) {
            int i10 = f2088 + 115;
            f2089 = i10 % 128;
            if (i10 % 2 == 0) {
                return this.f2093.m2232(eeVar, clVar);
            }
            this.f2093.m2232(eeVar, clVar);
            throw null;
        }
        if (this.f2092 == null) {
            return new ea(Boolean.FALSE);
        }
        int i11 = f2089 + 59;
        f2088 = i11 % 128;
        if (i11 % 2 != 0) {
            eeVar.m2155(this);
            return this.f2092.m2232(eeVar, clVar);
        }
        eeVar.m2155(this);
        this.f2092.m2232(eeVar, clVar);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ */
    public final int mo2219(ee eeVar) {
        if (eeVar.m2153(this)) {
            f2089 = (f2088 + 35) % 128;
            return this.f2093 instanceof ft ? 1 : 0;
        }
        int iMo2218 = this.f2093.mo2218();
        if (this.f2092 instanceof ft) {
            return iMo2218;
        }
        int i10 = iMo2218 - 1;
        f2088 = (f2089 + 107) % 128;
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035 A[PHI: r0
  0x0035: PHI (r0v7 int) = (r0v6 int), (r0v9 int) binds: [B:10:0x0033, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ */
    public final int mo2218() {
        f2089 = (f2088 + 119) % 128;
        int iMo2218 = this.f2093.mo2218();
        gb gbVar = this.f2092;
        if (gbVar != null) {
            int i10 = f2088 + 43;
            f2089 = i10 % 128;
            if (i10 % 2 != 0) {
                iMo2218 -= gbVar.mo2218();
                if (this.f2093 instanceof ft) {
                    iMo2218--;
                }
            } else {
                iMo2218 += gbVar.mo2218();
                if (this.f2093 instanceof ft) {
                    iMo2218--;
                }
            }
        }
        int i11 = f2089 + InterfaceC0435l1.d.b.f29109f;
        f2088 = i11 % 128;
        if (i11 % 2 != 0) {
            return iMo2218;
        }
        throw null;
    }
}
