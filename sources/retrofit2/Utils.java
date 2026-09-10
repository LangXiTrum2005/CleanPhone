package retrofit2;

import com.thinkup.core.common.n.mo;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.ResponseBody;
import okio.Buffer;

/* JADX INFO: loaded from: classes7.dex */
final class Utils {
    static final Type[] EMPTY_TYPE_ARRAY = new Type[0];

    public static final class GenericArrayTypeImpl implements GenericArrayType {
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
            this.componentType = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && Utils.equals(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return android.support.v4.media.a.r(new StringBuilder(), Utils.typeToString(this.componentType), "[]");
        }
    }

    public static final class ParameterizedTypeImpl implements ParameterizedType {

        @Nullable
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        public ParameterizedTypeImpl(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                Utils.checkNotPrimitive(type3);
            }
            this.ownerType = type;
            this.rawType = type2;
            this.typeArguments = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && Utils.equals(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode();
            Type type = this.ownerType;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.typeArguments;
            if (typeArr.length == 0) {
                return Utils.typeToString(this.rawType);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(Utils.typeToString(this.rawType));
            sb.append("<");
            sb.append(Utils.typeToString(this.typeArguments[0]));
            for (int i2 = 1; i2 < this.typeArguments.length; i2++) {
                sb.append(", ");
                sb.append(Utils.typeToString(this.typeArguments[i2]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class WildcardTypeImpl implements WildcardType {

        @Nullable
        private final Type lowerBound;
        private final Type upperBound;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                Utils.checkNotPrimitive(typeArr[0]);
                this.lowerBound = null;
                this.upperBound = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            Utils.checkNotPrimitive(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.lowerBound = typeArr2[0];
            this.upperBound = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && Utils.equals(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.lowerBound;
            return type != null ? new Type[]{type} : Utils.EMPTY_TYPE_ARRAY;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public int hashCode() {
            Type type = this.lowerBound;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
        }

        public String toString() {
            if (this.lowerBound != null) {
                return "? super " + Utils.typeToString(this.lowerBound);
            }
            if (this.upperBound == Object.class) {
                return "?";
            }
            return "? extends " + Utils.typeToString(this.upperBound);
        }
    }

    private Utils() {
    }

    public static ResponseBody buffer(ResponseBody responseBody) throws IOException {
        Buffer buffer = new Buffer();
        responseBody.source().o0(buffer);
        return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), buffer);
    }

    public static void checkNotPrimitive(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    @Nullable
    private static Class<?> declaringClassOf(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static boolean equals(Type type, Type type2) {
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
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return equals(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static Type getGenericSupertype(Type type, Class<?> cls, Class<?> cls2) {
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
                    return getGenericSupertype(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return getGenericSupertype(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type getParameterLowerBound(int i2, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i2];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    public static Type getParameterUpperBound(int i2, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i2 >= 0 && i2 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i2];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbU = android.support.v4.media.a.u(i2, "Index ", " not in range [0,");
        sbU.append(actualTypeArguments.length);
        sbU.append(") for ");
        sbU.append(parameterizedType);
        throw new IllegalArgumentException(sbU.toString());
    }

    public static Class<?> getRawType(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(getRawType(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return getRawType(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static Type getSupertype(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return resolve(type, cls, getGenericSupertype(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static boolean hasUnresolvableType(@Nullable Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (hasUnresolvableType(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return hasUnresolvableType(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? AbstractJsonLexerKt.NULL : type.getClass().getName()));
    }

    private static int indexOf(Object[] objArr, Object obj) {
        for (int i2 = 0; i2 < objArr.length; i2++) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean isAnnotationPresent(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static RuntimeException methodError(Method method, String str, Object... objArr) {
        return methodError(method, null, str, objArr);
    }

    public static RuntimeException parameterError(Method method, Throwable th, int i2, String str, Object... objArr) {
        StringBuilder sbX = android.support.v4.media.a.x(str, " (parameter #");
        sbX.append(i2 + 1);
        sbX.append(")");
        return methodError(method, th, sbX.toString(), objArr);
    }

    public static Type resolve(Type type, Class<?> cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeResolve;
        Type type4 = type2;
        while (type4 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type4;
            Type typeResolveTypeVariable = resolveTypeVariable(type, cls, typeVariable);
            if (typeResolveTypeVariable == typeVariable) {
                return typeResolveTypeVariable;
            }
            type4 = typeResolveTypeVariable;
        }
        if (type4 instanceof Class) {
            Class cls2 = (Class) type4;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeResolve2 = resolve(type, cls, componentType);
                return componentType == typeResolve2 ? cls2 : new GenericArrayTypeImpl(typeResolve2);
            }
        }
        if (type4 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type4;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeResolve3 = resolve(type, cls, genericComponentType);
            return genericComponentType == typeResolve3 ? genericArrayType : new GenericArrayTypeImpl(typeResolve3);
        }
        if (type4 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type4;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeResolve4 = resolve(type, cls, ownerType);
            boolean z2 = typeResolve4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i2 = 0; i2 < length; i2++) {
                Type typeResolve5 = resolve(type, cls, actualTypeArguments[i2]);
                if (typeResolve5 != actualTypeArguments[i2]) {
                    if (!z2) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z2 = true;
                    }
                    actualTypeArguments[i2] = typeResolve5;
                }
            }
            return z2 ? new ParameterizedTypeImpl(typeResolve4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type4 instanceof WildcardType) {
            wildcardType = (WildcardType) type4;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeResolve6 = resolve(type, cls, lowerBounds[0]);
                if (typeResolve6 != lowerBounds[0]) {
                    type3 = type4;
                    type3 = wildcardType;
                    return new WildcardTypeImpl(new Type[]{Object.class}, new Type[]{typeResolve6});
                }
            } else if (upperBounds.length == 1 && (typeResolve = resolve(type, cls, upperBounds[0])) != upperBounds[0]) {
                type3 = type4;
                type3 = wildcardType;
                type3 = wildcardType;
                return new WildcardTypeImpl(new Type[]{typeResolve}, EMPTY_TYPE_ARRAY);
            }
        }
        type3 = type4;
        type3 = wildcardType;
        type3 = wildcardType;
        type3 = type4;
        type3 = wildcardType;
        type3 = type4;
        type3 = wildcardType;
        type3 = type4;
        return type3;
    }

    private static Type resolveTypeVariable(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsDeclaringClassOf = declaringClassOf(typeVariable);
        if (clsDeclaringClassOf != null) {
            Type genericSupertype = getGenericSupertype(type, cls, clsDeclaringClassOf);
            if (genericSupertype instanceof ParameterizedType) {
                return ((ParameterizedType) genericSupertype).getActualTypeArguments()[indexOf(clsDeclaringClassOf.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static void throwIfFatal(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static String typeToString(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static RuntimeException methodError(Method method, @Nullable Throwable th, String str, Object... objArr) {
        StringBuilder sbX = android.support.v4.media.a.x(String.format(str, objArr), "\n    for method ");
        sbX.append(method.getDeclaringClass().getSimpleName());
        sbX.append(mo.ono);
        sbX.append(method.getName());
        return new IllegalArgumentException(sbX.toString(), th);
    }

    public static RuntimeException parameterError(Method method, int i2, String str, Object... objArr) {
        StringBuilder sbX = android.support.v4.media.a.x(str, " (parameter #");
        sbX.append(i2 + 1);
        sbX.append(")");
        return methodError(method, sbX.toString(), objArr);
    }
}
