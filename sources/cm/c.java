package cm;

import j1.f;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.n;
import pm.q0;
import pm.y;
import qm.i;
import wk.h;
import xj.v;
import zk.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f6666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f6667b;

    public c(q0 projection) {
        n.f(projection, "projection");
        this.f6666a = projection;
        projection.a();
    }

    @Override // cm.b
    public final q0 a() {
        return this.f6666a;
    }

    @Override // pm.n0
    public final h d() {
        h hVarD = this.f6666a.b().P().d();
        n.e(hVarD, "projection.type.constructor.builtIns");
        return hVarD;
    }

    @Override // pm.n0
    public final /* bridge */ /* synthetic */ g e() {
        return null;
    }

    @Override // pm.n0
    public final Collection f() {
        q0 q0Var = this.f6666a;
        y yVarB = q0Var.a() == 3 ? q0Var.b() : d().o();
        n.e(yVarB, "if (projection.projectio… builtIns.nullableAnyType");
        return f.C(yVarB);
    }

    @Override // pm.n0
    public final boolean g() {
        return false;
    }

    @Override // pm.n0
    public final List getParameters() {
        return v.f53866a;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f6666a + ')';
    }
}
