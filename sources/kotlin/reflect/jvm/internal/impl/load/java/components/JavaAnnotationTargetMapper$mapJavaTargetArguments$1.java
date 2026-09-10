package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes7.dex */
final class JavaAnnotationTargetMapper$mapJavaTargetArguments$1 extends Lambda implements Function1<ModuleDescriptor, KotlinType> {
    public static final JavaAnnotationTargetMapper$mapJavaTargetArguments$1 X = new JavaAnnotationTargetMapper$mapJavaTargetArguments$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ModuleDescriptor module = (ModuleDescriptor) obj;
        Intrinsics.f(module, "module");
        ValueParameterDescriptor valueParameterDescriptorB = DescriptorResolverUtils.b(JavaAnnotationMapper.f43808b, module.k().i(StandardNames.FqNames.t));
        KotlinType type = valueParameterDescriptorB != null ? valueParameterDescriptorB.getType() : null;
        return type == null ? ErrorUtils.c(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }
}
