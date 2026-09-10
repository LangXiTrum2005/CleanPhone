package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes7.dex */
public final class CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1 extends TypeConstructorSubstitution {
    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
    public final TypeProjection g(TypeConstructor key) {
        Intrinsics.f(key, "key");
        CapturedTypeConstructor capturedTypeConstructor = key instanceof CapturedTypeConstructor ? (CapturedTypeConstructor) key : null;
        if (capturedTypeConstructor == null) {
            return null;
        }
        if (capturedTypeConstructor.b().a()) {
            return new TypeProjectionImpl(capturedTypeConstructor.b().getType(), Variance.OUT_VARIANCE);
        }
        return capturedTypeConstructor.b();
    }
}
