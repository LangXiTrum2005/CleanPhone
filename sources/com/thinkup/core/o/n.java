package com.thinkup.core.o;

import android.os.Bundle;
import android.util.Log;
import com.thinkup.core.o.o.o0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    private static final Map<Class<?>, List<o>> m = new ConcurrentHashMap();
    private static final String o = "n";

    public static class o {
        final String m;
        final Field o;

        public o(Field field, String str) {
            this.o = field;
            this.m = str;
        }
    }

    public static Bundle o(Object obj) {
        Bundle bundle = new Bundle();
        try {
            for (o oVar : o(obj.getClass())) {
                try {
                    Object obj2 = oVar.o.get(obj);
                    if (obj2 != null) {
                        String str = oVar.m;
                        if (obj2 instanceof String) {
                            bundle.putString(str, (String) obj2);
                        } else if (obj2 instanceof String[]) {
                            bundle.putStringArray(str, (String[]) obj2);
                        } else if (obj2 instanceof Integer) {
                            bundle.putInt(str, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Boolean) {
                            bundle.putBoolean(str, ((Boolean) obj2).booleanValue());
                        } else if (obj2 instanceof Long) {
                            bundle.putLong(str, ((Long) obj2).longValue());
                        } else if (obj2 instanceof Double) {
                            bundle.putDouble(str, ((Double) obj2).doubleValue());
                        } else if (obj2 instanceof Float) {
                            bundle.putFloat(str, ((Float) obj2).floatValue());
                        } else if (obj2 instanceof Byte) {
                            bundle.putByte(str, ((Byte) obj2).byteValue());
                        } else if (obj2 instanceof Short) {
                            bundle.putShort(str, ((Short) obj2).shortValue());
                        } else if (obj2 instanceof com.thinkup.core.o.o.m) {
                            bundle.putBundle(str, o(obj2));
                        } else {
                            Log.e(o, "putToBundle() >>> unsupported type.");
                        }
                    }
                } catch (Throwable th) {
                    Log.e(o, "toBundle() >>> field get failed.", th);
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }

    private static <T extends com.thinkup.core.o.o.m> T o(Bundle bundle, Class<T> cls) {
        Object objValueOf;
        try {
            T tNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            for (o oVar : o((Class<?>) cls)) {
                String str = oVar.m;
                Class<?> type = oVar.o.getType();
                if (type == String.class) {
                    objValueOf = bundle.getString(str);
                } else if (type == String[].class) {
                    objValueOf = bundle.getStringArray(str);
                } else if (type != Integer.TYPE && type != Integer.class) {
                    if (type != Boolean.TYPE && type != Boolean.class) {
                        if (type != Long.TYPE && type != Long.class) {
                            if (type != Double.TYPE && type != Double.class) {
                                if (type != Float.TYPE && type != Float.class) {
                                    if (type != Byte.TYPE && type != Byte.class) {
                                        if (type != Short.TYPE && type != Short.class) {
                                            if (type == Bundle.class) {
                                                objValueOf = bundle.getBundle(str);
                                            } else {
                                                Log.e(o, "getFromBundle() >>> unsupported type.");
                                                objValueOf = null;
                                            }
                                        } else {
                                            objValueOf = Short.valueOf(bundle.getShort(str));
                                        }
                                    } else {
                                        objValueOf = Byte.valueOf(bundle.getByte(str));
                                    }
                                } else {
                                    objValueOf = Float.valueOf(bundle.getFloat(str));
                                }
                            } else {
                                objValueOf = Double.valueOf(bundle.getDouble(str));
                            }
                        } else {
                            objValueOf = Long.valueOf(bundle.getLong(str));
                        }
                    } else {
                        objValueOf = Boolean.valueOf(bundle.getBoolean(str));
                    }
                } else {
                    objValueOf = Integer.valueOf(bundle.getInt(str));
                }
                if (objValueOf != null) {
                    try {
                        if (objValueOf instanceof Bundle) {
                            objValueOf = o((Bundle) objValueOf, oVar.o.getType());
                        }
                        oVar.o.set(tNewInstance, objValueOf);
                    } catch (Throwable th) {
                        Log.e(o, "parse() >>> field set failed.", th);
                    }
                }
            }
            return tNewInstance;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static List<o> o(Class<?> cls) {
        List<o> list = m.get(cls);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Field field : cls.getDeclaredFields()) {
            o0 o0Var = (o0) field.getAnnotation(o0.class);
            if (o0Var != null) {
                field.setAccessible(true);
                arrayList.add(new o(field, o0Var.o()));
            }
        }
        m.put(cls, arrayList);
        return arrayList;
    }

    private static void o(Bundle bundle, String str, Object obj) {
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return;
        }
        if (obj instanceof String[]) {
            bundle.putStringArray(str, (String[]) obj);
            return;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Float) {
            bundle.putFloat(str, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Byte) {
            bundle.putByte(str, ((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof Short) {
            bundle.putShort(str, ((Short) obj).shortValue());
        } else if (obj instanceof com.thinkup.core.o.o.m) {
            bundle.putBundle(str, o(obj));
        } else {
            Log.e(o, "putToBundle() >>> unsupported type.");
        }
    }

    private static Object o(Bundle bundle, String str, Class<?> cls) {
        if (cls == String.class) {
            return bundle.getString(str);
        }
        if (cls == String[].class) {
            return bundle.getStringArray(str);
        }
        if (cls != Integer.TYPE && cls != Integer.class) {
            if (cls != Boolean.TYPE && cls != Boolean.class) {
                if (cls != Long.TYPE && cls != Long.class) {
                    if (cls != Double.TYPE && cls != Double.class) {
                        if (cls != Float.TYPE && cls != Float.class) {
                            if (cls != Byte.TYPE && cls != Byte.class) {
                                if (cls != Short.TYPE && cls != Short.class) {
                                    if (cls == Bundle.class) {
                                        return bundle.getBundle(str);
                                    }
                                    Log.e(o, "getFromBundle() >>> unsupported type.");
                                    return null;
                                }
                                return Short.valueOf(bundle.getShort(str));
                            }
                            return Byte.valueOf(bundle.getByte(str));
                        }
                        return Float.valueOf(bundle.getFloat(str));
                    }
                    return Double.valueOf(bundle.getDouble(str));
                }
                return Long.valueOf(bundle.getLong(str));
            }
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        return Integer.valueOf(bundle.getInt(str));
    }
}
