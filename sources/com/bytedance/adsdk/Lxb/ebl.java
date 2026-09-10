package com.bytedance.adsdk.Lxb;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class ebl {
    public static Object Lxb(com.bytedance.adsdk.Lxb.LD.Lxb.Lxb lxb) {
        JXs jXsLxb;
        if (lxb == null || (jXsLxb = Lxb(lxb.Lxb())) == null) {
            return null;
        }
        return jXsLxb.Lxb(null, lxb.LD());
    }

    public static JXs Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
            case "find":
                return new lk();
            case "exist":
                return new LD();
            case "translate":
                return new lc();
            case "isDigit":
                return new ZU();
            default:
                return null;
        }
    }
}
