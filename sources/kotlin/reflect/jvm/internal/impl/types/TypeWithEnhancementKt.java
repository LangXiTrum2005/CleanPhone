package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeWithEnhancementKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final KotlinType a(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        if (kotlinType instanceof TypeWithEnhancement) {
            return ((TypeWithEnhancement) kotlinType).Z();
        }
        return null;
    }

    public static final UnwrappedType b(UnwrappedType unwrappedType, KotlinType origin) {
        Intrinsics.f(unwrappedType, "<this>");
        Intrinsics.f(origin, "origin");
        return c(unwrappedType, a(origin));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final UnwrappedType c(UnwrappedType unwrappedType, KotlinType kotlinType) {
        Intrinsics.f(unwrappedType, "<this>");
        if (unwrappedType instanceof TypeWithEnhancement) {
            return c(((TypeWithEnhancement) unwrappedType).getOrigin(), kotlinType);
        }
        if (kotlinType == null || kotlinType.equals(unwrappedType)) {
            return unwrappedType;
        }
        if (unwrappedType instanceof SimpleType) {
            return new SimpleTypeWithEnhancement((SimpleType) unwrappedType, kotlinType);
        }
        if (unwrappedType instanceof FlexibleType) {
            return new FlexibleTypeWithEnhancement((FlexibleType) unwrappedType, kotlinType);
        }
        throw new NoWhenBranchMatchedException();
    }
}
