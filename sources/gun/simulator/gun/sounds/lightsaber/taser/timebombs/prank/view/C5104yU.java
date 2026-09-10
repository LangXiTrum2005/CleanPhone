package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C5104yU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C5104yU f5278a;
    public static final Logger b;

    /* JADX WARN: Code duplicated, block: B:29:0x0099 A[PHI: r1
  0x0099: PHI (r1v18 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yU) = 
  (r1v16 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yU)
  (r1v21 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yU)
 binds: [B:36:0x00bd, B:28:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3 A[PHI: r0
  0x00e3: PHI (r0v8 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yU) = 
  (r0v6 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yU)
  (r0v7 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yU)
  (r0v12 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yU)
 binds: [B:52:0x00f7, B:54:0x00fa, B:44:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fa  */
    static {
        C5104yU c4912wE;
        C5104yU c5104yUC;
        C5104yU c4145nb;
        if (AbstractC2995aW.i("Dalvik", System.getProperty("java.vm.name"))) {
            for (Map.Entry entry : AbstractC4632t4.b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (AbstractC4632t4.f5013a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(C4720u4.f5062a);
                }
            }
            c4912wE = C3753j4.d.r() ? new C3753j4() : null;
            if (c4912wE == null) {
                c4912wE = C5072y4.e.c();
                AbstractC2995aW.n(c4912wE);
            }
        } else if (AbstractC2995aW.i("Conscrypt", Security.getProviders()[0].getName())) {
            c4145nb = C4512rj.d ? new C4512rj() : null;
            if (c4145nb != null) {
                c4912wE = c4145nb;
            } else {
                if (AbstractC2995aW.i("BC", Security.getProviders()[0].getName())) {
                    if (C4145nb.d.r()) {
                        c4145nb = new C4145nb();
                    } else {
                        c4145nb = null;
                    }
                    if (c4145nb != null) {
                        c4912wE = c4145nb;
                    }
                }
                if (AbstractC2995aW.i("OpenJSSE", Security.getProviders()[0].getName())) {
                    if (SS.d.n()) {
                        c5104yUC = new SS();
                    } else {
                        c5104yUC = null;
                    }
                    if (c5104yUC != null) {
                        c4912wE = c5104yUC;
                    } else {
                        if (C4912wE.c) {
                        }
                        if (c4912wE == null) {
                            c5104yUC = C4824vE.h.c();
                            if (c5104yUC == null) {
                                c5104yUC = new C5104yU();
                            }
                            c4912wE = c5104yUC;
                        }
                    }
                } else {
                    if (C4912wE.c) {
                    }
                    if (c4912wE == null) {
                        c5104yUC = C4824vE.h.c();
                        if (c5104yUC == null) {
                            c5104yUC = new C5104yU();
                        }
                        c4912wE = c5104yUC;
                    }
                }
            }
        } else {
            if (AbstractC2995aW.i("BC", Security.getProviders()[0].getName())) {
                if (C4145nb.d.r()) {
                    c4145nb = new C4145nb();
                } else {
                    c4145nb = null;
                }
                if (c4145nb != null) {
                    c4912wE = c4145nb;
                }
            }
            if (AbstractC2995aW.i("OpenJSSE", Security.getProviders()[0].getName())) {
                c4912wE = C4912wE.c ? new C4912wE() : null;
                if (c4912wE == null) {
                    c5104yUC = C4824vE.h.c();
                    if (c5104yUC == null) {
                        c5104yUC = new C5104yU();
                    }
                    c4912wE = c5104yUC;
                }
            } else {
                if (SS.d.n()) {
                    c5104yUC = new SS();
                } else {
                    c5104yUC = null;
                }
                if (c5104yUC != null) {
                    c4912wE = c5104yUC;
                } else {
                    if (C4912wE.c) {
                    }
                    if (c4912wE == null) {
                        c5104yUC = C4824vE.h.c();
                        if (c5104yUC == null) {
                            c5104yUC = new C5104yU();
                        }
                        c4912wE = c5104yUC;
                    }
                }
            }
        }
        f5278a = c4912wE;
        b = Logger.getLogger(C4838vS.class.getName());
    }

    public static void i(int i, String str, Throwable th) {
        AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public AbstractC3375el b(X509TrustManager x509TrustManager) {
        return new Y9(c(x509TrustManager));
    }

    public InterfaceC3714ie0 c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        AbstractC2995aW.p(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C2999aa((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC2995aW.q(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        AbstractC2995aW.q(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        AbstractC2995aW.q(str, "hostname");
        return true;
    }

    public void j(Object obj, String str) {
        AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
        if (obj == null) {
            str = AbstractC2995aW.v0(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);", str);
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC2995aW.p(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextK = k();
            sSLContextK.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextK.getSocketFactory();
            AbstractC2995aW.p(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError(AbstractC2995aW.v0(e, "No System TLS: "), e);
        }
    }

    public X509TrustManager m() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
