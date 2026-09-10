package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Iterator, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44755a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f44757c;

    public b(Object[] array) {
        n.f(array, "array");
        this.f44757c = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f44755a) {
            case 0:
                return this.f44756b < ((Object[]) this.f44757c).length;
            default:
                return this.f44756b < ((xj.f) this.f44757c).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f44755a) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f44757c;
                    int i10 = this.f44756b;
                    this.f44756b = i10 + 1;
                    return objArr[i10];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f44756b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                xj.f fVar = (xj.f) this.f44757c;
                int i11 = this.f44756b;
                this.f44756b = i11 + 1;
                return fVar.get(i11);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f44755a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(xj.f fVar) {
        this.f44757c = fVar;
    }
}
