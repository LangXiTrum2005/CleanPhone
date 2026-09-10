package sg.bigo.ads.core.player.a;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import sg.bigo.ads.common.m;

/* JADX INFO: loaded from: classes7.dex */
final class f extends ProxySelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<Proxy> f48760a = Arrays.asList(Proxy.NO_PROXY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProxySelector f48761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f48762c;
    private final int d;

    private f(ProxySelector proxySelector, String str, int i2) {
        this.f48761b = (ProxySelector) m.a(proxySelector);
        this.f48762c = (String) m.a(str);
        this.d = i2;
    }

    public static void a(String str, int i2) {
        ProxySelector.setDefault(new f(ProxySelector.getDefault(), str, i2));
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f48761b.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        return (this.f48762c.equals(uri.getHost()) && this.d == uri.getPort()) ? f48760a : this.f48761b.select(uri);
    }
}
