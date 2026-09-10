package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.ViewConfiguration;
import com.google.firebase.crashlytics.internal.model.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class dv extends ee {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1811 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int[] f1812 = {1887979786, -1335051371, 661157473, -1453609702, -2060153849, 507214364, 1040902610, -300864089, -1772527112, 1737736699, -1795836688, 1715385225, 2030379516, 612648369, -407088790, -1163277759, 188810067, -620259010};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1813;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ee[] f1814;

    public dv(List<ee> list, dm dmVar) {
        super(dmVar);
        ee[] eeVarArr = new ee[list.size()];
        this.f1814 = eeVarArr;
        list.toArray(eeVarArr);
    }

    public final boolean equals(Object obj) {
        int i2 = f1813;
        int i3 = (i2 + 19) % 128;
        f1811 = i3;
        if (this == obj) {
            f1813 = (i3 + 109) % 128;
            return true;
        }
        if (obj == null) {
            return false;
        }
        f1811 = (i2 + 65) % 128;
        if (dv.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f1814, ((dv) obj).f1814);
    }

    public final int hashCode() {
        f1811 = (f1813 + 77) % 128;
        int iHashCode = Arrays.hashCode(this.f1814);
        f1811 = (f1813 + 5) % 128;
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m2049(new int[]{1622603482, 2026269840}, (ViewConfiguration.getLongPressTimeout() >> 16) + 1).intern());
        sb.append(ee.m2084(this.f1814));
        String strC = a.C(sb, m2049(new int[]{-1123341230, -382096324}, -Process.getGidForName("")));
        int i2 = f1811 + 63;
        f1813 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
        return strC;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ee
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final du mo2050(dr drVar, cp cpVar) {
        ArrayList arrayList = new ArrayList();
        ee[] eeVarArr = this.f1814;
        int length = eeVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = f1813 + 29;
            f1811 = i3 % 128;
            if (i3 % 2 == 0) {
                arrayList.add(eeVarArr[i2].m2086(drVar, cpVar).m2043());
                i2 += 81;
            } else {
                arrayList.add(eeVarArr[i2].m2086(drVar, cpVar).m2043());
                i2++;
            }
            f1813 = (f1811 + 51) % 128;
        }
        return new du(arrayList);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2049(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1812.clone();
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
}
