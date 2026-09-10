package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ReflectJavaMember extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaMember {
    public abstract Member F();

    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    public final ArrayList G(Type[] typeArr, Annotation[][] annotationArr, boolean z2) throws IllegalAccessException, InvocationTargetException {
        Method method;
        ArrayList arrayList;
        String str;
        boolean z3;
        Java8ParameterNamesLoader.Cache cache;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        Java8ParameterNamesLoader java8ParameterNamesLoader = Java8ParameterNamesLoader.f43689a;
        Member member = F();
        Intrinsics.f(member, "member");
        Java8ParameterNamesLoader.Cache cache2 = Java8ParameterNamesLoader.f43690b;
        if (cache2 == null) {
            synchronized (java8ParameterNamesLoader) {
                cache2 = Java8ParameterNamesLoader.f43690b;
                if (cache2 == null) {
                    Class<?> cls = member.getClass();
                    try {
                        cache = new Java8ParameterNamesLoader.Cache(cls.getMethod("getParameters", new Class[0]), ReflectClassUtilKt.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
                    } catch (NoSuchMethodException unused) {
                        cache = new Java8ParameterNamesLoader.Cache(null, null);
                    }
                    Java8ParameterNamesLoader.f43690b = cache;
                    cache2 = cache;
                }
            }
        }
        Method method2 = cache2.f43691a;
        if (method2 == null || (method = cache2.f43692b) == null) {
            arrayList = null;
        } else {
            Object objInvoke = method2.invoke(member, new Object[0]);
            Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) objInvoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object objInvoke2 = method.invoke(obj, new Object[0]);
                Intrinsics.d(objInvoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) objInvoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            ReflectJavaType reflectJavaTypeA = ReflectJavaType.Factory.a(typeArr[i2]);
            if (arrayList != null) {
                str = (String) CollectionsKt.B(i2 + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i2 + '+' + size + " (name=" + getName() + " type=" + reflectJavaTypeA + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z2) {
                z3 = true;
                if (i2 != typeArr.length - 1) {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            arrayList2.add(new ReflectJavaValueParameter(reflectJavaTypeA, annotationArr[i2], str, z3));
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final JavaAnnotation b(FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        Member memberF = F();
        Intrinsics.d(memberF, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberF).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return ReflectJavaAnnotationOwnerKt.a(declaredAnnotations, fqName);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ReflectJavaMember) && Intrinsics.a(F(), ((ReflectJavaMember) obj).F());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final boolean f() {
        return Modifier.isStatic(F().getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final Collection getAnnotations() {
        Member memberF = F();
        Intrinsics.d(memberF, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberF).getDeclaredAnnotations();
        return declaredAnnotations != null ? ReflectJavaAnnotationOwnerKt.b(declaredAnnotations) : EmptyList.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public final Name getName() {
        String name = F().getName();
        Name nameG = name != null ? Name.g(name) : null;
        return nameG == null ? SpecialNames.f44173a : nameG;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final Visibility getVisibility() {
        int modifiers = F().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return Visibilities.Public.f43602c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return Visibilities.Private.f43599c;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? JavaVisibilities.ProtectedStaticVisibility.f43667c : JavaVisibilities.ProtectedAndPackage.f43666c;
        }
        return JavaVisibilities.PackageVisibility.f43665c;
    }

    public final int hashCode() {
        return F().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final boolean isAbstract() {
        return Modifier.isAbstract(F().getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final boolean isFinal() {
        return Modifier.isFinal(F().getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember
    public final ReflectJavaClass j() {
        Class<?> declaringClass = F().getDeclaringClass();
        Intrinsics.e(declaringClass, "member.declaringClass");
        return new ReflectJavaClass(declaringClass);
    }

    public final String toString() {
        return getClass().getName() + ": " + F();
    }
}
