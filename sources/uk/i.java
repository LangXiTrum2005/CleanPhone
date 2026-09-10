package uk;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends l implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f52234e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Field field, Object obj) {
        super(field, false);
        kotlin.jvm.internal.n.f(field, "field");
        this.f52234e = obj;
    }

    @Override // uk.l, uk.f
    public final Object call(Object[] args) {
        kotlin.jvm.internal.n.f(args, "args");
        com.google.android.gms.internal.auth.o.c(this, args);
        return ((Field) this.f52243a).get(this.f52234e);
    }
}
