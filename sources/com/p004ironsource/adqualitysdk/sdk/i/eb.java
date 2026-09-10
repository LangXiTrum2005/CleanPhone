package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class eb extends ee {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1852 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1853 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f1854 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f1855 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1856 = {400, 403, 395, 375, 374, 368, 339, 332, 333};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1857 = 292;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1858;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ee[] f1859;

    public eb(String str, List<ee> list, dm dmVar) {
        super(dmVar);
        this.f1858 = dw.m2051(str);
        ee[] eeVarArr = new ee[list.size()];
        this.f1859 = eeVarArr;
        list.toArray(eeVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (getClass() != r5.getClass()) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (getClass() != r5.getClass()) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r5 = (com.p004ironsource.adqualitysdk.sdk.i.eb) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r4.f1858.equals(r5.f1858) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r5 = java.util.Arrays.equals(r4.f1859, r5.f1859);
        r0 = com.p004ironsource.adqualitysdk.sdk.i.eb.f1853 + 87;
        com.p004ironsource.adqualitysdk.sdk.i.eb.f1852 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if ((r0 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            if (r4 != r5) goto L4
            r5 = 1
            return r5
        L4:
            r0 = 0
            if (r5 == 0) goto L4f
            int r1 = com.p004ironsource.adqualitysdk.sdk.i.eb.f1853
            int r1 = r1 + 115
            int r2 = r1 % 128
            com.p004ironsource.adqualitysdk.sdk.i.eb.f1852 = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L20
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r2 = r5.getClass()
            r3 = 6
            int r3 = r3 / r0
            if (r1 == r2) goto L2b
            goto L4f
        L20:
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r2 = r5.getClass()
            if (r1 == r2) goto L2b
            goto L4f
        L2b:
            com.ironsource.adqualitysdk.sdk.i.eb r5 = (com.p004ironsource.adqualitysdk.sdk.i.eb) r5
            java.lang.String r1 = r4.f1858
            java.lang.String r2 = r5.f1858
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L38
            return r0
        L38:
            com.ironsource.adqualitysdk.sdk.i.ee[] r0 = r4.f1859
            com.ironsource.adqualitysdk.sdk.i.ee[] r5 = r5.f1859
            boolean r5 = java.util.Arrays.equals(r0, r5)
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.eb.f1853
            int r0 = r0 + 87
            int r1 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.eb.f1852 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L4d
            return r5
        L4d:
            r5 = 0
            throw r5
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.eb.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i2 = f1852;
        f1853 = (i2 + 85) % 128;
        String str = this.f1858;
        if (str != null) {
            f1853 = (i2 + 27) % 128;
            iHashCode = str.hashCode();
        } else {
            iHashCode = 0;
        }
        int iHashCode2 = Arrays.hashCode(this.f1859) + (iHashCode * 31);
        int i3 = f1853 + 111;
        f1852 = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public String toString() {
        int i2 = f1853 + 101;
        f1852 = i2 % 128;
        if (i2 % 2 == 0) {
            mo2078(this.f1859);
            throw null;
        }
        String strMo2078 = mo2078(this.f1859);
        int i3 = f1853 + 19;
        f1852 = i3 % 128;
        if (i3 % 2 != 0) {
            return strMo2078;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ee[] m2076() {
        int i2 = (f1853 + 35) % 128;
        f1852 = i2;
        ee[] eeVarArr = this.f1859;
        f1853 = (i2 + 103) % 128;
        return eeVarArr;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m2077() {
        int i2 = f1853;
        int i3 = i2 + 15;
        f1852 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.f1858;
        f1852 = (i2 + 65) % 128;
        return str;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ee
    /* JADX INFO: renamed from: ｋ */
    public du mo2050(dr drVar, cp cpVar) {
        f1853 = (f1852 + 61) % 128;
        List<Object> listM2075 = m2075(drVar, cpVar);
        if (!m2077().equals(m2074(null, null, ExpandableListView.getPackedPositionGroup(0L) + 127, "\u0083\u0082\u0081").intern())) {
            try {
                return new du(((dt) drVar.m1984(m2077())).m2037(drVar, cpVar, listM2075));
            } catch (Exception unused) {
                if (cpVar.m1626().m2253(m2077()) != null) {
                    return cpVar.m1626().m2253(m2077()).m2037(drVar, cpVar, listM2075).m2045(false);
                }
                de deVarM1613 = cpVar.m1613();
                String strM2077 = m2077();
                cpVar.m1615();
                du duVar = new du(deVarM1613.mo1524(cpVar, strM2077, listM2075, drVar));
                int i2 = f1853 + 5;
                f1852 = i2 % 128;
                if (i2 % 2 != 0) {
                    return duVar;
                }
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m2074(null, null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u0087\u0086\u0085\u0084").intern());
        sb.append(cpVar.m1616());
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(listM2075.get(0));
        n.m2835(string, sb2.toString());
        du duVar2 = new du(null);
        int i3 = f1853 + 5;
        f1852 = i3 % 128;
        if (i3 % 2 != 0) {
            return duVar2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<Object> m2075(dr drVar, cp cpVar) {
        ArrayList arrayList = new ArrayList();
        for (ee eeVar : this.f1859) {
            f1853 = (f1852 + 79) % 128;
            arrayList.add(eeVar.m2086(drVar, cpVar).m2043());
        }
        int i2 = f1853 + 1;
        f1852 = i2 % 128;
        if (i2 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2074(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f2877) {
            try {
                char[] cArr2 = f1856;
                int i3 = f1857;
                if (f1854) {
                    int length = bArr.length;
                    o.f2878 = length;
                    char[] cArr3 = new char[length];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i4 = o.f2879;
                        int i5 = o.f2878 - 1;
                        int i6 = o.f2879;
                        cArr3[i4] = (char) (cArr2[bArr[i5 - i6] + i2] - i3);
                        o.f2879 = i6 + 1;
                    }
                    return new String(cArr3);
                }
                if (f1855) {
                    int length2 = cArr.length;
                    o.f2878 = length2;
                    char[] cArr4 = new char[length2];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i7 = o.f2879;
                        int i8 = o.f2878 - 1;
                        int i9 = o.f2879;
                        cArr4[i7] = (char) (cArr2[cArr[i8 - i9] - i2] - i3);
                        o.f2879 = i9 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                o.f2878 = length3;
                char[] cArr5 = new char[length3];
                o.f2879 = 0;
                while (o.f2879 < o.f2878) {
                    int i10 = o.f2879;
                    int i11 = o.f2878 - 1;
                    int i12 = o.f2879;
                    cArr5[i10] = (char) (cArr2[iArr[i11 - i12] - i2] - i3);
                    o.f2879 = i12 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public String mo2078(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1858);
        sb.append(m2074(null, null, TextUtils.getOffsetBefore("", 0) + 127, "\u0088").intern());
        sb.append(ee.m2084(objArr));
        String strC = a.C(sb, m2074(null, null, View.MeasureSpec.getSize(0) + 127, "\u0089"));
        int i2 = f1853 + 39;
        f1852 = i2 % 128;
        if (i2 % 2 != 0) {
            return strC;
        }
        throw null;
    }
}
