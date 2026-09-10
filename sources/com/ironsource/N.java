package com.ironsource;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f26615a = new N();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap<String, Long> f26616b = new HashMap<>();

    private N() {
    }

    public final HashMap<String, Long> a() {
        return f26616b;
    }

    public final long b(String instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        Long l = f26616b.get(instance);
        if (l != null) {
            return System.currentTimeMillis() - l.longValue();
        }
        return -1L;
    }

    public final long c(String instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        Long l = f26616b.get(instance);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    public final boolean a(String instance, long j10) {
        kotlin.jvm.internal.n.f(instance, "instance");
        if (instance.length() == 0) {
            return false;
        }
        HashMap<String, Long> map = f26616b;
        if (map.containsKey(instance)) {
            return false;
        }
        map.put(instance, Long.valueOf(j10));
        return true;
    }

    public final boolean a(String instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        HashMap<String, Long> map = f26616b;
        if (map.get(instance) == null) {
            return false;
        }
        map.remove(instance);
        return true;
    }
}
