package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.graveside;
import okhttp3.monoploid;
import okhttp3.trm;
import org.jacoco.core.runtime.AgentOptions;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.cord;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RouteSelector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 /2\u00020\u0001:\u0002\r\u0019B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010#R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010#¨\u00060"}, d2 = {"Lokhttp3/internal/connection/impromptu;", "", "Lokhttp3/attabal;", AgentOptions.ADDRESS, "Lokhttp3/internal/connection/competently;", "routeDatabase", "Lokhttp3/marial;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/monoploid;", "eventListener", "<init>", "(Lokhttp3/attabal;Lokhttp3/internal/connection/competently;Lokhttp3/marial;Lokhttp3/monoploid;)V", "", "attabal", "()Z", "Lokhttp3/internal/connection/impromptu$saneness;", "dern", "()Lokhttp3/internal/connection/impromptu$saneness;", "Lokhttp3/graveside;", "url", "Ljava/net/Proxy;", "proxy", "", "beachfront", "(Lokhttp3/graveside;Ljava/net/Proxy;)V", "saneness", "wireman", "()Ljava/net/Proxy;", "marial", "(Ljava/net/Proxy;)V", "Lokhttp3/attabal;", "Lokhttp3/internal/connection/competently;", "Lokhttp3/marial;", "Lokhttp3/monoploid;", "", "Ljava/util/List;", "proxies", "", "I", "nextProxyIndex", "Ljava/net/InetSocketAddress;", "competently", "inetSocketAddresses", "", "Lokhttp3/trm;", "impromptu", "postponedRoutes", "taiyuan", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class impromptu {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final okhttp3.attabal address;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public int nextProxyIndex;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public List<? extends InetSocketAddress> inetSocketAddresses;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final okhttp3.marial call;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final List<trm> postponedRoutes;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public List<? extends Proxy> proxies;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final competently routeDatabase;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final monoploid eventListener;

    /* JADX INFO: renamed from: okhttp3.internal.connection.impromptu$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: RouteSelector.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lokhttp3/internal/connection/impromptu$attabal;", "", "<init>", "()V", "Ljava/net/InetSocketAddress;", "", "attabal", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String attabal(InetSocketAddress inetSocketAddress) {
            Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                Intrinsics.checkNotNullExpressionValue(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            Intrinsics.checkNotNullExpressionValue(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: RouteSelector.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/connection/impromptu$saneness;", "", "", "Lokhttp3/trm;", "routes", "<init>", "(Ljava/util/List;)V", "", "saneness", "()Z", "dern", "()Lokhttp3/trm;", "attabal", "Ljava/util/List;", "()Ljava/util/List;", "", "I", "nextRouteIndex", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final List<trm> routes;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public int nextRouteIndex;

        public saneness(List<trm> routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.routes = routes;
        }

        public final List<trm> attabal() {
            return this.routes;
        }

        public final trm dern() {
            if (!saneness()) {
                throw new NoSuchElementException();
            }
            List<trm> list = this.routes;
            int i = this.nextRouteIndex;
            this.nextRouteIndex = i + 1;
            return list.get(i);
        }

        public final boolean saneness() {
            return this.nextRouteIndex < this.routes.size();
        }
    }

    public impromptu(okhttp3.attabal address, competently routeDatabase, okhttp3.marial call, monoploid eventListener) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.eventListener = eventListener;
        this.proxies = adultoid.formularize();
        this.inetSocketAddresses = adultoid.formularize();
        this.postponedRoutes = new ArrayList();
        beachfront(address.getUrl(), address.getProxy());
    }

    public static final List<Proxy> competently(Proxy proxy, graveside gravesideVar, impromptu impromptuVar) {
        if (proxy != null) {
            return p002kotlin.collections.graveside.marial(proxy);
        }
        URI uriGraveside = gravesideVar.graveside();
        if (uriGraveside.getHost() == null) {
            return hereditist.wireman.gintrap(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = impromptuVar.address.getProxySelector().select(uriGraveside);
        List<Proxy> list = proxiesOrNull;
        if (list == null || list.isEmpty()) {
            return hereditist.wireman.gintrap(Proxy.NO_PROXY);
        }
        Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
        return hereditist.wireman.peridotite(proxiesOrNull);
    }

    public final boolean attabal() {
        return saneness() || !this.postponedRoutes.isEmpty();
    }

    public final void beachfront(graveside url, Proxy proxy) {
        this.eventListener.arytenoidectomy(this.call, url);
        List<Proxy> listCompetently = competently(proxy, url, this);
        this.proxies = listCompetently;
        this.nextProxyIndex = 0;
        this.eventListener.kowloon(this.call, url, listCompetently);
    }

    public final saneness dern() throws IOException {
        if (!attabal()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (saneness()) {
            Proxy proxyWireman = wireman();
            Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
            while (it.hasNext()) {
                trm trmVar = new trm(this.address, proxyWireman, it.next());
                if (this.routeDatabase.dern(trmVar)) {
                    this.postponedRoutes.add(trmVar);
                } else {
                    arrayList.add(trmVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            cord.stratoscope(arrayList, this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new saneness(arrayList);
    }

    public final void marial(Proxy proxy) throws IOException {
        String host;
        int port;
        List<InetAddress> listLookup;
        ArrayList arrayList = new ArrayList();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            host = this.address.getUrl().getHost();
            port = this.address.getUrl().getOrg.jacoco.core.runtime.AgentOptions.PORT java.lang.String();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(Intrinsics.arytenoidectomy("Proxy.address() is not an InetSocketAddress: ", proxyAddress.getClass()).toString());
            }
            Companion companion = INSTANCE;
            Intrinsics.checkNotNullExpressionValue(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            host = companion.attabal(inetSocketAddress);
            port = inetSocketAddress.getPort();
        }
        if (1 > port || port >= 65536) {
            throw new SocketException("No route to " + host + ':' + port + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(host, port));
            return;
        }
        if (hereditist.wireman.taiyuan(host)) {
            listLookup = p002kotlin.collections.graveside.marial(InetAddress.getByName(host));
        } else {
            this.eventListener.triweekly(this.call, host);
            listLookup = this.address.getDns().lookup(host);
            if (listLookup.isEmpty()) {
                throw new UnknownHostException(this.address.getDns() + " returned no addresses for " + host);
            }
            this.eventListener.impassible(this.call, host, listLookup);
        }
        Iterator<InetAddress> it = listLookup.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), port));
        }
    }

    public final boolean saneness() {
        return this.nextProxyIndex < this.proxies.size();
    }

    public final Proxy wireman() throws IOException {
        if (saneness()) {
            List<? extends Proxy> list = this.proxies;
            int i = this.nextProxyIndex;
            this.nextProxyIndex = i + 1;
            Proxy proxy = list.get(i);
            marial(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.address.getUrl().getHost() + "; exhausted proxy configurations: " + this.proxies);
    }
}
