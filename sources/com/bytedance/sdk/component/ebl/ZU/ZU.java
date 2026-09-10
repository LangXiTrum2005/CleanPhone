package com.bytedance.sdk.component.ebl.ZU;

import android.content.Context;
import com.bytedance.sdk.component.ebl.lk.OY;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    public static void Lxb(Context context, int i, String str, int i2) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i == 1) {
                linkedHashMap.put(Lxb(i2), str);
            }
            if (OY.Lxb().Lxb(i2).ZU() != null) {
                OY.Lxb().Lxb(i2).ZU().Lxb(context, linkedHashMap);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    public static String Lxb(Context context, int i, int i2) {
        String strLxb;
        if (i != 1) {
            strLxb = "";
        } else {
            try {
                if (OY.Lxb().Lxb(i2).ZU() != null) {
                    strLxb = OY.Lxb().Lxb(i2).ZU().Lxb(context, Lxb(i2), "");
                } else {
                    strLxb = "";
                }
            } catch (Exception unused) {
            }
        }
        if (!(strLxb instanceof String)) {
            return "";
        }
        return String.valueOf(strLxb);
    }

    private static String Lxb(int i) {
        return "tnc_config".concat(String.valueOf(i));
    }
}
