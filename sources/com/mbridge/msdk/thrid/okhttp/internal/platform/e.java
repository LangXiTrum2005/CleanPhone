package com.mbridge.msdk.thrid.okhttp.internal.platform;

import com.mbridge.msdk.thrid.okhttp.w;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class e extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f36584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f36585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f36586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class<?> f36587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class<?> f36588g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f36589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f36590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f36591c;

        public a(List<String> list) {
            this.f36589a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = com.mbridge.msdk.thrid.okhttp.internal.c.f36259b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f36590b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f36589a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f36589a.contains(list.get(i10))) {
                            String str = (String) list.get(i10);
                            this.f36591c = str;
                            return str;
                        }
                    }
                    String str2 = this.f36589a.get(0);
                    this.f36591c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f36591c = (String) objArr[0];
            return null;
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f36584c = method;
        this.f36585d = method2;
        this.f36586e = method3;
        this.f36587f = cls;
        this.f36588g = cls2;
    }

    public static g h() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            return new e(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public void a(SSLSocket sSLSocket, String str, List<w> list) {
        try {
            this.f36584c.invoke(null, sSLSocket, Proxy.newProxyInstance(g.class.getClassLoader(), new Class[]{this.f36587f, this.f36588g}, new a(g.a(list))));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to set alpn", (Exception) e10);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public String b(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f36585d.invoke(null, sSLSocket));
            boolean z10 = aVar.f36590b;
            if (!z10 && aVar.f36591c == null) {
                g.d().a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (z10) {
                return null;
            }
            return aVar.f36591c;
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to get selected protocol", (Exception) e10);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public void a(SSLSocket sSLSocket) {
        try {
            this.f36586e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to remove alpn", (Exception) e10);
        }
    }
}
