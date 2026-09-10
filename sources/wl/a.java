package wl;

import zl.n;
import zl.q;
import zl.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends zl.i implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f53393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53396e;

    public /* synthetic */ a(int i10) {
        this.f53393b = i10;
    }

    @Override // zl.i
    public final zl.a a() {
        switch (this.f53393b) {
            case 0:
                b bVarE = e();
                bVarE.isInitialized();
                return bVarE;
            default:
                c cVarF = f();
                cVarF.isInitialized();
                return cVarF;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        switch (this.f53393b) {
            case 0:
                b bVar = null;
                try {
                    try {
                        b.f53398h.getClass();
                        g(new b(eVar));
                        return this;
                    } catch (q e10) {
                        b bVar2 = (b) e10.f55076a;
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = bVar2;
                            if (bVar != null) {
                                g(bVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (bVar != null) {
                        g(bVar);
                    }
                    throw th;
                }
            default:
                c cVar = null;
                try {
                    try {
                        c.f53406h.getClass();
                        h(new c(eVar));
                        return this;
                    } catch (q e11) {
                        c cVar2 = (c) e11.f55076a;
                        try {
                            throw e11;
                        } catch (Throwable th4) {
                            th = th4;
                            cVar = cVar2;
                            if (cVar != null) {
                                h(cVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (cVar != null) {
                        h(cVar);
                    }
                    throw th;
                }
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(n nVar) {
        switch (this.f53393b) {
            case 0:
                g((b) nVar);
                break;
            default:
                h((c) nVar);
                break;
        }
        return this;
    }

    public final Object clone() {
        switch (this.f53393b) {
            case 0:
                a aVar = new a(0);
                aVar.g(e());
                return aVar;
            default:
                a aVar2 = new a(1);
                aVar2.h(f());
                return aVar2;
        }
    }

    public b e() {
        b bVar = new b(this);
        int i10 = this.f53394c;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        bVar.f53401c = this.f53395d;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        bVar.f53402d = this.f53396e;
        bVar.f53400b = i11;
        return bVar;
    }

    public c f() {
        c cVar = new c(this);
        int i10 = this.f53394c;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        cVar.f53409c = this.f53395d;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        cVar.f53410d = this.f53396e;
        cVar.f53408b = i11;
        return cVar;
    }

    public void g(b bVar) {
        if (bVar == b.f53397g) {
            return;
        }
        int i10 = bVar.f53400b;
        if ((i10 & 1) == 1) {
            int i11 = bVar.f53401c;
            this.f53394c = 1 | this.f53394c;
            this.f53395d = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = bVar.f53402d;
            this.f53394c = 2 | this.f53394c;
            this.f53396e = i12;
        }
        this.f55044a = this.f55044a.h(bVar.f53399a);
    }

    public void h(c cVar) {
        if (cVar == c.f53405g) {
            return;
        }
        int i10 = cVar.f53408b;
        if ((i10 & 1) == 1) {
            int i11 = cVar.f53409c;
            this.f53394c = 1 | this.f53394c;
            this.f53395d = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = cVar.f53410d;
            this.f53394c = 2 | this.f53394c;
            this.f53396e = i12;
        }
        this.f55044a = this.f55044a.h(cVar.f53407a);
    }
}
