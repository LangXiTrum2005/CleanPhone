package elusion;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C3414a2;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import org.jacoco.core.runtime.AgentOptions;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import shent.apical;
import shent.cutely;
import shent.formularize;
import shent.taiyuan;

/* JADX INFO: compiled from: AndroidPlatform.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u000212B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010/¨\u00063"}, d2 = {"Lelusion/saneness;", "Lelusion/impromptu;", "<init>", "()V", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", AgentOptions.ADDRESS, "", "connectTimeout", "", "beachfront", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "marial", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "impromptu", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "closer", "", "taiyuan", "(Ljava/lang/String;)Ljava/lang/Object;", PglCryptUtils.KEY_MESSAGE, "stackTrace", "impassible", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "cutely", "(Ljava/lang/String;)Z", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lventriculoatrial/dern;", "dern", "(Ljavax/net/ssl/X509TrustManager;)Lventriculoatrial/dern;", "Lventriculoatrial/marial;", "wireman", "(Ljavax/net/ssl/X509TrustManager;)Lventriculoatrial/marial;", "Lshent/apical;", "Ljava/util/List;", "socketAdapters", "Lshent/impromptu;", "Lshent/impromptu;", "closeGuard", "attabal", "saneness", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class saneness extends impromptu {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final boolean f25639competently;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final shent.impromptu closeGuard;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final List<apical> socketAdapters;

    /* JADX INFO: renamed from: elusion.saneness$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AndroidPlatform.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lelusion/saneness$attabal;", "", "<init>", "()V", "Lelusion/impromptu;", "attabal", "()Lelusion/impromptu;", "", "isSupported", "Z", "saneness", "()Z", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final impromptu attabal() {
            if (saneness()) {
                return new saneness();
            }
            return null;
        }

        public final boolean saneness() {
            return saneness.f25639competently;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: elusion.saneness$saneness, reason: collision with other inner class name and from toString */
    /* JADX INFO: compiled from: AndroidPlatform.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lelusion/saneness$saneness;", "Lventriculoatrial/marial;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljava/lang/reflect/Method;", "findByIssuerAndSignatureMethod", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "Ljava/security/cert/X509Certificate;", "cert", "findByIssuerAndSignature", "(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Ljavax/net/ssl/X509TrustManager;", "saneness", "Ljava/lang/reflect/Method;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class CustomTrustRootIndex implements ventriculoatrial.marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
        public final X509TrustManager trustManager;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
        public final Method findByIssuerAndSignatureMethod;

        public CustomTrustRootIndex(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.trustManager = trustManager;
            this.findByIssuerAndSignatureMethod = findByIssuerAndSignatureMethod;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) other;
            return Intrinsics.wireman(this.trustManager, customTrustRootIndex.trustManager) && Intrinsics.wireman(this.findByIssuerAndSignatureMethod, customTrustRootIndex.findByIssuerAndSignatureMethod);
        }

        @Override // ventriculoatrial.marial
        public X509Certificate findByIssuerAndSignature(X509Certificate cert) {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object objInvoke = this.findByIssuerAndSignatureMethod.invoke(this.trustManager, cert);
                if (objInvoke != null) {
                    return ((TrustAnchor) objInvoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public int hashCode() {
            return (this.trustManager.hashCode() * 31) + this.findByIssuerAndSignatureMethod.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.trustManager + ", findByIssuerAndSignatureMethod=" + this.findByIssuerAndSignatureMethod + ')';
        }
    }

    static {
        boolean z = false;
        if (impromptu.INSTANCE.impromptu() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f25639competently = z;
    }

    public saneness() {
        List listMonoploid = adultoid.monoploid(formularize.Companion.saneness(formularize.INSTANCE, null, 1, null), new cutely(shent.beachfront.INSTANCE.wireman()), new cutely(taiyuan.INSTANCE.attabal()), new cutely(shent.competently.INSTANCE.attabal()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMonoploid) {
            if (((apical) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
        this.closeGuard = shent.impromptu.INSTANCE.attabal();
    }

    @Override // elusion.impromptu
    public void beachfront(Socket socket, InetSocketAddress address, int connectTimeout) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, connectTimeout);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // elusion.impromptu
    public boolean cutely(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // elusion.impromptu
    public ventriculoatrial.dern dern(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        shent.saneness sanenessVarAttabal = shent.saneness.INSTANCE.attabal(trustManager);
        return sanenessVarAttabal == null ? super.dern(trustManager) : sanenessVarAttabal;
    }

    @Override // elusion.impromptu
    public void impassible(String message, Object stackTrace) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.closeGuard.saneness(stackTrace)) {
            return;
        }
        impromptu.formularize(this, message, 5, null, 4, null);
    }

    @Override // elusion.impromptu
    public String impromptu(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator<T> it = this.socketAdapters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((apical) next).matchesSocket(sslSocket));
        apical apicalVar = (apical) next;
        if (apicalVar == null) {
            return null;
        }
        return apicalVar.getSelectedProtocol(sslSocket);
    }

    @Override // elusion.impromptu
    public void marial(SSLSocket sslSocket, String hostname, List<Protocol> protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator<T> it = this.socketAdapters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((apical) next).matchesSocket(sslSocket));
        apical apicalVar = (apical) next;
        if (apicalVar == null) {
            return;
        }
        apicalVar.configureTlsExtensions(sslSocket, hostname, protocols);
    }

    @Override // elusion.impromptu
    public Object taiyuan(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        return this.closeGuard.attabal(closer);
    }

    @Override // elusion.impromptu
    public ventriculoatrial.marial wireman(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new CustomTrustRootIndex(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.wireman(trustManager);
        }
    }
}
