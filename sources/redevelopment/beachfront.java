package redevelopment;

import java.util.List;

/* JADX INFO: compiled from: IntegerKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront extends competently<Integer> {
    public beachfront(List<com.airbnb.lottie.value.attabal<Integer>> list) {
        super(list);
    }

    @Override // redevelopment.attabal
    /* JADX INFO: renamed from: molybdenite, reason: merged with bridge method [inline-methods] */
    public Integer taiyuan(com.airbnb.lottie.value.attabal<Integer> attabalVar, float f) {
        return Integer.valueOf(polloi(attabalVar, f));
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
    public int polloi(com.airbnb.lottie.value.attabal<Integer> attabalVar, float f) {
        float f2;
        if (attabalVar.f16256saneness == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iImpromptu = attabalVar.f16250dern == null ? attabalVar.impromptu() : attabalVar.marial();
        com.airbnb.lottie.value.dern<A> dernVar = this.f36091marial;
        if (dernVar != 0) {
            f2 = f;
            Integer num = (Integer) dernVar.saneness(attabalVar.f16248competently, attabalVar.f16253impromptu.floatValue(), attabalVar.f16256saneness, Integer.valueOf(iImpromptu), f2, marial(), beachfront());
            if (num != null) {
                return num.intValue();
            }
        } else {
            f2 = f;
        }
        return utwa.apical.cutely(attabalVar.impromptu(), iImpromptu, f2);
    }
}
