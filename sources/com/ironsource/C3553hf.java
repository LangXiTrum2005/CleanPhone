package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3553hf implements O8 {
    private final B3 a;
    private ConcurrentHashMap<String, Integer> b;
    private ConcurrentHashMap<String, Long> c;

    public C3553hf(B3 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.a = storage;
        this.b = new ConcurrentHashMap<>();
        this.c = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.O8
    public void a(int i, String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.b.put(identifier, Integer.valueOf(i));
        this.a.a(identifier, i);
    }

    @Override // com.ironsource.O8
    public Long b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Long l = this.c.get(identifier);
        if (l != null) {
            return l;
        }
        Long lA = this.a.a(identifier);
        if (lA == null) {
            return null;
        }
        long jLongValue = lA.longValue();
        this.c.put(identifier, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }

    @Override // com.ironsource.O8
    public int a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Integer num = this.b.get(identifier);
        if (num != null) {
            return num.intValue();
        }
        Integer numC = this.a.c(identifier);
        if (numC != null) {
            int iIntValue = numC.intValue();
            this.b.put(identifier, Integer.valueOf(iIntValue));
            return iIntValue;
        }
        this.b.put(identifier, 0);
        return 0;
    }

    @Override // com.ironsource.O8
    public void a(long j, String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.c.put(identifier, Long.valueOf(j));
        this.a.b(identifier, j);
    }
}
