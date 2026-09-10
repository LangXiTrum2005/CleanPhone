package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class TypeResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeTable f20070a;

    /* JADX INFO: renamed from: com.google.common.reflect.TypeResolver$1, reason: invalid class name */
    class AnonymousClass1 extends TypeVisitor {
        @Override // com.google.common.reflect.TypeVisitor
        public final void b(Class cls) {
            throw new IllegalArgumentException("No type mapping from " + cls + " to null");
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void c(GenericArrayType genericArrayType) {
            Joiner joiner = Types.f20084a;
            throw null;
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void d(ParameterizedType parameterizedType) {
            try {
                parameterizedType.getOwnerType();
                throw null;
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException("null is not a ParameterizedType");
            }
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void e(TypeVariable typeVariable) {
            new TypeVariableKey(typeVariable);
            throw null;
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void f(WildcardType wildcardType) {
        }
    }

    public static final class TypeMappingIntrospector extends TypeVisitor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f20071b = new HashMap();

        @Override // com.google.common.reflect.TypeVisitor
        public final void b(Class cls) {
            a(cls.getGenericSuperclass());
            a(cls.getGenericInterfaces());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void d(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Preconditions.p(typeParameters.length == actualTypeArguments.length);
            for (int i2 = 0; i2 < typeParameters.length; i2++) {
                TypeVariableKey typeVariableKey = new TypeVariableKey(typeParameters[i2]);
                Type type = actualTypeArguments[i2];
                HashMap map = this.f20071b;
                if (!map.containsKey(typeVariableKey)) {
                    Type type2 = type;
                    while (true) {
                        if (type2 == null) {
                            map.put(typeVariableKey, type);
                            break;
                        }
                        boolean z2 = type2 instanceof TypeVariable;
                        TypeVariableKey typeVariableKey2 = null;
                        if (z2 ? typeVariableKey.a((TypeVariable) type2) : false) {
                            while (type != null) {
                                type = (Type) map.remove(type instanceof TypeVariable ? new TypeVariableKey((TypeVariable) type) : null);
                            }
                            break;
                        } else {
                            if (z2) {
                                typeVariableKey2 = new TypeVariableKey((TypeVariable) type2);
                            }
                            type2 = (Type) map.get(typeVariableKey2);
                        }
                    }
                }
            }
            a(cls);
            a(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void e(TypeVariable typeVariable) {
            a(typeVariable.getBounds());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void f(WildcardType wildcardType) {
            a(wildcardType.getUpperBounds());
        }
    }

    public static final class TypeVariableKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeVariable f20075a;

        public TypeVariableKey(TypeVariable typeVariable) {
            typeVariable.getClass();
            this.f20075a = typeVariable;
        }

        public final boolean a(TypeVariable typeVariable) {
            TypeVariable typeVariable2 = this.f20075a;
            return typeVariable2.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && typeVariable2.getName().equals(typeVariable.getName());
        }

        public final boolean equals(Object obj) {
            if (obj instanceof TypeVariableKey) {
                return a(((TypeVariableKey) obj).f20075a);
            }
            return false;
        }

        public final int hashCode() {
            TypeVariable typeVariable = this.f20075a;
            return Arrays.hashCode(new Object[]{typeVariable.getGenericDeclaration(), typeVariable.getName()});
        }

        public final String toString() {
            return this.f20075a.toString();
        }
    }

    public static class WildcardCapturer {

        /* JADX INFO: renamed from: com.google.common.reflect.TypeResolver$WildcardCapturer$1, reason: invalid class name */
        class AnonymousClass1 extends WildcardCapturer {
        }

        static {
            new AtomicInteger();
        }
    }

    public TypeResolver() {
        this.f20070a = new TypeTable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.common.reflect.TypeResolver$TypeTable$1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Type a(Type type) {
        type.getClass();
        if (type instanceof TypeVariable) {
            final TypeVariable typeVariable = (TypeVariable) type;
            final TypeTable typeTable = this.f20070a;
            typeTable.getClass();
            return typeTable.a(typeVariable, new TypeTable() { // from class: com.google.common.reflect.TypeResolver.TypeTable.1
                @Override // com.google.common.reflect.TypeResolver.TypeTable
                public final Type a(TypeVariable typeVariable2, AnonymousClass1 anonymousClass1) {
                    return typeVariable2.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) ? typeVariable2 : typeTable.a(typeVariable2, anonymousClass1);
                }
            });
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            return Types.e(ownerType == null ? null : a(ownerType), (Class) a(parameterizedType.getRawType()), b(parameterizedType.getActualTypeArguments()));
        }
        if (type instanceof GenericArrayType) {
            return Types.c(a(((GenericArrayType) type).getGenericComponentType()));
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new Types.WildcardTypeImpl(b(wildcardType.getLowerBounds()), b(wildcardType.getUpperBounds()));
    }

    public final Type[] b(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i2 = 0; i2 < typeArr.length; i2++) {
            typeArr2[i2] = a(typeArr[i2]);
        }
        return typeArr2;
    }

    public static class TypeTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableMap f20072a;

        public TypeTable() {
            this.f20072a = ImmutableMap.o();
        }

        public Type a(TypeVariable typeVariable, AnonymousClass1 anonymousClass1) {
            Type type = (Type) this.f20072a.get(new TypeVariableKey(typeVariable));
            if (type != null) {
                return new TypeResolver(anonymousClass1).a(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length != 0) {
                Type[] typeArrB = new TypeResolver(anonymousClass1).b(bounds);
                if (!Types.NativeTypeVariableEquals.f20088a || !Arrays.equals(bounds, typeArrB)) {
                    return Types.d(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrB);
                }
            }
            return typeVariable;
        }

        public TypeTable(ImmutableMap immutableMap) {
            this.f20072a = immutableMap;
        }
    }

    public TypeResolver(TypeTable typeTable) {
        this.f20070a = typeTable;
    }
}
