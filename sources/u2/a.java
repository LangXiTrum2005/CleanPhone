package u2;

import androidx.recyclerview.widget.c;
import com.google.android.gms.internal.ads.q2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import i1.c0;
import i1.d0;
import i1.e0;
import l1.q;
import n2.a0;
import n2.h;
import n2.k;
import n2.l;
import n2.m;
import n2.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f51664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f51665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f51666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h3.k f51667e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f51670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51671i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f51663a = new q(16);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f51672j = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51668f = 0;

    @Override // n2.k
    public final boolean a(l lVar) {
        return r9.b.z((h) lVar, true);
    }

    @Override // n2.k
    public final int b(l lVar, q2 q2Var) throws e0 {
        while (true) {
            int i10 = this.f51668f;
            if (i10 == 0) {
                int i11 = this.f51671i;
                q qVar = this.f51663a;
                if (i11 == 0) {
                    if (!lVar.readFully(qVar.f44813a, 0, 8, true)) {
                        m mVar = this.f51664b;
                        mVar.getClass();
                        mVar.endTracks();
                        this.f51664b.u(new o(C.TIME_UNSET));
                        this.f51668f = 4;
                        return -1;
                    }
                    this.f51671i = 8;
                    qVar.M(0);
                    this.f51670h = qVar.B();
                    this.f51669g = qVar.m();
                }
                if (this.f51670h == 1) {
                    lVar.readFully(qVar.f44813a, 8, 8);
                    this.f51671i += 8;
                    this.f51670h = qVar.F();
                }
                if (this.f51669g == 1836086884) {
                    long position = lVar.getPosition();
                    this.f51672j = position;
                    long j10 = this.f51671i;
                    w2.b bVar = new w2.b(0L, position - j10, C.TIME_UNSET, position, this.f51670h - j10);
                    m mVar2 = this.f51664b;
                    mVar2.getClass();
                    a0 a0VarTrack = mVar2.track(1024, 4);
                    i1.o oVar = new i1.o();
                    oVar.l = d0.n("image/heic");
                    oVar.f42599k = new c0(bVar);
                    q4.a.o(oVar, a0VarTrack);
                    this.f51668f = 2;
                } else {
                    this.f51668f = 1;
                }
            } else if (i10 == 1) {
                lVar.skipFully((int) (this.f51670h - ((long) this.f51671i)));
                this.f51671i = 0;
                this.f51668f = 0;
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return -1;
                        }
                        throw new IllegalStateException();
                    }
                    if (this.f51666d == null || lVar != this.f51665c) {
                        this.f51665c = lVar;
                        this.f51666d = new c(lVar, this.f51672j);
                    }
                    h3.k kVar = this.f51667e;
                    kVar.getClass();
                    int iB = kVar.b(this.f51666d, q2Var);
                    if (iB == 1) {
                        q2Var.f18888a += this.f51672j;
                    }
                    return iB;
                }
                if (this.f51667e == null) {
                    this.f51667e = new h3.k(k3.k.f44294p9, 8);
                }
                c cVar = new c(lVar, this.f51672j);
                this.f51666d = cVar;
                if (this.f51667e.a(cVar)) {
                    h3.k kVar2 = this.f51667e;
                    long j11 = this.f51672j;
                    m mVar3 = this.f51664b;
                    mVar3.getClass();
                    kVar2.c(new c(j11, mVar3, 10));
                    this.f51668f = 3;
                } else {
                    m mVar4 = this.f51664b;
                    mVar4.getClass();
                    mVar4.endTracks();
                    this.f51664b.u(new o(C.TIME_UNSET));
                    this.f51668f = 4;
                }
            }
        }
    }

    @Override // n2.k
    public final void c(m mVar) {
        this.f51664b = mVar;
    }

    @Override // n2.k
    public final void release() {
        h3.k kVar = this.f51667e;
        if (kVar != null) {
            kVar.getClass();
            this.f51667e = null;
        }
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        if (j10 != 0) {
            if (this.f51668f == 3) {
                h3.k kVar = this.f51667e;
                kVar.getClass();
                kVar.seek(j10, j11);
                return;
            }
            return;
        }
        this.f51668f = 0;
        this.f51671i = 0;
        this.f51672j = -1L;
        if (this.f51667e != null) {
            this.f51667e = null;
        }
    }
}
