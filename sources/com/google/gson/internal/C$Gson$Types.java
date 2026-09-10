package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.google.gson.internal.$Gson$Types, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C$Gson$Types {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Type[] f21207a = new Type[0];

    /* JADX INFO: renamed from: com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl */
    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        public final Type X;

        public GenericArrayTypeImpl(Type type) {
            Objects.requireNonNull(type);
            this.X = C$Gson$Types.b(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C$Gson$Types.e(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.X;
        }

        public final int hashCode() {
            return this.X.hashCode();
        }

        public final String toString() {
            return C$Gson$Types.j(this.X) + "[]";
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl */
    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        public final Type X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Type f21208Y;
        public final Type[] Z;

        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
            Objects.requireNonNull(type2);
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                boolean z3 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z3) {
                    z2 = false;
                }
                C$Gson$Preconditions.a(z2);
            }
            this.X = type == null ? null : C$Gson$Types.b(type);
            this.f21208Y = C$Gson$Types.b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.Z = typeArr2;
            int length = typeArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                Objects.requireNonNull(this.Z[i2]);
                C$Gson$Types.c(this.Z[i2]);
                Type[] typeArr3 = this.Z;
                typeArr3[i2] = C$Gson$Types.b(typeArr3[i2]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C$Gson$Types.e(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.Z.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.X;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f21208Y;
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.Z) ^ this.f21208Y.hashCode();
            Type type = this.X;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.Z;
            int length = typeArr.length;
            Type type = this.f21208Y;
            if (length == 0) {
                return C$Gson$Types.j(type);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C$Gson$Types.j(type));
            sb.append("<");
            sb.append(C$Gson$Types.j(typeArr[0]));
            for (int i2 = 1; i2 < length; i2++) {
                sb.append(", ");
                sb.append(C$Gson$Types.j(typeArr[i2]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.$Gson$Types$WildcardTypeImpl */
    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        public final Type X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Type f21209Y;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            C$Gson$Preconditions.a(typeArr2.length <= 1);
            C$Gson$Preconditions.a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                C$Gson$Types.c(typeArr[0]);
                this.f21209Y = null;
                this.X = C$Gson$Types.b(typeArr[0]);
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            C$Gson$Types.c(typeArr2[0]);
            C$Gson$Preconditions.a(typeArr[0] == Object.class);
            this.f21209Y = C$Gson$Types.b(typeArr2[0]);
            this.X = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C$Gson$Types.e(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f21209Y;
            return type != null ? new Type[]{type} : C$Gson$Types.f21207a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.X};
        }

        public final int hashCode() {
            Type type = this.f21209Y;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.X.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f21209Y;
            if (type != null) {
                return "? super " + C$Gson$Types.j(type);
            }
            Type type2 = this.X;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + C$Gson$Types.j(type2);
        }
    }

    public static GenericArrayType a(Type type) {
        return new GenericArrayTypeImpl(type);
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new GenericArrayTypeImpl(b(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void c(Type type) {
        C$Gson$Preconditions.a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static boolean d(Type type, Type type2) {
        if (type != type2) {
            return type != null && type.equals(type2);
        }
        return true;
    }

    public static boolean e(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type f(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return f(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class g(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C$Gson$Preconditions.a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return g(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? AbstractJsonLexerKt.NULL : type.getClass().getName()));
    }

    public static ParameterizedType h(Type type, Type... typeArr) {
        return new ParameterizedTypeImpl(null, type, typeArr);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0098  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x0106  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    /* JADX WARN: Code duplicated, block: B:76:0x0128  */
    /* JADX WARN: Code duplicated, block: B:77:0x012f  */
    /* JADX WARN: Code duplicated, block: B:92:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.google.gson.internal.$Gson$Types$WildcardTypeImpl] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.google.gson.internal.$Gson$Types$WildcardTypeImpl] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static Type i(Type type, Class cls, Type type2, HashMap map) {
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeI;
        Type[] upperBounds2;
        Type typeI2;
        Type[] lowerBounds2;
        Type typeI3;
        boolean z2;
        Type[] actualTypeArguments;
        int length;
        Type parameterizedTypeImpl;
        Type typeI4;
        Type genericComponentType;
        Type typeI5;
        TypeVariable typeVariable;
        TypeVariable typeVariable2 = null;
        do {
            if (!(type2 instanceof TypeVariable)) {
                if (!(type2 instanceof Class)) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1) {
                                    break;
                                }
                                if (typeI instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeI).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeI};
                                }
                                type2 = new WildcardTypeImpl(upperBounds2, f21207a);
                                break;
                            }
                            typeI2 = i(type, cls, lowerBounds[0], map);
                            if (typeI2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeI2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeI2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeI2};
                            }
                            type2 = new WildcardTypeImpl(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        typeI3 = i(type, cls, ownerType, map);
                        z2 = !d(typeI3, ownerType);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            typeI4 = i(type, cls, actualTypeArguments[i2], map);
                            if (d(typeI4, actualTypeArguments[i2])) {
                                if (!z2) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z2 = true;
                                }
                                actualTypeArguments[i2] = typeI4;
                            }
                        }
                        if (z2) {
                            break;
                        }
                        parameterizedTypeImpl = new ParameterizedTypeImpl(typeI3, type2.getRawType(), actualTypeArguments);
                        type2 = parameterizedTypeImpl;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeI5 = i(type, cls, genericComponentType, map);
                    if (d(genericComponentType, typeI5)) {
                        parameterizedTypeImpl = new GenericArrayTypeImpl(typeI5);
                        type2 = parameterizedTypeImpl;
                        break;
                    }
                    break;
                }
                Class cls2 = (Class) type2;
                if (!cls2.isArray()) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1 && (typeI = i(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                                    if (typeI instanceof WildcardType) {
                                        upperBounds2 = ((WildcardType) typeI).getUpperBounds();
                                    } else {
                                        upperBounds2 = new Type[]{typeI};
                                    }
                                    type2 = new WildcardTypeImpl(upperBounds2, f21207a);
                                    break;
                                }
                                break;
                                break;
                            }
                            typeI2 = i(type, cls, lowerBounds[0], map);
                            if (typeI2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeI2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeI2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeI2};
                            }
                            type2 = new WildcardTypeImpl(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType2 = type2.getOwnerType();
                        typeI3 = i(type, cls, ownerType2, map);
                        z2 = !d(typeI3, ownerType2);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        while (i2 < length) {
                            typeI4 = i(type, cls, actualTypeArguments[i2], map);
                            if (d(typeI4, actualTypeArguments[i2])) {
                                if (!z2) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z2 = true;
                                }
                                actualTypeArguments[i2] = typeI4;
                            }
                        }
                        if (z2) {
                            break;
                        }
                        parameterizedTypeImpl = new ParameterizedTypeImpl(typeI3, type2.getRawType(), actualTypeArguments);
                        type2 = parameterizedTypeImpl;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeI5 = i(type, cls, genericComponentType, map);
                    if (d(genericComponentType, typeI5)) {
                        break;
                    }
                    parameterizedTypeImpl = new GenericArrayTypeImpl(typeI5);
                    type2 = parameterizedTypeImpl;
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeI6 = i(type, cls, componentType, map);
                if (!d(componentType, typeI6)) {
                    parameterizedTypeImpl = new GenericArrayTypeImpl(typeI6);
                    type2 = parameterizedTypeImpl;
                    break;
                }
                type2 = cls2;
                break;
            }
            typeVariable = (TypeVariable) type2;
            Type type3 = (Type) map.get(typeVariable);
            Class cls3 = Void.TYPE;
            if (type3 != null) {
                return type3 == cls3 ? type2 : type3;
            }
            map.put(typeVariable, cls3);
            if (typeVariable2 == null) {
                typeVariable2 = typeVariable;
            }
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls4 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls4 == null) {
                type2 = typeVariable;
            } else {
                Type typeF = f(type, cls, cls4);
                if (typeF instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls4.getTypeParameters();
                    int length2 = typeParameters.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i3])) {
                            type2 = ((ParameterizedType) typeF).getActualTypeArguments()[i3];
                            break;
                        }
                        i3++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        if (typeVariable2 != null) {
            map.put(typeVariable2, type2);
        }
        return type2;
    }

    public static String j(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
