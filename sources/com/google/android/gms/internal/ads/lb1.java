package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lb1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f16847a;

    public lb1(Iterator it) {
        it.getClass();
        this.f16847a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16847a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f16847a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f16847a.remove();
    }
}
