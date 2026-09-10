package qk;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 implements WildcardType, Type {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f49122c = new j0(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f49123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f49124b;

    public j0(Type type, Type type2) {
        this.f49123a = type;
        this.f49124b = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f49124b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f49124b;
        if (type != null) {
            return "? super " + i0.b(type);
        }
        Type type2 = this.f49123a;
        if (type2 == null || kotlin.jvm.internal.n.a(type2, Object.class)) {
            return "?";
        }
        return "? extends " + i0.b(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f49123a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getLowerBounds()) ^ Arrays.hashCode(getUpperBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
