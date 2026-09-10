package com.applovin.shadow.okhttp3.internal.platform;

import android.annotation.SuppressLint;
import android.security.NetworkSecurityPolicy;
import com.applovin.shadow.okhttp3.Protocol;
import com.applovin.shadow.okhttp3.internal.SuppressSignatureCheck;
import com.applovin.shadow.okhttp3.internal.platform.android.Android10SocketAdapter;
import com.applovin.shadow.okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import com.applovin.shadow.okhttp3.internal.platform.android.AndroidSocketAdapter;
import com.applovin.shadow.okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import com.applovin.shadow.okhttp3.internal.platform.android.ConscryptSocketAdapter;
import com.applovin.shadow.okhttp3.internal.platform.android.DeferredSocketAdapter;
import com.applovin.shadow.okhttp3.internal.platform.android.SocketAdapter;
import com.applovin.shadow.okhttp3.internal.tls.CertificateChainCleaner;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@SuppressSignatureCheck
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/platform/Android10Platform;", "Lcom/applovin/shadow/okhttp3/internal/platform/Platform;", "<init>", "()V", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lcom/applovin/shadow/okhttp3/Protocol;", "protocols", "Lwj/r;", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "isCleartextTrafficPermitted", "(Ljava/lang/String;)Z", "Lcom/applovin/shadow/okhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "(Ljavax/net/ssl/X509TrustManager;)Lcom/applovin/shadow/okhttp3/internal/tls/CertificateChainCleaner;", "Lcom/applovin/shadow/okhttp3/internal/platform/android/SocketAdapter;", "socketAdapters", "Ljava/util/List;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Android10Platform extends Platform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean isSupported = Platform.INSTANCE.isAndroid();
    private final List<SocketAdapter> socketAdapters;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/platform/Android10Platform$Companion;", "", "()V", "isSupported", "", "()Z", "buildIfSupported", "Lcom/applovin/shadow/okhttp3/internal/platform/Platform;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Platform buildIfSupported() {
            if (isSupported()) {
                return new Android10Platform();
            }
            return null;
        }

        public final boolean isSupported() {
            return Android10Platform.isSupported;
        }

        private Companion() {
        }
    }

    public Android10Platform() {
        ArrayList arrayListM0 = k.m0(new SocketAdapter[]{Android10SocketAdapter.INSTANCE.buildIfSupported(), new DeferredSocketAdapter(AndroidSocketAdapter.INSTANCE.getPlayProviderFactory()), new DeferredSocketAdapter(ConscryptSocketAdapter.INSTANCE.getFactory()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.INSTANCE.getFactory())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM0) {
            if (((SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
    }

    @Override // com.applovin.shadow.okhttp3.internal.platform.Platform
    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager trustManager) {
        n.f(trustManager, "trustManager");
        AndroidCertificateChainCleaner androidCertificateChainCleanerBuildIfSupported = AndroidCertificateChainCleaner.INSTANCE.buildIfSupported(trustManager);
        return androidCertificateChainCleanerBuildIfSupported != null ? androidCertificateChainCleanerBuildIfSupported : super.buildCertificateChainCleaner(trustManager);
    }

    @Override // com.applovin.shadow.okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sslSocket, String hostname, List<? extends Protocol> protocols) {
        Object next;
        n.f(sslSocket, "sslSocket");
        n.f(protocols, "protocols");
        Iterator<T> it = this.socketAdapters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((SocketAdapter) next).matchesSocket(sslSocket));
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            socketAdapter.configureTlsExtensions(sslSocket, hostname, protocols);
        }
    }

    @Override // com.applovin.shadow.okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sslSocket) {
        Object next;
        n.f(sslSocket, "sslSocket");
        Iterator<T> it = this.socketAdapters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((SocketAdapter) next).matchesSocket(sslSocket));
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            return socketAdapter.getSelectedProtocol(sslSocket);
        }
        return null;
    }

    @Override // com.applovin.shadow.okhttp3.internal.platform.Platform
    @SuppressLint({"NewApi"})
    public boolean isCleartextTrafficPermitted(String hostname) {
        n.f(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // com.applovin.shadow.okhttp3.internal.platform.Platform
    public X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) {
        Object next;
        n.f(sslSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.socketAdapters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((SocketAdapter) next).matchesSocketFactory(sslSocketFactory));
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            return socketAdapter.trustManager(sslSocketFactory);
        }
        return null;
    }
}
