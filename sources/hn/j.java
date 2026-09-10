package hn;

import kotlin.jvm.internal.d0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.x implements qk.r {
    @Override // kotlin.jvm.internal.d
    public final qk.c computeReflected() {
        return d0.f44761a.f(this);
    }

    @Override // qk.r
    public final Object get() {
        return this.receiver.getClass().getSimpleName();
    }

    @Override // jk.a
    public final Object invoke() {
        return get();
    }

    @Override // qk.w
    public final qk.q getGetter() {
        return ((qk.r) getReflected()).getGetter();
    }
}
