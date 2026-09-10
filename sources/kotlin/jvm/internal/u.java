package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u extends x implements qk.t {
    @Override // kotlin.jvm.internal.d
    public qk.c computeReflected() {
        return d0.f44761a.g(this);
    }

    @Override // qk.t
    public Object getDelegate(Object obj) {
        return ((qk.t) getReflected()).getDelegate(obj);
    }

    @Override // jk.b
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // qk.w
    public qk.s getGetter() {
        return ((qk.t) getReflected()).getGetter();
    }
}
