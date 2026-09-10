package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public class ErasureProjectionComputer {
    public TypeProjection a(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes typeAttr, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, KotlinType kotlinType) {
        Intrinsics.f(typeAttr, "typeAttr");
        Intrinsics.f(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        return new TypeProjectionImpl(kotlinType, Variance.OUT_VARIANCE);
    }
}
