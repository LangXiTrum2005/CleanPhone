package yk;

import cl.e0;
import cl.f0;
import cl.t0;
import d5.u;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.v;
import qk.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends wk.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w[] f54472h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e0 f54473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final om.i f54474g;

    static {
        kotlin.jvm.internal.e0 e0Var = d0.f44761a;
        f54472h = new w[]{e0Var.g(new v(e0Var.b(i.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(om.l lVar) {
        super(lVar);
        u.n(1, "kind");
        this.f54474g = new om.i(lVar, new t0(17, this, lVar));
        int iC = v0.i.c(1);
        if (iC == 1) {
            c();
        } else {
            if (iC != 2) {
                return;
            }
            c();
        }
    }

    public final l J() {
        return (l) j1.f.w(this.f54474g, f54472h[0]);
    }

    @Override // wk.h
    public final bl.b d() {
        return J();
    }

    @Override // wk.h
    public final Iterable l() {
        Iterable iterableL = super.l();
        f0 builtInsModule = k();
        kotlin.jvm.internal.n.e(builtInsModule, "builtInsModule");
        return xj.n.A0(iterableL, new g(this.f53314d, builtInsModule));
    }

    @Override // wk.h
    public final bl.d p() {
        return J();
    }
}
