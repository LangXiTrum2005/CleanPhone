package zf;

import cg.l;
import cg.n;
import cg.p;
import cg.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vf.c f54939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wf.h f54940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f54941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f54942h;

    public e(vf.c cVar, wf.h hVar) {
        super("DecoderTimer");
        this.f54939e = cVar;
        this.f54940f = hVar;
        this.f54941g = Long.MIN_VALUE;
        this.f54942h = Long.MIN_VALUE;
    }

    @Override // cg.a
    public final p c(n state) {
        kotlin.jvm.internal.n.f(state, "state");
        Object obj = state.f6411a;
        if (state instanceof l) {
            return state;
        }
        if (obj instanceof f) {
            throw new IllegalArgumentException("Can't apply DecoderTimer twice.");
        }
        d dVar = (d) obj;
        long j10 = dVar.f54937b;
        long jB = this.f54940f.b(this.f54939e, j10);
        long j11 = this.f54941g;
        double d10 = j11 == Long.MIN_VALUE ? 1.0d : (jB - j11) / (j10 - this.f54942h);
        this.f54941g = jB;
        this.f54942h = j10;
        return new n(new f(dVar.f54936a, jB, d10, dVar.f54938c));
    }
}
