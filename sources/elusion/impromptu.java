package elusion;

import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.L6;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.rotuma;
import org.jacoco.core.runtime.AgentOptions;
import p002kotlin.Metadata;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J-\u0010&\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u001e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010\u00012\u0006\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-J!\u0010/\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0002052\u0006\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\u0006\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010\u0006¨\u0006="}, d2 = {"Lelusion/impromptu;", "", "<init>", "()V", "", "competently", "()Ljava/lang/String;", "Ljavax/net/ssl/SSLContext;", "triweekly", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "arytenoidectomy", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "Lokhttp3/Protocol;", "protocols", "", "marial", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "saneness", "(Ljavax/net/ssl/SSLSocket;)V", "impromptu", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", AgentOptions.ADDRESS, "", "connectTimeout", "beachfront", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", PglCryptUtils.KEY_MESSAGE, AppLovinEventTypes.USER_COMPLETED_LEVEL, "", "t", "apical", "(Ljava/lang/String;ILjava/lang/Throwable;)V", "", "cutely", "(Ljava/lang/String;)Z", "closer", "taiyuan", "(Ljava/lang/String;)Ljava/lang/Object;", "stackTrace", "impassible", "(Ljava/lang/String;Ljava/lang/Object;)V", "trustManager", "Lventriculoatrial/dern;", "dern", "(Ljavax/net/ssl/X509TrustManager;)Lventriculoatrial/dern;", "Lventriculoatrial/marial;", "wireman", "(Ljavax/net/ssl/X509TrustManager;)Lventriculoatrial/marial;", "Ljavax/net/ssl/SSLSocketFactory;", "kowloon", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "toString", "attabal", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Logger f25627dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static volatile impromptu f25628saneness;

    /* JADX INFO: renamed from: elusion.impromptu$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Platform.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001c\u0010#\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lelusion/impromptu$attabal;", "", "<init>", "()V", "Lelusion/impromptu;", "competently", "()Lelusion/impromptu;", "", "Lokhttp3/Protocol;", "protocols", "", "saneness", "(Ljava/util/List;)Ljava/util/List;", "", "dern", "(Ljava/util/List;)[B", "beachfront", "wireman", "marial", "", "impromptu", "()Z", "isAndroid", "cutely", "isConscryptPreferred", "apical", "isOpenJSSEPreferred", "taiyuan", "isBouncyCastlePreferred", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", L6.H, "Lelusion/impromptu;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean apical() {
            return Intrinsics.wireman("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final impromptu beachfront() {
            return impromptu() ? wireman() : marial();
        }

        public final impromptu competently() {
            return impromptu.f25628saneness;
        }

        public final boolean cutely() {
            return Intrinsics.wireman("Conscrypt", Security.getProviders()[0].getName());
        }

        public final byte[] dern(List<? extends Protocol> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            duvetyn.wireman wiremanVar = new duvetyn.wireman();
            for (String str : saneness(protocols)) {
                wiremanVar.writeByte(str.length());
                wiremanVar.writeUtf8(str);
            }
            return wiremanVar.readByteArray();
        }

        public final boolean impromptu() {
            return Intrinsics.wireman("Dalvik", System.getProperty("java.vm.name"));
        }

        public final impromptu marial() {
            competently competentlyVarAttabal;
            dern dernVarAttabal;
            wireman wiremanVarSaneness;
            if (cutely() && (wiremanVarSaneness = wireman.INSTANCE.saneness()) != null) {
                return wiremanVarSaneness;
            }
            if (taiyuan() && (dernVarAttabal = dern.INSTANCE.attabal()) != null) {
                return dernVarAttabal;
            }
            if (apical() && (competentlyVarAttabal = competently.INSTANCE.attabal()) != null) {
                return competentlyVarAttabal;
            }
            beachfront beachfrontVarAttabal = beachfront.INSTANCE.attabal();
            if (beachfrontVarAttabal != null) {
                return beachfrontVarAttabal;
            }
            impromptu impromptuVarAttabal = marial.INSTANCE.attabal();
            return impromptuVarAttabal != null ? impromptuVarAttabal : new impromptu();
        }

        public final List<String> saneness(List<? extends Protocol> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(dovishness.gintrap(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).getProtocol());
            }
            return arrayList2;
        }

        public final boolean taiyuan() {
            return Intrinsics.wireman("BC", Security.getProviders()[0].getName());
        }

        public final impromptu wireman() {
            shent.dern.f37604attabal.saneness();
            impromptu impromptuVarAttabal = attabal.INSTANCE.attabal();
            if (impromptuVarAttabal != null) {
                return impromptuVarAttabal;
            }
            impromptu impromptuVarAttabal2 = saneness.f25638beachfront.attabal();
            Intrinsics.beachfront(impromptuVarAttabal2);
            return impromptuVarAttabal2;
        }

        public Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f25628saneness = companion.beachfront();
        f25627dern = Logger.getLogger(rotuma.class.getName());
    }

    public static /* synthetic */ void formularize(impromptu impromptuVar, String str, int i, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i2 & 2) != 0) {
            i = 4;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        impromptuVar.apical(str, i, th);
    }

    public void apical(String message, int level, Throwable t) {
        Intrinsics.checkNotNullParameter(message, "message");
        f25627dern.log(level == 5 ? Level.WARNING : Level.INFO, message, t);
    }

    public X509TrustManager arytenoidectomy() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.beachfront(trustManagers);
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
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        throw new IllegalStateException(Intrinsics.arytenoidectomy("Unexpected default trust managers: ", string).toString());
    }

    public void beachfront(Socket socket, InetSocketAddress address, int connectTimeout) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, connectTimeout);
    }

    public final String competently() {
        return "OkHttp";
    }

    public boolean cutely(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public ventriculoatrial.dern dern(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new ventriculoatrial.attabal(wireman(trustManager));
    }

    public void impassible(String message, Object stackTrace) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (stackTrace == null) {
            message = Intrinsics.arytenoidectomy(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        apical(message, 5, (Throwable) stackTrace);
    }

    public String impromptu(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public SSLSocketFactory kowloon(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContextTriweekly = triweekly();
            sSLContextTriweekly.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextTriweekly.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError(Intrinsics.arytenoidectomy("No System TLS: ", e), e);
        }
    }

    public void marial(SSLSocket sslSocket, String hostname, List<Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public void saneness(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    public Object taiyuan(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (f25627dern.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }

    public SSLContext triweekly() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public ventriculoatrial.marial wireman(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new ventriculoatrial.saneness((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }
}
