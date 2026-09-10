package yj;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.n;
import m0.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends j0 implements Iterator, kk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f54417e;

    public d(f map, int i10) {
        this.f54417e = i10;
        n.f(map, "map");
        this.f45720d = map;
        this.f45718b = -1;
        this.f45719c = map.f54429h;
        g();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f54417e) {
            case 0:
                b();
                int i10 = this.f45717a;
                f fVar = (f) this.f45720d;
                if (i10 >= fVar.f54427f) {
                    throw new NoSuchElementException();
                }
                this.f45717a = i10 + 1;
                this.f45718b = i10;
                e eVar = new e(fVar, i10);
                g();
                return eVar;
            case 1:
                b();
                int i11 = this.f45717a;
                f fVar2 = (f) this.f45720d;
                if (i11 >= fVar2.f54427f) {
                    throw new NoSuchElementException();
                }
                this.f45717a = i11 + 1;
                this.f45718b = i11;
                Object obj = fVar2.f54422a[i11];
                g();
                return obj;
            default:
                b();
                int i12 = this.f45717a;
                f fVar3 = (f) this.f45720d;
                if (i12 >= fVar3.f54427f) {
                    throw new NoSuchElementException();
                }
                this.f45717a = i12 + 1;
                this.f45718b = i12;
                Object[] objArr = fVar3.f54423b;
                n.c(objArr);
                Object obj2 = objArr[this.f45718b];
                g();
                return obj2;
        }
    }
}
