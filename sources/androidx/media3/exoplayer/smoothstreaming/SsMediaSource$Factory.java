package androidx.media3.exoplayer.smoothstreaming;

import d2.e;
import ea.f2;
import f2.a;
import f2.b0;
import i1.y;
import j2.n;
import java.util.List;
import n1.g;
import n5.f;
import oa.k0;
import t6.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class SsMediaSource$Factory implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f4659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f4660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ea.b0 f4661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0 f4662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ea.b0 f4663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4664f;

    public SsMediaSource$Factory(g gVar) {
        l lVar = new l(gVar);
        this.f4659a = lVar;
        this.f4660b = gVar;
        this.f4662d = new k0(16);
        this.f4663e = new ea.b0(29);
        this.f4664f = 30000L;
        this.f4661c = new ea.b0(12);
        lVar.f50549b = true;
    }

    @Override // f2.b0
    public final a a(y yVar) {
        yVar.f42714b.getClass();
        f fVar = new f(5);
        List list = yVar.f42714b.f42706c;
        return new e(yVar, this.f4660b, !list.isEmpty() ? new f2(fVar, false, list, 1) : fVar, this.f4659a, this.f4661c, this.f4662d.E(yVar), this.f4663e, this.f4664f);
    }

    @Override // f2.b0
    public final void b(n nVar) {
        this.f4659a.f50551d = nVar;
    }

    @Override // f2.b0
    public final void d(boolean z10) {
        this.f4659a.f50549b = z10;
    }
}
