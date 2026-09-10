package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class cs extends cw {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1492 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1493 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1494 = 83;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f1495 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1496 = 1455264499;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f1497 = {-87, 18, -9, 78, -71, -7, 5, -11, 19, -4, -13, 15, 67, -82, 3, -3, 0, 45, -83, 12, -11, 17, 65, -72, -12, 11, -14, 87, -83, 14, -14, 0, 18, -11, 9, 67, -68, -10, 13, 65, 0, 0, 0};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1498 = -2015728714;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static char m1754(List<Object> list) {
        f1492 = (f1493 + 59) % 128;
        char cIntValue = (char) ((Number) cw.m1805(list, 0, Number.class)).intValue();
        int i10 = f1492 + 51;
        f1493 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 16 / 0;
        }
        return cIntValue;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m1756(List<Object> list) {
        f1493 = (f1492 + 99) % 128;
        if (kk.m2886(cw.m1805(list, 0, Object.class), (String) cw.m1805(list, 1, String.class), (List<Object>) cw.m1805(list, 2, List.class)) == null) {
            return false;
        }
        int i10 = f1493 + 23;
        f1492 = i10 % 128;
        return i10 % 2 != 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m1758(cl clVar, List<Object> list) {
        Class cls = (Class) cw.m1805(list, 0, Class.class);
        List arrayList = new ArrayList();
        if (list.size() > 1) {
            arrayList = (List) cw.m1805(list, 1, List.class);
            f1493 = (f1492 + 125) % 128;
        }
        List list2 = list.size() > 2 ? (List) cw.m1805(list, 2, List.class) : null;
        try {
            if (list2 == null) {
                Object objM2883 = kk.m2883(cls, (List<Object>) arrayList);
                f1493 = (f1492 + 117) % 128;
                return objM2883;
            }
            f1493 = (f1492 + 49) % 128;
            Class[] clsArr = new Class[list2.size()];
            list2.toArray(clsArr);
            return kk.m2884(cls, (List<Object>) arrayList, clsArr);
        } catch (Exception e10) {
            String strM1737 = clVar.m1651().m1737();
            StringBuilder sb2 = new StringBuilder();
            String string = "";
            sb2.append(m1755((short) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf("", "") - 1455264430, TextUtils.indexOf("", "", 0) - 64, ImageFormat.getBitsPerPixel(0) + 2015728715, (byte) (Process.myTid() >> 22)).intern());
            sb2.append(cls.getName());
            sb2.append(m1755((short) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf("", '0') - 1455264466, (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 72, TextUtils.lastIndexOf("", '0') + 2015728733, (byte) KeyEvent.keyCodeFromString("")).intern());
            sb2.append(arrayList);
            if (list2 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m1755((short) TextUtils.getTrimmedLength(""), TextUtils.indexOf((CharSequence) "", '0') - 1455264466, (-70) - KeyEvent.keyCodeFromString(""), 2015728742 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (AndroidCharacter.getMirror('0') - '0')).intern());
                sb3.append(list2);
                string = sb3.toString();
            }
            sb2.append(string);
            cn.m1708(strM1737, sb2.toString(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1755(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1494;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1497;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f1498 + i12] + i13);
                    } else {
                        i14 = (short) (f1495[f1498 + i12] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f1498 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f1496);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f1497;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f1495;
                            int i17 = n.f3072;
                            n.f3072 = i17 - 1;
                            n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                        }
                        sb2.append(n.f3074);
                        n.f3075 = n.f3074;
                        n.f3071++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Class m1757(List<Object> list) {
        Object objM1805;
        int i10 = f1493 + 11;
        f1492 = i10 % 128;
        if (i10 % 2 == 0) {
            objM1805 = cw.m1805(list, 1, Class.class);
        } else {
            objM1805 = cw.m1805(list, 0, Class.class);
        }
        return Array.newInstance((Class<?>) objM1805, 0).getClass();
    }
}
