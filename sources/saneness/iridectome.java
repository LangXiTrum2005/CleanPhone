package saneness;

import ads_mobile_sdk.j;
import ads_mobile_sdk.m53;
import ads_mobile_sdk.n53;

/* JADX INFO: loaded from: classes.dex */
public final class iridectome implements salmi {
    public final void attabal(Object obj, long j) {
        j jVar = (j) ((prescient) n53.c.g(obj, j));
        if (jVar.a) {
            jVar.a = false;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final prescient saneness(Object obj, long j) {
        m53 m53Var = n53.c;
        prescient prescientVar = (prescient) m53Var.g(obj, j);
        if (((j) prescientVar).a) {
            return prescientVar;
        }
        int size = prescientVar.size();
        prescient prescientVarA = prescientVar.a(size == 0 ? 10 : size * 2);
        m53Var.a(j, obj, prescientVarA);
        return prescientVarA;
    }
}
