package com.p004ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes5.dex */
public final class ea extends ee {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1846 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1849;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ee f1850;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1851;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1848 = {'.'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1847 = -4155701035263706019L;

    public ea(ee eeVar, String str, dm dmVar) {
        super(dmVar);
        this.f1850 = eeVar;
        this.f1851 = str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2073(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f1848[i3 + i4]) ^ (((long) i4) * f1847)) ^ ((long) c2));
                        a.f69 = i4 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r2.equals(r5.f1850) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r5.f1850 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        r2 = r4.f1851;
        r5 = r5.f1851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        return r2.equals(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (r5 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        com.p004ironsource.adqualitysdk.sdk.i.ea.f1849 = (com.p004ironsource.adqualitysdk.sdk.i.ea.f1846 + 19) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r4 != r5) goto L12
            int r5 = com.p004ironsource.adqualitysdk.sdk.i.ea.f1846
            int r5 = r5 + 27
            int r2 = r5 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ea.f1849 = r2
            int r5 = r5 % 2
            if (r5 == 0) goto L11
            return r1
        L11:
            return r0
        L12:
            if (r5 == 0) goto L5e
            int r2 = com.p004ironsource.adqualitysdk.sdk.i.ea.f1849
            int r2 = r2 + 5
            int r3 = r2 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ea.f1846 = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L5c
            java.lang.Class r2 = r5.getClass()
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ea> r3 = com.p004ironsource.adqualitysdk.sdk.i.ea.class
            if (r3 == r2) goto L29
            goto L5e
        L29:
            com.ironsource.adqualitysdk.sdk.i.ea r5 = (com.p004ironsource.adqualitysdk.sdk.i.ea) r5
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r4.f1850
            if (r2 == 0) goto L40
            int r3 = com.p004ironsource.adqualitysdk.sdk.i.ea.f1846
            int r3 = r3 + 35
            int r3 = r3 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ea.f1849 = r3
            com.ironsource.adqualitysdk.sdk.i.ee r3 = r5.f1850
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L45
            goto L44
        L40:
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r5.f1850
            if (r2 == 0) goto L45
        L44:
            return r1
        L45:
            java.lang.String r2 = r4.f1851
            java.lang.String r5 = r5.f1851
            if (r2 == 0) goto L50
            boolean r5 = r2.equals(r5)
            return r5
        L50:
            if (r5 != 0) goto L5b
            int r5 = com.p004ironsource.adqualitysdk.sdk.i.ea.f1846
            int r5 = r5 + 19
            int r5 = r5 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ea.f1849 = r5
            return r0
        L5b:
            return r1
        L5c:
            r5 = 0
            throw r5
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.ea.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        ee eeVar = this.f1850;
        int iHashCode2 = 0;
        if (eeVar != null) {
            f1849 = (f1846 + 51) % 128;
            iHashCode = eeVar.hashCode();
        } else {
            iHashCode = 0;
        }
        int i2 = iHashCode * 31;
        String str = this.f1851;
        if (str != null) {
            int i3 = f1849 + 119;
            f1846 = i3 % 128;
            if (i3 % 2 == 0) {
                str.hashCode();
                throw null;
            }
            iHashCode2 = str.hashCode();
        } else {
            f1849 = (f1846 + 125) % 128;
        }
        return i2 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1850.toString());
        sb.append(m2073((ViewConfiguration.getScrollBarSize() >> 8) + 1, View.MeasureSpec.makeMeasureSpec(0, 0), (char) KeyEvent.normalizeMetaState(0)).intern());
        sb.append(this.f1851);
        String string = sb.toString();
        int i2 = f1849 + 105;
        f1846 = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ee
    /* JADX INFO: renamed from: ｋ */
    public final du mo2050(dr drVar, cp cpVar) {
        int i2 = f1846 + 39;
        f1849 = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z2 = this.f1850.m2086(drVar, cpVar).m2043() instanceof cp;
            throw null;
        }
        Object objM2043 = this.f1850.m2086(drVar, cpVar).m2043();
        if (objM2043 instanceof cp) {
            return new du(((cp) objM2043).m1623(this.f1851));
        }
        try {
            du duVar = new du(objM2043.getClass().getDeclaredField(this.f1851).get(objM2043));
            int i3 = f1846 + 67;
            f1849 = i3 % 128;
            if (i3 % 2 == 0) {
                return duVar;
            }
            throw null;
        } catch (Exception unused) {
            return new du(null);
        }
    }
}
