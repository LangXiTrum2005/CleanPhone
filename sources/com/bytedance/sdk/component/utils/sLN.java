package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class sLN {
    private static int LD = 4;
    private static boolean Lxb = false;
    private static String ZU = "";
    private static com.bytedance.sdk.component.Lxb lk;

    public static void LD() {
        Lxb = true;
        Lxb(3);
    }

    public static void Lxb(String str) {
        ZU = str;
    }

    public static boolean ZU() {
        return Lxb;
    }

    public static void lk() {
        Lxb = false;
        Lxb(7);
    }

    public static void Lxb(int i) {
        LD = i;
    }

    public static void LD(String str) {
        if (Lxb) {
            Lxb("Logger", str);
        }
    }

    public static boolean Lxb() {
        return LD <= 3;
    }

    public static String lk(String str) {
        return TextUtils.isEmpty(ZU) ? str : Lxb(DM.n(new StringBuilder("["), ZU, "]-[", str, "]"));
    }

    public static void Lxb(String str, String str2) {
        if (lk != null) {
            lk(str);
        }
        if (Lxb && str2 != null && LD <= 6) {
            lk(str);
        }
    }

    public static String LD(String str, String str2) {
        return TextUtils.isEmpty(ZU) ? str : Lxb(DM.i(str2, "]-[", str));
    }

    public static void Lxb(String str, String str2, String str3, Throwable th) {
        if (Lxb) {
            Lxb(LD(str, str2), str3, th);
        }
    }

    public static void Lxb(String str, String str2, Throwable th) {
        if (lk != null) {
            lk(str);
        }
        if (Lxb) {
            if (!(str2 == null && th == null) && LD <= 6) {
                lk(str);
            }
        }
    }

    public static void Lxb(String str, Object... objArr) {
        if (lk != null) {
            lk(str);
            Lxb(objArr);
        }
        if (Lxb && objArr != null && LD <= 6) {
            lk(str);
            Lxb(objArr);
        }
    }

    private static String Lxb(Object... objArr) {
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
