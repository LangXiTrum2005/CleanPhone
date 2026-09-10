package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;

/* JADX INFO: loaded from: classes4.dex */
public final class SS extends C5104yU {
    public static final C3336eJ d = new C3336eJ(24, 0);
    public static final boolean e;
    public final Provider c = new OpenJSSE();

    static {
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, C3336eJ.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        e = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5104yU
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC2995aW.q(list, "protocols");
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            super.d(sSLSocket, str, list);
            return;
        }
        org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
        SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
        if (sSLParameters instanceof SSLParameters) {
            SSLParameters sSLParameters2 = sSLParameters;
            Object[] array = C3887ke.j(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            sSLParameters2.setApplicationProtocols((String[]) array);
            sSLSocket2.setSSLParameters(sSLParameters);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5104yU
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) || (applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol()) == null || AbstractC2995aW.i(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5104yU
    public final SSLContext k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.c);
        AbstractC2995aW.p(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5104yU
    public final X509TrustManager m() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.c);
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
