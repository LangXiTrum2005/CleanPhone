package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: loaded from: classes7.dex */
final class CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1 extends Lambda implements Function1<UnwrappedType, Boolean> {
    public static final CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1 X = new CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UnwrappedType it = (UnwrappedType) obj;
        Intrinsics.e(it, "it");
        return Boolean.valueOf(it.H0() instanceof CapturedTypeConstructor);
    }
}
