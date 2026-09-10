package go;

import android.util.Log;
import java.lang.reflect.Method;
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
import kotlin.jvm.internal.n;
import xn.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile m f42045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f42046b;

    /* JADX WARN: Code duplicated, block: B:23:0x006c A[PHI: r0
  0x006c: PHI (r0v37 go.m) = (r0v15 go.m), (r0v17 go.m), (r0v27 go.m), (r0v31 go.m), (r0v35 go.m), (r0v46 go.m) binds: [B:52:0x00da, B:64:0x014e, B:46:0x00cc, B:38:0x00ac, B:30:0x008c, B:21:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:64:0x014e  */
    static {
        m mVar;
        String jvmVersion;
        m iVar = null;
        if (com.bumptech.glide.d.B()) {
            for (Map.Entry entry : ho.c.f42467b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (ho.c.f42466a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(ho.d.f42468a);
                }
            }
            mVar = a.f42024d ? new a() : null;
            if (mVar == null) {
                int i10 = b.f42026c;
                n.c(null);
            } else {
                iVar = mVar;
            }
        } else if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
            mVar = g.f42032d ? new g() : null;
            if (mVar != null) {
                iVar = mVar;
            } else if (!"BC".equals(Security.getProviders()[0].getName())) {
                if (d.f42029d) {
                    mVar = new d();
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    iVar = mVar;
                } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    if (l.f42043d) {
                        mVar = new l();
                    } else {
                        mVar = null;
                    }
                    if (mVar != null) {
                        iVar = mVar;
                    } else {
                        if (j.f42042c) {
                            mVar = new j();
                        } else {
                            mVar = null;
                        }
                        if (mVar != null) {
                            iVar = mVar;
                        } else {
                            jvmVersion = System.getProperty("java.specification.version", "unknown");
                            n.e(jvmVersion, "jvmVersion");
                            if (Integer.parseInt(jvmVersion) < 9) {
                                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                                Method getMethod = cls.getMethod("get", SSLSocket.class);
                                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                                n.e(putMethod, "putMethod");
                                n.e(getMethod, "getMethod");
                                n.e(removeMethod, "removeMethod");
                                n.e(clientProviderClass, "clientProviderClass");
                                n.e(serverProviderClass, "serverProviderClass");
                                iVar = new i(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
                            }
                            if (iVar == null) {
                                mVar = new m();
                                iVar = mVar;
                            }
                        }
                    }
                } else {
                    if (j.f42042c) {
                        mVar = new j();
                    } else {
                        mVar = null;
                    }
                    if (mVar != null) {
                        iVar = mVar;
                    } else {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        n.e(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass2 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass2 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod2 = cls3.getMethod("put", SSLSocket.class, cls4);
                            Method getMethod2 = cls3.getMethod("get", SSLSocket.class);
                            Method removeMethod2 = cls3.getMethod("remove", SSLSocket.class);
                            n.e(putMethod2, "putMethod");
                            n.e(getMethod2, "getMethod");
                            n.e(removeMethod2, "removeMethod");
                            n.e(clientProviderClass2, "clientProviderClass");
                            n.e(serverProviderClass2, "serverProviderClass");
                            iVar = new i(putMethod2, getMethod2, removeMethod2, clientProviderClass2, serverProviderClass2);
                        }
                        if (iVar == null) {
                            mVar = new m();
                            iVar = mVar;
                        }
                    }
                }
            } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                if (j.f42042c) {
                    mVar = new j();
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    iVar = mVar;
                } else {
                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                    n.e(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls6 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> clientProviderClass3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> serverProviderClass3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method putMethod3 = cls5.getMethod("put", SSLSocket.class, cls6);
                        Method getMethod3 = cls5.getMethod("get", SSLSocket.class);
                        Method removeMethod3 = cls5.getMethod("remove", SSLSocket.class);
                        n.e(putMethod3, "putMethod");
                        n.e(getMethod3, "getMethod");
                        n.e(removeMethod3, "removeMethod");
                        n.e(clientProviderClass3, "clientProviderClass");
                        n.e(serverProviderClass3, "serverProviderClass");
                        iVar = new i(putMethod3, getMethod3, removeMethod3, clientProviderClass3, serverProviderClass3);
                    }
                    if (iVar == null) {
                        mVar = new m();
                        iVar = mVar;
                    }
                }
            } else {
                if (l.f42043d) {
                    mVar = new l();
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    iVar = mVar;
                } else {
                    if (j.f42042c) {
                        mVar = new j();
                    } else {
                        mVar = null;
                    }
                    if (mVar != null) {
                        iVar = mVar;
                    } else {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        n.e(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls7 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls8 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod4 = cls7.getMethod("put", SSLSocket.class, cls8);
                            Method getMethod4 = cls7.getMethod("get", SSLSocket.class);
                            Method removeMethod4 = cls7.getMethod("remove", SSLSocket.class);
                            n.e(putMethod4, "putMethod");
                            n.e(getMethod4, "getMethod");
                            n.e(removeMethod4, "removeMethod");
                            n.e(clientProviderClass4, "clientProviderClass");
                            n.e(serverProviderClass4, "serverProviderClass");
                            iVar = new i(putMethod4, getMethod4, removeMethod4, clientProviderClass4, serverProviderClass4);
                        }
                        if (iVar == null) {
                            mVar = new m();
                            iVar = mVar;
                        }
                    }
                }
            }
        } else if (!"BC".equals(Security.getProviders()[0].getName())) {
            if (d.f42029d) {
                mVar = new d();
            } else {
                mVar = null;
            }
            if (mVar != null) {
                iVar = mVar;
            } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                if (j.f42042c) {
                    mVar = new j();
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    iVar = mVar;
                } else {
                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                    n.e(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        Class<?> cls9 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls10 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> clientProviderClass5 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> serverProviderClass5 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method putMethod5 = cls9.getMethod("put", SSLSocket.class, cls10);
                        Method getMethod5 = cls9.getMethod("get", SSLSocket.class);
                        Method removeMethod5 = cls9.getMethod("remove", SSLSocket.class);
                        n.e(putMethod5, "putMethod");
                        n.e(getMethod5, "getMethod");
                        n.e(removeMethod5, "removeMethod");
                        n.e(clientProviderClass5, "clientProviderClass");
                        n.e(serverProviderClass5, "serverProviderClass");
                        iVar = new i(putMethod5, getMethod5, removeMethod5, clientProviderClass5, serverProviderClass5);
                    }
                    if (iVar == null) {
                        mVar = new m();
                        iVar = mVar;
                    }
                }
            } else {
                if (l.f42043d) {
                    mVar = new l();
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    iVar = mVar;
                } else {
                    if (j.f42042c) {
                        mVar = new j();
                    } else {
                        mVar = null;
                    }
                    if (mVar != null) {
                        iVar = mVar;
                    } else {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        n.e(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls11 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls12 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass6 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass6 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod6 = cls11.getMethod("put", SSLSocket.class, cls12);
                            Method getMethod6 = cls11.getMethod("get", SSLSocket.class);
                            Method removeMethod6 = cls11.getMethod("remove", SSLSocket.class);
                            n.e(putMethod6, "putMethod");
                            n.e(getMethod6, "getMethod");
                            n.e(removeMethod6, "removeMethod");
                            n.e(clientProviderClass6, "clientProviderClass");
                            n.e(serverProviderClass6, "serverProviderClass");
                            iVar = new i(putMethod6, getMethod6, removeMethod6, clientProviderClass6, serverProviderClass6);
                        }
                        if (iVar == null) {
                            mVar = new m();
                            iVar = mVar;
                        }
                    }
                }
            }
        } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
            if (j.f42042c) {
                mVar = new j();
            } else {
                mVar = null;
            }
            if (mVar != null) {
                iVar = mVar;
            } else {
                jvmVersion = System.getProperty("java.specification.version", "unknown");
                try {
                    n.e(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        try {
                            Class<?> cls13 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls14 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod7 = cls13.getMethod("put", SSLSocket.class, cls14);
                            Method getMethod7 = cls13.getMethod("get", SSLSocket.class);
                            Method removeMethod7 = cls13.getMethod("remove", SSLSocket.class);
                            n.e(putMethod7, "putMethod");
                            n.e(getMethod7, "getMethod");
                            n.e(removeMethod7, "removeMethod");
                            n.e(clientProviderClass7, "clientProviderClass");
                            n.e(serverProviderClass7, "serverProviderClass");
                            iVar = new i(putMethod7, getMethod7, removeMethod7, clientProviderClass7, serverProviderClass7);
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
                if (iVar == null) {
                    mVar = new m();
                    iVar = mVar;
                }
            }
        } else {
            if (l.f42043d) {
                mVar = new l();
            } else {
                mVar = null;
            }
            if (mVar != null) {
                iVar = mVar;
            } else {
                if (j.f42042c) {
                    mVar = new j();
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    iVar = mVar;
                } else {
                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                    n.e(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        Class<?> cls15 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls16 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> clientProviderClass8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> serverProviderClass8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method putMethod8 = cls15.getMethod("put", SSLSocket.class, cls16);
                        Method getMethod8 = cls15.getMethod("get", SSLSocket.class);
                        Method removeMethod8 = cls15.getMethod("remove", SSLSocket.class);
                        n.e(putMethod8, "putMethod");
                        n.e(getMethod8, "getMethod");
                        n.e(removeMethod8, "removeMethod");
                        n.e(clientProviderClass8, "clientProviderClass");
                        n.e(serverProviderClass8, "serverProviderClass");
                        iVar = new i(putMethod8, getMethod8, removeMethod8, clientProviderClass8, serverProviderClass8);
                    }
                    if (iVar == null) {
                        mVar = new m();
                        iVar = mVar;
                    }
                }
            }
        }
        f42045a = iVar;
        f42046b = Logger.getLogger(q.class.getName());
    }

    public static void g(String message, int i10, Throwable th2) {
        n.f(message, "message");
        f42046b.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th2);
    }

    public com.google.android.gms.internal.auth.i b(X509TrustManager x509TrustManager) {
        return new ko.a(c(x509TrustManager));
    }

    public ko.b c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        n.e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new ko.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List protocols) {
        n.f(protocols, "protocols");
    }

    public String e(SSLSocket sSLSocket) {
        return null;
    }

    public boolean f(String hostname) {
        n.f(hostname, "hostname");
        return true;
    }

    public SSLContext h() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        n.e(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory i(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextH = h();
            sSLContextH.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextH.getSocketFactory();
            n.e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager j() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
