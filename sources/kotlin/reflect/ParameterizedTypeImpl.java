package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/ParameterizedTypeImpl;", "Ljava/lang/reflect/ParameterizedType;", "Lkotlin/reflect/TypeImpl;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ParameterizedTypeImpl implements ParameterizedType, TypeImpl {
    public final Class X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Type f43357Y;
    public final Type[] Z;

    public ParameterizedTypeImpl(Class cls, Type type, ArrayList arrayList) {
        this.X = cls;
        this.f43357Y = type;
        this.Z = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        if (Intrinsics.a(this.X, parameterizedType.getRawType()) && Intrinsics.a(this.f43357Y, parameterizedType.getOwnerType())) {
            return Arrays.equals(this.Z, parameterizedType.getActualTypeArguments());
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.Z;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f43357Y;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.X;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.X;
        Type type = this.f43357Y;
        if (type != null) {
            sb.append(TypesJVMKt.a(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(TypesJVMKt.a(cls));
        }
        Type[] typeArr = this.Z;
        if (typeArr.length != 0) {
            ArraysKt___ArraysKt.b(typeArr, sb, ", ", "<", ">", "...", ParameterizedTypeImpl$getTypeName$1$1.X);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.X.hashCode();
        Type type = this.f43357Y;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.Z);
    }

    public final String toString() {
        return getTypeName();
    }
}
