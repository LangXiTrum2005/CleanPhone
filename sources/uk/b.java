package uk;

import cn.c0;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f52223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f52224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wj.j f52225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wj.j f52226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f52227e;

    public b(Class cls, Map map, wj.j jVar, wj.j jVar2, List list) {
        this.f52223a = cls;
        this.f52224b = map;
        this.f52225c = jVar;
        this.f52226d = jVar2;
        this.f52227e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zA;
        boolean z10;
        Class annotationClass = this.f52223a;
        kotlin.jvm.internal.n.f(annotationClass, "$annotationClass");
        List methods = this.f52227e;
        kotlin.jvm.internal.n.f(methods, "$methods");
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return annotationClass;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.f52226d.getValue()).intValue());
                }
            } else if (name.equals(InAppPurchaseConstants.METHOD_TO_STRING)) {
                return (String) this.f52225c.getValue();
            }
        }
        boolean zA2 = kotlin.jvm.internal.n.a(name, "equals");
        Map map = this.f52224b;
        boolean z11 = false;
        if (!zA2 || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb2 = new StringBuilder("Method is not supported: ");
            sb2.append(method);
            sb2.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb2.append(xj.k.C0(objArr));
            sb2.append(')');
            throw new c0(sb2.toString(), 3);
        }
        Object objZ0 = xj.k.z0(objArr);
        Annotation annotation = objZ0 instanceof Annotation ? (Annotation) objZ0 : null;
        if (kotlin.jvm.internal.n.a(annotation != null ? d0.c.p(d0.c.l(annotation)) : null, annotationClass)) {
            List list = methods;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    }
                    Method method2 = (Method) it.next();
                    Object obj2 = map.get(method2.getName());
                    Object objInvoke = method2.invoke(objZ0, null);
                    if (obj2 instanceof boolean[]) {
                        kotlin.jvm.internal.n.d(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        zA = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        kotlin.jvm.internal.n.d(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                        zA = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        kotlin.jvm.internal.n.d(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        zA = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        kotlin.jvm.internal.n.d(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        zA = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        kotlin.jvm.internal.n.d(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                        zA = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        kotlin.jvm.internal.n.d(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        zA = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        kotlin.jvm.internal.n.d(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                        zA = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        kotlin.jvm.internal.n.d(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        zA = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else if (obj2 instanceof Object[]) {
                        kotlin.jvm.internal.n.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        zA = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                    } else {
                        zA = kotlin.jvm.internal.n.a(obj2, objInvoke);
                    }
                    if (!zA) {
                        z10 = false;
                        break;
                    }
                }
            } else {
                z10 = true;
                break;
            }
            if (z10) {
                z11 = true;
            }
        }
        return Boolean.valueOf(z11);
    }
}
