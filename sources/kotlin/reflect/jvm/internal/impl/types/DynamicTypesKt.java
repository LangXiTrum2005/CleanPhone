package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class DynamicTypesKt {
    public static final boolean a(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        return kotlinType.K0() instanceof DynamicType;
    }
}
