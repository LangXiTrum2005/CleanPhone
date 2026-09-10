package zm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends k implements Iterator, ak.f, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f55115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ak.f f55116c;

    @Override // zm.k
    public final void a(Object obj, ck.a aVar) {
        this.f55115b = obj;
        this.f55114a = 3;
        this.f55116c = aVar;
    }

    public final RuntimeException b() {
        int i10 = this.f55114a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f55114a);
    }

    @Override // ak.f
    public final ak.k getContext() {
        return ak.l.f3620a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f55114a;
            if (i10 != 0) {
                break;
            }
            this.f55114a = 5;
            ak.f fVar = this.f55116c;
            kotlin.jvm.internal.n.c(fVar);
            this.f55116c = null;
            fVar.resumeWith(wj.r.f53297a);
        }
        if (i10 == 1) {
            kotlin.jvm.internal.n.c(null);
            throw null;
        }
        if (i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f55114a;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f55114a = 1;
            kotlin.jvm.internal.n.c(null);
            throw null;
        }
        if (i10 != 3) {
            throw b();
        }
        this.f55114a = 0;
        Object obj = this.f55115b;
        this.f55115b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // ak.f
    public final void resumeWith(Object obj) {
        t9.e.z(obj);
        this.f55114a = 4;
    }
}
