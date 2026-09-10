package uk;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends y {
    @Override // uk.f
    public final Object call(Object[] args) {
        kotlin.jvm.internal.n.f(args, "args");
        com.google.android.gms.internal.auth.o.c(this, args);
        Object obj = args[0];
        Object[] objArrJ0 = args.length <= 1 ? new Object[0] : xj.k.j0(1, args.length, args);
        return this.f52251a.invoke(obj, Arrays.copyOf(objArrJ0, objArrJ0.length));
    }
}
