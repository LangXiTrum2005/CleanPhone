package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

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
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4145nb extends C5104yU {
    public static final C3887ke d = new C3887ke(23, 0 == true ? 1 : 0);
    public static final boolean e;
    public final Provider c = new BouncyCastleJsseProvider();

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, C3887ke.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        e = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5104yU
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC2995aW.q(list, "protocols");
        if (!(sSLSocket instanceof BCSSLSocket)) {
            super.d(sSLSocket, str, list);
            return;
        }
        BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
        BCSSLParameters parameters = bCSSLSocket.getParameters();
        Object[] array = C3887ke.j(list).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        parameters.setApplicationProtocols((String[]) array);
        bCSSLSocket.setParameters(parameters);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5104yU
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        if (!(sSLSocket instanceof BCSSLSocket) || (applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol()) == null || AbstractC2995aW.i(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5104yU
    public final SSLContext k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.c);
        AbstractC2995aW.p(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5104yU
    public final X509TrustManager m() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC2995aW.n(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String string = Arrays.toString(trustManagers);
        AbstractC2995aW.p(string, "toString(this)");
        throw new IllegalStateException(AbstractC2995aW.v0(string, "Unexpected default trust managers: ").toString());
    }
}
