package yk;

import cl.f0;
import cl.t0;
import java.util.Collection;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.v;
import qk.i0;
import qk.w;
import xj.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements bl.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f54463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w[] f54464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final yl.c f54465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final yl.f f54466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final yl.b f54467h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f54468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk.b f54469b = f.f54461f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final om.i f54470c;

    static {
        e0 e0Var = d0.f44761a;
        f54464e = new w[]{e0Var.g(new v(e0Var.b(g.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        f54463d = new e();
        f54465f = wk.m.f53373k;
        yl.e eVar = wk.l.f53339c;
        yl.f fVarF = eVar.f();
        kotlin.jvm.internal.n.e(fVarF, "cloneable.shortName()");
        f54466g = fVarF;
        f54467h = yl.b.j(eVar.g());
    }

    public g(om.l lVar, f0 f0Var) {
        this.f54468a = f0Var;
        this.f54470c = new om.i(lVar, new t0(16, this, lVar));
    }

    @Override // bl.c
    public final Collection a(yl.c packageFqName) {
        kotlin.jvm.internal.n.f(packageFqName, "packageFqName");
        if (!packageFqName.equals(f54465f)) {
            return x.f53868a;
        }
        return i0.k0((cl.n) j1.f.w(this.f54470c, f54464e[0]));
    }

    @Override // bl.c
    public final zk.e b(yl.b classId) {
        kotlin.jvm.internal.n.f(classId, "classId");
        if (!classId.equals(f54467h)) {
            return null;
        }
        return (cl.n) j1.f.w(this.f54470c, f54464e[0]);
    }

    @Override // bl.c
    public final boolean c(yl.c packageFqName, yl.f name) {
        kotlin.jvm.internal.n.f(packageFqName, "packageFqName");
        kotlin.jvm.internal.n.f(name, "name");
        return name.equals(f54466g) && packageFqName.equals(f54465f);
    }
}
