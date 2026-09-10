package tl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends zl.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f51329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f51330g;

    public static k f() {
        k kVar = new k();
        kVar.f51328e = 6;
        List list = Collections.EMPTY_LIST;
        kVar.f51329f = list;
        kVar.f51330g = list;
        return kVar;
    }

    @Override // zl.i
    public final zl.a a() {
        l lVarE = e();
        if (lVarE.isInitialized()) {
            return lVarE;
        }
        throw new aa.b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        l lVar = null;
        try {
            try {
                l.f51338j.getClass();
                g(new l(eVar, gVar));
                return this;
            } catch (zl.q e10) {
                l lVar2 = (l) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    lVar = lVar2;
                    if (lVar != null) {
                        g(lVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (lVar != null) {
                g(lVar);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        g((l) nVar);
        return this;
    }

    public final Object clone() {
        k kVarF = f();
        kVarF.g(e());
        return kVarF;
    }

    public final l e() {
        l lVar = new l(this);
        int i10 = this.f51327d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        lVar.f51341d = this.f51328e;
        if ((i10 & 2) == 2) {
            this.f51329f = Collections.unmodifiableList(this.f51329f);
            this.f51327d &= -3;
        }
        lVar.f51342e = this.f51329f;
        if ((this.f51327d & 4) == 4) {
            this.f51330g = Collections.unmodifiableList(this.f51330g);
            this.f51327d &= -5;
        }
        lVar.f51343f = this.f51330g;
        lVar.f51340c = i11;
        return lVar;
    }

    public final void g(l lVar) {
        if (lVar == l.f51337i) {
            return;
        }
        if ((lVar.f51340c & 1) == 1) {
            int i10 = lVar.f51341d;
            this.f51327d = 1 | this.f51327d;
            this.f51328e = i10;
        }
        if (!lVar.f51342e.isEmpty()) {
            if (this.f51329f.isEmpty()) {
                this.f51329f = lVar.f51342e;
                this.f51327d &= -3;
            } else {
                if ((this.f51327d & 2) != 2) {
                    this.f51329f = new ArrayList(this.f51329f);
                    this.f51327d |= 2;
                }
                this.f51329f.addAll(lVar.f51342e);
            }
        }
        if (!lVar.f51343f.isEmpty()) {
            if (this.f51330g.isEmpty()) {
                this.f51330g = lVar.f51343f;
                this.f51327d &= -5;
            } else {
                if ((this.f51327d & 4) != 4) {
                    this.f51330g = new ArrayList(this.f51330g);
                    this.f51327d |= 4;
                }
                this.f51330g.addAll(lVar.f51343f);
            }
        }
        d(lVar);
        this.f55044a = this.f55044a.h(lVar.f51339b);
    }
}
