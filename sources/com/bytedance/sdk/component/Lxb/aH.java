package com.bytedance.sdk.component.Lxb;

import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
class aH {
    private static boolean Lxb;

    public static String Lxb(Throwable th) {
        return AbstractC5044xl.o(new StringBuilder("{\"code\":"), th instanceof brP ? ((brP) th).Lxb : 0, "}");
    }

    public static String Lxb(String str) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        if (Lxb) {
            strSubstring = str.substring(1, str.length() - 1);
        } else {
            strSubstring = "";
        }
        String strConcat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (!strSubstring.isEmpty()) {
            return AbstractC3888ke0.j(strConcat, ",", strSubstring, "}");
        }
        return DM.h(strConcat, "}");
    }

    public static String Lxb() {
        return "";
    }

    public static void Lxb(boolean z) {
        Lxb = z;
    }
}
