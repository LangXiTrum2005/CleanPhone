package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cj1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f13195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f13196b;

    public /* synthetic */ cj1(Iterator it, Iterator it2) {
        this.f13195a = it;
        this.f13196b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13195a.hasNext() || this.f13196b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f13195a;
        return it.hasNext() ? it.next() : this.f13196b.next();
    }
}
