package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fa1 extends mb1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aa1 f14352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mb1 f14353c;

    public fa1(ka1 ka1Var) {
        super(0);
        Objects.requireNonNull(ka1Var);
        this.f14352b = ((ca1) ka1Var.f16399d.values()).listIterator(0);
        this.f14353c = ma1.f17367e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14353c.hasNext() || this.f14352b.hasNext();
    }

    @Override // com.google.android.gms.internal.ads.mb1, java.util.Iterator
    public final Object next() {
        if (!this.f14353c.hasNext()) {
            this.f14353c = ((y91) this.f14352b.next()).h();
        }
        return this.f14353c.next();
    }
}
