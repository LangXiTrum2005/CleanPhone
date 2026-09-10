package f2;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends m1 {
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i1.o0 f40520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i1.n0 f40521n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f40522o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f40523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f40524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f40525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f40526s;

    public y(a aVar, boolean z10) {
        super(aVar);
        this.l = z10 && aVar.l();
        this.f40520m = new i1.o0();
        this.f40521n = new i1.n0();
        i1.p0 p0VarI = aVar.i();
        if (p0VarI == null) {
            this.f40522o = new w(new x(aVar.k()), i1.o0.f42614q, w.f40499e);
        } else {
            this.f40522o = new w(p0VarI, null, null);
            this.f40526s = true;
        }
    }

    @Override // f2.m1
    public final c0 C(c0 c0Var) {
        Object obj = c0Var.f40307a;
        Object obj2 = this.f40522o.f40501d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = w.f40499e;
        }
        return c0Var.a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // f2.m1
    public final void D(i1.p0 p0Var) {
        long j10;
        w wVar;
        c0 c0VarA;
        w wVar2;
        if (this.f40525r) {
            w wVar3 = this.f40522o;
            this.f40522o = new w(p0Var, wVar3.f40500c, wVar3.f40501d);
            v vVar = this.f40523p;
            if (vVar != null) {
                H(vVar.f40473g);
            }
        } else {
            if (!p0Var.p()) {
                i1.o0 o0Var = this.f40520m;
                p0Var.n(0, o0Var);
                long j11 = o0Var.l;
                Object obj = o0Var.f42616a;
                v vVar2 = this.f40523p;
                if (vVar2 != null) {
                    long j12 = vVar2.f40468b;
                    w wVar4 = this.f40522o;
                    Object obj2 = vVar2.f40467a.f40307a;
                    i1.n0 n0Var = this.f40521n;
                    wVar4.g(obj2, n0Var);
                    long j13 = n0Var.f42586e + j12;
                    this.f40522o.m(0, o0Var, 0L);
                    if (j13 != o0Var.l) {
                        j10 = j13;
                    } else {
                        j10 = j11;
                    }
                } else {
                    j10 = j11;
                }
                Pair pairI = p0Var.i(this.f40520m, this.f40521n, 0, j10);
                Object obj3 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                if (this.f40526s) {
                    w wVar5 = this.f40522o;
                    wVar = new w(p0Var, wVar5.f40500c, wVar5.f40501d);
                } else {
                    wVar = new w(p0Var, obj, obj3);
                }
                this.f40522o = wVar;
                v vVar3 = this.f40523p;
                if (vVar3 != null && H(jLongValue)) {
                    c0 c0Var = vVar3.f40467a;
                    Object obj4 = c0Var.f40307a;
                    if (this.f40522o.f40501d != null && obj4.equals(w.f40499e)) {
                        obj4 = this.f40522o.f40501d;
                    }
                    c0VarA = c0Var.a(obj4);
                }
                this.f40526s = true;
                this.f40525r = true;
                q(this.f40522o);
                if (c0VarA != null) {
                    v vVar4 = this.f40523p;
                    vVar4.getClass();
                    vVar4.b(c0VarA);
                }
            }
            if (this.f40526s) {
                w wVar6 = this.f40522o;
                wVar2 = new w(p0Var, wVar6.f40500c, wVar6.f40501d);
            } else {
                wVar2 = new w(p0Var, i1.o0.f42614q, w.f40499e);
            }
            this.f40522o = wVar2;
        }
        c0VarA = null;
        this.f40526s = true;
        this.f40525r = true;
        q(this.f40522o);
        if (c0VarA != null) {
            v vVar5 = this.f40523p;
            vVar5.getClass();
            vVar5.b(c0VarA);
        }
    }

    @Override // f2.m1
    public final void F() {
        if (this.l) {
            return;
        }
        this.f40524q = true;
        E();
    }

    @Override // f2.a
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final v c(c0 c0Var, v9.e eVar, long j10) {
        v vVar = new v(c0Var, eVar, j10);
        go.k.t(vVar.f40470d == null);
        vVar.f40470d = this.f40407k;
        if (!this.f40525r) {
            this.f40523p = vVar;
            if (!this.f40524q) {
                this.f40524q = true;
                E();
            }
            return vVar;
        }
        Object obj = c0Var.f40307a;
        if (this.f40522o.f40501d != null && obj.equals(w.f40499e)) {
            obj = this.f40522o.f40501d;
        }
        vVar.b(c0Var.a(obj));
        return vVar;
    }

    public final boolean H(long j10) {
        v vVar = this.f40523p;
        int iB = this.f40522o.b(vVar.f40467a.f40307a);
        if (iB == -1) {
            return false;
        }
        w wVar = this.f40522o;
        i1.n0 n0Var = this.f40521n;
        wVar.f(iB, n0Var, false);
        long j11 = n0Var.f42585d;
        if (j11 != C.TIME_UNSET && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        vVar.f40473g = j10;
        return true;
    }

    @Override // f2.a
    public final void r(a0 a0Var) {
        v vVar = (v) a0Var;
        if (vVar.f40471e != null) {
            a aVar = vVar.f40470d;
            aVar.getClass();
            aVar.r(vVar.f40471e);
        }
        if (a0Var == this.f40523p) {
            this.f40523p = null;
        }
    }

    @Override // f2.l, f2.a
    public final void t() {
        this.f40525r = false;
        this.f40524q = false;
        super.t();
    }

    @Override // f2.m1, f2.a
    public final void w(i1.y yVar) {
        if (this.f40526s) {
            w wVar = this.f40522o;
            i1.p0 p0Var = wVar.f40443b;
            this.f40522o = new w(p0Var instanceof j1 ? new j1(((j1) p0Var).f40443b, yVar) : new j1(p0Var, yVar), wVar.f40500c, wVar.f40501d);
        } else {
            this.f40522o = new w(new x(yVar), i1.o0.f42614q, w.f40499e);
        }
        this.f40407k.w(yVar);
    }
}
