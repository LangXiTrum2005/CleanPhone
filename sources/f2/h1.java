package f2;

import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f40365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40366b;

    public h1(c1 c1Var, long j10) {
        this.f40365a = c1Var;
        this.f40366b = j10;
    }

    @Override // f2.c1
    public final int h(s1 s1Var, o1.d dVar, int i10) {
        int iH = this.f40365a.h(s1Var, dVar, i10);
        if (iH == -4) {
            dVar.f47037g += this.f40366b;
        }
        return iH;
    }

    @Override // f2.c1
    public final boolean isReady() {
        return this.f40365a.isReady();
    }

    @Override // f2.c1
    public final void maybeThrowError() {
        this.f40365a.maybeThrowError();
    }

    @Override // f2.c1
    public final int skipData(long j10) {
        return this.f40365a.skipData(j10 - this.f40366b);
    }
}
