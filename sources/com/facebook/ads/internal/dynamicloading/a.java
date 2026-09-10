package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f747a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ List f;
    public final /* synthetic */ List g;
    public final /* synthetic */ Method h;
    public final /* synthetic */ Method i;

    public a(ArrayList arrayList, HashMap map, ArrayList arrayList2, ArrayList arrayList3, HashMap map2, ArrayList arrayList4, ArrayList arrayList5, Method method, Method method2) {
        this.f747a = arrayList;
        this.b = map;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = map2;
        this.f = arrayList4;
        this.g = arrayList5;
        this.h = method;
        this.i = method2;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Map map;
        boolean zIsPrimitive = method.getReturnType().isPrimitive();
        Map map2 = this.b;
        if (zIsPrimitive) {
            if (!method.getReturnType().equals(Void.TYPE)) {
                return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
            }
            Iterator it = this.f747a.iterator();
            while (it.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it.next()) || !DynamicLoaderFallback.reportError(obj, map2))) {
            }
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it2.next()) && DynamicLoaderFallback.reportError(obj, map2)) {
                    return null;
                }
            }
            return null;
        }
        if (method.getReturnType().equals(String.class)) {
            return "";
        }
        Object objNewProxyInstance = method.getReturnType().equals(obj.getClass().getInterfaces()[0]) ? obj : Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
        Iterator it3 = this.d.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            map = this.e;
            if (!zHasNext) {
                break;
            }
            if (DynamicLoaderFallback.equalsMethods(method, (Method) it3.next())) {
                DynamicLoaderFallback.sApiProxyToAdListenersMap.put(map.get(obj), (AdListener) objArr[0]);
                break;
            }
        }
        Iterator it4 = this.f.iterator();
        while (it4.hasNext()) {
            if (DynamicLoaderFallback.equalsMethods(method, (Method) it4.next())) {
                map.put(objNewProxyInstance, obj);
            }
        }
        Iterator it5 = this.g.iterator();
        while (it5.hasNext()) {
            if (DynamicLoaderFallback.equalsMethods(method, (Method) it5.next())) {
                for (Object obj2 : objArr) {
                    if (obj2 instanceof Ad) {
                        map2.put(objNewProxyInstance, (Ad) obj2);
                    }
                }
            }
        }
        if (DynamicLoaderFallback.equalsMethods(method, this.h)) {
            map2.put(objArr[1], (Ad) objArr[0]);
        }
        if (DynamicLoaderFallback.equalsMethods(method, this.i)) {
            map2.put(objArr[1], (Ad) objArr[0]);
        }
        return objNewProxyInstance;
    }
}
