package kotlinx.serialization.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0080\b¢\u0006\u0002\u0010\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0080\b\u001a\u001c\u0010\b\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\nH\u0000\u001a$\u0010\u000b\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\nH\u0000\u001aK\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0002\"\b\b\u0000\u0010\u0001*\u00020\t\"\n\b\u0001\u0010\u000e*\u0004\u0018\u0001H\u0001*\u0012\u0012\u0004\u0012\u0002H\u000e0\u000fj\b\u0012\u0004\u0012\u0002H\u000e`\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0000¢\u0006\u0002\u0010\u0012\u001a\u0010\u0010\u0013\u001a\u00020\u0014*\u0006\u0012\u0002\b\u00030\nH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u0014*\u0006\u0012\u0002\b\u00030\u0016H\u0000\u001aM\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\n2\"\u0010\u0018\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f0\u0002\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fH\u0000¢\u0006\u0002\u0010\u0019\u001aM\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u00162\"\u0010\u0018\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f0\u0002\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fH\u0000¢\u0006\u0002\u0010\u001a\u001aM\u0010\u001b\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u00162\"\u0010\u0018\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f0\u0002\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fH\u0002¢\u0006\u0002\u0010\u001a\u001a\u001e\u0010\u001c\u001a\u0004\u0018\u00010\t\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u0016H\u0002\u001a\u001c\u0010\u001d\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u0016H\u0002\u001a\u001c\u0010\u001e\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u0016H\u0002\u001aO\u0010\u001f\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u00162\"\u0010\u0018\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f0\u0002\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fH\u0002¢\u0006\u0002\u0010\u001a\u001aK\u0010!\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t2\u0006\u0010\"\u001a\u00020\t2\"\u0010\u0018\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f0\u0002\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fH\u0002¢\u0006\u0002\u0010#\u001a\u001a\u0010$\u001a\u0004\u0018\u00010\t*\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010%\u001a\u00020&H\u0002\u001a\"\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u0016H\u0002\u001a$\u0010(\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u0016H\u0002\u001a\u0016\u0010)\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\nH\u0000\u001a\u001c\u0010+\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0,H\u0000\u001a\u0017\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.00H\u0082\b¨\u00061"}, d2 = {"getChecked", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "index", "", "([Ljava/lang/Object;I)Ljava/lang/Object;", "", "", "isInterface", "", "Lkotlin/reflect/KClass;", "compiledSerializerImpl", "Lkotlinx/serialization/KSerializer;", "toNativeArrayImpl", "E", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eClass", "(Ljava/util/ArrayList;Lkotlin/reflect/KClass;)[Ljava/lang/Object;", "platformSpecificSerializerNotRegistered", "", "serializerNotRegistered", "Ljava/lang/Class;", "constructSerializerForGivenTypeArgs", "args", "(Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "(Ljava/lang/Class;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "findInNamedCompanion", "findNamedCompanionByAnnotation", "isNotAnnotated", "isPolymorphicSerializer", "invokeSerializerOnDefaultCompanion", "jClass", "invokeSerializerOnCompanion", "companion", "(Ljava/lang/Object;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "companionOrNull", "companionName", "", "createEnumSerializer", "findObjectSerializer", "isReferenceArray", "rootClass", "initBuiltins", "", "loadSafe", "", "block", "Lkotlin/Function0;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PlatformKt {
    private static final Object companionOrNull(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> KSerializer<T> compiledSerializerImpl(KClass<T> kClass) {
        Intrinsics.f(kClass, "<this>");
        return constructSerializerForGivenTypeArgs(kClass, (KSerializer<Object>[]) new KSerializer[0]);
    }

    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(KClass<T> kClass, KSerializer<Object>... args) {
        Intrinsics.f(kClass, "<this>");
        Intrinsics.f(args, "args");
        return constructSerializerForGivenTypeArgs(JvmClassMappingKt.b(kClass), (KSerializer<Object>[]) Arrays.copyOf(args, args.length));
    }

    private static final <T> KSerializer<T> createEnumSerializer(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        Intrinsics.e(canonicalName, "getCanonicalName(...)");
        Intrinsics.d(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new EnumSerializer(canonicalName, (Enum[]) enumConstants);
    }

    private static final <T> KSerializer<T> findInNamedCompanion(Class<T> cls, KSerializer<Object>... kSerializerArr) {
        Field field;
        KSerializer<T> kSerializerInvokeSerializerOnCompanion;
        Object objFindNamedCompanionByAnnotation = findNamedCompanionByAnnotation(cls);
        if (objFindNamedCompanionByAnnotation != null && (kSerializerInvokeSerializerOnCompanion = invokeSerializerOnCompanion(objFindNamedCompanionByAnnotation, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length))) != null) {
            return kSerializerInvokeSerializerOnCompanion;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            Intrinsics.e(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i2 = 0;
            Class<?> cls2 = null;
            boolean z2 = false;
            while (true) {
                if (i2 >= length) {
                    if (z2) {
                        break;
                    }
                } else {
                    Class<?> cls3 = declaredClasses[i2];
                    if (cls3.getSimpleName().equals("$serializer")) {
                        if (!z2) {
                            z2 = true;
                            cls2 = cls3;
                        }
                    }
                    i2++;
                }
                cls2 = null;
                break;
            }
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof KSerializer) {
                return (KSerializer) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    private static final <T> Object findNamedCompanionByAnnotation(Class<T> cls) {
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        Intrinsics.e(declaredClasses, "getDeclaredClasses(...)");
        for (Class<?> cls2 : declaredClasses) {
            if (cls2.getAnnotation(NamedCompanion.class) != null) {
                if (cls2 == null) {
                    return null;
                }
                return companionOrNull(cls, cls2.getSimpleName());
            }
        }
        cls2 = null;
        if (cls2 == null) {
            return null;
        }
        return companionOrNull(cls, cls2.getSimpleName());
    }

    private static final <T> KSerializer<T> findObjectSerializer(Class<T> cls) throws IllegalAccessException, InvocationTargetException {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null && !StringsKt.M(canonicalName, "java.", false) && !StringsKt.M(canonicalName, "kotlin.", false)) {
            Field[] declaredFields = cls.getDeclaredFields();
            Intrinsics.e(declaredFields, "getDeclaredFields(...)");
            int length = declaredFields.length;
            Field field = null;
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                if (i2 >= length) {
                    if (!z2) {
                        break;
                    }
                    break;
                }
                Field field2 = declaredFields[i2];
                if (Intrinsics.a(field2.getName(), "INSTANCE") && Intrinsics.a(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                    if (!z2) {
                        z2 = true;
                        field = field2;
                    }
                }
                i2++;
                field = null;
                break;
            }
            if (field != null) {
                Object obj = field.get(null);
                Method[] methods = cls.getMethods();
                Intrinsics.e(methods, "getMethods(...)");
                int length2 = methods.length;
                Method method = null;
                int i3 = 0;
                boolean z3 = false;
                while (true) {
                    if (i3 >= length2) {
                        if (!z3) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i3];
                    if (Intrinsics.a(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        Intrinsics.e(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && Intrinsics.a(method2.getReturnType(), KSerializer.class)) {
                            if (!z3) {
                                z3 = true;
                                method = method2;
                            }
                        }
                    }
                    i3++;
                    method = null;
                    break;
                }
                if (method != null) {
                    Object objInvoke = method.invoke(obj, new Object[0]);
                    if (objInvoke instanceof KSerializer) {
                        return (KSerializer) objInvoke;
                    }
                }
            }
        }
        return null;
    }

    public static final <T> T getChecked(T[] tArr, int i2) {
        Intrinsics.f(tArr, "<this>");
        return tArr[i2];
    }

    public static final Map<KClass<?>, KSerializer<?>> initBuiltins() {
        MapBuilder mapBuilder = new MapBuilder();
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        mapBuilder.put(reflectionFactory.b(String.class), BuiltinSerializersKt.serializer(StringCompanionObject.f43337a));
        mapBuilder.put(reflectionFactory.b(Character.TYPE), BuiltinSerializersKt.serializer(CharCompanionObject.f43326a));
        mapBuilder.put(reflectionFactory.b(char[].class), BuiltinSerializersKt.CharArraySerializer());
        mapBuilder.put(reflectionFactory.b(Double.TYPE), BuiltinSerializersKt.serializer(DoubleCompanionObject.f43329a));
        mapBuilder.put(reflectionFactory.b(double[].class), BuiltinSerializersKt.DoubleArraySerializer());
        mapBuilder.put(reflectionFactory.b(Float.TYPE), BuiltinSerializersKt.serializer(FloatCompanionObject.f43330a));
        mapBuilder.put(reflectionFactory.b(float[].class), BuiltinSerializersKt.FloatArraySerializer());
        mapBuilder.put(reflectionFactory.b(Long.TYPE), BuiltinSerializersKt.serializer(LongCompanionObject.f43332a));
        mapBuilder.put(reflectionFactory.b(long[].class), BuiltinSerializersKt.LongArraySerializer());
        mapBuilder.put(reflectionFactory.b(ULong.class), BuiltinSerializersKt.serializer(ULong.f43258Y));
        mapBuilder.put(reflectionFactory.b(Integer.TYPE), BuiltinSerializersKt.serializer(IntCompanionObject.f43331a));
        mapBuilder.put(reflectionFactory.b(int[].class), BuiltinSerializersKt.IntArraySerializer());
        mapBuilder.put(reflectionFactory.b(UInt.class), BuiltinSerializersKt.serializer(UInt.f43256Y));
        mapBuilder.put(reflectionFactory.b(Short.TYPE), BuiltinSerializersKt.serializer(ShortCompanionObject.f43335a));
        mapBuilder.put(reflectionFactory.b(short[].class), BuiltinSerializersKt.ShortArraySerializer());
        mapBuilder.put(reflectionFactory.b(UShort.class), BuiltinSerializersKt.serializer(UShort.f43261Y));
        mapBuilder.put(reflectionFactory.b(Byte.TYPE), BuiltinSerializersKt.serializer(ByteCompanionObject.f43325a));
        mapBuilder.put(reflectionFactory.b(byte[].class), BuiltinSerializersKt.ByteArraySerializer());
        mapBuilder.put(reflectionFactory.b(UByte.class), BuiltinSerializersKt.serializer(UByte.f43254Y));
        mapBuilder.put(reflectionFactory.b(Boolean.TYPE), BuiltinSerializersKt.serializer(BooleanCompanionObject.f43324a));
        mapBuilder.put(reflectionFactory.b(boolean[].class), BuiltinSerializersKt.BooleanArraySerializer());
        mapBuilder.put(reflectionFactory.b(Unit.class), BuiltinSerializersKt.serializer(Unit.f43263a));
        mapBuilder.put(reflectionFactory.b(Void.class), BuiltinSerializersKt.NothingSerializer());
        try {
            mapBuilder.put(reflectionFactory.b(Duration.class), BuiltinSerializersKt.serializer(Duration.f44719Y));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapBuilder.put(Reflection.f43333a.b(ULongArray.class), BuiltinSerializersKt.ULongArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapBuilder.put(Reflection.f43333a.b(UIntArray.class), BuiltinSerializersKt.UIntArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapBuilder.put(Reflection.f43333a.b(UShortArray.class), BuiltinSerializersKt.UShortArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapBuilder.put(Reflection.f43333a.b(UByteArray.class), BuiltinSerializersKt.UByteArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapBuilder.put(Reflection.f43333a.b(Uuid.class), BuiltinSerializersKt.serializer(Uuid.Z));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return mapBuilder.d();
    }

    private static final <T> KSerializer<T> invokeSerializerOnCompanion(Object obj, KSerializer<Object>... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i2 = 0; i2 < length; i2++) {
                    clsArr2[i2] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e2.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final <T> KSerializer<T> invokeSerializerOnDefaultCompanion(Class<?> cls, KSerializer<Object>... kSerializerArr) {
        Object objCompanionOrNull = companionOrNull(cls, "Companion");
        if (objCompanionOrNull == null) {
            return null;
        }
        return invokeSerializerOnCompanion(objCompanionOrNull, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final <T> boolean isInterface(KClass<T> kClass) {
        Intrinsics.f(kClass, "<this>");
        return JvmClassMappingKt.b(kClass).isInterface();
    }

    private static final <T> boolean isNotAnnotated(Class<T> cls) {
        return cls.getAnnotation(Serializable.class) == null && cls.getAnnotation(Polymorphic.class) == null;
    }

    private static final <T> boolean isPolymorphicSerializer(Class<T> cls) {
        if (cls.getAnnotation(Polymorphic.class) != null) {
            return true;
        }
        Serializable serializable = (Serializable) cls.getAnnotation(Serializable.class);
        if (serializable == null) {
            return false;
        }
        Class<? extends KSerializer<?>> clsWith = serializable.with();
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        return reflectionFactory.b(clsWith).equals(reflectionFactory.b(PolymorphicSerializer.class));
    }

    public static final boolean isReferenceArray(KClass<Object> rootClass) {
        Intrinsics.f(rootClass, "rootClass");
        return JvmClassMappingKt.b(rootClass).isArray();
    }

    private static final void loadSafe(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
    }

    public static final Void platformSpecificSerializerNotRegistered(KClass<?> kClass) {
        Intrinsics.f(kClass, "<this>");
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    public static final Void serializerNotRegistered(Class<?> cls) {
        Intrinsics.f(cls, "<this>");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage((KClass<?>) JvmClassMappingKt.e(cls)));
    }

    public static final <T, E extends T> E[] toNativeArrayImpl(ArrayList<E> arrayList, KClass<T> eClass) {
        Intrinsics.f(arrayList, "<this>");
        Intrinsics.f(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) JvmClassMappingKt.b(eClass), arrayList.size());
        Intrinsics.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) objNewInstance);
        Intrinsics.e(eArr, "toArray(...)");
        return eArr;
    }

    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(Class<T> cls, KSerializer<Object>... args) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.f(cls, "<this>");
        Intrinsics.f(args, "args");
        if (cls.isEnum() && isNotAnnotated(cls)) {
            return createEnumSerializer(cls);
        }
        KSerializer<T> kSerializerInvokeSerializerOnDefaultCompanion = invokeSerializerOnDefaultCompanion(cls, (KSerializer[]) Arrays.copyOf(args, args.length));
        if (kSerializerInvokeSerializerOnDefaultCompanion != null) {
            return kSerializerInvokeSerializerOnDefaultCompanion;
        }
        KSerializer<T> kSerializerFindObjectSerializer = findObjectSerializer(cls);
        if (kSerializerFindObjectSerializer != null) {
            return kSerializerFindObjectSerializer;
        }
        KSerializer<T> kSerializerFindInNamedCompanion = findInNamedCompanion(cls, (KSerializer[]) Arrays.copyOf(args, args.length));
        if (kSerializerFindInNamedCompanion != null) {
            return kSerializerFindInNamedCompanion;
        }
        if (isPolymorphicSerializer(cls)) {
            return new PolymorphicSerializer(JvmClassMappingKt.e(cls));
        }
        return null;
    }

    public static final boolean getChecked(boolean[] zArr, int i2) {
        Intrinsics.f(zArr, "<this>");
        return zArr[i2];
    }
}
