package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.InterfaceC0435l1;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ct extends cw {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1499 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1500 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1501 = {'6', 'F', 'C', 'j', 'k', 'k', 'n', 'q', 's', 'I', 'I', 'p', 'p', 'r', '[', '\\', 's', 'n', 'j', 'F', 'G', 'n', 'G', 'D', 'e', 'b', 'S', '[', 'p', 'j', 'J', 'O', 'h', 'x', 263, 286, 284, 284, 245, 245, 287, 285, 282, 279, 279, 278, 239, 239, 275, 278, 284, 280, 279, 245, 243, 282, 243, 242, 278, 282, 287};

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m1760(cl clVar, List<Object> list) {
        cl clVar2;
        List list2 = (List) cw.m1805(list, 0, List.class);
        try {
            dz dzVar = (dz) cw.m1805(list, 1, dz.class);
            List<Object> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                int i10 = f1499 + 31;
                f1500 = i10 % 128;
                if (i10 % 2 == 0) {
                    if (cw.m1804(list, 3, cl.class)) {
                        clVar2 = (cl) cw.m1805(list, 2, cl.class);
                        if (list.size() > 3) {
                            int i11 = f1500 + 71;
                            f1499 = i11 % 128;
                            int i12 = i11 % 2;
                            arrayList = cw.m1803(list, 3);
                        }
                    }
                    arrayList = cw.m1803(list, 2);
                    clVar2 = clVar;
                } else if (cw.m1804(list, 2, cl.class)) {
                    clVar2 = (cl) cw.m1805(list, 2, cl.class);
                    if (list.size() > 3) {
                        int i13 = f1500 + 71;
                        f1499 = i13 % 128;
                        int i14 = i13 % 2;
                        arrayList = cw.m1803(list, 3);
                    }
                } else {
                    arrayList = cw.m1803(list, 2);
                    clVar2 = clVar;
                }
            } else {
                clVar2 = clVar;
            }
            ArrayList arrayList2 = new ArrayList();
            int i15 = 0;
            while (i15 < list2.size()) {
                arrayList.add(0, list2.get(i15));
                arrayList2.add(dzVar.m2113(clVar2.m1642(), clVar2, arrayList).m2124());
                arrayList.remove(0);
                i15++;
                f1500 = (f1499 + 35) % 128;
            }
            return arrayList2;
        } catch (Exception e10) {
            cn.m1708(clVar.m1643(), m1759("\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{0, 33, 0, 15}, true).intern(), e10);
            return list2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m1761(cl clVar, List<Object> list) {
        int i10 = f1499 + InterfaceC0435l1.d.b.f29105b;
        f1500 = i10 % 128;
        if (i10 % 2 != 0) {
            m1760(clVar, list);
            return null;
        }
        m1760(clVar, list);
        int i11 = 97 / 0;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m1762(cl clVar, List<Object> list) {
        cl clVar2;
        List list2 = (List) cw.m1805(list, 0, List.class);
        try {
            dz dzVar = (dz) cw.m1805(list, 1, dz.class);
            List<Object> arrayList = new ArrayList<>();
            if (list.size() <= 2) {
                clVar2 = clVar;
            } else if (cw.m1804(list, 2, cl.class)) {
                clVar2 = (cl) cw.m1805(list, 2, cl.class);
                if (list.size() > 3) {
                    int i10 = f1499 + 9;
                    f1500 = i10 % 128;
                    int i11 = i10 % 2;
                    arrayList = cw.m1803(list, 3);
                }
            } else {
                arrayList = cw.m1803(list, 2);
                clVar2 = clVar;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < list2.size(); i12++) {
                arrayList.add(0, list2.get(i12));
                if (dzVar.m2113(clVar2.m1642(), clVar2, arrayList).m2125()) {
                    int i13 = f1499 + 119;
                    f1500 = i13 % 128;
                    if (i13 % 2 == 0) {
                        arrayList2.add(list2.get(i12));
                        throw null;
                    }
                    arrayList2.add(list2.get(i12));
                }
                arrayList.remove(0);
            }
            return arrayList2;
        } catch (Exception e10) {
            cn.m1708(clVar.m1643(), m1759("\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{33, 28, 172, 0}, false).intern(), e10);
            return list2;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1759(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2261) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f1501, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    h.f2262 = 0;
                    char c4 = 0;
                    while (true) {
                        int i14 = h.f2262;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                        }
                        c4 = cArr2[i14];
                        h.f2262 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    h.f2262 = 0;
                    while (true) {
                        int i16 = h.f2262;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        h.f2262 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    h.f2262 = 0;
                    while (true) {
                        int i17 = h.f2262;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        h.f2262 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
