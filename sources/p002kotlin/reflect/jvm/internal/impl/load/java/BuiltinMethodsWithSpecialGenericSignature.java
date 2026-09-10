package p002kotlin.reflect.jvm.internal.impl.load.java;

import byname.marial;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: compiled from: specialBuiltinMembers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class BuiltinMethodsWithSpecialGenericSignature extends SpecialGenericSignatures {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final BuiltinMethodsWithSpecialGenericSignature f30284kowloon = new BuiltinMethodsWithSpecialGenericSignature();

    public static final dovishness apical(dovishness functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = f30284kowloon;
        marial name = functionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (builtinMethodsWithSpecialGenericSignature.formularize(name)) {
            return (dovishness) DescriptorUtilsKt.beachfront(functionDescriptor, false, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getOverriddenBuiltinFunctionWithErasedValueParametersInJava$1
                @Override // p002kotlin.jvm.functions.Function1
                public final Boolean invoke(CallableMemberDescriptor it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(BuiltinMethodsWithSpecialGenericSignature.f30284kowloon.cutely(it));
                }
            }, 1, null);
        }
        return null;
    }

    public static final SpecialGenericSignatures.SpecialSignatureInfo impassible(CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptorBeachfront;
        String strWireman;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        SpecialGenericSignatures.attabal attabalVar = SpecialGenericSignatures.f30303attabal;
        if (!attabalVar.wireman().contains(callableMemberDescriptor.getName()) || (callableMemberDescriptorBeachfront = DescriptorUtilsKt.beachfront(callableMemberDescriptor, false, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(CallableMemberDescriptor it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf((it instanceof dovishness) && BuiltinMethodsWithSpecialGenericSignature.f30284kowloon.cutely(it));
            }
        }, 1, null)) == null || (strWireman = p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.wireman(callableMemberDescriptorBeachfront)) == null) {
            return null;
        }
        return attabalVar.formularize(strWireman);
    }

    public final boolean cutely(CallableMemberDescriptor callableMemberDescriptor) {
        return CollectionsKt.permissivist(SpecialGenericSignatures.f30303attabal.marial(), p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.wireman(callableMemberDescriptor));
    }

    public final boolean formularize(marial marialVar) {
        Intrinsics.checkNotNullParameter(marialVar, "<this>");
        return SpecialGenericSignatures.f30303attabal.wireman().contains(marialVar);
    }
}
