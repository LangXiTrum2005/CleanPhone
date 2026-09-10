package f2;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements n2.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f40439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f40440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2.j f40441c = new n2.j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f40442d = new AtomicReference(q0.f40435a);

    public r0(b1 b1Var) {
        this.f40439a = b1Var;
        this.f40440b = b1Var;
    }

    @Override // n2.a0
    public final void a(long j10, int i10, int i11, int i12, n2.z zVar) {
        h().a(j10, i10, i11, i12, zVar);
        AtomicReference atomicReference = this.f40442d;
        if (atomicReference.get() == q0.f40436b) {
            this.f40440b.E(false);
            atomicReference.set(q0.f40437c);
        }
    }

    @Override // n2.a0
    public final void b(i1.p pVar) {
        this.f40439a.b(pVar);
    }

    @Override // n2.a0
    public final int c(i1.i iVar, int i10, boolean z10) {
        return h().c(iVar, i10, z10);
    }

    @Override // n2.a0
    public final void d(l1.q qVar, int i10, int i11) {
        h().d(qVar, i10, i11);
    }

    @Override // n2.a0
    public final int f(i1.i iVar, int i10, boolean z10) {
        return h().f(iVar, i10, z10);
    }

    @Override // n2.a0
    public final void g(int i10, l1.q qVar) {
        h().g(i10, qVar);
    }

    public final n2.a0 h() {
        return this.f40442d.get() == q0.f40437c ? this.f40441c : this.f40440b;
    }

    @Override // n2.a0
    public final void e(long j10) {
    }
}
