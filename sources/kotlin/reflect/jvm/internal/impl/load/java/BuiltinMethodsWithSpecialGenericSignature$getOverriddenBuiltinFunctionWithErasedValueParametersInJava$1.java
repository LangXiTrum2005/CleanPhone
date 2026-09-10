package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;

/* JADX INFO: loaded from: classes7.dex */
final class BuiltinMethodsWithSpecialGenericSignature$getOverriddenBuiltinFunctionWithErasedValueParametersInJava$1 extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {
    public static final BuiltinMethodsWithSpecialGenericSignature$getOverriddenBuiltinFunctionWithErasedValueParametersInJava$1 X = new BuiltinMethodsWithSpecialGenericSignature$getOverriddenBuiltinFunctionWithErasedValueParametersInJava$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
        Intrinsics.f(it, "it");
        int i2 = BuiltinMethodsWithSpecialGenericSignature.f43732l;
        return Boolean.valueOf(CollectionsKt.o(SpecialGenericSignatures.f, MethodSignatureMappingKt.b(it)));
    }
}
