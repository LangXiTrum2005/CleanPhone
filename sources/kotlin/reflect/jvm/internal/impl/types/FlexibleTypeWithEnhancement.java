package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes7.dex */
public final class FlexibleTypeWithEnhancement extends FlexibleType implements TypeWithEnhancement {
    public final FlexibleType e0;
    public final KotlinType f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTypeWithEnhancement(FlexibleType origin, KotlinType enhancement) {
        super(origin.f44509Y, origin.Z);
        Intrinsics.f(origin, "origin");
        Intrinsics.f(enhancement, "enhancement");
        this.e0 = origin;
        this.f0 = enhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final KotlinType J0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new FlexibleTypeWithEnhancement((FlexibleType) kotlinTypeRefiner.a(this.e0), kotlinTypeRefiner.a(this.f0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType L0(boolean z2) {
        return TypeWithEnhancementKt.c(this.e0.L0(z2), this.f0.K0().L0(z2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* JADX INFO: renamed from: M0 */
    public final UnwrappedType J0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new FlexibleTypeWithEnhancement((FlexibleType) kotlinTypeRefiner.a(this.e0), kotlinTypeRefiner.a(this.f0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType N0(TypeAttributes newAttributes) {
        Intrinsics.f(newAttributes, "newAttributes");
        return TypeWithEnhancementKt.c(this.e0.N0(newAttributes), this.f0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final SimpleType O0() {
        return this.e0.O0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final String P0(DescriptorRendererImpl descriptorRendererImpl, DescriptorRendererImpl descriptorRendererImpl2) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl2.d;
        descriptorRendererOptionsImpl.getClass();
        return ((Boolean) descriptorRendererOptionsImpl.m.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[11])).booleanValue() ? descriptorRendererImpl.a0(this.f0) : this.e0.P0(descriptorRendererImpl, descriptorRendererImpl2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public final KotlinType Z() {
        return this.f0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public final UnwrappedType getOrigin() {
        return this.e0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f0 + ")] " + this.e0;
    }
}
