package xj;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.b implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f53838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, int i10) {
        super(fVar);
        this.f53838d = fVar;
        c cVar = f.Companion;
        int size = fVar.size();
        cVar.getClass();
        c.b(i10, size);
        this.f44756b = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f44756b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f44756b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f44756b - 1;
        this.f44756b = i10;
        return this.f53838d.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f44756b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
