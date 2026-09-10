package jn;

import cn.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f44031b = new l();

    @Override // cn.w
    public final void p(ak.k kVar, Runnable runnable) {
        e.f44019c.f44021b.h(runnable, true, false);
    }

    @Override // cn.w
    public final void q(ak.k kVar, Runnable runnable) {
        e.f44019c.f44021b.h(runnable, true, true);
    }

    @Override // cn.w
    public final w s(int i10) {
        hn.b.a(i10);
        return i10 >= k.f44028d ? this : super.s(i10);
    }

    @Override // cn.w
    public final String toString() {
        return "Dispatchers.IO";
    }
}
