package com.bytedance.sdk.openadsdk.OY;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.xan;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ZU extends Lxb {
    public static lk Lxb;

    public static String Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, String str) {
        lk lkVarLxb;
        Map map;
        if (!xan.lk() || (lkVarLxb = LD.Lxb("net")) == null || (map = (Map) lkVarLxb.Lxb(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                lkVar.LD(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
