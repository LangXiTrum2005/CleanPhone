package qm;

import java.util.Collection;
import java.util.List;
import pm.q0;
import pm.y;
import qk.i0;
import xj.v;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements cm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f49183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jk.a f49184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f49185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0 f49186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f49187e;

    public i(q0 projection, jk.a aVar, i iVar, m0 m0Var) {
        kotlin.jvm.internal.n.f(projection, "projection");
        this.f49183a = projection;
        this.f49184b = aVar;
        this.f49185c = iVar;
        this.f49186d = m0Var;
        this.f49187e = r9.b.t(wj.e.f53280a, new al.l(this, 21));
    }

    @Override // cm.b
    public final q0 a() {
        return this.f49183a;
    }

    @Override // pm.n0
    public final wk.h d() {
        y yVarB = this.f49183a.b();
        kotlin.jvm.internal.n.e(yVarB, "projection.type");
        return i0.H(yVarB);
    }

    @Override // pm.n0
    public final zk.g e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        i iVar = (i) obj;
        i iVar2 = this.f49185c;
        if (iVar2 != null) {
            this = iVar2;
        }
        i iVar3 = iVar.f49185c;
        if (iVar3 != null) {
            iVar = iVar3;
        }
        return this == iVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // pm.n0
    public final Collection f() {
        Collection collection = (List) this.f49187e.getValue();
        if (collection == null) {
            collection = v.f53866a;
        }
        return collection;
    }

    @Override // pm.n0
    public final boolean g() {
        return false;
    }

    @Override // pm.n0
    public final List getParameters() {
        return v.f53866a;
    }

    public final int hashCode() {
        i iVar = this.f49185c;
        return iVar != null ? iVar.hashCode() : super.hashCode();
    }

    public final String toString() {
        return "CapturedType(" + this.f49183a + ')';
    }

    public /* synthetic */ i(q0 q0Var, nm.d dVar, m0 m0Var, int i10) {
        this(q0Var, (i10 & 2) != 0 ? null : dVar, (i) null, (i10 & 8) != 0 ? null : m0Var);
    }
}
