package uk;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends p implements e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f52241g;

    /* JADX WARN: Illegal instructions before constructor call */
    public s(Object obj, Method method) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        kotlin.jvm.internal.n.e(genericParameterTypes, "method.genericParameterTypes");
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : xj.k.j0(1, genericParameterTypes.length, genericParameterTypes)));
        this.f52241g = obj;
    }

    @Override // uk.p, uk.f
    public final Object call(Object[] args) {
        kotlin.jvm.internal.n.f(args, "args");
        com.google.android.gms.internal.auth.o.c(this, args);
        h2.d dVar = new h2.d(2);
        dVar.f(this.f52241g);
        dVar.h(args);
        ArrayList arrayList = dVar.f42079a;
        return e(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
