package ea;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39748a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f39749b;

    public /* synthetic */ s() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f39748a) {
            case 0:
                break;
        }
        return this.f39749b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f39748a) {
            case 0:
                break;
        }
        return (String) this.f39749b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f39748a) {
            case 0:
                throw new UnsupportedOperationException("Remove not supported");
            default:
                throw new UnsupportedOperationException();
        }
    }

    public s(t tVar) {
        this.f39749b = tVar.f39765a.keySet().iterator();
    }
}
