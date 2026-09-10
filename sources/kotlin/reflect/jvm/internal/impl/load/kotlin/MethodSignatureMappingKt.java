package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class MethodSignatureMappingKt {
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    public static String a(FunctionDescriptor functionDescriptor, int i2) {
        String strB;
        boolean z2 = (i2 & 1) != 0;
        boolean z3 = (i2 & 2) != 0;
        Intrinsics.f(functionDescriptor, "<this>");
        StringBuilder sb = new StringBuilder();
        if (z3) {
            if (functionDescriptor instanceof ConstructorDescriptor) {
                strB = "<init>";
            } else {
                strB = functionDescriptor.getName().b();
                Intrinsics.e(strB, "name.asString()");
            }
            sb.append(strB);
        }
        sb.append("(");
        ReceiverParameterDescriptor receiverParameterDescriptorJ = functionDescriptor.J();
        if (receiverParameterDescriptorJ != null) {
            KotlinType type = receiverParameterDescriptorJ.getType();
            Intrinsics.e(type, "it.type");
            sb.append(c(type));
        }
        Iterator it = functionDescriptor.e().iterator();
        while (it.hasNext()) {
            KotlinType type2 = ((ValueParameterDescriptor) it.next()).getType();
            Intrinsics.e(type2, "parameter.type");
            sb.append(c(type2));
        }
        sb.append(")");
        if (z2) {
            if (functionDescriptor instanceof ConstructorDescriptor) {
                sb.append("V");
            } else {
                KotlinType returnType = functionDescriptor.getReturnType();
                Intrinsics.c(returnType);
                Name name = KotlinBuiltIns.f;
                if (KotlinBuiltIns.C(returnType, StandardNames.FqNames.d)) {
                    KotlinType returnType2 = functionDescriptor.getReturnType();
                    Intrinsics.c(returnType2);
                    if (!TypeUtils.e(returnType2) && !(functionDescriptor instanceof PropertyGetterDescriptor)) {
                        sb.append("V");
                    }
                }
                KotlinType returnType3 = functionDescriptor.getReturnType();
                Intrinsics.c(returnType3);
                sb.append(c(returnType3));
            }
        }
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String b(CallableDescriptor callableDescriptor) {
        Intrinsics.f(callableDescriptor, "<this>");
        if (!DescriptorUtils.o(callableDescriptor)) {
            DeclarationDescriptor declarationDescriptorD = callableDescriptor.d();
            ClassDescriptor classDescriptor = declarationDescriptorD instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorD : null;
            if (classDescriptor != null && !classDescriptor.getName().f44171Y) {
                CallableDescriptor callableDescriptorY0 = callableDescriptor.y0();
                SimpleFunctionDescriptor simpleFunctionDescriptor = callableDescriptorY0 instanceof SimpleFunctionDescriptor ? (SimpleFunctionDescriptor) callableDescriptorY0 : null;
                if (simpleFunctionDescriptor != null) {
                    return MethodSignatureBuildingUtilsKt.a(classDescriptor, a(simpleFunctionDescriptor, 3));
                }
            }
        }
        return null;
    }

    public static final JvmType c(KotlinType kotlinType) {
        return (JvmType) DescriptorBasedTypeSignatureMappingKt.b(kotlinType, TypeMappingMode.k, FunctionsKt.b());
    }
}
