package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class FlexibleTypesKt {
    public static final boolean a(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        return kotlinType.K0() instanceof FlexibleType;
    }

    public static final SimpleType b(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        UnwrappedType unwrappedTypeK0 = kotlinType.K0();
        if (unwrappedTypeK0 instanceof FlexibleType) {
            return ((FlexibleType) unwrappedTypeK0).f44509Y;
        }
        if (unwrappedTypeK0 instanceof SimpleType) {
            return (SimpleType) unwrappedTypeK0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final SimpleType c(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        UnwrappedType unwrappedTypeK0 = kotlinType.K0();
        if (unwrappedTypeK0 instanceof FlexibleType) {
            return ((FlexibleType) unwrappedTypeK0).Z;
        }
        if (unwrappedTypeK0 instanceof SimpleType) {
            return (SimpleType) unwrappedTypeK0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
