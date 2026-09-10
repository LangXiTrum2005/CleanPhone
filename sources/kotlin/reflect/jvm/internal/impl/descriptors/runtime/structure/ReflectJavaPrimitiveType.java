package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectJavaPrimitiveType extends ReflectJavaType implements JavaPrimitiveType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f43713a;

    public ReflectJavaPrimitiveType(Class reflectType) {
        Intrinsics.f(reflectType, "reflectType");
        this.f43713a = reflectType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public final Type F() {
        return this.f43713a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final Collection getAnnotations() {
        return EmptyList.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType
    public final PrimitiveType getType() {
        Class cls = Void.TYPE;
        Class cls2 = this.f43713a;
        if (Intrinsics.a(cls2, cls)) {
            return null;
        }
        return JvmPrimitiveType.b(cls2.getName()).g();
    }
}
