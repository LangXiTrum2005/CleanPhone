package sg.bigo.ads.common.r;

import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static Object a(Object obj, String str) {
        Field field;
        try {
            try {
                field = obj.getClass().getDeclaredField(str);
            } catch (IllegalAccessException | NoSuchFieldException e2) {
                sg.bigo.ads.common.t.a.a(0, "ReflectionHelper", Log.getStackTraceString(e2));
                return null;
            }
        } catch (Exception unused) {
            field = obj.getClass().getField(str);
        }
        field.setAccessible(true);
        return field.get(obj);
    }

    public static Object a(Object obj, String str, Class cls) {
        boolean z2;
        if (obj == null) {
            return null;
        }
        for (Method method : obj.getClass().getMethods()) {
            if (TextUtils.equals(str, method.getName())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (!k.a((Object[]) null)) {
                    throw null;
                }
                if ((k.a(parameterTypes) ? 0 : parameterTypes.length) != 0) {
                    z2 = false;
                    break;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= 0) {
                        z2 = true;
                        break;
                    }
                    if (parameterTypes[i2] != null) {
                        z2 = false;
                        break;
                    }
                    i2++;
                }
                if (z2) {
                    Class<?> returnType = method.getReturnType();
                    if ((a(cls) && a(returnType)) || returnType == cls) {
                        try {
                            method.setAccessible(true);
                            return method.invoke(obj, null);
                        } catch (Exception e2) {
                            sg.bigo.ads.common.t.a.a(0, "ReflectionHelper", Log.getStackTraceString(e2));
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public static <T> T a(String str, Class<T> cls) {
        try {
            Constructor declaredConstructor = Class.forName(str).asSubclass(cls).getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            return (T) declaredConstructor.newInstance(new Object[0]);
        } catch (Exception unused) {
            p005e.a.d(0, 5, str, "Cannot find class: ", "ReflectionHelper");
            return null;
        }
    }

    private static boolean a(Class cls) {
        return cls == null || Void.class == cls;
    }

    public static boolean a(Class<?> cls, String... strArr) {
        Class<?> cls2;
        if (k.a(strArr)) {
            return false;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                cls2 = Class.forName(strArr[i2]);
            } catch (Exception unused) {
                cls2 = null;
            }
            if (cls2 != null && cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }
}
