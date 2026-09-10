package dl;

import kotlin.jvm.internal.n;
import yj.f;
import zk.u0;
import zk.v0;
import zk.w0;
import zk.z0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends n.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f38946d = new a("package", false);

    @Override // n.a
    public final Integer a(n.a visibility) {
        n.f(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        f fVar = z0.f55013a;
        return (visibility == u0.f55002d || visibility == v0.f55003d) ? 1 : -1;
    }

    @Override // n.a
    public final String e() {
        return "public/*package*/";
    }

    @Override // n.a
    public final n.a l() {
        return w0.f55004d;
    }
}
