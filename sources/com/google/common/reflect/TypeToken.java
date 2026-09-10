package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class TypeToken<T> extends TypeCapture<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;
    public final Type X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public transient TypeResolver f20076Y;

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$1, reason: invalid class name */
    class AnonymousClass1 extends Invokable.MethodInvokable<Object> {
        @Override // com.google.common.reflect.Invokable
        public final TypeToken a() {
            return null;
        }

        @Override // com.google.common.reflect.Invokable
        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$2, reason: invalid class name */
    class AnonymousClass2 extends Invokable.ConstructorInvokable<Object> {
        @Override // com.google.common.reflect.Invokable
        public final TypeToken a() {
            return null;
        }

        @Override // com.google.common.reflect.Invokable
        public final String toString() {
            new Joiner(", ");
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$3, reason: invalid class name */
    class AnonymousClass3 extends TypeVisitor {
        @Override // com.google.common.reflect.TypeVisitor
        public final void c(GenericArrayType genericArrayType) {
            a(genericArrayType.getGenericComponentType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void d(ParameterizedType parameterizedType) {
            a(parameterizedType.getActualTypeArguments());
            a(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void e(TypeVariable typeVariable) {
            throw null;
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void f(WildcardType wildcardType) {
            a(wildcardType.getLowerBounds());
            a(wildcardType.getUpperBounds());
        }
    }

    public static class Bounds {
    }

    public final class ClassSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            throw null;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: A */
        public final Set x() {
            throw null;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public final Set B() {
            throw null;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object w() {
            throw null;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public final Collection x() {
            throw null;
        }
    }

    public final class InterfaceSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;
        public transient ImmutableSet Z;

        private Object readResolve() {
            throw null;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* JADX INFO: renamed from: A */
        public final Set x() {
            ImmutableSet immutableSet = this.Z;
            if (immutableSet != null) {
                return immutableSet;
            }
            FluentIterable fluentIterableC = FluentIterable.c(null);
            ImmutableSet immutableSetE = FluentIterable.c(Iterables.b(fluentIterableC.d(), TypeFilter.f20081Y)).e();
            this.Z = immutableSetE;
            return immutableSetE;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public final Set B() {
            throw null;
        }
    }

    public static final class SimpleTypeToken<T> extends TypeToken<T> {
        private static final long serialVersionUID = 0;
    }

    public static abstract class TypeCollector<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f20078a = new AnonymousClass1();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AnonymousClass2 f20079b = new AnonymousClass2();

        /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$TypeCollector$1, reason: invalid class name */
        public class AnonymousClass1 extends TypeCollector<TypeToken<?>> {
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Iterable c(Object obj) {
                TypeToken typeToken = (TypeToken) obj;
                Type type = typeToken.X;
                if (type instanceof TypeVariable) {
                    return TypeToken.a(((TypeVariable) type).getBounds());
                }
                if (type instanceof WildcardType) {
                    return TypeToken.a(((WildcardType) type).getUpperBounds());
                }
                ImmutableList.Builder builderS = ImmutableList.s();
                for (Type type2 : typeToken.d().getGenericInterfaces()) {
                    builderS.h(typeToken.i(type2));
                }
                return builderS.j();
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Class d(Object obj) {
                return ((TypeToken) obj).d();
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Object e(Object obj) {
                TypeToken typeToken = (TypeToken) obj;
                Type type = typeToken.X;
                if (type instanceof TypeVariable) {
                    SimpleTypeToken simpleTypeToken = new SimpleTypeToken(((TypeVariable) type).getBounds()[0]);
                    if (simpleTypeToken.d().isInterface()) {
                        return null;
                    }
                    return simpleTypeToken;
                }
                if (type instanceof WildcardType) {
                    SimpleTypeToken simpleTypeToken2 = new SimpleTypeToken(((WildcardType) type).getUpperBounds()[0]);
                    if (simpleTypeToken2.d().isInterface()) {
                        return null;
                    }
                    return simpleTypeToken2;
                }
                Type genericSuperclass = typeToken.d().getGenericSuperclass();
                if (genericSuperclass == null) {
                    return null;
                }
                return typeToken.i(genericSuperclass);
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$TypeCollector$2, reason: invalid class name */
        public class AnonymousClass2 extends TypeCollector<Class<?>> {
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Iterable c(Object obj) {
                return Arrays.asList(((Class) obj).getInterfaces());
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Class d(Object obj) {
                return (Class) obj;
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Object e(Object obj) {
                return ((Class) obj).getSuperclass();
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$TypeCollector$3, reason: invalid class name */
        class AnonymousClass3 extends ForwardingTypeCollector<Object> {
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final ImmutableList b(ImmutableCollection immutableCollection) {
                ImmutableList.Builder builderS = ImmutableList.s();
                Iterator<E> it = immutableCollection.iterator();
                if (!it.hasNext()) {
                    return super.b(builderS.j());
                }
                it.next();
                throw null;
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector.ForwardingTypeCollector, com.google.common.reflect.TypeToken.TypeCollector
            public final Iterable c(Object obj) {
                return ImmutableSet.y();
            }
        }

        public static class ForwardingTypeCollector<K> extends TypeCollector<K> {
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public Iterable c(Object obj) {
                throw null;
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Class d(Object obj) {
                throw null;
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Object e(Object obj) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int a(Object obj, HashMap map) {
            Integer num = (Integer) map.get(obj);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = d(obj).isInterface();
            Iterator<T> it = c(obj).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = Math.max(iMax, a(it.next(), map));
            }
            Object objE = e(obj);
            int iMax2 = iMax;
            if (objE != null) {
                iMax2 = Math.max(iMax, a(objE, map));
            }
            int i2 = iMax2 + 1;
            map.put(obj, Integer.valueOf(i2));
            return i2;
        }

        public ImmutableList b(ImmutableCollection immutableCollection) {
            final HashMap map = new HashMap();
            Iterator<E> it = immutableCollection.iterator();
            while (it.hasNext()) {
                a(it.next(), map);
            }
            final Ordering orderingJ = Ordering.d().j();
            return ImmutableList.D(new Ordering<Object>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    HashMap map2 = map;
                    Object obj3 = map2.get(obj);
                    Objects.requireNonNull(obj3);
                    Object obj4 = map2.get(obj2);
                    Objects.requireNonNull(obj4);
                    return orderingJ.compare(obj3, obj4);
                }
            }, map.keySet());
        }

        public abstract Iterable c(Object obj);

        public abstract Class d(Object obj);

        public abstract Object e(Object obj);
    }

    public enum TypeFilter implements Predicate<TypeToken<?>> {
        X { // from class: com.google.common.reflect.TypeToken.TypeFilter.1
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                Type type = ((TypeToken) obj).X;
                return ((type instanceof TypeVariable) || (type instanceof WildcardType)) ? false : true;
            }
        },
        f20081Y { // from class: com.google.common.reflect.TypeToken.TypeFilter.2
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return ((TypeToken) obj).d().isInterface();
            }
        }
    }

    public class TypeSet extends ForwardingSet<TypeToken<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;
        public transient ImmutableSet X;

        public TypeSet() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* JADX INFO: renamed from: A */
        public Set x() {
            ImmutableSet immutableSet = this.X;
            if (immutableSet != null) {
                return immutableSet;
            }
            FluentIterable fluentIterableC = FluentIterable.c(TypeCollector.f20078a.b(ImmutableList.z(TypeToken.this)));
            ImmutableSet immutableSetE = FluentIterable.c(Iterables.b(fluentIterableC.d(), TypeFilter.X)).e();
            this.X = immutableSetE;
            return immutableSetE;
        }

        public Set B() {
            return ImmutableSet.u(TypeCollector.f20079b.b(TypeToken.this.g()));
        }
    }

    public TypeToken(Type type) {
        type.getClass();
        this.X = type;
    }

    public static ImmutableList a(Type[] typeArr) {
        ImmutableList.Builder builderS = ImmutableList.s();
        for (Type type : typeArr) {
            SimpleTypeToken simpleTypeToken = new SimpleTypeToken(type);
            if (simpleTypeToken.d().isInterface()) {
                builderS.h(simpleTypeToken);
            }
        }
        return builderS.j();
    }

    public static TypeToken h(Class cls) {
        return new SimpleTypeToken(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Class d() {
        return (Class) g().iterator().next();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            return this.X.equals(((TypeToken) obj).X);
        }
        return false;
    }

    public final ImmutableSet g() {
        final ImmutableSet.Builder builderP = ImmutableSet.p();
        new TypeVisitor() { // from class: com.google.common.reflect.TypeToken.4
            @Override // com.google.common.reflect.TypeVisitor
            public final void b(Class cls) {
                builderP.c(cls);
            }

            @Override // com.google.common.reflect.TypeVisitor
            public final void c(GenericArrayType genericArrayType) {
                Class clsD = new SimpleTypeToken(genericArrayType.getGenericComponentType()).d();
                Joiner joiner = Types.f20084a;
                builderP.c(Array.newInstance((Class<?>) clsD, 0).getClass());
            }

            @Override // com.google.common.reflect.TypeVisitor
            public final void d(ParameterizedType parameterizedType) {
                builderP.c((Class) parameterizedType.getRawType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            public final void e(TypeVariable typeVariable) {
                a(typeVariable.getBounds());
            }

            @Override // com.google.common.reflect.TypeVisitor
            public final void f(WildcardType wildcardType) {
                a(wildcardType.getUpperBounds());
            }
        }.a(this.X);
        return builderP.k();
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final TypeToken i(Type type) {
        TypeResolver typeResolver = this.f20076Y;
        if (typeResolver == null) {
            TypeResolver typeResolver2 = new TypeResolver();
            Type type2 = this.X;
            type2.getClass();
            TypeResolver.TypeMappingIntrospector typeMappingIntrospector = new TypeResolver.TypeMappingIntrospector();
            typeMappingIntrospector.a(type2);
            ImmutableMap immutableMapE = ImmutableMap.e(typeMappingIntrospector.f20071b);
            TypeResolver.TypeTable typeTable = typeResolver2.f20070a;
            typeTable.getClass();
            ImmutableMap.Builder builderD = ImmutableMap.d();
            builderD.e(typeTable.f20072a);
            Iterator it = immutableMapE.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                TypeResolver.TypeVariableKey typeVariableKey = (TypeResolver.TypeVariableKey) entry.getKey();
                Type type3 = (Type) entry.getValue();
                typeVariableKey.getClass();
                Preconditions.g(!(type3 instanceof TypeVariable ? typeVariableKey.a((TypeVariable) type3) : false), "Type variable %s bound to itself", typeVariableKey);
                builderD.c(typeVariableKey, type3);
            }
            TypeResolver typeResolver3 = new TypeResolver(new TypeResolver.TypeTable(builderD.a(true)));
            this.f20076Y = typeResolver3;
            typeResolver = typeResolver3;
        }
        SimpleTypeToken simpleTypeToken = new SimpleTypeToken(typeResolver.a(type));
        simpleTypeToken.f20076Y = this.f20076Y;
        return simpleTypeToken;
    }

    public final String toString() {
        Joiner joiner = Types.f20084a;
        Type type = this.X;
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public Object writeReplace() {
        return new SimpleTypeToken(new TypeResolver().a(this.X));
    }
}
