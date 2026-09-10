package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import com.ironsource.C3460cc;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import okhttp3.graveside;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.monoploid;
import okhttp3.rotuma;
import okhttp3.trm;
import org.jacoco.core.runtime.AgentOptions;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExchangeFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010'\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010(J7\u0010)\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u0018H\u0002¢\u0006\u0004\b)\u0010*J\u0011\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010.R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00103R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00105R\u0018\u00109\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u00108R\u0016\u0010;\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010:R\u0016\u0010<\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010:R\u0016\u0010>\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010:R\u0018\u0010A\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lokhttp3/internal/connection/wireman;", "", "Lokhttp3/internal/connection/beachfront;", "connectionPool", "Lokhttp3/attabal;", AgentOptions.ADDRESS, "Lokhttp3/internal/connection/marial;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/monoploid;", "eventListener", "<init>", "(Lokhttp3/internal/connection/beachfront;Lokhttp3/attabal;Lokhttp3/internal/connection/marial;Lokhttp3/monoploid;)V", "Lokhttp3/rotuma;", "client", "Lpaddywack/competently;", "chain", "Lpaddywack/wireman;", "attabal", "(Lokhttp3/rotuma;Lpaddywack/competently;)Lpaddywack/wireman;", "Ljava/io/IOException;", "e", "", "impromptu", "(Ljava/io/IOException;)V", "", "marial", "()Z", "Lokhttp3/graveside;", "url", "competently", "(Lokhttp3/graveside;)Z", "", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "connectionRetryEnabled", "doExtensiveHealthChecks", "Lokhttp3/internal/connection/RealConnection;", "dern", "(IIIIZZ)Lokhttp3/internal/connection/RealConnection;", "saneness", "(IIIIZ)Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/trm;", "beachfront", "()Lokhttp3/trm;", "Lokhttp3/internal/connection/beachfront;", "Lokhttp3/attabal;", "wireman", "()Lokhttp3/attabal;", "Lokhttp3/internal/connection/marial;", "Lokhttp3/monoploid;", "Lokhttp3/internal/connection/impromptu$saneness;", "Lokhttp3/internal/connection/impromptu$saneness;", "routeSelection", "Lokhttp3/internal/connection/impromptu;", "Lokhttp3/internal/connection/impromptu;", "routeSelector", "I", "refusedStreamCount", "connectionShutdownCount", "taiyuan", "otherFailureCount", "cutely", "Lokhttp3/trm;", "nextRouteToTry", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final beachfront connectionPool;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public impromptu routeSelector;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public int refusedStreamCount;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public trm nextRouteToTry;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final marial call;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public int connectionShutdownCount;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public impromptu.saneness routeSelection;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final okhttp3.attabal address;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public int otherFailureCount;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final monoploid eventListener;

    public wireman(beachfront connectionPool, okhttp3.attabal address, marial call, monoploid eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.connectionPool = connectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
    }

    public final paddywack.wireman attabal(rotuma client, paddywack.competently chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            try {
                return dern(chain.getConnectTimeoutMillis(), chain.getReadTimeoutMillis(), chain.getWriteTimeoutMillis(), client.getPingIntervalMillis(), client.getRetryOnConnectionFailure(), !Intrinsics.wireman(chain.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getMethod(), C3460cc.a)).gintrap(client, chain);
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                impromptu(iOException);
                throw new RouteException(iOException);
            } catch (RouteException e2) {
                e = e2;
                RouteException routeException = e;
                impromptu(routeException.getLastConnectException());
                throw routeException;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (RouteException e4) {
            e = e4;
        }
    }

    public final trm beachfront() {
        RealConnection connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount() != 0) {
                return null;
            }
            if (hereditist.wireman.cutely(connection.getRoute().getOrg.jacoco.core.runtime.AgentOptions.ADDRESS java.lang.String().getUrl(), getAddress().getUrl())) {
                return connection.getRoute();
            }
            return null;
        }
    }

    public final boolean competently(graveside url) {
        Intrinsics.checkNotNullParameter(url, "url");
        graveside url2 = this.address.getUrl();
        return url.getOrg.jacoco.core.runtime.AgentOptions.PORT java.lang.String() == url2.getOrg.jacoco.core.runtime.AgentOptions.PORT java.lang.String() && Intrinsics.wireman(url.getHost(), url2.getHost());
    }

    public final RealConnection dern(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled, boolean doExtensiveHealthChecks) throws IOException {
        while (true) {
            RealConnection realConnectionSaneness = saneness(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled);
            boolean z = connectionRetryEnabled;
            int i = pingIntervalMillis;
            int i2 = writeTimeout;
            int i3 = readTimeout;
            int i4 = connectTimeout;
            if (realConnectionSaneness.adultoid(doExtensiveHealthChecks)) {
                return realConnectionSaneness;
            }
            realConnectionSaneness.preprohormone();
            if (this.nextRouteToTry == null) {
                impromptu.saneness sanenessVar = this.routeSelection;
                if (sanenessVar == null ? true : sanenessVar.saneness()) {
                    continue;
                } else {
                    impromptu impromptuVar = this.routeSelector;
                    if (!(impromptuVar != null ? impromptuVar.attabal() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
            connectTimeout = i4;
            readTimeout = i3;
            writeTimeout = i2;
            pingIntervalMillis = i;
            connectionRetryEnabled = z;
        }
    }

    public final void impromptu(IOException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.nextRouteToTry = null;
        if ((e instanceof StreamResetException) && ((StreamResetException) e).errorCode == ErrorCode.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (e instanceof ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }

    public final boolean marial() {
        impromptu impromptuVar;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        trm trmVarBeachfront = beachfront();
        if (trmVarBeachfront != null) {
            this.nextRouteToTry = trmVarBeachfront;
            return true;
        }
        impromptu.saneness sanenessVar = this.routeSelection;
        if ((sanenessVar != null && sanenessVar.saneness()) || (impromptuVar = this.routeSelector) == null) {
            return true;
        }
        return impromptuVar.attabal();
    }

    /* JADX WARN: Code duplicated, block: B:57:0x012d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0147  */
    /* JADX WARN: Code duplicated, block: B:77:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final RealConnection saneness(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled) throws IOException {
        List<trm> listAttabal;
        RealConnection realConnection;
        Socket socketRotuma;
        if (this.call.getCanceled()) {
            throw new IOException("Canceled");
        }
        RealConnection connection = this.call.getConnection();
        if (connection != null) {
            synchronized (connection) {
                try {
                    socketRotuma = (connection.getNoNewExchanges() || !competently(connection.getRoute().getOrg.jacoco.core.runtime.AgentOptions.ADDRESS java.lang.String().getUrl())) ? this.call.rotuma() : null;
                    Unit unit = Unit.f29295attabal;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.call.getConnection() != null) {
                if (socketRotuma == null) {
                    return connection;
                }
                throw new IllegalStateException("Check failed.");
            }
            if (socketRotuma != null) {
                hereditist.wireman.triweekly(socketRotuma);
            }
            this.eventListener.formularize(this.call, connection);
        }
        this.refusedStreamCount = 0;
        this.connectionShutdownCount = 0;
        this.otherFailureCount = 0;
        if (this.connectionPool.attabal(this.address, this.call, null, false)) {
            RealConnection connection2 = this.call.getConnection();
            Intrinsics.beachfront(connection2);
            this.eventListener.apical(this.call, connection2);
            return connection2;
        }
        trm trmVarDern = this.nextRouteToTry;
        try {
            if (trmVarDern == null) {
                impromptu.saneness sanenessVar = this.routeSelection;
                if (sanenessVar != null) {
                    Intrinsics.beachfront(sanenessVar);
                    if (sanenessVar.saneness()) {
                        impromptu.saneness sanenessVar2 = this.routeSelection;
                        Intrinsics.beachfront(sanenessVar2);
                        trmVarDern = sanenessVar2.dern();
                    }
                    realConnection = new RealConnection(this.connectionPool, trmVarDern);
                    this.call.cord(realConnection);
                    realConnection.beachfront(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.call, this.eventListener);
                    this.call.cord(null);
                    this.call.getClient().getRouteDatabase().attabal(realConnection.getRoute());
                    if (this.connectionPool.attabal(this.address, this.call, listAttabal, true)) {
                        RealConnection connection3 = this.call.getConnection();
                        Intrinsics.beachfront(connection3);
                        this.nextRouteToTry = trmVarDern;
                        hereditist.wireman.triweekly(realConnection.oilcan());
                        this.eventListener.apical(this.call, connection3);
                        return connection3;
                    }
                    synchronized (realConnection) {
                        this.connectionPool.beachfront(realConnection);
                        this.call.wireman(realConnection);
                        Unit unit2 = Unit.f29295attabal;
                    }
                    this.eventListener.apical(this.call, realConnection);
                    return realConnection;
                }
                impromptu impromptuVar = this.routeSelector;
                if (impromptuVar == null) {
                    impromptuVar = new impromptu(this.address, this.call.getClient().getRouteDatabase(), this.call, this.eventListener);
                    this.routeSelector = impromptuVar;
                }
                impromptu.saneness sanenessVarDern = impromptuVar.dern();
                this.routeSelection = sanenessVarDern;
                listAttabal = sanenessVarDern.attabal();
                if (this.call.getCanceled()) {
                    throw new IOException("Canceled");
                }
                if (this.connectionPool.attabal(this.address, this.call, listAttabal, false)) {
                    RealConnection connection4 = this.call.getConnection();
                    Intrinsics.beachfront(connection4);
                    this.eventListener.apical(this.call, connection4);
                    return connection4;
                }
                trmVarDern = sanenessVarDern.dern();
                realConnection = new RealConnection(this.connectionPool, trmVarDern);
                this.call.cord(realConnection);
                realConnection.beachfront(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.call, this.eventListener);
                this.call.cord(null);
                this.call.getClient().getRouteDatabase().attabal(realConnection.getRoute());
                if (this.connectionPool.attabal(this.address, this.call, listAttabal, true)) {
                    RealConnection connection5 = this.call.getConnection();
                    Intrinsics.beachfront(connection5);
                    this.nextRouteToTry = trmVarDern;
                    hereditist.wireman.triweekly(realConnection.oilcan());
                    this.eventListener.apical(this.call, connection5);
                    return connection5;
                }
                synchronized (realConnection) {
                    this.connectionPool.beachfront(realConnection);
                    this.call.wireman(realConnection);
                    Unit unit3 = Unit.f29295attabal;
                    this.eventListener.apical(this.call, realConnection);
                    return realConnection;
                }
            }
            Intrinsics.beachfront(trmVarDern);
            this.nextRouteToTry = null;
            realConnection.beachfront(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.call, this.eventListener);
            this.call.cord(null);
            this.call.getClient().getRouteDatabase().attabal(realConnection.getRoute());
            if (this.connectionPool.attabal(this.address, this.call, listAttabal, true)) {
                RealConnection connection6 = this.call.getConnection();
                Intrinsics.beachfront(connection6);
                this.nextRouteToTry = trmVarDern;
                hereditist.wireman.triweekly(realConnection.oilcan());
                this.eventListener.apical(this.call, connection6);
                return connection6;
            }
            synchronized (realConnection) {
                this.connectionPool.beachfront(realConnection);
                this.call.wireman(realConnection);
                Unit unit4 = Unit.f29295attabal;
                this.eventListener.apical(this.call, realConnection);
                return realConnection;
            }
        } catch (Throwable th2) {
            this.call.cord(null);
            throw th2;
        }
        listAttabal = null;
        realConnection = new RealConnection(this.connectionPool, trmVarDern);
        this.call.cord(realConnection);
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final okhttp3.attabal getAddress() {
        return this.address;
    }
}
