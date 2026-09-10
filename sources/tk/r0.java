package tk;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f51052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s0 f51053f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(s0 s0Var, int i10) {
        super(0);
        this.f51052e = i10;
        this.f51053f = s0Var;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f51052e) {
            case 0:
                return v1.d(this.f51053f.a());
            default:
                s0 s0Var = this.f51053f;
                zk.f0 f0VarA = s0Var.a();
                r rVar = s0Var.f51057a;
                if (!(f0VarA instanceof cl.z) || !kotlin.jvm.internal.n.a(v1.g(rVar.h()), f0VarA) || rVar.h().getKind() != 2) {
                    return (Type) rVar.c().a().get(s0Var.f51058b);
                }
                zk.j jVarE = rVar.h().e();
                kotlin.jvm.internal.n.d(jVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class clsJ = v1.j((zk.e) jVarE);
                if (clsJ != null) {
                    return clsJ;
                }
                throw new cn.c0("Cannot determine receiver Java type of inherited declaration: " + f0VarA, 3);
        }
    }
}
