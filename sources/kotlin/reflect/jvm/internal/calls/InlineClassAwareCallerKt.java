package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InlineClassAwareCallerKt {
    public static final Object a(Object obj, CallableMemberDescriptor callableMemberDescriptor) {
        KotlinType kotlinTypeC;
        Class clsF;
        return (((callableMemberDescriptor instanceof PropertyDescriptor) && InlineClassesUtilsKt.d((VariableDescriptor) callableMemberDescriptor)) || (kotlinTypeC = c(callableMemberDescriptor)) == null || (clsF = f(kotlinTypeC)) == null) ? obj : d(clsF, callableMemberDescriptor).invoke(obj, new Object[0]);
    }

    public static final Caller b(Caller caller, FunctionDescriptor descriptor, boolean z2) {
        KotlinType returnType;
        KotlinType kotlinTypeC;
        Intrinsics.f(descriptor, "descriptor");
        if (!InlineClassesUtilsKt.a(descriptor)) {
            List listE = descriptor.e();
            Intrinsics.e(listE, "descriptor.valueParameters");
            List list = listE;
            if ((list instanceof Collection) && list.isEmpty()) {
                returnType = descriptor.getReturnType();
                return returnType != null ? caller : caller;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
                Intrinsics.e(type, "it.type");
                if (InlineClassesUtilsKt.c(type)) {
                }
            }
            returnType = descriptor.getReturnType();
            if ((returnType != null || !InlineClassesUtilsKt.c(returnType)) && ((caller instanceof BoundCaller) || (kotlinTypeC = c(descriptor)) == null || !InlineClassesUtilsKt.c(kotlinTypeC))) {
            }
        }
        return new InlineClassAwareCaller(caller, descriptor, z2);
    }

    public static final KotlinType c(CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor receiverParameterDescriptorJ = callableMemberDescriptor.J();
        ReceiverParameterDescriptor receiverParameterDescriptorG = callableMemberDescriptor.G();
        if (receiverParameterDescriptorJ != null) {
            return receiverParameterDescriptorJ.getType();
        }
        if (receiverParameterDescriptorG != null) {
            if (callableMemberDescriptor instanceof ConstructorDescriptor) {
                return receiverParameterDescriptorG.getType();
            }
            DeclarationDescriptor declarationDescriptorD = callableMemberDescriptor.d();
            ClassDescriptor classDescriptor = declarationDescriptorD instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorD : null;
            if (classDescriptor != null) {
                return classDescriptor.o();
            }
        }
        return null;
    }

    public static final Method d(Class cls, CallableMemberDescriptor descriptor) {
        Intrinsics.f(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            Intrinsics.e(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final Class e(DeclarationDescriptor declarationDescriptor) {
        if (!(declarationDescriptor instanceof ClassDescriptor) || !InlineClassesUtilsKt.b(declarationDescriptor)) {
            return null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        Class clsJ = UtilKt.j(classDescriptor);
        if (clsJ != null) {
            return clsJ;
        }
        throw new KotlinReflectionInternalError("Class object for the class " + classDescriptor.getName() + " cannot be found (classId=" + DescriptorUtilsKt.f((ClassifierDescriptor) declarationDescriptor) + ')');
    }

    public static final Class f(KotlinType kotlinType) {
        SimpleType simpleTypeF;
        Intrinsics.f(kotlinType, "<this>");
        Class clsE = e(kotlinType.H0().c());
        if (clsE == null) {
            return null;
        }
        if (TypeUtils.e(kotlinType) && ((simpleTypeF = InlineClassesUtilsKt.f(kotlinType)) == null || TypeUtils.e(simpleTypeF) || KotlinBuiltIns.F(simpleTypeF))) {
            return null;
        }
        return clsE;
    }
}
