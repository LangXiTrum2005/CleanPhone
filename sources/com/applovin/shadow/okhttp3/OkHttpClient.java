package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.concurrent.TaskRunner;
import com.applovin.shadow.okhttp3.internal.connection.RealCall;
import com.applovin.shadow.okhttp3.internal.connection.RouteDatabase;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import com.applovin.shadow.okhttp3.internal.proxy.NullProxySelector;
import com.applovin.shadow.okhttp3.internal.tls.CertificateChainCleaner;
import com.applovin.shadow.okhttp3.internal.tls.OkHostnameVerifier;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import jk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import xj.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u0096\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0097\u0001\u0096\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007¢\u0006\u0004\b\"\u0010 J\u000f\u0010'\u001a\u00020$H\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010+\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010/\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u000f\u00101\u001a\u00020(H\u0007¢\u0006\u0004\b0\u0010*J\u000f\u00103\u001a\u00020(H\u0007¢\u0006\u0004\b2\u0010*J\u000f\u00107\u001a\u000204H\u0007¢\u0006\u0004\b5\u00106J\u0011\u0010;\u001a\u0004\u0018\u000108H\u0007¢\u0006\u0004\b9\u0010:J\u000f\u0010?\u001a\u00020<H\u0007¢\u0006\u0004\b=\u0010>J\u0011\u0010C\u001a\u0004\u0018\u00010@H\u0007¢\u0006\u0004\bA\u0010BJ\u000f\u0010G\u001a\u00020DH\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010I\u001a\u00020,H\u0007¢\u0006\u0004\bH\u0010.J\u000f\u0010M\u001a\u00020JH\u0007¢\u0006\u0004\bK\u0010LJ\u000f\u0010Q\u001a\u00020NH\u0007¢\u0006\u0004\bO\u0010PJ\u0015\u0010T\u001a\b\u0012\u0004\u0012\u00020R0\u001dH\u0007¢\u0006\u0004\bS\u0010 J\u0015\u0010W\u001a\b\u0012\u0004\u0012\u00020U0\u001dH\u0007¢\u0006\u0004\bV\u0010 J\u000f\u0010[\u001a\u00020XH\u0007¢\u0006\u0004\bY\u0010ZJ\u000f\u0010_\u001a\u00020\\H\u0007¢\u0006\u0004\b]\u0010^J\u000f\u0010c\u001a\u00020`H\u0007¢\u0006\u0004\ba\u0010bJ\u000f\u0010e\u001a\u00020`H\u0007¢\u0006\u0004\bd\u0010bJ\u000f\u0010g\u001a\u00020`H\u0007¢\u0006\u0004\bf\u0010bJ\u000f\u0010i\u001a\u00020`H\u0007¢\u0006\u0004\bh\u0010bJ\u000f\u0010k\u001a\u00020`H\u0007¢\u0006\u0004\bj\u0010bJ\u000f\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\bm\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00158G¢\u0006\f\n\u0004\b\u0018\u0010n\u001a\u0004\b\u0018\u0010oR\u0017\u0010\u001c\u001a\u00020\u00198G¢\u0006\f\n\u0004\b\u001c\u0010p\u001a\u0004\b\u001c\u0010qR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8G¢\u0006\f\n\u0004\b!\u0010r\u001a\u0004\b!\u0010 R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8G¢\u0006\f\n\u0004\b#\u0010r\u001a\u0004\b#\u0010 R\u0017\u0010'\u001a\u00020$8G¢\u0006\f\n\u0004\b'\u0010s\u001a\u0004\b'\u0010tR\u0017\u0010+\u001a\u00020(8G¢\u0006\f\n\u0004\b+\u0010u\u001a\u0004\b+\u0010*R\u0017\u0010/\u001a\u00020,8G¢\u0006\f\n\u0004\b/\u0010v\u001a\u0004\b/\u0010wR\u0017\u00101\u001a\u00020(8G¢\u0006\f\n\u0004\b1\u0010u\u001a\u0004\b1\u0010*R\u0017\u00103\u001a\u00020(8G¢\u0006\f\n\u0004\b3\u0010u\u001a\u0004\b3\u0010*R\u0017\u00107\u001a\u0002048G¢\u0006\f\n\u0004\b7\u0010x\u001a\u0004\b7\u0010wR\u0019\u0010;\u001a\u0004\u0018\u0001088G¢\u0006\f\n\u0004\b;\u0010y\u001a\u0004\b;\u0010zR\u0017\u0010?\u001a\u00020<8G¢\u0006\f\n\u0004\b?\u0010{\u001a\u0004\b?\u0010wR\u0019\u0010C\u001a\u0004\u0018\u00010@8G¢\u0006\f\n\u0004\bC\u0010|\u001a\u0004\bC\u0010BR\u0017\u0010G\u001a\u00020D8G¢\u0006\f\n\u0004\bG\u0010}\u001a\u0004\bG\u0010FR\u0017\u0010I\u001a\u00020,8G¢\u0006\f\n\u0004\bI\u0010v\u001a\u0004\bI\u0010wR\u0017\u0010M\u001a\u00020J8G¢\u0006\f\n\u0004\bM\u0010~\u001a\u0004\bM\u0010LR\u0017\u0010\u007f\u001a\u0004\u0018\u00010N8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001f\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018G¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0082\u0001\u0010\u0084\u0001R\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020R0\u001d8G¢\u0006\f\n\u0004\bT\u0010r\u001a\u0004\bT\u0010 R\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020U0\u001d8G¢\u0006\f\n\u0004\bW\u0010r\u001a\u0004\bW\u0010 R\u0018\u0010[\u001a\u00020X8G¢\u0006\r\n\u0005\b[\u0010\u0085\u0001\u001a\u0004\b[\u0010ZR\u0019\u0010_\u001a\u00020\\8G¢\u0006\u000e\n\u0005\b_\u0010\u0086\u0001\u001a\u0005\b_\u0010\u0087\u0001R\u001f\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018G¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u0089\u0001\u0010\u008b\u0001R\u0018\u0010c\u001a\u00020`8G¢\u0006\r\n\u0005\bc\u0010\u008c\u0001\u001a\u0004\bc\u0010bR\u0018\u0010e\u001a\u00020`8G¢\u0006\r\n\u0005\be\u0010\u008c\u0001\u001a\u0004\be\u0010bR\u0018\u0010g\u001a\u00020`8G¢\u0006\r\n\u0005\bg\u0010\u008c\u0001\u001a\u0004\bg\u0010bR\u0018\u0010i\u001a\u00020`8G¢\u0006\r\n\u0005\bi\u0010\u008c\u0001\u001a\u0004\bi\u0010bR\u0018\u0010k\u001a\u00020`8G¢\u0006\r\n\u0005\bk\u0010\u008c\u0001\u001a\u0004\bk\u0010bR\u001d\u0010\u008e\u0001\u001a\u00030\u008d\u00018G¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u008e\u0001\u0010\u0090\u0001R\u001d\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0006¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0011\u0010Q\u001a\u00020N8G¢\u0006\u0006\u001a\u0004\bQ\u0010P¨\u0006\u0098\u0001"}, d2 = {"Lcom/applovin/shadow/okhttp3/OkHttpClient;", "", "Lcom/applovin/shadow/okhttp3/Call$Factory;", "Lcom/applovin/shadow/okhttp3/WebSocket$Factory;", "Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "builder", "<init>", "(Lxn/p;)V", "()V", "Lcom/applovin/shadow/okhttp3/Request;", "request", "Lcom/applovin/shadow/okhttp3/Call;", "newCall", "(Lcom/applovin/shadow/okhttp3/Request;)Lcom/applovin/shadow/okhttp3/Call;", "Lcom/applovin/shadow/okhttp3/WebSocketListener;", "listener", "Lcom/applovin/shadow/okhttp3/WebSocket;", "newWebSocket", "(Lcom/applovin/shadow/okhttp3/Request;Lcom/applovin/shadow/okhttp3/WebSocketListener;)Lcom/applovin/shadow/okhttp3/WebSocket;", "newBuilder", "()Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Lcom/applovin/shadow/okhttp3/Dispatcher;", "-deprecated_dispatcher", "()Lcom/applovin/shadow/okhttp3/Dispatcher;", "dispatcher", "Lcom/applovin/shadow/okhttp3/ConnectionPool;", "-deprecated_connectionPool", "()Lcom/applovin/shadow/okhttp3/ConnectionPool;", "connectionPool", "", "Lcom/applovin/shadow/okhttp3/Interceptor;", "-deprecated_interceptors", "()Ljava/util/List;", "interceptors", "-deprecated_networkInterceptors", "networkInterceptors", "Lcom/applovin/shadow/okhttp3/EventListener$Factory;", "-deprecated_eventListenerFactory", "()Lcom/applovin/shadow/okhttp3/EventListener$Factory;", "eventListenerFactory", "", "-deprecated_retryOnConnectionFailure", "()Z", "retryOnConnectionFailure", "Lcom/applovin/shadow/okhttp3/Authenticator;", "-deprecated_authenticator", "()Lcom/applovin/shadow/okhttp3/Authenticator;", "authenticator", "-deprecated_followRedirects", "followRedirects", "-deprecated_followSslRedirects", "followSslRedirects", "Lcom/applovin/shadow/okhttp3/CookieJar;", "-deprecated_cookieJar", "()Lcom/applovin/shadow/okhttp3/CookieJar;", "cookieJar", "Lcom/applovin/shadow/okhttp3/Cache;", "-deprecated_cache", "()Lcom/applovin/shadow/okhttp3/Cache;", "cache", "Lcom/applovin/shadow/okhttp3/Dns;", "-deprecated_dns", "()Lcom/applovin/shadow/okhttp3/Dns;", "dns", "Ljava/net/Proxy;", "-deprecated_proxy", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "-deprecated_proxySelector", "()Ljava/net/ProxySelector;", "proxySelector", "-deprecated_proxyAuthenticator", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "-deprecated_socketFactory", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "-deprecated_sslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Lcom/applovin/shadow/okhttp3/ConnectionSpec;", "-deprecated_connectionSpecs", "connectionSpecs", "Lcom/applovin/shadow/okhttp3/Protocol;", "-deprecated_protocols", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "-deprecated_hostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lcom/applovin/shadow/okhttp3/CertificatePinner;", "-deprecated_certificatePinner", "()Lcom/applovin/shadow/okhttp3/CertificatePinner;", "certificatePinner", "", "-deprecated_callTimeoutMillis", "()I", "callTimeoutMillis", "-deprecated_connectTimeoutMillis", "connectTimeoutMillis", "-deprecated_readTimeoutMillis", "readTimeoutMillis", "-deprecated_writeTimeoutMillis", "writeTimeoutMillis", "-deprecated_pingIntervalMillis", "pingIntervalMillis", "Lwj/r;", "verifyClientState", "Lcom/applovin/shadow/okhttp3/Dispatcher;", "()Lzc/u;", "Lcom/applovin/shadow/okhttp3/ConnectionPool;", "()Lqj/x;", "Ljava/util/List;", "Lcom/applovin/shadow/okhttp3/EventListener$Factory;", "()Lxa/b;", "Z", "Lcom/applovin/shadow/okhttp3/Authenticator;", "()Lxn/b;", "Lcom/applovin/shadow/okhttp3/CookieJar;", "Lcom/applovin/shadow/okhttp3/Cache;", "()Ljava/lang/Object;", "Lcom/applovin/shadow/okhttp3/Dns;", "Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "Ljavax/net/SocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/HostnameVerifier;", "Lcom/applovin/shadow/okhttp3/CertificatePinner;", "()Lxn/f;", "Lcom/applovin/shadow/okhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lcom/applovin/shadow/okhttp3/internal/tls/CertificateChainCleaner;", "()Lcom/google/android/gms/internal/auth/i;", "I", "", "minWebSocketMessageToCompress", "J", "()J", "Lcom/applovin/shadow/okhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lcom/applovin/shadow/okhttp3/internal/connection/RouteDatabase;", "getRouteDatabase", "()Lod/c;", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    private final Authenticator authenticator;
    private final Cache cache;
    private final int callTimeoutMillis;
    private final CertificateChainCleaner certificateChainCleaner;
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final ConnectionPool connectionPool;
    private final List<ConnectionSpec> connectionSpecs;
    private final CookieJar cookieJar;
    private final Dispatcher dispatcher;
    private final Dns dns;
    private final EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final HostnameVerifier hostnameVerifier;
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final RouteDatabase routeDatabase;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManager;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);
    private static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bc\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0007¢\u0006\u0004\b\u0004\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0012\u001a\u00020\u00002\u0014\b\u0004\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u001a\u0010\u0010J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0013J)\u0010\u001b\u001a\u00020\u00002\u0014\b\u0004\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0019J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020#¢\u0006\u0004\b)\u0010%J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020#¢\u0006\u0004\b+\u0010%J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u000208¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020&¢\u0006\u0004\b;\u0010(J\u0015\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?H\u0007¢\u0006\u0004\b@\u0010AJ\u001d\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\b@\u0010DJ\u001b\u0010G\u001a\u00020\u00002\f\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E¢\u0006\u0004\bG\u0010HJ\u001b\u0010J\u001a\u00020\u00002\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0E¢\u0006\u0004\bJ\u0010HJ\u0015\u0010L\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\u00002\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bO\u0010PJ\u001d\u0010U\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bU\u0010VJ\u0017\u0010U\u001a\u00020\u00002\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\bU\u0010YJ\u001d\u0010Z\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bZ\u0010VJ\u0017\u0010Z\u001a\u00020\u00002\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\bZ\u0010YJ\u001d\u0010[\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\b[\u0010VJ\u0017\u0010[\u001a\u00020\u00002\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\b[\u0010YJ\u001d\u0010\\\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\b\\\u0010VJ\u0017\u0010\\\u001a\u00020\u00002\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\b\\\u0010YJ\u001d\u0010^\u001a\u00020\u00002\u0006\u0010]\u001a\u00020Q2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\b^\u0010VJ\u0017\u0010^\u001a\u00020\u00002\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\b^\u0010YJ\u0015\u0010`\u001a\u00020\u00002\u0006\u0010_\u001a\u00020Q¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020\u0002¢\u0006\u0004\bb\u0010cR\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010n\u001a\u0004\bo\u0010\u0010R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010n\u001a\u0004\bp\u0010\u0010R\"\u0010!\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010$\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR$\u0010)\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b)\u0010v\u001a\u0005\b\u0080\u0001\u0010x\"\u0005\b\u0081\u0001\u0010zR$\u0010+\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b+\u0010v\u001a\u0005\b\u0082\u0001\u0010x\"\u0005\b\u0083\u0001\u0010zR%\u0010-\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b-\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010}\"\u0005\b\u0086\u0001\u0010\u007fR)\u00100\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b0\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R%\u00103\u001a\u0002028\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b3\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010}\"\u0005\b\u008e\u0001\u0010\u007fR)\u00106\u001a\u0004\u0018\u0001058\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b6\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R)\u00109\u001a\u0004\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b9\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R$\u0010;\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b;\u0010{\u001a\u0005\b\u0099\u0001\u0010}\"\u0005\b\u009a\u0001\u0010\u007fR'\u0010=\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b=\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R+\u0010 \u0001\u001a\u0004\u0018\u00010?8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R+\u0010¦\u0001\u001a\u0004\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R+\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bG\u0010n\u001a\u0005\b¬\u0001\u0010\u0010\"\u0006\b\u00ad\u0001\u0010®\u0001R+\u0010J\u001a\b\u0012\u0004\u0012\u00020I0E8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bJ\u0010n\u001a\u0005\b¯\u0001\u0010\u0010\"\u0006\b°\u0001\u0010®\u0001R'\u0010L\u001a\u00020K8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bL\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R'\u0010O\u001a\u00020N8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bO\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R,\u0010¼\u0001\u001a\u0005\u0018\u00010»\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R(\u0010U\u001a\u00030Â\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bU\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R(\u0010Z\u001a\u00030Â\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bZ\u0010Ã\u0001\u001a\u0006\bÈ\u0001\u0010Å\u0001\"\u0006\bÉ\u0001\u0010Ç\u0001R(\u0010[\u001a\u00030Â\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b[\u0010Ã\u0001\u001a\u0006\bÊ\u0001\u0010Å\u0001\"\u0006\bË\u0001\u0010Ç\u0001R(\u0010\\\u001a\u00030Â\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\\\u0010Ã\u0001\u001a\u0006\bÌ\u0001\u0010Å\u0001\"\u0006\bÍ\u0001\u0010Ç\u0001R(\u0010^\u001a\u00030Â\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b^\u0010Ã\u0001\u001a\u0006\bÎ\u0001\u0010Å\u0001\"\u0006\bÏ\u0001\u0010Ç\u0001R'\u0010`\u001a\u00020Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b`\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001R,\u0010Ö\u0001\u001a\u0005\u0018\u00010Õ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÖ\u0001\u0010×\u0001\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Ü\u0001"}, d2 = {"Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "", "Lcom/applovin/shadow/okhttp3/OkHttpClient;", "okHttpClient", "<init>", "(Lxn/q;)V", "()V", "Lcom/applovin/shadow/okhttp3/Dispatcher;", "dispatcher", "(Lcom/applovin/shadow/okhttp3/Dispatcher;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Lcom/applovin/shadow/okhttp3/ConnectionPool;", "connectionPool", "(Lcom/applovin/shadow/okhttp3/ConnectionPool;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "", "Lcom/applovin/shadow/okhttp3/Interceptor;", "interceptors", "()Ljava/util/List;", "interceptor", "addInterceptor", "(Lcom/applovin/shadow/okhttp3/Interceptor;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Lkotlin/Function1;", "Lcom/applovin/shadow/okhttp3/Interceptor$Chain;", "Lcom/applovin/shadow/okhttp3/Response;", "block", "-addInterceptor", "(Ljk/b;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "networkInterceptors", "addNetworkInterceptor", "-addNetworkInterceptor", "Lcom/applovin/shadow/okhttp3/EventListener;", "eventListener", "(Lcom/applovin/shadow/okhttp3/EventListener;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Lcom/applovin/shadow/okhttp3/EventListener$Factory;", "eventListenerFactory", "(Lcom/applovin/shadow/okhttp3/EventListener$Factory;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "", "retryOnConnectionFailure", "(Z)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Lcom/applovin/shadow/okhttp3/Authenticator;", "authenticator", "(Lcom/applovin/shadow/okhttp3/Authenticator;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "followRedirects", "followProtocolRedirects", "followSslRedirects", "Lcom/applovin/shadow/okhttp3/CookieJar;", "cookieJar", "(Lcom/applovin/shadow/okhttp3/CookieJar;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Lcom/applovin/shadow/okhttp3/Cache;", "cache", "(Lcom/applovin/shadow/okhttp3/Cache;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Lcom/applovin/shadow/okhttp3/Dns;", "dns", "(Lcom/applovin/shadow/okhttp3/Dns;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Ljava/net/Proxy;", "proxy", "(Ljava/net/Proxy;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Ljava/net/ProxySelector;", "proxySelector", "(Ljava/net/ProxySelector;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "socketFactory", "(Ljavax/net/SocketFactory;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "(Ljavax/net/ssl/SSLSocketFactory;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "", "Lcom/applovin/shadow/okhttp3/ConnectionSpec;", "connectionSpecs", "(Ljava/util/List;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Lcom/applovin/shadow/okhttp3/Protocol;", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Lcom/applovin/shadow/okhttp3/CertificatePinner;", "certificatePinner", "(Lcom/applovin/shadow/okhttp3/CertificatePinner;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "callTimeout", "(JLjava/util/concurrent/TimeUnit;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Ljava/time/Duration;", IronSourceConstants.EVENTS_DURATION, "(Ljava/time/Duration;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "connectTimeout", "readTimeout", "writeTimeout", "interval", "pingInterval", "bytes", "minWebSocketMessageToCompress", "(J)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", InAppPurchaseConstants.METHOD_BUILD, "()Lcom/applovin/shadow/okhttp3/OkHttpClient;", "Lcom/applovin/shadow/okhttp3/Dispatcher;", "getDispatcher$okhttp", "()Lzc/u;", "setDispatcher$okhttp", "(Lzc/u;)V", "Lcom/applovin/shadow/okhttp3/ConnectionPool;", "getConnectionPool$okhttp", "()Lqj/x;", "setConnectionPool$okhttp", "(Lqj/x;)V", "Ljava/util/List;", "getInterceptors$okhttp", "getNetworkInterceptors$okhttp", "Lcom/applovin/shadow/okhttp3/EventListener$Factory;", "getEventListenerFactory$okhttp", "()Lxa/b;", "setEventListenerFactory$okhttp", "(Lxa/b;)V", "Z", "getRetryOnConnectionFailure$okhttp", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "Lcom/applovin/shadow/okhttp3/Authenticator;", "getAuthenticator$okhttp", "()Lxn/b;", "setAuthenticator$okhttp", "(Lxn/b;)V", "getFollowRedirects$okhttp", "setFollowRedirects$okhttp", "getFollowSslRedirects$okhttp", "setFollowSslRedirects$okhttp", "Lcom/applovin/shadow/okhttp3/CookieJar;", "getCookieJar$okhttp", "setCookieJar$okhttp", "Lcom/applovin/shadow/okhttp3/Cache;", "getCache$okhttp", "()Ljava/lang/Object;", "setCache$okhttp", "(Ljava/lang/Object;)V", "Lcom/applovin/shadow/okhttp3/Dns;", "getDns$okhttp", "setDns$okhttp", "Ljava/net/Proxy;", "getProxy$okhttp", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "getProxySelector$okhttp", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "getProxyAuthenticator$okhttp", "setProxyAuthenticator$okhttp", "Ljavax/net/SocketFactory;", "getSocketFactory$okhttp", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull$okhttp", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "x509TrustManagerOrNull", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManagerOrNull$okhttp", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "getConnectionSpecs$okhttp", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "getProtocols$okhttp", "setProtocols$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier$okhttp", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lcom/applovin/shadow/okhttp3/CertificatePinner;", "getCertificatePinner$okhttp", "()Lxn/f;", "setCertificatePinner$okhttp", "(Lxn/f;)V", "Lcom/applovin/shadow/okhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lcom/applovin/shadow/okhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lcom/google/android/gms/internal/auth/i;", "setCertificateChainCleaner$okhttp", "(Lcom/google/android/gms/internal/auth/i;)V", "", "I", "getCallTimeout$okhttp", "()I", "setCallTimeout$okhttp", "(I)V", "getConnectTimeout$okhttp", "setConnectTimeout$okhttp", "getReadTimeout$okhttp", "setReadTimeout$okhttp", "getWriteTimeout$okhttp", "setWriteTimeout$okhttp", "getPingInterval$okhttp", "setPingInterval$okhttp", "J", "getMinWebSocketMessageToCompress$okhttp", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "Lcom/applovin/shadow/okhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lcom/applovin/shadow/okhttp3/internal/connection/RouteDatabase;", "getRouteDatabase$okhttp", "()Lod/c;", "setRouteDatabase$okhttp", "(Lod/c;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Builder {
        private Authenticator authenticator;
        private Cache cache;
        private int callTimeout;
        private CertificateChainCleaner certificateChainCleaner;
        private CertificatePinner certificatePinner;
        private int connectTimeout;
        private ConnectionPool connectionPool;
        private List<ConnectionSpec> connectionSpecs;
        private CookieJar cookieJar;
        private Dispatcher dispatcher;
        private Dns dns;
        private EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;
        private HostnameVerifier hostnameVerifier;
        private final List<Interceptor> interceptors;
        private long minWebSocketMessageToCompress;
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;
        private List<? extends Protocol> protocols;
        private Proxy proxy;
        private Authenticator proxyAuthenticator;
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        private RouteDatabase routeDatabase;
        private SocketFactory socketFactory;
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;
        private X509TrustManager x509TrustManagerOrNull;

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Util.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            Authenticator authenticator = Authenticator.NONE;
            this.authenticator = authenticator;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            n.e(socketFactory, "getDefault()");
            this.socketFactory = socketFactory;
            Companion companion = OkHttpClient.INSTANCE;
            this.connectionSpecs = companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }

        /* JADX INFO: renamed from: -addInterceptor, reason: not valid java name */
        public final Builder m111addInterceptor(final b block) {
            n.f(block, "block");
            return addInterceptor(new Interceptor() { // from class: com.applovin.shadow.okhttp3.OkHttpClient$Builder$addInterceptor$2
                @Override // com.applovin.shadow.okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    n.f(chain, "chain");
                    return (Response) block.invoke(chain);
                }
            });
        }

        /* JADX INFO: renamed from: -addNetworkInterceptor, reason: not valid java name */
        public final Builder m112addNetworkInterceptor(final b block) {
            n.f(block, "block");
            return addNetworkInterceptor(new Interceptor() { // from class: com.applovin.shadow.okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                @Override // com.applovin.shadow.okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    n.f(chain, "chain");
                    return (Response) block.invoke(chain);
                }
            });
        }

        public final Builder addInterceptor(Interceptor interceptor) {
            n.f(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        public final Builder addNetworkInterceptor(Interceptor interceptor) {
            n.f(interceptor, "interceptor");
            this.networkInterceptors.add(interceptor);
            return this;
        }

        public final Builder authenticator(Authenticator authenticator) {
            n.f(authenticator, "authenticator");
            this.authenticator = authenticator;
            return this;
        }

        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        public final Builder cache(Cache cache) {
            this.cache = cache;
            return this;
        }

        public final Builder callTimeout(long timeout, TimeUnit unit) {
            n.f(unit, "unit");
            this.callTimeout = Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        public final Builder certificatePinner(CertificatePinner certificatePinner) {
            n.f(certificatePinner, "certificatePinner");
            if (!certificatePinner.equals(this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        public final Builder connectTimeout(long timeout, TimeUnit unit) {
            n.f(unit, "unit");
            this.connectTimeout = Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        public final Builder connectionPool(ConnectionPool connectionPool) {
            n.f(connectionPool, "connectionPool");
            this.connectionPool = connectionPool;
            return this;
        }

        public final Builder connectionSpecs(List<ConnectionSpec> connectionSpecs) {
            n.f(connectionSpecs, "connectionSpecs");
            if (!connectionSpecs.equals(this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = Util.toImmutableList(connectionSpecs);
            return this;
        }

        public final Builder cookieJar(CookieJar cookieJar) {
            n.f(cookieJar, "cookieJar");
            this.cookieJar = cookieJar;
            return this;
        }

        public final Builder dispatcher(Dispatcher dispatcher) {
            n.f(dispatcher, "dispatcher");
            this.dispatcher = dispatcher;
            return this;
        }

        public final Builder dns(Dns dns) {
            n.f(dns, "dns");
            if (!dns.equals(this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        public final Builder eventListener(EventListener eventListener) {
            n.f(eventListener, "eventListener");
            this.eventListenerFactory = Util.asFactory(eventListener);
            return this;
        }

        public final Builder eventListenerFactory(EventListener.Factory eventListenerFactory) {
            n.f(eventListenerFactory, "eventListenerFactory");
            this.eventListenerFactory = eventListenerFactory;
            return this;
        }

        public final Builder followRedirects(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        public final Builder followSslRedirects(boolean followProtocolRedirects) {
            this.followSslRedirects = followProtocolRedirects;
            return this;
        }

        /* JADX INFO: renamed from: getAuthenticator$okhttp, reason: from getter */
        public final Authenticator getAuthenticator() {
            return this.authenticator;
        }

        /* JADX INFO: renamed from: getCache$okhttp, reason: from getter */
        public final Cache getCache() {
            return this.cache;
        }

        /* JADX INFO: renamed from: getCallTimeout$okhttp, reason: from getter */
        public final int getCallTimeout() {
            return this.callTimeout;
        }

        /* JADX INFO: renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
        public final CertificateChainCleaner getCertificateChainCleaner() {
            return this.certificateChainCleaner;
        }

        /* JADX INFO: renamed from: getCertificatePinner$okhttp, reason: from getter */
        public final CertificatePinner getCertificatePinner() {
            return this.certificatePinner;
        }

        /* JADX INFO: renamed from: getConnectTimeout$okhttp, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        /* JADX INFO: renamed from: getConnectionPool$okhttp, reason: from getter */
        public final ConnectionPool getConnectionPool() {
            return this.connectionPool;
        }

        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        /* JADX INFO: renamed from: getCookieJar$okhttp, reason: from getter */
        public final CookieJar getCookieJar() {
            return this.cookieJar;
        }

        /* JADX INFO: renamed from: getDispatcher$okhttp, reason: from getter */
        public final Dispatcher getDispatcher() {
            return this.dispatcher;
        }

        /* JADX INFO: renamed from: getDns$okhttp, reason: from getter */
        public final Dns getDns() {
            return this.dns;
        }

        /* JADX INFO: renamed from: getEventListenerFactory$okhttp, reason: from getter */
        public final EventListener.Factory getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        /* JADX INFO: renamed from: getFollowRedirects$okhttp, reason: from getter */
        public final boolean getFollowRedirects() {
            return this.followRedirects;
        }

        /* JADX INFO: renamed from: getFollowSslRedirects$okhttp, reason: from getter */
        public final boolean getFollowSslRedirects() {
            return this.followSslRedirects;
        }

        /* JADX INFO: renamed from: getHostnameVerifier$okhttp, reason: from getter */
        public final HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        public final List<Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        /* JADX INFO: renamed from: getMinWebSocketMessageToCompress$okhttp, reason: from getter */
        public final long getMinWebSocketMessageToCompress() {
            return this.minWebSocketMessageToCompress;
        }

        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        /* JADX INFO: renamed from: getPingInterval$okhttp, reason: from getter */
        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        /* JADX INFO: renamed from: getProxy$okhttp, reason: from getter */
        public final Proxy getProxy() {
            return this.proxy;
        }

        /* JADX INFO: renamed from: getProxyAuthenticator$okhttp, reason: from getter */
        public final Authenticator getProxyAuthenticator() {
            return this.proxyAuthenticator;
        }

        /* JADX INFO: renamed from: getProxySelector$okhttp, reason: from getter */
        public final ProxySelector getProxySelector() {
            return this.proxySelector;
        }

        /* JADX INFO: renamed from: getReadTimeout$okhttp, reason: from getter */
        public final int getReadTimeout() {
            return this.readTimeout;
        }

        /* JADX INFO: renamed from: getRetryOnConnectionFailure$okhttp, reason: from getter */
        public final boolean getRetryOnConnectionFailure() {
            return this.retryOnConnectionFailure;
        }

        /* JADX INFO: renamed from: getRouteDatabase$okhttp, reason: from getter */
        public final RouteDatabase getRouteDatabase() {
            return this.routeDatabase;
        }

        /* JADX INFO: renamed from: getSocketFactory$okhttp, reason: from getter */
        public final SocketFactory getSocketFactory() {
            return this.socketFactory;
        }

        /* JADX INFO: renamed from: getSslSocketFactoryOrNull$okhttp, reason: from getter */
        public final SSLSocketFactory getSslSocketFactoryOrNull() {
            return this.sslSocketFactoryOrNull;
        }

        /* JADX INFO: renamed from: getWriteTimeout$okhttp, reason: from getter */
        public final int getWriteTimeout() {
            return this.writeTimeout;
        }

        /* JADX INFO: renamed from: getX509TrustManagerOrNull$okhttp, reason: from getter */
        public final X509TrustManager getX509TrustManagerOrNull() {
            return this.x509TrustManagerOrNull;
        }

        public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier) {
            n.f(hostnameVerifier, "hostnameVerifier");
            if (!hostnameVerifier.equals(this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        public final Builder minWebSocketMessageToCompress(long bytes) {
            if (bytes < 0) {
                throw new IllegalArgumentException(e.i(bytes, "minWebSocketMessageToCompress must be positive: ").toString());
            }
            this.minWebSocketMessageToCompress = bytes;
            return this;
        }

        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        public final Builder pingInterval(long interval, TimeUnit unit) {
            n.f(unit, "unit");
            this.pingInterval = Util.checkDuration("interval", interval, unit);
            return this;
        }

        public final Builder protocols(List<? extends Protocol> protocols) {
            n.f(protocols, "protocols");
            ArrayList arrayListO0 = xj.n.O0(protocols);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!arrayListO0.contains(protocol) && !arrayListO0.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayListO0).toString());
            }
            if (arrayListO0.contains(protocol) && arrayListO0.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayListO0).toString());
            }
            if (arrayListO0.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayListO0).toString());
            }
            if (arrayListO0.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            arrayListO0.remove(Protocol.SPDY_3);
            if (!arrayListO0.equals(this.protocols)) {
                this.routeDatabase = null;
            }
            List<? extends Protocol> listUnmodifiableList = Collections.unmodifiableList(arrayListO0);
            n.e(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            this.protocols = listUnmodifiableList;
            return this;
        }

        public final Builder proxy(Proxy proxy) {
            if (!n.a(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        public final Builder proxyAuthenticator(Authenticator proxyAuthenticator) {
            n.f(proxyAuthenticator, "proxyAuthenticator");
            if (!proxyAuthenticator.equals(this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = proxyAuthenticator;
            return this;
        }

        public final Builder proxySelector(ProxySelector proxySelector) {
            n.f(proxySelector, "proxySelector");
            if (!proxySelector.equals(this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            return this;
        }

        public final Builder readTimeout(long timeout, TimeUnit unit) {
            n.f(unit, "unit");
            this.readTimeout = Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        public final Builder retryOnConnectionFailure(boolean retryOnConnectionFailure) {
            this.retryOnConnectionFailure = retryOnConnectionFailure;
            return this;
        }

        public final void setAuthenticator$okhttp(Authenticator authenticator) {
            n.f(authenticator, "<set-?>");
            this.authenticator = authenticator;
        }

        public final void setCache$okhttp(Cache cache) {
            this.cache = cache;
        }

        public final void setCallTimeout$okhttp(int i10) {
            this.callTimeout = i10;
        }

        public final void setCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
            this.certificateChainCleaner = certificateChainCleaner;
        }

        public final void setCertificatePinner$okhttp(CertificatePinner certificatePinner) {
            n.f(certificatePinner, "<set-?>");
            this.certificatePinner = certificatePinner;
        }

        public final void setConnectTimeout$okhttp(int i10) {
            this.connectTimeout = i10;
        }

        public final void setConnectionPool$okhttp(ConnectionPool connectionPool) {
            n.f(connectionPool, "<set-?>");
            this.connectionPool = connectionPool;
        }

        public final void setConnectionSpecs$okhttp(List<ConnectionSpec> list) {
            n.f(list, "<set-?>");
            this.connectionSpecs = list;
        }

        public final void setCookieJar$okhttp(CookieJar cookieJar) {
            n.f(cookieJar, "<set-?>");
            this.cookieJar = cookieJar;
        }

        public final void setDispatcher$okhttp(Dispatcher dispatcher) {
            n.f(dispatcher, "<set-?>");
            this.dispatcher = dispatcher;
        }

        public final void setDns$okhttp(Dns dns) {
            n.f(dns, "<set-?>");
            this.dns = dns;
        }

        public final void setEventListenerFactory$okhttp(EventListener.Factory factory) {
            n.f(factory, "<set-?>");
            this.eventListenerFactory = factory;
        }

        public final void setFollowRedirects$okhttp(boolean z10) {
            this.followRedirects = z10;
        }

        public final void setFollowSslRedirects$okhttp(boolean z10) {
            this.followSslRedirects = z10;
        }

        public final void setHostnameVerifier$okhttp(HostnameVerifier hostnameVerifier) {
            n.f(hostnameVerifier, "<set-?>");
            this.hostnameVerifier = hostnameVerifier;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j10) {
            this.minWebSocketMessageToCompress = j10;
        }

        public final void setPingInterval$okhttp(int i10) {
            this.pingInterval = i10;
        }

        public final void setProtocols$okhttp(List<? extends Protocol> list) {
            n.f(list, "<set-?>");
            this.protocols = list;
        }

        public final void setProxy$okhttp(Proxy proxy) {
            this.proxy = proxy;
        }

        public final void setProxyAuthenticator$okhttp(Authenticator authenticator) {
            n.f(authenticator, "<set-?>");
            this.proxyAuthenticator = authenticator;
        }

        public final void setProxySelector$okhttp(ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        public final void setReadTimeout$okhttp(int i10) {
            this.readTimeout = i10;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z10) {
            this.retryOnConnectionFailure = z10;
        }

        public final void setRouteDatabase$okhttp(RouteDatabase routeDatabase) {
            this.routeDatabase = routeDatabase;
        }

        public final void setSocketFactory$okhttp(SocketFactory socketFactory) {
            n.f(socketFactory, "<set-?>");
            this.socketFactory = socketFactory;
        }

        public final void setSslSocketFactoryOrNull$okhttp(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final void setWriteTimeout$okhttp(int i10) {
            this.writeTimeout = i10;
        }

        public final void setX509TrustManagerOrNull$okhttp(X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        public final Builder socketFactory(SocketFactory socketFactory) {
            n.f(socketFactory, "socketFactory");
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            if (!socketFactory.equals(this.socketFactory)) {
                this.routeDatabase = null;
            }
            this.socketFactory = socketFactory;
            return this;
        }

        public final Builder sslSocketFactory(SSLSocketFactory sslSocketFactory) throws IllegalAccessException {
            n.f(sslSocketFactory, "sslSocketFactory");
            if (!sslSocketFactory.equals(this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            Platform.Companion companion = Platform.INSTANCE;
            X509TrustManager x509TrustManagerTrustManager = companion.get().trustManager(sslSocketFactory);
            if (x509TrustManagerTrustManager == null) {
                throw new IllegalStateException("Unable to extract the trust manager on " + companion.get() + ", sslSocketFactory is " + sslSocketFactory.getClass());
            }
            this.x509TrustManagerOrNull = x509TrustManagerTrustManager;
            Platform platform = companion.get();
            X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
            n.c(x509TrustManager);
            this.certificateChainCleaner = platform.buildCertificateChainCleaner(x509TrustManager);
            return this;
        }

        public final Builder writeTimeout(long timeout, TimeUnit unit) {
            n.f(unit, "unit");
            this.writeTimeout = Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder callTimeout(Duration duration) {
            n.f(duration, "duration");
            callTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder connectTimeout(Duration duration) {
            n.f(duration, "duration");
            connectTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder pingInterval(Duration duration) {
            n.f(duration, "duration");
            pingInterval(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder readTimeout(Duration duration) {
            n.f(duration, "duration");
            readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder writeTimeout(Duration duration) {
            n.f(duration, "duration");
            writeTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder sslSocketFactory(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
            n.f(sslSocketFactory, "sslSocketFactory");
            n.f(trustManager, "trustManager");
            if (!sslSocketFactory.equals(this.sslSocketFactoryOrNull) || !trustManager.equals(this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.INSTANCE.get(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(OkHttpClient okHttpClient) {
            this();
            n.f(okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            t.a0(okHttpClient.interceptors(), this.interceptors);
            t.a0(okHttpClient.networkInterceptors(), this.networkInterceptors);
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.getX509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.getCertificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.getMinWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/applovin/shadow/okhttp3/OkHttpClient$Companion;", "", "()V", "DEFAULT_CONNECTION_SPECS", "", "Lcom/applovin/shadow/okhttp3/ConnectionSpec;", "getDEFAULT_CONNECTION_SPECS$okhttp", "()Ljava/util/List;", "DEFAULT_PROTOCOLS", "Lcom/applovin/shadow/okhttp3/Protocol;", "getDEFAULT_PROTOCOLS$okhttp", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }

        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.DEFAULT_PROTOCOLS;
        }

        private Companion() {
        }
    }

    public OkHttpClient(Builder builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        n.f(builder, "builder");
        this.dispatcher = builder.getDispatcher();
        this.connectionPool = builder.getConnectionPool();
        this.interceptors = Util.toImmutableList(builder.getInterceptors$okhttp());
        this.networkInterceptors = Util.toImmutableList(builder.getNetworkInterceptors$okhttp());
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
            proxySelector = NullProxySelector.INSTANCE;
        } else {
            proxySelector = builder.getProxySelector();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = builder.getProxyAuthenticator();
        this.socketFactory = builder.getSocketFactory();
        List<ConnectionSpec> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
        this.connectionSpecs = connectionSpecs$okhttp;
        this.protocols = builder.getProtocols$okhttp();
        this.hostnameVerifier = builder.getHostnameVerifier();
        this.callTimeoutMillis = builder.getCallTimeout();
        this.connectTimeoutMillis = builder.getConnectTimeout();
        this.readTimeoutMillis = builder.getReadTimeout();
        this.writeTimeoutMillis = builder.getWriteTimeout();
        this.pingIntervalMillis = builder.getPingInterval();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress();
        RouteDatabase routeDatabase = builder.getRouteDatabase();
        this.routeDatabase = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        List<ConnectionSpec> list = connectionSpecs$okhttp;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).getIsTls()) {
                    if (builder.getSslSocketFactoryOrNull() != null) {
                        this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull();
                        CertificateChainCleaner certificateChainCleaner = builder.getCertificateChainCleaner();
                        n.c(certificateChainCleaner);
                        this.certificateChainCleaner = certificateChainCleaner;
                        X509TrustManager x509TrustManagerOrNull = builder.getX509TrustManagerOrNull();
                        n.c(x509TrustManagerOrNull);
                        this.x509TrustManager = x509TrustManagerOrNull;
                        this.certificatePinner = builder.getCertificatePinner().withCertificateChainCleaner$okhttp(certificateChainCleaner);
                    } else {
                        Platform.Companion companion = Platform.INSTANCE;
                        X509TrustManager x509TrustManagerPlatformTrustManager = companion.get().platformTrustManager();
                        this.x509TrustManager = x509TrustManagerPlatformTrustManager;
                        Platform platform = companion.get();
                        n.c(x509TrustManagerPlatformTrustManager);
                        this.sslSocketFactoryOrNull = platform.newSslSocketFactory(x509TrustManagerPlatformTrustManager);
                        CertificateChainCleaner.Companion companion2 = CertificateChainCleaner.INSTANCE;
                        n.c(x509TrustManagerPlatformTrustManager);
                        CertificateChainCleaner certificateChainCleaner2 = companion2.get(x509TrustManagerPlatformTrustManager);
                        this.certificateChainCleaner = certificateChainCleaner2;
                        CertificatePinner certificatePinner = builder.getCertificatePinner();
                        n.c(certificateChainCleaner2);
                        this.certificatePinner = certificatePinner.withCertificateChainCleaner$okhttp(certificateChainCleaner2);
                    }
                }
            }
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
        }
        verifyClientState();
    }

    private final void verifyClientState() {
        List<Interceptor> list = this.interceptors;
        n.d(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
        }
        List<Interceptor> list2 = this.networkInterceptors;
        n.d(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        List<ConnectionSpec> list3 = this.connectionSpecs;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).getIsTls()) {
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
        if (!n.a(this.certificatePinner, CertificatePinner.DEFAULT)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: -deprecated_authenticator, reason: not valid java name and from getter */
    public final Authenticator getAuthenticator() {
        return this.authenticator;
    }

    /* JADX INFO: renamed from: -deprecated_cache, reason: not valid java name and from getter */
    public final Cache getCache() {
        return this.cache;
    }

    /* JADX INFO: renamed from: -deprecated_callTimeoutMillis, reason: not valid java name and from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    /* JADX INFO: renamed from: -deprecated_certificatePinner, reason: not valid java name and from getter */
    public final CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    /* JADX INFO: renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name and from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    /* JADX INFO: renamed from: -deprecated_connectionPool, reason: not valid java name and from getter */
    public final ConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    /* JADX INFO: renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m91deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    /* JADX INFO: renamed from: -deprecated_cookieJar, reason: not valid java name and from getter */
    public final CookieJar getCookieJar() {
        return this.cookieJar;
    }

    /* JADX INFO: renamed from: -deprecated_dispatcher, reason: not valid java name and from getter */
    public final Dispatcher getDispatcher() {
        return this.dispatcher;
    }

    /* JADX INFO: renamed from: -deprecated_dns, reason: not valid java name and from getter */
    public final Dns getDns() {
        return this.dns;
    }

    /* JADX INFO: renamed from: -deprecated_eventListenerFactory, reason: not valid java name and from getter */
    public final EventListener.Factory getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    /* JADX INFO: renamed from: -deprecated_followRedirects, reason: not valid java name and from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    /* JADX INFO: renamed from: -deprecated_followSslRedirects, reason: not valid java name and from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    /* JADX INFO: renamed from: -deprecated_hostnameVerifier, reason: not valid java name and from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    /* JADX INFO: renamed from: -deprecated_interceptors, reason: not valid java name */
    public final List<Interceptor> m99deprecated_interceptors() {
        return this.interceptors;
    }

    /* JADX INFO: renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final List<Interceptor> m100deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    /* JADX INFO: renamed from: -deprecated_pingIntervalMillis, reason: not valid java name and from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    /* JADX INFO: renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m102deprecated_protocols() {
        return this.protocols;
    }

    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name and from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    /* JADX INFO: renamed from: -deprecated_proxyAuthenticator, reason: not valid java name and from getter */
    public final Authenticator getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    /* JADX INFO: renamed from: -deprecated_proxySelector, reason: not valid java name and from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    /* JADX INFO: renamed from: -deprecated_readTimeoutMillis, reason: not valid java name and from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* JADX INFO: renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name and from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    /* JADX INFO: renamed from: -deprecated_socketFactory, reason: not valid java name and from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    /* JADX INFO: renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m109deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    /* JADX INFO: renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name and from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final Authenticator authenticator() {
        return this.authenticator;
    }

    public final Cache cache() {
        return this.cache;
    }

    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    /* JADX INFO: renamed from: certificateChainCleaner, reason: from getter */
    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public Object clone() {
        return super.clone();
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    public final Dns dns() {
        return this.dns;
    }

    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    /* JADX INFO: renamed from: minWebSocketMessageToCompress, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    @Override // com.applovin.shadow.okhttp3.Call.Factory
    public Call newCall(Request request) {
        n.f(request, "request");
        return new RealCall(this, request, false);
    }

    @Override // com.applovin.shadow.okhttp3.WebSocket.Factory
    public WebSocket newWebSocket(Request request, WebSocketListener listener) {
        n.f(request, "request");
        n.f(listener, "listener");
        RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.INSTANCE, request, listener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    /* JADX INFO: renamed from: x509TrustManager, reason: from getter */
    public final X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
