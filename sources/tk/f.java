package tk;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f50972b;

    public f(Class jClass) {
        kotlin.jvm.internal.n.f(jClass, "jClass");
        Object[] declaredMethods = jClass.getDeclaredMethods();
        kotlin.jvm.internal.n.e(declaredMethods, "jClass.declaredMethods");
        ae.l lVar = new ae.l(10);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            kotlin.jvm.internal.n.e(declaredMethods, "copyOf(...)");
            if (declaredMethods.length > 1) {
                Arrays.sort(declaredMethods, lVar);
            }
        }
        this.f50972b = xj.k.a0(declaredMethods);
    }

    @Override // tk.q1
    public final String c() {
        return xj.n.u0(this.f50972b, "", "<init>(", ")V", b.f50947h, 24);
    }
}
