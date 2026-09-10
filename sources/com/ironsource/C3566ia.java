package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3566ia {
    public static Map<String, Object> a(Object[][] objArr) {
        HashMap map = new HashMap();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    map.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C3631m4.d().a(e);
            }
        }
        return map;
    }
}
