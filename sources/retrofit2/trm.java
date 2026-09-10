package retrofit2;

import com.applovin.shadow.okhttp3.HttpUrl;
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

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes5.dex */
public final class trm {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Type[] f36619attabal = new Type[0];

    /* JADX INFO: compiled from: Utils.java */
    public static final class attabal implements GenericArrayType {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Type f36620kowloon;

        public attabal(Type type) {
            this.f36620kowloon = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && trm.wireman(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f36620kowloon;
        }

        public int hashCode() {
            return this.f36620kowloon.hashCode();
        }

        public String toString() {
            return trm.graveside(this.f36620kowloon) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* JADX INFO: compiled from: Utils.java */
    public static final class dern implements WildcardType {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        @Nullable
        public final Type f36621arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Type f36622kowloon;

        public dern(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                trm.saneness(typeArr[0]);
                this.f36621arytenoidectomy = null;
                this.f36622kowloon = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            trm.saneness(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f36621arytenoidectomy = typeArr2[0];
            this.f36622kowloon = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && trm.wireman(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f36621arytenoidectomy;
            return type != null ? new Type[]{type} : trm.f36619attabal;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f36622kowloon};
        }

        public int hashCode() {
            Type type = this.f36621arytenoidectomy;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f36622kowloon.hashCode() + 31);
        }

        public String toString() {
            if (this.f36621arytenoidectomy != null) {
                return "? super " + trm.graveside(this.f36621arytenoidectomy);
            }
            if (this.f36622kowloon == Object.class) {
                return "?";
            }
            return "? extends " + trm.graveside(this.f36622kowloon);
        }
    }

    /* JADX INFO: compiled from: Utils.java */
    public static final class saneness implements ParameterizedType {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final Type f36623arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        @Nullable
        public final Type f36624kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final Type[] f36625monoploid;

        public saneness(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                trm.saneness(type3);
            }
            this.f36624kowloon = type;
            this.f36623arytenoidectomy = type2;
            this.f36625monoploid = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && trm.wireman(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f36625monoploid.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public Type getOwnerType() {
            return this.f36624kowloon;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f36623arytenoidectomy;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f36625monoploid) ^ this.f36623arytenoidectomy.hashCode();
            Type type = this.f36624kowloon;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f36625monoploid;
            if (typeArr.length == 0) {
                return trm.graveside(this.f36623arytenoidectomy);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(trm.graveside(this.f36623arytenoidectomy));
            sb.append("<");
            sb.append(trm.graveside(this.f36625monoploid[0]));
            for (int i = 1; i < this.f36625monoploid.length; i++) {
                sb.append(", ");
                sb.append(trm.graveside(this.f36625monoploid[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static int apical(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    public static RuntimeException arytenoidectomy(Method method, Throwable th, int i, String str, Object... objArr) {
        return triweekly(method, th, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    public static okhttp3.stratoscope attabal(okhttp3.stratoscope stratoscopeVar) throws IOException {
        duvetyn.wireman wiremanVar = new duvetyn.wireman();
        stratoscopeVar.getF34697monoploid().clubfoot(wiremanVar);
        return okhttp3.stratoscope.create(stratoscopeVar.getF34696kowloon(), stratoscopeVar.getF34695arytenoidectomy(), wiremanVar);
    }

    public static Type beachfront(int i, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    public static Type competently(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    public static boolean cutely(@Nullable Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (cutely(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return cutely(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    @Nullable
    public static Class<?> dern(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static boolean formularize(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static String graveside(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static RuntimeException impassible(Method method, String str, Object... objArr) {
        return triweekly(method, null, str, objArr);
    }

    public static Class<?> impromptu(Type type) {
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
            return Array.newInstance(impromptu(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return impromptu(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static RuntimeException kowloon(Method method, int i, String str, Object... objArr) {
        return impassible(method, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    public static Type marial(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return marial(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return marial(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static void molybdenite(Throwable th) {
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

    public static Type monoploid(Type type, Class<?> cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeMonoploid;
        Type type4 = type2;
        while (type4 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type4;
            Type typePolloi = polloi(type, cls, typeVariable);
            if (typePolloi == typeVariable) {
                return typePolloi;
            }
            type4 = typePolloi;
        }
        if (type4 instanceof Class) {
            Class cls2 = (Class) type4;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeMonoploid2 = monoploid(type, cls, componentType);
                return componentType == typeMonoploid2 ? cls2 : new attabal(typeMonoploid2);
            }
        }
        if (type4 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type4;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeMonoploid3 = monoploid(type, cls, genericComponentType);
            return genericComponentType == typeMonoploid3 ? genericArrayType : new attabal(typeMonoploid3);
        }
        if (type4 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type4;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeMonoploid4 = monoploid(type, cls, ownerType);
            boolean z = typeMonoploid4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type typeMonoploid5 = monoploid(type, cls, actualTypeArguments[i]);
                if (typeMonoploid5 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = typeMonoploid5;
                }
            }
            return z ? new saneness(typeMonoploid4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type4 instanceof WildcardType) {
            wildcardType = (WildcardType) type4;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeMonoploid6 = monoploid(type, cls, lowerBounds[0]);
                if (typeMonoploid6 != lowerBounds[0]) {
                    type3 = type4;
                    type3 = wildcardType;
                    return new dern(new Type[]{Object.class}, new Type[]{typeMonoploid6});
                }
            } else if (upperBounds.length == 1 && (typeMonoploid = monoploid(type, cls, upperBounds[0])) != upperBounds[0]) {
                type3 = type4;
                type3 = wildcardType;
                type3 = wildcardType;
                return new dern(new Type[]{typeMonoploid}, f36619attabal);
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

    public static Type polloi(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsDern = dern(typeVariable);
        if (clsDern != null) {
            Type typeMarial = marial(type, cls, clsDern);
            if (typeMarial instanceof ParameterizedType) {
                return ((ParameterizedType) typeMarial).getActualTypeArguments()[apical(clsDern.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static void saneness(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static Type taiyuan(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return monoploid(type, cls, marial(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static RuntimeException triweekly(Method method, @Nullable Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    public static boolean wireman(Type type, Type type2) {
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
                return wireman(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
}
