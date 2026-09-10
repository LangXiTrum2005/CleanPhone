package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class cw {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1510 = 3161781294382484749L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1511 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1512 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1802(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2127) {
            try {
                char[] cArrM2229 = g.m2229(f1510, cArr, i10);
                g.f2129 = 4;
                while (true) {
                    int i11 = g.f2129;
                    if (i11 < cArrM2229.length) {
                        int i12 = i11 - 4;
                        g.f2128 = i12;
                        cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f1510));
                        g.f2129 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2229, 4, cArrM2229.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static <T> boolean m1804(List<Object> list, int i10, Class<T> cls) {
        Object obj = list.get(i10);
        if (obj == null) {
            return true;
        }
        int i11 = f1512 + 77;
        f1511 = i11 % 128;
        int i12 = i11 % 2;
        Class<?> cls2 = obj.getClass();
        if (i12 != 0) {
            cls.isAssignableFrom(cls2);
            throw null;
        }
        if (cls.isAssignableFrom(cls2)) {
            return true;
        }
        int i13 = f1511 + 25;
        f1512 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 25 / 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static <T> T m1805(List<Object> list, int i10, Class<T> cls) {
        int i11 = f1511 + 17;
        f1512 = i11 % 128;
        if (i11 % 2 == 0) {
            list.get(i10);
            throw null;
        }
        T t10 = (T) list.get(i10);
        if (t10 == null || cls.isAssignableFrom(t10.getClass())) {
            int i12 = f1512 + 93;
            f1511 = i12 % 128;
            if (i12 % 2 == 0) {
                return t10;
            }
            throw null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m1802("誻諸鶀땣წ꼗\udc34뻠筽岵\ufb0dꁅ\ue2b2梆㞕瓒", (Process.myTid() >> 22) + 1).intern());
        sb2.append(t10.getClass().getName());
        sb2.append(m1802("ꖠꖀꐒ\ue9e9⥫\uf39c斩슮", 1 - Color.blue(0)).intern());
        sb2.append(cls.getName());
        throw new ClassCastException(sb2.toString());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<Object> m1803(List<Object> list, int i10) {
        List<Object> arrayList = new ArrayList<>();
        if (list.size() > i10 && m1804(list, i10, List.class)) {
            int i11 = f1512 + 69;
            f1511 = i11 % 128;
            if (i11 % 2 != 0) {
                arrayList = (List) m1805(list, i10, List.class);
                int i12 = 98 / 0;
            } else {
                arrayList = (List) m1805(list, i10, List.class);
            }
        }
        int i13 = f1512 + 51;
        f1511 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 78 / 0;
        }
        return arrayList;
    }
}
