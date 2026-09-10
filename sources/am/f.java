package am;

import java.io.IOException;
import pm.q0;
import pm.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f3700f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, int i10) {
        super(1);
        this.f3699e = i10;
        this.f3700f = hVar;
    }

    @Override // jk.b
    public final Object invoke(Object obj) throws IOException {
        switch (this.f3699e) {
            case 0:
                q0 it = (q0) obj;
                kotlin.jvm.internal.n.f(it, "it");
                if (it.c()) {
                    return "*";
                }
                y yVarB = it.b();
                kotlin.jvm.internal.n.e(yVarB, "it.type");
                String strY = this.f3700f.Y(yVarB);
                if (it.a() == 1) {
                    return strY;
                }
                return l1.d.v(it.a()) + ' ' + strY;
            case 1:
                dm.g it2 = (dm.g) obj;
                kotlin.jvm.internal.n.f(it2, "it");
                return this.f3700f.B(it2);
            default:
                y it3 = (y) obj;
                kotlin.jvm.internal.n.e(it3, "it");
                return this.f3700f.Y(it3);
        }
    }
}
