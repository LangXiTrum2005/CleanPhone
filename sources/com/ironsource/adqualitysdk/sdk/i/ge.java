package com.ironsource.adqualitysdk.sdk.i;

import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ge extends gb {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int[] f2158 = {-1154705051, 1218761377, -396592272, -971438388, 2079037843, 919666884, 810281750, -1477483322, -489418704, 979105129, -558078731, -1392896611, -724801083, 1619345780, 1450923223, 788044811, -1275241476, -301521547};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2159 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2160;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final gb f2161;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final ef f2162;

    public ge(ef efVar, gb gbVar) {
        this.f2162 = efVar;
        this.f2161 = gbVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2238(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2158.clone();
                a.f58 = 0;
                while (true) {
                    int i11 = a.f58;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c4 = (char) (i12 >> 16);
                        cArr[0] = c4;
                        char c5 = (char) i12;
                        cArr[1] = c5;
                        char c10 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c10;
                        char c11 = (char) iArr[i11 + 1];
                        cArr[3] = c11;
                        a.f59 = (c4 << 16) + c5;
                        a.f60 = (c10 << 16) + c11;
                        a.m199(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = a.f59 ^ iArr2[i13];
                            a.f59 = i14;
                            int iM200 = a.m200(i14) ^ a.f60;
                            int i15 = a.f59;
                            a.f59 = iM200;
                            a.f60 = i15;
                        }
                        int i16 = a.f59;
                        int i17 = a.f60;
                        a.f59 = i17;
                        a.f60 = i16;
                        int i18 = i16 ^ iArr2[16];
                        a.f60 = i18;
                        int i19 = i17 ^ iArr2[17];
                        a.f59 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        a.m199(iArr2);
                        int i20 = a.f58;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        a.f58 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            f2159 = (f2160 + 121) % 128;
            return true;
        }
        if (obj != null) {
            f2159 = (f2160 + 41) % 128;
            if (ge.class == obj.getClass()) {
                ge geVar = (ge) obj;
                ef efVar = this.f2162;
                if (efVar == null ? geVar.f2162 != null : !efVar.equals(geVar.f2162)) {
                    return false;
                }
                gb gbVar = this.f2161;
                if (gbVar != null) {
                    return gbVar.equals(geVar.f2161);
                }
                if (geVar.f2161 == null) {
                    return true;
                }
                int i10 = f2159 + 119;
                f2160 = i10 % 128;
                if (i10 % 2 == 0) {
                    return false;
                }
                throw null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        ef efVar = this.f2162;
        int iHashCode = 0;
        int iHashCode2 = (efVar != null ? efVar.hashCode() : 0) * 31;
        gb gbVar = this.f2161;
        if (gbVar != null) {
            iHashCode = gbVar.hashCode();
            i10 = f2160 + 99;
        } else {
            i10 = f2160 + InterfaceC0435l1.d.b.f29109f;
        }
        f2159 = i10 % 128;
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2238(new int[]{1537562470, -1891769830, 1556106052, 1150634889}, 6 - ExpandableListView.getPackedPositionChild(0L)).intern());
        sb2.append(this.f2162);
        sb2.append(m2238(new int[]{-1299129002, 1212552106}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2).intern());
        sb2.append(this.f2161);
        String string = sb2.toString();
        f2160 = (f2159 + 65) % 128;
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ */
    public final ea mo2220(ee eeVar, cl clVar) {
        while (this.f2162.m2165(eeVar, clVar).m2125()) {
            ea eaVarM2232 = this.f2161.m2232(eeVar, clVar);
            if (eaVarM2232.m2126()) {
                break;
            }
            f2159 = (f2160 + 11) % 128;
            if (eaVarM2232.m2122()) {
                int i10 = f2159 + 39;
                f2160 = i10 % 128;
                if (i10 % 2 == 0) {
                    return eaVarM2232;
                }
                throw null;
            }
        }
        ea eaVar = new ea(null);
        f2159 = (f2160 + 121) % 128;
        return eaVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ */
    public final int mo2218() {
        int i10 = f2160 + 77;
        f2159 = i10 % 128;
        int i11 = i10 % 2;
        gb gbVar = this.f2161;
        if (i11 != 0) {
            return gbVar.mo2218();
        }
        gbVar.mo2218();
        throw null;
    }
}
