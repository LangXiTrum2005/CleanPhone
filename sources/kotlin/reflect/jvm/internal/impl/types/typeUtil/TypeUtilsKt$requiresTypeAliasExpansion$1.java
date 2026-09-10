package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: loaded from: classes7.dex */
final class TypeUtilsKt$requiresTypeAliasExpansion$1 extends Lambda implements Function1<UnwrappedType, Boolean> {
    public static final TypeUtilsKt$requiresTypeAliasExpansion$1 X = new TypeUtilsKt$requiresTypeAliasExpansion$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UnwrappedType it = (UnwrappedType) obj;
        Intrinsics.f(it, "it");
        ClassifierDescriptor classifierDescriptorC = it.H0().c();
        boolean z2 = false;
        if (classifierDescriptorC != null && ((classifierDescriptorC instanceof TypeAliasDescriptor) || (classifierDescriptorC instanceof TypeParameterDescriptor))) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
