package okhttp3;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.vungle.ads.internal.ui.AdActivity;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OkHttpClient.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u0094\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u000e\u0095\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128G¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188G¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8G¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8G¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u0017\u0010+\u001a\u00020'8G¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u00101\u001a\u00020,8G¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00107\u001a\u0002028G¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u00109\u001a\u00020,8G¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b-\u00100R\u0017\u0010;\u001a\u00020,8G¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b3\u00100R\u0017\u0010?\u001a\u00020<8G¢\u0006\f\n\u0004\b!\u0010=\u001a\u0004\b\u0013\u0010>R\u0019\u0010E\u001a\u0004\u0018\u00010@8G¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010I\u001a\u00020F8G¢\u0006\f\n\u0004\b%\u0010G\u001a\u0004\b$\u0010HR\u0019\u0010N\u001a\u0004\u0018\u00010J8G¢\u0006\f\n\u0004\b\u0010\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010T\u001a\u00020O8G¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010W\u001a\u0002028G¢\u0006\f\n\u0004\bU\u00104\u001a\u0004\bV\u00106R\u0017\u0010\\\u001a\u00020X8G¢\u0006\f\n\u0004\bL\u0010Y\u001a\u0004\bZ\u0010[R\u0016\u0010_\u001a\u0004\u0018\u00010]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010^R\u0019\u0010d\u001a\u0004\u0018\u00010`8G¢\u0006\f\n\u0004\bR\u0010a\u001a\u0004\bb\u0010cR\u001d\u0010h\u001a\b\u0012\u0004\u0012\u00020e0\u001e8G¢\u0006\f\n\u0004\bf\u0010 \u001a\u0004\bg\u0010\"R\u001d\u0010k\u001a\b\u0012\u0004\u0012\u00020i0\u001e8G¢\u0006\f\n\u0004\bj\u0010 \u001a\u0004\bU\u0010\"R\u0017\u0010o\u001a\u00020l8G¢\u0006\f\n\u0004\b/\u0010m\u001a\u0004\b:\u0010nR\u0017\u0010t\u001a\u00020p8G¢\u0006\f\n\u0004\bZ\u0010q\u001a\u0004\br\u0010sR\u0019\u0010z\u001a\u0004\u0018\u00010u8G¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u0017\u0010\u007f\u001a\u00020{8G¢\u0006\f\n\u0004\b\n\u0010|\u001a\u0004\b}\u0010~R\u001a\u0010\u0082\u0001\u001a\u00020{8G¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010|\u001a\u0005\b\u0081\u0001\u0010~R\u0018\u0010\u0083\u0001\u001a\u00020{8G¢\u0006\f\n\u0004\bb\u0010|\u001a\u0004\bj\u0010~R\u001a\u0010\u0085\u0001\u001a\u00020{8G¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010|\u001a\u0005\b\u0080\u0001\u0010~R\u0019\u0010\u0087\u0001\u001a\u00020{8G¢\u0006\r\n\u0005\b\u0086\u0001\u0010|\u001a\u0004\bP\u0010~R\u001c\u0010\u008c\u0001\u001a\u00030\u0088\u00018G¢\u0006\u000f\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0005\bA\u0010\u008b\u0001R\u001c\u0010\u0091\u0001\u001a\u00030\u008d\u00018\u0006¢\u0006\u000f\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0005\b8\u0010\u0090\u0001R\u0013\u0010\u0093\u0001\u001a\u00020]8G¢\u0006\u0007\u001a\u0005\bv\u0010\u0092\u0001¨\u0006\u0096\u0001"}, d2 = {"Lokhttp3/rotuma;", "", "Lokhttp3/marial$attabal;", "", "Lokhttp3/rotuma$attabal;", "builder", "<init>", "(Lokhttp3/rotuma$attabal;)V", "()V", "", "seminary", "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "Lokhttp3/marial;", "attabal", "(Lokhttp3/preprohormone;)Lokhttp3/marial;", "cuirassed", "()Lokhttp3/rotuma$attabal;", "Lokhttp3/kowloon;", "kowloon", "Lokhttp3/kowloon;", "monoploid", "()Lokhttp3/kowloon;", "dispatcher", "Lokhttp3/cutely;", "arytenoidectomy", "Lokhttp3/cutely;", "impassible", "()Lokhttp3/cutely;", "connectionPool", "", "Lokhttp3/adultoid;", "Ljava/util/List;", "rotuma", "()Ljava/util/List;", "interceptors", "polloi", "cord", "networkInterceptors", "Lokhttp3/monoploid$dern;", "molybdenite", "Lokhttp3/monoploid$dern;", "()Lokhttp3/monoploid$dern;", "eventListenerFactory", "", "graveside", "Z", "restrictive", "()Z", "retryOnConnectionFailure", "Lokhttp3/saneness;", "adultoid", "Lokhttp3/saneness;", "beachfront", "()Lokhttp3/saneness;", "authenticator", "dovishness", "followRedirects", "gintrap", "followSslRedirects", "Lokhttp3/impassible;", "Lokhttp3/impassible;", "()Lokhttp3/impassible;", "cookieJar", "Lokhttp3/dern;", "preprohormone", "Lokhttp3/dern;", "competently", "()Lokhttp3/dern;", "cache", "Lokhttp3/arytenoidectomy;", "Lokhttp3/arytenoidectomy;", "()Lokhttp3/arytenoidectomy;", "dns", "Ljava/net/Proxy;", "Ljava/net/Proxy;", "oilcan", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "stratoscope", "Ljava/net/ProxySelector;", "sealless", "()Ljava/net/ProxySelector;", "proxySelector", "trm", "yemenite", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "Ljavax/net/SocketFactory;", "merc", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "saran", "()Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Lokhttp3/apical;", "kattegat", "triweekly", "connectionSpecs", "Lokhttp3/Protocol;", "supplicat", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "Lokhttp3/CertificatePinner;", "apical", "()Lokhttp3/CertificatePinner;", "certificatePinner", "Lventriculoatrial/dern;", "polder", "Lventriculoatrial/dern;", "taiyuan", "()Lventriculoatrial/dern;", "certificateChainCleaner", "", "I", "impromptu", "()I", "callTimeoutMillis", "grimness", "formularize", "connectTimeoutMillis", "readTimeoutMillis", "privatdozent", "writeTimeoutMillis", "creditor", "pingIntervalMillis", "", "starveling", "J", "()J", "minWebSocketMessageToCompress", "Lokhttp3/internal/connection/competently;", "hydrovane", "Lokhttp3/internal/connection/competently;", "()Lokhttp3/internal/connection/competently;", "routeDatabase", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "walach", "saneness", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class rotuma implements Cloneable, marial.attabal {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public final saneness authenticator;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final cutely connectionPool;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final arytenoidectomy dns;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name and from kotlin metadata */
    public final int pingIntervalMillis;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public final Proxy proxy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public final boolean followRedirects;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public final boolean followSslRedirects;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final boolean retryOnConnectionFailure;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name and from kotlin metadata */
    public final int connectTimeoutMillis;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name and from kotlin metadata */
    public final okhttp3.internal.connection.competently routeDatabase;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public final List<apical> connectionSpecs;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final kowloon dispatcher;

    /* JADX INFO: renamed from: merc, reason: collision with root package name and from kotlin metadata */
    public final CertificatePinner certificatePinner;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final monoploid.dern eventListenerFactory;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final List<adultoid> interceptors;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public final SocketFactory socketFactory;

    /* JADX INFO: renamed from: polder, reason: collision with root package name and from kotlin metadata */
    public final ventriculoatrial.dern certificateChainCleaner;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final List<adultoid> networkInterceptors;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public final dern cache;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name and from kotlin metadata */
    public final int writeTimeoutMillis;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
    public final HostnameVerifier hostnameVerifier;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public final impassible cookieJar;

    /* JADX INFO: renamed from: saran, reason: collision with root package name and from kotlin metadata */
    public final int readTimeoutMillis;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public final X509TrustManager x509TrustManager;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name and from kotlin metadata */
    public final int callTimeoutMillis;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name and from kotlin metadata */
    public final long minWebSocketMessageToCompress;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final ProxySelector proxySelector;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    public final List<Protocol> protocols;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public final saneness proxyAuthenticator;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public final SSLSocketFactory sslSocketFactoryOrNull;

    /* JADX INFO: renamed from: walach, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public static final List<Protocol> f34625peridotite = hereditist.wireman.gintrap(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name */
    public static final List<apical> f34624mathsort = hereditist.wireman.gintrap(apical.f34127taiyuan, apical.f34121apical);

    /* JADX INFO: renamed from: okhttp3.rotuma$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: OkHttpClient.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lokhttp3/rotuma$saneness;", "", "<init>", "()V", "", "Lokhttp3/Protocol;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "saneness", "()Ljava/util/List;", "Lokhttp3/apical;", "DEFAULT_CONNECTION_SPECS", "attabal", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<apical> attabal() {
            return rotuma.f34624mathsort;
        }

        public final List<Protocol> saneness() {
            return rotuma.f34625peridotite;
        }

        public Companion() {
        }
    }

    public rotuma(attabal builder) {
        ProxySelector proxySelector;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.dispatcher = builder.getDispatcher();
        this.connectionPool = builder.getConnectionPool();
        this.interceptors = hereditist.wireman.peridotite(builder.cuirassed());
        this.networkInterceptors = hereditist.wireman.peridotite(builder.trm());
        this.eventListenerFactory = builder.getEventListenerFactory();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure();
        this.authenticator = builder.getAuthenticator();
        this.followRedirects = builder.getFollowRedirects();
        this.followSslRedirects = builder.getFollowSslRedirects();
        this.cookieJar = builder.getCookieJar();
        this.cache = builder.getCache();
        this.dns = builder.getDns();
        this.proxy = builder.getProxy();
        if (builder.getProxy() != null) {
            proxySelector = nesslerize.attabal.f33868attabal;
        } else {
            proxySelector = builder.getProxySelector();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = nesslerize.attabal.f33868attabal;
            }
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = builder.getProxyAuthenticator();
        this.socketFactory = builder.getSocketFactory();
        List<apical> listMolybdenite = builder.molybdenite();
        this.connectionSpecs = listMolybdenite;
        this.protocols = builder.yemenite();
        this.hostnameVerifier = builder.getHostnameVerifier();
        this.callTimeoutMillis = builder.getCallTimeout();
        this.connectTimeoutMillis = builder.getConnectTimeout();
        this.readTimeoutMillis = builder.getReadTimeout();
        this.writeTimeoutMillis = builder.getWriteTimeout();
        this.pingIntervalMillis = builder.getPingInterval();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress();
        okhttp3.internal.connection.competently routeDatabase = builder.getRouteDatabase();
        this.routeDatabase = routeDatabase == null ? new okhttp3.internal.connection.competently() : routeDatabase;
        List<apical> list = listMolybdenite;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.f34107wireman;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((apical) it.next()).getIsTls()) {
                    if (builder.getSslSocketFactoryOrNull() != null) {
                        this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull();
                        ventriculoatrial.dern certificateChainCleaner = builder.getCertificateChainCleaner();
                        Intrinsics.beachfront(certificateChainCleaner);
                        this.certificateChainCleaner = certificateChainCleaner;
                        X509TrustManager x509TrustManagerOrNull = builder.getX509TrustManagerOrNull();
                        Intrinsics.beachfront(x509TrustManagerOrNull);
                        this.x509TrustManager = x509TrustManagerOrNull;
                        CertificatePinner certificatePinner = builder.getCertificatePinner();
                        Intrinsics.beachfront(certificateChainCleaner);
                        this.certificatePinner = certificatePinner.marial(certificateChainCleaner);
                    } else {
                        elusion.impromptu.Companion attabalVar = elusion.impromptu.INSTANCE;
                        X509TrustManager x509TrustManagerArytenoidectomy = attabalVar.competently().arytenoidectomy();
                        this.x509TrustManager = x509TrustManagerArytenoidectomy;
                        elusion.impromptu impromptuVarCompetently = attabalVar.competently();
                        Intrinsics.beachfront(x509TrustManagerArytenoidectomy);
                        this.sslSocketFactoryOrNull = impromptuVarCompetently.kowloon(x509TrustManagerArytenoidectomy);
                        ventriculoatrial.dern.Companion attabalVar2 = ventriculoatrial.dern.INSTANCE;
                        Intrinsics.beachfront(x509TrustManagerArytenoidectomy);
                        ventriculoatrial.dern dernVarAttabal = attabalVar2.attabal(x509TrustManagerArytenoidectomy);
                        this.certificateChainCleaner = dernVarAttabal;
                        CertificatePinner certificatePinner2 = builder.getCertificatePinner();
                        Intrinsics.beachfront(dernVarAttabal);
                        this.certificatePinner = certificatePinner2.marial(dernVarAttabal);
                    }
                }
            }
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.f34107wireman;
        }
        seminary();
    }

    /* JADX INFO: renamed from: adultoid, reason: from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    /* JADX INFO: renamed from: apical, reason: from getter */
    public final CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    @Override // okhttp3.marial.attabal
    public marial attabal(preprohormone request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new okhttp3.internal.connection.marial(this, request, false);
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final saneness getAuthenticator() {
        return this.authenticator;
    }

    public Object clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final dern getCache() {
        return this.cache;
    }

    public final List<adultoid> cord() {
        return this.networkInterceptors;
    }

    public attabal cuirassed() {
        return new attabal(this);
    }

    /* JADX INFO: renamed from: dovishness, reason: from getter */
    public final okhttp3.internal.connection.competently getRouteDatabase() {
        return this.routeDatabase;
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    /* JADX INFO: renamed from: gintrap, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    /* JADX INFO: renamed from: graveside, reason: from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    /* JADX INFO: renamed from: grimness, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    /* JADX INFO: renamed from: impassible, reason: from getter */
    public final cutely getConnectionPool() {
        return this.connectionPool;
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    /* JADX INFO: renamed from: kowloon, reason: from getter */
    public final impassible getCookieJar() {
        return this.cookieJar;
    }

    /* JADX INFO: renamed from: merc, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    /* JADX INFO: renamed from: molybdenite, reason: from getter */
    public final monoploid.dern getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    /* JADX INFO: renamed from: monoploid, reason: from getter */
    public final kowloon getDispatcher() {
        return this.dispatcher;
    }

    /* JADX INFO: renamed from: oilcan, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    public final SSLSocketFactory polder() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* JADX INFO: renamed from: polloi, reason: from getter */
    public final arytenoidectomy getDns() {
        return this.dns;
    }

    /* JADX INFO: renamed from: preprohormone, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    /* JADX INFO: renamed from: restrictive, reason: from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public final List<adultoid> rotuma() {
        return this.interceptors;
    }

    /* JADX INFO: renamed from: saran, reason: from getter */
    public final X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    /* JADX INFO: renamed from: sealless, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    public final void seminary() {
        if (this.interceptors.contains(null)) {
            throw new IllegalStateException(Intrinsics.arytenoidectomy("Null interceptor: ", rotuma()).toString());
        }
        if (this.networkInterceptors.contains(null)) {
            throw new IllegalStateException(Intrinsics.arytenoidectomy("Null network interceptor: ", cord()).toString());
        }
        List<apical> list = this.connectionSpecs;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((apical) it.next()).getIsTls()) {
                    if (this.sslSocketFactoryOrNull == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.certificateChainCleaner == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.sslSocketFactoryOrNull != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.certificateChainCleaner != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.wireman(this.certificatePinner, CertificatePinner.f34107wireman)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: stratoscope, reason: from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    /* JADX INFO: renamed from: supplicat, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final ventriculoatrial.dern getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final List<apical> triweekly() {
        return this.connectionSpecs;
    }

    public final List<Protocol> trm() {
        return this.protocols;
    }

    /* JADX INFO: renamed from: yemenite, reason: from getter */
    public final saneness getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    /* JADX INFO: compiled from: OkHttpClient.kt */
    @Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u001b\u0010+\u001a\u00020\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\u0004\b+\u0010,J\u001d\u00101\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u001d\u00103\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b3\u00102J\u001d\u00104\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b4\u00102J\u001d\u00105\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b5\u00102J\r\u00106\u001a\u00020\u0004¢\u0006\u0004\b6\u00107R\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR \u0010F\u001a\b\u0012\u0004\u0012\u00020\u000f0B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u0010C\u001a\u0004\bD\u0010ER \u0010H\u001a\b\u0012\u0004\u0012\u00020\u000f0B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010C\u001a\u0004\bG\u0010ER\"\u0010O\u001a\u00020I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010[\u001a\u00020U8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010\u0018\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010P\u001a\u0004\b\\\u0010R\"\u0004\b]\u0010TR\"\u0010`\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010P\u001a\u0004\b^\u0010R\"\u0004\b_\u0010TR\"\u0010g\u001a\u00020a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010!\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010x\u001a\u0004\u0018\u00010r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bi\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR$\u0010%\u001a\u0004\u0018\u00010$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R%\u0010\u0082\u0001\u001a\u00020U8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010V\u001a\u0005\b\u0080\u0001\u0010X\"\u0005\b\u0081\u0001\u0010ZR*\u0010\u008a\u0001\u001a\u00030\u0083\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R,\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R+\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b>\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R.\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u009a\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u009b\u0001\u0010C\u001a\u0005\b\u009b\u0001\u0010E\"\u0006\b\u009c\u0001\u0010\u009d\u0001R+\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bc\u0010C\u001a\u0005\b\u009f\u0001\u0010E\"\u0006\b \u0001\u0010\u009d\u0001R)\u0010§\u0001\u001a\u00030¡\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b9\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R)\u0010\u00ad\u0001\u001a\u00030¨\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bn\u0010©\u0001\u001a\u0006\b\u0084\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R*\u0010³\u0001\u001a\u0005\u0018\u00010®\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bK\u0010¯\u0001\u001a\u0005\b\u007f\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R(\u0010¹\u0001\u001a\u00030´\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\\\u0010µ\u0001\u001a\u0005\by\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R)\u0010»\u0001\u001a\u00030´\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b^\u0010µ\u0001\u001a\u0006\b\u008c\u0001\u0010¶\u0001\"\u0006\bº\u0001\u0010¸\u0001R*\u0010¾\u0001\u001a\u00030´\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010µ\u0001\u001a\u0006\b¼\u0001\u0010¶\u0001\"\u0006\b½\u0001\u0010¸\u0001R)\u0010Á\u0001\u001a\u00030´\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bD\u0010µ\u0001\u001a\u0006\b¿\u0001\u0010¶\u0001\"\u0006\bÀ\u0001\u0010¸\u0001R*\u0010Å\u0001\u001a\u00030´\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÂ\u0001\u0010µ\u0001\u001a\u0006\bÃ\u0001\u0010¶\u0001\"\u0006\bÄ\u0001\u0010¸\u0001R(\u0010Ê\u0001\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bG\u0010Æ\u0001\u001a\u0006\bÂ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R,\u0010Ñ\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÃ\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001¨\u0006Ò\u0001"}, d2 = {"Lokhttp3/rotuma$attabal;", "", "<init>", "()V", "Lokhttp3/rotuma;", "okHttpClient", "(Lokhttp3/rotuma;)V", "Lokhttp3/kowloon;", "dispatcher", "impromptu", "(Lokhttp3/kowloon;)Lokhttp3/rotuma$attabal;", "Lokhttp3/cutely;", "connectionPool", "competently", "(Lokhttp3/cutely;)Lokhttp3/rotuma$attabal;", "Lokhttp3/adultoid;", "interceptor", "attabal", "(Lokhttp3/adultoid;)Lokhttp3/rotuma$attabal;", "saneness", "", "retryOnConnectionFailure", "walach", "(Z)Lokhttp3/rotuma$attabal;", "followRedirects", "cutely", "followProtocolRedirects", "apical", "Lokhttp3/dern;", "cache", "wireman", "(Lokhttp3/dern;)Lokhttp3/rotuma$attabal;", "Lokhttp3/arytenoidectomy;", "dns", "taiyuan", "(Lokhttp3/arytenoidectomy;)Lokhttp3/rotuma$attabal;", "Ljava/net/ProxySelector;", "proxySelector", "starveling", "(Ljava/net/ProxySelector;)Lokhttp3/rotuma$attabal;", "", "Lokhttp3/Protocol;", "protocols", "creditor", "(Ljava/util/List;)Lokhttp3/rotuma$attabal;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "marial", "(JLjava/util/concurrent/TimeUnit;)Lokhttp3/rotuma$attabal;", "beachfront", "hydrovane", "lerp", "dern", "()Lokhttp3/rotuma;", "Lokhttp3/kowloon;", "adultoid", "()Lokhttp3/kowloon;", "clubfoot", "(Lokhttp3/kowloon;)V", "Lokhttp3/cutely;", "polloi", "()Lokhttp3/cutely;", "overspeculate", "(Lokhttp3/cutely;)V", "", "Ljava/util/List;", "cuirassed", "()Ljava/util/List;", "interceptors", "trm", "networkInterceptors", "Lokhttp3/monoploid$dern;", "Lokhttp3/monoploid$dern;", "gintrap", "()Lokhttp3/monoploid$dern;", "setEventListenerFactory$okhttp", "(Lokhttp3/monoploid$dern;)V", "eventListenerFactory", "Z", "merc", "()Z", "treadless", "(Z)V", "Lokhttp3/saneness;", "Lokhttp3/saneness;", "formularize", "()Lokhttp3/saneness;", "setAuthenticator$okhttp", "(Lokhttp3/saneness;)V", "authenticator", "rotuma", "permissivist", "preprohormone", "cultivated", "followSslRedirects", "Lokhttp3/impassible;", "Lokhttp3/impassible;", "graveside", "()Lokhttp3/impassible;", "setCookieJar$okhttp", "(Lokhttp3/impassible;)V", "cookieJar", "Lokhttp3/dern;", "impassible", "()Lokhttp3/dern;", "peridotite", "(Lokhttp3/dern;)V", "Lokhttp3/arytenoidectomy;", "dovishness", "()Lokhttp3/arytenoidectomy;", "dent", "(Lokhttp3/arytenoidectomy;)V", "Ljava/net/Proxy;", "Ljava/net/Proxy;", "sealless", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "proxy", "triweekly", "Ljava/net/ProxySelector;", "supplicat", "()Ljava/net/ProxySelector;", "timberyard", "(Ljava/net/ProxySelector;)V", "kowloon", "kattegat", "setProxyAuthenticator$okhttp", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "arytenoidectomy", "Ljavax/net/SocketFactory;", "seminary", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "monoploid", "Ljavax/net/ssl/SSLSocketFactory;", "grimness", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "privatdozent", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", "Lokhttp3/apical;", "molybdenite", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "connectionSpecs", "yemenite", "premeiotic", "Ljavax/net/ssl/HostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "cord", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "Lokhttp3/CertificatePinner;", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp", "(Lokhttp3/CertificatePinner;)V", "certificatePinner", "Lventriculoatrial/dern;", "Lventriculoatrial/dern;", "()Lventriculoatrial/dern;", "setCertificateChainCleaner$okhttp", "(Lventriculoatrial/dern;)V", "certificateChainCleaner", "", "I", "()I", "mathsort", "(I)V", "callTimeout", "splinterproof", "connectTimeout", "restrictive", "milliradian", "readTimeout", "saran", "coffeecake", "writeTimeout", "stratoscope", "oilcan", "setPingInterval$okhttp", "pingInterval", "J", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "minWebSocketMessageToCompress", "Lokhttp3/internal/connection/competently;", "Lokhttp3/internal/connection/competently;", "polder", "()Lokhttp3/internal/connection/competently;", "itchy", "(Lokhttp3/internal/connection/competently;)V", "routeDatabase", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
        public HostnameVerifier hostnameVerifier;

        /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
        public dern cache;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public SocketFactory socketFactory;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public kowloon dispatcher;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public boolean retryOnConnectionFailure;

        /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
        public saneness authenticator;

        /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
        public int readTimeout;

        /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
        public int writeTimeout;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
        public impassible cookieJar;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final List<adultoid> interceptors;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
        public CertificatePinner certificatePinner;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
        public arytenoidectomy dns;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
        public ventriculoatrial.dern certificateChainCleaner;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
        public List<? extends Protocol> protocols;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
        public Proxy proxy;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
        public boolean followRedirects;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public saneness proxyAuthenticator;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public monoploid.dern eventListenerFactory;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
        public List<apical> connectionSpecs;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public SSLSocketFactory sslSocketFactoryOrNull;

        /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
        public okhttp3.internal.connection.competently routeDatabase;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public X509TrustManager x509TrustManagerOrNull;

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
        public int connectTimeout;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
        public int callTimeout;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public cutely connectionPool;

        /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
        public int pingInterval;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
        public boolean followSslRedirects;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
        public ProxySelector proxySelector;

        /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
        public long minWebSocketMessageToCompress;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public final List<adultoid> networkInterceptors;

        public attabal() {
            this.dispatcher = new kowloon();
            this.connectionPool = new cutely();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = hereditist.wireman.competently(monoploid.f34605saneness);
            this.retryOnConnectionFailure = true;
            saneness sanenessVar = saneness.f34689saneness;
            this.authenticator = sanenessVar;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = impassible.f34282saneness;
            this.dns = arytenoidectomy.f34137saneness;
            this.proxyAuthenticator = sanenessVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.socketFactory = socketFactory;
            Companion companion = rotuma.INSTANCE;
            this.connectionSpecs = companion.attabal();
            this.protocols = companion.saneness();
            this.hostnameVerifier = ventriculoatrial.wireman.f39332kowloon;
            this.certificatePinner = CertificatePinner.f34107wireman;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }

        /* JADX INFO: renamed from: adultoid, reason: from getter */
        public final kowloon getDispatcher() {
            return this.dispatcher;
        }

        public final attabal apical(boolean followProtocolRedirects) {
            cultivated(followProtocolRedirects);
            return this;
        }

        /* JADX INFO: renamed from: arytenoidectomy, reason: from getter */
        public final CertificatePinner getCertificatePinner() {
            return this.certificatePinner;
        }

        public final attabal attabal(adultoid interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            cuirassed().add(interceptor);
            return this;
        }

        public final attabal beachfront(long timeout, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            splinterproof(hereditist.wireman.apical("timeout", timeout, unit));
            return this;
        }

        public final void clubfoot(kowloon kowloonVar) {
            Intrinsics.checkNotNullParameter(kowloonVar, "<set-?>");
            this.dispatcher = kowloonVar;
        }

        public final void coffeecake(int i) {
            this.writeTimeout = i;
        }

        public final attabal competently(cutely connectionPool) {
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            overspeculate(connectionPool);
            return this;
        }

        /* JADX INFO: renamed from: cord, reason: from getter */
        public final HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        public final attabal creditor(List<? extends Protocol> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            List listBasify = CollectionsKt.basify(protocols);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!listBasify.contains(protocol) && !listBasify.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException(Intrinsics.arytenoidectomy("protocols must contain h2_prior_knowledge or http/1.1: ", listBasify).toString());
            }
            if (listBasify.contains(protocol) && listBasify.size() > 1) {
                throw new IllegalArgumentException(Intrinsics.arytenoidectomy("protocols containing h2_prior_knowledge cannot use other protocols: ", listBasify).toString());
            }
            if (listBasify.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException(Intrinsics.arytenoidectomy("protocols must not contain http/1.0: ", listBasify).toString());
            }
            if (listBasify.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            listBasify.remove(Protocol.SPDY_3);
            if (!Intrinsics.wireman(listBasify, yemenite())) {
                itchy(null);
            }
            List<? extends Protocol> listUnmodifiableList = Collections.unmodifiableList(listBasify);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            premeiotic(listUnmodifiableList);
            return this;
        }

        public final List<adultoid> cuirassed() {
            return this.interceptors;
        }

        public final void cultivated(boolean z) {
            this.followSslRedirects = z;
        }

        public final attabal cutely(boolean followRedirects) {
            permissivist(followRedirects);
            return this;
        }

        public final void dent(arytenoidectomy arytenoidectomyVar) {
            Intrinsics.checkNotNullParameter(arytenoidectomyVar, "<set-?>");
            this.dns = arytenoidectomyVar;
        }

        public final rotuma dern() {
            return new rotuma(this);
        }

        /* JADX INFO: renamed from: dovishness, reason: from getter */
        public final arytenoidectomy getDns() {
            return this.dns;
        }

        /* JADX INFO: renamed from: formularize, reason: from getter */
        public final saneness getAuthenticator() {
            return this.authenticator;
        }

        /* JADX INFO: renamed from: gintrap, reason: from getter */
        public final monoploid.dern getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        /* JADX INFO: renamed from: graveside, reason: from getter */
        public final impassible getCookieJar() {
            return this.cookieJar;
        }

        /* JADX INFO: renamed from: grimness, reason: from getter */
        public final SSLSocketFactory getSslSocketFactoryOrNull() {
            return this.sslSocketFactoryOrNull;
        }

        public final attabal hydrovane(long timeout, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            milliradian(hereditist.wireman.apical("timeout", timeout, unit));
            return this;
        }

        /* JADX INFO: renamed from: impassible, reason: from getter */
        public final dern getCache() {
            return this.cache;
        }

        public final attabal impromptu(kowloon dispatcher) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            clubfoot(dispatcher);
            return this;
        }

        public final void itchy(okhttp3.internal.connection.competently competentlyVar) {
            this.routeDatabase = competentlyVar;
        }

        /* JADX INFO: renamed from: kattegat, reason: from getter */
        public final saneness getProxyAuthenticator() {
            return this.proxyAuthenticator;
        }

        /* JADX INFO: renamed from: kowloon, reason: from getter */
        public final ventriculoatrial.dern getCertificateChainCleaner() {
            return this.certificateChainCleaner;
        }

        public final attabal lerp(long timeout, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            coffeecake(hereditist.wireman.apical("timeout", timeout, unit));
            return this;
        }

        public final attabal marial(long timeout, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            mathsort(hereditist.wireman.apical("timeout", timeout, unit));
            return this;
        }

        public final void mathsort(int i) {
            this.callTimeout = i;
        }

        /* JADX INFO: renamed from: merc, reason: from getter */
        public final boolean getRetryOnConnectionFailure() {
            return this.retryOnConnectionFailure;
        }

        public final void milliradian(int i) {
            this.readTimeout = i;
        }

        public final List<apical> molybdenite() {
            return this.connectionSpecs;
        }

        /* JADX INFO: renamed from: monoploid, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        /* JADX INFO: renamed from: oilcan, reason: from getter */
        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final void overspeculate(cutely cutelyVar) {
            Intrinsics.checkNotNullParameter(cutelyVar, "<set-?>");
            this.connectionPool = cutelyVar;
        }

        public final void peridotite(dern dernVar) {
            this.cache = dernVar;
        }

        public final void permissivist(boolean z) {
            this.followRedirects = z;
        }

        /* JADX INFO: renamed from: polder, reason: from getter */
        public final okhttp3.internal.connection.competently getRouteDatabase() {
            return this.routeDatabase;
        }

        /* JADX INFO: renamed from: polloi, reason: from getter */
        public final cutely getConnectionPool() {
            return this.connectionPool;
        }

        public final void premeiotic(List<? extends Protocol> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.protocols = list;
        }

        /* JADX INFO: renamed from: preprohormone, reason: from getter */
        public final boolean getFollowSslRedirects() {
            return this.followSslRedirects;
        }

        /* JADX INFO: renamed from: privatdozent, reason: from getter */
        public final X509TrustManager getX509TrustManagerOrNull() {
            return this.x509TrustManagerOrNull;
        }

        /* JADX INFO: renamed from: restrictive, reason: from getter */
        public final int getReadTimeout() {
            return this.readTimeout;
        }

        /* JADX INFO: renamed from: rotuma, reason: from getter */
        public final boolean getFollowRedirects() {
            return this.followRedirects;
        }

        public final attabal saneness(adultoid interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            trm().add(interceptor);
            return this;
        }

        /* JADX INFO: renamed from: saran, reason: from getter */
        public final int getWriteTimeout() {
            return this.writeTimeout;
        }

        /* JADX INFO: renamed from: sealless, reason: from getter */
        public final Proxy getProxy() {
            return this.proxy;
        }

        /* JADX INFO: renamed from: seminary, reason: from getter */
        public final SocketFactory getSocketFactory() {
            return this.socketFactory;
        }

        public final void splinterproof(int i) {
            this.connectTimeout = i;
        }

        public final attabal starveling(ProxySelector proxySelector) {
            Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
            if (!Intrinsics.wireman(proxySelector, getProxySelector())) {
                itchy(null);
            }
            timberyard(proxySelector);
            return this;
        }

        /* JADX INFO: renamed from: stratoscope, reason: from getter */
        public final long getMinWebSocketMessageToCompress() {
            return this.minWebSocketMessageToCompress;
        }

        /* JADX INFO: renamed from: supplicat, reason: from getter */
        public final ProxySelector getProxySelector() {
            return this.proxySelector;
        }

        public final attabal taiyuan(arytenoidectomy dns) {
            Intrinsics.checkNotNullParameter(dns, "dns");
            if (!Intrinsics.wireman(dns, getDns())) {
                itchy(null);
            }
            dent(dns);
            return this;
        }

        public final void timberyard(ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        public final void treadless(boolean z) {
            this.retryOnConnectionFailure = z;
        }

        /* JADX INFO: renamed from: triweekly, reason: from getter */
        public final int getCallTimeout() {
            return this.callTimeout;
        }

        public final List<adultoid> trm() {
            return this.networkInterceptors;
        }

        public final attabal walach(boolean retryOnConnectionFailure) {
            treadless(retryOnConnectionFailure);
            return this;
        }

        public final attabal wireman(dern cache) {
            peridotite(cache);
            return this;
        }

        public final List<Protocol> yemenite() {
            return this.protocols;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public attabal(rotuma okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.getDispatcher();
            this.connectionPool = okHttpClient.getConnectionPool();
            p002kotlin.collections.cord.stratoscope(this.interceptors, okHttpClient.rotuma());
            p002kotlin.collections.cord.stratoscope(this.networkInterceptors, okHttpClient.cord());
            this.eventListenerFactory = okHttpClient.getEventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.getRetryOnConnectionFailure();
            this.authenticator = okHttpClient.getAuthenticator();
            this.followRedirects = okHttpClient.getFollowRedirects();
            this.followSslRedirects = okHttpClient.getFollowSslRedirects();
            this.cookieJar = okHttpClient.getCookieJar();
            this.cache = okHttpClient.getCache();
            this.dns = okHttpClient.getDns();
            this.proxy = okHttpClient.getProxy();
            this.proxySelector = okHttpClient.getProxySelector();
            this.proxyAuthenticator = okHttpClient.getProxyAuthenticator();
            this.socketFactory = okHttpClient.getSocketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.getX509TrustManager();
            this.connectionSpecs = okHttpClient.triweekly();
            this.protocols = okHttpClient.trm();
            this.hostnameVerifier = okHttpClient.getHostnameVerifier();
            this.certificatePinner = okHttpClient.getCertificatePinner();
            this.certificateChainCleaner = okHttpClient.getCertificateChainCleaner();
            this.callTimeout = okHttpClient.getCallTimeoutMillis();
            this.connectTimeout = okHttpClient.getConnectTimeoutMillis();
            this.readTimeout = okHttpClient.getReadTimeoutMillis();
            this.writeTimeout = okHttpClient.getWriteTimeoutMillis();
            this.pingInterval = okHttpClient.getPingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.getMinWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }
    }

    public rotuma() {
        this(new attabal());
    }
}
