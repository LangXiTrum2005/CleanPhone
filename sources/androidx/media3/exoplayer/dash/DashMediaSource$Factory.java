package androidx.media3.exoplayer.dash;

import b2.p;
import bc.i;
import ea.f2;
import f2.a;
import f2.b0;
import i1.y;
import j2.n;
import java.util.List;
import n1.g;
import oa.k0;
import s1.f;
import t1.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSource$Factory implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f4640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f4641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f4642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ea.b0 f4643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ea.b0 f4644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f4646g;

    public DashMediaSource$Factory(g gVar) {
        p pVar = new p(gVar);
        this.f4640a = pVar;
        this.f4641b = gVar;
        this.f4642c = new k0(16);
        this.f4644e = new ea.b0(29);
        this.f4645f = 30000L;
        this.f4646g = 5000000L;
        this.f4643d = new ea.b0(12);
        ((i) pVar.f5365d).f5552b = true;
    }

    @Override // f2.b0
    public final a a(y yVar) {
        yVar.f42714b.getClass();
        e eVar = new e();
        List list = yVar.f42714b.f42706c;
        return new f(yVar, this.f4641b, !list.isEmpty() ? new f2(eVar, false, list, 1) : eVar, this.f4640a, this.f4643d, this.f4642c.E(yVar), this.f4644e, this.f4645f, this.f4646g);
    }

    @Override // f2.b0
    public final void b(n nVar) {
        i iVar = (i) this.f4640a.f5365d;
        iVar.getClass();
        iVar.f5553c = nVar;
    }

    @Override // f2.b0
    public final void c() {
        ((i) this.f4640a.f5365d).getClass();
    }

    @Override // f2.b0
    public final void d(boolean z10) {
        ((i) this.f4640a.f5365d).f5552b = z10;
    }
}
