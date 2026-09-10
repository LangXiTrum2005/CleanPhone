package com.p004ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ef extends ee {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1878 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1879;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int[] f1880 = {1978848276, -1772754001, 1135313326, 1227918279, 2061939814, -1246222404, -469958609, -695790088, 812985192, 1537411016, -136664330, -205113409, -115843049, 1692977033, -2046416064, 529317177, 1491226857, -707705953};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ee f1881;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ee f1882;

    public ef(ee eeVar, ee eeVar2, dm dmVar) {
        super(dmVar);
        this.f1882 = eeVar;
        this.f1881 = eeVar2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2088(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1880.clone();
                d.f1584 = 0;
                while (true) {
                    int i3 = d.f1584;
                    if (i3 < iArr.length) {
                        int i4 = iArr[i3];
                        char c2 = (char) (i4 >> 16);
                        cArr[0] = c2;
                        char c3 = (char) i4;
                        cArr[1] = c3;
                        char c4 = (char) (iArr[i3 + 1] >> 16);
                        cArr[2] = c4;
                        char c5 = (char) iArr[i3 + 1];
                        cArr[3] = c5;
                        d.f1587 = (c2 << 16) + c3;
                        d.f1585 = (c4 << 16) + c5;
                        d.m1788(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = d.f1587 ^ iArr2[i5];
                            d.f1587 = i6;
                            int iM1787 = d.m1787(i6) ^ d.f1585;
                            int i7 = d.f1587;
                            d.f1587 = iM1787;
                            d.f1585 = i7;
                        }
                        int i8 = d.f1587;
                        int i9 = d.f1585;
                        d.f1587 = i9;
                        d.f1585 = i8;
                        int i10 = i8 ^ iArr2[16];
                        d.f1585 = i10;
                        int i11 = i9 ^ iArr2[17];
                        d.f1587 = i11;
                        cArr[0] = (char) (i11 >>> 16);
                        cArr[1] = (char) i11;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        d.m1788(iArr2);
                        int i12 = d.f1584;
                        cArr2[i12 << 1] = cArr[0];
                        cArr2[(i12 << 1) + 1] = cArr[1];
                        cArr2[(i12 << 1) + 2] = cArr[2];
                        cArr2[(i12 << 1) + 3] = cArr[3];
                        d.f1584 = i12 + 2;
                    } else {
                        str = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public boolean equals(Object obj) {
        int i2;
        if (this != obj) {
            if (obj != null) {
                f1879 = (f1878 + 115) % 128;
                if (getClass() == obj.getClass()) {
                    ef efVar = (ef) obj;
                    ee eeVar = this.f1882;
                    if (eeVar == null ? efVar.f1882 != null : !eeVar.equals(efVar.f1882)) {
                        return false;
                    }
                    ee eeVar2 = this.f1881;
                    ee eeVar3 = efVar.f1881;
                    if (eeVar2 != null) {
                        return eeVar2.equals(eeVar3);
                    }
                    if (eeVar3 == null) {
                        i2 = f1878 + 65;
                    }
                }
            }
            return false;
        }
        i2 = f1878 + 109;
        f1879 = i2 % 128;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public int hashCode() {
        int iHashCode;
        int i2 = f1878 + 45;
        f1879 = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 != 0) {
            int i3 = 80 / 0;
            if (this.f1882 != null) {
                iHashCode = this.f1882.hashCode();
            } else {
                iHashCode = 0;
            }
        } else if (this.f1882 != null) {
            iHashCode = this.f1882.hashCode();
        } else {
            iHashCode = 0;
        }
        int i4 = iHashCode * 31;
        ee eeVar = this.f1881;
        if (eeVar != null) {
            int i5 = f1879 + 105;
            f1878 = i5 % 128;
            if (i5 % 2 == 0) {
                eeVar.hashCode();
                throw null;
            }
            iHashCode2 = eeVar.hashCode();
        } else {
            f1879 = (f1878 + 43) % 128;
        }
        return i4 + iHashCode2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1882);
        sb.append(m2088(new int[]{-63842335, -2109043621}, 1 - (ViewConfiguration.getTapTimeout() >> 16)).intern());
        sb.append(mo2089());
        sb.append(m2088(new int[]{-63842335, -2109043621}, 1 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
        sb.append(this.f1881);
        String string = sb.toString();
        f1879 = (f1878 + 1) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public abstract String mo2089();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final ee m2090() {
        int i2 = f1879;
        ee eeVar = this.f1881;
        int i3 = i2 + 95;
        f1878 = i3 % 128;
        if (i3 % 2 != 0) {
            return eeVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ee m2091() {
        int i2 = f1878;
        ee eeVar = this.f1882;
        int i3 = i2 + 93;
        f1879 = i3 % 128;
        if (i3 % 2 == 0) {
            return eeVar;
        }
        throw null;
    }
}
