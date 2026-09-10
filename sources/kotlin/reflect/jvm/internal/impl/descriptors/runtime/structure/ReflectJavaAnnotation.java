package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectJavaAnnotation extends ReflectJavaElement implements JavaAnnotation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Annotation f43696a;

    public ReflectJavaAnnotation(Annotation annotation) {
        Intrinsics.f(annotation, "annotation");
        this.f43696a = annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public final ClassId a() {
        return ReflectClassUtilKt.a(JvmClassMappingKt.b(JvmClassMappingKt.a(this.f43696a)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ReflectJavaAnnotation) {
            return this.f43696a == ((ReflectJavaAnnotation) obj).f43696a;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public final ArrayList getArguments() throws IllegalAccessException, InvocationTargetException {
        Annotation annotation = this.f43696a;
        Method[] declaredMethods = JvmClassMappingKt.b(JvmClassMappingKt.a(annotation)).getDeclaredMethods();
        Intrinsics.e(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, new Object[0]);
            Intrinsics.e(objInvoke, "method.invoke(annotation)");
            arrayList.add(ReflectJavaAnnotationArgument.Factory.a(objInvoke, Name.g(method.getName())));
        }
        return arrayList;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f43696a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public final ReflectJavaClass q() {
        return new ReflectJavaClass(JvmClassMappingKt.b(JvmClassMappingKt.a(this.f43696a)));
    }

    public final String toString() {
        return ReflectJavaAnnotation.class.getName() + ": " + this.f43696a;
    }
}
