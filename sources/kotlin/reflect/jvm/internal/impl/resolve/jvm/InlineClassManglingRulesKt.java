package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class InlineClassManglingRulesKt {
    public static final boolean a(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
        if (classifierDescriptorC != null && InlineClassesUtilsKt.b(classifierDescriptorC) && !DescriptorUtilsKt.g((ClassDescriptor) classifierDescriptorC).equals(StandardNames.g)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorC2 = kotlinType.H0().c();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorC2 instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorC2 : null;
        return typeParameterDescriptor == null ? false : a(TypeUtilsKt.g(typeParameterDescriptor));
    }
}
