package n2;

import com.google.android.gms.internal.ads.q2;
import i1.d0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f46500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a0 f46501g;

    public v(int i10, int i11, String str) {
        this.f46495a = i10;
        this.f46496b = i11;
        this.f46497c = str;
    }

    @Override // n2.k
    public final boolean a(l lVar) {
        int i10 = this.f46496b;
        int i11 = this.f46495a;
        go.k.t((i11 == -1 || i10 == -1) ? false : true);
        l1.q qVar = new l1.q(i10);
        ((h) lVar).peekFully(qVar.f44813a, 0, i10, false);
        return qVar.G() == i11;
    }

    @Override // n2.k
    public final int b(l lVar, q2 q2Var) {
        int i10 = this.f46499e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        a0 a0Var = this.f46501g;
        a0Var.getClass();
        int iC = a0Var.c(lVar, 1024, true);
        if (iC != -1) {
            this.f46498d += iC;
            return 0;
        }
        this.f46499e = 2;
        this.f46501g.a(0L, 1, this.f46498d, 0, null);
        this.f46498d = 0;
        return 0;
    }

    @Override // n2.k
    public final void c(m mVar) {
        this.f46500f = mVar;
        a0 a0VarTrack = mVar.track(1024, 4);
        this.f46501g = a0VarTrack;
        i1.o oVar = new i1.o();
        String str = this.f46497c;
        oVar.l = d0.n(str);
        oVar.f42600m = d0.n(str);
        q4.a.o(oVar, a0VarTrack);
        this.f46500f.endTracks();
        this.f46500f.u(new w());
        this.f46499e = 1;
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        if (j10 == 0 || this.f46499e == 1) {
            this.f46499e = 1;
            this.f46498d = 0;
        }
    }

    @Override // n2.k
    public final void release() {
    }
}
