package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class v implements Cloneable {
    static final List<w> A = com.mbridge.msdk.thrid.okhttp.internal.c.a(w.HTTP_2, w.HTTP_1_1);
    static final List<j> B = com.mbridge.msdk.thrid.okhttp.internal.c.a(j.f36611h, j.f36613j);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final m f36681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Proxy f36682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<w> f36683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final List<j> f36684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List<t> f36685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final List<t> f36686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final o.c f36687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final ProxySelector f36688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final l f36689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final SocketFactory f36690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final SSLSocketFactory f36691k;
    final com.mbridge.msdk.thrid.okhttp.internal.tls.c l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final HostnameVerifier f36692m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final f f36693n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.b f36694o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.b f36695p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final i f36696q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final n f36697r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final boolean f36698s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final boolean f36699t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final boolean f36700u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final int f36701v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final int f36702w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final int f36703x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final int f36704y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final int f36705z;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a extends com.mbridge.msdk.thrid.okhttp.internal.a {
        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(r.a aVar, String str) {
            aVar.a(str);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void b(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
            iVar.b(cVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(r.a aVar, String str, String str2) {
            aVar.b(str, str2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public boolean a(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
            return iVar.a(cVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public com.mbridge.msdk.thrid.okhttp.internal.connection.c a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c0 c0Var) {
            return iVar.a(aVar, gVar, c0Var);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.a aVar2) {
            return aVar.a(aVar2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public Socket a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar) {
            return iVar.a(aVar, gVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public com.mbridge.msdk.thrid.okhttp.internal.connection.d a(i iVar) {
            return iVar.f36253e;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public int a(a0.a aVar) {
            return aVar.f36129c;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(j jVar, SSLSocket sSLSocket, boolean z10) {
            jVar.a(sSLSocket, z10);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public IOException a(d dVar, IOException iOException) {
            return ((x) dVar).a(iOException);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        m f36706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Proxy f36707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List<w> f36708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        List<j> f36709d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final List<t> f36710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final List<t> f36711f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        o.c f36712g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ProxySelector f36713h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        l f36714i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        SocketFactory f36715j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        SSLSocketFactory f36716k;
        com.mbridge.msdk.thrid.okhttp.internal.tls.c l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        HostnameVerifier f36717m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        f f36718n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        com.mbridge.msdk.thrid.okhttp.b f36719o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        com.mbridge.msdk.thrid.okhttp.b f36720p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        i f36721q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        n f36722r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f36723s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f36724t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f36725u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f36726v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f36727w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f36728x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f36729y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f36730z;

        public b() {
            this.f36710e = new ArrayList();
            this.f36711f = new ArrayList();
            this.f36706a = new m();
            this.f36708c = v.A;
            this.f36709d = v.B;
            this.f36712g = o.factory(o.NONE);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f36713h = proxySelector;
            if (proxySelector == null) {
                this.f36713h = new com.mbridge.msdk.thrid.okhttp.internal.proxy.a();
            }
            this.f36714i = l.f36634a;
            this.f36715j = SocketFactory.getDefault();
            this.f36717m = com.mbridge.msdk.thrid.okhttp.internal.tls.d.f36607a;
            this.f36718n = f.f36174c;
            com.mbridge.msdk.thrid.okhttp.b bVar = com.mbridge.msdk.thrid.okhttp.b.f36138a;
            this.f36719o = bVar;
            this.f36720p = bVar;
            this.f36721q = new i();
            this.f36722r = n.f36643a;
            this.f36723s = true;
            this.f36724t = true;
            this.f36725u = true;
            this.f36726v = 0;
            this.f36727w = 10000;
            this.f36728x = 10000;
            this.f36729y = 10000;
            this.f36730z = 0;
        }

        public b a(long j10, TimeUnit timeUnit) {
            this.f36726v = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b b(long j10, TimeUnit timeUnit) {
            this.f36727w = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b c(long j10, TimeUnit timeUnit) {
            this.f36730z = com.mbridge.msdk.thrid.okhttp.internal.c.a("interval", j10, timeUnit);
            return this;
        }

        public b d(long j10, TimeUnit timeUnit) {
            this.f36728x = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b e(long j10, TimeUnit timeUnit) {
            this.f36729y = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b a(n nVar) {
            if (nVar == null) {
                throw new NullPointerException("dns == null");
            }
            this.f36722r = nVar;
            return this;
        }

        public b b(boolean z10) {
            this.f36725u = z10;
            return this;
        }

        public b a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.f36717m = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        public b a(i iVar) {
            if (iVar != null) {
                this.f36721q = iVar;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        public b a(boolean z10) {
            this.f36724t = z10;
            return this;
        }

        public b a(m mVar) {
            if (mVar != null) {
                this.f36706a = mVar;
                return this;
            }
            throw new IllegalArgumentException("dispatcher == null");
        }

        public b a(List<w> list) {
            ArrayList arrayList = new ArrayList(list);
            w wVar = w.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(wVar) && !arrayList.contains(w.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            }
            if (arrayList.contains(wVar) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            }
            if (!arrayList.contains(w.HTTP_1_0)) {
                if (!arrayList.contains(null)) {
                    arrayList.remove(w.SPDY_3);
                    this.f36708c = Collections.unmodifiableList(arrayList);
                    return this;
                }
                throw new IllegalArgumentException("protocols must not contain null");
            }
            throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
        }

        public b a(o oVar) {
            if (oVar != null) {
                this.f36712g = o.factory(oVar);
                return this;
            }
            throw new NullPointerException("eventListener == null");
        }

        public v a() {
            return new v(this);
        }

        public b(v vVar) {
            ArrayList arrayList = new ArrayList();
            this.f36710e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f36711f = arrayList2;
            this.f36706a = vVar.f36681a;
            this.f36707b = vVar.f36682b;
            this.f36708c = vVar.f36683c;
            this.f36709d = vVar.f36684d;
            arrayList.addAll(vVar.f36685e);
            arrayList2.addAll(vVar.f36686f);
            this.f36712g = vVar.f36687g;
            this.f36713h = vVar.f36688h;
            this.f36714i = vVar.f36689i;
            this.f36715j = vVar.f36690j;
            this.f36716k = vVar.f36691k;
            this.l = vVar.l;
            this.f36717m = vVar.f36692m;
            this.f36718n = vVar.f36693n;
            this.f36719o = vVar.f36694o;
            this.f36720p = vVar.f36695p;
            this.f36721q = vVar.f36696q;
            this.f36722r = vVar.f36697r;
            this.f36723s = vVar.f36698s;
            this.f36724t = vVar.f36699t;
            this.f36725u = vVar.f36700u;
            this.f36726v = vVar.f36701v;
            this.f36727w = vVar.f36702w;
            this.f36728x = vVar.f36703x;
            this.f36729y = vVar.f36704y;
            this.f36730z = vVar.f36705z;
        }
    }

    static {
        com.mbridge.msdk.thrid.okhttp.internal.a.f36256a = new a();
    }

    public v() {
        this(new b());
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextE = com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().e();
            sSLContextE.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextE.getSocketFactory();
        } catch (GeneralSecurityException e10) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("No System TLS", (Exception) e10);
        }
    }

    public SocketFactory A() {
        return this.f36690j;
    }

    public SSLSocketFactory B() {
        return this.f36691k;
    }

    public int C() {
        return this.f36704y;
    }

    public int b() {
        return this.f36701v;
    }

    public f c() {
        return this.f36693n;
    }

    public int e() {
        return this.f36702w;
    }

    public i f() {
        return this.f36696q;
    }

    public List<j> g() {
        return this.f36684d;
    }

    public l i() {
        return this.f36689i;
    }

    public m j() {
        return this.f36681a;
    }

    public n k() {
        return this.f36697r;
    }

    public o.c l() {
        return this.f36687g;
    }

    public boolean m() {
        return this.f36699t;
    }

    public boolean n() {
        return this.f36698s;
    }

    public HostnameVerifier o() {
        return this.f36692m;
    }

    public List<t> p() {
        return this.f36685e;
    }

    public com.mbridge.msdk.thrid.okhttp.internal.cache.c q() {
        return null;
    }

    public List<t> r() {
        return this.f36686f;
    }

    public b s() {
        return new b(this);
    }

    public int t() {
        return this.f36705z;
    }

    public List<w> u() {
        return this.f36683c;
    }

    public Proxy v() {
        return this.f36682b;
    }

    public com.mbridge.msdk.thrid.okhttp.b w() {
        return this.f36694o;
    }

    public ProxySelector x() {
        return this.f36688h;
    }

    public int y() {
        return this.f36703x;
    }

    public boolean z() {
        return this.f36700u;
    }

    public v(b bVar) {
        boolean z10;
        this.f36681a = bVar.f36706a;
        this.f36682b = bVar.f36707b;
        this.f36683c = bVar.f36708c;
        List<j> list = bVar.f36709d;
        this.f36684d = list;
        this.f36685e = com.mbridge.msdk.thrid.okhttp.internal.c.a(bVar.f36710e);
        this.f36686f = com.mbridge.msdk.thrid.okhttp.internal.c.a(bVar.f36711f);
        this.f36687g = bVar.f36712g;
        this.f36688h = bVar.f36713h;
        this.f36689i = bVar.f36714i;
        this.f36690j = bVar.f36715j;
        Iterator<j> it = list.iterator();
        loop0: while (true) {
            z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    z10 = (z10 || it.next().b()) ? true : z10;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f36716k;
        if (sSLSocketFactory == null && z10) {
            X509TrustManager x509TrustManagerA = com.mbridge.msdk.thrid.okhttp.internal.c.a();
            this.f36691k = a(x509TrustManagerA);
            this.l = com.mbridge.msdk.thrid.okhttp.internal.tls.c.a(x509TrustManagerA);
        } else {
            this.f36691k = sSLSocketFactory;
            this.l = bVar.l;
        }
        if (this.f36691k != null) {
            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(this.f36691k);
        }
        this.f36692m = bVar.f36717m;
        this.f36693n = bVar.f36718n.a(this.l);
        this.f36694o = bVar.f36719o;
        this.f36695p = bVar.f36720p;
        this.f36696q = bVar.f36721q;
        this.f36697r = bVar.f36722r;
        this.f36698s = bVar.f36723s;
        this.f36699t = bVar.f36724t;
        this.f36700u = bVar.f36725u;
        this.f36701v = bVar.f36726v;
        this.f36702w = bVar.f36727w;
        this.f36703x = bVar.f36728x;
        this.f36704y = bVar.f36729y;
        this.f36705z = bVar.f36730z;
        if (this.f36685e.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f36685e);
        }
        if (this.f36686f.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f36686f);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.b a() {
        return this.f36695p;
    }

    public d a(y yVar) {
        return x.a(this, yVar, false);
    }
}
