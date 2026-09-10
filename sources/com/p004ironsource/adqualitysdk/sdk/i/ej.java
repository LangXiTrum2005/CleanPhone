package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.firebase.crashlytics.internal.model.a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ej extends ee {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1900 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1901;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1902 = {44050, 35978};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1903 = 2205675406622319337L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ee f1904;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ee f1905;

    public ej(ee eeVar, ee eeVar2, dm dmVar) {
        super(dmVar);
        this.f1904 = eeVar;
        this.f1905 = eeVar2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2096(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f1902[i3 + i4]) ^ (((long) i4) * f1903)) ^ ((long) c2));
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
    
        if (r1.equals(r7.f1904) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r7.f1904 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        r1 = r6.f1905;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        r0 = com.p004ironsource.adqualitysdk.sdk.i.ej.f1901 + 15;
        com.p004ironsource.adqualitysdk.sdk.i.ej.f1900 = r0 % 128;
        r0 = r0 % 2;
        r7 = r7.f1905;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r0 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        return r1.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        r1.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r7.f1905 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        r7 = com.p004ironsource.adqualitysdk.sdk.i.ej.f1900 + 99;
        com.p004ironsource.adqualitysdk.sdk.i.ej.f1901 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if ((r7 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.ej.f1901
            int r0 = r0 + 55
            int r1 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ej.f1900 = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L7a
            r0 = 1
            if (r6 != r7) goto L11
            return r0
        L11:
            r3 = 0
            if (r7 == 0) goto L79
            int r1 = r1 + 53
            int r1 = r1 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ej.f1901 = r1
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r4 = r7.getClass()
            if (r1 == r4) goto L25
            goto L79
        L25:
            com.ironsource.adqualitysdk.sdk.i.ej r7 = (com.p004ironsource.adqualitysdk.sdk.i.ej) r7
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r6.f1904
            if (r1 == 0) goto L46
            int r4 = com.p004ironsource.adqualitysdk.sdk.i.ej.f1900
            int r4 = r4 + 7
            int r5 = r4 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ej.f1901 = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L40
            com.ironsource.adqualitysdk.sdk.i.ee r4 = r7.f1904
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L4b
            goto L4a
        L40:
            com.ironsource.adqualitysdk.sdk.i.ee r7 = r7.f1904
            r1.equals(r7)
            throw r2
        L46:
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r7.f1904
            if (r1 == 0) goto L4b
        L4a:
            return r3
        L4b:
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r6.f1905
            if (r1 == 0) goto L66
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.ej.f1901
            int r0 = r0 + 15
            int r3 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ej.f1900 = r3
            int r0 = r0 % 2
            com.ironsource.adqualitysdk.sdk.i.ee r7 = r7.f1905
            if (r0 == 0) goto L62
            boolean r7 = r1.equals(r7)
            return r7
        L62:
            r1.equals(r7)
            throw r2
        L66:
            com.ironsource.adqualitysdk.sdk.i.ee r7 = r7.f1905
            if (r7 != 0) goto L6b
            return r0
        L6b:
            int r7 = com.p004ironsource.adqualitysdk.sdk.i.ej.f1900
            int r7 = r7 + 99
            int r0 = r7 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ej.f1901 = r0
            int r7 = r7 % 2
            if (r7 != 0) goto L78
            return r3
        L78:
            throw r2
        L79:
            return r3
        L7a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.ej.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        f1900 = (f1901 + 53) % 128;
        ee eeVar = this.f1904;
        int iHashCode = 0;
        int iHashCode2 = (eeVar != null ? eeVar.hashCode() : 0) * 31;
        ee eeVar2 = this.f1905;
        if (eeVar2 != null) {
            iHashCode = eeVar2.hashCode();
        } else {
            f1901 = (f1900 + 67) % 128;
        }
        return iHashCode2 + iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m2098().toString());
        sb.append(m2096(Color.alpha(0) + 1, 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (44105 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern());
        sb.append(m2097().toString());
        String strC = a.C(sb, m2096(1 - TextUtils.indexOf("", "", 0, 0), TextUtils.getCapsMode("", 0, 0) + 1, (char) (Color.red(0) + 36055)));
        int i2 = f1900 + 3;
        f1901 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
        return strC;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ee m2097() {
        int i2 = f1900 + 63;
        f1901 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1905;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ee m2098() {
        int i2 = f1901 + 51;
        f1900 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1904;
        }
        throw null;
    }
}
