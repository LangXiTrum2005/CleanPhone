package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;

/* JADX INFO: loaded from: classes7.dex */
public final class KotlinTypeKt {
    public static final boolean a(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        UnwrappedType unwrappedTypeK0 = kotlinType.K0();
        if (unwrappedTypeK0 instanceof ErrorType) {
            return true;
        }
        return (unwrappedTypeK0 instanceof FlexibleType) && (((FlexibleType) unwrappedTypeK0).O0() instanceof ErrorType);
    }
}
