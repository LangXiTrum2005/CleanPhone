package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UnsafeAllocator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UnsafeAllocator f21239a;

    /* JADX INFO: renamed from: com.google.gson.internal.UnsafeAllocator$4, reason: invalid class name */
    class AnonymousClass4 extends UnsafeAllocator {
        @Override // com.google.gson.internal.UnsafeAllocator
        public final Object a(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    static {
        UnsafeAllocator anonymousClass4;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    final Object obj = declaredField.get(null);
                    final Method method = cls.getMethod("allocateInstance", Class.class);
                    anonymousClass4 = new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.1
                        @Override // com.google.gson.internal.UnsafeAllocator
                        public final Object a(Class cls2) {
                            String strA = ConstructorConstructor.a(cls2);
                            if (strA != null) {
                                throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
                            }
                            return method.invoke(obj, cls2);
                        }
                    };
                } catch (Exception unused) {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    final int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    anonymousClass4 = new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.2
                        @Override // com.google.gson.internal.UnsafeAllocator
                        public final Object a(Class cls2) {
                            String strA = ConstructorConstructor.a(cls2);
                            if (strA != null) {
                                throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
                            }
                            return declaredMethod2.invoke(null, cls2, Integer.valueOf(iIntValue));
                        }
                    };
                }
            } catch (Exception unused2) {
                final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                anonymousClass4 = new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.3
                    @Override // com.google.gson.internal.UnsafeAllocator
                    public final Object a(Class cls2) {
                        String strA = ConstructorConstructor.a(cls2);
                        if (strA != null) {
                            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
                        }
                        return declaredMethod3.invoke(null, cls2, Object.class);
                    }
                };
            }
        } catch (Exception unused3) {
            anonymousClass4 = new AnonymousClass4();
        }
        f21239a = anonymousClass4;
    }

    public abstract Object a(Class cls);
}
