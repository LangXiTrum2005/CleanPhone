package com.mbridge.msdk.advanced.common;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f31399a = new HashMap();

    public static void a(String str, boolean z10) {
        f31399a.put(str, Boolean.valueOf(z10));
    }

    public static void b(String str) {
        f31399a.remove(str);
    }

    public static boolean a(String str) {
        if (f31399a.containsKey(str)) {
            return f31399a.get(str).booleanValue();
        }
        return false;
    }
}
