package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class fx extends gb {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2103 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2104;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f2105 = {-2110499006, 628665497, -1360820752, 930702440, 845170259, 956846547, -1071501743, 701844863, 1618993225, -429352635, 1228815329, 1433260970, 281192638, 693209386, -301888960, -937884034, 1445223949, 540915295};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final ef f2106;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final ef f2107;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final gb f2108;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final ef f2109;

    public fx(ef efVar, ef efVar2, ef efVar3, gb gbVar) {
        this.f2109 = efVar;
        this.f2106 = efVar2;
        this.f2107 = efVar3;
        this.f2108 = gbVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static ea m2224(ef efVar, ee eeVar, cl clVar) {
        int i10 = f2103;
        int i11 = i10 + 89;
        f2104 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (efVar == null) {
            return new ea(null);
        }
        int i12 = i10 + 93;
        f2104 = i12 % 128;
        if (i12 % 2 == 0) {
            return efVar.m2165(eeVar, clVar);
        }
        ea eaVarM2165 = efVar.m2165(eeVar, clVar);
        int i13 = 51 / 0;
        return eaVarM2165;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fx.class != obj.getClass()) {
            return false;
        }
        fx fxVar = (fx) obj;
        ef efVar = this.f2109;
        if (efVar == null ? fxVar.f2109 != null : !efVar.equals(fxVar.f2109)) {
            return false;
        }
        ef efVar2 = this.f2106;
        if (efVar2 == null ? fxVar.f2106 != null : !efVar2.equals(fxVar.f2106)) {
            return false;
        }
        ef efVar3 = this.f2107;
        if (efVar3 == null ? fxVar.f2107 != null : !efVar3.equals(fxVar.f2107)) {
            return false;
        }
        gb gbVar = this.f2108;
        if (gbVar != null) {
            f2103 = (f2104 + 13) % 128;
            return gbVar.equals(fxVar.f2108);
        }
        if (fxVar.f2108 == null) {
            f2104 = (f2103 + 89) % 128;
            return true;
        }
        int i10 = f2104 + 7;
        f2103 = i10 % 128;
        if (i10 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        ef efVar = this.f2109;
        int iHashCode2 = 0;
        int iHashCode3 = (efVar != null ? efVar.hashCode() : 0) * 31;
        ef efVar2 = this.f2106;
        if (efVar2 != null) {
            int i10 = f2104 + 49;
            f2103 = i10 % 128;
            if (i10 % 2 == 0) {
                iHashCode = efVar2.hashCode();
                int i11 = 80 / 0;
            } else {
                iHashCode = efVar2.hashCode();
            }
        } else {
            iHashCode = 0;
        }
        int i12 = (iHashCode3 + iHashCode) * 31;
        ef efVar3 = this.f2107;
        int iHashCode4 = (i12 + (efVar3 != null ? efVar3.hashCode() : 0)) * 31;
        gb gbVar = this.f2108;
        if (gbVar != null) {
            iHashCode2 = gbVar.hashCode();
        } else {
            f2104 = (f2103 + InterfaceC0435l1.d.b.f29109f) % 128;
        }
        return iHashCode4 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2225(new int[]{-532087109, 430570348, 1922257657, -628059670}, 5 - ExpandableListView.getPackedPositionGroup(0L)).intern());
        ef efVar = this.f2109;
        if (efVar != null) {
            sb2.append(efVar);
            f2103 = (f2104 + 73) % 128;
        }
        sb2.append(m2225(new int[]{-897516107, 1216208209}, View.combineMeasuredStates(0, 0) + 2).intern());
        sb2.append(this.f2106);
        sb2.append(m2225(new int[]{-897516107, 1216208209}, 3 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
        ef efVar2 = this.f2107;
        if (efVar2 != null) {
            f2104 = (f2103 + InterfaceC0435l1.d.b.f29109f) % 128;
            sb2.append(efVar2);
        }
        sb2.append(m2225(new int[]{-928996664, 324194760}, 2 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
        sb2.append(this.f2108);
        String string = sb2.toString();
        int i10 = f2103 + 49;
        f2104 = i10 % 128;
        if (i10 % 2 == 0) {
            return string;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ */
    public final ea mo2220(ee eeVar, cl clVar) {
        m2224(this.f2109, eeVar, clVar);
        while (this.f2106.m2165(eeVar, clVar).m2125()) {
            int i10 = f2104 + InterfaceC0435l1.d.b.f29105b;
            f2103 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f2108.m2232(eeVar, clVar).m2126();
                throw null;
            }
            ea eaVarM2232 = this.f2108.m2232(eeVar, clVar);
            if (eaVarM2232.m2126()) {
                break;
            }
            if (eaVarM2232.m2122()) {
                f2104 = (f2103 + 25) % 128;
                return eaVarM2232;
            }
            m2224(this.f2107, eeVar, clVar);
        }
        return new ea(null);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2225(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2105.clone();
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ */
    public final int mo2218() {
        int i10 = f2103 + 79;
        f2104 = i10 % 128;
        int i11 = i10 % 2;
        gb gbVar = this.f2108;
        if (i11 == 0) {
            return gbVar.mo2218();
        }
        gbVar.mo2218();
        throw null;
    }
}
