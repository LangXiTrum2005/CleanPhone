package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
final class SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2 extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {
    public static final SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2 X = new SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
        Intrinsics.f(it, "it");
        int i2 = BuiltinMethodsWithDifferentJvmName.f43731l;
        final SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) it;
        return Boolean.valueOf(KotlinBuiltIns.y(simpleFunctionDescriptor) && DescriptorUtilsKt.b(simpleFunctionDescriptor, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName$isBuiltinFunctionWithDifferentNameInJvm$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CallableMemberDescriptor it2 = (CallableMemberDescriptor) obj2;
                Intrinsics.f(it2, "it");
                return Boolean.valueOf(SpecialGenericSignatures.f43794i.containsKey(MethodSignatureMappingKt.b(simpleFunctionDescriptor)));
            }
        }) != null);
    }
}
