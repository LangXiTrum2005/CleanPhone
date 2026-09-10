package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes7.dex */
public final class SimpleTypeWithEnhancement extends DelegatingSimpleType implements TypeWithEnhancement {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final SimpleType f44520Y;
    public final KotlinType Z;

    public SimpleTypeWithEnhancement(SimpleType delegate, KotlinType enhancement) {
        Intrinsics.f(delegate, "delegate");
        Intrinsics.f(enhancement, "enhancement");
        this.f44520Y = delegate;
        this.Z = enhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: O0 */
    public final SimpleType L0(boolean z2) {
        UnwrappedType unwrappedTypeC = TypeWithEnhancementKt.c(this.f44520Y.L0(z2), this.Z.K0().L0(z2));
        Intrinsics.d(unwrappedTypeC, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (SimpleType) unwrappedTypeC;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: P0 */
    public final SimpleType N0(TypeAttributes newAttributes) {
        Intrinsics.f(newAttributes, "newAttributes");
        UnwrappedType unwrappedTypeC = TypeWithEnhancementKt.c(this.f44520Y.N0(newAttributes), this.Z);
        Intrinsics.d(unwrappedTypeC, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (SimpleType) unwrappedTypeC;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType Q0() {
        return this.f44520Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType S0(SimpleType simpleType) {
        return new SimpleTypeWithEnhancement(simpleType, this.Z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final SimpleTypeWithEnhancement J0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new SimpleTypeWithEnhancement((SimpleType) kotlinTypeRefiner.a(this.f44520Y), kotlinTypeRefiner.a(this.Z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public final KotlinType Z() {
        return this.Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public final UnwrappedType getOrigin() {
        return this.f44520Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.Z + ")] " + this.f44520Y;
    }
}
