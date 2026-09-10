package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.k00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3834k00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3048b3 f4578a;
    public final Proxy b;
    public final InetSocketAddress c;

    public C3834k00(C3048b3 c3048b3, Proxy proxy, InetSocketAddress inetSocketAddress) {
        AbstractC2995aW.q(c3048b3, "address");
        AbstractC2995aW.q(inetSocketAddress, "socketAddress");
        this.f4578a = c3048b3;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3834k00) {
            C3834k00 c3834k00 = (C3834k00) obj;
            if (AbstractC2995aW.i(c3834k00.f4578a, this.f4578a) && AbstractC2995aW.i(c3834k00.b, this.b) && AbstractC2995aW.i(c3834k00.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.f4578a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
