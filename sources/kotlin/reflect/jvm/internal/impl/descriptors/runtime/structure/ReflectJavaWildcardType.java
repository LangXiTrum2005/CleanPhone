package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectJavaWildcardType extends ReflectJavaType implements JavaWildcardType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WildcardType f43719a;

    public ReflectJavaWildcardType(WildcardType reflectType) {
        Intrinsics.f(reflectType, "reflectType");
        this.f43719a = reflectType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public final boolean D() {
        Type[] upperBounds = this.f43719a.getUpperBounds();
        Intrinsics.e(upperBounds, "reflectType.upperBounds");
        return !Intrinsics.a(ArraysKt.y(upperBounds), Object.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public final Type F() {
        return this.f43719a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final Collection getAnnotations() {
        return EmptyList.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public final ReflectJavaType n() {
        WildcardType wildcardType = this.f43719a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Object objK = ArraysKt.K(lowerBounds);
            Intrinsics.e(objK, "lowerBounds.single()");
            return ReflectJavaType.Factory.a((Type) objK);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Type ub = (Type) ArraysKt.K(upperBounds);
        if (Intrinsics.a(ub, Object.class)) {
            return null;
        }
        Intrinsics.e(ub, "ub");
        return ReflectJavaType.Factory.a(ub);
    }
}
