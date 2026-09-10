package com.bytedance.adsdk.ugeno.ZU;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class lc {
    private static Map<String, lk> Lxb = new HashMap();

    public static void Lxb(List<lk> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (lk lkVar : list) {
            if (lkVar != null) {
                Lxb.put(lkVar.Lxb(), lkVar);
            }
        }
    }

    public static lk Lxb(String str) {
        return Lxb.get(str);
    }
}
