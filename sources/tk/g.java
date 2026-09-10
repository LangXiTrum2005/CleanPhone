package tk;

import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Constructor f50976b;

    public g(Constructor constructor) {
        kotlin.jvm.internal.n.f(constructor, "constructor");
        this.f50976b = constructor;
    }

    @Override // tk.q1
    public final String c() {
        Class<?>[] parameterTypes = this.f50976b.getParameterTypes();
        kotlin.jvm.internal.n.e(parameterTypes, "constructor.parameterTypes");
        return xj.k.v0(parameterTypes, "", "<init>(", ")V", b.f50948i, 24);
    }
}
