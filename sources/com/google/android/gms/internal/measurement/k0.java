package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f23631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f23632b;

    public k0(m1 m1Var, Iterator it, Iterator it2) {
        this.f23631a = it;
        this.f23632b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f23631a.hasNext()) {
            return true;
        }
        return this.f23632b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f23631a;
        if (it.hasNext()) {
            return new e6(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f23632b;
        if (it2.hasNext()) {
            return new e6((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
