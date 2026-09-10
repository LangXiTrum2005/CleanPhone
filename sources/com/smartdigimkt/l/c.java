package com.smartdigimkt.l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f36292a;

    public interface a {
        boolean a(b.a aVar);
    }

    public static abstract class b {

        public static class a extends Throwable {
            private static final long d = 1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Class<?> f36293a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f36294b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f36295c;

            public a(String str) {
                super(str);
            }

            public void a(Class<?> cls) {
                this.f36293a = cls;
            }

            public Class<?> b() {
                return this.f36293a;
            }

            public void c(String str) {
                this.f36295c = str;
            }

            public String d() {
                return this.f36295c;
            }

            @Override // java.lang.Throwable
            public String toString() {
                if (getCause() == null) {
                    return super.toString();
                }
                return getClass().getName() + ": " + getCause();
            }

            public a(Exception exc) {
                super(exc);
            }

            public void b(String str) {
                this.f36294b = str;
            }

            public String c() {
                return this.f36294b;
            }
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.l.c$c, reason: collision with other inner class name */
    public static class C0525c<C> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected Class<C> f36296a;

        public C0525c(Class<C> cls) {
            this.f36296a = cls;
        }

        public e<C, Object> a(String str) throws b.a {
            return new e<>(this.f36296a, str, 0);
        }

        public e<C, Object> b(String str) throws b.a {
            return new e<>(this.f36296a, str, 8);
        }

        public f a(String str, Class<?>... clsArr) throws b.a {
            return new f(this.f36296a, str, clsArr, 0);
        }

        public f b(String str, Class<?>... clsArr) throws b.a {
            return new f(this.f36296a, str, clsArr, 8);
        }

        public d a(Class<?>... clsArr) throws b.a {
            return new d(this.f36296a, clsArr);
        }

        public Class<C> a() {
            return this.f36296a;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected Constructor<?> f36297a;

        public d(Class<?> cls, Class<?>[] clsArr) throws b.a {
            if (cls == null) {
                return;
            }
            try {
                this.f36297a = cls.getDeclaredConstructor(clsArr);
            } catch (NoSuchMethodException e2) {
                b.a aVar = new b.a(e2);
                aVar.a(cls);
                c.b(aVar);
            }
        }

        public Object a(Object... objArr) throws IllegalArgumentException {
            this.f36297a.setAccessible(true);
            try {
                return this.f36297a.newInstance(objArr);
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b.a aVar) throws b.a {
        a aVar2 = f36292a;
        if (aVar2 == null || !aVar2.a(aVar)) {
            throw aVar;
        }
    }

    public static class e<C, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f36298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Field f36299b;

        public e(Class<C> cls, String str, int i2) throws b.a {
            Field declaredField = null;
            if (cls == null) {
                this.f36299b = null;
                return;
            }
            try {
                try {
                    this.f36298a = null;
                    declaredField = cls.getDeclaredField(str);
                    if (i2 > 0 && (declaredField.getModifiers() & i2) != i2) {
                        c.b(new b.a(declaredField + " does not match modifiers: " + i2));
                    }
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    b.a aVar = new b.a(e2);
                    aVar.a(cls);
                    aVar.b(str);
                    c.b(aVar);
                }
            } finally {
                this.f36299b = declaredField;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <T2> e<C, T2> a(Class<?> cls) throws b.a {
            Field field = this.f36299b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                c.b(new b.a(new ClassCastException(this.f36299b + " is not of type " + cls)));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <T2> e<C, T2> b(Class<T2> cls) throws b.a {
            Field field = this.f36299b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                c.b(new b.a(new ClassCastException(this.f36299b + " is not of type " + cls)));
            }
            return this;
        }

        public e<C, T> a(String str) throws b.a {
            try {
                return (e<C, T>) b(Class.forName(str));
            } catch (ClassNotFoundException e2) {
                c.b(new b.a(e2));
                return this;
            }
        }

        public void b(Object obj) {
            try {
                this.f36299b.set(this.f36298a, obj);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
        }

        public T a() {
            try {
                return (T) this.f36299b.get(this.f36298a);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        public Field b() {
            return this.f36299b;
        }

        public void a(com.smartdigimkt.l.b.AbstractC0524b<?> abstractC0524b) {
            T tA = a();
            if (tA != null) {
                b(com.smartdigimkt.l.b.a(tA, abstractC0524b, tA.getClass().getInterfaces()));
                return;
            }
            throw new IllegalStateException("Cannot mapping null");
        }

        public e<C, T> a(C c2) {
            this.f36298a = c2;
            return this;
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Method f36300a;

        public f(Class<?> cls, String str, Class<?>[] clsArr, int i2) throws b.a {
            Method declaredMethod = null;
            if (cls == null) {
                this.f36300a = null;
                return;
            }
            while (cls != Object.class && cls != null) {
                try {
                    declaredMethod = cls.getDeclaredMethod(str, clsArr);
                    break;
                } catch (NoSuchMethodException e2) {
                    if (com.smartdigimkt.b.b.f33800a && cls.getSuperclass() == Object.class) {
                        e2.printStackTrace();
                    }
                    cls = cls.getSuperclass();
                } catch (SecurityException e3) {
                    try {
                        try {
                            if (com.smartdigimkt.b.b.f33800a && cls.getSuperclass() == Object.class) {
                                e3.printStackTrace();
                            }
                            cls = cls.getSuperclass();
                        } catch (Exception e4) {
                            b.a aVar = new b.a(e4);
                            aVar.a(cls);
                            aVar.c(str);
                            c.b(aVar);
                            this.f36300a = declaredMethod;
                            return;
                        }
                    } catch (Throwable th) {
                        this.f36300a = declaredMethod;
                        throw th;
                    }
                }
            }
            if (declaredMethod != null) {
                if (i2 > 0 && (declaredMethod.getModifiers() & i2) != i2) {
                    c.b(new b.a(declaredMethod + " does not match modifiers: " + i2));
                }
                declaredMethod.setAccessible(true);
            }
            this.f36300a = declaredMethod;
        }

        public Object a(Object obj, Object... objArr) throws IllegalArgumentException, InvocationTargetException {
            Method method = this.f36300a;
            if (method == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Throwable unused) {
                return null;
            }
        }

        public Method a() {
            return this.f36300a;
        }
    }

    public static <T> C0525c<T> a(Class<T> cls) {
        return new C0525c<>(cls);
    }

    public static <T> C0525c<T> a(String str) throws b.a {
        try {
            return new C0525c<>(Class.forName(str));
        } catch (ClassNotFoundException e2) {
            b(new b.a(e2));
            return new C0525c<>(null);
        }
    }

    public static <T> C0525c<T> a(ClassLoader classLoader, String str) throws b.a {
        try {
            return new C0525c<>(classLoader.loadClass(str));
        } catch (Exception e2) {
            b(new b.a(e2));
            return new C0525c<>(null);
        }
    }

    public static void a(a aVar) {
        f36292a = aVar;
    }
}
