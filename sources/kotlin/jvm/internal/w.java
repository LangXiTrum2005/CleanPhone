package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends x implements qk.v {
    @Override // kotlin.jvm.internal.d
    public final qk.c computeReflected() {
        return d0.f44761a.h(this);
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        return ((tk.r) getGetter()).call(obj, obj2);
    }

    @Override // qk.w
    public final qk.u getGetter() {
        return ((qk.v) getReflected()).getGetter();
    }
}
