package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    private static Map<String, lr> ri = new HashMap();

    public static void ri(List<lr> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (lr lrVar : list) {
            if (lrVar != null) {
                ri.put(lrVar.ri(), lrVar);
            }
        }
    }

    public static lr ri(String str) {
        return ri.get(str);
    }
}
