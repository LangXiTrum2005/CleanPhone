package ag;

import cg.l;
import cg.n;
import cg.p;
import cg.q;
import wf.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vf.c f3569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f3570f;

    public e(vf.c cVar, h hVar) {
        super("ReaderTimer");
        this.f3569e = cVar;
        this.f3570f = hVar;
    }

    @Override // cg.a
    public final p c(n state) {
        kotlin.jvm.internal.n.f(state, "state");
        if (state instanceof l) {
            return state;
        }
        f2.e eVar = ((d) state.f6411a).f3567a;
        eVar.f40321b = this.f3570f.b(this.f3569e, eVar.f40321b);
        return state;
    }
}
