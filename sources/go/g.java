package go;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.n;
import org.conscrypt.Conscrypt;
import xj.p;
import xn.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f42032d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f42033c;

    static {
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, e.class.getClassLoader());
            if (Conscrypt.isAvailable() && e.a()) {
                z10 = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f42032d = z10;
    }

    public g() {
        Provider providerNewProvider = Conscrypt.newProvider();
        n.e(providerNewProvider, "newProvider()");
        this.f42033c = providerNewProvider;
    }

    @Override // go.m
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        n.f(protocols, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
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
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) arrayList2.toArray(new String[0]));
        }
    }

    @Override // go.m
    public final String e(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // go.m
    public final SSLContext h() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f42033c);
        n.e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // go.m
    public final SSLSocketFactory i(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContextH = h();
        sSLContextH.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContextH.getSocketFactory();
        n.e(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // go.m
    public final X509TrustManager j() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        n.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                n.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, f.f42031a);
                return x509TrustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        n.e(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }
}
