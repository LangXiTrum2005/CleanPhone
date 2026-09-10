package com.p004ironsource.adqualitysdk.sdk.i;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class dx extends ee {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1816 = {16, ' ', '.'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1817 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1818 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private el f1819;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ee f1820;

    public dx(el elVar, ee eeVar, dm dmVar) {
        super(dmVar);
        this.f1819 = elVar;
        this.f1820 = eeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r5.f1819 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.dx.f1817
            int r1 = r0 + 115
            int r1 = r1 % 128
            com.p004ironsource.adqualitysdk.sdk.i.dx.f1818 = r1
            r1 = 1
            r2 = 0
            if (r4 != r5) goto L18
            int r0 = r0 + 43
            int r5 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.dx.f1818 = r5
            int r0 = r0 % 2
            if (r0 != 0) goto L17
            return r2
        L17:
            return r1
        L18:
            if (r5 == 0) goto L57
            java.lang.Class r0 = r5.getClass()
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.dx> r3 = com.p004ironsource.adqualitysdk.sdk.i.dx.class
            if (r3 == r0) goto L23
            goto L57
        L23:
            com.ironsource.adqualitysdk.sdk.i.dx r5 = (com.p004ironsource.adqualitysdk.sdk.i.dx) r5
            com.ironsource.adqualitysdk.sdk.i.el r0 = r4.f1819
            if (r0 == 0) goto L3a
            com.ironsource.adqualitysdk.sdk.i.el r3 = r5.f1819
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L3f
            int r5 = com.p004ironsource.adqualitysdk.sdk.i.dx.f1818
            int r5 = r5 + 77
            int r5 = r5 % 128
            com.p004ironsource.adqualitysdk.sdk.i.dx.f1817 = r5
            goto L3e
        L3a:
            com.ironsource.adqualitysdk.sdk.i.el r0 = r5.f1819
            if (r0 == 0) goto L3f
        L3e:
            return r2
        L3f:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r4.f1820
            if (r0 == 0) goto L52
            int r1 = com.p004ironsource.adqualitysdk.sdk.i.dx.f1818
            int r1 = r1 + 29
            int r1 = r1 % 128
            com.p004ironsource.adqualitysdk.sdk.i.dx.f1817 = r1
            com.ironsource.adqualitysdk.sdk.i.ee r5 = r5.f1820
            boolean r5 = r0.equals(r5)
            return r5
        L52:
            com.ironsource.adqualitysdk.sdk.i.ee r5 = r5.f1820
            if (r5 != 0) goto L57
            return r1
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.dx.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        el elVar = this.f1819;
        int iHashCode = 0;
        int iHashCode2 = (elVar != null ? elVar.hashCode() : 0) * 31;
        ee eeVar = this.f1820;
        if (eeVar != null) {
            int i2 = f1817 + 43;
            f1818 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 58 / 0;
                iHashCode = eeVar.hashCode();
            } else {
                iHashCode = eeVar.hashCode();
            }
        } else {
            f1817 = (f1818 + 11) % 128;
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1819);
        sb.append(m2052(true, new int[]{0, 3, 0, 1}, "\u0000\u0000\u0001").intern());
        sb.append(this.f1820);
        String string = sb.toString();
        int i2 = f1817 + 37;
        f1818 = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ee
    /* JADX INFO: renamed from: ｋ */
    public final du mo2050(dr drVar, cp cpVar) {
        f1817 = (f1818 + 35) % 128;
        du duVarM2086 = this.f1820.m2086(drVar, cpVar);
        drVar.m1981(this.f1819.m2103(), duVarM2086.m2043());
        f1817 = (f1818 + 113) % 128;
        return duVarM2086;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final el m2053() {
        int i2 = f1818 + 15;
        f1817 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1819;
        }
        int i3 = 41 / 0;
        return this.f1819;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2052(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f1816, i2, cArr, 0, i3);
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
}
