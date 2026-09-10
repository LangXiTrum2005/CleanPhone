package pm;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f48439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f48440d;

    public /* synthetic */ i0(Object obj, int i10) {
        this.f48439c = i10;
        this.f48440d = obj;
    }

    @Override // pm.t0
    public boolean a() {
        switch (this.f48439c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override // pm.t0
    public boolean e() {
        switch (this.f48439c) {
            case 1:
                return ((Map) this.f48440d).isEmpty();
            default:
                return super.e();
        }
    }

    @Override // pm.o0
    public final q0 g(n0 key) {
        switch (this.f48439c) {
            case 0:
                kotlin.jvm.internal.n.f(key, "key");
                if (!((ArrayList) this.f48440d).contains(key)) {
                    return null;
                }
                zk.g gVarE = key.e();
                kotlin.jvm.internal.n.d(gVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                return y0.j((zk.m0) gVarE);
            default:
                kotlin.jvm.internal.n.f(key, "key");
                return (q0) ((Map) this.f48440d).get(key);
        }
    }
}
