package redevelopment;

import java.util.List;

/* JADX INFO: compiled from: FloatKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman extends competently<Float> {
    public wireman(List<com.airbnb.lottie.value.attabal<Float>> list) {
        super(list);
    }

    @Override // redevelopment.attabal
    /* JADX INFO: renamed from: graveside, reason: merged with bridge method [inline-methods] */
    public Float taiyuan(com.airbnb.lottie.value.attabal<Float> attabalVar, float f) {
        return Float.valueOf(molybdenite(attabalVar, f));
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
    public float molybdenite(com.airbnb.lottie.value.attabal<Float> attabalVar, float f) {
        float f2;
        if (attabalVar.f16256saneness == null || attabalVar.f16250dern == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.value.dern<A> dernVar = this.f36091marial;
        if (dernVar != 0) {
            f2 = f;
            Float f3 = (Float) dernVar.saneness(attabalVar.f16248competently, attabalVar.f16253impromptu.floatValue(), attabalVar.f16256saneness, attabalVar.f16250dern, f2, marial(), beachfront());
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        return utwa.apical.taiyuan(attabalVar.competently(), attabalVar.wireman(), f2);
    }

    public float polloi() {
        return molybdenite(saneness(), wireman());
    }
}
