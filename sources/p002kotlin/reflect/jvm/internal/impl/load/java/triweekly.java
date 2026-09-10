package p002kotlin.reflect.jvm.internal.impl.load.java;

import byname.marial;
import java.util.List;
import methylmercury.dern;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.formularize;
import p002kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class triweekly implements ExternalOverridabilityCondition {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f30613attabal = new attabal(null);

    /* JADX INFO: compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean attabal(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal superDescriptor, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal subDescriptor) {
            Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
            Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof JavaMethodDescriptor) && (superDescriptor instanceof dovishness)) {
                JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
                javaMethodDescriptor.beachfront().size();
                dovishness dovishnessVar = (dovishness) superDescriptor;
                dovishnessVar.beachfront().size();
                List<cultivated> listBeachfront = javaMethodDescriptor.attabal().beachfront();
                Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
                List<cultivated> listBeachfront2 = dovishnessVar.attabal().beachfront();
                Intrinsics.checkNotNullExpressionValue(listBeachfront2, "getValueParameters(...)");
                for (Pair pair : CollectionsKt.fastrack(listBeachfront, listBeachfront2)) {
                    cultivated cultivatedVar = (cultivated) pair.component1();
                    cultivated cultivatedVar2 = (cultivated) pair.component2();
                    Intrinsics.beachfront(cultivatedVar);
                    boolean z = dern((dovishness) subDescriptor, cultivatedVar) instanceof formularize.wireman;
                    Intrinsics.beachfront(cultivatedVar2);
                    if (z != (dern(dovishnessVar, cultivatedVar2) instanceof formularize.wireman)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final formularize dern(dovishness dovishnessVar, cultivated cultivatedVar) {
            if (p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.marial(dovishnessVar) || saneness(dovishnessVar)) {
                oilcan type = cultivatedVar.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.competently(TypeUtilsKt.gintrap(type));
            }
            oilcan type2 = cultivatedVar.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            return p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.competently(type2);
        }

        public final boolean saneness(dovishness dovishnessVar) {
            if (dovishnessVar.beachfront().size() != 1) {
                return false;
            }
            apical apicalVarSaneness = dovishnessVar.saneness();
            wireman wiremanVar = apicalVarSaneness instanceof wireman ? (wireman) apicalVarSaneness : null;
            if (wiremanVar == null) {
                return false;
            }
            List<cultivated> listBeachfront = dovishnessVar.beachfront();
            Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
            beachfront beachfrontVarWireman = ((cultivated) CollectionsKt.herdbook(listBeachfront)).getType().setterwort().wireman();
            wireman wiremanVar2 = beachfrontVarWireman instanceof wireman ? (wireman) beachfrontVarWireman : null;
            return wiremanVar2 != null && p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.wostteth(wiremanVar) && Intrinsics.wireman(DescriptorUtilsKt.formularize(wiremanVar), DescriptorUtilsKt.formularize(wiremanVar2));
        }

        public attabal() {
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Contract attabal() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }

    public final boolean dern(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar2, wireman wiremanVar) {
        if ((attabalVar instanceof CallableMemberDescriptor) && (attabalVar2 instanceof dovishness) && !p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.coffeecake(attabalVar2)) {
            BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.f30284kowloon;
            dovishness dovishnessVar = (dovishness) attabalVar2;
            marial name = dovishnessVar.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!builtinMethodsWithSpecialGenericSignature.formularize(name)) {
                SpecialGenericSignatures.attabal attabalVar3 = SpecialGenericSignatures.f30303attabal;
                marial name2 = dovishnessVar.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (!attabalVar3.apical(name2)) {
                    return false;
                }
            }
            CallableMemberDescriptor callableMemberDescriptorMarial = SpecialBuiltinMembers.marial((CallableMemberDescriptor) attabalVar);
            boolean z = attabalVar instanceof dovishness;
            dovishness dovishnessVar2 = z ? (dovishness) attabalVar : null;
            if (!(dovishnessVar2 != null && dovishnessVar.julian() == dovishnessVar2.julian()) && (callableMemberDescriptorMarial == null || !dovishnessVar.julian())) {
                return true;
            }
            if ((wiremanVar instanceof dern) && dovishnessVar.sensatory() == null && callableMemberDescriptorMarial != null && !SpecialBuiltinMembers.beachfront(wiremanVar, callableMemberDescriptorMarial)) {
                if ((callableMemberDescriptorMarial instanceof dovishness) && z && BuiltinMethodsWithSpecialGenericSignature.apical((dovishness) callableMemberDescriptorMarial) != null) {
                    String strDern = p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.dern(dovishnessVar, false, false, 2, null);
                    dovishness dovishnessVarAttabal = ((dovishness) attabalVar).attabal();
                    Intrinsics.checkNotNullExpressionValue(dovishnessVarAttabal, "getOriginal(...)");
                    if (Intrinsics.wireman(strDern, p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.dern(dovishnessVarAttabal, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Result saneness(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal superDescriptor, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal subDescriptor, wireman wiremanVar) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if (dern(superDescriptor, subDescriptor, wiremanVar)) {
            return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        return f30613attabal.attabal(superDescriptor, subDescriptor) ? ExternalOverridabilityCondition.Result.INCOMPATIBLE : ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
