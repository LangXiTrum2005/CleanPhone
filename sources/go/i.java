package go;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.n;
import xj.p;
import xn.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f42037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f42038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f42039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f42040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f42041g;

    public i(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f42037c = method;
        this.f42038d = method2;
        this.f42039e = method3;
        this.f42040f = cls;
        this.f42041g = cls2;
    }

    @Override // go.m
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f42039e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // go.m
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        n.f(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((r) obj) != r.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.W(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((r) it.next()).f54059a);
        }
        try {
            this.f42037c.invoke(null, sSLSocket, Proxy.newProxyInstance(m.class.getClassLoader(), new Class[]{this.f42040f, this.f42041g}, new h(arrayList2)));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // go.m
    public final String e(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f42038d.invoke(null, sSLSocket));
            n.d(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            h hVar = (h) invocationHandler;
            boolean z10 = hVar.f42035b;
            if (!z10 && hVar.f42036c == null) {
                m.g("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z10) {
                return null;
            }
            return hVar.f42036c;
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
