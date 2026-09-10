package qk;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements ParameterizedType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f49115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f49116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type[] f49117c;

    public e0(Class cls, Type type, ArrayList arrayList) {
        this.f49115a = cls;
        this.f49116b = type;
        this.f49117c = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return kotlin.jvm.internal.n.a(this.f49115a, parameterizedType.getRawType()) && kotlin.jvm.internal.n.a(this.f49116b, parameterizedType.getOwnerType()) && Arrays.equals(this.f49117c, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f49117c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f49116b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f49115a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb2 = new StringBuilder();
        Class cls = this.f49115a;
        Type type = this.f49116b;
        if (type != null) {
            sb2.append(i0.b(type));
            sb2.append("$");
            sb2.append(cls.getSimpleName());
        } else {
            sb2.append(i0.b(cls));
        }
        Type[] typeArr = this.f49117c;
        if (typeArr.length != 0) {
            xj.k.u0(typeArr, sb2, ", ", "<", ">", "...", d0.f49114b);
        }
        return sb2.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f49115a.hashCode();
        Type type = this.f49116b;
        return Arrays.hashCode(this.f49117c) ^ (iHashCode ^ (type != null ? type.hashCode() : 0));
    }

    public final String toString() {
        return getTypeName();
    }
}
