package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final s f36104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n f36105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final SocketFactory f36106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b f36107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List<w> f36108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final List<j> f36109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final ProxySelector f36110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Proxy f36111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final SSLSocketFactory f36112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final HostnameVerifier f36113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final f f36114k;

    public a(String str, int i10, n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b bVar, Proxy proxy, List<w> list, List<j> list2, ProxySelector proxySelector) {
        this.f36104a = new s.a().f(sSLSocketFactory != null ? "https" : "http").b(str).a(i10).a();
        if (nVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f36105b = nVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f36106c = socketFactory;
        if (bVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f36107d = bVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f36108e = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f36109f = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f36110g = proxySelector;
        this.f36111h = proxy;
        this.f36112i = sSLSocketFactory;
        this.f36113j = hostnameVerifier;
        this.f36114k = fVar;
    }

    public f a() {
        return this.f36114k;
    }

    public List<j> b() {
        return this.f36109f;
    }

    public n c() {
        return this.f36105b;
    }

    public HostnameVerifier d() {
        return this.f36113j;
    }

    public List<w> e() {
        return this.f36108e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f36104a.equals(aVar.f36104a) && a(aVar);
    }

    public Proxy f() {
        return this.f36111h;
    }

    public b g() {
        return this.f36107d;
    }

    public ProxySelector h() {
        return this.f36110g;
    }

    public int hashCode() {
        int iHashCode = (this.f36110g.hashCode() + ((this.f36109f.hashCode() + ((this.f36108e.hashCode() + ((this.f36107d.hashCode() + ((this.f36105b.hashCode() + ((this.f36104a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f36111h;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f36112i;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f36113j;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.f36114k;
        return iHashCode4 + (fVar != null ? fVar.hashCode() : 0);
    }

    public SocketFactory i() {
        return this.f36106c;
    }

    public SSLSocketFactory j() {
        return this.f36112i;
    }

    public s k() {
        return this.f36104a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        sb2.append(this.f36104a.g());
        sb2.append(":");
        sb2.append(this.f36104a.j());
        if (this.f36111h != null) {
            sb2.append(", proxy=");
            sb2.append(this.f36111h);
        } else {
            sb2.append(", proxySelector=");
            sb2.append(this.f36110g);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public boolean a(a aVar) {
        return this.f36105b.equals(aVar.f36105b) && this.f36107d.equals(aVar.f36107d) && this.f36108e.equals(aVar.f36108e) && this.f36109f.equals(aVar.f36109f) && this.f36110g.equals(aVar.f36110g) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f36111h, aVar.f36111h) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f36112i, aVar.f36112i) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f36113j, aVar.f36113j) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f36114k, aVar.f36114k) && k().j() == aVar.k().j();
    }
}
