package zm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements Iterator, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f55112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f55113d;

    public h(q qVar) {
        this.f55110a = 1;
        this.f55113d = qVar;
        this.f55112c = qVar.f55125a.iterator();
    }

    public void a() {
        Object objInvoke;
        hk.i iVar = (hk.i) this.f55113d;
        if (this.f55111b == -2) {
            objInvoke = ((jk.a) iVar.f42396b).invoke();
        } else {
            jk.b bVar = (jk.b) iVar.f42397c;
            Object obj = this.f55112c;
            kotlin.jvm.internal.n.c(obj);
            objInvoke = bVar.invoke(obj);
        }
        this.f55112c = objInvoke;
        this.f55111b = objInvoke == null ? 0 : 1;
    }

    public void b() {
        Iterator it = (Iterator) this.f55113d;
        if (it.hasNext()) {
            Object next = it.next();
            zk.j it2 = (zk.j) next;
            kotlin.jvm.internal.n.f(it2, "it");
            if (it2 instanceof zk.b) {
                this.f55111b = 1;
                this.f55112c = next;
                return;
            }
        }
        this.f55111b = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f55110a) {
            case 0:
                if (this.f55111b < 0) {
                    a();
                }
                return this.f55111b == 1;
            case 1:
                q qVar = (q) this.f55113d;
                Iterator it = (Iterator) this.f55112c;
                while (this.f55111b < qVar.f55126b && it.hasNext()) {
                    it.next();
                    this.f55111b++;
                }
                return this.f55111b < qVar.f55127c && it.hasNext();
            default:
                if (this.f55111b == -1) {
                    b();
                }
                return this.f55111b == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f55110a) {
            case 0:
                if (this.f55111b < 0) {
                    a();
                }
                if (this.f55111b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f55112c;
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f55111b = -1;
                return obj;
            case 1:
                q qVar = (q) this.f55113d;
                Iterator it = (Iterator) this.f55112c;
                while (this.f55111b < qVar.f55126b && it.hasNext()) {
                    it.next();
                    this.f55111b++;
                }
                int i10 = this.f55111b;
                if (i10 >= qVar.f55127c) {
                    throw new NoSuchElementException();
                }
                this.f55111b = i10 + 1;
                return it.next();
            default:
                if (this.f55111b == -1) {
                    b();
                }
                if (this.f55111b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f55112c;
                this.f55112c = null;
                this.f55111b = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f55110a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(an.r rVar) {
        this.f55110a = 2;
        this.f55113d = ((i) rVar.f3793b).iterator();
        this.f55111b = -1;
    }

    public h(hk.i iVar) {
        this.f55110a = 0;
        this.f55113d = iVar;
        this.f55111b = -2;
    }
}
