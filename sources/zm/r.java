package zm;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements Iterator, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f55128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f55129b;

    public r(s sVar) {
        this.f55129b = sVar;
        this.f55128a = sVar.f55130a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f55128a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f55129b.f55131b.invoke(this.f55128a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
