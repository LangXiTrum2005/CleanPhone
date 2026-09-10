package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f2635a = new HashMap();
    private static Object b = new Object();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f2636a = new b();

        private a() {
        }
    }

    public static b b() {
        return a.f2636a;
    }

    public void a() {
        synchronized (b) {
            f2635a.clear();
        }
    }

    private b() {
    }

    public static boolean a(String str) {
        if (!d.a(str)) {
            return false;
        }
        synchronized (b) {
            try {
                if (!f2635a.containsKey(str)) {
                    return true;
                }
                return f2635a.get(str).booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.umeng.commonsdk.config.f
    public void a(String str, Boolean bool) {
        if (d.a(str)) {
            synchronized (b) {
                try {
                    Map<String, Boolean> map = f2635a;
                    if (map != null) {
                        map.put(str, bool);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
