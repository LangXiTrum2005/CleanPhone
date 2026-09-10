package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4838vS implements Cloneable, InterfaceC2383Ec {
    public static final List E = Vg0.k(EnumC5106yW.HTTP_2, EnumC5106yW.HTTP_1_1);
    public static final List F = Vg0.k(C3985lj.e, C3985lj.f);
    public final int A;
    public final int B;
    public final long C;
    public final C3830jy D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3605hO f5131a;
    public final C2294Ar b;
    public final List c;
    public final List d;
    public final InterfaceC2839Vr e;
    public final boolean f;
    public final InterfaceC5166z7 g;
    public final boolean h;
    public final boolean i;
    public final InterfaceC3108bk j;
    public final C4850vc k;
    public final InterfaceC5140yp l;
    public final Proxy m;
    public final ProxySelector n;
    public final InterfaceC5166z7 o;
    public final SocketFactory p;
    public final SSLSocketFactory q;
    public final X509TrustManager r;
    public final List s;
    public final List t;
    public final HostnameVerifier u;
    public final C4500rd v;
    public final AbstractC3375el w;
    public final int x;
    public final int y;
    public final int z;

    public C4838vS(C4750uS c4750uS) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        this.f5131a = c4750uS.f5079a;
        this.b = c4750uS.b;
        this.c = Vg0.w(c4750uS.c);
        this.d = Vg0.w(c4750uS.d);
        this.e = c4750uS.e;
        this.f = c4750uS.f;
        this.g = c4750uS.g;
        this.h = c4750uS.h;
        this.i = c4750uS.i;
        this.j = c4750uS.j;
        this.k = c4750uS.k;
        this.l = c4750uS.l;
        Proxy proxy = c4750uS.m;
        this.m = proxy;
        if (proxy != null) {
            proxySelector = XR.f3968a;
        } else {
            proxySelector = c4750uS.n;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = XR.f3968a;
            }
        }
        this.n = proxySelector;
        this.o = c4750uS.o;
        this.p = c4750uS.p;
        List list = c4750uS.s;
        this.s = list;
        this.t = c4750uS.t;
        this.u = c4750uS.u;
        this.x = c4750uS.x;
        this.y = c4750uS.y;
        this.z = c4750uS.z;
        this.A = c4750uS.A;
        this.B = c4750uS.B;
        this.C = c4750uS.C;
        C3830jy c3830jy = c4750uS.D;
        this.D = c3830jy == null ? new C3830jy(1) : c3830jy;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.q = null;
                    this.w = null;
                    this.r = null;
                    this.v = C4500rd.c;
                    break;
                }
                if (((C3985lj) it.next()).f4659a) {
                    SSLSocketFactory sSLSocketFactory = c4750uS.q;
                    if (sSLSocketFactory == null) {
                        C5104yU c5104yU = C5104yU.f5278a;
                        X509TrustManager x509TrustManagerM = C5104yU.f5278a.m();
                        this.r = x509TrustManagerM;
                        this.q = C5104yU.f5278a.l(x509TrustManagerM);
                        AbstractC3375el abstractC3375elB = C5104yU.f5278a.b(x509TrustManagerM);
                        this.w = abstractC3375elB;
                        C4500rd c4500rd = c4750uS.v;
                        this.v = AbstractC2995aW.i(c4500rd.b, abstractC3375elB) ? c4500rd : new C4500rd(c4500rd.f4937a, abstractC3375elB);
                        break;
                    }
                    this.q = sSLSocketFactory;
                    AbstractC3375el abstractC3375el = c4750uS.w;
                    AbstractC2995aW.n(abstractC3375el);
                    this.w = abstractC3375el;
                    X509TrustManager x509TrustManager = c4750uS.r;
                    AbstractC2995aW.n(x509TrustManager);
                    this.r = x509TrustManager;
                    C4500rd c4500rd2 = c4750uS.v;
                    this.v = AbstractC2995aW.i(c4500rd2.b, abstractC3375el) ? c4500rd2 : new C4500rd(c4500rd2.f4937a, abstractC3375el);
                    break;
                }
            }
        } else {
            this.q = null;
            this.w = null;
            this.r = null;
            this.v = C4500rd.c;
            break;
        }
        List list3 = this.c;
        if (!(!list3.contains(null))) {
            throw new IllegalStateException(AbstractC2995aW.v0(list3, "Null interceptor: ").toString());
        }
        List list4 = this.d;
        if (!(!list4.contains(null))) {
            throw new IllegalStateException(AbstractC2995aW.v0(list4, "Null network interceptor: ").toString());
        }
        List list5 = this.s;
        boolean z = list5 instanceof Collection;
        X509TrustManager x509TrustManager2 = this.r;
        AbstractC3375el abstractC3375el2 = this.w;
        SSLSocketFactory sSLSocketFactory2 = this.q;
        if (!z || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((C3985lj) it2.next()).f4659a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null".toString());
                    }
                    if (abstractC3375el2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null".toString());
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (abstractC3375el2 != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!AbstractC2995aW.i(this.v, C4500rd.c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final C4750uS a() {
        C4750uS c4750uS = new C4750uS();
        c4750uS.f5079a = this.f5131a;
        c4750uS.b = this.b;
        AbstractC2801Uf.a0(this.c, c4750uS.c);
        AbstractC2801Uf.a0(this.d, c4750uS.d);
        c4750uS.e = this.e;
        c4750uS.f = this.f;
        c4750uS.g = this.g;
        c4750uS.h = this.h;
        c4750uS.i = this.i;
        c4750uS.j = this.j;
        c4750uS.k = this.k;
        c4750uS.l = this.l;
        c4750uS.m = this.m;
        c4750uS.n = this.n;
        c4750uS.o = this.o;
        c4750uS.p = this.p;
        c4750uS.q = this.q;
        c4750uS.r = this.r;
        c4750uS.s = this.s;
        c4750uS.t = this.t;
        c4750uS.u = this.u;
        c4750uS.v = this.v;
        c4750uS.w = this.w;
        c4750uS.x = this.x;
        c4750uS.y = this.y;
        c4750uS.z = this.z;
        c4750uS.A = this.A;
        c4750uS.B = this.B;
        c4750uS.C = this.C;
        c4750uS.D = this.D;
        return c4750uS;
    }

    public final IX b(HY hy) {
        AbstractC2995aW.q(hy, J0.REQUEST_KEY_EXTRA);
        return new IX(this, hy, false);
    }

    public final Object clone() {
        return super.clone();
    }

    public C4838vS() {
        this(new C4750uS());
    }
}
