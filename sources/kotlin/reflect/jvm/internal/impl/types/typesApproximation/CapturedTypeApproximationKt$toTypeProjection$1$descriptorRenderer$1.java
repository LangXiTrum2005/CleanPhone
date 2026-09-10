package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;

/* JADX INFO: loaded from: classes7.dex */
final class CapturedTypeApproximationKt$toTypeProjection$1$descriptorRenderer$1 extends Lambda implements Function1<DescriptorRendererOptions, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DescriptorRendererOptions withOptions = (DescriptorRendererOptions) obj;
        Intrinsics.f(withOptions, "$this$withOptions");
        withOptions.l(ClassifierNamePolicy.FULLY_QUALIFIED.f44234a);
        return Unit.f43263a;
    }
}
