package ae;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f3502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f3503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type[] f3504c;

    public g(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException(defpackage.e.l(cls, "Must specify owner type for "));
        }
        this.f3502a = type == null ? null : i.a(type);
        this.f3503b = i.a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f3504c = typeArr2;
        int length = typeArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Objects.requireNonNull(this.f3504c[i10]);
            i.b(this.f3504c[i10]);
            Type[] typeArr3 = this.f3504c;
            typeArr3[i10] = i.a(typeArr3[i10]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && i.d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f3504c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f3502a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f3503b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f3504c) ^ this.f3503b.hashCode();
        Type type = this.f3502a;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.f3504c;
        int length = typeArr.length;
        Type type = this.f3503b;
        if (length == 0) {
            return i.l(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(i.l(type));
        sb2.append("<");
        sb2.append(i.l(typeArr[0]));
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(", ");
            sb2.append(i.l(typeArr[i10]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
