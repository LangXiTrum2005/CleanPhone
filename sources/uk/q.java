package uk;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends p implements e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f52240g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Object obj, Method method) {
        super(method, false, 4);
        kotlin.jvm.internal.n.f(method, "method");
        this.f52240g = obj;
    }

    @Override // uk.p, uk.f
    public final Object call(Object[] args) {
        kotlin.jvm.internal.n.f(args, "args");
        com.google.android.gms.internal.auth.o.c(this, args);
        return e(this.f52240g, args);
    }
}
