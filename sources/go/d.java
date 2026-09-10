package go;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.n;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f42029d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f42030c = new BouncyCastleJsseProvider();

    static {
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, c.class.getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f42029d = z10;
    }

    @Override // go.m
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        n.f(protocols, "protocols");
    }

    @Override // go.m
    public final String e(SSLSocket sSLSocket) {
        return null;
    }

    @Override // go.m
    public final SSLContext h() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f42030c);
        n.e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // go.m
    public final X509TrustManager j() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        n.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                n.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        n.e(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }
}
