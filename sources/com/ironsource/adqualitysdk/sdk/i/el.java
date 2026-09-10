package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.f2;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class el extends eo {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f1956 = {126410818, -520849612, -185212105, -635241136, 1982594852, -916686705, 884845598, 2002294681, -1897545999, -958145852, -729857307, 1572523104, 674357343, 2055767301, 471621333, -12842965, 1714514232, 1750233462};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1957 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1958 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final ef f1959;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ef[] f1960;

    public el(ef efVar, String str, List<ef> list, List<ef> list2) {
        super(str, list2);
        this.f1959 = efVar;
        if (list != null) {
            ef[] efVarArr = new ef[list.size()];
            this.f1960 = efVarArr;
            list.toArray(efVarArr);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List<Class> m2172(ef[] efVarArr, ee eeVar, cl clVar) {
        ArrayList arrayList = new ArrayList();
        int length = efVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            f1958 = (f1957 + 33) % 128;
            arrayList.add((Class) efVarArr[i10].m2165(eeVar, clVar).m2124());
            i10++;
            f1957 = (f1958 + 79) % 128;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2174(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1956.clone();
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r5.f1959 != null) goto L21;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.eo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L4b
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.el> r2 = com.ironsource.adqualitysdk.sdk.i.el.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L4b
        L10:
            boolean r2 = super.equals(r5)
            if (r2 != 0) goto L1f
            int r4 = com.ironsource.adqualitysdk.sdk.i.el.f1958
            int r4 = r4 + 27
            int r4 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.el.f1957 = r4
            return r1
        L1f:
            com.ironsource.adqualitysdk.sdk.i.el r5 = (com.ironsource.adqualitysdk.sdk.i.el) r5
            com.ironsource.adqualitysdk.sdk.i.ef r2 = r4.f1959
            if (r2 == 0) goto L36
            com.ironsource.adqualitysdk.sdk.i.ef r3 = r5.f1959
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3b
            int r4 = com.ironsource.adqualitysdk.sdk.i.el.f1958
            int r4 = r4 + 125
            int r4 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.el.f1957 = r4
            goto L3a
        L36:
            com.ironsource.adqualitysdk.sdk.i.ef r2 = r5.f1959
            if (r2 == 0) goto L3b
        L3a:
            return r1
        L3b:
            com.ironsource.adqualitysdk.sdk.i.ef[] r4 = r4.f1960
            if (r4 == 0) goto L46
            com.ironsource.adqualitysdk.sdk.i.ef[] r5 = r5.f1960
            boolean r4 = r4.equals(r5)
            return r4
        L46:
            com.ironsource.adqualitysdk.sdk.i.ef[] r4 = r5.f1960
            if (r4 != 0) goto L4b
            return r0
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.el.equals(java.lang.Object):boolean");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eo
    public final int hashCode() {
        int iHashCode;
        f1958 = (f1957 + 49) % 128;
        int iHashCode2 = super.hashCode() * 31;
        ef efVar = this.f1959;
        int iHashCode3 = 0;
        if (efVar != null) {
            iHashCode = efVar.hashCode();
        } else {
            f1958 = (f1957 + 55) % 128;
            iHashCode = 0;
        }
        int i10 = (iHashCode2 + iHashCode) * 31;
        ef[] efVarArr = this.f1960;
        if (efVarArr != null) {
            iHashCode3 = efVarArr.hashCode();
            f1957 = (f1958 + 77) % 128;
        }
        return i10 + iHashCode3;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eo
    public final String toString() {
        int i10 = f1958 + 85;
        f1957 = i10 % 128;
        if (i10 % 2 != 0) {
            mo2175(m2182());
            throw null;
        }
        String strMo2175 = mo2175(m2182());
        f1958 = (f1957 + 37) % 128;
        return strMo2175;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eo
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String mo2175(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1959);
        sb2.append(m2174(new int[]{-2114652358, -841008906}, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
        sb2.append(m2183());
        sb2.append(m2173());
        sb2.append(m2174(new int[]{1038826564, 2139431574}, 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
        sb2.append(ef.m2163(objArr));
        String strM = f2.m(sb2, m2174(new int[]{-1987944995, 138334629}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
        f1958 = (f1957 + 83) % 128;
        return strM;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eo, com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    public final ea mo2164(ee eeVar, cl clVar) {
        Method methodM2886;
        List<Object> listM2184 = m2184(eeVar, clVar);
        ef efVar = this.f1959;
        if ((efVar instanceof eq) && ((eq) efVar).m2189().equals(m2174(new int[]{-1242432761, 603408861, 1832228725, 1316359084}, (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 5).intern())) {
            return clVar.m1644().m2374().m2375(m2183()).m2113(eeVar, clVar, listM2184).m2123(false);
        }
        Object objM2124 = this.f1959.m2165(eeVar, clVar).m2124();
        if (objM2124 instanceof ch) {
            return new ea(((ch) objM2124).mo821(clVar, m2183(), listM2184, clVar.m1639(), eeVar));
        }
        if (objM2124 instanceof cl) {
            synchronized (objM2124) {
                try {
                    cl clVar2 = (cl) objM2124;
                    dz dzVarM1648 = clVar2.m1648(m2183());
                    if (dzVarM1648 != null) {
                        return dzVarM1648.m2113(clVar2.m1642(), clVar2, listM2184).m2123(false);
                    }
                    String strM1643 = clVar.m1643();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m2174(new int[]{-12182449, 1205763348, -1951390836, -858240726, 503269666, 496354820, -1444528134, -3603771, 1748413765, -1903585070, -460780335, -415940515}, Process.getGidForName("") + 24).intern());
                    sb2.append(m2183());
                    cn.m1708(strM1643, sb2.toString(), new NoSuchMethodException());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        try {
            ef[] efVarArr = this.f1960;
            if (efVarArr != null) {
                methodM2886 = kk.m2872(objM2124, m2183(), m2172(efVarArr, eeVar, clVar));
            } else {
                methodM2886 = kk.m2886(objM2124, m2183(), listM2184);
            }
            if (methodM2886 != null) {
                return new ea(methodM2886.invoke(objM2124, listM2184.toArray()));
            }
            listM2184.add(0, objM2124);
            return new ea(clVar.m1641().mo821(clVar, m2183(), listM2184, clVar.m1639(), eeVar));
        } catch (IllegalAccessException e10) {
            String strM1644 = clVar.m1643();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2174(new int[]{-12182449, 1205763348, -1951390836, -858240726, 503269666, 496354820, -1444528134, -3603771, 1748413765, -1903585070, -460780335, -415940515}, 24 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
            sb3.append(this);
            cn.m1708(strM1644, sb3.toString(), e10);
            return null;
        } catch (IllegalArgumentException e11) {
            String strM1645 = clVar.m1643();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m2174(new int[]{-12182449, 1205763348, -1951390836, -858240726, 503269666, 496354820, -1444528134, -3603771, 1748413765, -1903585070, -460780335, -415940515}, 23 - (ViewConfiguration.getTapTimeout() >> 16)).intern());
            sb4.append(this);
            cn.m1708(strM1645, sb4.toString(), e11);
            return null;
        } catch (Exception e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m2173() {
        int i10 = f1958 + 39;
        int i11 = i10 % 128;
        f1957 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (this.f1960 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2174(new int[]{-350173544, -1866468657}, 1 - Color.blue(0)).intern());
            sb2.append(ef.m2163(this.f1960));
            return f2.m(sb2, m2174(new int[]{259387330, 1012457131}, View.resolveSizeAndState(0, 0, 0) + 1));
        }
        f1958 = (i11 + 119) % 128;
        return "";
    }
}
