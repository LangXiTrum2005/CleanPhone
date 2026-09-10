package com.google.gson.reflect;

import com.google.gson.internal.C$Gson$Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class TypeToken<T> {
    private final int hashCode;
    private final Class<? super T> rawType;
    private final Type type;

    public TypeToken() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == TypeToken.class) {
                Type typeB = C$Gson$Types.b(parameterizedType.getActualTypeArguments()[0]);
                this.type = typeB;
                this.rawType = C$Gson$Types.g(typeB);
                this.hashCode = typeB.hashCode();
                return;
            }
        } else if (genericSuperclass == TypeToken.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public static boolean a(Type type, ParameterizedType parameterizedType, HashMap map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class clsG = C$Gson$Types.g(type);
        ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<T>>[] typeParameters = clsG.getTypeParameters();
            for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                Type type2 = actualTypeArguments[i2];
                TypeVariable<Class<T>> typeVariable = typeParameters[i2];
                while (type2 instanceof TypeVariable) {
                    type2 = (Type) map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (parameterizedType2.getRawType().equals(parameterizedType.getRawType())) {
                Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                Type[] actualTypeArguments3 = parameterizedType.getActualTypeArguments();
                for (int i3 = 0; i3 < actualTypeArguments2.length; i3++) {
                    Type type3 = actualTypeArguments2[i3];
                    Type type4 = actualTypeArguments3[i3];
                    if (type4.equals(type3) || ((type3 instanceof TypeVariable) && type4.equals(map.get(((TypeVariable) type3).getName())))) {
                    }
                }
                return true;
            }
        }
        for (Type type5 : clsG.getGenericInterfaces()) {
            if (a(type5, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return a(clsG.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    public static TypeToken<?> get(Type type) {
        return new TypeToken<>(type);
    }

    public static TypeToken<?> getArray(Type type) {
        return new TypeToken<>(C$Gson$Types.a(type));
    }

    public static TypeToken<?> getParameterized(Type type, Type... typeArr) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(typeArr);
        if (!(type instanceof Class)) {
            throw new IllegalArgumentException("rawType must be of type Class, but was " + type);
        }
        Class cls = (Class) type;
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 != length) {
            throw new IllegalArgumentException(cls.getName() + " requires " + length + " type arguments, but got " + length2);
        }
        for (int i2 = 0; i2 < length; i2++) {
            Type type2 = typeArr[i2];
            Class<?> clsG = C$Gson$Types.g(type2);
            TypeVariable<Class<T>> typeVariable = typeParameters[i2];
            for (Type type3 : typeVariable.getBounds()) {
                if (!C$Gson$Types.g(type3).isAssignableFrom(clsG)) {
                    throw new IllegalArgumentException("Type argument " + type2 + " does not satisfy bounds for type variable " + typeVariable + " declared by " + type);
                }
            }
        }
        return new TypeToken<>(C$Gson$Types.h(type, typeArr));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TypeToken) && C$Gson$Types.e(this.type, ((TypeToken) obj).type);
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    public final String toString() {
        return C$Gson$Types.j(this.type);
    }

    public static <T> TypeToken<T> get(Class<T> cls) {
        return new TypeToken<>(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    @Deprecated
    public boolean isAssignableFrom(Type type) {
        boolean zA;
        if (type != 0) {
            if (!this.type.equals(type)) {
                Type type2 = this.type;
                if (type2 instanceof Class) {
                    return this.rawType.isAssignableFrom(C$Gson$Types.g(type));
                }
                if (type2 instanceof ParameterizedType) {
                    return a(type, (ParameterizedType) type2, new HashMap());
                }
                if (!(type2 instanceof GenericArrayType)) {
                    Class[] clsArr = {Class.class, ParameterizedType.class, GenericArrayType.class};
                    StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
                    for (int i2 = 0; i2 < 3; i2++) {
                        sb.append(clsArr[i2].getName());
                        sb.append(", ");
                    }
                    sb.append("but got: ");
                    sb.append(type2.getClass().getName());
                    sb.append(", for type token: ");
                    sb.append(type2.toString());
                    sb.append('.');
                    throw new AssertionError(sb.toString());
                }
                if (this.rawType.isAssignableFrom(C$Gson$Types.g(type))) {
                    Type genericComponentType = ((GenericArrayType) this.type).getGenericComponentType();
                    if (genericComponentType instanceof ParameterizedType) {
                        if (type instanceof GenericArrayType) {
                            type = ((GenericArrayType) type).getGenericComponentType();
                        } else if (type instanceof Class) {
                            type = (Class) type;
                            while (type.isArray()) {
                                type = type.getComponentType();
                            }
                        }
                        zA = a(type, (ParameterizedType) genericComponentType, new HashMap());
                    } else {
                        zA = true;
                    }
                    if (zA) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public TypeToken(Type type) {
        Objects.requireNonNull(type);
        Type typeB = C$Gson$Types.b(type);
        this.type = typeB;
        this.rawType = C$Gson$Types.g(typeB);
        this.hashCode = typeB.hashCode();
    }

    @Deprecated
    public boolean isAssignableFrom(TypeToken<?> typeToken) {
        return isAssignableFrom(typeToken.getType());
    }
}
