package b2;

import android.os.Handler;
import com.google.android.gms.internal.ads.q2;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements j2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f5253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4.a f5254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final eb.d0 f5255d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f5257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f5258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f5259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n2.h f5260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f5261j;
    public volatile long l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f5256e = l1.y.q(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile long f5262k = C.TIME_UNSET;

    public f(int i10, c0 c0Var, a4.a aVar, eb.d0 d0Var, d dVar) {
        this.f5252a = i10;
        this.f5253b = c0Var;
        this.f5254c = aVar;
        this.f5255d = d0Var;
        this.f5257f = dVar;
    }

    @Override // j2.j
    public final void cancelLoad() {
        this.f5261j = true;
    }

    @Override // j2.j
    public final void load() {
        if (this.f5261j) {
            this.f5261j = false;
        }
        try {
            if (this.f5258g == null) {
                e eVarB = this.f5257f.b(this.f5252a);
                this.f5258g = eVarB;
                this.f5256e.post(new androidx.fragment.app.d(this, eVarB.a(), this.f5258g, 2));
                e eVar = this.f5258g;
                eVar.getClass();
                this.f5260i = new n2.h(eVar, 0L, -1L);
                g gVar = new g(this.f5253b.f5242a, this.f5252a);
                this.f5259h = gVar;
                gVar.c(this.f5255d);
            }
            while (!this.f5261j) {
                if (this.f5262k != C.TIME_UNSET) {
                    g gVar2 = this.f5259h;
                    gVar2.getClass();
                    gVar2.seek(this.l, this.f5262k);
                    this.f5262k = C.TIME_UNSET;
                }
                g gVar3 = this.f5259h;
                gVar3.getClass();
                n2.h hVar = this.f5260i;
                hVar.getClass();
                if (gVar3.b(hVar, new q2()) == -1) {
                    break;
                }
            }
            this.f5261j = false;
        } finally {
            e eVar2 = this.f5258g;
            eVar2.getClass();
            if (eVar2.r()) {
                com.google.android.gms.internal.auth.i.e(this.f5258g);
                this.f5258g = null;
            }
        }
    }
}
