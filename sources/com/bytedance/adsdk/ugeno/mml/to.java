package com.bytedance.adsdk.ugeno.mml;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class to {
    private static Map<String, wd> qdl = new HashMap();

    public static void qdl(List<wd> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (wd wdVar : list) {
            if (wdVar != null) {
                qdl.put(wdVar.qdl(), wdVar);
            }
        }
    }

    public static wd qdl(String str) {
        return qdl.get(str);
    }
}
