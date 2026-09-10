package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;

/* JADX INFO: loaded from: classes7.dex */
final class BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1 extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {
    public static final BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1 X = new BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1(1);

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
        Intrinsics.f(it, "it");
        if (it instanceof FunctionDescriptor) {
            int i2 = BuiltinMethodsWithSpecialGenericSignature.f43732l;
            if (CollectionsKt.o(SpecialGenericSignatures.f, MethodSignatureMappingKt.b(it))) {
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
