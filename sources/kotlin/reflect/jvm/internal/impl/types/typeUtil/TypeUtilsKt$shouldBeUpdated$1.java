package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
final class TypeUtilsKt$shouldBeUpdated$1 extends Lambda implements Function1<UnwrappedType, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UnwrappedType it = (UnwrappedType) obj;
        Intrinsics.f(it, "it");
        return Boolean.valueOf((it instanceof StubTypeForBuilderInference) || (it.H0() instanceof TypeVariableTypeConstructorMarker) || KotlinTypeKt.a(it));
    }
}
