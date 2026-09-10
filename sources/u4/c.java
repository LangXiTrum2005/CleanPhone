package u4;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qk.d f51883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z4.b f51884b;

    public c(qk.d clazz, z4.b bVar) {
        n.f(clazz, "clazz");
        this.f51883a = clazz;
        this.f51884b = bVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        n.f(obj, "obj");
        n.f(method, "method");
        boolean zA = n.a(method.getName(), "accept");
        z4.b bVar = this.f51884b;
        if (zA && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            r9.b.b(this.f51883a, obj2);
            bVar.invoke(obj2);
            return r.f53297a;
        }
        if (n.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (n.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(bVar.hashCode());
        }
        if (n.a(method.getName(), InAppPurchaseConstants.METHOD_TO_STRING) && method.getReturnType().equals(String.class) && objArr == null) {
            return bVar.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
