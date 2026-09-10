package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;

/* JADX INFO: loaded from: classes7.dex */
public abstract class FlexibleType extends UnwrappedType implements FlexibleTypeMarker {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final SimpleType f44509Y;
    public final SimpleType Z;

    public FlexibleType(SimpleType lowerBound, SimpleType upperBound) {
        Intrinsics.f(lowerBound, "lowerBound");
        Intrinsics.f(upperBound, "upperBound");
        this.f44509Y = lowerBound;
        this.Z = upperBound;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final List F0() {
        return O0().F0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes G0() {
        return O0().G0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeConstructor H0() {
        return O0().H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean I0() {
        return O0().I0();
    }

    public abstract SimpleType O0();

    public abstract String P0(DescriptorRendererImpl descriptorRendererImpl, DescriptorRendererImpl descriptorRendererImpl2);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope n() {
        return O0().n();
    }

    public String toString() {
        return DescriptorRenderer.f44239c.a0(this);
    }
}
