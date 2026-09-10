package com.smartdigimkt.l6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static InterfaceC0530a f36362a;

    /* JADX INFO: renamed from: com.smartdigimkt.l6.a$a, reason: collision with other inner class name */
    public interface InterfaceC0530a {
        boolean a(b.C0531a c0531a);
    }

    public static abstract class b {

        /* JADX INFO: renamed from: com.smartdigimkt.l6.a$b$a, reason: collision with other inner class name */
        public static class C0531a extends Throwable {
            private static final long d = 1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Class<?> f36363a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f36364b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f36365c;

            public C0531a(String str) {
                super(str);
            }

            public void a(Class<?> cls) {
                this.f36363a = cls;
            }

            public Class<?> b() {
                return this.f36363a;
            }

            public void c(String str) {
                this.f36365c = str;
            }

            public String d() {
                return this.f36365c;
            }

            @Override // java.lang.Throwable
            public String toString() {
                if (getCause() == null) {
                    return super.toString();
                }
                return getClass().getName() + ": " + getCause();
            }

            public C0531a(Exception exc) {
                super(exc);
            }

            public void b(String str) {
                this.f36364b = str;
            }

            public String c() {
                return this.f36364b;
            }
        }
    }

    public static class c<C> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected Class<C> f36366a;

        public c(Class<C> cls) {
            this.f36366a = cls;
        }

        public e<C, Object> a(String str) throws b.C0531a {
            return new e<>(this.f36366a, str, 0);
        }

        public e<C, Object> b(String str) throws b.C0531a {
            return new e<>(this.f36366a, str, 8);
        }

        public f a(String str, Class<?>... clsArr) throws b.C0531a {
            return new f(this.f36366a, str, clsArr, 0);
        }

        public f b(String str, Class<?>... clsArr) throws b.C0531a {
            return new f(this.f36366a, str, clsArr, 8);
        }

        public d a(Class<?>... clsArr) throws b.C0531a {
            return new d(this.f36366a, clsArr);
        }

        public Class<C> a() {
            return this.f36366a;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected Constructor<?> f36367a;

        public d(Class<?> cls, Class<?>[] clsArr) throws b.C0531a {
            if (cls == null) {
                return;
            }
            try {
                this.f36367a = cls.getDeclaredConstructor(clsArr);
            } catch (NoSuchMethodException e2) {
                b.C0531a c0531a = new b.C0531a(e2);
                c0531a.a(cls);
                a.b(c0531a);
            }
        }

        public Object a(Object... objArr) throws IllegalArgumentException {
            this.f36367a.setAccessible(true);
            try {
                return this.f36367a.newInstance(objArr);
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b.C0531a c0531a) throws b.C0531a {
        InterfaceC0530a interfaceC0530a = f36362a;
        if (interfaceC0530a == null || !interfaceC0530a.a(c0531a)) {
            throw c0531a;
        }
    }

    public static class e<C, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f36368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Field f36369b;

        public e(Class<C> cls, String str, int i2) throws b.C0531a {
            Field declaredField = null;
            if (cls == null) {
                this.f36369b = null;
                return;
            }
            try {
                try {
                    this.f36368a = null;
                    declaredField = cls.getDeclaredField(str);
                    if (i2 > 0 && (declaredField.getModifiers() & i2) != i2) {
                        a.b(new b.C0531a(declaredField + " does not match modifiers: " + i2));
                    }
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    b.C0531a c0531a = new b.C0531a(e2);
                    c0531a.a(cls);
                    c0531a.b(str);
                    a.b(c0531a);
                }
            } finally {
                this.f36369b = declaredField;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <T2> e<C, T2> a(Class<?> cls) throws b.C0531a {
            Field field = this.f36369b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                a.b(new b.C0531a(new ClassCastException(this.f36369b + " is not of type " + cls)));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <T2> e<C, T2> b(Class<T2> cls) throws b.C0531a {
            Field field = this.f36369b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                a.b(new b.C0531a(new ClassCastException(this.f36369b + " is not of type " + cls)));
            }
            return this;
        }

        public e<C, T> a(String str) throws b.C0531a {
            try {
                return (e<C, T>) b(Class.forName(str));
            } catch (ClassNotFoundException e2) {
                a.b(new b.C0531a(e2));
                return this;
            }
        }

        public void b(Object obj) {
            try {
                this.f36369b.set(this.f36368a, obj);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
        }

        public T a() {
            try {
                return (T) this.f36369b.get(this.f36368a);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        public Field b() {
            return this.f36369b;
        }

        public e<C, T> a(C c2) {
            this.f36368a = c2;
            return this;
        }
    }

    public static <T> c<T> a(Class<T> cls) {
        return new c<>(cls);
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Method f36370a;

        public f(Class<?> cls, String str, Class<?>[] clsArr, int i2) throws b.C0531a {
            Method declaredMethod = null;
            if (cls == null) {
                this.f36370a = null;
                return;
            }
            while (cls != Object.class && cls != null) {
                try {
                    try {
                        declaredMethod = cls.getDeclaredMethod(str, clsArr);
                        break;
                    } catch (Exception e2) {
                        b.C0531a c0531a = new b.C0531a(e2);
                        c0531a.a(cls);
                        c0531a.c(str);
                        a.b(c0531a);
                        return;
                    } finally {
                        this.f36370a = declaredMethod;
                    }
                } catch (NoSuchMethodException | SecurityException unused) {
                    cls = cls.getSuperclass();
                }
            }
            if (declaredMethod != null) {
                if (i2 > 0 && (declaredMethod.getModifiers() & i2) != i2) {
                    a.b(new b.C0531a(declaredMethod + " does not match modifiers: " + i2));
                }
                declaredMethod.setAccessible(true);
            }
        }

        public Object a(Object obj, Object... objArr) throws IllegalArgumentException, InvocationTargetException {
            Method method = this.f36370a;
            if (method == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e2) {
                e2.getMessage();
                return null;
            }
        }

        public Method a() {
            return this.f36370a;
        }
    }

    public static <T> c<T> a(String str) throws b.C0531a {
        try {
            return new c<>(Class.forName(str));
        } catch (ClassNotFoundException e2) {
            b(new b.C0531a(e2));
            return new c<>(null);
        }
    }

    public static <T> c<T> a(ClassLoader classLoader, String str) throws b.C0531a {
        try {
            return new c<>(classLoader.loadClass(str));
        } catch (Exception e2) {
            b(new b.C0531a(e2));
            return new c<>(null);
        }
    }

    public static void a(InterfaceC0530a interfaceC0530a) {
        f36362a = interfaceC0530a;
    }
}
