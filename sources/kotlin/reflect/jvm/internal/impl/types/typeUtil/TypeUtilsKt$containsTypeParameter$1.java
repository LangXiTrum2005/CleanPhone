package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: loaded from: classes7.dex */
final class TypeUtilsKt$containsTypeParameter$1 extends Lambda implements Function1<UnwrappedType, Boolean> {
    static {
        new TypeUtilsKt$containsTypeParameter$1(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(TypeUtils.f((UnwrappedType) obj));
    }
}
