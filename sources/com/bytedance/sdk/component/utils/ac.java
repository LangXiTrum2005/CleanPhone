package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import com.ironsource.X3;

/* JADX INFO: loaded from: classes2.dex */
public class ac {
    private static String lr = "";
    private static boolean ri = false;

    public static void ik(String str, String str2) {
        if (ri && str2 != null) {
            lr(str);
        }
    }

    public static void lr() {
        ri = false;
    }

    public static void ri() {
        ri = true;
    }

    public static void lr(String str, String str2) {
        if (ri && str2 != null) {
            lr(str);
        }
    }

    public static void ri(String str, String str2) {
        if (ri && str2 != null) {
            lr(str);
        }
    }

    public static void ik(String str, Object... objArr) {
        if (ri && objArr != null) {
            lr(str);
            ri(objArr);
        }
    }

    public static void lr(String str, Object... objArr) {
        if (ri && objArr != null) {
            lr(str);
            ri(objArr);
        }
    }

    public static void ri(String str, Object... objArr) {
        if (ri && objArr != null) {
            lr(str);
            ri(objArr);
        }
    }

    private static String lr(String str) {
        if (TextUtils.isEmpty(lr)) {
            return str;
        }
        return ri(X3.j.d + lr + "]-[" + str + X3.j.e);
    }

    public static void ri(String str, String str2, Throwable th) {
        if (ri) {
            if (str2 == null && th == null) {
                return;
            }
            lr(str);
        }
    }

    public static void ri(String str) {
        lr = str;
    }

    private static String ri(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : objArr) {
                if (obj != null) {
                    sb.append(obj.toString());
                } else {
                    sb.append(" null ");
                }
                sb.append(" ");
            }
            return sb.toString();
        }
        return "";
    }
}
