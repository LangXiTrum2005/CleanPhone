package yj;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements ListIterator, kk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54404b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xj.g f54407e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54403a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54405c = -1;

    public a(c cVar, int i10) {
        this.f54407e = cVar;
        this.f54404b = i10;
        this.f54406d = ((AbstractList) cVar).modCount;
    }

    public void a() {
        if (((AbstractList) ((b) this.f54407e).f54412e).modCount != this.f54406d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f54403a) {
            case 0:
                a();
                b bVar = (b) this.f54407e;
                int i10 = this.f54404b;
                this.f54404b = i10 + 1;
                bVar.add(i10, obj);
                this.f54405c = -1;
                this.f54406d = ((AbstractList) bVar).modCount;
                break;
            default:
                b();
                c cVar = (c) this.f54407e;
                int i11 = this.f54404b;
                this.f54404b = i11 + 1;
                cVar.add(i11, obj);
                this.f54405c = -1;
                this.f54406d = ((AbstractList) cVar).modCount;
                break;
        }
    }

    public void b() {
        if (((AbstractList) ((c) this.f54407e)).modCount != this.f54406d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f54403a) {
            case 0:
                return this.f54404b < ((b) this.f54407e).f54410c;
            default:
                return this.f54404b < ((c) this.f54407e).f54415b;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f54403a) {
            case 0:
                return this.f54404b > 0;
            default:
                return this.f54404b > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f54403a) {
            case 0:
                a();
                int i10 = this.f54404b;
                b bVar = (b) this.f54407e;
                if (i10 >= bVar.f54410c) {
                    throw new NoSuchElementException();
                }
                this.f54404b = i10 + 1;
                this.f54405c = i10;
                return bVar.f54408a[bVar.f54409b + i10];
            default:
                b();
                int i11 = this.f54404b;
                c cVar = (c) this.f54407e;
                if (i11 >= cVar.f54415b) {
                    throw new NoSuchElementException();
                }
                this.f54404b = i11 + 1;
                this.f54405c = i11;
                return cVar.f54414a[i11];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f54403a) {
            case 0:
                break;
        }
        return this.f54404b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f54403a) {
            case 0:
                a();
                int i10 = this.f54404b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f54404b = i11;
                this.f54405c = i11;
                b bVar = (b) this.f54407e;
                return bVar.f54408a[bVar.f54409b + i11];
            default:
                b();
                int i12 = this.f54404b;
                if (i12 <= 0) {
                    throw new NoSuchElementException();
                }
                int i13 = i12 - 1;
                this.f54404b = i13;
                this.f54405c = i13;
                return ((c) this.f54407e).f54414a[i13];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i10;
        switch (this.f54403a) {
            case 0:
                i10 = this.f54404b;
                break;
            default:
                i10 = this.f54404b;
                break;
        }
        return i10 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f54403a) {
            case 0:
                b bVar = (b) this.f54407e;
                a();
                int i10 = this.f54405c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.m(i10);
                this.f54404b = this.f54405c;
                this.f54405c = -1;
                this.f54406d = ((AbstractList) bVar).modCount;
                return;
            default:
                c cVar = (c) this.f54407e;
                b();
                int i11 = this.f54405c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.m(i11);
                this.f54404b = this.f54405c;
                this.f54405c = -1;
                this.f54406d = ((AbstractList) cVar).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f54403a) {
            case 0:
                a();
                int i10 = this.f54405c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f54407e).set(i10, obj);
                return;
            default:
                b();
                int i11 = this.f54405c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f54407e).set(i11, obj);
                return;
        }
    }

    public a(b bVar, int i10) {
        this.f54407e = bVar;
        this.f54404b = i10;
        this.f54406d = ((AbstractList) bVar).modCount;
    }
}
