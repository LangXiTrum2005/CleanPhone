package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ReflectJavaType implements JavaType {

    public static final class Factory {
        public static ReflectJavaType a(Type type) {
            Intrinsics.f(type, "type");
            boolean z2 = type instanceof Class;
            if (z2) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new ReflectJavaPrimitiveType(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z2 && ((Class) type).isArray())) {
                return new ReflectJavaArrayType(type);
            }
            return type instanceof WildcardType ? new ReflectJavaWildcardType((WildcardType) type) : new ReflectJavaClassifierType(type);
        }
    }

    public abstract Type F();

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public JavaAnnotation b(FqName fqName) {
        Object next;
        Intrinsics.f(fqName, "fqName");
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.a(((JavaAnnotation) next).a().b(), fqName)) {
                return (JavaAnnotation) next;
            }
        }
        next = null;
        return (JavaAnnotation) next;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ReflectJavaType) && Intrinsics.a(F(), ((ReflectJavaType) obj).F());
    }

    public final int hashCode() {
        return F().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + F();
    }
}
