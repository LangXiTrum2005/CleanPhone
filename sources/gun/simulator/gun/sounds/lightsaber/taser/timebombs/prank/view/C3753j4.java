package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3753j4 extends C5104yU {
    public static final C3887ke d = new C3887ke(22, 0);
    public static final boolean e;
    public final ArrayList c;

    static {
        boolean z = false;
        if (AbstractC2995aW.i("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        e = z;
    }

    public C3753j4() {
        InterfaceC3907ko interfaceC3907ko;
        InterfaceC3907ko interfaceC3907ko2;
        InterfaceC3236d80[] interfaceC3236d80Arr = new InterfaceC3236d80[4];
        interfaceC3236d80Arr[0] = C3841k4.f4582a.n() ? new C3841k4() : null;
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
    public final boolean h(String str) {
        AbstractC2995aW.q(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
