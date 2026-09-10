package com.inmobi.media;

import java.lang.reflect.Field;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3175p6 {
    public static boolean a(Object obj, Object obj2) {
        if (!obj.getClass().equals(obj2.getClass())) {
            if (obj.getClass().equals(Integer.class) && obj2.getClass().equals(Long.class)) {
                return ((Integer) obj).intValue() == ((int) ((Long) obj2).longValue());
            }
            if (obj.getClass().equals(Long.class) && obj2.getClass().equals(Integer.class)) {
                return ((int) ((Long) obj).longValue()) == ((Integer) obj2).intValue();
            }
            if (obj.getClass().equals(Integer.class) && obj2.getClass().equals(Byte.class)) {
                return ((Integer) obj).intValue() == ((Byte) obj2).byteValue();
            }
            if (obj.getClass().equals(Byte.class) && obj2.getClass().equals(Integer.class)) {
                return ((Byte) obj).byteValue() == ((Integer) obj2).intValue();
            }
            return obj.equals(obj2);
        }
        Class<?> cls = obj.getClass();
        if (cls.equals(Integer.TYPE)) {
            return ((Integer) obj).intValue() == ((Integer) obj2).intValue();
        }
        if (cls.equals(Long.TYPE)) {
            return ((Long) obj).longValue() == ((Long) obj2).longValue();
        }
        if (cls.equals(Boolean.TYPE)) {
            return ((Boolean) obj).booleanValue() == ((Boolean) obj2).booleanValue();
        }
        if (cls.equals(Double.TYPE)) {
            return ((Double) obj).doubleValue() == ((Double) obj2).doubleValue();
        }
        if (cls.equals(Byte.TYPE)) {
            return ((Byte) obj).byteValue() == ((Byte) obj2).byteValue();
        }
        if (cls.equals(Short.TYPE)) {
            return ((Short) obj).shortValue() == ((Short) obj2).shortValue();
        }
        return obj.equals(obj2);
    }

    public static final boolean b(Class cls) {
        Class cls2 = Integer.TYPE;
        if (Intrinsics.a(cls2, cls) || Intrinsics.a(cls2, cls)) {
            return true;
        }
        Class cls3 = Boolean.TYPE;
        if (Intrinsics.a(cls3, cls) || Intrinsics.a(cls3, cls)) {
            return true;
        }
        Class cls4 = Double.TYPE;
        if (Intrinsics.a(cls4, cls) || Intrinsics.a(cls4, cls)) {
            return true;
        }
        Class cls5 = Float.TYPE;
        if (Intrinsics.a(cls5, cls) || Intrinsics.a(cls5, cls)) {
            return true;
        }
        Class cls6 = Long.TYPE;
        if (Intrinsics.a(cls6, cls) || Intrinsics.a(cls6, cls) || String.class.equals(cls)) {
            return true;
        }
        Class cls7 = Byte.TYPE;
        if (Intrinsics.a(cls7, cls) || Intrinsics.a(cls7, cls)) {
            return true;
        }
        Class cls8 = Short.TYPE;
        return Intrinsics.a(cls8, cls) || Intrinsics.a(cls8, cls);
    }

    public static void b(Object copyFrom, Object copyTo) {
        Intrinsics.f(copyFrom, "copyFrom");
        Intrinsics.f(copyTo, "copyTo");
        Class<?> cls = copyFrom.getClass();
        if (cls.isAssignableFrom(copyTo.getClass())) {
            Object objCast = cls.cast(copyTo);
            Intrinsics.e(objCast, "cast(...)");
            Field[] declaredFields = cls.getDeclaredFields();
            Intrinsics.e(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                try {
                    field.setAccessible(true);
                    field.set(objCast, field.get(copyFrom));
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            try {
                Object obj = jSONArray.get(i2);
                Object obj2 = jSONArray2.get(i2);
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    if (!a((JSONObject) obj, (JSONObject) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                    if (!a((JSONArray) obj, (JSONArray) obj2)) {
                        return false;
                    }
                } else {
                    Intrinsics.c(obj);
                    Intrinsics.c(obj2);
                    if (!a(obj, obj2)) {
                        return false;
                    }
                }
            } catch (JSONException unused) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(JSONObject json1, JSONObject json2) {
        Intrinsics.f(json1, "json1");
        Intrinsics.f(json2, "json2");
        if (json1.length() != json2.length()) {
            return false;
        }
        Iterator<String> itKeys = json1.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = json1.get(next);
                Object obj2 = json2.get(next);
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    if (!a((JSONObject) obj, (JSONObject) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                    if (!a((JSONArray) obj, (JSONArray) obj2)) {
                        return false;
                    }
                } else {
                    Intrinsics.c(obj);
                    Intrinsics.c(obj2);
                    if (!a(obj, obj2)) {
                        return false;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return true;
    }

    public static final Object a(JSONArray jSONArray, int i2, Class cls) throws JSONException {
        Object objValueOf;
        if (Intrinsics.a(Integer.TYPE, cls)) {
            objValueOf = Integer.valueOf(jSONArray.getInt(i2));
        } else if (Intrinsics.a(Double.TYPE, cls)) {
            objValueOf = Double.valueOf(jSONArray.getDouble(i2));
        } else if (Intrinsics.a(Float.TYPE, cls)) {
            objValueOf = Float.valueOf((float) jSONArray.getDouble(i2));
        } else if (Intrinsics.a(Long.TYPE, cls)) {
            objValueOf = Long.valueOf(jSONArray.getLong(i2));
        } else if (Intrinsics.a(Byte.TYPE, cls)) {
            objValueOf = Byte.valueOf((byte) jSONArray.getInt(i2));
        } else if (Intrinsics.a(Short.TYPE, cls)) {
            objValueOf = Short.valueOf((short) jSONArray.getInt(i2));
        } else {
            objValueOf = jSONArray.get(i2);
        }
        Intrinsics.c(objValueOf);
        return objValueOf;
    }

    public static final Object a(JSONObject jSONObject, String str, Class cls) throws JSONException {
        Object objValueOf;
        if (Intrinsics.a(Integer.TYPE, cls)) {
            objValueOf = Integer.valueOf(jSONObject.getInt(str));
        } else if (Intrinsics.a(Double.TYPE, cls)) {
            objValueOf = Double.valueOf(jSONObject.getDouble(str));
        } else if (Intrinsics.a(Float.TYPE, cls)) {
            objValueOf = Float.valueOf((float) jSONObject.getDouble(str));
        } else if (Intrinsics.a(Long.TYPE, cls)) {
            objValueOf = Long.valueOf(jSONObject.getLong(str));
        } else if (Intrinsics.a(Byte.TYPE, cls)) {
            objValueOf = Byte.valueOf((byte) jSONObject.getInt(str));
        } else if (Intrinsics.a(Short.TYPE, cls)) {
            objValueOf = Short.valueOf((short) jSONObject.getInt(str));
        } else {
            objValueOf = jSONObject.get(str);
        }
        Intrinsics.c(objValueOf);
        return objValueOf;
    }

    public static final boolean a(Class cls) {
        return Integer.class.equals(cls) || Boolean.class.equals(cls) || Double.class.equals(cls) || Float.class.equals(cls) || Long.class.equals(cls) || String.class.equals(cls) || Byte.class.equals(cls) || Short.class.equals(cls);
    }
}
