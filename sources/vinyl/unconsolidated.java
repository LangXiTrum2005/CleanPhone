package vinyl;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.uuid.Uuid;

/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aM\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\t*\u0004\u0018\u00018\u0000*\u0012\u0012\u0004\u0012\u00028\u00010\nj\b\u0012\u0004\u0012\u00028\u0001`\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0013\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00060\r\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aO\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00162\"\u0010\u0013\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00060\r\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aO\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00162\"\u0010\u0013\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00060\r\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0018\u001a%\u0010\u001a\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001c\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010\u001e\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001aQ\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u00162\"\u0010\u0013\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00060\r\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0002¢\u0006\u0004\b \u0010\u0018\u001aM\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\"\u0010\u0013\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00060\r\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0002¢\u0006\u0004\b\"\u0010#\u001a!\u0010&\u001a\u0004\u0018\u00010\u0000*\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'\u001a)\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0002¢\u0006\u0004\b(\u0010)\u001a+\u0010*\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0002¢\u0006\u0004\b*\u0010)\u001a\u001d\u0010,\u001a\u00020\u00032\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0000¢\u0006\u0004\b,\u0010\u0005\u001a#\u0010.\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060-H\u0000¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkurbash/wireman;", "", "formularize", "(Lkurbash/wireman;)Z", "Lasosan/wireman;", "saneness", "(Lkurbash/wireman;)Lasosan/wireman;", "E", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eClass", "", "monoploid", "(Ljava/util/ArrayList;Lkurbash/wireman;)[Ljava/lang/Object;", "", "arytenoidectomy", "(Lkurbash/wireman;)Ljava/lang/Void;", "args", "wireman", "(Lkurbash/wireman;[Lasosan/wireman;)Lasosan/wireman;", "Ljava/lang/Class;", "dern", "(Ljava/lang/Class;[Lasosan/wireman;)Lasosan/wireman;", "beachfront", "competently", "(Ljava/lang/Class;)Ljava/lang/Object;", "impassible", "(Ljava/lang/Class;)Z", "triweekly", "jClass", "apical", "companion", "cutely", "(Ljava/lang/Object;[Lasosan/wireman;)Lasosan/wireman;", "", "companionName", "attabal", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "marial", "(Ljava/lang/Class;)Lasosan/wireman;", "impromptu", "rootClass", "kowloon", "", "taiyuan", "()Ljava/util/Map;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class unconsolidated {
    public static final <T> asosan.wireman<T> apical(Class<?> cls, asosan.wireman<Object>... wiremanVarArr) {
        Object objAttabal = attabal(cls, "Companion");
        if (objAttabal == null) {
            return null;
        }
        return cutely(objAttabal, (asosan.wireman[]) Arrays.copyOf(wiremanVarArr, wiremanVarArr.length));
    }

    public static final Void arytenoidectomy(kurbash.wireman<?> wiremanVar) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        claque.beachfront(wiremanVar);
        throw new KotlinNothingValueException();
    }

    public static final Object attabal(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> asosan.wireman<T> beachfront(Class<T> cls, asosan.wireman<Object>... wiremanVarArr) {
        Field field;
        asosan.wireman<T> wiremanVarCutely;
        Object objCompetently = competently(cls);
        if (objCompetently != null && (wiremanVarCutely = cutely(objCompetently, (asosan.wireman[]) Arrays.copyOf(wiremanVarArr, wiremanVarArr.length))) != null) {
            return wiremanVarCutely;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i = 0;
            Class<?> cls2 = null;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    if (z) {
                        break;
                    }
                } else {
                    Class<?> cls3 = declaredClasses[i];
                    if (Intrinsics.wireman(cls3.getSimpleName(), "$serializer")) {
                        if (!z) {
                            z = true;
                            cls2 = cls3;
                        }
                    }
                    i++;
                }
                cls2 = null;
                break;
            }
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof asosan.wireman) {
                return (asosan.wireman) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    public static final <T> Object competently(Class<T> cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i];
            if (cls2.getAnnotation(coi.class) != null) {
                break;
            }
            i++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return attabal(cls, simpleName);
    }

    public static final <T> asosan.wireman<T> cutely(Object obj, asosan.wireman<Object>... wiremanVarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (wiremanVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = wiremanVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = asosan.wireman.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(wiremanVarArr, wiremanVarArr.length));
            if (objInvoke instanceof asosan.wireman) {
                return (asosan.wireman) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final <T> asosan.wireman<T> dern(Class<T> cls, asosan.wireman<Object>... args) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        if (cls.isEnum() && impassible(cls)) {
            return marial(cls);
        }
        asosan.wireman<T> wiremanVarApical = apical(cls, (asosan.wireman[]) Arrays.copyOf(args, args.length));
        if (wiremanVarApical != null) {
            return wiremanVarApical;
        }
        asosan.wireman<T> wiremanVarImpromptu = impromptu(cls);
        if (wiremanVarImpromptu != null) {
            return wiremanVarImpromptu;
        }
        asosan.wireman<T> wiremanVarBeachfront = beachfront(cls, (asosan.wireman[]) Arrays.copyOf(args, args.length));
        if (wiremanVarBeachfront != null) {
            return wiremanVarBeachfront;
        }
        if (triweekly(cls)) {
            return new asosan.impromptu(gibeonite.attabal.marial(cls));
        }
        return null;
    }

    public static final <T> boolean formularize(kurbash.wireman<T> wiremanVar) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        return gibeonite.attabal.saneness(wiremanVar).isInterface();
    }

    public static final <T> boolean impassible(Class<T> cls) {
        return cls.getAnnotation(asosan.formularize.class) == null && cls.getAnnotation(asosan.marial.class) == null;
    }

    public static final <T> asosan.wireman<T> impromptu(Class<T> cls) throws IllegalAccessException, InvocationTargetException {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            int i = 0;
            if (!p002kotlin.text.dovishness.starveling(canonicalName, "java.", false, 2, null) && !p002kotlin.text.dovishness.starveling(canonicalName, "kotlin.", false, 2, null)) {
                Field[] declaredFields = cls.getDeclaredFields();
                Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
                int length = declaredFields.length;
                Field field = null;
                int i2 = 0;
                boolean z = false;
                while (true) {
                    if (i2 >= length) {
                        if (!z) {
                            break;
                        }
                        break;
                    }
                    Field field2 = declaredFields[i2];
                    if (Intrinsics.wireman(field2.getName(), "INSTANCE") && Intrinsics.wireman(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                        if (!z) {
                            z = true;
                            field = field2;
                        }
                    }
                    i2++;
                    field = null;
                    break;
                }
                if (field == null) {
                    return null;
                }
                Object obj = field.get(null);
                Method[] methods = cls.getMethods();
                Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
                int length2 = methods.length;
                Method method = null;
                boolean z2 = false;
                while (true) {
                    if (i >= length2) {
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i];
                    if (Intrinsics.wireman(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && Intrinsics.wireman(method2.getReturnType(), asosan.wireman.class)) {
                            if (!z2) {
                                method = method2;
                                z2 = true;
                            }
                        }
                    }
                    i++;
                    method = null;
                    break;
                }
                if (method == null) {
                    return null;
                }
                Object objInvoke = method.invoke(obj, null);
                if (objInvoke instanceof asosan.wireman) {
                    return (asosan.wireman) objInvoke;
                }
            }
        }
        return null;
    }

    public static final boolean kowloon(kurbash.wireman<Object> rootClass) {
        Intrinsics.checkNotNullParameter(rootClass, "rootClass");
        return gibeonite.attabal.saneness(rootClass).isArray();
    }

    public static final <T> asosan.wireman<T> marial(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
        Intrinsics.competently(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new restrictive(canonicalName, (Enum[]) enumConstants);
    }

    public static final <T, E extends T> E[] monoploid(ArrayList<E> arrayList, kurbash.wireman<T> eClass) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) gibeonite.attabal.saneness(eClass), arrayList.size());
        Intrinsics.competently(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) objNewInstance);
        Intrinsics.checkNotNullExpressionValue(eArr, "toArray(...)");
        return eArr;
    }

    public static final <T> asosan.wireman<T> saneness(kurbash.wireman<T> wiremanVar) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        return wireman(wiremanVar, new asosan.wireman[0]);
    }

    public static final Map<kurbash.wireman<?>, asosan.wireman<?>> taiyuan() {
        Map mapDern = p002kotlin.collections.polder.dern();
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(String.class), defendable.attabal.oilcan(p002kotlin.jvm.internal.gintrap.f29390attabal));
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(Character.TYPE), defendable.attabal.rotuma(p002kotlin.jvm.internal.marial.f29392attabal));
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(char[].class), defendable.attabal.wireman());
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(Double.TYPE), defendable.attabal.preprohormone(p002kotlin.jvm.internal.taiyuan.f29402attabal));
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(double[].class), defendable.attabal.marial());
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(Float.TYPE), defendable.attabal.cord(p002kotlin.jvm.internal.cutely.f29387attabal));
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(float[].class), defendable.attabal.beachfront());
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(Long.TYPE), defendable.attabal.stratoscope(p002kotlin.jvm.internal.arytenoidectomy.f29374attabal));
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(long[].class), defendable.attabal.taiyuan());
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(patroclinal.monoploid.class), defendable.attabal.restrictive(patroclinal.monoploid.INSTANCE));
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(Integer.TYPE), defendable.attabal.cuirassed(p002kotlin.jvm.internal.triweekly.f29403attabal));
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(int[].class), defendable.attabal.competently());
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(patroclinal.kowloon.class), defendable.attabal.supplicat(patroclinal.kowloon.INSTANCE));
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(Short.TYPE), defendable.attabal.trm(p002kotlin.jvm.internal.adultoid.f29373attabal));
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(short[].class), defendable.attabal.triweekly());
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(patroclinal.graveside.class), defendable.attabal.merc(patroclinal.graveside.INSTANCE));
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(Byte.TYPE), defendable.attabal.gintrap(p002kotlin.jvm.internal.wireman.f29404attabal));
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(byte[].class), defendable.attabal.dern());
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(patroclinal.impassible.class), defendable.attabal.kattegat(patroclinal.impassible.INSTANCE));
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(Boolean.TYPE), defendable.attabal.dovishness(p002kotlin.jvm.internal.dern.f29388attabal));
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(boolean[].class), defendable.attabal.saneness());
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(Unit.class), defendable.attabal.adultoid(Unit.f29295attabal));
        mapDern.put(p002kotlin.jvm.internal.polloi.saneness(Void.class), defendable.attabal.formularize());
        try {
            mapDern.put(p002kotlin.jvm.internal.polloi.saneness(p002kotlin.time.saneness.class), defendable.attabal.yemenite(p002kotlin.time.saneness.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapDern.put(p002kotlin.jvm.internal.polloi.saneness(patroclinal.polloi.class), defendable.attabal.polloi());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapDern.put(p002kotlin.jvm.internal.polloi.saneness(patroclinal.arytenoidectomy.class), defendable.attabal.monoploid());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapDern.put(p002kotlin.jvm.internal.polloi.saneness(patroclinal.adultoid.class), defendable.attabal.molybdenite());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapDern.put(p002kotlin.jvm.internal.polloi.saneness(patroclinal.triweekly.class), defendable.attabal.arytenoidectomy());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapDern.put(p002kotlin.jvm.internal.polloi.saneness(Uuid.class), defendable.attabal.sealless(Uuid.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return p002kotlin.collections.polder.saneness(mapDern);
    }

    public static final <T> boolean triweekly(Class<T> cls) {
        if (cls.getAnnotation(asosan.marial.class) != null) {
            return true;
        }
        asosan.formularize formularizeVar = (asosan.formularize) cls.getAnnotation(asosan.formularize.class);
        return formularizeVar != null && Intrinsics.wireman(p002kotlin.jvm.internal.polloi.saneness(formularizeVar.with()), p002kotlin.jvm.internal.polloi.saneness(asosan.impromptu.class));
    }

    public static final <T> asosan.wireman<T> wireman(kurbash.wireman<T> wiremanVar, asosan.wireman<Object>... args) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return dern(gibeonite.attabal.saneness(wiremanVar), (asosan.wireman[]) Arrays.copyOf(args, args.length));
    }
}
