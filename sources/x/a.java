package x;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f53481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f53484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f53485e;

    public a(int i10) {
        this.f53481a = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f53482b < this.f53481a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f53482b;
        switch (this.f53484d) {
            case 0:
                objF = ((e) this.f53485e).f(i10);
                break;
            case 1:
                objF = ((e) this.f53485e).j(i10);
                break;
            default:
                objF = ((f) this.f53485e).f53496b[i10];
                break;
        }
        this.f53482b++;
        this.f53483c = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f53483c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f53482b - 1;
        this.f53482b = i10;
        switch (this.f53484d) {
            case 0:
                ((e) this.f53485e).h(i10);
                break;
            case 1:
                ((e) this.f53485e).h(i10);
                break;
            default:
                ((f) this.f53485e).b(i10);
                break;
        }
        this.f53481a--;
        this.f53483c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f53497c);
        this.f53484d = 2;
        this.f53485e = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i10) {
        this(eVar.f53506c);
        this.f53484d = i10;
        switch (i10) {
            case 1:
                this.f53485e = eVar;
                this(eVar.f53506c);
                break;
            default:
                this.f53485e = eVar;
                break;
        }
    }
}
