package com.smartdigimkt.c;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f34000a = new HashMap();

    public static void a(String str, boolean z2) {
        f34000a.put(str, Boolean.valueOf(z2));
    }

    public static void b(String str) {
        f34000a.remove(str);
    }

    public static boolean a(String str) {
        if (f34000a.containsKey(str)) {
            return f34000a.get(str).booleanValue();
        }
        return false;
    }

    public static void a() {
        f34000a.clear();
    }
}
