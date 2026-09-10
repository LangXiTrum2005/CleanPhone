package xn;

import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements Cloneable {
    public static final List A = yn.a.k(r.HTTP_2, r.HTTP_1_1);
    public static final List B = yn.a.k(i.f53965e, i.f53966f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zc.u f54027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qj.x f54028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f54029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f54030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xa.b f54031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f54032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f54033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f54034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f54035i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f54036j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f54037k;
    public final ProxySelector l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f54038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SocketFactory f54039n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f54040o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final X509TrustManager f54041p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f54042q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f54043r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ko.c f54044s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f54045t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.google.android.gms.internal.auth.i f54046u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f54047v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f54048w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f54049x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f54050y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final od.c f54051z;

    public q(p pVar) throws NoSuchAlgorithmException, KeyStoreException {
        this.f54027a = pVar.f54002a;
        this.f54028b = pVar.f54003b;
        this.f54029c = yn.a.v(pVar.f54004c);
        this.f54030d = yn.a.v(pVar.f54005d);
        this.f54031e = pVar.f54006e;
        this.f54032f = pVar.f54007f;
        this.f54033g = pVar.f54008g;
        this.f54034h = pVar.f54009h;
        this.f54035i = pVar.f54010i;
        this.f54036j = pVar.f54011j;
        this.f54037k = pVar.f54012k;
        ProxySelector proxySelector = pVar.l;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.l = proxySelector == null ? io.a.f43202a : proxySelector;
        this.f54038m = pVar.f54013m;
        this.f54039n = pVar.f54014n;
        List list = pVar.f54017q;
        this.f54042q = list;
        this.f54043r = pVar.f54018r;
        this.f54044s = pVar.f54019s;
        this.f54047v = pVar.f54022v;
        this.f54048w = pVar.f54023w;
        this.f54049x = pVar.f54024x;
        this.f54050y = pVar.f54025y;
        od.c cVar = pVar.f54026z;
        this.f54051z = cVar == null ? new od.c(2) : cVar;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f54040o = null;
                    this.f54046u = null;
                    this.f54041p = null;
                    this.f54045t = f.f53943c;
                    break;
                }
                if (((i) it.next()).f53967a) {
                    SSLSocketFactory sSLSocketFactory = pVar.f54015o;
                    if (sSLSocketFactory == null) {
                        go.m mVar = go.m.f42045a;
                        X509TrustManager x509TrustManagerJ = go.m.f42045a.j();
                        this.f54041p = x509TrustManagerJ;
                        this.f54040o = go.m.f42045a.i(x509TrustManagerJ);
                        com.google.android.gms.internal.auth.i iVarB = go.m.f42045a.b(x509TrustManagerJ);
                        this.f54046u = iVarB;
                        f fVar = pVar.f54020t;
                        fVar.getClass();
                        this.f54045t = kotlin.jvm.internal.n.a(fVar.f53945b, iVarB) ? fVar : new f(fVar.f53944a, iVarB);
                        break;
                    }
                    this.f54040o = sSLSocketFactory;
                    com.google.android.gms.internal.auth.i iVar = pVar.f54021u;
                    kotlin.jvm.internal.n.c(iVar);
                    this.f54046u = iVar;
                    X509TrustManager x509TrustManager = pVar.f54016p;
                    kotlin.jvm.internal.n.c(x509TrustManager);
                    this.f54041p = x509TrustManager;
                    f fVar2 = pVar.f54020t;
                    fVar2.getClass();
                    this.f54045t = kotlin.jvm.internal.n.a(fVar2.f53945b, iVar) ? fVar2 : new f(fVar2.f53944a, iVar);
                    break;
                }
            }
        } else {
            this.f54040o = null;
            this.f54046u = null;
            this.f54041p = null;
            this.f54045t = f.f53943c;
            break;
        }
        X509TrustManager x509TrustManager2 = this.f54041p;
        com.google.android.gms.internal.auth.i iVar2 = this.f54046u;
        SSLSocketFactory sSLSocketFactory2 = this.f54040o;
        List list3 = this.f54030d;
        List list4 = this.f54029c;
        kotlin.jvm.internal.n.d(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list4.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list4).toString());
        }
        kotlin.jvm.internal.n.d(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list3).toString());
        }
        List list5 = this.f54042q;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((i) it2.next()).f53967a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (iVar2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (iVar2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!kotlin.jvm.internal.n.a(this.f54045t, f.f53943c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final p a() {
        p pVar = new p();
        pVar.f54002a = this.f54027a;
        pVar.f54003b = this.f54028b;
        xj.t.a0(this.f54029c, pVar.f54004c);
        xj.t.a0(this.f54030d, pVar.f54005d);
        pVar.f54006e = this.f54031e;
        pVar.f54007f = this.f54032f;
        pVar.f54008g = this.f54033g;
        pVar.f54009h = this.f54034h;
        pVar.f54010i = this.f54035i;
        pVar.f54011j = this.f54036j;
        pVar.f54012k = this.f54037k;
        pVar.l = this.l;
        pVar.f54013m = this.f54038m;
        pVar.f54014n = this.f54039n;
        pVar.f54015o = this.f54040o;
        pVar.f54016p = this.f54041p;
        pVar.f54017q = this.f54042q;
        pVar.f54018r = this.f54043r;
        pVar.f54019s = this.f54044s;
        pVar.f54020t = this.f54045t;
        pVar.f54021u = this.f54046u;
        pVar.f54022v = this.f54047v;
        pVar.f54023w = this.f54048w;
        pVar.f54024x = this.f54049x;
        pVar.f54025y = this.f54050y;
        pVar.f54026z = this.f54051z;
        return pVar;
    }

    public final Object clone() {
        return super.clone();
    }
}
