package f2;

import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f40304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f40306c;

    public c(d dVar, c1 c1Var) {
        this.f40306c = dVar;
        this.f40304a = c1Var;
    }

    @Override // f2.c1
    public final int h(s1 s1Var, o1.d dVar, int i10) {
        d dVar2 = this.f40306c;
        if (dVar2.b()) {
            return -3;
        }
        if (this.f40305b) {
            dVar.f22444b = 4;
            return -4;
        }
        long bufferedPositionUs = dVar2.getBufferedPositionUs();
        int iH = this.f40304a.h(s1Var, dVar, i10);
        if (iH != -5) {
            long j10 = dVar2.f40318g;
            if (j10 == Long.MIN_VALUE || ((iH != -4 || dVar.f47037g < j10) && !(iH == -3 && bufferedPositionUs == Long.MIN_VALUE && !dVar.f47036f))) {
                return iH;
            }
            dVar.g();
            dVar.f22444b = 4;
            this.f40305b = true;
            return -4;
        }
        i1.p pVar = (i1.p) s1Var.f45752c;
        pVar.getClass();
        int i11 = pVar.J;
        int i12 = pVar.I;
        if (i12 == 0 && i11 == 0) {
            return -5;
        }
        if (dVar2.f40317f != 0) {
            i12 = 0;
        }
        if (dVar2.f40318g != Long.MIN_VALUE) {
            i11 = 0;
        }
        i1.o oVarA = pVar.a();
        oVarA.H = i12;
        oVarA.I = i11;
        s1Var.f45752c = new i1.p(oVarA);
        return -5;
    }

    @Override // f2.c1
    public final boolean isReady() {
        return !this.f40306c.b() && this.f40304a.isReady();
    }

    @Override // f2.c1
    public final void maybeThrowError() {
        this.f40304a.maybeThrowError();
    }

    @Override // f2.c1
    public final int skipData(long j10) {
        if (this.f40306c.b()) {
            return -3;
        }
        return this.f40304a.skipData(j10);
    }
}
