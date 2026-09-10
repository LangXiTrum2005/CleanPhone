package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ga1 extends y91 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient ka1 f14807b;

    public ga1(ka1 ka1Var) {
        this.f14807b = ka1Var;
    }

    @Override // com.google.android.gms.internal.ads.y91, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f14807b.h(obj);
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final mb1 h() {
        return new fa1(this.f14807b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new fa1(this.f14807b);
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final int s(Object[] objArr, int i10) {
        aa1 aa1VarListIterator = ((ca1) this.f14807b.f16399d.values()).listIterator(0);
        while (aa1VarListIterator.hasNext()) {
            i10 = ((y91) aa1VarListIterator.next()).s(objArr, i10);
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f14807b.f16400e;
    }
}
