package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
final class SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2 extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {
    public static final SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2 X = new SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2(1);

    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        CallableMemberDescriptor callableMemberDescriptorB;
        String strB;
        CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
        Intrinsics.f(it, "it");
        if (KotlinBuiltIns.y(it)) {
            int i2 = BuiltinMethodsWithSpecialGenericSignature.f43732l;
            SpecialGenericSignatures.SpecialSignatureInfo specialSignatureInfo = null;
            if (SpecialGenericSignatures.f43792e.contains(it.getName()) && (callableMemberDescriptorB = DescriptorUtilsKt.b(it, BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1.X)) != null && (strB = MethodSignatureMappingKt.b(callableMemberDescriptorB)) != null) {
                if (SpecialGenericSignatures.f43790b.contains(strB)) {
                    specialSignatureInfo = SpecialGenericSignatures.SpecialSignatureInfo.X;
                } else {
                    specialSignatureInfo = ((SpecialGenericSignatures.TypeSafeBarrierDescription) MapsKt.f(SpecialGenericSignatures.d, strB)) == SpecialGenericSignatures.TypeSafeBarrierDescription.f43798Y ? SpecialGenericSignatures.SpecialSignatureInfo.Z : SpecialGenericSignatures.SpecialSignatureInfo.f43797Y;
                }
            }
            if (specialSignatureInfo != null) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
