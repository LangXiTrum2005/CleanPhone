package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class da extends cz {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1588 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1589 = -5546091287408753775L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1590;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Object m1789(cp cpVar, List<Object> list) {
        List list2;
        Class cls = (Class) cz.m1785(list, 0, Class.class);
        List arrayList = new ArrayList();
        if (list.size() > 1) {
            f1590 = (f1588 + 75) % 128;
            arrayList = (List) cz.m1785(list, 1, List.class);
        }
        if (list.size() > 2) {
            f1590 = (f1588 + 19) % 128;
            list2 = (List) cz.m1785(list, 2, List.class);
        } else {
            list2 = null;
        }
        try {
            if (list2 == null) {
                Object objM2721 = jz.m2721(cls, arrayList);
                int i2 = f1588 + 53;
                f1590 = i2 % 128;
                if (i2 % 2 == 0) {
                    return objM2721;
                }
                throw null;
            }
            int i3 = f1588 + 89;
            f1590 = i3 % 128;
            if (i3 % 2 == 0) {
                Class[] clsArr = new Class[list2.size()];
                list2.toArray(clsArr);
                return jz.m2729(cls, arrayList, clsArr);
            }
            Class[] clsArr2 = new Class[list2.size()];
            list2.toArray(clsArr2);
            jz.m2729(cls, arrayList, clsArr2);
            throw null;
        } catch (Exception e2) {
            String strM1557 = cpVar.m1618().m1557();
            StringBuilder sb = new StringBuilder();
            sb.append(m1792("臤膡撒쐢ꝱㅭ迒䍲箱的홷⌴鴉䜉\ue0ac᳣ꭆ䥋\uf2bcຠ뢑宧荠", 1 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
            sb.append(cls.getName());
            String string = "";
            sb.append(m1792("魾魞歬䖉ꢊ끉镒싂搜祿埅ꈋ螑䣠慈", -TextUtils.lastIndexOf("", '0')).intern());
            sb.append(arrayList);
            if (list2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m1792("쒞쒾䅋\ue592芻ኲ쫺拞塥匍\uf7d4ó\ud865拑섑㼭\uee72", KeyEvent.normalizeMetaState(0) + 1).intern());
                sb2.append(list2);
                string = sb2.toString();
            }
            sb.append(string);
            cq.m1676(strM1557, sb.toString(), e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m1790(List<Object> list) {
        int i2 = f1588 + 65;
        f1590 = i2 % 128;
        if (i2 % 2 == 0 ? jz.m2726(cz.m1785(list, 0, Object.class), (String) cz.m1785(list, 1, String.class), (List) cz.m1785(list, 2, List.class)) != null : jz.m2726(cz.m1785(list, 1, Object.class), (String) cz.m1785(list, 0, String.class), (List) cz.m1785(list, 5, List.class)) != null) {
            return true;
        }
        int i3 = f1588 + 83;
        f1590 = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Class m1791(List<Object> list) {
        f1590 = (f1588 + 101) % 128;
        Class<?> cls = Array.newInstance((Class<?>) cz.m1785(list, 0, Class.class), 0).getClass();
        int i2 = f1588 + 7;
        f1590 = i2 % 128;
        if (i2 % 2 == 0) {
            return cls;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static char m1793(List<Object> list) {
        int i2 = f1588 + 31;
        f1590 = i2 % 128;
        int i3 = i2 % 2;
        char cIntValue = (char) ((Number) cz.m1785(list, 0, Number.class)).intValue();
        f1590 = (f1588 + 39) % 128;
        return cIntValue;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1792(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f1589, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f1589));
                        f.f1954 = i3 + 1;
                    } else {
                        str2 = new String(cArrM2116, 4, cArrM2116.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
