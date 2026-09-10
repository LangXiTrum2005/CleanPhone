package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class Sfi {
    private static boolean Lxb = false;

    public static void LD() {
        Lxb = false;
    }

    public static void Lxb() {
        Lxb = true;
    }

    private static String lk(String str, String str2) {
        return TextUtils.isEmpty("PangleSDK-6504") ? str : Lxb(DM.i(str2, "]-[", str));
    }

    public static void LD(String str, String str2, Object... objArr) {
        LD(lk(str, str2), objArr);
    }

    public static void Lxb(String str, String str2, Object... objArr) {
        Lxb(lk(str, str2), objArr);
    }

    public static void LD(String str, String str2) {
        if (Lxb && str2 != null) {
            Lxb(str);
        }
    }

    public static void Lxb(String str, String str2) {
        if (Lxb && str2 != null) {
            Lxb(str);
        }
    }

    public static void LD(String str, Object... objArr) {
        if (Lxb && objArr != null) {
            Lxb(str);
            Lxb(objArr);
        }
    }

    public static void Lxb(String str, Object... objArr) {
        if (Lxb && objArr != null) {
            Lxb(str);
            Lxb(objArr);
        }
    }

    private static String Lxb(String str) {
        return TextUtils.isEmpty("PangleSDK-6504") ? str : Lxb(DM.B("[PangleSDK-6504]-[", str, "]"));
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
