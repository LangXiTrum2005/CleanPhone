package com.inmobi.media;

import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.q6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3191q6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f23922b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f23923a = new HashMap();

    @JvmStatic
    public static final boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        return C3175p6.a(jSONObject, jSONObject2);
    }

    public static final /* synthetic */ String b() {
        return "q6";
    }

    @JvmStatic
    public static final void a(Object obj, Object obj2) {
        C3175p6.b(obj, obj2);
    }

    @JvmStatic
    public static final void b(boolean z2) {
        f23922b = z2;
    }

    public final C3191q6 a(Ec key, Dc types) {
        Intrinsics.f(key, "key");
        Intrinsics.f(types, "types");
        this.f23923a.put(key, types);
        return this;
    }

    public final JSONObject a(Object obj, Class cls) {
        JSONObject jSONObject;
        try {
            Class superclass = cls.getSuperclass();
            if (superclass == null || Object.class.equals(superclass)) {
                jSONObject = null;
            } else {
                Class superclass2 = cls.getSuperclass();
                superclass2.getClass();
                jSONObject = a(obj, superclass2);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            Field[] declaredFields = cls.getDeclaredFields();
            Intrinsics.e(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                field.setAccessible(true);
                if (field.get(obj) == null) {
                    field.getName();
                } else {
                    Class<?> type = field.getType();
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(Z4.class)) {
                        Intrinsics.c(type);
                        if (Modifier.isStatic(cls.getModifiers()) || !Intrinsics.a(cls.getEnclosingClass(), type)) {
                            String name = field.getName();
                            Class cls2 = Integer.TYPE;
                            if (!Intrinsics.a(cls2, type) && !Intrinsics.a(cls2, type) && !Integer.class.equals(type)) {
                                Class cls3 = Boolean.TYPE;
                                if (!Intrinsics.a(cls3, type) && !Intrinsics.a(cls3, type) && !Boolean.class.equals(type)) {
                                    Class cls4 = Double.TYPE;
                                    if (!Intrinsics.a(cls4, type) && !Intrinsics.a(cls4, type) && !Double.class.equals(type)) {
                                        Class cls5 = Float.TYPE;
                                        if (!Intrinsics.a(cls5, type) && !Intrinsics.a(cls5, type) && !Float.class.equals(type)) {
                                            Class cls6 = Long.TYPE;
                                            if (!Intrinsics.a(cls6, type) && !Intrinsics.a(cls6, type) && !Long.class.equals(type)) {
                                                Class cls7 = Byte.TYPE;
                                                if (!Intrinsics.a(cls7, type) && !Intrinsics.a(cls7, type) && !Byte.class.equals(type)) {
                                                    if (!String.class.equals(type) && !JSONObject.class.equals(type) && !JSONArray.class.equals(type)) {
                                                        Class cls8 = Short.TYPE;
                                                        if (!Intrinsics.a(cls8, type) && !Intrinsics.a(cls8, type) && !Short.class.equals(type)) {
                                                            if (Map.class.isAssignableFrom(type)) {
                                                                HashMap map = this.f23923a;
                                                                Intrinsics.c(name);
                                                                Dc dc = (Dc) map.get(new Ec(name, cls));
                                                                if (dc instanceof C3192q7) {
                                                                    JSONObject jSONObject2 = new JSONObject();
                                                                    Object obj2 = field.get(obj);
                                                                    if (obj2 != null) {
                                                                        Map map2 = (Map) obj2;
                                                                        C3192q7 c3192q7 = (C3192q7) dc;
                                                                        for (Object obj3 : map2.keySet()) {
                                                                            c3192q7.getClass();
                                                                            Object objA = map2.get(obj3);
                                                                            if (objA != null) {
                                                                                if (!C3175p6.b(objA.getClass()) && !C3175p6.a(objA.getClass())) {
                                                                                    objA = a(objA, (Class) objA.getClass());
                                                                                }
                                                                                jSONObject2.put(obj3.toString(), objA);
                                                                            }
                                                                        }
                                                                    }
                                                                    jSONObject.put(name, jSONObject2);
                                                                }
                                                            } else if (List.class.isAssignableFrom(type)) {
                                                                HashMap map3 = this.f23923a;
                                                                Intrinsics.c(name);
                                                                Object obj4 = map3.get(new Ec(name, cls));
                                                                Intrinsics.c(obj4);
                                                                if (((Dc) obj4) instanceof U6) {
                                                                    JSONArray jSONArray = new JSONArray();
                                                                    Object obj5 = field.get(obj);
                                                                    if (obj5 != null) {
                                                                        for (Object obj6 : (List) obj5) {
                                                                            if (obj6 != null) {
                                                                                Object objA2 = (C3175p6.b(obj6.getClass()) || C3175p6.a(obj6.getClass())) ? obj6 : a(obj6, (Class) obj6.getClass());
                                                                                if (objA2 == null) {
                                                                                    obj6.getClass().toString();
                                                                                } else {
                                                                                    jSONArray.put(objA2);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    jSONObject.put(name, jSONArray);
                                                                }
                                                            } else {
                                                                Object obj7 = field.get(obj);
                                                                if (obj7 != null) {
                                                                    jSONObject.put(name, a(obj7, (Class) obj7.getClass()));
                                                                }
                                                            }
                                                        } else {
                                                            Object obj8 = field.get(obj);
                                                            Intrinsics.d(obj8, "null cannot be cast to non-null type kotlin.Short");
                                                            jSONObject.put(name, (Short) obj8);
                                                        }
                                                    } else {
                                                        jSONObject.put(name, field.get(obj));
                                                    }
                                                } else {
                                                    Object obj9 = field.get(obj);
                                                    Intrinsics.d(obj9, "null cannot be cast to non-null type kotlin.Byte");
                                                    jSONObject.put(name, (Byte) obj9);
                                                }
                                            } else {
                                                Object obj10 = field.get(obj);
                                                Intrinsics.d(obj10, "null cannot be cast to non-null type kotlin.Long");
                                                jSONObject.put(name, ((Long) obj10).longValue());
                                            }
                                        } else {
                                            Object obj11 = field.get(obj);
                                            Intrinsics.d(obj11, "null cannot be cast to non-null type kotlin.Float");
                                            jSONObject.put(name, (Float) obj11);
                                        }
                                    } else {
                                        Object obj12 = field.get(obj);
                                        Intrinsics.d(obj12, "null cannot be cast to non-null type kotlin.Double");
                                        jSONObject.put(name, ((Double) obj12).doubleValue());
                                    }
                                } else {
                                    Object obj13 = field.get(obj);
                                    Intrinsics.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                                    jSONObject.put(name, ((Boolean) obj13).booleanValue());
                                }
                            } else {
                                Object obj14 = field.get(obj);
                                Intrinsics.d(obj14, "null cannot be cast to non-null type kotlin.Int");
                                jSONObject.put(name, ((Integer) obj14).intValue());
                            }
                        }
                    }
                }
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public final JSONObject a(Object obj) {
        Intrinsics.f(obj, "obj");
        return a(obj, (Class) obj.getClass());
    }

    public final Object a(JSONObject jsonObject, Class<Object> type) {
        Intrinsics.f(jsonObject, "jsonObject");
        Intrinsics.f(type, "type");
        return type.cast(a(jsonObject, type, null, null));
    }

    /* JADX WARN: Code duplicated, block: B:165:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:166:0x03aa A[Catch: Exception -> 0x00ac, TryCatch #5 {Exception -> 0x00ac, blocks: (B:42:0x00b7, B:44:0x00bd, B:45:0x00ca, B:47:0x00d8, B:52:0x00f4, B:55:0x00ff, B:58:0x0108, B:60:0x010e, B:63:0x011f, B:65:0x0129, B:67:0x012f, B:70:0x0143, B:72:0x0149, B:74:0x014f, B:77:0x0165, B:79:0x016b, B:81:0x0171, B:84:0x0187, B:86:0x018d, B:88:0x0193, B:91:0x01a9, B:93:0x01af, B:95:0x01b5, B:98:0x01cb, B:100:0x01d3, B:102:0x01d9, B:105:0x01ef, B:107:0x01f7, B:108:0x0200, B:110:0x0208, B:112:0x020e, B:115:0x0222, B:117:0x022a, B:120:0x023a, B:121:0x023f, B:123:0x0247, B:124:0x0250, B:128:0x0260, B:130:0x0276, B:132:0x027f, B:133:0x029e, B:135:0x02a4, B:137:0x02cb, B:142:0x02f3, B:138:0x02d6, B:141:0x02e3, B:143:0x0305, B:147:0x0317, B:148:0x031f, B:150:0x032f, B:152:0x0343, B:154:0x0349, B:156:0x0363, B:158:0x0378, B:167:0x03ad, B:166:0x03aa, B:160:0x0386, B:163:0x0391, B:168:0x03b2, B:169:0x03b7, B:171:0x03bd, B:37:0x00a8), top: B:264:0x001c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x00ad: MOVE (r8 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:40:0x00ad */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v17, types: [int] */
    /* JADX WARN: Type inference failed for: r20v18 */
    /* JADX WARN: Type inference failed for: r20v19 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r20v22 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v24 */
    /* JADX WARN: Type inference failed for: r20v25 */
    /* JADX WARN: Type inference failed for: r20v26 */
    /* JADX WARN: Type inference failed for: r20v27 */
    /* JADX WARN: Type inference failed for: r20v28 */
    /* JADX WARN: Type inference failed for: r20v29 */
    /* JADX WARN: Type inference failed for: r20v30 */
    /* JADX WARN: Type inference failed for: r20v31 */
    /* JADX WARN: Type inference failed for: r20v32 */
    /* JADX WARN: Type inference failed for: r20v33 */
    /* JADX WARN: Type inference failed for: r20v34 */
    /* JADX WARN: Type inference failed for: r20v35 */
    /* JADX WARN: Type inference failed for: r20v36 */
    /* JADX WARN: Type inference failed for: r20v37 */
    /* JADX WARN: Type inference failed for: r20v38 */
    /* JADX WARN: Type inference failed for: r20v39 */
    /* JADX WARN: Type inference failed for: r20v40 */
    /* JADX WARN: Type inference failed for: r20v41 */
    /* JADX WARN: Type inference failed for: r20v42 */
    /* JADX WARN: Type inference failed for: r20v43 */
    /* JADX WARN: Type inference failed for: r20v44 */
    /* JADX WARN: Type inference failed for: r20v45 */
    /* JADX WARN: Type inference failed for: r20v46 */
    /* JADX WARN: Type inference failed for: r20v47 */
    /* JADX WARN: Type inference failed for: r20v48 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    public final Object a(JSONObject jSONObject, Class cls, Object obj, Object obj2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z2;
        Object objNewInstance;
        Object objValueOf;
        Field[] fieldArr;
        int i2;
        ?? r20;
        boolean z3;
        Class<?> cls2;
        Class<?> cls3;
        ?? r21;
        ?? r22;
        JSONArray jSONArrayOptJSONArray;
        Object objA;
        ?? r23;
        ?? r24;
        Class cls4 = cls;
        Object obj6 = null;
        try {
            cls4.getClass();
            cls4.toString();
            Objects.toString(obj);
            boolean z4 = true;
            Class<?> cls5 = Float.TYPE;
            Class<?> cls6 = Double.TYPE;
            Class<?> cls7 = Long.TYPE;
            Class<?> cls8 = Integer.TYPE;
            Class<?> cls9 = Boolean.TYPE;
            int i3 = 0;
            try {
                if (obj2 == null) {
                    try {
                        Constructor<?>[] declaredConstructors = cls4.getDeclaredConstructors();
                        Intrinsics.c(declaredConstructors);
                        if (declaredConstructors.length == 0) {
                            objNewInstance = cls4.newInstance();
                        } else {
                            Constructor<?> constructor = declaredConstructors[0];
                            constructor.setAccessible(true);
                            int length = constructor.getParameterTypes().length;
                            if (length == 0) {
                                objNewInstance = constructor.newInstance(null);
                            } else {
                                Object[] objArr = new Object[length];
                                Class<?>[] parameterTypes = constructor.getParameterTypes();
                                Intrinsics.e(parameterTypes, "getParameterTypes(...)");
                                int length2 = parameterTypes.length;
                                z2 = false;
                                int i4 = 0;
                                while (i3 < length2) {
                                    obj5 = obj6;
                                    try {
                                        Class<?> cls10 = parameterTypes[i3];
                                        int i5 = i4 + 1;
                                        Intrinsics.c(cls10);
                                        if (!Intrinsics.a(cls8, cls10) && !Intrinsics.a(cls7, cls10)) {
                                            if (Intrinsics.a(cls9, cls10)) {
                                                objValueOf = Boolean.FALSE;
                                            } else {
                                                objValueOf = (Intrinsics.a(cls6, cls10) || Intrinsics.a(cls5, cls10)) ? Double.valueOf(0.0d) : obj5;
                                            }
                                        } else {
                                            objValueOf = 0;
                                        }
                                        objArr[i4] = objValueOf;
                                        i3++;
                                        obj6 = obj5;
                                        i4 = i5;
                                    } catch (Exception unused) {
                                        cls4.toString();
                                        return obj5;
                                    }
                                }
                                obj5 = obj6;
                                objNewInstance = constructor.newInstance(Arrays.copyOf(objArr, length));
                            }
                        }
                        obj5 = null;
                        z2 = false;
                    } catch (Exception unused2) {
                        obj5 = null;
                    }
                } else {
                    obj5 = null;
                    z2 = false;
                    objNewInstance = obj2;
                }
                if (cls4.getSuperclass() != null) {
                    Class superclass = cls4.getSuperclass();
                    superclass.getClass();
                    objNewInstance = a(jSONObject, superclass, obj, objNewInstance);
                }
                Field[] declaredFields = cls4.getDeclaredFields();
                Intrinsics.e(declaredFields, "getDeclaredFields(...)");
                int length3 = declaredFields.length;
                for (?? r12 = z2; r12 < length3; r12 = r20 + 1) {
                    Field field = declaredFields[r12];
                    field.setAccessible(z4);
                    String name = field.getName();
                    try {
                        if (Intrinsics.a(name, "shadow$_klass_") || Modifier.isStatic(field.getModifiers()) || field.isAnnotationPresent(Z4.class)) {
                            fieldArr = declaredFields;
                        } else {
                            if (jSONObject.has(name) && !jSONObject.isNull(name)) {
                                Class<?> type = field.getType();
                                if (!Intrinsics.a(cls8, type) && !Intrinsics.a(cls8, type) && !Integer.class.equals(type)) {
                                    if (!Intrinsics.a(cls9, type) && !Intrinsics.a(cls9, type) && !Boolean.class.equals(type)) {
                                        if (!Intrinsics.a(cls6, type) && !Intrinsics.a(cls6, type) && !Double.class.equals(type)) {
                                            if (!Intrinsics.a(cls5, type) && !Intrinsics.a(cls5, type) && !Float.class.equals(type)) {
                                                if (!Intrinsics.a(cls7, type) && !Intrinsics.a(cls7, type) && !Long.class.equals(type)) {
                                                    Class<?> cls11 = Byte.TYPE;
                                                    if (Intrinsics.a(cls11, type) || Intrinsics.a(cls11, type)) {
                                                        fieldArr = declaredFields;
                                                    } else {
                                                        fieldArr = declaredFields;
                                                        if (!Byte.class.equals(type)) {
                                                            if (String.class.equals(type)) {
                                                                field.set(objNewInstance, jSONObject.getString(name));
                                                            } else {
                                                                Class<?> cls12 = Short.TYPE;
                                                                if (!Intrinsics.a(cls12, type) && !Intrinsics.a(cls12, type) && !Short.class.equals(type)) {
                                                                    if (JSONObject.class.equals(type)) {
                                                                        JSONObject jSONObject2 = jSONObject.getJSONObject(field.getName());
                                                                        JSONObject jSONObject3 = new JSONObject();
                                                                        if (jSONObject2 == null) {
                                                                            jSONObject2 = jSONObject3;
                                                                        }
                                                                        field.set(objNewInstance, jSONObject2);
                                                                    } else {
                                                                        if (JSONArray.class.equals(type)) {
                                                                            field.set(objNewInstance, jSONObject.getJSONArray(name));
                                                                        } else {
                                                                            if (Map.class.isAssignableFrom(type)) {
                                                                                i2 = length3;
                                                                                HashMap map = this.f23923a;
                                                                                ?? r25 = r12;
                                                                                Intrinsics.c(name);
                                                                                Dc dc = (Dc) map.get(new Ec(name, cls4));
                                                                                if (dc instanceof C3192q7) {
                                                                                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(name);
                                                                                    C3192q7 c3192q7 = (C3192q7) dc;
                                                                                    if (jSONObjectOptJSONObject != null) {
                                                                                        jSONObjectOptJSONObject.toString();
                                                                                        Map map2 = (Map) ((C3192q7) dc).a().construct();
                                                                                        Intrinsics.d(map2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Any, kotlin.Any?>");
                                                                                        Map map3 = TypeIntrinsics.b(map2);
                                                                                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                                                                        while (itKeys.hasNext()) {
                                                                                            Iterator<String> it = itKeys;
                                                                                            String next = itKeys.next();
                                                                                            Intrinsics.c(next);
                                                                                            Class<?> cls13 = cls8;
                                                                                            Object objA2 = C3175p6.a(jSONObjectOptJSONObject, next, ((C3192q7) dc).f23924b);
                                                                                            Class<?> cls14 = cls9;
                                                                                            if (C3175p6.b(((C3192q7) dc).f23924b)) {
                                                                                                objA2 = ((C3192q7) dc).f23924b.cast(objA2);
                                                                                            } else if (!C3175p6.a(((C3192q7) dc).f23924b)) {
                                                                                                JSONObject jSONObject4 = jSONObjectOptJSONObject.getJSONObject(next);
                                                                                                Intrinsics.e(jSONObject4, "getJSONObject(...)");
                                                                                                Class<Object> cls15 = c3192q7.f23924b;
                                                                                                Intrinsics.d(cls15, "null cannot be cast to non-null type java.lang.Class<T of com.inmobi.commons.utils.json.JSONConverter>");
                                                                                                objA2 = a(jSONObject4, cls15);
                                                                                            }
                                                                                            c3192q7.getClass();
                                                                                            Intrinsics.f(map3, "map");
                                                                                            map3.put(next, objA2);
                                                                                            cls8 = cls13;
                                                                                            itKeys = it;
                                                                                            cls9 = cls14;
                                                                                        }
                                                                                        cls2 = cls8;
                                                                                        cls3 = cls9;
                                                                                        field.set(objNewInstance, map3);
                                                                                        r23 = r25;
                                                                                    } else {
                                                                                        r24 = r25;
                                                                                    }
                                                                                } else {
                                                                                    cls2 = cls8;
                                                                                    cls3 = cls9;
                                                                                    type.getClass();
                                                                                    r23 = r25;
                                                                                }
                                                                            } else {
                                                                                cls2 = cls8;
                                                                                cls3 = cls9;
                                                                                i2 = length3;
                                                                                r22 = r12;
                                                                                if (List.class.isAssignableFrom(type)) {
                                                                                    HashMap map4 = this.f23923a;
                                                                                    Intrinsics.c(name);
                                                                                    Dc dc2 = (Dc) map4.get(new Ec(name, cls4));
                                                                                    if ((dc2 instanceof U6) && (jSONArrayOptJSONArray = jSONObject.optJSONArray(name)) != null) {
                                                                                        List<Object> listB = ((U6) dc2).b();
                                                                                        Intrinsics.d(listB, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
                                                                                        List listA = TypeIntrinsics.a(listB);
                                                                                        int length4 = jSONArrayOptJSONArray.length();
                                                                                        for (int i6 = z2; i6 < length4; i6++) {
                                                                                            Object objA3 = C3175p6.a(jSONArrayOptJSONArray, i6, ((U6) dc2).c());
                                                                                            if (C3175p6.b(objA3.getClass())) {
                                                                                                r23 = r22;
                                                                                                r23 = r22;
                                                                                                objA = ((U6) dc2).c().cast(objA3);
                                                                                            } else {
                                                                                                if (!C3175p6.a(objA3.getClass())) {
                                                                                                    r23 = r22;
                                                                                                    r23 = r22;
                                                                                                    JSONObject jSONObject5 = jSONArrayOptJSONArray.getJSONObject(i6);
                                                                                                    Intrinsics.e(jSONObject5, "getJSONObject(...)");
                                                                                                    Class<Object> clsC = ((U6) dc2).c();
                                                                                                    Intrinsics.d(clsC, "null cannot be cast to non-null type java.lang.Class<T of com.inmobi.commons.utils.json.JSONConverter>");
                                                                                                    objA = a(jSONObject5, clsC);
                                                                                                }
                                                                                                if (objA3 == null) {
                                                                                                    r23 = r22;
                                                                                                    r23 = r22;
                                                                                                } else {
                                                                                                    r23 = r22;
                                                                                                    r23 = r22;
                                                                                                    listA.add(objA3);
                                                                                                }
                                                                                            }
                                                                                            objA3 = objA;
                                                                                            if (objA3 == null) {
                                                                                                r23 = r22;
                                                                                                r23 = r22;
                                                                                            } else {
                                                                                                r23 = r22;
                                                                                                r23 = r22;
                                                                                                listA.add(objA3);
                                                                                            }
                                                                                        }
                                                                                        r23 = r22;
                                                                                        r23 = r22;
                                                                                        field.set(objNewInstance, listA);
                                                                                        r23 = r22;
                                                                                    }
                                                                                } else {
                                                                                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(name);
                                                                                    if (jSONObjectOptJSONObject2 != null) {
                                                                                        r23 = r22;
                                                                                        Objects.toString(objNewInstance);
                                                                                        Intrinsics.c(type);
                                                                                        obj3 = obj5;
                                                                                        field.set(objNewInstance, a(jSONObjectOptJSONObject2, type, objNewInstance, obj3));
                                                                                        r21 = r22;
                                                                                    }
                                                                                }
                                                                            }
                                                                            r23 = r22;
                                                                            r23 = r22;
                                                                            r23 = r22;
                                                                            r23 = r22;
                                                                            obj3 = obj5;
                                                                            r21 = r23;
                                                                        }
                                                                        obj3 = obj5;
                                                                        r20 = r24;
                                                                    }
                                                                } else {
                                                                    cls2 = cls8;
                                                                    cls3 = cls9;
                                                                    i2 = length3;
                                                                    ?? r26 = r12;
                                                                    obj3 = obj5;
                                                                    short s = (short) jSONObject.getInt(field.getName());
                                                                    try {
                                                                        if (field.getType() == cls12) {
                                                                            field.getName();
                                                                            field.setShort(objNewInstance, s);
                                                                            r21 = r26;
                                                                        } else {
                                                                            field.getName();
                                                                            field.set(objNewInstance, Short.valueOf(s));
                                                                            r21 = r26;
                                                                        }
                                                                    } catch (Exception unused3) {
                                                                        field.getName();
                                                                        r21 = r26;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    cls2 = cls8;
                                                    cls3 = cls9;
                                                    i2 = length3;
                                                    ?? r27 = r12;
                                                    obj3 = obj5;
                                                    byte b2 = (byte) jSONObject.getInt(field.getName());
                                                    try {
                                                        if (field.getType() == cls11) {
                                                            field.getName();
                                                            field.setByte(objNewInstance, b2);
                                                            r21 = r27;
                                                        } else {
                                                            field.getName();
                                                            field.set(objNewInstance, Byte.valueOf(b2));
                                                            r21 = r27;
                                                        }
                                                    } catch (Exception unused4) {
                                                        field.getName();
                                                        r21 = r27;
                                                    }
                                                } else {
                                                    fieldArr = declaredFields;
                                                    cls2 = cls8;
                                                    cls3 = cls9;
                                                    i2 = length3;
                                                    ?? r28 = r12;
                                                    obj3 = obj5;
                                                    long j = jSONObject.getLong(field.getName());
                                                    try {
                                                        if (field.getType() == cls7) {
                                                            field.getName();
                                                            field.setLong(objNewInstance, j);
                                                            r21 = r28;
                                                        } else {
                                                            field.getName();
                                                            field.set(objNewInstance, Long.valueOf(j));
                                                            r21 = r28;
                                                        }
                                                    } catch (Exception unused5) {
                                                        field.getName();
                                                        r21 = r28;
                                                    }
                                                }
                                            } else {
                                                fieldArr = declaredFields;
                                                cls2 = cls8;
                                                cls3 = cls9;
                                                i2 = length3;
                                                ?? r29 = r12;
                                                obj3 = obj5;
                                                float f = (float) jSONObject.getDouble(field.getName());
                                                try {
                                                    if (field.getType() == cls5) {
                                                        field.getName();
                                                        field.setFloat(objNewInstance, f);
                                                        r21 = r29;
                                                    } else {
                                                        field.getName();
                                                        field.set(objNewInstance, Float.valueOf(f));
                                                        r21 = r29;
                                                    }
                                                } catch (Exception unused6) {
                                                    field.getName();
                                                    r21 = r29;
                                                }
                                            }
                                        } else {
                                            fieldArr = declaredFields;
                                            cls2 = cls8;
                                            cls3 = cls9;
                                            i2 = length3;
                                            ?? r210 = r12;
                                            obj3 = obj5;
                                            double d = jSONObject.getDouble(field.getName());
                                            try {
                                                if (field.getType() == cls6) {
                                                    field.getName();
                                                    field.setDouble(objNewInstance, d);
                                                    r21 = r210;
                                                } else {
                                                    field.getName();
                                                    field.set(objNewInstance, Double.valueOf(d));
                                                    r21 = r210;
                                                }
                                            } catch (Exception unused7) {
                                                field.getName();
                                                r21 = r210;
                                            }
                                        }
                                        cls8 = cls2;
                                        cls9 = cls3;
                                        r20 = r21;
                                    } else {
                                        fieldArr = declaredFields;
                                        Class<?> cls16 = cls8;
                                        Class<?> cls17 = cls9;
                                        i2 = length3;
                                        r20 = r12;
                                        obj3 = obj5;
                                        String name2 = field.getName();
                                        try {
                                            z3 = jSONObject.getBoolean(name2);
                                        } catch (JSONException unused8) {
                                            z3 = jSONObject.getInt(name2) != 0 ? true : z2;
                                        }
                                        Boolean boolValueOf = Boolean.valueOf(z3);
                                        try {
                                            cls9 = cls17;
                                            if (field.getType() == cls9) {
                                                try {
                                                    field.setBoolean(objNewInstance, z3);
                                                } catch (Exception unused9) {
                                                    field.getName();
                                                }
                                            } else {
                                                field.set(objNewInstance, boolValueOf);
                                            }
                                        } catch (Exception unused10) {
                                            cls9 = cls17;
                                        }
                                        cls8 = cls16;
                                    }
                                } else {
                                    fieldArr = declaredFields;
                                    Class<?> cls18 = cls8;
                                    i2 = length3;
                                    ?? r211 = r12;
                                    obj3 = obj5;
                                    int i7 = jSONObject.getInt(field.getName());
                                    try {
                                        cls8 = cls18;
                                        if (field.getType() == cls8) {
                                            try {
                                                field.getName();
                                                field.setInt(objNewInstance, i7);
                                                r20 = r211;
                                            } catch (Exception unused11) {
                                                field.getName();
                                                r20 = r211;
                                            }
                                        } else {
                                            field.getName();
                                            field.set(objNewInstance, Integer.valueOf(i7));
                                            r20 = r211;
                                        }
                                    } catch (Exception unused12) {
                                        cls8 = cls18;
                                    }
                                }
                            } else {
                                fieldArr = declaredFields;
                                cls8 = cls8;
                                i2 = length3;
                                r20 = r12;
                                obj3 = obj5;
                                if (field.isAnnotationPresent(U9.class)) {
                                    throw new JSONException("NonNullable field " + name + " is not present or null in the JSONObject");
                                }
                                e = e;
                                Log.getStackTraceString(e);
                                return obj3;
                            }
                            cls4 = cls;
                            declaredFields = fieldArr;
                            obj5 = obj3;
                            length3 = i2;
                            cls8 = cls8;
                            z4 = true;
                        }
                        cls4 = cls;
                        declaredFields = fieldArr;
                        obj5 = obj3;
                        length3 = i2;
                        cls8 = cls8;
                        z4 = true;
                    } catch (Exception e2) {
                        e = e2;
                    }
                    i2 = length3;
                    r24 = r12;
                    obj3 = obj5;
                    r20 = r24;
                }
                return objNewInstance;
            } catch (Exception e3) {
                e = e3;
                obj3 = obj4;
            }
        } catch (Exception e4) {
            e = e4;
            obj3 = null;
        }
    }
}
