package xj;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class z implements Iterator, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53871a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f53872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53873c;

    public z(Iterator iterator) {
        kotlin.jvm.internal.n.f(iterator, "iterator");
        this.f53872b = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f53871a) {
            case 0:
                return this.f53872b.hasNext();
            case 1:
                break;
            default:
                return this.f53873c > 0 && this.f53872b.hasNext();
        }
        while (true) {
            int i10 = this.f53873c;
            it = this.f53872b;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f53873c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f53871a) {
            case 0:
                int i10 = this.f53873c;
                this.f53873c = i10 + 1;
                if (i10 >= 0) {
                    return new y(i10, this.f53872b.next());
                }
                o.V();
                throw null;
            case 1:
                break;
            default:
                int i11 = this.f53873c;
                if (i11 == 0) {
                    throw new NoSuchElementException();
                }
                this.f53873c = i11 - 1;
                return this.f53872b.next();
        }
        while (true) {
            int i12 = this.f53873c;
            it = this.f53872b;
            if (i12 > 0 && it.hasNext()) {
                it.next();
                this.f53873c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f53871a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z(zm.b bVar, byte b10) {
        this.f53873c = bVar.f55097c;
        this.f53872b = bVar.f55096b.iterator();
    }

    public z(zm.b bVar) {
        this.f53872b = bVar.f55096b.iterator();
        this.f53873c = bVar.f55097c;
    }
}
