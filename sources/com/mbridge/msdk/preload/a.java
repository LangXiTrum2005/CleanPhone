package com.mbridge.msdk.preload;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public void a(Map<String, Object> map) {
    }

    public void a(Map<String, Object> map, int i10) {
        try {
            com.mbridge.msdk.mbnative.service.a.class.getMethod("preload", Map.class, Integer.TYPE).invoke(com.mbridge.msdk.mbnative.service.a.class.newInstance(), map, Integer.valueOf(i10));
        } catch (Exception unused) {
        }
    }

    public void b(Map<String, Object> map) {
    }
}
