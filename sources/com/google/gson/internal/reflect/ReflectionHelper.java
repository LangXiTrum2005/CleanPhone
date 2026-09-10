package com.google.gson.internal.reflect;

import android.support.v4.media.a;
import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class ReflectionHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RecordHelper f21312a;

    public static abstract class RecordHelper {
        public abstract Method a(Class cls, Field field);

        public abstract Constructor b(Class cls);

        public abstract String[] c(Class cls);

        public abstract boolean d(Class cls);
    }

    public static class RecordNotSupportedHelper extends RecordHelper {
        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public final Method a(Class cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public final Constructor b(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public final String[] c(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public final boolean d(Class cls) {
            return false;
        }
    }

    public static class RecordSupportedHelper extends RecordHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f21313a = Class.class.getMethod("isRecord", new Class[0]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f21314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f21315c;
        public final Method d;

        public RecordSupportedHelper() throws NoSuchMethodException {
            Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
            this.f21314b = method;
            Class<?> componentType = method.getReturnType().getComponentType();
            this.f21315c = componentType.getMethod("getName", new Class[0]);
            this.d = componentType.getMethod("getType", new Class[0]);
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public final Method a(Class cls, Field field) {
            try {
                return cls.getMethod(field.getName(), new Class[0]);
            } catch (ReflectiveOperationException e2) {
                RecordHelper recordHelper = ReflectionHelper.f21312a;
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public final Constructor b(Class cls) {
            try {
                Object[] objArr = (Object[]) this.f21314b.invoke(cls, new Object[0]);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    clsArr[i2] = (Class) this.d.invoke(objArr[i2], new Object[0]);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e2) {
                RecordHelper recordHelper = ReflectionHelper.f21312a;
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public final String[] c(Class cls) {
            try {
                Object[] objArr = (Object[]) this.f21314b.invoke(cls, new Object[0]);
                String[] strArr = new String[objArr.length];
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    strArr[i2] = (String) this.f21315c.invoke(objArr[i2], new Object[0]);
                }
                return strArr;
            } catch (ReflectiveOperationException e2) {
                RecordHelper recordHelper = ReflectionHelper.f21312a;
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public final boolean d(Class cls) {
            try {
                return ((Boolean) this.f21313a.invoke(cls, new Object[0])).booleanValue();
            } catch (ReflectiveOperationException e2) {
                RecordHelper recordHelper = ReflectionHelper.f21312a;
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
            }
        }
    }

    static {
        RecordHelper recordNotSupportedHelper;
        try {
            recordNotSupportedHelper = new RecordSupportedHelper();
        } catch (NoSuchMethodException unused) {
            recordNotSupportedHelper = new RecordNotSupportedHelper();
        }
        f21312a = recordNotSupportedHelper;
    }

    public static void a(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i2].getSimpleName());
        }
        sb.append(')');
    }

    public static String b(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        a(constructor, sb);
        return sb.toString();
    }

    public static String c(AccessibleObject accessibleObject, boolean z2) {
        String str;
        if (accessibleObject instanceof Field) {
            Field field = (Field) accessibleObject;
            str = "field '" + field.getDeclaringClass().getName() + "#" + field.getName() + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            a(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + b((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z2 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static Method d(Class cls, Field field) {
        return f21312a.a(cls, field);
    }

    public static Constructor e(Class cls) {
        return f21312a.b(cls);
    }

    public static String[] f(Class cls) {
        return f21312a.c(cls);
    }

    public static boolean g(Class cls) {
        return f21312a.d(cls);
    }

    public static void h(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e2) {
            throw new JsonIOException(a.n("Failed making ", c(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e2);
        }
    }
}
