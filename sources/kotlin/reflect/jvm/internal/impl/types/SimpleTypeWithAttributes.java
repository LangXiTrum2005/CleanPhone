package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
final class SimpleTypeWithAttributes extends DelegatingSimpleTypeImpl {
    public final TypeAttributes Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleTypeWithAttributes(SimpleType simpleType, TypeAttributes attributes) {
        super(simpleType);
        Intrinsics.f(attributes, "attributes");
        this.Z = attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeAttributes G0() {
        return this.Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType S0(SimpleType simpleType) {
        return new SimpleTypeWithAttributes(simpleType, this.Z);
    }
}
