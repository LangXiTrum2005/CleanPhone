package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.UnmodifiableListIterator;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class Types {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Joiner f20084a = new Joiner(", ").f();

    public enum ClassOwnership {
        /* JADX INFO: Fake field, exist only in values array */
        EF4 { // from class: com.google.common.reflect.Types.ClassOwnership.1
            @Override // com.google.common.reflect.Types.ClassOwnership
            public final Class a(Class cls) {
                return cls.getEnclosingClass();
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF9 { // from class: com.google.common.reflect.Types.ClassOwnership.2
            @Override // com.google.common.reflect.Types.ClassOwnership
            public final Class a(Class cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };

        public static final ClassOwnership X;

        /* JADX INFO: renamed from: com.google.common.reflect.Types$ClassOwnership$1LocalClass, reason: invalid class name */
        class C1LocalClass<T> {
        }

        /* JADX INFO: renamed from: com.google.common.reflect.Types$ClassOwnership$3, reason: invalid class name */
        class AnonymousClass3 extends C1LocalClass<String> {
        }

        static {
            ParameterizedType parameterizedType = (ParameterizedType) AnonymousClass3.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            for (ClassOwnership classOwnership : values()) {
                if (classOwnership.a(C1LocalClass.class) == parameterizedType.getOwnerType()) {
                    X = classOwnership;
                    return;
                }
            }
            throw new AssertionError();
        }

        public abstract Class a(Class cls);
    }

    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        public final Type X;

        public GenericArrayTypeImpl(Type type) {
            this.X = JavaVersion.Z.f(type);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType)) {
                return false;
            }
            return com.google.common.base.Objects.a(this.X, ((GenericArrayType) obj).getGenericComponentType());
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.X;
        }

        public final int hashCode() {
            return this.X.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            Joiner joiner = Types.f20084a;
            Type type = this.X;
            return android.support.v4.media.a.r(sb, type instanceof Class ? ((Class) type).getName() : type.toString(), "[]");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class JavaVersion {
        public static final AnonymousClass2 X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final AnonymousClass3 f20087Y;
        public static final JavaVersion Z;
        public static final /* synthetic */ JavaVersion[] e0;

        /* JADX INFO: renamed from: com.google.common.reflect.Types$JavaVersion$2, reason: invalid class name */
        public final enum AnonymousClass2 extends JavaVersion {
            public AnonymousClass2() {
                super("JAVA7", 1);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public final Type a(Type type) {
                if (!(type instanceof Class)) {
                    return new GenericArrayTypeImpl(type);
                }
                Joiner joiner = Types.f20084a;
                return Array.newInstance((Class<?>) type, 0).getClass();
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public final Type f(Type type) {
                type.getClass();
                return type;
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.Types$JavaVersion$3, reason: invalid class name */
        public final enum AnonymousClass3 extends JavaVersion {
            public AnonymousClass3() {
                super("JAVA8", 2);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public final Type a(Type type) {
                return JavaVersion.X.a(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public final String b(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException(e3);
                }
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public final Type f(Type type) {
                type.getClass();
                return type;
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.Types$JavaVersion$5, reason: invalid class name */
        public class AnonymousClass5 extends TypeCapture<Map.Entry<String, int[][]>> {
        }

        /* JADX INFO: renamed from: com.google.common.reflect.Types$JavaVersion$6, reason: invalid class name */
        public class AnonymousClass6 extends TypeCapture<int[]> {
        }

        static {
            JavaVersion javaVersion = new JavaVersion() { // from class: com.google.common.reflect.Types.JavaVersion.1
                @Override // com.google.common.reflect.Types.JavaVersion
                public final Type a(Type type) {
                    return new GenericArrayTypeImpl(type);
                }

                @Override // com.google.common.reflect.Types.JavaVersion
                public final Type f(Type type) {
                    type.getClass();
                    if (!(type instanceof Class)) {
                        return type;
                    }
                    Class cls = (Class) type;
                    return cls.isArray() ? new GenericArrayTypeImpl(cls.getComponentType()) : type;
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            X = anonymousClass2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3();
            f20087Y = anonymousClass3;
            JavaVersion javaVersion2 = new JavaVersion() { // from class: com.google.common.reflect.Types.JavaVersion.4
                @Override // com.google.common.reflect.Types.JavaVersion
                public final Type a(Type type) {
                    return JavaVersion.X.a(type);
                }

                @Override // com.google.common.reflect.Types.JavaVersion
                public final String b(Type type) {
                    return JavaVersion.f20087Y.b(type);
                }

                @Override // com.google.common.reflect.Types.JavaVersion
                public final Type f(Type type) {
                    type.getClass();
                    return type;
                }
            };
            e0 = new JavaVersion[]{javaVersion, anonymousClass2, anonymousClass3, javaVersion2};
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                Type genericSuperclass = AnonymousClass5.class.getGenericSuperclass();
                Preconditions.g(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
                if (((ParameterizedType) genericSuperclass).getActualTypeArguments()[0].toString().contains("java.util.Map.java.util.Map")) {
                    Z = anonymousClass3;
                    return;
                } else {
                    Z = javaVersion2;
                    return;
                }
            }
            Type genericSuperclass2 = AnonymousClass6.class.getGenericSuperclass();
            Preconditions.g(genericSuperclass2 instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass2);
            if (((ParameterizedType) genericSuperclass2).getActualTypeArguments()[0] instanceof Class) {
                Z = anonymousClass2;
            } else {
                Z = javaVersion;
            }
        }

        public static JavaVersion valueOf(String str) {
            return (JavaVersion) Enum.valueOf(JavaVersion.class, str);
        }

        public static JavaVersion[] values() {
            return (JavaVersion[]) e0.clone();
        }

        public abstract Type a(Type type);

        public String b(Type type) {
            Joiner joiner = Types.f20084a;
            return type instanceof Class ? ((Class) type).getName() : type.toString();
        }

        public final ImmutableList d(Type[] typeArr) {
            ImmutableList.Builder builderS = ImmutableList.s();
            for (Type type : typeArr) {
                builderS.h(f(type));
            }
            return builderS.j();
        }

        public abstract Type f(Type type);
    }

    public static final class NativeTypeVariableEquals<X> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final boolean f20088a = !NativeTypeVariableEquals.class.getTypeParameters()[0].equals(Types.d(NativeTypeVariableEquals.class, "X", new Type[0]));
    }

    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        public final Type X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ImmutableList f20089Y;
        public final Class Z;

        public ParameterizedTypeImpl(Type type, Class cls, Type[] typeArr) {
            cls.getClass();
            Preconditions.f(typeArr.length == cls.getTypeParameters().length);
            Types.b(typeArr, "type parameter");
            this.X = type;
            this.Z = cls;
            this.f20089Y = JavaVersion.Z.d(typeArr);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                if (this.Z.equals(parameterizedType.getRawType())) {
                    if (com.google.common.base.Objects.a(this.X, parameterizedType.getOwnerType())) {
                        ImmutableList immutableList = this.f20089Y;
                        Joiner joiner = Types.f20084a;
                        if (Arrays.equals((Type[]) immutableList.toArray(new Type[0]), parameterizedType.getActualTypeArguments())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            ImmutableList immutableList = this.f20089Y;
            Joiner joiner = Types.f20084a;
            return (Type[]) immutableList.toArray(new Type[0]);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.X;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.Z;
        }

        public final int hashCode() {
            Type type = this.X;
            return ((type == null ? 0 : type.hashCode()) ^ this.f20089Y.hashCode()) ^ this.Z.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            Type type = this.X;
            if (type != null) {
                JavaVersion javaVersion = JavaVersion.Z;
                javaVersion.getClass();
                if (!(javaVersion instanceof JavaVersion.AnonymousClass4)) {
                    sb.append(javaVersion.b(type));
                    sb.append('.');
                }
            }
            sb.append(this.Z.getName());
            sb.append('<');
            Joiner joiner = Types.f20084a;
            ImmutableList immutableList = this.f20089Y;
            final JavaVersion javaVersion2 = JavaVersion.Z;
            Objects.requireNonNull(javaVersion2);
            sb.append(joiner.c(Iterables.h(immutableList, new Function() { // from class: com.google.common.reflect.b
                @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
                public final Object apply(Object obj) {
                    return javaVersion2.b((Type) obj);
                }
            })));
            sb.append('>');
            return sb.toString();
        }
    }

    public static final class TypeVariableImpl<D extends GenericDeclaration> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GenericDeclaration f20090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImmutableList f20092c;

        public TypeVariableImpl(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
            Types.b(typeArr, "bound for type variable");
            genericDeclaration.getClass();
            this.f20090a = genericDeclaration;
            str.getClass();
            this.f20091b = str;
            this.f20092c = ImmutableList.v(typeArr);
        }

        public final boolean equals(Object obj) {
            boolean z2 = NativeTypeVariableEquals.f20088a;
            GenericDeclaration genericDeclaration = this.f20090a;
            String str = this.f20091b;
            if (!z2) {
                if (obj instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable) obj;
                    if (str.equals(typeVariable.getName()) && genericDeclaration.equals(typeVariable.getGenericDeclaration())) {
                        return true;
                    }
                }
                return false;
            }
            if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof TypeVariableInvocationHandler)) {
                TypeVariableImpl typeVariableImpl = ((TypeVariableInvocationHandler) Proxy.getInvocationHandler(obj)).f20094a;
                if (str.equals(typeVariableImpl.f20091b) && genericDeclaration.equals(typeVariableImpl.f20090a) && this.f20092c.equals(typeVariableImpl.f20092c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f20090a.hashCode() ^ this.f20091b.hashCode();
        }

        public final String toString() {
            return this.f20091b;
        }
    }

    public static final class TypeVariableInvocationHandler implements InvocationHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ImmutableMap f20093b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeVariableImpl f20094a;

        static {
            ImmutableMap.Builder builderD = ImmutableMap.d();
            for (Method method : TypeVariableImpl.class.getMethods()) {
                if (method.getDeclaringClass().equals(TypeVariableImpl.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    builderD.c(method.getName(), method);
                }
            }
            f20093b = builderD.a(false);
        }

        public TypeVariableInvocationHandler(TypeVariableImpl typeVariableImpl) {
            this.f20094a = typeVariableImpl;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = (Method) f20093b.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f20094a, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableList X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ImmutableList f20095Y;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Types.b(typeArr, "lower bound for wildcard");
            Types.b(typeArr2, "upper bound for wildcard");
            JavaVersion javaVersion = JavaVersion.Z;
            this.X = javaVersion.d(typeArr);
            this.f20095Y = javaVersion.d(typeArr2);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) obj;
                if (this.X.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.f20095Y.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            ImmutableList immutableList = this.X;
            Joiner joiner = Types.f20084a;
            return (Type[]) immutableList.toArray(new Type[0]);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            ImmutableList immutableList = this.f20095Y;
            Joiner joiner = Types.f20084a;
            return (Type[]) immutableList.toArray(new Type[0]);
        }

        public final int hashCode() {
            return this.X.hashCode() ^ this.f20095Y.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("?");
            UnmodifiableListIterator unmodifiableListIteratorListIterator = this.X.listIterator(0);
            while (unmodifiableListIteratorListIterator.hasNext()) {
                Type type = (Type) unmodifiableListIteratorListIterator.next();
                sb.append(" super ");
                sb.append(JavaVersion.Z.b(type));
            }
            ImmutableList immutableList = this.f20095Y;
            Joiner joiner = Types.f20084a;
            for (Type type2 : Iterables.b(immutableList, Predicates.h(Predicates.e(Object.class)))) {
                sb.append(" extends ");
                sb.append(JavaVersion.Z.b(type2));
            }
            return sb.toString();
        }
    }

    public static Type a(Type[] typeArr) {
        for (Type type : typeArr) {
            type.getClass();
            final AtomicReference atomicReference = new AtomicReference();
            new TypeVisitor() { // from class: com.google.common.reflect.Types.1
                @Override // com.google.common.reflect.TypeVisitor
                public final void b(Class cls) {
                    atomicReference.set(cls.getComponentType());
                }

                @Override // com.google.common.reflect.TypeVisitor
                public final void c(GenericArrayType genericArrayType) {
                    atomicReference.set(genericArrayType.getGenericComponentType());
                }

                @Override // com.google.common.reflect.TypeVisitor
                public final void e(TypeVariable typeVariable) {
                    atomicReference.set(Types.a(typeVariable.getBounds()));
                }

                @Override // com.google.common.reflect.TypeVisitor
                public final void f(WildcardType wildcardType) {
                    atomicReference.set(Types.a(wildcardType.getUpperBounds()));
                }
            }.a(type);
            Type type2 = (Type) atomicReference.get();
            if (type2 != null) {
                if (type2 instanceof Class) {
                    Class cls = (Class) type2;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return new WildcardTypeImpl(new Type[0], new Type[]{type2});
            }
        }
        return null;
    }

    public static void b(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                Preconditions.h(!cls.isPrimitive(), "Primitive type '%s' used as %s", cls, str);
            }
        }
    }

    public static Type c(Type type) {
        if (!(type instanceof WildcardType)) {
            return JavaVersion.Z.a(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Preconditions.e("Wildcard cannot have more than one lower bounds.", lowerBounds.length <= 1);
        if (lowerBounds.length == 1) {
            return new WildcardTypeImpl(new Type[]{c(lowerBounds[0])}, new Type[]{Object.class});
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        Preconditions.e("Wildcard should have only one upper bound.", upperBounds.length == 1);
        return new WildcardTypeImpl(new Type[0], new Type[]{c(upperBounds[0])});
    }

    public static TypeVariable d(GenericDeclaration genericDeclaration, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        TypeVariableInvocationHandler typeVariableInvocationHandler = new TypeVariableInvocationHandler(new TypeVariableImpl(genericDeclaration, str, typeArr));
        Preconditions.g(TypeVariable.class.isInterface(), "%s is not an interface", TypeVariable.class);
        return (TypeVariable) TypeVariable.class.cast(Proxy.newProxyInstance(TypeVariable.class.getClassLoader(), new Class[]{TypeVariable.class}, typeVariableInvocationHandler));
    }

    public static ParameterizedType e(Type type, Class cls, Type... typeArr) {
        if (type == null) {
            return new ParameterizedTypeImpl(ClassOwnership.X.a(cls), cls, typeArr);
        }
        Preconditions.g(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new ParameterizedTypeImpl(type, cls, typeArr);
    }
}
