package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Wo0 extends ProxySelector {
    public static final List d = Collections.singletonList(Proxy.NO_PROXY);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProxySelector f3942a = ProxySelector.getDefault();
    public final String b;
    public final int c;

    public Wo0(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f3942a.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return (this.b.equalsIgnoreCase(uri.getHost()) && this.c == uri.getPort()) ? d : this.f3942a.select(uri);
        }
        throw new IllegalArgumentException("URI can't be null");
    }
}
