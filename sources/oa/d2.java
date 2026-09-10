package oa;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f47242a;

    public d2(Iterator it) {
        it.getClass();
        this.f47242a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47242a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f47242a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f47242a.remove();
    }
}
