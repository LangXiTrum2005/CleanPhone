package de;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f38835a = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f38836b = Class.class.getMethod("getRecordComponents", null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f38837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f38838d;

    public b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f38837c = cls.getMethod("getName", null);
        this.f38838d = cls.getMethod("getType", null);
    }

    @Override // com.bumptech.glide.c
    public final Method p(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // com.bumptech.glide.c
    public final Constructor q(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f38836b.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                clsArr[i10] = (Class) this.f38838d.invoke(objArr[i10], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // com.bumptech.glide.c
    public final String[] t(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f38836b.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) this.f38837c.invoke(objArr[i10], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // com.bumptech.glide.c
    public final boolean w(Class cls) {
        try {
            return ((Boolean) this.f38835a.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }
}
