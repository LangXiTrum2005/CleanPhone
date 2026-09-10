package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: loaded from: classes7.dex */
final class ReflectClassStructure {
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    public static ClassLiteralValue a(Class cls) {
        int i2 = 0;
        while (cls.isArray()) {
            i2++;
            cls = cls.getComponentType();
            Intrinsics.e(cls, "currentClass.componentType");
        }
        if (cls.isPrimitive()) {
            if (cls.equals(Void.TYPE)) {
                return new ClassLiteralValue(ClassId.j(StandardNames.FqNames.d.g()), i2);
            }
            PrimitiveType primitiveTypeG = JvmPrimitiveType.b(cls.getName()).g();
            Intrinsics.e(primitiveTypeG, "get(currentClass.name).primitiveType");
            return i2 > 0 ? new ClassLiteralValue(ClassId.j((FqName) primitiveTypeG.e0.getX()), i2 - 1) : new ClassLiteralValue(ClassId.j((FqName) primitiveTypeG.Z.getX()), i2);
        }
        ClassId classIdA = ReflectClassUtilKt.a(cls);
        String str = JavaToKotlinClassMap.f43521a;
        ClassId classId = (ClassId) JavaToKotlinClassMap.f43525h.get(classIdA.b().i());
        if (classId != null) {
            classIdA = classId;
        }
        return new ClassLiteralValue(classIdA, i2);
    }

    public static void b(Class klass, KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor) throws InvocationTargetException {
        Intrinsics.f(klass, "klass");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        Intrinsics.e(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            Intrinsics.e(annotation, "annotation");
            c(annotationVisitor, annotation);
        }
        annotationVisitor.a();
    }

    public static void c(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, Annotation annotation) throws InvocationTargetException {
        Class clsB = JvmClassMappingKt.b(JvmClassMappingKt.a(annotation));
        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorB = annotationVisitor.b(ReflectClassUtilKt.a(clsB), new ReflectAnnotationSource(annotation));
        if (annotationArgumentVisitorB != null) {
            d(annotationArgumentVisitorB, annotation, clsB);
        }
    }

    public static void d(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.e(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, new Object[0]);
                Intrinsics.c(objInvoke);
                Name nameG = Name.g(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    annotationArgumentVisitor.d(nameG, a((Class) objInvoke));
                } else if (ReflectKotlinClassKt.f43676a.contains(enclosingClass)) {
                    annotationArgumentVisitor.e(objInvoke, nameG);
                } else {
                    List list = ReflectClassUtilKt.f43693a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        Intrinsics.e(enclosingClass, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                        annotationArgumentVisitor.c(nameG, ReflectClassUtilKt.a(enclosingClass), Name.g(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        Intrinsics.e(interfaces, "clazz.interfaces");
                        Class annotationClass = (Class) ArraysKt.K(interfaces);
                        Intrinsics.e(annotationClass, "annotationClass");
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorB = annotationArgumentVisitor.b(ReflectClassUtilKt.a(annotationClass), nameG);
                        if (annotationArgumentVisitorB != null) {
                            d(annotationArgumentVisitorB, (Annotation) objInvoke, annotationClass);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor annotationArrayArgumentVisitorF = annotationArgumentVisitor.f(nameG);
                        if (annotationArrayArgumentVisitorF != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                ClassId classIdA = ReflectClassUtilKt.a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    annotationArrayArgumentVisitorF.d(classIdA, Name.g(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    Intrinsics.d(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    annotationArrayArgumentVisitorF.e(a((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorB2 = annotationArrayArgumentVisitorF.b(ReflectClassUtilKt.a(componentType));
                                    if (annotationArgumentVisitorB2 != null) {
                                        Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        d(annotationArgumentVisitorB2, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    annotationArrayArgumentVisitorF.c(obj4);
                                }
                            }
                            annotationArrayArgumentVisitorF.a();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        annotationArgumentVisitor.a();
    }
}
