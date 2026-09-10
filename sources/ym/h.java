package ym;

import java.util.Iterator;
import java.util.NoSuchElementException;
import vm.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements Iterator, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f54553b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f54554c;

    public /* synthetic */ h(Object obj, int i10) {
        this.f54552a = i10;
        this.f54554c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f54552a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f54553b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f54552a) {
            case 0:
                if (!this.f54553b) {
                    throw new NoSuchElementException();
                }
                this.f54553b = false;
                return this.f54554c;
            case 1:
                if (!this.f54553b) {
                    throw new NoSuchElementException();
                }
                this.f54553b = false;
                return this.f54554c;
            default:
                if (!this.f54553b) {
                    throw new NoSuchElementException();
                }
                this.f54553b = false;
                return ((p) this.f54554c).f52689a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f54552a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
