package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class eo extends ef {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1974 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1975 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f1976 = {-97072527, 314927285, -1395367235, 1152626658, 248341502, -1512659027, -1991323238, 2047615021, 543172010, 230576336, 834276094, -22671183, -2084060351, 1576839628, -1591824824, -4941532, -1429228245, 2120991735};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final String f1977;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final ef[] f1978;

    public eo(String str, List<ef> list) {
        this.f1977 = eb.m2127(str);
        ef[] efVarArr = new ef[list.size()];
        this.f1978 = efVarArr;
        list.toArray(efVarArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            f1975 = (f1974 + 89) % 128;
            return true;
        }
        if (obj != null) {
            f1974 = (f1975 + 107) % 128;
            if (getClass() == obj.getClass()) {
                eo eoVar = (eo) obj;
                if (this.f1977.equals(eoVar.f1977)) {
                    return Arrays.equals(this.f1978, eoVar.f1978);
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        String str = this.f1977;
        int i10 = 0;
        if (str != null) {
            int i11 = f1974 + 87;
            f1975 = i11 % 128;
            if (i11 % 2 == 0) {
                iHashCode = str.hashCode();
                int i12 = 26 / 0;
            } else {
                iHashCode = str.hashCode();
            }
            i10 = iHashCode;
            f1974 = (f1975 + 61) % 128;
        }
        return Arrays.hashCode(this.f1978) + (i10 * 31);
    }

    public String toString() {
        f1974 = (f1975 + InterfaceC0435l1.d.b.f29109f) % 128;
        String strMo2175 = mo2175(this.f1978);
        f1975 = (f1974 + 75) % 128;
        return strMo2175;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final ef[] m2182() {
        int i10 = f1974;
        ef[] efVarArr = this.f1978;
        int i11 = i10 + 13;
        f1975 = i11 % 128;
        if (i11 % 2 != 0) {
            return efVarArr;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    public ea mo2164(ee eeVar, cl clVar) {
        List<Object> listM2184 = m2184(eeVar, clVar);
        if (m2183().equals(m2181(new int[]{1449737587, -585815792}, 3 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
            String strIntern = m2181(new int[]{-816249297, -1428227560, -2071283647, -46413596}, 7 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(clVar.m1643());
            sb2.append(m2181(new int[]{1903551645, -1165135709}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2).intern());
            sb2.append(listM2184.get(0));
            cn.m1706(strIntern, sb2.toString());
            ea eaVar = new ea(null);
            f1975 = (f1974 + 87) % 128;
            return eaVar;
        }
        try {
            return new ea(((dz) eeVar.m2157(m2183())).m2113(eeVar, clVar, listM2184));
        } catch (Exception unused) {
            if (clVar.m1644().m2375(m2183()) != null) {
                ea eaVarM2123 = clVar.m1644().m2375(m2183()).m2113(eeVar, clVar, listM2184).m2123(false);
                f1974 = (f1975 + InterfaceC0435l1.d.b.f29112i) % 128;
                return eaVarM2123;
            }
            ea eaVar2 = new ea(clVar.m1641().mo821(clVar, m2183(), listM2184, clVar.m1639(), eeVar));
            int i10 = f1974 + 77;
            f1975 = i10 % 128;
            if (i10 % 2 != 0) {
                return eaVar2;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2183() {
        int i10 = f1974 + InterfaceC0435l1.d.b.f29114k;
        f1975 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1977;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public String mo2175(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1977);
        sb2.append(m2181(new int[]{-1587493455, -883824935}, -TextUtils.lastIndexOf("", '0')).intern());
        sb2.append(ef.m2163(objArr));
        String strM = f2.m(sb2, m2181(new int[]{1041012195, 1297050257}, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))));
        int i10 = f1974 + 11;
        f1975 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 56 / 0;
        }
        return strM;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<Object> m2184(ee eeVar, cl clVar) {
        ArrayList arrayList = new ArrayList();
        ef[] efVarArr = this.f1978;
        f1974 = (f1975 + 89) % 128;
        for (ef efVar : efVarArr) {
            arrayList.add(efVar.m2165(eeVar, clVar).m2124());
        }
        int i10 = f1975 + 33;
        f1974 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 92 / 0;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2181(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1976.clone();
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
}
