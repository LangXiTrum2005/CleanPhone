package go;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42036c;

    public h(ArrayList arrayList) {
        this.f42034a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        n.f(proxy, "proxy");
        n.f(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (n.a(name, "supports") && n.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (n.a(name, "unsupported") && n.a(Void.TYPE, returnType)) {
            this.f42035b = true;
            return null;
        }
        boolean zA = n.a(name, "protocols");
        ArrayList arrayList = this.f42034a;
        if (zA && objArr.length == 0) {
            return arrayList;
        }
        if ((n.a(name, "selectProtocol") || n.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        Object obj2 = list.get(i10);
                        n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj2;
                        if (arrayList.contains(str)) {
                            this.f42036c = str;
                            return str;
                        }
                        if (i10 != size) {
                            i10++;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f42036c = str2;
                return str2;
            }
        }
        if ((!n.a(name, "protocolSelected") && !n.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj3 = objArr[0];
        n.d(obj3, "null cannot be cast to non-null type kotlin.String");
        this.f42036c = (String) obj3;
        return null;
    }
}
