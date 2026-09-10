package pm;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f48418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f48419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final im.n f48421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jk.b f48422f;

    public d0(n0 constructor, List arguments, boolean z10, im.n memberScope, jk.b bVar) {
        kotlin.jvm.internal.n.f(constructor, "constructor");
        kotlin.jvm.internal.n.f(arguments, "arguments");
        kotlin.jvm.internal.n.f(memberScope, "memberScope");
        this.f48418b = constructor;
        this.f48419c = arguments;
        this.f48420d = z10;
        this.f48421e = memberScope;
        this.f48422f = bVar;
        if (!(memberScope instanceof rm.e) || (memberScope instanceof rm.j)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + constructor);
    }

    @Override // pm.y
    public final im.n A() {
        return this.f48421e;
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: A0 */
    public final c0 m0(j0 newAttributes) {
        kotlin.jvm.internal.n.f(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new e0(this, newAttributes);
    }

    @Override // pm.y
    public final j0 M() {
        j0.f48443b.getClass();
        return j0.f48444c;
    }

    @Override // pm.y
    public final n0 P() {
        return this.f48418b;
    }

    @Override // pm.y
    public final boolean Q() {
        return this.f48420d;
    }

    @Override // pm.y
    /* JADX INFO: renamed from: U */
    public final y j0(qm.f kotlinTypeRefiner) {
        kotlin.jvm.internal.n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        c0 c0Var = (c0) this.f48422f.invoke(kotlinTypeRefiner);
        return c0Var == null ? this : c0Var;
    }

    @Override // pm.a1
    public final a1 j0(qm.f kotlinTypeRefiner) {
        kotlin.jvm.internal.n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        c0 c0Var = (c0) this.f48422f.invoke(kotlinTypeRefiner);
        return c0Var == null ? this : c0Var;
    }

    @Override // pm.y
    public final List t() {
        return this.f48419c;
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: z0 */
    public final c0 i0(boolean z10) {
        if (z10 == this.f48420d) {
            return this;
        }
        return z10 ? new b0(this, 1) : new b0(this, 0);
    }
}
