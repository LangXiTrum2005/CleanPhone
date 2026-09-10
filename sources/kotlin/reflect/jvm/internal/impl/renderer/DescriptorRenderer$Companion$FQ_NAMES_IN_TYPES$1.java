package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
public final class DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1 extends Lambda implements Function1<DescriptorRendererOptions, Unit> {
    public static final DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1 X = new DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DescriptorRendererOptions withOptions = (DescriptorRendererOptions) obj;
        Intrinsics.f(withOptions, "$this$withOptions");
        withOptions.j(DescriptorRendererModifier.f44243Y);
        return Unit.f43263a;
    }
}
