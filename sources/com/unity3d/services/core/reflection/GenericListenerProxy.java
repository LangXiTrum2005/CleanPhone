package com.unity3d.services.core.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class GenericListenerProxy implements InvocationHandler {
    public abstract Class<?> getProxyClass() throws ClassNotFoundException;

    public Object getProxyInstance() throws ClassNotFoundException {
        return Proxy.newProxyInstance(getProxyClass().getClassLoader(), new Class[]{getProxyClass()}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        return method.invoke(this, objArr);
    }
}
