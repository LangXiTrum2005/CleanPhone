package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerStateKt;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class DefinitelyNotNullType extends DelegatingSimpleType implements CustomTypeParameter, DefinitelyNotNullTypeMarker {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final SimpleType f44501Y;
    public final boolean Z;

    public static final class Companion {
        public static DefinitelyNotNullType a(UnwrappedType type, boolean z2) {
            boolean zE;
            Intrinsics.f(type, "type");
            if (type instanceof DefinitelyNotNullType) {
                return (DefinitelyNotNullType) type;
            }
            if (!(type.H0() instanceof NewTypeVariableConstructor) && !(type.H0().c() instanceof TypeParameterDescriptor) && !(type instanceof NewCapturedType) && !(type instanceof StubTypeForBuilderInference)) {
                zE = false;
            } else if (type instanceof StubTypeForBuilderInference) {
                zE = TypeUtils.e(type);
            } else {
                ClassifierDescriptor classifierDescriptorC = type.H0().c();
                TypeParameterDescriptorImpl typeParameterDescriptorImpl = classifierDescriptorC instanceof TypeParameterDescriptorImpl ? (TypeParameterDescriptorImpl) classifierDescriptorC : null;
                if (typeParameterDescriptorImpl == null || typeParameterDescriptorImpl.m0) {
                    zE = (z2 && (type.H0().c() instanceof TypeParameterDescriptor)) ? TypeUtils.e(type) : !AbstractNullabilityChecker.a(ClassicTypeCheckerStateKt.a(false, null, 24), FlexibleTypesKt.b(type), TypeCheckerState.SupertypesPolicy.LowerIfFlexible.f44536a);
                } else {
                    zE = true;
                }
            }
            if (!zE) {
                return null;
            }
            if (type instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) type;
                Intrinsics.a(flexibleType.f44509Y.H0(), flexibleType.Z.H0());
            }
            return new DefinitelyNotNullType(FlexibleTypesKt.b(type).L0(false), z2);
        }
    }

    public DefinitelyNotNullType(SimpleType simpleType, boolean z2) {
        this.f44501Y = simpleType;
        this.Z = z2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean I0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: O0 */
    public final SimpleType L0(boolean z2) {
        return z2 ? this.f44501Y.L0(z2) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: P0 */
    public final SimpleType N0(TypeAttributes newAttributes) {
        Intrinsics.f(newAttributes, "newAttributes");
        return new DefinitelyNotNullType(this.f44501Y.N0(newAttributes), this.Z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType Q0() {
        return this.f44501Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType S0(SimpleType simpleType) {
        return new DefinitelyNotNullType(simpleType, this.Z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final UnwrappedType c0(KotlinType replacement) {
        Intrinsics.f(replacement, "replacement");
        return SpecialTypesKt.a(replacement.K0(), this.Z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public final String toString() {
        return this.f44501Y + " & Any";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final boolean y0() {
        SimpleType simpleType = this.f44501Y;
        return (simpleType.H0() instanceof NewTypeVariableConstructor) || (simpleType.H0().c() instanceof TypeParameterDescriptor);
    }
}
