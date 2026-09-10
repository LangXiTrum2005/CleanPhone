package com.startapp.json.internal;

import com.startapp.json.JsonException;
import com.startapp.json.TypeClassInfo;
import com.startapp.json.TypeInfo;
import com.startapp.json.TypeParser;
import com.thinkup.core.common.n.mo;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, Class<?>> f40417a;

    static {
        HashMap map = new HashMap();
        f40417a = map;
        map.put("int[]", Integer.class);
        map.put("long[]", Long.class);
        map.put("double[]", Double.class);
        map.put("float[]", Float.class);
        map.put("bool[]", Boolean.class);
        map.put("char[]", Character.class);
        map.put("byte[]", Byte.class);
        map.put("void[]", Void.class);
        map.put("short[]", Short.class);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0115  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    public static <T> T a(Class<T> cls, JSONObject jSONObject) throws JsonException {
        T tNewInstance;
        boolean z2;
        Class<? extends TypeParser> rVar;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> clsType;
        Class<?> clsKey;
        ?? r17;
        Object objA;
        Object objB;
        Class<?> type;
        try {
            TypeClassInfo typeClassInfo = (TypeClassInfo) cls.getAnnotation(TypeClassInfo.class);
            boolean z3 = true;
            char c2 = 0;
            if (cls.equals(HttpCookie.class)) {
                Constructor<?> constructor = cls.getDeclaredConstructors()[0];
                constructor.setAccessible(true);
                tNewInstance = (T) constructor.newInstance("name", "value");
            } else {
                if (cls.isPrimitive()) {
                    return cls.newInstance();
                }
                if (cls.getAnnotation(TypeClassInfo.class) == null || typeClassInfo.extendsClass()) {
                    Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    tNewInstance = declaredConstructor.newInstance(new Object[0]);
                } else {
                    if (!typeClassInfo.extendsClass()) {
                        try {
                            String string = jSONObject.getString(typeClassInfo.decider());
                            return (T) a(Class.forName(typeClassInfo.packageName() + mo.ono + string), jSONObject);
                        } catch (ClassNotFoundException e2) {
                            throw new JsonException(e2);
                        } catch (JSONException e3) {
                            throw new JsonException(e3);
                        }
                    }
                    tNewInstance = null;
                }
            }
            Field[] declaredFields = cls.getDeclaredFields();
            if (typeClassInfo != null && typeClassInfo.extendsClass()) {
                int length = declaredFields.length;
                Field[] declaredFields2 = cls.getSuperclass().getDeclaredFields();
                int length2 = declaredFields2.length;
                Field[] fieldArr = new Field[length + length2];
                System.arraycopy(declaredFields, 0, fieldArr, 0, length);
                System.arraycopy(declaredFields2, 0, fieldArr, length, length2);
                declaredFields = fieldArr;
            }
            int length3 = declaredFields.length;
            int i2 = 0;
            while (i2 < length3) {
                Field field = declaredFields[i2];
                int modifiers = field.getModifiers();
                if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
                    String strA = a(field);
                    try {
                        try {
                            if (jSONObject.has(strA)) {
                                field.setAccessible(z3);
                                if (field.getDeclaredAnnotations().length > 0) {
                                    Annotation annotation = field.getDeclaredAnnotations()[c2];
                                    if (annotation.annotationType().equals(TypeInfo.class)) {
                                        TypeInfo typeInfo = (TypeInfo) annotation;
                                        clsType = typeInfo.type();
                                        clsKey = typeInfo.key();
                                        Class<?> clsValue = typeInfo.value();
                                        boolean zComplex = typeInfo.complex();
                                        Class<?> clsInnerValue = typeInfo.innerValue();
                                        rVar = typeInfo.parser();
                                        z2 = z3;
                                        cls2 = clsValue;
                                        cls3 = clsInnerValue;
                                        r17 = zComplex;
                                    } else {
                                        char c3 = c2;
                                        z2 = c3 == true ? 1 : 0;
                                        rVar = TypeParser.class;
                                        cls2 = null;
                                        cls3 = null;
                                        clsType = null;
                                        clsKey = null;
                                        r17 = c3;
                                    }
                                } else {
                                    char c4 = c2;
                                    z2 = c4 == true ? 1 : 0;
                                    rVar = TypeParser.class;
                                    cls2 = null;
                                    cls3 = null;
                                    clsType = null;
                                    clsKey = null;
                                    r17 = c4;
                                }
                                try {
                                    if (field.getType().getAnnotation(TypeClassInfo.class) != null) {
                                        TypeClassInfo typeClassInfo2 = (TypeClassInfo) field.getType().getAnnotation(TypeClassInfo.class);
                                        String string2 = jSONObject.getJSONObject(strA).getString(typeClassInfo2.decider());
                                        type = Class.forName(typeClassInfo2.packageName() + mo.ono + string2);
                                    } else {
                                        if (rVar != TypeParser.class) {
                                            objA = rVar.newInstance().parse(field.getType(), jSONObject.opt(strA));
                                        } else if (r17 != 0) {
                                            type = field.getType();
                                        } else if (z2 && (Map.class.isAssignableFrom(clsType) || Collection.class.isAssignableFrom(clsType))) {
                                            if (clsType.equals(HashMap.class)) {
                                                JSONObject jSONObject2 = jSONObject.getJSONObject(strA);
                                                objB = a(clsKey, cls2, cls3, jSONObject2, jSONObject2.keys());
                                            } else if (clsType.equals(ArrayList.class)) {
                                                objB = a(cls2, jSONObject.getJSONArray(strA));
                                            } else if (clsType.equals(HashSet.class)) {
                                                objB = b(cls2, jSONObject.getJSONArray(strA));
                                            } else if (clsType.equals(EnumSet.class)) {
                                                JSONArray jSONArray = jSONObject.getJSONArray(strA);
                                                HashSet hashSet = new HashSet();
                                                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                                    hashSet.add(Enum.valueOf(cls2, jSONArray.getString(i3)));
                                                }
                                                field.set(tNewInstance, hashSet);
                                            }
                                            field.set(tNewInstance, objB);
                                        } else if (field.getType().isEnum()) {
                                            field.set(tNewInstance, Enum.valueOf(clsType, (String) jSONObject.get(strA)));
                                        } else if (field.getType().isPrimitive()) {
                                            objA = a(jSONObject, field, jSONObject.get(strA), field.getType());
                                        } else if (field.getType().isArray()) {
                                            objA = a(jSONObject, clsType, field);
                                        } else {
                                            objA = a(jSONObject.get(strA), field.getType());
                                            if (objA.equals(null)) {
                                                field.set(tNewInstance, null);
                                            } else {
                                                field.set(tNewInstance, objA);
                                            }
                                        }
                                        field.set(tNewInstance, objA);
                                    }
                                    field.set(tNewInstance, objA);
                                } catch (Exception unused) {
                                }
                                objA = a(type, jSONObject.getJSONObject(strA));
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (Throwable th) {
                        throw new JsonException(th);
                    }
                }
                i2++;
                z3 = true;
                c2 = 0;
            }
            return tNewInstance;
        } catch (Exception e4) {
            throw new JsonException(e4);
        }
    }

    public static <V> Set<V> b(Class<V> cls, JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            hashSet.add(jSONObjectOptJSONObject == null ? jSONArray.get(i2) : a(cls, jSONObjectOptJSONObject));
        }
        return hashSet;
    }

    public static boolean b(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations == null || declaredAnnotations.length == 0) {
            return false;
        }
        Annotation annotation = field.getDeclaredAnnotations()[0];
        if (annotation.annotationType().equals(TypeInfo.class)) {
            return ((TypeInfo) annotation).complex();
        }
        return false;
    }

    public static Object a(Object obj, Class<?> cls) {
        if (obj.getClass().equals(cls)) {
            return obj;
        }
        if (!cls.equals(Integer.class)) {
            return (cls.equals(Long.class) && obj.getClass().equals(Integer.class)) ? Long.valueOf(((Integer) obj).longValue()) : obj;
        }
        if (obj.getClass().equals(Double.class)) {
            return Integer.valueOf(((Double) obj).intValue());
        }
        return obj.getClass().equals(Long.class) ? Integer.valueOf(((Long) obj).intValue()) : obj;
    }

    public static Object a(JSONObject jSONObject, Field field, Object obj, Class<?> cls) {
        if (!obj.getClass().equals(cls)) {
            boolean zEquals = obj.getClass().equals(String.class);
            Class cls2 = Integer.TYPE;
            if (zEquals) {
                if (cls.equals(cls2)) {
                    return Integer.valueOf(jSONObject.getInt(a(field)));
                }
            } else {
                if (cls.equals(cls2)) {
                    return Integer.valueOf(((Number) obj).intValue());
                }
                if (cls.equals(Float.TYPE)) {
                    return Float.valueOf(((Number) obj).floatValue());
                }
                if (cls.equals(Long.TYPE)) {
                    return Long.valueOf(((Number) obj).longValue());
                }
                if (cls.equals(Double.TYPE)) {
                    return Double.valueOf(((Number) obj).doubleValue());
                }
            }
        }
        return obj;
    }

    public static String a(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations != null && declaredAnnotations.length > 0) {
            Annotation annotation = field.getDeclaredAnnotations()[0];
            if (annotation.annotationType().equals(TypeInfo.class)) {
                TypeInfo typeInfo = (TypeInfo) annotation;
                if (!"".equals(typeInfo.name())) {
                    return typeInfo.name();
                }
            }
        }
        return field.getName();
    }

    public static <V> List<V> a(Class<V> cls, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            arrayList.add(jSONObjectOptJSONObject == null ? jSONArray.get(i2) : a(cls, jSONObjectOptJSONObject));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Class<?>>] */
    public static <T> Object a(JSONObject jSONObject, Class<T> cls, Field field) throws JSONException, NoSuchMethodException {
        if (cls != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(a(field));
            int length = jSONArray.length();
            Object objNewInstance = Array.newInstance((Class<?>) cls, length);
            for (int i2 = 0; i2 < length; i2++) {
                Array.set(objNewInstance, i2, a(cls, jSONArray.getJSONObject(i2)));
            }
            return (Object[]) objNewInstance;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(a(field));
        int length2 = jSONArray2.length();
        Class cls2 = (Class) f40417a.get(field.getType().getSimpleName());
        Object objNewInstance2 = Array.newInstance((Class<?>) cls2.getField("TYPE").get(null), length2);
        for (int i3 = 0; i3 < length2; i3++) {
            String string = jSONArray2.getString(i3);
            Constructor<T> constructor = cls2.getConstructor(cls2.equals(Character.class) ? Character.TYPE : String.class);
            Array.set(objNewInstance2, i3, cls2.equals(Character.class) ? constructor.newInstance(Character.valueOf(string.charAt(0))) : constructor.newInstance(string));
        }
        return objNewInstance2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map a(Class cls, Class cls2, Class cls3, JSONObject jSONObject, Iterator it) throws JsonException {
        Object objA;
        HashMap map = new HashMap();
        while (it.hasNext()) {
            Object next = it.next();
            Object objCast = cls.equals(Integer.class) ? cls.cast(Integer.valueOf(Integer.parseInt((String) next))) : next;
            if (cls.isEnum()) {
                objCast = Enum.valueOf(cls, objCast.toString());
            }
            String str = (String) next;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
                if (jSONArrayOptJSONArray == null) {
                    objA = cls2.isEnum() ? Enum.valueOf(cls2, (String) jSONObject.get(str)) : jSONObject.get(str);
                } else {
                    objA = a(cls3, jSONArrayOptJSONArray);
                }
            } else {
                objA = a((Class<Object>) cls2, jSONObjectOptJSONObject);
            }
            map.put(objCast, objA);
        }
        return map;
    }
}
