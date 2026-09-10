package r;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f49211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f49212b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f49213c;

    public d(f fVar) {
        this.f49213c = fVar;
    }

    @Override // r.e
    public final void a(c cVar) {
        c cVar2 = this.f49211a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f49210d;
            this.f49211a = cVar3;
            this.f49212b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f49212b) {
            return this.f49213c.f49214a != null;
        }
        c cVar = this.f49211a;
        return (cVar == null || cVar.f49209c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f49212b) {
            this.f49212b = false;
            this.f49211a = this.f49213c.f49214a;
        } else {
            c cVar = this.f49211a;
            this.f49211a = cVar != null ? cVar.f49209c : null;
        }
        return this.f49211a;
    }
}
