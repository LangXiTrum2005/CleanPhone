package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: loaded from: classes7.dex */
final class NullableSimpleType extends DelegatingSimpleTypeImpl {
    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean I0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType S0(SimpleType simpleType) {
        return new NullableSimpleType(simpleType);
    }
}
