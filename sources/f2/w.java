package f2;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f40499e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f40500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f40501d;

    public w(i1.p0 p0Var, Object obj, Object obj2) {
        super(p0Var);
        this.f40500c = obj;
        this.f40501d = obj2;
    }

    @Override // f2.s, i1.p0
    public final int b(Object obj) {
        Object obj2;
        if (f40499e.equals(obj) && (obj2 = this.f40501d) != null) {
            obj = obj2;
        }
        return this.f40443b.b(obj);
    }

    @Override // f2.s, i1.p0
    public final i1.n0 f(int i10, i1.n0 n0Var, boolean z10) {
        this.f40443b.f(i10, n0Var, z10);
        if (Objects.equals(n0Var.f42583b, this.f40501d) && z10) {
            n0Var.f42583b = f40499e;
        }
        return n0Var;
    }

    @Override // f2.s, i1.p0
    public final Object l(int i10) {
        Object objL = this.f40443b.l(i10);
        return Objects.equals(objL, this.f40501d) ? f40499e : objL;
    }

    @Override // f2.s, i1.p0
    public final i1.o0 m(int i10, i1.o0 o0Var, long j10) {
        this.f40443b.m(i10, o0Var, j10);
        if (Objects.equals(o0Var.f42616a, this.f40500c)) {
            o0Var.f42616a = i1.o0.f42614q;
        }
        return o0Var;
    }
}
