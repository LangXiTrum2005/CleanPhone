package ym;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f54546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f54548c;

    public e(f fVar) {
        this.f54548c = fVar;
        this.f54547b = ((AbstractList) fVar).modCount;
    }

    public final void a() {
        f fVar = this.f54548c;
        int i10 = ((AbstractList) fVar).modCount;
        int i11 = this.f54547b;
        if (i10 == i11) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) fVar).modCount + "; expected: " + i11);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f54546a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f54546a) {
            throw new NoSuchElementException();
        }
        this.f54546a = true;
        a();
        return this.f54548c.f54550b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.f54548c.clear();
    }
}
