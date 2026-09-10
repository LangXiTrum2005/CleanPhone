package pm;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r extends a1 implements sm.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f48470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f48471c;

    public r(c0 lowerBound, c0 upperBound) {
        kotlin.jvm.internal.n.f(lowerBound, "lowerBound");
        kotlin.jvm.internal.n.f(upperBound, "upperBound");
        this.f48470b = lowerBound;
        this.f48471c = upperBound;
    }

    @Override // pm.y
    public im.n A() {
        return z0().A();
    }

    public abstract String A0(am.h hVar, am.h hVar2);

    @Override // pm.y
    public final j0 M() {
        return z0().M();
    }

    @Override // pm.y
    public final n0 P() {
        return z0().P();
    }

    @Override // pm.y
    public final boolean Q() {
        return z0().Q();
    }

    @Override // pm.y
    public final List t() {
        return z0().t();
    }

    public String toString() {
        return am.h.f3708e.Y(this);
    }

    public abstract c0 z0();
}
