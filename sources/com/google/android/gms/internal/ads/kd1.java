package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kd1 extends jd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f16411a = AtomicReferenceFieldUpdater.newUpdater(md1.class, Set.class, "h");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f16412b = AtomicIntegerFieldUpdater.newUpdater(md1.class, "i");

    @Override // com.google.android.gms.internal.ads.jd1
    public final void c(id1 id1Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f16411a;
            if (atomicReferenceFieldUpdater.compareAndSet(id1Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(id1Var) == null);
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final int f(id1 id1Var) {
        return f16412b.decrementAndGet(id1Var);
    }
}
