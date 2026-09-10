package vm;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pm.i f52689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52690b;

    public p(int i10, pm.i iVar) {
        this.f52689a = iVar;
        this.f52690b = i10;
    }

    @Override // vm.a
    public final int b() {
        return 1;
    }

    @Override // vm.a
    public final Object get(int i10) {
        if (i10 == this.f52690b) {
            return this.f52689a;
        }
        return null;
    }

    @Override // vm.a
    public final void h(int i10, pm.i iVar) {
        throw new IllegalStateException();
    }

    @Override // vm.a, java.lang.Iterable
    public final Iterator iterator() {
        return new ym.h(this, 2);
    }
}
