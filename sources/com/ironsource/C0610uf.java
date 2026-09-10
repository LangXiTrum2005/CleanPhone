package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.uf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0610uf implements Q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B3 f30826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, Integer> f30827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f30828c;

    public C0610uf(B3 storage) {
        kotlin.jvm.internal.n.f(storage, "storage");
        this.f30826a = storage;
        this.f30827b = new ConcurrentHashMap<>();
        this.f30828c = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.Q8
    public void a(int i10, String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        this.f30827b.put(identifier, Integer.valueOf(i10));
        this.f30826a.a(identifier, i10);
    }

    @Override // com.ironsource.Q8
    public Long b(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        Long l = this.f30828c.get(identifier);
        if (l != null) {
            return l;
        }
        Long lA = this.f30826a.a(identifier);
        if (lA == null) {
            return null;
        }
        long jLongValue = lA.longValue();
        this.f30828c.put(identifier, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }

    @Override // com.ironsource.Q8
    public int a(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        Integer num = this.f30827b.get(identifier);
        if (num != null) {
            return num.intValue();
        }
        Integer numC = this.f30826a.c(identifier);
        if (numC != null) {
            int iIntValue = numC.intValue();
            this.f30827b.put(identifier, Integer.valueOf(iIntValue));
            return iIntValue;
        }
        this.f30827b.put(identifier, 0);
        return 0;
    }

    @Override // com.ironsource.Q8
    public void a(long j10, String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        this.f30828c.put(identifier, Long.valueOf(j10));
        this.f30826a.b(identifier, j10);
    }
}
