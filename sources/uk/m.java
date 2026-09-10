package uk;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends p implements e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f52236g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Field field, boolean z10, Object obj) {
        super(field, z10, false);
        kotlin.jvm.internal.n.f(field, "field");
        this.f52236g = obj;
    }

    @Override // uk.p, uk.f
    public final Object call(Object[] args) throws IllegalAccessException {
        kotlin.jvm.internal.n.f(args, "args");
        c(args);
        ((Field) this.f52243a).set(this.f52236g, xj.k.o0(args));
        return wj.r.f53297a;
    }
}
