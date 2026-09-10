package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectJavaClass extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaClass {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f43703a;

    public ReflectJavaClass(Class klass) {
        Intrinsics.f(klass, "klass");
        this.f43703a = klass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final boolean C() {
        return this.f43703a.isInterface();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final JavaAnnotation b(FqName fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.f(fqName, "fqName");
        Class cls = this.f43703a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ReflectJavaAnnotationOwnerKt.a(declaredAnnotations, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final FqName c() {
        return ReflectClassUtilKt.a(this.f43703a).b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final Collection d() {
        Class cls = this.f43703a;
        if (Intrinsics.a(cls, Object.class)) {
            return EmptyList.X;
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        Type genericSuperclass = cls.getGenericSuperclass();
        spreadBuilder.a(genericSuperclass != null ? genericSuperclass : Object.class);
        Type[] genericInterfaces = cls.getGenericInterfaces();
        Intrinsics.e(genericInterfaces, "klass.genericInterfaces");
        spreadBuilder.b(genericInterfaces);
        ArrayList arrayList = spreadBuilder.f43336a;
        List listI = CollectionsKt.I(arrayList.toArray(new Type[arrayList.size()]));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(listI, 10));
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ReflectJavaClassifierType((Type) it.next()));
        }
        return arrayList2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ReflectJavaClass) {
            return Intrinsics.a(this.f43703a, ((ReflectJavaClass) obj).f43703a);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final boolean f() {
        return Modifier.isStatic(this.f43703a.getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final ArrayList g() {
        Class clazz = this.f43703a;
        Intrinsics.f(clazz, "clazz");
        Method method = Java16SealedRecordLoader.a().d;
        Object[] objArr = method == null ? null : (Object[]) method.invoke(clazz, new Object[0]);
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new ReflectJavaRecordComponent(obj));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.f43703a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? EmptyList.X : ReflectJavaAnnotationOwnerKt.b(declaredAnnotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final Collection getFields() {
        Field[] declaredFields = this.f43703a.getDeclaredFields();
        Intrinsics.e(declaredFields, "klass.declaredFields");
        return SequencesKt.v(SequencesKt.o(SequencesKt.h(ArraysKt.f(declaredFields), ReflectJavaClass$fields$1.X), ReflectJavaClass$fields$2.X));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public final Name getName() {
        return Name.g(this.f43703a.getSimpleName());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f43703a.getTypeParameters();
        Intrinsics.e(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final Visibility getVisibility() {
        int modifiers = this.f43703a.getModifiers();
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
        return this.f43703a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final Collection i() {
        Constructor<?>[] declaredConstructors = this.f43703a.getDeclaredConstructors();
        Intrinsics.e(declaredConstructors, "klass.declaredConstructors");
        return SequencesKt.v(SequencesKt.o(SequencesKt.h(ArraysKt.f(declaredConstructors), ReflectJavaClass$constructors$1.X), ReflectJavaClass$constructors$2.X));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final boolean isAbstract() {
        return Modifier.isAbstract(this.f43703a.getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final boolean isFinal() {
        return Modifier.isFinal(this.f43703a.getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final boolean k() {
        return this.f43703a.isAnnotation();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final ReflectJavaClass l() {
        Class<?> declaringClass = this.f43703a.getDeclaringClass();
        if (declaringClass != null) {
            return new ReflectJavaClass(declaringClass);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final boolean m() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        Class clazz = this.f43703a;
        Intrinsics.f(clazz, "clazz");
        Method method = Java16SealedRecordLoader.a().f43688c;
        if (method == null) {
            bool = null;
        } else {
            Object objInvoke = method.invoke(clazz, new Object[0]);
            Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final boolean p() {
        return this.f43703a.isEnum();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final boolean r() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        Class clazz = this.f43703a;
        Intrinsics.f(clazz, "clazz");
        Method method = Java16SealedRecordLoader.a().f43686a;
        if (method == null) {
            bool = null;
        } else {
            Object objInvoke = method.invoke(clazz, new Object[0]);
            Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final Collection t() {
        Class<?>[] declaredClasses = this.f43703a.getDeclaredClasses();
        Intrinsics.e(declaredClasses, "klass.declaredClasses");
        return SequencesKt.v(SequencesKt.p(SequencesKt.h(ArraysKt.f(declaredClasses), ReflectJavaClass$innerClassNames$1.X), ReflectJavaClass$innerClassNames$2.X));
    }

    public final String toString() {
        return ReflectJavaClass.class.getName() + ": " + this.f43703a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final Collection v() {
        Method[] declaredMethods = this.f43703a.getDeclaredMethods();
        Intrinsics.e(declaredMethods, "klass.declaredMethods");
        return SequencesKt.v(SequencesKt.o(SequencesKt.g(ArraysKt.f(declaredMethods), new Function1<Method, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$methods$1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0046  */
            /* JADX WARN: Code duplicated, block: B:17:0x0049  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zEquals;
                Method method = (Method) obj;
                boolean z2 = false;
                if (!method.isSynthetic()) {
                    if (this.X.f43703a.isEnum()) {
                        String name = method.getName();
                        if (Intrinsics.a(name, "values")) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            Intrinsics.e(parameterTypes, "method.parameterTypes");
                            if (parameterTypes.length == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (Intrinsics.a(name, "valueOf")) {
                            zEquals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                        } else {
                            zEquals = false;
                        }
                        if (!zEquals) {
                            z2 = true;
                        }
                    } else {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            }
        }), ReflectJavaClass$methods$2.X));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final Collection w() throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        Class clazz = this.f43703a;
        Intrinsics.f(clazz, "clazz");
        Method method = Java16SealedRecordLoader.a().f43687b;
        if (method == null) {
            clsArr = null;
        } else {
            Object objInvoke = method.invoke(clazz, new Object[0]);
            Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) objInvoke;
        }
        if (clsArr == null) {
            return EmptyList.X;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class cls : clsArr) {
            arrayList.add(new ReflectJavaClassifierType(cls));
        }
        return arrayList;
    }
}
