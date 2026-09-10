package com.apm.insight.h;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f10131a;

    /* JADX INFO: renamed from: com.apm.insight.h.a$a, reason: collision with other inner class name */
    public static class C0020a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<? extends T> f10132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f10133b;
    }

    static {
        HashMap map = new HashMap();
        f10131a = map;
        Class cls = Boolean.TYPE;
        map.put(Boolean.class, cls);
        Class cls2 = Byte.TYPE;
        map.put(Byte.class, cls2);
        Class cls3 = Character.TYPE;
        map.put(Character.class, cls3);
        Class cls4 = Short.TYPE;
        map.put(Short.class, cls4);
        Class cls5 = Integer.TYPE;
        map.put(Integer.class, cls5);
        Class cls6 = Float.TYPE;
        map.put(Float.class, cls6);
        Class cls7 = Long.TYPE;
        map.put(Long.class, cls7);
        Class cls8 = Double.TYPE;
        map.put(Double.class, cls8);
        map.put(cls, cls);
        map.put(cls2, cls2);
        map.put(cls3, cls3);
        map.put(cls4, cls4);
        map.put(cls5, cls5);
        map.put(cls6, cls6);
        map.put(cls7, cls7);
        map.put(cls8, cls8);
    }

    public static <T> T a(String str, String str2, Object... objArr) {
        Method method;
        Class<?>[] parameterTypes;
        try {
            Class<?> cls = Class.forName(str);
            Class<?>[] clsArr = new Class[4];
            for (int i2 = 0; i2 < 4; i2++) {
                Object obj = objArr[i2];
                clsArr[i2] = (obj == null || !(obj instanceof C0020a)) ? obj == null ? null : obj.getClass() : ((C0020a) obj).f10132a;
            }
            while (true) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        method = null;
                        break;
                    }
                    method = declaredMethods[i3];
                    if (method.getName().equals(str2) && (parameterTypes = method.getParameterTypes()) != null && parameterTypes.length == 4) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= parameterTypes.length) {
                                break;
                            }
                            if (!parameterTypes[i4].isAssignableFrom(clsArr[i4])) {
                                Map<Class<?>, Class<?>> map = f10131a;
                                if (!map.containsKey(parameterTypes[i4]) || !map.get(parameterTypes[i4]).equals(map.get(clsArr[i4]))) {
                                    break;
                                    break;
                                }
                            }
                            i4++;
                        }
                    }
                    i3++;
                }
                if (method != null) {
                    method.setAccessible(true);
                    Object[] objArr2 = new Object[4];
                    for (int i5 = 0; i5 < 4; i5++) {
                        Object obj2 = objArr[i5];
                        if (obj2 == null || !(obj2 instanceof C0020a)) {
                            objArr2[i5] = obj2;
                        } else {
                            objArr2[i5] = ((C0020a) obj2).f10133b;
                        }
                    }
                    return (T) method.invoke(null, objArr2);
                }
                if (cls.getSuperclass() == null) {
                    throw new NoSuchMethodException();
                }
                cls = cls.getSuperclass();
            }
        } catch (Exception e2) {
            Log.w("JavaCalls", android.support.v4.media.a.o("Meet exception when call Method '", str2, "' in ", str), e2);
            return null;
        }
    }
}
