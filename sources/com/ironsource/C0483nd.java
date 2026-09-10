package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.nd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0483nd implements E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29847a;

    public C0483nd(String placementName) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        this.f29847a = placementName;
    }

    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 c4) {
        HashMap map = new HashMap();
        map.put("placement", this.f29847a);
        return map;
    }
}
