package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
final class ErasedOverridabilityCondition$isOverridable$signatureTypes$1 extends Lambda implements Function1<ValueParameterDescriptor, KotlinType> {
    public static final ErasedOverridabilityCondition$isOverridable$signatureTypes$1 X = new ErasedOverridabilityCondition$isOverridable$signatureTypes$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ValueParameterDescriptor) obj).getType();
    }
}
