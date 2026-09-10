package redevelopment;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: compiled from: ColorKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness extends competently<Integer> {
    public saneness(List<com.airbnb.lottie.value.attabal<Integer>> list) {
        super(list);
    }

    @Override // redevelopment.attabal
    /* JADX INFO: renamed from: graveside, reason: merged with bridge method [inline-methods] */
    public Integer taiyuan(com.airbnb.lottie.value.attabal<Integer> attabalVar, float f) {
        return Integer.valueOf(molybdenite(attabalVar, f));
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
    public int molybdenite(com.airbnb.lottie.value.attabal<Integer> attabalVar, float f) {
        float f2;
        Float f3;
        if (attabalVar.f16256saneness == null || attabalVar.f16250dern == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.value.dern<A> dernVar = this.f36091marial;
        if (dernVar == 0 || (f3 = attabalVar.f16253impromptu) == null) {
            f2 = f;
        } else {
            f2 = f;
            Integer num = (Integer) dernVar.saneness(attabalVar.f16248competently, f3.floatValue(), attabalVar.f16256saneness, attabalVar.f16250dern, f2, marial(), beachfront());
            if (num != null) {
                return num.intValue();
            }
        }
        return utwa.wireman.dern(utwa.apical.saneness(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), attabalVar.f16256saneness.intValue(), attabalVar.f16250dern.intValue());
    }

    public int polloi() {
        return molybdenite(saneness(), wireman());
    }
}
