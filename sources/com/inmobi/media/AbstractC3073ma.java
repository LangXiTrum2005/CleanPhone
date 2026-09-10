package com.inmobi.media;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.saneness;

/* JADX INFO: renamed from: com.inmobi.media.ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3073ma {
    public static final /* synthetic */ int a = 0;

    public static JSONObject a(Object obj, Class cls) {
        JSONObject jSONObject;
        try {
            cls.getSimpleName();
            Class superclass = cls.getSuperclass();
            if (superclass == null || Intrinsics.wireman(Object.class, superclass)) {
                jSONObject = null;
            } else {
                Class superclass2 = cls.getSuperclass();
                superclass2.getSimpleName();
                Intrinsics.beachfront(superclass2);
                jSONObject = a(obj, superclass2);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            Iterator itAttabal = saneness.attabal(cls.getDeclaredFields());
            while (itAttabal.hasNext()) {
                Field field = (Field) itAttabal.next();
                field.setAccessible(true);
                if (field.get(obj) == null) {
                    field.getName();
                } else {
                    Class<?> type = field.getType();
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(A8.class)) {
                        Intrinsics.beachfront(type);
                        if (Modifier.isStatic(cls.getModifiers()) || !Intrinsics.wireman(cls.getEnclosingClass(), type)) {
                            String name = field.getName();
                            Class cls2 = Integer.TYPE;
                            if (Intrinsics.wireman(cls2, type) || Intrinsics.wireman(cls2, type) || Intrinsics.wireman(Integer.class, type)) {
                                Object obj2 = field.get(obj);
                                Intrinsics.competently(obj2, "null cannot be cast to non-null type kotlin.Int");
                                jSONObject.put(name, ((Integer) obj2).intValue());
                            } else {
                                Class cls3 = Boolean.TYPE;
                                if (Intrinsics.wireman(cls3, type) || Intrinsics.wireman(cls3, type) || Intrinsics.wireman(Boolean.class, type)) {
                                    Object obj3 = field.get(obj);
                                    Intrinsics.competently(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                                    jSONObject.put(name, ((Boolean) obj3).booleanValue());
                                } else {
                                    Class cls4 = Double.TYPE;
                                    if (Intrinsics.wireman(cls4, type) || Intrinsics.wireman(cls4, type) || Intrinsics.wireman(Double.class, type)) {
                                        Object obj4 = field.get(obj);
                                        Intrinsics.competently(obj4, "null cannot be cast to non-null type kotlin.Double");
                                        jSONObject.put(name, ((Double) obj4).doubleValue());
                                    } else {
                                        Class cls5 = Float.TYPE;
                                        if (Intrinsics.wireman(cls5, type) || Intrinsics.wireman(cls5, type) || Intrinsics.wireman(Float.class, type)) {
                                            Object obj5 = field.get(obj);
                                            Intrinsics.competently(obj5, "null cannot be cast to non-null type kotlin.Float");
                                            jSONObject.put(name, (Float) obj5);
                                        } else {
                                            Class cls6 = Long.TYPE;
                                            if (Intrinsics.wireman(cls6, type) || Intrinsics.wireman(cls6, type) || Intrinsics.wireman(Long.class, type)) {
                                                Object obj6 = field.get(obj);
                                                Intrinsics.competently(obj6, "null cannot be cast to non-null type kotlin.Long");
                                                jSONObject.put(name, ((Long) obj6).longValue());
                                            } else {
                                                Class cls7 = Byte.TYPE;
                                                if (Intrinsics.wireman(cls7, type) || Intrinsics.wireman(cls7, type) || Intrinsics.wireman(Byte.class, type)) {
                                                    Object obj7 = field.get(obj);
                                                    Intrinsics.competently(obj7, "null cannot be cast to non-null type kotlin.Byte");
                                                    jSONObject.put(name, (Byte) obj7);
                                                } else if (Intrinsics.wireman(String.class, type) || Intrinsics.wireman(JSONObject.class, type) || Intrinsics.wireman(JSONArray.class, type)) {
                                                    jSONObject.put(name, field.get(obj));
                                                } else {
                                                    Class cls8 = Short.TYPE;
                                                    if (Intrinsics.wireman(cls8, type) || Intrinsics.wireman(cls8, type) || Intrinsics.wireman(Short.class, type)) {
                                                        Object obj8 = field.get(obj);
                                                        Intrinsics.competently(obj8, "null cannot be cast to non-null type kotlin.Short");
                                                        jSONObject.put(name, (Short) obj8);
                                                    } else if (Map.class.isAssignableFrom(type)) {
                                                        JSONObject jSONObject2 = new JSONObject();
                                                        Object obj9 = field.get(obj);
                                                        if (obj9 != null) {
                                                            Map map = (Map) obj9;
                                                            for (Object obj10 : map.keySet()) {
                                                                Object objA = map.get(obj10);
                                                                if (objA != null) {
                                                                    if (!a(objA.getClass())) {
                                                                        objA = a(objA, objA.getClass());
                                                                    }
                                                                    jSONObject2.put(String.valueOf(obj10), objA);
                                                                }
                                                            }
                                                        }
                                                        jSONObject.put(name, jSONObject2);
                                                    } else if (List.class.isAssignableFrom(type)) {
                                                        JSONArray jSONArray = new JSONArray();
                                                        Object obj11 = field.get(obj);
                                                        if (obj11 != null) {
                                                            for (Object obj12 : (List) obj11) {
                                                                if (obj12 != null) {
                                                                    Object objA2 = a(obj12.getClass()) ? obj12 : a(obj12, obj12.getClass());
                                                                    if (objA2 == null) {
                                                                        obj12.getClass().toString();
                                                                    } else {
                                                                        jSONArray.put(objA2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jSONObject.put(name, jSONArray);
                                                    } else if (type.isArray()) {
                                                        JSONArray jSONArray2 = new JSONArray();
                                                        Object obj13 = field.get(obj);
                                                        if (obj13 != null) {
                                                            int length = Array.getLength(obj13);
                                                            for (int i = 0; i < length; i++) {
                                                                Object obj14 = Array.get(obj13, i);
                                                                if (obj14 != null) {
                                                                    Object objA3 = a(obj14.getClass()) ? obj14 : a(obj14, obj14.getClass());
                                                                    if (objA3 == null) {
                                                                        obj14.getClass().toString();
                                                                    } else {
                                                                        jSONArray2.put(objA3);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jSONObject.put(name, jSONArray2);
                                                    } else {
                                                        Object obj15 = field.get(obj);
                                                        if (obj15 != null) {
                                                            jSONObject.put(name, a(obj15, obj15.getClass()));
                                                        } else {
                                                            Unit unit = Unit.f29295attabal;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return jSONObject;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public static void b(Field field, Object obj, JSONObject jSONObject) throws JSONException {
        double d = jSONObject.getDouble(field.getName());
        try {
            if (field.getType() == Double.TYPE) {
                field.getName();
                field.setDouble(obj, d);
            } else {
                field.getName();
                field.set(obj, Double.valueOf(d));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static void c(Field field, Object obj, JSONObject jSONObject) {
        float f = (float) jSONObject.getDouble(field.getName());
        try {
            if (field.getType() == Float.TYPE) {
                field.getName();
                field.setFloat(obj, f);
            } else {
                field.getName();
                field.set(obj, Float.valueOf(f));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static void d(Field field, Object obj, JSONObject jSONObject) throws JSONException {
        int i = jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Integer.TYPE) {
                field.getName();
                field.setInt(obj, i);
            } else {
                field.getName();
                field.set(obj, Integer.valueOf(i));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static void e(Field field, Object obj, JSONObject jSONObject) throws JSONException {
        long j = jSONObject.getLong(field.getName());
        try {
            if (field.getType() == Long.TYPE) {
                field.getName();
                field.setLong(obj, j);
            } else {
                field.getName();
                field.set(obj, Long.valueOf(j));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static void f(Field field, Object obj, JSONObject jSONObject) {
        short s = (short) jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Short.TYPE) {
                field.getName();
                field.setShort(obj, s);
            } else {
                field.getName();
                field.set(obj, Short.valueOf(s));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0320  */
    /* JADX WARN: Code duplicated, block: B:159:0x032d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0351  */
    /* JADX WARN: Code duplicated, block: B:276:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v31 */
    public static Object a(JSONObject jSONObject, Class cls, Object obj, Object obj2) throws IllegalAccessException, JSONException {
        Constructor<?> constructor;
        Object objNewInstance;
        Object objValueOf;
        Object obj3;
        boolean z;
        Iterator it;
        Class cls2;
        Class cls3;
        Object objValueOf2;
        ?? r3;
        ?? r4;
        List linkedList;
        cls.getSimpleName();
        cls.toString();
        Objects.toString(obj);
        Class cls4 = Boolean.TYPE;
        Class cls5 = Float.TYPE;
        Class cls6 = Double.TYPE;
        Class cls7 = Long.TYPE;
        Class cls8 = Integer.TYPE;
        int i = 0;
        Object obj4 = null;
        boolean z2 = true;
        if (obj2 == null) {
            try {
                Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                Intrinsics.beachfront(declaredConstructors);
                if (declaredConstructors.length == 0) {
                    objNewInstance = cls.newInstance();
                } else {
                    int length = declaredConstructors.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            constructor = null;
                            break;
                        }
                        constructor = declaredConstructors[i2];
                        Class<?>[] parameterTypes = constructor.getParameterTypes();
                        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0) {
                            break;
                        }
                        i2++;
                    }
                    if (constructor == null) {
                        constructor = declaredConstructors[0];
                    }
                    constructor.setAccessible(true);
                    int length2 = constructor.getParameterTypes().length;
                    if (length2 == 0) {
                        objNewInstance = constructor.newInstance(null);
                    } else {
                        Object[] objArr = new Object[length2];
                        Iterator itAttabal = saneness.attabal(constructor.getParameterTypes());
                        int i3 = 0;
                        while (itAttabal.hasNext()) {
                            Class cls9 = (Class) itAttabal.next();
                            int i4 = i3 + 1;
                            Intrinsics.beachfront(cls9);
                            if (!Intrinsics.wireman(cls8, cls9) && !Intrinsics.wireman(cls7, cls9)) {
                                if (Intrinsics.wireman(cls4, cls9)) {
                                    objValueOf = Boolean.FALSE;
                                } else {
                                    objValueOf = (Intrinsics.wireman(cls6, cls9) || Intrinsics.wireman(cls5, cls9)) ? Double.valueOf(0.0d) : null;
                                }
                            } else {
                                objValueOf = 0;
                            }
                            objArr[i3] = objValueOf;
                            i3 = i4;
                        }
                        objNewInstance = constructor.newInstance(Arrays.copyOf(objArr, length2));
                    }
                }
            } catch (Exception e) {
                e.getMessage();
                cls.toString();
                return null;
            }
        } else {
            objNewInstance = obj2;
        }
        if (cls.getSuperclass() != null) {
            Class superclass = cls.getSuperclass();
            superclass.getSimpleName();
            Intrinsics.beachfront(superclass);
            objNewInstance = a(jSONObject, superclass, obj, objNewInstance);
        }
        Iterator itAttabal2 = saneness.attabal(cls.getDeclaredFields());
        while (itAttabal2.hasNext()) {
            Field field = (Field) itAttabal2.next();
            field.setAccessible(z2);
            String name = field.getName();
            if (!Intrinsics.wireman(name, "shadow$_klass_") && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(A8.class)) {
                if (jSONObject.has(name) && !jSONObject.isNull(name)) {
                    Class<?> type = field.getType();
                    if (!Intrinsics.wireman(cls8, type) && !Intrinsics.wireman(cls8, type) && !Intrinsics.wireman(Integer.class, type)) {
                        if (!Intrinsics.wireman(cls4, type) && !Intrinsics.wireman(cls4, type) && !Intrinsics.wireman(Boolean.class, type)) {
                            if (!Intrinsics.wireman(cls6, type) && !Intrinsics.wireman(cls6, type) && !Intrinsics.wireman(Double.class, type)) {
                                if (!Intrinsics.wireman(cls5, type) && !Intrinsics.wireman(cls5, type) && !Intrinsics.wireman(Float.class, type)) {
                                    if (!Intrinsics.wireman(cls7, type) && !Intrinsics.wireman(cls7, type) && !Intrinsics.wireman(Long.class, type)) {
                                        Class cls10 = Byte.TYPE;
                                        if (!Intrinsics.wireman(cls10, type) && !Intrinsics.wireman(cls10, type) && !Intrinsics.wireman(Byte.class, type)) {
                                            if (Intrinsics.wireman(String.class, type)) {
                                                field.set(objNewInstance, jSONObject.getString(name));
                                            } else {
                                                Class cls11 = Short.TYPE;
                                                if (Intrinsics.wireman(cls11, type) || Intrinsics.wireman(cls11, type)) {
                                                    i = i;
                                                    obj3 = obj4;
                                                    z = z2;
                                                    it = itAttabal2;
                                                    Intrinsics.beachfront(field);
                                                    f(field, objNewInstance, jSONObject);
                                                    itAttabal2 = it;
                                                    obj4 = obj3;
                                                    z2 = z;
                                                    i = i;
                                                    cls4 = cls4;
                                                    cls5 = cls5;
                                                    cls6 = cls6;
                                                } else {
                                                    i = i;
                                                    if (!Intrinsics.wireman(Short.class, type)) {
                                                        if (Intrinsics.wireman(JSONObject.class, type)) {
                                                            Intrinsics.beachfront(field);
                                                            JSONObject jSONObject2 = jSONObject.getJSONObject(field.getName());
                                                            JSONObject jSONObject3 = new JSONObject();
                                                            Intrinsics.checkNotNullParameter(field, "<this>");
                                                            if (jSONObject2 == null) {
                                                                jSONObject2 = jSONObject3;
                                                            }
                                                            field.set(objNewInstance, jSONObject2);
                                                        } else if (Intrinsics.wireman(JSONArray.class, type)) {
                                                            field.set(objNewInstance, jSONObject.getJSONArray(name));
                                                        } else {
                                                            ?? r18 = z2;
                                                            cls4 = cls4;
                                                            if (Map.class.isAssignableFrom(type)) {
                                                                JSONObject jSONObject4 = jSONObject.getJSONObject(name);
                                                                Objects.toString(jSONObject4);
                                                                HashMap map = new HashMap();
                                                                Iterator<String> itKeys = jSONObject4.keys();
                                                                while (itKeys.hasNext()) {
                                                                    Iterator it2 = itAttabal2;
                                                                    String next = itKeys.next();
                                                                    Intrinsics.beachfront(jSONObject4);
                                                                    Intrinsics.beachfront(next);
                                                                    Iterator<String> it3 = itKeys;
                                                                    Type genericType = field.getGenericType();
                                                                    Intrinsics.competently(genericType, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                                    Type type2 = ((ParameterizedType) genericType).getActualTypeArguments()[r18];
                                                                    Intrinsics.competently(type2, "null cannot be cast to non-null type java.lang.Class<*>");
                                                                    Class cls12 = (Class) type2;
                                                                    if (Intrinsics.wireman(cls8, cls12)) {
                                                                        objValueOf2 = Integer.valueOf(jSONObject4.getInt(next));
                                                                    } else {
                                                                        if (Intrinsics.wireman(cls6, cls12)) {
                                                                            objValueOf2 = Double.valueOf(jSONObject4.getDouble(next));
                                                                        } else if (Intrinsics.wireman(cls5, cls12)) {
                                                                            cls2 = cls5;
                                                                            cls3 = cls6;
                                                                            objValueOf2 = Float.valueOf((float) jSONObject4.getDouble(next));
                                                                        } else {
                                                                            cls2 = cls5;
                                                                            cls3 = cls6;
                                                                            if (Intrinsics.wireman(cls7, cls12)) {
                                                                                objValueOf2 = Long.valueOf(jSONObject4.getLong(next));
                                                                            } else if (Intrinsics.wireman(cls10, cls12)) {
                                                                                objValueOf2 = Byte.valueOf((byte) jSONObject4.getInt(next));
                                                                            } else if (Intrinsics.wireman(cls11, cls12)) {
                                                                                objValueOf2 = Short.valueOf((short) jSONObject4.getInt(next));
                                                                            } else {
                                                                                objValueOf2 = jSONObject4.get(next);
                                                                            }
                                                                        }
                                                                        Intrinsics.beachfront(objValueOf2);
                                                                        if (objValueOf2 != null) {
                                                                            r4 = r18;
                                                                            if (a(objValueOf2.getClass()) != r4) {
                                                                            }
                                                                            if (objValueOf2 != null) {
                                                                                map.put(next, objValueOf2);
                                                                            }
                                                                            itAttabal2 = it2;
                                                                            itKeys = it3;
                                                                            cls5 = cls2;
                                                                            cls6 = cls3;
                                                                            r18 = 1;
                                                                        } else {
                                                                            r3 = r18;
                                                                        }
                                                                        r3 = r4;
                                                                        JSONObject jSONObject5 = jSONObject4.getJSONObject(next);
                                                                        Intrinsics.checkNotNullExpressionValue(jSONObject5, "getJSONObject(...)");
                                                                        Type genericType2 = field.getGenericType();
                                                                        Intrinsics.competently(genericType2, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                                        Type type3 = ((ParameterizedType) genericType2).getActualTypeArguments()[r3];
                                                                        Intrinsics.competently(type3, "null cannot be cast to non-null type java.lang.Class<*>");
                                                                        objValueOf2 = a(jSONObject5, (Class) type3, null, null);
                                                                        if (objValueOf2 != null) {
                                                                            map.put(next, objValueOf2);
                                                                        }
                                                                        itAttabal2 = it2;
                                                                        itKeys = it3;
                                                                        cls5 = cls2;
                                                                        cls6 = cls3;
                                                                        r18 = 1;
                                                                    }
                                                                    cls2 = cls5;
                                                                    cls3 = cls6;
                                                                    Intrinsics.beachfront(objValueOf2);
                                                                    if (objValueOf2 != null) {
                                                                        r4 = r18;
                                                                        if (a(objValueOf2.getClass()) != r4) {
                                                                        }
                                                                        if (objValueOf2 != null) {
                                                                            map.put(next, objValueOf2);
                                                                        }
                                                                        itAttabal2 = it2;
                                                                        itKeys = it3;
                                                                        cls5 = cls2;
                                                                        cls6 = cls3;
                                                                        r18 = 1;
                                                                    } else {
                                                                        r3 = r18;
                                                                    }
                                                                    r3 = r4;
                                                                    JSONObject jSONObject6 = jSONObject4.getJSONObject(next);
                                                                    Intrinsics.checkNotNullExpressionValue(jSONObject6, "getJSONObject(...)");
                                                                    Type genericType3 = field.getGenericType();
                                                                    Intrinsics.competently(genericType3, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                                    Type type4 = ((ParameterizedType) genericType3).getActualTypeArguments()[r3];
                                                                    Intrinsics.competently(type4, "null cannot be cast to non-null type java.lang.Class<*>");
                                                                    objValueOf2 = a(jSONObject6, (Class) type4, null, null);
                                                                    if (objValueOf2 != null) {
                                                                        map.put(next, objValueOf2);
                                                                    }
                                                                    itAttabal2 = it2;
                                                                    itKeys = it3;
                                                                    cls5 = cls2;
                                                                    cls6 = cls3;
                                                                    r18 = 1;
                                                                }
                                                                field.set(objNewInstance, map);
                                                            } else {
                                                                cls5 = cls5;
                                                                cls6 = cls6;
                                                                it = itAttabal2;
                                                                if (List.class.isAssignableFrom(type)) {
                                                                    JSONArray jSONArray = jSONObject.getJSONArray(name);
                                                                    Intrinsics.beachfront(field);
                                                                    if (!Intrinsics.wireman(field.getType(), LinkedList.class) && !Intrinsics.wireman(field.getType(), LinkedList.class)) {
                                                                        linkedList = new ArrayList();
                                                                    } else {
                                                                        linkedList = new LinkedList();
                                                                    }
                                                                    int length3 = jSONArray.length();
                                                                    for (int i5 = i; i5 < length3; i5++) {
                                                                        Intrinsics.beachfront(jSONArray);
                                                                        Type genericType4 = field.getGenericType();
                                                                        Intrinsics.competently(genericType4, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                                        Type type5 = ((ParameterizedType) genericType4).getActualTypeArguments()[i];
                                                                        Intrinsics.competently(type5, "null cannot be cast to non-null type java.lang.Class<*>");
                                                                        Object objA = a(jSONArray, i5, (Class) type5);
                                                                        if (objA == null || !a(objA.getClass())) {
                                                                            JSONObject jSONObject7 = jSONArray.getJSONObject(i5);
                                                                            Intrinsics.checkNotNullExpressionValue(jSONObject7, "getJSONObject(...)");
                                                                            Type genericType5 = field.getGenericType();
                                                                            Intrinsics.competently(genericType5, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                                            Type type6 = ((ParameterizedType) genericType5).getActualTypeArguments()[i];
                                                                            Intrinsics.competently(type6, "null cannot be cast to non-null type java.lang.Class<*>");
                                                                            objA = a(jSONObject7, (Class) type6, null, null);
                                                                        }
                                                                        if (objA != null) {
                                                                            linkedList.add(objA);
                                                                        }
                                                                    }
                                                                    field.set(objNewInstance, linkedList);
                                                                    itAttabal2 = it;
                                                                    cls5 = cls5;
                                                                    cls6 = cls6;
                                                                } else if (type.isArray()) {
                                                                    JSONArray jSONArray2 = jSONObject.getJSONArray(name);
                                                                    Class<?> componentType = type.getComponentType();
                                                                    int length4 = jSONArray2.length();
                                                                    Object objNewInstance2 = Array.newInstance(componentType, length4);
                                                                    for (int i6 = i; i6 < length4; i6++) {
                                                                        Intrinsics.beachfront(jSONArray2);
                                                                        Intrinsics.beachfront(componentType);
                                                                        Object objA2 = a(jSONArray2, i6, componentType);
                                                                        if (objA2 == null || !a(objA2.getClass())) {
                                                                            JSONObject jSONObject8 = jSONArray2.getJSONObject(i6);
                                                                            Intrinsics.checkNotNullExpressionValue(jSONObject8, "getJSONObject(...)");
                                                                            objA2 = a(jSONObject8, componentType, null, null);
                                                                        }
                                                                        if (objA2 != null) {
                                                                            Array.set(objNewInstance2, i6, objA2);
                                                                        }
                                                                    }
                                                                    field.set(objNewInstance, objNewInstance2);
                                                                    itAttabal2 = it;
                                                                    z2 = true;
                                                                    i = i;
                                                                    cls4 = cls4;
                                                                    cls5 = cls5;
                                                                    cls6 = cls6;
                                                                    obj4 = null;
                                                                } else {
                                                                    z = true;
                                                                    JSONObject jSONObject9 = jSONObject.getJSONObject(name);
                                                                    Objects.toString(objNewInstance);
                                                                    Intrinsics.beachfront(jSONObject9);
                                                                    Intrinsics.beachfront(type);
                                                                    obj3 = null;
                                                                    field.set(objNewInstance, a(jSONObject9, type, objNewInstance, null));
                                                                    itAttabal2 = it;
                                                                    obj4 = obj3;
                                                                    z2 = z;
                                                                    i = i;
                                                                    cls4 = cls4;
                                                                    cls5 = cls5;
                                                                    cls6 = cls6;
                                                                }
                                                            }
                                                            obj4 = null;
                                                            z2 = true;
                                                        }
                                                        i = i;
                                                    } else {
                                                        obj3 = obj4;
                                                        z = z2;
                                                        it = itAttabal2;
                                                        Intrinsics.beachfront(field);
                                                        f(field, objNewInstance, jSONObject);
                                                        itAttabal2 = it;
                                                        obj4 = obj3;
                                                        z2 = z;
                                                        i = i;
                                                        cls4 = cls4;
                                                        cls5 = cls5;
                                                        cls6 = cls6;
                                                    }
                                                }
                                            }
                                        } else {
                                            cls4 = cls4;
                                            cls5 = cls5;
                                            cls6 = cls6;
                                            i = i;
                                            obj3 = obj4;
                                            z = z2;
                                            it = itAttabal2;
                                            Intrinsics.beachfront(field);
                                            a(field, objNewInstance, jSONObject);
                                            itAttabal2 = it;
                                            obj4 = obj3;
                                            z2 = z;
                                            i = i;
                                            cls4 = cls4;
                                            cls5 = cls5;
                                            cls6 = cls6;
                                        }
                                    } else {
                                        cls4 = cls4;
                                        cls5 = cls5;
                                        cls6 = cls6;
                                        i = i;
                                        obj3 = obj4;
                                        z = z2;
                                        it = itAttabal2;
                                        Intrinsics.beachfront(field);
                                        e(field, objNewInstance, jSONObject);
                                        itAttabal2 = it;
                                        obj4 = obj3;
                                        z2 = z;
                                        i = i;
                                        cls4 = cls4;
                                        cls5 = cls5;
                                        cls6 = cls6;
                                    }
                                } else {
                                    cls4 = cls4;
                                    cls5 = cls5;
                                    cls6 = cls6;
                                    i = i;
                                    obj3 = obj4;
                                    z = z2;
                                    it = itAttabal2;
                                    Intrinsics.beachfront(field);
                                    c(field, objNewInstance, jSONObject);
                                    itAttabal2 = it;
                                    obj4 = obj3;
                                    z2 = z;
                                    i = i;
                                    cls4 = cls4;
                                    cls5 = cls5;
                                    cls6 = cls6;
                                }
                            } else {
                                cls4 = cls4;
                                cls5 = cls5;
                                cls6 = cls6;
                                i = i;
                                obj3 = obj4;
                                z = z2;
                                it = itAttabal2;
                                Intrinsics.beachfront(field);
                                b(field, objNewInstance, jSONObject);
                                itAttabal2 = it;
                                obj4 = obj3;
                                z2 = z;
                                i = i;
                                cls4 = cls4;
                                cls5 = cls5;
                                cls6 = cls6;
                            }
                        } else {
                            cls4 = cls4;
                            cls5 = cls5;
                            cls6 = cls6;
                            i = i;
                            obj3 = obj4;
                            z = z2;
                            it = itAttabal2;
                            Intrinsics.beachfront(field);
                            a(field, objNewInstance, a(jSONObject, field));
                            itAttabal2 = it;
                            obj4 = obj3;
                            z2 = z;
                            i = i;
                            cls4 = cls4;
                            cls5 = cls5;
                            cls6 = cls6;
                        }
                    } else {
                        cls4 = cls4;
                        cls5 = cls5;
                        cls6 = cls6;
                        i = i;
                        obj3 = obj4;
                        z = z2;
                        it = itAttabal2;
                        Intrinsics.beachfront(field);
                        d(field, objNewInstance, jSONObject);
                        itAttabal2 = it;
                        obj4 = obj3;
                        z2 = z;
                        i = i;
                        cls4 = cls4;
                        cls5 = cls5;
                        cls6 = cls6;
                    }
                } else {
                    cls4 = cls4;
                    cls5 = cls5;
                    cls6 = cls6;
                    i = i;
                    obj3 = obj4;
                    z = z2;
                    it = itAttabal2;
                    if (field.isAnnotationPresent(Ue.class)) {
                        throw new JSONException("NonNullable field " + name + " is not present or null in the JSONObject");
                    }
                    itAttabal2 = it;
                    obj4 = obj3;
                    z2 = z;
                    i = i;
                    cls4 = cls4;
                    cls5 = cls5;
                    cls6 = cls6;
                }
            }
        }
        return objNewInstance;
    }

    public static Boolean a(JSONObject jSONObject, Field field) {
        boolean z;
        String name = field.getName();
        try {
            z = jSONObject.getBoolean(name);
        } catch (JSONException unused) {
            z = jSONObject.getInt(name) != 0;
        }
        return Boolean.valueOf(z);
    }

    public static void a(Field field, Object obj, Boolean bool) {
        try {
            if (field.getType() == Boolean.TYPE) {
                field.setBoolean(obj, bool.booleanValue());
            } else {
                field.set(obj, bool);
            }
        } catch (Exception unused) {
            field.getName();
        }
    }

    public static void a(Field field, Object obj, JSONObject jSONObject) {
        byte b = (byte) jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Byte.TYPE) {
                field.getName();
                field.setByte(obj, b);
            } else {
                field.getName();
                field.set(obj, Byte.valueOf(b));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static boolean a(Class cls) {
        Class cls2 = Integer.TYPE;
        if (Intrinsics.wireman(cls2, cls) || Intrinsics.wireman(cls2, cls) || Intrinsics.wireman(Integer.class, cls)) {
            return true;
        }
        Class cls3 = Boolean.TYPE;
        if (Intrinsics.wireman(cls3, cls) || Intrinsics.wireman(cls3, cls) || Intrinsics.wireman(Boolean.class, cls)) {
            return true;
        }
        Class cls4 = Double.TYPE;
        if (Intrinsics.wireman(cls4, cls) || Intrinsics.wireman(cls4, cls) || Intrinsics.wireman(Double.class, cls)) {
            return true;
        }
        Class cls5 = Float.TYPE;
        if (Intrinsics.wireman(cls5, cls) || Intrinsics.wireman(cls5, cls) || Intrinsics.wireman(Float.class, cls)) {
            return true;
        }
        Class cls6 = Long.TYPE;
        if (Intrinsics.wireman(cls6, cls) || Intrinsics.wireman(cls6, cls) || Intrinsics.wireman(Long.class, cls) || Intrinsics.wireman(String.class, cls)) {
            return true;
        }
        Class cls7 = Byte.TYPE;
        if (Intrinsics.wireman(cls7, cls) || Intrinsics.wireman(cls7, cls) || Intrinsics.wireman(Byte.class, cls)) {
            return true;
        }
        Class cls8 = Short.TYPE;
        return Intrinsics.wireman(cls8, cls) || Intrinsics.wireman(cls8, cls) || Intrinsics.wireman(Short.class, cls);
    }

    public static Object a(JSONArray jSONArray, int i, Class cls) throws JSONException {
        Object objValueOf;
        if (Intrinsics.wireman(Integer.TYPE, cls)) {
            objValueOf = Integer.valueOf(jSONArray.getInt(i));
        } else if (Intrinsics.wireman(Double.TYPE, cls)) {
            objValueOf = Double.valueOf(jSONArray.getDouble(i));
        } else if (Intrinsics.wireman(Float.TYPE, cls)) {
            objValueOf = Float.valueOf((float) jSONArray.getDouble(i));
        } else if (Intrinsics.wireman(Long.TYPE, cls)) {
            objValueOf = Long.valueOf(jSONArray.getLong(i));
        } else if (Intrinsics.wireman(Byte.TYPE, cls)) {
            objValueOf = Byte.valueOf((byte) jSONArray.getInt(i));
        } else if (Intrinsics.wireman(Short.TYPE, cls)) {
            objValueOf = Short.valueOf((short) jSONArray.getInt(i));
        } else {
            objValueOf = jSONArray.get(i);
        }
        Intrinsics.beachfront(objValueOf);
        return objValueOf;
    }
}
