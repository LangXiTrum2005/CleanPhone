package com.smartdigimkt.n;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    public interface a {
    }

    public static abstract class b<T> implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private T f36891a;

        public T a() {
            return this.f36891a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            return method.invoke(a(), objArr);
        }

        public void a(T t) {
            this.f36891a = t;
        }
    }

    private e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(Object obj, Class<T> cls, b<T> bVar) throws IllegalArgumentException {
        if (obj instanceof a) {
            return obj;
        }
        bVar.a(obj);
        return (T) Proxy.newProxyInstance(e.class.getClassLoader(), new Class[]{cls, a.class}, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(Object obj, b<T> bVar, Class<?>... clsArr) throws IllegalArgumentException {
        if (Proxy.isProxyClass(obj.getClass())) {
            return obj;
        }
        bVar.a(obj);
        return (T) Proxy.newProxyInstance(e.class.getClassLoader(), clsArr, bVar);
    }
}
