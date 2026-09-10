package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaIncompatibilityRulesOverridabilityCondition implements ExternalOverridabilityCondition {

    public static final class Companion {
        public static boolean a(CallableDescriptor superDescriptor, CallableDescriptor subDescriptor) {
            Intrinsics.f(superDescriptor, "superDescriptor");
            Intrinsics.f(subDescriptor, "subDescriptor");
            if (!(subDescriptor instanceof JavaMethodDescriptor) || !(superDescriptor instanceof FunctionDescriptor)) {
                return false;
            }
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
            javaMethodDescriptor.e().size();
            FunctionDescriptor functionDescriptor = (FunctionDescriptor) superDescriptor;
            functionDescriptor.e().size();
            List listE = javaMethodDescriptor.y0().e();
            Intrinsics.e(listE, "subDescriptor.original.valueParameters");
            List listE2 = functionDescriptor.y0().e();
            Intrinsics.e(listE2, "superDescriptor.original.valueParameters");
            for (Pair pair : CollectionsKt.n0(listE, listE2)) {
                ValueParameterDescriptor subParameter = (ValueParameterDescriptor) pair.X;
                ValueParameterDescriptor superParameter = (ValueParameterDescriptor) pair.f43249Y;
                Intrinsics.e(subParameter, "subParameter");
                boolean z2 = b((FunctionDescriptor) subDescriptor, subParameter) instanceof JvmType.Primitive;
                Intrinsics.e(superParameter, "superParameter");
                if (z2 != (b(functionDescriptor, superParameter) instanceof JvmType.Primitive)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:37:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:45:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:47:0x0100  */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x010c, code lost:
        
            if (kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.g(r0).equals(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.g(r2)) != false) goto L49;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType b(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r6, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r7) {
            /*
                Method dump skipped, instruction units count: 298
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.Companion.b(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor):kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final ExternalOverridabilityCondition.Contract a() {
        return ExternalOverridabilityCondition.Contract.X;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final ExternalOverridabilityCondition.Result b(CallableDescriptor superDescriptor, CallableDescriptor subDescriptor, ClassDescriptor classDescriptor) {
        boolean z2;
        FunctionDescriptor functionDescriptor;
        Intrinsics.f(superDescriptor, "superDescriptor");
        Intrinsics.f(subDescriptor, "subDescriptor");
        boolean z3 = superDescriptor instanceof CallableMemberDescriptor;
        ExternalOverridabilityCondition.Result result = ExternalOverridabilityCondition.Result.f44282Y;
        if (z3 && (subDescriptor instanceof FunctionDescriptor) && !KotlinBuiltIns.y(subDescriptor)) {
            int i2 = BuiltinMethodsWithSpecialGenericSignature.f43732l;
            FunctionDescriptor functionDescriptor2 = (FunctionDescriptor) subDescriptor;
            Name name = functionDescriptor2.getName();
            Intrinsics.e(name, "subDescriptor.name");
            if (BuiltinMethodsWithSpecialGenericSignature.b(name)) {
                CallableMemberDescriptor callableMemberDescriptorC = SpecialBuiltinMembers.c((CallableMemberDescriptor) superDescriptor);
                z2 = superDescriptor instanceof FunctionDescriptor;
                if (z2) {
                    functionDescriptor = (FunctionDescriptor) superDescriptor;
                } else {
                    functionDescriptor = null;
                }
                if (functionDescriptor == null) {
                    if (classDescriptor instanceof JavaClassDescriptor) {
                        if (!Companion.a(superDescriptor, subDescriptor)) {
                            return ExternalOverridabilityCondition.Result.Z;
                        }
                    } else if (!Companion.a(superDescriptor, subDescriptor)) {
                        return ExternalOverridabilityCondition.Result.Z;
                    }
                } else if (classDescriptor instanceof JavaClassDescriptor) {
                    if (!Companion.a(superDescriptor, subDescriptor)) {
                        return ExternalOverridabilityCondition.Result.Z;
                    }
                } else if (!Companion.a(superDescriptor, subDescriptor)) {
                    return ExternalOverridabilityCondition.Result.Z;
                }
            } else {
                ArrayList arrayList = SpecialGenericSignatures.f43789a;
                Name name2 = functionDescriptor2.getName();
                Intrinsics.e(name2, "subDescriptor.name");
                if (SpecialGenericSignatures.j.contains(name2)) {
                    CallableMemberDescriptor callableMemberDescriptorC2 = SpecialBuiltinMembers.c((CallableMemberDescriptor) superDescriptor);
                    z2 = superDescriptor instanceof FunctionDescriptor;
                    if (z2) {
                        functionDescriptor = (FunctionDescriptor) superDescriptor;
                    } else {
                        functionDescriptor = null;
                    }
                    if ((functionDescriptor == null && functionDescriptor2.w0() == functionDescriptor.w0()) || (callableMemberDescriptorC2 != null && functionDescriptor2.w0())) {
                        if ((classDescriptor instanceof JavaClassDescriptor) || functionDescriptor2.l0() != null || callableMemberDescriptorC2 == null || SpecialBuiltinMembers.d(classDescriptor, callableMemberDescriptorC2)) {
                            if (!Companion.a(superDescriptor, subDescriptor)) {
                                return ExternalOverridabilityCondition.Result.Z;
                            }
                        } else if ((callableMemberDescriptorC2 instanceof FunctionDescriptor) && z2 && BuiltinMethodsWithSpecialGenericSignature.a((FunctionDescriptor) callableMemberDescriptorC2) != null) {
                            String strA = MethodSignatureMappingKt.a(functionDescriptor2, 2);
                            FunctionDescriptor functionDescriptorY0 = ((FunctionDescriptor) superDescriptor).y0();
                            Intrinsics.e(functionDescriptorY0, "superDescriptor.original");
                            if (strA.equals(MethodSignatureMappingKt.a(functionDescriptorY0, 2))) {
                                if (!Companion.a(superDescriptor, subDescriptor)) {
                                    return ExternalOverridabilityCondition.Result.Z;
                                }
                            }
                        }
                    }
                } else if (!Companion.a(superDescriptor, subDescriptor)) {
                    return ExternalOverridabilityCondition.Result.Z;
                }
            }
        } else if (!Companion.a(superDescriptor, subDescriptor)) {
            return ExternalOverridabilityCondition.Result.Z;
        }
        return result;
    }
}
