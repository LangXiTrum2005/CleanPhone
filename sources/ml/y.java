package ml;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f46251f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(a0 a0Var, int i10) {
        super(0);
        this.f46250e = i10;
        this.f46251f = a0Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // jk.a
    public final Object invoke() {
        switch (this.f46250e) {
            case 0:
                im.f kindFilter = im.f.f43167m;
                im.n.f43191a.getClass();
                im.k kVar = im.k.f43184f;
                kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
                List list = kindFilter.f43174a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                boolean zA = kindFilter.a(im.f.l);
                a0 a0Var = this.f46251f;
                hl.b bVar = hl.b.f42408d;
                if (zA) {
                    for (yl.f fVar : a0Var.h(kindFilter, kVar)) {
                        kVar.invoke(fVar);
                        ym.l.a(linkedHashSet, a0Var.c(fVar, bVar));
                    }
                }
                if (kindFilter.a(im.f.f43164i) && !list.contains(im.b.f43153a)) {
                    for (yl.f fVar2 : a0Var.i(kindFilter, kVar)) {
                        kVar.invoke(fVar2);
                        linkedHashSet.addAll(a0Var.a(fVar2, bVar));
                    }
                }
                if (kindFilter.a(im.f.f43165j) && !list.contains(im.b.f43153a)) {
                    for (yl.f fVar3 : a0Var.o(kindFilter)) {
                        kVar.invoke(fVar3);
                        linkedHashSet.addAll(a0Var.f(fVar3, bVar));
                    }
                }
                return xj.n.N0(linkedHashSet);
            case 1:
                return this.f46251f.h(im.f.f43169o, null);
            case 2:
                return this.f46251f.k();
            case 3:
                return this.f46251f.i(im.f.f43170p, null);
            case 4:
                return this.f46251f.o(im.f.f43171q);
            default:
                ((ll.a) this.f46251f.f46151b.f23782b).f45492h.getClass();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, fl.t tVar, kl.f fVar) {
        super(0);
        this.f46250e = 5;
        this.f46251f = a0Var;
    }
}
