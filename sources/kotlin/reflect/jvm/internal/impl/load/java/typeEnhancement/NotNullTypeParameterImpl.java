package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: loaded from: classes7.dex */
public final class NotNullTypeParameterImpl extends DelegatingSimpleType implements NotNullTypeParameter {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final SimpleType f43929Y;

    public NotNullTypeParameterImpl(SimpleType delegate) {
        Intrinsics.f(delegate, "delegate");
        this.f43929Y = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean I0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType N0(TypeAttributes newAttributes) {
        Intrinsics.f(newAttributes, "newAttributes");
        return new NotNullTypeParameterImpl(this.f43929Y.N0(newAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: O0 */
    public final SimpleType L0(boolean z2) {
        return z2 ? this.f43929Y.L0(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: P0 */
    public final SimpleType N0(TypeAttributes newAttributes) {
        Intrinsics.f(newAttributes, "newAttributes");
        return new NotNullTypeParameterImpl(this.f43929Y.N0(newAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType Q0() {
        return this.f43929Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType S0(SimpleType simpleType) {
        return new NotNullTypeParameterImpl(simpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final UnwrappedType c0(KotlinType replacement) {
        Intrinsics.f(replacement, "replacement");
        UnwrappedType unwrappedTypeK0 = replacement.K0();
        if (!TypeUtils.f(unwrappedTypeK0) && !TypeUtils.e(unwrappedTypeK0)) {
            return unwrappedTypeK0;
        }
        if (unwrappedTypeK0 instanceof SimpleType) {
            SimpleType simpleType = (SimpleType) unwrappedTypeK0;
            SimpleType simpleTypeL0 = simpleType.L0(false);
            return !TypeUtils.f(simpleType) ? simpleTypeL0 : new NotNullTypeParameterImpl(simpleTypeL0);
        }
        if (!(unwrappedTypeK0 instanceof FlexibleType)) {
            throw new IllegalStateException(("Incorrect type: " + unwrappedTypeK0).toString());
        }
        FlexibleType flexibleType = (FlexibleType) unwrappedTypeK0;
        SimpleType simpleType2 = flexibleType.f44509Y;
        SimpleType simpleTypeL1 = simpleType2.L0(false);
        if (TypeUtils.f(simpleType2)) {
            simpleTypeL1 = new NotNullTypeParameterImpl(simpleTypeL1);
        }
        SimpleType simpleType3 = flexibleType.Z;
        SimpleType simpleTypeL2 = simpleType3.L0(false);
        if (TypeUtils.f(simpleType3)) {
            simpleTypeL2 = new NotNullTypeParameterImpl(simpleTypeL2);
        }
        return TypeWithEnhancementKt.c(KotlinTypeFactory.b(simpleTypeL1, simpleTypeL2), TypeWithEnhancementKt.a(unwrappedTypeK0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final boolean y0() {
        return true;
    }
}
