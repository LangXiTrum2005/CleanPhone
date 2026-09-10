package xn;

import com.google.android.gms.internal.ads.ws;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f53910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f53911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f53912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f53913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f53914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f53915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f53916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f53917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f53918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f53919j;

    public a(String uriHost, int i10, b dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.n.f(uriHost, "uriHost");
        kotlin.jvm.internal.n.f(dns, "dns");
        kotlin.jvm.internal.n.f(socketFactory, "socketFactory");
        kotlin.jvm.internal.n.f(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.n.f(protocols, "protocols");
        kotlin.jvm.internal.n.f(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.n.f(proxySelector, "proxySelector");
        this.f53910a = dns;
        this.f53911b = socketFactory;
        this.f53912c = sSLSocketFactory;
        this.f53913d = hostnameVerifier;
        this.f53914e = fVar;
        this.f53915f = proxyAuthenticator;
        this.f53916g = proxySelector;
        ws wsVar = new ws();
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            wsVar.f21594b = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            wsVar.f21594b = "https";
        }
        String strO = x7.a.O(b.e(uriHost, 0, 0, 7));
        if (strO == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        wsVar.f21598f = strO;
        if (1 > i10 || i10 >= 65536) {
            throw new IllegalArgumentException(l1.d.e(i10, "unexpected port: ").toString());
        }
        wsVar.f21595c = i10;
        this.f53917h = wsVar.a();
        this.f53918i = yn.a.v(protocols);
        this.f53919j = yn.a.v(connectionSpecs);
    }

    public final boolean a(a that) {
        kotlin.jvm.internal.n.f(that, "that");
        return kotlin.jvm.internal.n.a(this.f53910a, that.f53910a) && kotlin.jvm.internal.n.a(this.f53915f, that.f53915f) && kotlin.jvm.internal.n.a(this.f53918i, that.f53918i) && kotlin.jvm.internal.n.a(this.f53919j, that.f53919j) && kotlin.jvm.internal.n.a(this.f53916g, that.f53916g) && kotlin.jvm.internal.n.a(this.f53912c, that.f53912c) && kotlin.jvm.internal.n.a(this.f53913d, that.f53913d) && kotlin.jvm.internal.n.a(this.f53914e, that.f53914e) && this.f53917h.f53993e == that.f53917h.f53993e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.n.a(this.f53917h, aVar.f53917h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f53914e) + ((Objects.hashCode(this.f53913d) + ((Objects.hashCode(this.f53912c) + ((this.f53916g.hashCode() + q4.a.g(q4.a.g((this.f53915f.hashCode() + ((this.f53910a.hashCode() + d5.u.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f53917h.f53996h)) * 31)) * 31, 31, this.f53918i), 31, this.f53919j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        m mVar = this.f53917h;
        sb2.append(mVar.f53992d);
        sb2.append(':');
        sb2.append(mVar.f53993e);
        sb2.append(", ");
        sb2.append("proxySelector=" + this.f53916g);
        sb2.append('}');
        return sb2.toString();
    }
}
