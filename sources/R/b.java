package r;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f49204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f49205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f49206c;

    public b(c cVar, c cVar2, int i10) {
        this.f49206c = i10;
        this.f49204a = cVar2;
        this.f49205b = cVar;
    }

    @Override // r.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f49204a == cVar && cVar == this.f49205b) {
            this.f49205b = null;
            this.f49204a = null;
        }
        c cVar3 = this.f49204a;
        if (cVar3 == cVar) {
            switch (this.f49206c) {
                case 0:
                    cVar2 = cVar3.f49210d;
                    break;
                default:
                    cVar2 = cVar3.f49209c;
                    break;
            }
            this.f49204a = cVar2;
        }
        c cVar4 = this.f49205b;
        if (cVar4 == cVar) {
            c cVar5 = this.f49204a;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f49205b = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f49206c) {
            case 0:
                return cVar.f49209c;
            default:
                return cVar.f49210d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f49205b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f49205b;
        c cVar2 = this.f49204a;
        this.f49205b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
