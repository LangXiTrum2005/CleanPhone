package com.p004ironsource.adqualitysdk.sdk.i;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class cz {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1581 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1582;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1583 = {16, '1', 'R', 'g', 'n', 'n', 'q', 'J', 'A', 'b', 'j', 's', 227, 232, 148, 148};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static <T> boolean m1784(List<Object> list, int i2, Class<T> cls) {
        f1581 = (f1582 + 31) % 128;
        Object obj = list.get(i2);
        if (obj == null) {
            return true;
        }
        int i3 = f1582 + 109;
        f1581 = i3 % 128;
        int i4 = i3 % 2;
        Class<?> cls2 = obj.getClass();
        if (i4 != 0) {
            return cls.isAssignableFrom(cls2);
        }
        cls.isAssignableFrom(cls2);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static <T> T m1785(List<Object> list, int i2, Class<T> cls) {
        f1581 = (f1582 + 39) % 128;
        T t = (T) list.get(i2);
        if (t != null) {
            f1582 = (f1581 + 37) % 128;
            if (!cls.isAssignableFrom(t.getClass())) {
                StringBuilder sb = new StringBuilder();
                sb.append(m1783(false, new int[]{0, 12, 0, 1}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001").intern());
                sb.append(t.getClass().getName());
                sb.append(m1783(true, new int[]{12, 4, 116, 3}, (String) null).intern());
                sb.append(cls.getName());
                throw new ClassCastException(sb.toString());
            }
        }
        int i3 = f1582 + 59;
        f1581 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 24 / 0;
        }
        return t;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1783(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f1583, i2, cArr, 0, i3);
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (m1784(r4, r5, java.util.List.class) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r0 = com.p004ironsource.adqualitysdk.sdk.i.cz.f1581 + 81;
        com.p004ironsource.adqualitysdk.sdk.i.cz.f1582 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if ((r0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r4 = (java.util.List) m1785(r4, r5, java.util.List.class);
        r5 = 67 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        return (java.util.List) m1785(r4, r5, java.util.List.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (m1784(r4, r5, java.util.List.class) != false) goto L11;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.Object> m1786(java.util.List<java.lang.Object> r4, int r5) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.size()
            if (r1 <= r5) goto L48
            int r1 = com.p004ironsource.adqualitysdk.sdk.i.cz.f1582
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.p004ironsource.adqualitysdk.sdk.i.cz.f1581 = r2
            int r1 = r1 % 2
            java.lang.Class<java.util.List> r2 = java.util.List.class
            if (r1 != 0) goto L24
            boolean r1 = m1784(r4, r5, r2)
            r3 = 39
            int r3 = r3 / 0
            if (r1 == 0) goto L48
            goto L2a
        L24:
            boolean r1 = m1784(r4, r5, r2)
            if (r1 == 0) goto L48
        L2a:
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.cz.f1581
            int r0 = r0 + 81
            int r1 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.cz.f1582 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L41
            java.lang.Object r4 = m1785(r4, r5, r2)
            java.util.List r4 = (java.util.List) r4
            r5 = 67
            int r5 = r5 / 0
            goto L47
        L41:
            java.lang.Object r4 = m1785(r4, r5, r2)
            java.util.List r4 = (java.util.List) r4
        L47:
            return r4
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.cz.m1786(java.util.List, int):java.util.List");
    }
}
