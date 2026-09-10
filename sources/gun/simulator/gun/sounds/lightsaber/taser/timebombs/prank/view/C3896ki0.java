package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ki0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3896ki0 extends ProxySelector {
    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        try {
            ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
        } catch (Exception unused) {
        }
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        try {
            List<Proxy> listSelect = ProxySelector.getDefault().select(uri);
            AbstractC2995aW.p(listSelect, "{\n                      …ri)\n                    }");
            return listSelect;
        } catch (Exception unused) {
            return AbstractC2340Cl.J(Proxy.NO_PROXY);
        }
    }
}
