package kotlin.jvm.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends s implements qk.l {
    public r(qk.d dVar, String str, String str2) {
        super(d.NO_RECEIVER, ((e) dVar).a(), str, str2, !Objects.nonNull(dVar) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.d
    public final qk.c computeReflected() {
        return d0.f44761a.e(this);
    }

    @Override // qk.t
    public final Object get(Object obj) {
        return ((tk.r) getGetter()).call(obj);
    }

    @Override // qk.t
    public final Object getDelegate(Object obj) {
        return ((qk.l) getReflected()).getDelegate(obj);
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // qk.w
    public final qk.s getGetter() {
        return ((qk.l) getReflected()).getGetter();
    }

    @Override // qk.m
    public final qk.k getSetter() {
        return ((qk.l) getReflected()).getSetter();
    }

    public r(Class cls, String str, String str2) {
        super(d.NO_RECEIVER, cls, str, str2, 0);
    }
}
