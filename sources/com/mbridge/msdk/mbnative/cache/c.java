package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<Integer, b<String, List<Campaign>>> f34612a = new HashMap();

    public static b<String, List<Campaign>> a(int i10) {
        if (f34612a.containsKey(Integer.valueOf(i10))) {
            return f34612a.get(Integer.valueOf(i10));
        }
        a aVar = new a(i10);
        f34612a.put(Integer.valueOf(i10), aVar);
        return aVar;
    }
}
