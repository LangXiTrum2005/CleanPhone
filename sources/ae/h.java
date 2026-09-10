package ae;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f3505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f3506b;

    public h(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException("At most one lower bound is supported");
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException("Exactly one upper bound must be specified");
        }
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            i.b(typeArr[0]);
            this.f3506b = null;
            this.f3505a = i.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        i.b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException("When lower bound is specified, upper bound must be Object");
        }
        this.f3506b = i.a(typeArr2[0]);
        this.f3505a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && i.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f3506b;
        return type != null ? new Type[]{type} : i.f3507a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f3505a};
    }

    public final int hashCode() {
        Type type = this.f3506b;
        return (this.f3505a.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.f3506b;
        if (type != null) {
            return "? super " + i.l(type);
        }
        Type type2 = this.f3505a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + i.l(type2);
    }
}
