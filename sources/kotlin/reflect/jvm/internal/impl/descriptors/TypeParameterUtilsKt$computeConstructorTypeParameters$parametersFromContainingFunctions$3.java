package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes7.dex */
final class TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3 extends Lambda implements Function1<DeclarationDescriptor, Sequence<? extends TypeParameterDescriptor>> {
    public static final TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3 X = new TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DeclarationDescriptor it = (DeclarationDescriptor) obj;
        Intrinsics.f(it, "it");
        List typeParameters = ((CallableDescriptor) it).getTypeParameters();
        Intrinsics.e(typeParameters, "it as CallableDescriptor).typeParameters");
        return CollectionsKt.k(typeParameters);
    }
}
