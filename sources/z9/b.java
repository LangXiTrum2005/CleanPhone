package z9;

import com.google.android.gms.internal.auth.i;
import com.google.android.gms.internal.play_billing.b0;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends b0 implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f54658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, int i10) {
        super(1);
        int size = eVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(i.L(i10, size, "index"));
        }
        this.f54656b = size;
        this.f54657c = i10;
        this.f54658d = eVar;
    }

    public final Object a(int i10) {
        return this.f54658d.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f54657c < this.f54656b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f54657c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f54657c;
        this.f54657c = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f54657c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f54657c - 1;
        this.f54657c = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f54657c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
