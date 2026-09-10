package com.smartdigimkt.l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    public interface a {
    }

    /* JADX INFO: renamed from: com.smartdigimkt.l.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0524b<T> implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private T f36291a;

        public T a() {
            return this.f36291a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return method.invoke(a(), objArr);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            } catch (IllegalArgumentException e3) {
                e3.printStackTrace();
                return null;
            } catch (InvocationTargetException e4) {
                throw e4.getTargetException();
            }
        }

        public void a(T t) {
            this.f36291a = t;
        }
    }

    private b() {
    }

    public static <T> T a(Object obj, Class<T> cls, AbstractC0524b<T> abstractC0524b) throws IllegalArgumentException {
        abstractC0524b.a(obj);
        return (T) Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls, a.class}, abstractC0524b);
    }

    public static <T> T a(Object obj, AbstractC0524b<T> abstractC0524b, Class<?>... clsArr) throws IllegalArgumentException {
        abstractC0524b.a(obj);
        return (T) Proxy.newProxyInstance(b.class.getClassLoader(), clsArr, abstractC0524b);
    }
}
