package f2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f40403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa.j0 f40404b;

    public m(e1 e1Var, List list) {
        this.f40403a = e1Var;
        this.f40404b = oa.j0.x(list);
    }

    @Override // f2.e1
    public final boolean f(p1.k0 k0Var) {
        return this.f40403a.f(k0Var);
    }

    @Override // f2.e1
    public final long getBufferedPositionUs() {
        return this.f40403a.getBufferedPositionUs();
    }

    @Override // f2.e1
    public final long getNextLoadPositionUs() {
        return this.f40403a.getNextLoadPositionUs();
    }

    @Override // f2.e1
    public final boolean isLoading() {
        return this.f40403a.isLoading();
    }

    @Override // f2.e1
    public final void reevaluateBuffer(long j10) {
        this.f40403a.reevaluateBuffer(j10);
    }
}
