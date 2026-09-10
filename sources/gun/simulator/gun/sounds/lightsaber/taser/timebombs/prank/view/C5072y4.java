package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5072y4 extends C5104yU {
    public static final C3336eJ e;
    public static final boolean f;
    public final ArrayList c;
    public final C2464Hf d;

    static {
        boolean z = false;
        z = false;
        e = new C3336eJ(22, z ? 1 : 0);
        if (AbstractC2995aW.i("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f = z;
    }

    public C5072y4() throws NoSuchMethodException {
        C3852k90 c3852k90;
        InterfaceC3907ko interfaceC3907ko;
        InterfaceC3907ko interfaceC3907ko2;
        Method method;
        Method method2;
        InterfaceC3236d80[] interfaceC3236d80Arr = new InterfaceC3236d80[4];
        Method method3 = null;
        try {
            Class<?> cls = Class.forName(AbstractC2995aW.v0(".OpenSSLSocketImpl", "com.android.org.conscrypt"));
            Class.forName(AbstractC2995aW.v0(".OpenSSLSocketFactoryImpl", "com.android.org.conscrypt"));
            Class.forName(AbstractC2995aW.v0(".SSLParametersImpl", "com.android.org.conscrypt"));
            c3852k90 = new C3852k90(cls);
        } catch (Exception e2) {
            C5104yU.f5278a.getClass();
            C5104yU.i(5, "unable to load android socket classes", e2);
            c3852k90 = null;
        }
        interfaceC3236d80Arr[0] = c3852k90;
        interfaceC3236d80Arr[1] = new C3995lo(C4.f);
        switch (C4688tj.f5047a.f4606a) {
            case 27:
                interfaceC3907ko = C4321pb.b;
                break;
            default:
                interfaceC3907ko = C4688tj.b;
                break;
        }
        interfaceC3236d80Arr[2] = new C3995lo(interfaceC3907ko);
        switch (C4321pb.f4839a.f4606a) {
            case 27:
                interfaceC3907ko2 = C4321pb.b;
                break;
            default:
                interfaceC3907ko2 = C4688tj.b;
                break;
        }
        interfaceC3236d80Arr[3] = new C3995lo(interfaceC3907ko2);
        ArrayList arrayListN0 = U5.n0(interfaceC3236d80Arr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListN0) {
            if (((InterfaceC3236d80) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method2 = cls2.getMethod(C4304pL.OPEN, String.class);
            method = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new C2464Hf(method3, method2, method);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5104yU
    public final AbstractC3375el b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C4193o4 c4193o4 = x509TrustManagerExtensions != null ? new C4193o4(x509TrustManager, x509TrustManagerExtensions) : null;
        return c4193o4 == null ? new Y9(c(x509TrustManager)) : c4193o4;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5104yU
    public final InterfaceC3714ie0 c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C4984x4(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5104yU
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        AbstractC2995aW.q(list, "protocols");
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC3236d80) next).a(sSLSocket));
        InterfaceC3236d80 interfaceC3236d80 = (InterfaceC3236d80) next;
        if (interfaceC3236d80 == null) {
            return;
        }
        interfaceC3236d80.c(sSLSocket, str, list);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5104yU
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        AbstractC2995aW.q(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5104yU
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC3236d80) next).a(sSLSocket));
        InterfaceC3236d80 interfaceC3236d80 = (InterfaceC3236d80) next;
        if (interfaceC3236d80 == null) {
            return null;
        }
        return interfaceC3236d80.b(sSLSocket);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5104yU
    public final Object g() {
        C2464Hf c2464Hf = this.d;
        c2464Hf.getClass();
        Method method = c2464Hf.f3178a;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, new Object[0]);
            Method method2 = c2464Hf.b;
            AbstractC2995aW.n(method2);
            method2.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5104yU
    public final boolean h(String str) {
        AbstractC2995aW.q(str, "hostname");
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5104yU
    public final void j(Object obj, String str) {
        AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
        C2464Hf c2464Hf = this.d;
        c2464Hf.getClass();
        if (obj != null) {
            try {
                Method method = c2464Hf.c;
                AbstractC2995aW.n(method);
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        C5104yU.i(5, str, null);
    }
}
