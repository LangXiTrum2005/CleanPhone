package androidx.media3.exoplayer.hls;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import f2.b0;
import i1.y;
import j2.n;
import java.util.List;
import na.g;
import oa.k0;
import u1.h;
import ud.t;
import un.a;
import v1.c;
import v1.m;
import w1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource$Factory implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f4647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f4648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f4649c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k0 f4654h = new k0(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f4651e = new a(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f4652f = d.f52756o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ea.b0 f4655i = new ea.b0(29);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ea.b0 f4653g = new ea.b0(12);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4657k = 1;
    public final long l = C.TIME_UNSET;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f4656j = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4650d = true;

    public HlsMediaSource$Factory(n1.g gVar) {
        this.f4647a = new g(gVar, 20);
    }

    @Override // f2.b0
    public final f2.a a(y yVar) {
        yVar.f42714b.getClass();
        if (this.f4648b == null) {
            c cVar = new c();
            cVar.f52301a = new n(3);
            this.f4648b = cVar;
        }
        n nVar = this.f4649c;
        if (nVar != null) {
            this.f4648b.f52301a = nVar;
        }
        c cVar2 = this.f4648b;
        cVar2.f52302b = this.f4650d;
        List list = yVar.f42714b.f42706c;
        boolean zIsEmpty = list.isEmpty();
        w1.t cVar3 = this.f4651e;
        if (!zIsEmpty) {
            cVar3 = new v6.c(cVar3, list);
        }
        h hVarE = this.f4654h.E(yVar);
        this.f4652f.getClass();
        g gVar = this.f4647a;
        ea.b0 b0Var = this.f4655i;
        return new m(yVar, gVar, cVar2, this.f4653g, hVarE, b0Var, new d(gVar, b0Var, cVar3), this.l, this.f4656j, this.f4657k);
    }

    @Override // f2.b0
    public final void b(n nVar) {
        this.f4649c = nVar;
    }

    @Override // f2.b0
    public final void d(boolean z10) {
        this.f4650d = z10;
    }

    @Override // f2.b0
    public final void c() {
    }
}
