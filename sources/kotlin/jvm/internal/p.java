package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends s implements qk.j {
    @Override // kotlin.jvm.internal.d
    public qk.c computeReflected() {
        return d0.f44761a.d(this);
    }

    @Override // qk.r
    public Object getDelegate() {
        return ((qk.j) getReflected()).getDelegate();
    }

    @Override // jk.a
    public Object invoke() {
        return get();
    }

    @Override // qk.w
    public qk.q getGetter() {
        return ((qk.j) getReflected()).getGetter();
    }

    @Override // qk.m
    public qk.i getSetter() {
        return ((qk.j) getReflected()).getSetter();
    }
}
