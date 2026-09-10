package com.applovin.shadow.okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.Address;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Route;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http.ExchangeCodec;
import com.applovin.shadow.okhttp3.internal.http.RealInterceptorChain;
import com.applovin.shadow.okhttp3.internal.http2.ConnectionShutdownException;
import com.applovin.shadow.okhttp3.internal.http2.ErrorCode;
import com.applovin.shadow.okhttp3.internal.http2.StreamResetException;
import com.facebook.appevents.integrity.IntegrityManager;
import com.ironsource.C0375hc;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0017\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0015\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0011¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010=\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/connection/ExchangeFinder;", "", "Lcom/applovin/shadow/okhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lcom/applovin/shadow/okhttp3/Address;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/applovin/shadow/okhttp3/internal/connection/RealCall;", NotificationCompat.CATEGORY_CALL, "Lcom/applovin/shadow/okhttp3/EventListener;", "eventListener", "<init>", "(Lbo/l;Lxn/a;Lbo/i;Ljava/lang/Object;)V", "", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "", "connectionRetryEnabled", "doExtensiveHealthChecks", "Lcom/applovin/shadow/okhttp3/internal/connection/RealConnection;", "findHealthyConnection", "(IIIIZZ)Lcom/applovin/shadow/okhttp3/internal/connection/RealConnection;", "findConnection", "(IIIIZ)Lcom/applovin/shadow/okhttp3/internal/connection/RealConnection;", "Lcom/applovin/shadow/okhttp3/Route;", "retryRoute", "()Lcom/applovin/shadow/okhttp3/Route;", "Lcom/applovin/shadow/okhttp3/OkHttpClient;", "client", "Lcom/applovin/shadow/okhttp3/internal/http/RealInterceptorChain;", "chain", "Lcom/applovin/shadow/okhttp3/internal/http/ExchangeCodec;", "find", "(Lcom/applovin/shadow/okhttp3/OkHttpClient;Lcom/applovin/shadow/okhttp3/internal/http/RealInterceptorChain;)Lcom/applovin/shadow/okhttp3/internal/http/ExchangeCodec;", "Ljava/io/IOException;", "e", "Lwj/r;", "trackFailure", "(Ljava/io/IOException;)V", "retryAfterFailure", "()Z", "Lcom/applovin/shadow/okhttp3/HttpUrl;", "url", "sameHostAndPort", "(Lcom/applovin/shadow/okhttp3/HttpUrl;)Z", "Lcom/applovin/shadow/okhttp3/internal/connection/RealConnectionPool;", "Lcom/applovin/shadow/okhttp3/Address;", "getAddress$okhttp", "()Lxn/a;", "Lcom/applovin/shadow/okhttp3/internal/connection/RealCall;", "Lcom/applovin/shadow/okhttp3/EventListener;", "Lcom/applovin/shadow/okhttp3/internal/connection/RouteSelector$Selection;", "routeSelection", "Lcom/applovin/shadow/okhttp3/internal/connection/RouteSelector$Selection;", "Lcom/applovin/shadow/okhttp3/internal/connection/RouteSelector;", "routeSelector", "Lcom/applovin/shadow/okhttp3/internal/connection/RouteSelector;", "refusedStreamCount", "I", "connectionShutdownCount", "otherFailureCount", "nextRouteToTry", "Lcom/applovin/shadow/okhttp3/Route;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ExchangeFinder {
    private final Address address;
    private final RealCall call;
    private final RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    private final EventListener eventListener;
    private Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private RouteSelector.Selection routeSelection;
    private RouteSelector routeSelector;

    public ExchangeFinder(RealConnectionPool connectionPool, Address address, RealCall call, EventListener eventListener) {
        n.f(connectionPool, "connectionPool");
        n.f(address, "address");
        n.f(call, "call");
        n.f(eventListener, "eventListener");
        this.connectionPool = connectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x012a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0144  */
    /* JADX WARN: Code duplicated, block: B:73:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final RealConnection findConnection(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled) throws IOException {
        List<Route> routes;
        RealConnection realConnection;
        Socket socketReleaseConnectionNoEvents$okhttp;
        if (this.call.getCanceled()) {
            throw new IOException("Canceled");
        }
        RealConnection connection = this.call.getConnection();
        if (connection != null) {
            synchronized (connection) {
                try {
                    socketReleaseConnectionNoEvents$okhttp = (connection.getNoNewExchanges() || !sameHostAndPort(connection.getRoute().address().url())) ? this.call.releaseConnectionNoEvents$okhttp() : null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.call.getConnection() != null) {
                if (socketReleaseConnectionNoEvents$okhttp == null) {
                    return connection;
                }
                throw new IllegalStateException("Check failed.");
            }
            if (socketReleaseConnectionNoEvents$okhttp != null) {
                Util.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
            }
            this.eventListener.connectionReleased(this.call, connection);
        }
        this.refusedStreamCount = 0;
        this.connectionShutdownCount = 0;
        this.otherFailureCount = 0;
        if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, null, false)) {
            RealConnection connection2 = this.call.getConnection();
            n.c(connection2);
            this.eventListener.connectionAcquired(this.call, connection2);
            return connection2;
        }
        Route next = this.nextRouteToTry;
        try {
            if (next == null) {
                RouteSelector.Selection selection = this.routeSelection;
                if (selection != null) {
                    n.c(selection);
                    if (selection.hasNext()) {
                        RouteSelector.Selection selection2 = this.routeSelection;
                        n.c(selection2);
                        next = selection2.next();
                    }
                    realConnection = new RealConnection(this.connectionPool, next);
                    this.call.setConnectionToCancel(realConnection);
                    realConnection.connect(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.call, this.eventListener);
                    this.call.setConnectionToCancel(null);
                    this.call.getClient().getRouteDatabase().connected(realConnection.getRoute());
                    if (!this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                        synchronized (realConnection) {
                            this.connectionPool.put(realConnection);
                            this.call.acquireConnectionNoEvents(realConnection);
                        }
                        this.eventListener.connectionAcquired(this.call, realConnection);
                        return realConnection;
                    }
                    RealConnection connection3 = this.call.getConnection();
                    n.c(connection3);
                    this.nextRouteToTry = next;
                    Util.closeQuietly(realConnection.socket());
                    this.eventListener.connectionAcquired(this.call, connection3);
                    return connection3;
                }
                RouteSelector routeSelector = this.routeSelector;
                if (routeSelector == null) {
                    routeSelector = new RouteSelector(this.address, this.call.getClient().getRouteDatabase(), this.call, this.eventListener);
                    this.routeSelector = routeSelector;
                }
                RouteSelector.Selection next2 = routeSelector.next();
                this.routeSelection = next2;
                routes = next2.getRoutes();
                if (this.call.getCanceled()) {
                    throw new IOException("Canceled");
                }
                if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, false)) {
                    RealConnection connection4 = this.call.getConnection();
                    n.c(connection4);
                    this.eventListener.connectionAcquired(this.call, connection4);
                    return connection4;
                }
                next = next2.next();
                realConnection = new RealConnection(this.connectionPool, next);
                this.call.setConnectionToCancel(realConnection);
                realConnection.connect(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.call, this.eventListener);
                this.call.setConnectionToCancel(null);
                this.call.getClient().getRouteDatabase().connected(realConnection.getRoute());
                if (!this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                    synchronized (realConnection) {
                        this.connectionPool.put(realConnection);
                        this.call.acquireConnectionNoEvents(realConnection);
                        this.eventListener.connectionAcquired(this.call, realConnection);
                        return realConnection;
                    }
                }
                RealConnection connection5 = this.call.getConnection();
                n.c(connection5);
                this.nextRouteToTry = next;
                Util.closeQuietly(realConnection.socket());
                this.eventListener.connectionAcquired(this.call, connection5);
                return connection5;
            }
            n.c(next);
            this.nextRouteToTry = null;
            realConnection.connect(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.call, this.eventListener);
            this.call.setConnectionToCancel(null);
            this.call.getClient().getRouteDatabase().connected(realConnection.getRoute());
            if (!this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                synchronized (realConnection) {
                    this.connectionPool.put(realConnection);
                    this.call.acquireConnectionNoEvents(realConnection);
                    this.eventListener.connectionAcquired(this.call, realConnection);
                    return realConnection;
                }
            }
            RealConnection connection6 = this.call.getConnection();
            n.c(connection6);
            this.nextRouteToTry = next;
            Util.closeQuietly(realConnection.socket());
            this.eventListener.connectionAcquired(this.call, connection6);
            return connection6;
        } catch (Throwable th3) {
            this.call.setConnectionToCancel(null);
            throw th3;
        }
        routes = null;
        realConnection = new RealConnection(this.connectionPool, next);
        this.call.setConnectionToCancel(realConnection);
    }

    private final RealConnection findHealthyConnection(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled, boolean doExtensiveHealthChecks) throws IOException {
        while (true) {
            RealConnection realConnectionFindConnection = findConnection(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled);
            if (realConnectionFindConnection.isHealthy(doExtensiveHealthChecks)) {
                return realConnectionFindConnection;
            }
            realConnectionFindConnection.noNewExchanges$okhttp();
            if (this.nextRouteToTry == null) {
                RouteSelector.Selection selection = this.routeSelection;
                if (selection != null ? selection.hasNext() : true) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.routeSelector;
                    if (!(routeSelector != null ? routeSelector.hasNext() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final Route retryRoute() {
        RealConnection connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount() != 0) {
                return null;
            }
            if (Util.canReuseConnectionFor(connection.getRoute().address().url(), this.address.url())) {
                return connection.getRoute();
            }
            return null;
        }
    }

    public final ExchangeCodec find(OkHttpClient client, RealInterceptorChain chain) {
        ExchangeFinder exchangeFinder;
        n.f(client, "client");
        n.f(chain, "chain");
        try {
            exchangeFinder = this;
            try {
                return exchangeFinder.findHealthyConnection(chain.getConnectTimeoutMillis$okhttp(), chain.getReadTimeoutMillis(), chain.getWriteTimeoutMillis(), client.pingIntervalMillis(), client.retryOnConnectionFailure(), !n.a(chain.getRequest().method(), C0375hc.f28788a)).newCodec$okhttp(client, chain);
            } catch (RouteException e10) {
                e = e10;
                RouteException routeException = e;
                exchangeFinder.trackFailure(routeException.getLastConnectException());
                throw routeException;
            } catch (IOException e11) {
                e = e11;
                IOException iOException = e;
                exchangeFinder.trackFailure(iOException);
                throw new RouteException(iOException);
            }
        } catch (RouteException e12) {
            e = e12;
            exchangeFinder = this;
        } catch (IOException e13) {
            e = e13;
            exchangeFinder = this;
        }
    }

    /* JADX INFO: renamed from: getAddress$okhttp, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    public final boolean retryAfterFailure() {
        RouteSelector routeSelector;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        Route routeRetryRoute = retryRoute();
        if (routeRetryRoute != null) {
            this.nextRouteToTry = routeRetryRoute;
            return true;
        }
        RouteSelector.Selection selection = this.routeSelection;
        if ((selection == null || !selection.hasNext()) && (routeSelector = this.routeSelector) != null) {
            return routeSelector.hasNext();
        }
        return true;
    }

    public final boolean sameHostAndPort(HttpUrl url) {
        n.f(url, "url");
        HttpUrl httpUrlUrl = this.address.url();
        return url.port() == httpUrlUrl.port() && n.a(url.host(), httpUrlUrl.host());
    }

    public final void trackFailure(IOException e10) {
        n.f(e10, "e");
        this.nextRouteToTry = null;
        if ((e10 instanceof StreamResetException) && ((StreamResetException) e10).errorCode == ErrorCode.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (e10 instanceof ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }
}
