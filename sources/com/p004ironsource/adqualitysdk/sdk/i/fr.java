package com.p004ironsource.adqualitysdk.sdk.i;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class fr extends fq {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2011 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2012;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2013 = {'i', 215, 221, 182, 145, 'w', 225, 20, '$'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ee f2014;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private fq f2015;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ee f2016;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ee f2017;

    public fr(ee eeVar, ee eeVar2, ee eeVar3, fq fqVar) {
        this.f2014 = eeVar;
        this.f2016 = eeVar2;
        this.f2017 = eeVar3;
        this.f2015 = fqVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static du m2131(ee eeVar, dr drVar, cp cpVar) {
        int i2 = f2011 + 79;
        f2012 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (eeVar != null) {
            return eeVar.m2086(drVar, cpVar);
        }
        du duVar = new du(null);
        f2012 = (f2011 + 73) % 128;
        return duVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2132(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f2013, i2, cArr, 0, i3);
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            f2011 = (f2012 + 3) % 128;
            if (fr.class == obj.getClass()) {
                fr frVar = (fr) obj;
                ee eeVar = this.f2014;
                if (eeVar == null ? frVar.f2014 != null : !eeVar.equals(frVar.f2014)) {
                    return false;
                }
                ee eeVar2 = this.f2016;
                if (eeVar2 == null ? frVar.f2016 != null : !eeVar2.equals(frVar.f2016)) {
                    return false;
                }
                ee eeVar3 = this.f2017;
                if (eeVar3 == null ? frVar.f2017 != null : !eeVar3.equals(frVar.f2017)) {
                    return false;
                }
                fq fqVar = this.f2015;
                if (fqVar != null) {
                    f2012 = (f2011 + 67) % 128;
                    return fqVar.equals(frVar.f2015);
                }
                if (frVar.f2015 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        ee eeVar = this.f2014;
        int iHashCode3 = 0;
        if (eeVar != null) {
            f2011 = (f2012 + 13) % 128;
            iHashCode = eeVar.hashCode();
        } else {
            iHashCode = 0;
        }
        int i2 = iHashCode * 31;
        ee eeVar2 = this.f2016;
        if (eeVar2 != null) {
            iHashCode2 = eeVar2.hashCode();
        } else {
            f2012 = (f2011 + 17) % 128;
            iHashCode2 = 0;
        }
        int i3 = (i2 + iHashCode2) * 31;
        ee eeVar3 = this.f2017;
        int iHashCode4 = (i3 + (eeVar3 != null ? eeVar3.hashCode() : 0)) * 31;
        fq fqVar = this.f2015;
        if (fqVar != null) {
            f2012 = (f2011 + 91) % 128;
            iHashCode3 = fqVar.hashCode();
        }
        return iHashCode4 + iHashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m2132(false, new int[]{0, 5, 109, 0}, "\u0001\u0001\u0001\u0000\u0000").intern());
        ee eeVar = this.f2014;
        if (eeVar != null) {
            sb.append(eeVar);
            f2012 = (f2011 + 67) % 128;
        }
        sb.append(m2132(false, new int[]{5, 2, 180, 0}, "\u0001\u0001").intern());
        sb.append(this.f2016);
        sb.append(m2132(false, new int[]{5, 2, 180, 0}, "\u0001\u0001").intern());
        ee eeVar2 = this.f2017;
        if (eeVar2 != null) {
            f2011 = (f2012 + 63) % 128;
            sb.append(eeVar2);
        }
        sb.append(m2132(false, new int[]{7, 2, 0, 2}, "\u0001\u0001").intern());
        sb.append(this.f2015);
        return sb.toString();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.fq
    /* JADX INFO: renamed from: ｋ */
    public final du mo2122(dr drVar, cp cpVar) {
        m2131(this.f2014, drVar, cpVar);
        while (this.f2016.m2086(drVar, cpVar).m2047()) {
            du duVarMo2122 = this.f2015.mo2122(drVar, cpVar);
            if (duVarMo2122.m2044()) {
                break;
            }
            int i2 = f2012 + 45;
            f2011 = i2 % 128;
            if (i2 % 2 == 0) {
                duVarMo2122.m2046();
                throw null;
            }
            if (duVarMo2122.m2046()) {
                return duVarMo2122;
            }
            m2131(this.f2017, drVar, cpVar);
            f2012 = (f2011 + 95) % 128;
        }
        return new du(null);
    }
}
