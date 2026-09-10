package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/GenericArrayTypeImpl;", "Ljava/lang/reflect/GenericArrayType;", "Lkotlin/reflect/TypeImpl;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class GenericArrayTypeImpl implements GenericArrayType, TypeImpl {
    public final Type X;

    public GenericArrayTypeImpl(Type elementType) {
        Intrinsics.f(elementType, "elementType");
        this.X = elementType;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return Intrinsics.a(this.X, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.X;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return TypesJVMKt.a(this.X) + "[]";
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
