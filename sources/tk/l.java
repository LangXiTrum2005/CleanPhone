package tk;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f51006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f51007c;

    public l(Method getterMethod, Method method) {
        kotlin.jvm.internal.n.f(getterMethod, "getterMethod");
        this.f51006b = getterMethod;
        this.f51007c = method;
    }

    @Override // tk.q1
    public final String c() {
        return q1.b(this.f51006b);
    }
}
