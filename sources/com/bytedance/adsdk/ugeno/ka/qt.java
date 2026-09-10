package com.bytedance.adsdk.ugeno.ka;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class qt {
    private static Map<String, xha> ri = new HashMap();

    public static void ri(List<xha> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (xha xhaVar : list) {
            if (xhaVar != null) {
                ri.put(xhaVar.ri(), xhaVar);
            }
        }
    }

    public static xha ri(String str) {
        return ri.get(str);
    }
}
