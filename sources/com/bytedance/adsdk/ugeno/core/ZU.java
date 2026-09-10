package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ZU {
    private static Map<String, LD> Lxb = new HashMap();

    public static void Lxb(List<LD> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (LD ld : list) {
            if (ld != null) {
                Lxb.put(ld.Lxb(), ld);
            }
        }
    }

    public static LD Lxb(String str) {
        return Lxb.get(str);
    }
}
