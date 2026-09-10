package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class FlexibleTypeImpl extends FlexibleType implements CustomTypeParameter {

    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTypeImpl(SimpleType lowerBound, SimpleType upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.f(lowerBound, "lowerBound");
        Intrinsics.f(upperBound, "upperBound");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType L0(boolean z2) {
        return KotlinTypeFactory.b(this.f44509Y.L0(z2), this.Z.L0(z2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType N0(TypeAttributes newAttributes) {
        Intrinsics.f(newAttributes, "newAttributes");
        return KotlinTypeFactory.b(this.f44509Y.N0(newAttributes), this.Z.N0(newAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final SimpleType O0() {
        return this.f44509Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final String P0(DescriptorRendererImpl descriptorRendererImpl, DescriptorRendererImpl descriptorRendererImpl2) {
        boolean zP = descriptorRendererImpl2.d.p();
        SimpleType simpleType = this.Z;
        SimpleType simpleType2 = this.f44509Y;
        if (!zP) {
            return descriptorRendererImpl.G(descriptorRendererImpl.a0(simpleType2), descriptorRendererImpl.a0(simpleType), TypeUtilsKt.f(this));
        }
        return "(" + descriptorRendererImpl.a0(simpleType2) + ".." + descriptorRendererImpl.a0(simpleType) + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final FlexibleType J0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new FlexibleTypeImpl((SimpleType) kotlinTypeRefiner.a(this.f44509Y), (SimpleType) kotlinTypeRefiner.a(this.Z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final UnwrappedType c0(KotlinType replacement) {
        UnwrappedType unwrappedTypeB;
        Intrinsics.f(replacement, "replacement");
        UnwrappedType unwrappedTypeK0 = replacement.K0();
        if (unwrappedTypeK0 instanceof FlexibleType) {
            unwrappedTypeB = unwrappedTypeK0;
        } else {
            if (!(unwrappedTypeK0 instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            SimpleType simpleType = (SimpleType) unwrappedTypeK0;
            unwrappedTypeB = KotlinTypeFactory.b(simpleType, simpleType.L0(true));
        }
        return TypeWithEnhancementKt.b(unwrappedTypeB, unwrappedTypeK0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final String toString() {
        return "(" + this.f44509Y + ".." + this.Z + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final boolean y0() {
        SimpleType simpleType = this.f44509Y;
        return (simpleType.H0().c() instanceof TypeParameterDescriptor) && Intrinsics.a(simpleType.H0(), this.Z.H0());
    }
}
