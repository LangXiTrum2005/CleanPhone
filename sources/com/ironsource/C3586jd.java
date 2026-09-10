package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3586jd implements E0 {
    private final String a;

    public C3586jd(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.a = placementName;
    }

    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 c0) {
        HashMap map = new HashMap();
        map.put("placement", this.a);
        return map;
    }
}
