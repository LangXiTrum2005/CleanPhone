package zm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Iterator, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f55100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f55102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f55103e;

    public e(f fVar) {
        this.f55099a = 0;
        this.f55103e = fVar;
        this.f55100b = fVar.f55104a.iterator();
        this.f55101c = -1;
    }

    public void a() {
        Object next;
        f fVar = (f) this.f55103e;
        do {
            Iterator it = this.f55100b;
            if (!it.hasNext()) {
                this.f55101c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) fVar.f55106c.invoke(next)).booleanValue() != fVar.f55105b);
        this.f55102d = next;
        this.f55101c = 1;
    }

    public boolean b() {
        Iterator it;
        Iterator it2 = (Iterator) this.f55102d;
        if (it2 != null && it2.hasNext()) {
            this.f55101c = 1;
            return true;
        }
        do {
            Iterator it3 = this.f55100b;
            if (!it3.hasNext()) {
                this.f55101c = 2;
                this.f55102d = null;
                return false;
            }
            Object next = it3.next();
            g gVar = (g) this.f55103e;
            it = (Iterator) gVar.f55109c.invoke(gVar.f55108b.invoke(next));
        } while (!it.hasNext());
        this.f55102d = it;
        this.f55101c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f55099a) {
            case 0:
                if (this.f55101c == -1) {
                    a();
                }
                return this.f55101c == 1;
            default:
                int i10 = this.f55101c;
                if (i10 == 1) {
                    return true;
                }
                if (i10 == 2) {
                    return false;
                }
                return b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f55099a) {
            case 0:
                if (this.f55101c == -1) {
                    a();
                }
                if (this.f55101c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f55102d;
                this.f55102d = null;
                this.f55101c = -1;
                return obj;
            default:
                int i10 = this.f55101c;
                if (i10 == 2) {
                    throw new NoSuchElementException();
                }
                if (i10 == 0 && !b()) {
                    throw new NoSuchElementException();
                }
                this.f55101c = 0;
                Iterator it = (Iterator) this.f55102d;
                kotlin.jvm.internal.n.c(it);
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f55099a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(g gVar) {
        this.f55099a = 1;
        this.f55103e = gVar;
        this.f55100b = gVar.f55107a.iterator();
    }
}
