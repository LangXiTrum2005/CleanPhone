package go;

import android.net.http.X509TrustManagerExtensions;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f42024d = com.bumptech.glide.d.B();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f42025c;

    public a() {
        ArrayList arrayListM0 = xj.k.m0(new ho.m[]{com.bumptech.glide.d.B() ? new ho.a() : null, new ho.l(ho.f.f42469f), new ho.l(ho.j.f42476a), new ho.l(ho.h.f42475a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM0) {
            if (((ho.m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f42025c = arrayList;
    }

    @Override // go.m
    public final com.google.android.gms.internal.auth.i b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        ho.b bVar = x509TrustManagerExtensions != null ? new ho.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new ko.a(c(x509TrustManager));
    }

    @Override // go.m
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        Object next;
        n.f(protocols, "protocols");
        Iterator it = this.f42025c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ho.m) next).matchesSocket(sSLSocket));
        ho.m mVar = (ho.m) next;
        if (mVar != null) {
            mVar.configureTlsExtensions(sSLSocket, str, protocols);
        }
    }

    @Override // go.m
    public final String e(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f42025c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ho.m) next).matchesSocket(sSLSocket));
        ho.m mVar = (ho.m) next;
        if (mVar != null) {
            return mVar.getSelectedProtocol(sSLSocket);
        }
        return null;
    }

    @Override // go.m
    public final boolean f(String hostname) {
        n.f(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
