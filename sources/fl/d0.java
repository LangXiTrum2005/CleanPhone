package fl;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends a0 implements pl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WildcardType f40989a;

    public d0(WildcardType wildcardType) {
        this.f40989a = wildcardType;
    }

    @Override // fl.a0
    public final Type b() {
        return this.f40989a;
    }

    public final a0 c() {
        WildcardType wildcardType = this.f40989a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Object objZ0 = xj.k.z0(lowerBounds);
            kotlin.jvm.internal.n.e(objZ0, "lowerBounds.single()");
            Type type = (Type) objZ0;
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new y(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) {
                return new h(type);
            }
            return type instanceof WildcardType ? new d0((WildcardType) type) : new p(type);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Type ub2 = (Type) xj.k.z0(upperBounds);
        if (kotlin.jvm.internal.n.a(ub2, Object.class)) {
            return null;
        }
        kotlin.jvm.internal.n.e(ub2, "ub");
        boolean z11 = ub2 instanceof Class;
        if (z11) {
            Class cls2 = (Class) ub2;
            if (cls2.isPrimitive()) {
                return new y(cls2);
            }
        }
        if ((ub2 instanceof GenericArrayType) || (z11 && ((Class) ub2).isArray())) {
            return new h(ub2);
        }
        return ub2 instanceof WildcardType ? new d0((WildcardType) ub2) : new p(ub2);
    }

    @Override // pl.b
    public final Collection getAnnotations() {
        return xj.v.f53866a;
    }
}
