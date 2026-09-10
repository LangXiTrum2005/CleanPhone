package tl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends zl.i implements zl.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f51372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f51373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f51374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f51375f;

    public static o f() {
        o oVar = new o();
        oVar.f51372c = p.RETURNS_CONSTANT;
        oVar.f51373d = Collections.EMPTY_LIST;
        oVar.f51374e = w.l;
        oVar.f51375f = q.AT_MOST_ONCE;
        return oVar;
    }

    @Override // zl.i
    public final zl.a a() {
        r rVarE = e();
        if (rVarE.isInitialized()) {
            return rVarE;
        }
        throw new aa.b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        r rVar = null;
        try {
            try {
                r.f51429j.getClass();
                g(new r(eVar, gVar));
                return this;
            } catch (zl.q e10) {
                r rVar2 = (r) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    rVar = rVar2;
                    if (rVar != null) {
                        g(rVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (rVar != null) {
                g(rVar);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        g((r) nVar);
        return this;
    }

    public final Object clone() {
        o oVarF = f();
        oVarF.g(e());
        return oVarF;
    }

    public final r e() {
        r rVar = new r(this);
        int i10 = this.f51371b;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        rVar.f51432c = this.f51372c;
        if ((i10 & 2) == 2) {
            this.f51373d = Collections.unmodifiableList(this.f51373d);
            this.f51371b &= -3;
        }
        rVar.f51433d = this.f51373d;
        if ((i10 & 4) == 4) {
            i11 |= 2;
        }
        rVar.f51434e = this.f51374e;
        if ((i10 & 8) == 8) {
            i11 |= 4;
        }
        rVar.f51435f = this.f51375f;
        rVar.f51431b = i11;
        return rVar;
    }

    public final void g(r rVar) {
        w wVar;
        if (rVar == r.f51428i) {
            return;
        }
        if ((rVar.f51431b & 1) == 1) {
            p pVar = rVar.f51432c;
            pVar.getClass();
            this.f51371b = 1 | this.f51371b;
            this.f51372c = pVar;
        }
        if (!rVar.f51433d.isEmpty()) {
            if (this.f51373d.isEmpty()) {
                this.f51373d = rVar.f51433d;
                this.f51371b &= -3;
            } else {
                if ((this.f51371b & 2) != 2) {
                    this.f51373d = new ArrayList(this.f51373d);
                    this.f51371b |= 2;
                }
                this.f51373d.addAll(rVar.f51433d);
            }
        }
        if ((rVar.f51431b & 2) == 2) {
            w wVar2 = rVar.f51434e;
            if ((this.f51371b & 4) != 4 || (wVar = this.f51374e) == w.l) {
                this.f51374e = wVar2;
            } else {
                u uVarF = u.f();
                uVarF.g(wVar);
                uVarF.g(wVar2);
                this.f51374e = uVarF.e();
            }
            this.f51371b |= 4;
        }
        if ((rVar.f51431b & 4) == 4) {
            q qVar = rVar.f51435f;
            qVar.getClass();
            this.f51371b |= 8;
            this.f51375f = qVar;
        }
        this.f55044a = this.f55044a.h(rVar.f51430a);
    }
}
