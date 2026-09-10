package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4736uE implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5070a;
    public boolean b;
    public String c;

    public C4736uE(ArrayList arrayList) {
        this.f5070a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC2995aW.q(obj, "proxy");
        AbstractC2995aW.q(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (AbstractC2995aW.i(name, "supports") && AbstractC2995aW.i(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (AbstractC2995aW.i(name, "unsupported") && AbstractC2995aW.i(Void.TYPE, returnType)) {
            this.b = true;
            return null;
        }
        boolean zI = AbstractC2995aW.i(name, "protocols");
        List list = this.f5070a;
        if (zI && objArr.length == 0) {
            return list;
        }
        if ((AbstractC2995aW.i(name, "selectProtocol") || AbstractC2995aW.i(name, "select")) && AbstractC2995aW.i(String.class, returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
                List list2 = (List) obj2;
                int size = list2.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        Object obj3 = list2.get(i);
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        String str = (String) obj3;
                        if (list.contains(str)) {
                            this.c = str;
                            return str;
                        }
                        if (i != size) {
                            i = i2;
                        }
                    }
                }
                String str2 = (String) list.get(0);
                this.c = str2;
                return str2;
            }
        }
        if ((!AbstractC2995aW.i(name, "protocolSelected") && !AbstractC2995aW.i(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        if (obj4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.c = (String) obj4;
        return null;
    }
}
