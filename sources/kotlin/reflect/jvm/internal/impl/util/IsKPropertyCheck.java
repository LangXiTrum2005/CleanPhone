package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
final class IsKPropertyCheck implements Check {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final IsKPropertyCheck f44612a = new IsKPropertyCheck();

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
        SimpleType simpleTypeC;
        ValueParameterDescriptor secondParameter = (ValueParameterDescriptor) javaMethodDescriptor.e().get(1);
        ReflectionTypes.Companion companion = ReflectionTypes.d;
        Intrinsics.e(secondParameter, "secondParameter");
        ModuleDescriptor moduleDescriptorJ = DescriptorUtilsKt.j(secondParameter);
        companion.getClass();
        ClassDescriptor classDescriptorA = FindClassInModuleKt.a(moduleDescriptorJ, StandardNames.FqNames.f43489Q);
        if (classDescriptorA == null) {
            simpleTypeC = null;
        } else {
            TypeAttributes.f44529Y.getClass();
            TypeAttributes typeAttributes = TypeAttributes.Z;
            List parameters = classDescriptorA.h().getParameters();
            Intrinsics.e(parameters, "kPropertyClass.typeConstructor.parameters");
            Object objW = CollectionsKt.W(parameters);
            Intrinsics.e(objW, "kPropertyClass.typeConstructor.parameters.single()");
            simpleTypeC = KotlinTypeFactory.c(typeAttributes, classDescriptorA, CollectionsKt.H(new StarProjectionImpl((TypeParameterDescriptor) objW)));
        }
        if (simpleTypeC == null) {
            return false;
        }
        KotlinType type = secondParameter.getType();
        Intrinsics.e(type, "secondParameter.type");
        return TypeUtilsKt.i(simpleTypeC, TypeUtils.g(type, false));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String b(JavaMethodDescriptor javaMethodDescriptor) {
        return Check.DefaultImpls.a(this, javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }
}
