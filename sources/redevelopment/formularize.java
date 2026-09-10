package redevelopment;

import java.util.List;

/* JADX INFO: compiled from: ScaleKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class formularize extends competently<com.airbnb.lottie.value.wireman> {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final com.airbnb.lottie.value.wireman f36115taiyuan;

    public formularize(List<com.airbnb.lottie.value.attabal<com.airbnb.lottie.value.wireman>> list) {
        super(list);
        this.f36115taiyuan = new com.airbnb.lottie.value.wireman();
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
    @Override // redevelopment.attabal
    /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.value.wireman taiyuan(com.airbnb.lottie.value.attabal<com.airbnb.lottie.value.wireman> attabalVar, float f) {
        com.airbnb.lottie.value.wireman wiremanVar;
        float f2;
        com.airbnb.lottie.value.wireman wiremanVar2 = attabalVar.f16256saneness;
        if (wiremanVar2 == null || (wiremanVar = attabalVar.f16250dern) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.value.wireman wiremanVar3 = wiremanVar2;
        com.airbnb.lottie.value.wireman wiremanVar4 = wiremanVar;
        com.airbnb.lottie.value.dern<A> dernVar = this.f36091marial;
        if (dernVar != 0) {
            f2 = f;
            com.airbnb.lottie.value.wireman wiremanVar5 = (com.airbnb.lottie.value.wireman) dernVar.saneness(attabalVar.f16248competently, attabalVar.f16253impromptu.floatValue(), wiremanVar3, wiremanVar4, f2, marial(), beachfront());
            if (wiremanVar5 != null) {
                return wiremanVar5;
            }
        } else {
            f2 = f;
        }
        this.f36115taiyuan.wireman(utwa.apical.taiyuan(wiremanVar3.saneness(), wiremanVar4.saneness(), f2), utwa.apical.taiyuan(wiremanVar3.dern(), wiremanVar4.dern(), f2));
        return this.f36115taiyuan;
    }
}
