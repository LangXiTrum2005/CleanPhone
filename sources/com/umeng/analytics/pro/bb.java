package com.umeng.analytics.pro;

import com.unity3d.services.ads.gmascar.utils.ScarConstants;

/* JADX INFO: loaded from: classes3.dex */
public class bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f2507a = "OpenId";
    private static boolean b = false;

    public static void a(boolean z) {
        b = z;
    }

    public static void b(String str, Object... objArr) {
        if (b) {
            e(str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        if (b) {
            e(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        if (b) {
            e(str, objArr);
        }
    }

    private static String e(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "-";
        }
        sb.append("[" + str + "] ");
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(a(objArr[i], objArr[i2]));
                if (i2 < length - 1) {
                    sb.append(",");
                }
                i += 2;
            }
            if (i == objArr.length - 1) {
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    public static void a(String str, Object... objArr) {
        if (b) {
            e(str, objArr);
        }
    }

    private static String a(Object obj, Object obj2) {
        Object[] objArr = new Object[2];
        if (obj == null) {
            obj = "";
        }
        objArr[0] = obj;
        if (obj2 == null) {
            obj2 = "";
        }
        objArr[1] = obj2;
        return String.format(ScarConstants.TOKEN_WITH_SCAR_FORMAT, objArr);
    }
}
