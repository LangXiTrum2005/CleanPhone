package eb;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f40014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f40015b;

    public v(Iterator it, Iterator it2) {
        this.f40014a = it;
        this.f40015b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40014a.hasNext() || this.f40015b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f40014a;
        return it.hasNext() ? it.next() : this.f40015b.next();
    }
}
