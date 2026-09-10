package p002kotlin.reflect.jvm.internal.impl.load.java;

import methylmercury.dern;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.grimness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.marial;
import p002kotlin.reflect.jvm.internal.impl.types.checker.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.types.merc;

/* JADX INFO: compiled from: specialBuiltinMembers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SpecialBuiltinMembers {
    public static final boolean attabal(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        return wireman(callableMemberDescriptor) != null;
    }

    public static final boolean beachfront(wireman wiremanVar, attabal specialCallableDescriptor) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        Intrinsics.checkNotNullParameter(specialCallableDescriptor, "specialCallableDescriptor");
        apical apicalVarSaneness = specialCallableDescriptor.saneness();
        Intrinsics.competently(apicalVarSaneness, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        merc mercVarImpassible = ((wireman) apicalVarSaneness).impassible();
        Intrinsics.checkNotNullExpressionValue(mercVarImpassible, "getDefaultType(...)");
        for (wireman wiremanVarMolybdenite = marial.molybdenite(wiremanVar); wiremanVarMolybdenite != null; wiremanVarMolybdenite = marial.molybdenite(wiremanVarMolybdenite)) {
            if (!(wiremanVarMolybdenite instanceof dern) && molybdenite.saneness(wiremanVarMolybdenite.impassible(), mercVarImpassible) != null) {
                return !beachfront.coffeecake(wiremanVarMolybdenite);
            }
        }
        return false;
    }

    public static final boolean competently(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        return DescriptorUtilsKt.graveside(callableMemberDescriptor).saneness() instanceof dern;
    }

    public static final CallableMemberDescriptor dern(CallableMemberDescriptor callableMemberDescriptor) {
        if (beachfront.coffeecake(callableMemberDescriptor)) {
            return wireman(callableMemberDescriptor);
        }
        return null;
    }

    public static final boolean impromptu(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        return competently(callableMemberDescriptor) || beachfront.coffeecake(callableMemberDescriptor);
    }

    public static final <T extends CallableMemberDescriptor> T marial(T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        T t2 = (T) wireman(t);
        if (t2 != null) {
            return t2;
        }
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.f30284kowloon;
        byname.marial name = t.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (builtinMethodsWithSpecialGenericSignature.formularize(name)) {
            return (T) DescriptorUtilsKt.beachfront(t, false, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2
                @Override // p002kotlin.jvm.functions.Function1
                public final Boolean invoke(CallableMemberDescriptor it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(beachfront.coffeecake(it) && BuiltinMethodsWithSpecialGenericSignature.impassible(it) != null);
                }
            }, 1, null);
        }
        return null;
    }

    public static final String saneness(CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptorGraveside;
        byname.marial marialVarTaiyuan;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        CallableMemberDescriptor callableMemberDescriptorDern = dern(callableMemberDescriptor);
        if (callableMemberDescriptorDern != null && (callableMemberDescriptorGraveside = DescriptorUtilsKt.graveside(callableMemberDescriptorDern)) != null) {
            if (callableMemberDescriptorGraveside instanceof saran) {
                return ClassicBuiltinSpecialProperties.f30285attabal.attabal(callableMemberDescriptorGraveside);
            }
            if ((callableMemberDescriptorGraveside instanceof hydrovane) && (marialVarTaiyuan = BuiltinMethodsWithDifferentJvmName.f30283kowloon.taiyuan((hydrovane) callableMemberDescriptorGraveside)) != null) {
                return marialVarTaiyuan.dern();
            }
        }
        return null;
    }

    public static final <T extends CallableMemberDescriptor> T wireman(T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        if (!SpecialGenericSignatures.f30303attabal.competently().contains(t.getName()) && !dern.f30398attabal.wireman().contains(DescriptorUtilsKt.graveside(t).getName())) {
            return null;
        }
        if (t instanceof saran ? true : t instanceof grimness) {
            return (T) DescriptorUtilsKt.beachfront(t, false, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1
                @Override // p002kotlin.jvm.functions.Function1
                public final Boolean invoke(CallableMemberDescriptor it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(ClassicBuiltinSpecialProperties.f30285attabal.saneness(DescriptorUtilsKt.graveside(it)));
                }
            }, 1, null);
        }
        if (t instanceof hydrovane) {
            return (T) DescriptorUtilsKt.beachfront(t, false, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2
                @Override // p002kotlin.jvm.functions.Function1
                public final Boolean invoke(CallableMemberDescriptor it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(BuiltinMethodsWithDifferentJvmName.f30283kowloon.cutely((hydrovane) it));
                }
            }, 1, null);
        }
        return null;
    }
}
