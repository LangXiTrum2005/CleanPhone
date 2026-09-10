package wl;

import zl.n;
import zl.q;
import zl.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends zl.i implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f53414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f53415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f53416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f53417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f53418g;

    public static d f() {
        d dVar = new d();
        dVar.f53414c = b.f53397g;
        c cVar = c.f53405g;
        dVar.f53415d = cVar;
        dVar.f53416e = cVar;
        dVar.f53417f = cVar;
        dVar.f53418g = cVar;
        return dVar;
    }

    @Override // zl.i
    public final zl.a a() {
        e eVarE = e();
        eVarE.isInitialized();
        return eVarE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        e eVar2 = null;
        try {
            try {
                e.f53420k.getClass();
                g(new e(eVar, gVar));
                return this;
            } catch (q e10) {
                e eVar3 = (e) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    eVar2 = eVar3;
                    if (eVar2 != null) {
                        g(eVar2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (eVar2 != null) {
                g(eVar2);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(n nVar) {
        g((e) nVar);
        return this;
    }

    public final Object clone() {
        d dVarF = f();
        dVarF.g(e());
        return dVarF;
    }

    public final e e() {
        e eVar = new e(this);
        int i10 = this.f53413b;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        eVar.f53423c = this.f53414c;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        eVar.f53424d = this.f53415d;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        eVar.f53425e = this.f53416e;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        eVar.f53426f = this.f53417f;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        eVar.f53427g = this.f53418g;
        eVar.f53422b = i11;
        return eVar;
    }

    public final void g(e eVar) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        b bVar;
        if (eVar == e.f53419j) {
            return;
        }
        if ((eVar.f53422b & 1) == 1) {
            b bVar2 = eVar.f53423c;
            if ((this.f53413b & 1) != 1 || (bVar = this.f53414c) == b.f53397g) {
                this.f53414c = bVar2;
            } else {
                a aVar = new a(0);
                aVar.g(bVar);
                aVar.g(bVar2);
                this.f53414c = aVar.e();
            }
            this.f53413b |= 1;
        }
        if ((eVar.f53422b & 2) == 2) {
            c cVar5 = eVar.f53424d;
            if ((this.f53413b & 2) != 2 || (cVar4 = this.f53415d) == c.f53405g) {
                this.f53415d = cVar5;
            } else {
                a aVarL = c.l(cVar4);
                aVarL.h(cVar5);
                this.f53415d = aVarL.f();
            }
            this.f53413b |= 2;
        }
        if ((eVar.f53422b & 4) == 4) {
            c cVar6 = eVar.f53425e;
            if ((this.f53413b & 4) != 4 || (cVar3 = this.f53416e) == c.f53405g) {
                this.f53416e = cVar6;
            } else {
                a aVarL2 = c.l(cVar3);
                aVarL2.h(cVar6);
                this.f53416e = aVarL2.f();
            }
            this.f53413b |= 4;
        }
        if ((eVar.f53422b & 8) == 8) {
            c cVar7 = eVar.f53426f;
            if ((this.f53413b & 8) != 8 || (cVar2 = this.f53417f) == c.f53405g) {
                this.f53417f = cVar7;
            } else {
                a aVarL3 = c.l(cVar2);
                aVarL3.h(cVar7);
                this.f53417f = aVarL3.f();
            }
            this.f53413b |= 8;
        }
        if ((eVar.f53422b & 16) == 16) {
            c cVar8 = eVar.f53427g;
            if ((this.f53413b & 16) != 16 || (cVar = this.f53418g) == c.f53405g) {
                this.f53418g = cVar8;
            } else {
                a aVarL4 = c.l(cVar);
                aVarL4.h(cVar8);
                this.f53418g = aVarL4.f();
            }
            this.f53413b |= 16;
        }
        this.f55044a = this.f55044a.h(eVar.f53421a);
    }
}
