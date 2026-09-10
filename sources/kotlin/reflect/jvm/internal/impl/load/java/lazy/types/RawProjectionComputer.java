package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes7.dex */
public final class RawProjectionComputer extends ErasureProjectionComputer {

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[JavaTypeFlexibility.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer
    public final TypeProjection a(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes typeAttr, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, KotlinType kotlinType) {
        Intrinsics.f(typeAttr, "typeAttr");
        Intrinsics.f(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        if (!(typeAttr instanceof JavaTypeAttributes)) {
            return super.a(typeParameterDescriptor, typeAttr, typeParameterUpperBoundEraser, kotlinType);
        }
        JavaTypeAttributes javaTypeAttributesE = (JavaTypeAttributes) typeAttr;
        if (!javaTypeAttributesE.f) {
            javaTypeAttributesE = JavaTypeAttributes.e(javaTypeAttributesE, JavaTypeFlexibility.X, false, null, null, 61);
        }
        int iOrdinal = javaTypeAttributesE.f43900e.ordinal();
        Variance variance = Variance.INVARIANT;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new TypeProjectionImpl(kotlinType, variance);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!typeParameterDescriptor.j().f44559Y) {
            return new TypeProjectionImpl(DescriptorUtilsKt.e(typeParameterDescriptor).m(), variance);
        }
        List parameters = kotlinType.H0().getParameters();
        Intrinsics.e(parameters, "erasedUpperBound.constructor.parameters");
        return !parameters.isEmpty() ? new TypeProjectionImpl(kotlinType, Variance.OUT_VARIANCE) : TypeUtils.k(typeParameterDescriptor, javaTypeAttributesE);
    }
}
