package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bb1 extends ia1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient db1 f12709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient cb1 f12710e;

    public bb1(db1 db1Var, cb1 cb1Var) {
        this.f12709d = db1Var;
        this.f12710e = cb1Var;
    }

    @Override // com.google.android.gms.internal.ads.y91, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f12709d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final mb1 h() {
        return this.f12710e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f12710e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.ia1, com.google.android.gms.internal.ads.y91
    public final ca1 q() {
        return this.f12710e;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final boolean r() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final int s(Object[] objArr, int i10) {
        return this.f12710e.s(objArr, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12709d.f13490f;
    }
}
