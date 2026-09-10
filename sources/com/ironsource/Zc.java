package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Zc implements J7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B3 f28126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f28127b;

    public Zc(B3 storage) {
        kotlin.jvm.internal.n.f(storage, "storage");
        this.f28126a = storage;
        this.f28127b = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.J7
    public Long a(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        Long l = this.f28127b.get(identifier);
        if (l != null) {
            return l;
        }
        Long lB = this.f28126a.b(identifier);
        if (lB == null) {
            return null;
        }
        long jLongValue = lB.longValue();
        this.f28127b.put(identifier, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }

    @Override // com.ironsource.J7
    public void a(long j10, String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        this.f28127b.put(identifier, Long.valueOf(j10));
        this.f28126a.a(identifier, j10);
    }
}
