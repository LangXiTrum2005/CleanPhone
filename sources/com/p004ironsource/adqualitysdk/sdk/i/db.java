package com.p004ironsource.adqualitysdk.sdk.i;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class db extends cz {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1591 = {AbstractJsonLexerKt.STRING, AbstractJsonLexerKt.BEGIN_LIST, 'r', 'p', 'p', 'I', 'A', 'j', 'k', 'c', 'j', 'n', 'k', 'j', 'C', 'F', 'i', 'l', 'n', 'k', 'i', 'B', 'I', 's', 'q', 'n', 'g', 'a', 'g', 'h'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1592 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1593 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Object m1796(cp cpVar, List<Object> list, dr drVar) {
        int i2 = f1592 + 13;
        f1593 = i2 % 128;
        if (i2 % 2 != 0) {
            s.m2920(m1799(cpVar, list, drVar), m1795(list));
            return null;
        }
        s.m2920(m1799(cpVar, list, drVar), m1795(list));
        int i3 = 53 / 0;
        return null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Object m1797(cp cpVar, List<Object> list, dr drVar) {
        f1593 = (f1592 + 17) % 128;
        s.m2926(m1799(cpVar, list, drVar));
        int i2 = f1592 + 11;
        f1593 = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m1798(cp cpVar, List<Object> list, dr drVar) {
        int i2 = f1593 + 5;
        f1592 = i2 % 128;
        if (i2 % 2 != 0) {
            s.m2922(m1799(cpVar, list, drVar));
            int i3 = 58 / 0;
        } else {
            s.m2922(m1799(cpVar, list, drVar));
        }
        int i4 = f1593 + 59;
        f1592 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final it m1799(final cp cpVar, List<Object> list, final dr drVar) {
        final List<Object> listM1786;
        try {
            if (cz.m1784(list, 0, it.class)) {
                it itVar = (it) cz.m1785(list, 0, it.class);
                f1593 = (f1592 + 59) % 128;
                return itVar;
            }
            final dt dtVar = (dt) cz.m1785(list, 0, dt.class);
            if (list.size() > 2) {
                f1593 = (f1592 + 9) % 128;
                listM1786 = cz.m1786(list, 2);
            } else {
                listM1786 = cz.m1786(list, 1);
            }
            return new it() { // from class: com.ironsource.adqualitysdk.sdk.i.db.2
                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    listM1786.add(0, this);
                    dtVar.m2037(drVar, cpVar, listM1786);
                    listM1786.remove(0);
                }
            };
        } catch (Exception e2) {
            cq.m1676(cpVar.m1616(), m1794(false, new int[]{0, 30, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001").intern(), e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m1800(cp cpVar, List<Object> list, dr drVar) {
        int i2 = f1593 + 59;
        f1592 = i2 % 128;
        if (i2 % 2 != 0) {
            s.m2917(m1799(cpVar, list, drVar));
            throw null;
        }
        s.m2917(m1799(cpVar, list, drVar));
        f1592 = (f1593 + 77) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m1801(cp cpVar, List<Object> list, dr drVar) {
        f1593 = (f1592 + 81) % 128;
        s.m2918(m1799(cpVar, list, drVar), m1795(list));
        f1592 = (f1593 + 67) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m1802(cp cpVar, List<Object> list, dr drVar) {
        int i2 = f1592 + 93;
        f1593 = i2 % 128;
        if (i2 % 2 == 0) {
            s.m2924(m1799(cpVar, list, drVar));
            throw null;
        }
        s.m2924(m1799(cpVar, list, drVar));
        int i3 = f1592 + 31;
        f1593 = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long m1795(List<Object> list) {
        long j;
        int iIntValue;
        if (list.size() > 1 && cz.m1784(list, 1, Integer.class)) {
            iIntValue = ((Integer) cz.m1785(list, 1, Integer.class)).intValue();
        } else {
            if (list.size() > 2) {
                f1592 = (f1593 + 43) % 128;
                iIntValue = ((Integer) cz.m1785(list, 2, Integer.class)).intValue();
            } else {
                j = 0;
            }
            f1593 = (f1592 + 95) % 128;
            return j;
        }
        j = iIntValue;
        f1593 = (f1592 + 95) % 128;
        return j;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1794(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f1591, i2, cArr, 0, i3);
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
}
