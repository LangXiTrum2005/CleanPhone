package com.mbridge.msdk.mbsignalcommon.mapping;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a<C> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected Class<C> f34873a;

        public a(Class<C> cls) {
            this.f34873a = cls;
        }

        public C0151b a(String str, Class<?>... clsArr) throws com.mbridge.msdk.mbsignalcommon.mapping.a {
            return new C0151b(this.f34873a, str, clsArr, 0);
        }
    }

    public static <T> a<T> a(ClassLoader classLoader, String str) throws com.mbridge.msdk.mbsignalcommon.mapping.a {
        try {
            return new a<>(classLoader.loadClass(str));
        } catch (Exception e10) {
            b(new com.mbridge.msdk.mbsignalcommon.mapping.a(e10));
            return new a<>(null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.mapping.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class C0151b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Method f34874a;

        public C0151b(Class<?> cls, String str, Class<?>[] clsArr, int i10) throws com.mbridge.msdk.mbsignalcommon.mapping.a {
            Method declaredMethod = null;
            if (cls == null) {
                this.f34874a = null;
                return;
            }
            while (cls != Object.class && cls != null) {
                try {
                    declaredMethod = cls.getDeclaredMethod(str, clsArr);
                    break;
                } catch (NoSuchMethodException e10) {
                    if (MBridgeConstans.DEBUG && cls.getSuperclass() == Object.class) {
                        e10.printStackTrace();
                    }
                    cls = cls.getSuperclass();
                } catch (SecurityException e11) {
                    try {
                        try {
                            if (MBridgeConstans.DEBUG && cls.getSuperclass() == Object.class) {
                                e11.printStackTrace();
                            }
                            cls = cls.getSuperclass();
                        } catch (Exception e12) {
                            com.mbridge.msdk.mbsignalcommon.mapping.a aVar = new com.mbridge.msdk.mbsignalcommon.mapping.a(e12);
                            aVar.a(cls);
                            aVar.a(str);
                            b.b(aVar);
                            this.f34874a = declaredMethod;
                            return;
                        }
                    } catch (Throwable th2) {
                        this.f34874a = declaredMethod;
                        throw th2;
                    }
                }
            }
            if (declaredMethod != null) {
                if (i10 > 0 && (declaredMethod.getModifiers() & i10) != i10) {
                    b.b(new com.mbridge.msdk.mbsignalcommon.mapping.a(declaredMethod + " does not match modifiers: " + i10));
                }
                declaredMethod.setAccessible(true);
            }
            this.f34874a = declaredMethod;
        }

        public Object a(Object obj, Object... objArr) throws IllegalArgumentException, InvocationTargetException {
            Method method = this.f34874a;
            if (method == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e10) {
                q0.a("MappingedMethod", "invoke error:" + e10.getMessage());
                return null;
            }
        }

        public Method a() {
            return this.f34874a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.mbridge.msdk.mbsignalcommon.mapping.a aVar) throws com.mbridge.msdk.mbsignalcommon.mapping.a {
        throw aVar;
    }
}
