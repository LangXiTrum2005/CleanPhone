package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.webkit.ProxyConfig;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3048b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5140yp f4155a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final C4500rd e;
    public final InterfaceC5166z7 f;
    public final Proxy g;
    public final ProxySelector h;
    public final ZA i;
    public final List j;
    public final List k;

    public C3048b3(String str, int i, InterfaceC5140yp interfaceC5140yp, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C4500rd c4500rd, InterfaceC5166z7 interfaceC5166z7, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        AbstractC2995aW.q(str, "uriHost");
        AbstractC2995aW.q(interfaceC5140yp, "dns");
        AbstractC2995aW.q(socketFactory, "socketFactory");
        AbstractC2995aW.q(interfaceC5166z7, "proxyAuthenticator");
        AbstractC2995aW.q(list, "protocols");
        AbstractC2995aW.q(list2, "connectionSpecs");
        AbstractC2995aW.q(proxySelector, "proxySelector");
        this.f4155a = interfaceC5140yp;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = c4500rd;
        this.f = interfaceC5166z7;
        this.g = proxy;
        this.h = proxySelector;
        YA ya = new YA();
        String str2 = sSLSocketFactory != null ? "https" : ProxyConfig.MATCH_HTTP;
        if (AbstractC3089ba0.o0(str2, ProxyConfig.MATCH_HTTP)) {
            ya.f4008a = ProxyConfig.MATCH_HTTP;
        } else {
            if (!AbstractC3089ba0.o0(str2, "https")) {
                throw new IllegalArgumentException(AbstractC2995aW.v0(str2, "unexpected scheme: "));
            }
            ya.f4008a = "https";
        }
        char[] cArr = ZA.k;
        String strC = AbstractC4496rb.C(C3336eJ.t(str, 0, 0, false, 7));
        if (strC == null) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(str, "unexpected host: "));
        }
        ya.d = strC;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Integer.valueOf(i), "unexpected port: ").toString());
        }
        ya.e = i;
        this.i = ya.a();
        this.j = Vg0.w(list);
        this.k = Vg0.w(list2);
    }

    public final boolean a(C3048b3 c3048b3) {
        AbstractC2995aW.q(c3048b3, "that");
        return AbstractC2995aW.i(this.f4155a, c3048b3.f4155a) && AbstractC2995aW.i(this.f, c3048b3.f) && AbstractC2995aW.i(this.j, c3048b3.j) && AbstractC2995aW.i(this.k, c3048b3.k) && AbstractC2995aW.i(this.h, c3048b3.h) && AbstractC2995aW.i(this.g, c3048b3.g) && AbstractC2995aW.i(this.c, c3048b3.c) && AbstractC2995aW.i(this.d, c3048b3.d) && AbstractC2995aW.i(this.e, c3048b3.e) && this.i.e == c3048b3.i.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3048b3) {
            C3048b3 c3048b3 = (C3048b3) obj;
            if (AbstractC2995aW.i(this.i, c3048b3.i) && a(c3048b3)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((Objects.hashCode(this.g) + ((this.h.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.f.hashCode() + ((this.f4155a.hashCode() + DM.d(this.i.i, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        ZA za = this.i;
        sb.append(za.d);
        sb.append(':');
        sb.append(za.e);
        sb.append(", ");
        Proxy proxy = this.g;
        return DM.l(sb, proxy != null ? AbstractC2995aW.v0(proxy, "proxy=") : AbstractC2995aW.v0(this.h, "proxySelector="), '}');
    }
}
