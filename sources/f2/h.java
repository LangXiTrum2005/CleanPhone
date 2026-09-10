package f2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends m1 {
    public final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f40356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f40357n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i1.o0 f40358o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f40359p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g f40360q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f40361r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f40362s;

    public h(e eVar) {
        super((a) eVar.f40323d);
        this.l = eVar.f40321b;
        this.f40356m = eVar.f40320a;
        this.f40357n = new ArrayList();
        this.f40358o = new i1.o0();
    }

    @Override // f2.m1
    public final void D(i1.p0 p0Var) {
        if (this.f40360q != null) {
            return;
        }
        G(p0Var);
    }

    public final void G(i1.p0 p0Var) {
        long j10;
        i1.o0 o0Var = this.f40358o;
        p0Var.n(0, o0Var);
        long j11 = o0Var.f42630p;
        f fVar = this.f40359p;
        long j12 = this.l;
        ArrayList arrayList = this.f40357n;
        if (fVar == null || arrayList.isEmpty()) {
            this.f40361r = j11;
            this.f40362s = j12 != Long.MIN_VALUE ? j11 + j12 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j13 = this.f40361r;
                long j14 = this.f40362s;
                dVar.f40317f = j13;
                dVar.f40318g = j14;
            }
            j10 = 0;
        } else {
            j10 = this.f40361r - j11;
            j12 = j12 == Long.MIN_VALUE ? Long.MIN_VALUE : this.f40362s - j11;
        }
        try {
            f fVar2 = new f(p0Var, j10, j12);
            this.f40359p = fVar2;
            q(fVar2);
        } catch (g e10) {
            this.f40360q = e10;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).f40319h = this.f40360q;
            }
        }
    }

    @Override // f2.a
    public final a0 c(c0 c0Var, v9.e eVar, long j10) {
        d dVar = new d(this.f40407k.c(c0Var, eVar, j10), this.f40356m, this.f40361r, this.f40362s);
        this.f40357n.add(dVar);
        return dVar;
    }

    @Override // f2.l, f2.a
    public final void m() throws g {
        g gVar = this.f40360q;
        if (gVar != null) {
            throw gVar;
        }
        super.m();
    }

    @Override // f2.a
    public final void r(a0 a0Var) {
        ArrayList arrayList = this.f40357n;
        go.k.t(arrayList.remove(a0Var));
        this.f40407k.r(((d) a0Var).f40312a);
        if (arrayList.isEmpty()) {
            f fVar = this.f40359p;
            fVar.getClass();
            G(fVar.f40443b);
        }
    }

    @Override // f2.l, f2.a
    public final void t() {
        super.t();
        this.f40360q = null;
        this.f40359p = null;
    }
}
