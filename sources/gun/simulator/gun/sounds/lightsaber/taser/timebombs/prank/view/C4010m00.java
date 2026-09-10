package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.app.NotificationCompat;
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

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.m00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4010m00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3048b3 f4675a;
    public final C3830jy b;
    public final InterfaceC2409Fc c;
    public final AbstractC2865Wr d;
    public final List e;
    public int f;
    public List g;
    public final ArrayList h;

    public C4010m00(C3048b3 c3048b3, C3830jy c3830jy, IX ix, AbstractC2865Wr abstractC2865Wr) {
        List<Proxy> listK;
        AbstractC2995aW.q(c3048b3, "address");
        AbstractC2995aW.q(c3830jy, "routeDatabase");
        AbstractC2995aW.q(ix, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(abstractC2865Wr, "eventListener");
        this.f4675a = c3048b3;
        this.b = c3830jy;
        this.c = ix;
        this.d = abstractC2865Wr;
        C2812Uq c2812Uq = C2812Uq.f3846a;
        this.e = c2812Uq;
        this.g = c2812Uq;
        this.h = new ArrayList();
        ZA za = c3048b3.i;
        abstractC2865Wr.proxySelectStart(ix, za);
        Proxy proxy = c3048b3.g;
        if (proxy != null) {
            listK = AbstractC2340Cl.J(proxy);
        } else {
            URI uriH = za.h();
            if (uriH.getHost() == null) {
                listK = Vg0.k(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = c3048b3.h.select(uriH);
                List<Proxy> list = listSelect;
                if (list == null || list.isEmpty()) {
                    listK = Vg0.k(Proxy.NO_PROXY);
                } else {
                    AbstractC2995aW.p(listSelect, "proxiesOrNull");
                    listK = Vg0.w(listSelect);
                }
            }
        }
        this.e = listK;
        this.f = 0;
        abstractC2865Wr.proxySelectEnd(ix, za, listK);
    }

    public final boolean a() {
        return (this.f < this.e.size()) || (this.h.isEmpty() ^ true);
    }

    public final C2329Ca b() {
        String hostAddress;
        int port;
        boolean zContains;
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f < this.e.size()) {
            boolean z = this.f < this.e.size();
            C3048b3 c3048b3 = this.f4675a;
            if (!z) {
                throw new SocketException("No route to " + c3048b3.i.d + "; exhausted proxy configurations: " + this.e);
            }
            List list = this.e;
            int i = this.f;
            this.f = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            ArrayList arrayList2 = new ArrayList();
            this.g = arrayList2;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                ZA za = c3048b3.i;
                hostAddress = za.d;
                port = za.e;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(AbstractC2995aW.v0(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ").toString());
                }
                AbstractC2995aW.p(socketAddressAddress, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostAddress = inetSocketAddress.getHostName();
                    AbstractC2995aW.p(hostAddress, "hostName");
                } else {
                    hostAddress = address.getHostAddress();
                    AbstractC2995aW.p(hostAddress, "address.hostAddress");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
            } else {
                AbstractC2865Wr abstractC2865Wr = this.d;
                InterfaceC2409Fc interfaceC2409Fc = this.c;
                abstractC2865Wr.dnsStart(interfaceC2409Fc, hostAddress);
                List listC = ((G7) c3048b3.f4155a).C(hostAddress);
                if (listC.isEmpty()) {
                    throw new UnknownHostException(c3048b3.f4155a + " returned no addresses for " + hostAddress);
                }
                abstractC2865Wr.dnsEnd(interfaceC2409Fc, hostAddress, listC);
                Iterator it = listC.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InetSocketAddress((InetAddress) it.next(), port));
                }
            }
            Iterator it2 = this.g.iterator();
            while (it2.hasNext()) {
                C3834k00 c3834k00 = new C3834k00(this.f4675a, proxy, (InetSocketAddress) it2.next());
                C3830jy c3830jy = this.b;
                synchronized (c3830jy) {
                    zContains = c3830jy.f4577a.contains(c3834k00);
                }
                if (zContains) {
                    this.h.add(c3834k00);
                } else {
                    arrayList.add(c3834k00);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC2801Uf.a0(this.h, arrayList);
            this.h.clear();
        }
        C2329Ca c2329Ca = new C2329Ca();
        c2329Ca.b = arrayList;
        return c2329Ca;
    }
}
