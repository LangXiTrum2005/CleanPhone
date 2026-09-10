package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class mml {
    private static Map<String, ud> qdl = new HashMap();

    public static void qdl(List<ud> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (ud udVar : list) {
            if (udVar != null) {
                qdl.put(udVar.qdl(), udVar);
            }
        }
    }

    public static ud qdl(String str) {
        return qdl.get(str);
    }
}
