package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectJavaArrayType extends ReflectJavaType implements JavaArrayType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f43700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReflectJavaType f43701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EmptyList f43702c;

    public ReflectJavaArrayType(Type reflectType) {
        ReflectJavaType reflectJavaTypeA;
        Intrinsics.f(reflectType, "reflectType");
        this.f43700a = reflectType;
        if (!(reflectType instanceof GenericArrayType)) {
            if (reflectType instanceof Class) {
                Class cls = (Class) reflectType;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    Intrinsics.e(componentType, "getComponentType()");
                    reflectJavaTypeA = ReflectJavaType.Factory.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + reflectType.getClass() + "): " + reflectType);
        }
        Type genericComponentType = ((GenericArrayType) reflectType).getGenericComponentType();
        Intrinsics.e(genericComponentType, "genericComponentType");
        reflectJavaTypeA = ReflectJavaType.Factory.a(genericComponentType);
        this.f43701b = reflectJavaTypeA;
        this.f43702c = EmptyList.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public final Type F() {
        return this.f43700a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final Collection getAnnotations() {
        return this.f43702c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
    public final ReflectJavaType u() {
        return this.f43701b;
    }
}
