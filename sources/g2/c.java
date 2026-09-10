package g2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import i1.p;
import l1.q;
import l1.y;
import n2.a0;
import n2.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f41348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2.j f41349c = new n2.j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f41350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f41351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f41352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f41353g;

    public c(int i10, int i11, p pVar, d dVar) {
        this.f41347a = i11;
        this.f41348b = pVar;
        this.f41350d = dVar;
    }

    @Override // n2.a0
    public final void a(long j10, int i10, int i11, int i12, z zVar) {
        long j11 = this.f41353g;
        if (j11 != C.TIME_UNSET && j10 >= j11) {
            this.f41352f = this.f41349c;
        }
        a0 a0Var = this.f41352f;
        String str = y.f44830a;
        a0Var.a(j10, i10, i11, i12, zVar);
    }

    @Override // n2.a0
    public final void b(p pVar) {
        this.f41350d.getClass();
        p pVar2 = this.f41348b;
        if (pVar2 != null) {
            pVar = pVar.d(pVar2);
        }
        this.f41351e = pVar;
        a0 a0Var = this.f41352f;
        String str = y.f44830a;
        a0Var.b(pVar);
    }

    @Override // n2.a0
    public final void d(q qVar, int i10, int i11) {
        a0 a0Var = this.f41352f;
        String str = y.f44830a;
        a0Var.g(i10, qVar);
    }

    @Override // n2.a0
    public final int f(i1.i iVar, int i10, boolean z10) {
        a0 a0Var = this.f41352f;
        String str = y.f44830a;
        return a0Var.c(iVar, i10, z10);
    }
}
