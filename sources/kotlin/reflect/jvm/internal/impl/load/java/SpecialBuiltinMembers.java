package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure;

/* JADX INFO: loaded from: classes7.dex */
public final class SpecialBuiltinMembers {
    public static final String a(FunctionDescriptor functionDescriptor) {
        CallableMemberDescriptor callableMemberDescriptorB = KotlinBuiltIns.y(functionDescriptor) ? b(functionDescriptor) : null;
        if (callableMemberDescriptorB != null) {
            CallableMemberDescriptor callableMemberDescriptorL = DescriptorUtilsKt.l(callableMemberDescriptorB);
            if (callableMemberDescriptorL instanceof PropertyDescriptor) {
                return ClassicBuiltinSpecialProperties.a(callableMemberDescriptorL);
            }
            if (callableMemberDescriptorL instanceof SimpleFunctionDescriptor) {
                int i2 = BuiltinMethodsWithDifferentJvmName.f43731l;
                LinkedHashMap linkedHashMap = SpecialGenericSignatures.f43794i;
                String strB = MethodSignatureMappingKt.b((SimpleFunctionDescriptor) callableMemberDescriptorL);
                Name name = strB == null ? null : (Name) linkedHashMap.get(strB);
                if (name != null) {
                    return name.b();
                }
            }
        }
        return null;
    }

    public static final CallableMemberDescriptor b(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.f(callableMemberDescriptor, "<this>");
        if (!SpecialGenericSignatures.j.contains(callableMemberDescriptor.getName()) && !BuiltinSpecialProperties.d.contains(DescriptorUtilsKt.l(callableMemberDescriptor).getName())) {
            return null;
        }
        if (callableMemberDescriptor instanceof PropertyDescriptor ? true : callableMemberDescriptor instanceof PropertyAccessorDescriptor) {
            return DescriptorUtilsKt.b(callableMemberDescriptor, SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1.X);
        }
        if (callableMemberDescriptor instanceof SimpleFunctionDescriptor) {
            return DescriptorUtilsKt.b(callableMemberDescriptor, SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2.X);
        }
        return null;
    }

    public static final CallableMemberDescriptor c(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.f(callableMemberDescriptor, "<this>");
        CallableMemberDescriptor callableMemberDescriptorB = b(callableMemberDescriptor);
        if (callableMemberDescriptorB != null) {
            return callableMemberDescriptorB;
        }
        int i2 = BuiltinMethodsWithSpecialGenericSignature.f43732l;
        Name name = callableMemberDescriptor.getName();
        Intrinsics.e(name, "name");
        if (BuiltinMethodsWithSpecialGenericSignature.b(name)) {
            return DescriptorUtilsKt.b(callableMemberDescriptor, SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2.X);
        }
        return null;
    }

    public static final boolean d(ClassDescriptor classDescriptor, CallableMemberDescriptor specialCallableDescriptor) {
        Intrinsics.f(classDescriptor, "<this>");
        Intrinsics.f(specialCallableDescriptor, "specialCallableDescriptor");
        DeclarationDescriptor declarationDescriptorD = specialCallableDescriptor.d();
        Intrinsics.d(declarationDescriptorD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        SimpleType simpleTypeO = ((ClassDescriptor) declarationDescriptorD).o();
        Intrinsics.e(simpleTypeO, "specialCallableDescripto…ssDescriptor).defaultType");
        for (ClassDescriptor classDescriptorJ = DescriptorUtils.j(classDescriptor); classDescriptorJ != null; classDescriptorJ = DescriptorUtils.j(classDescriptorJ)) {
            if (!(classDescriptorJ instanceof JavaClassDescriptor) && TypeCheckingProcedure.a(classDescriptorJ.o(), simpleTypeO) != null) {
                return !KotlinBuiltIns.y(classDescriptorJ);
            }
        }
        return false;
    }
}
