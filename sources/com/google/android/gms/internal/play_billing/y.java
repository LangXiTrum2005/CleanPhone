package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient a0 f24502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient z f24503d;

    public y(a0 a0Var, z zVar) {
        this.f24502c = a0Var;
        this.f24503d = zVar;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int b(Object[] objArr) {
        return this.f24503d.b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f24502c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f24503d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.t, com.google.android.gms.internal.play_billing.o
    public final r n() {
        return this.f24503d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f24502c.f24219f;
    }
}
