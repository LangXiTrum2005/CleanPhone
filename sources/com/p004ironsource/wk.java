package com.p004ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class wk {
    public static Map<String, Object> a(Object[][] objArr) {
        HashMap map = new HashMap();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    map.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e2) {
                q9.d().a(e2);
            }
        }
        return map;
    }
}
