package uk;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f52242g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Method method, boolean z10, int i10, int i11) {
        super(method, z10, i10);
        this.f52242g = i11;
    }

    @Override // uk.p, uk.f
    public final Object call(Object[] args) {
        switch (this.f52242g) {
            case 0:
                kotlin.jvm.internal.n.f(args, "args");
                com.google.android.gms.internal.auth.o.c(this, args);
                return e(args[0], args.length <= 1 ? new Object[0] : xj.k.j0(1, args.length, args));
            case 1:
                kotlin.jvm.internal.n.f(args, "args");
                com.google.android.gms.internal.auth.o.c(this, args);
                d(xj.k.p0(args));
                return e(null, args.length <= 1 ? new Object[0] : xj.k.j0(1, args.length, args));
            default:
                kotlin.jvm.internal.n.f(args, "args");
                com.google.android.gms.internal.auth.o.c(this, args);
                return e(null, args);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Method method) {
        super(method, false, 6);
        this.f52242g = 0;
        kotlin.jvm.internal.n.f(method, "method");
    }
}
