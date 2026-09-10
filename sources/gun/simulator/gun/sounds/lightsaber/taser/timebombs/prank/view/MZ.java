package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.net.HttpRequestHeader;
import com.badlogic.gdx.net.HttpResponseHeader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class MZ implements JD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4838vS f3408a;

    public MZ(C4838vS c4838vS) {
        AbstractC2995aW.q(c4838vS, "client");
        this.f3408a = c4838vS;
    }

    public static int c(C5021xZ c5021xZ, int i) {
        String strI = C5021xZ.i(c5021xZ, HttpResponseHeader.RetryAfter);
        if (strI == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        AbstractC2995aW.p(patternCompile, "compile(pattern)");
        if (!patternCompile.matcher(strI).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strI);
        AbstractC2995aW.p(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    public final HY a(C5021xZ c5021xZ, C4813v60 c4813v60) throws ProtocolException {
        KX kx;
        String strI;
        YA ya;
        C3834k00 c3834k00 = (c4813v60 == null || (kx = (KX) c4813v60.f) == null) ? null : kx.b;
        int i = c5021xZ.d;
        HY hy = c5021xZ.f5227a;
        String str = hy.b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((G7) this.f3408a.g).getClass();
                return null;
            }
            if (i == 421) {
                NY ny = hy.d;
                if ((ny != null && ny.isOneShot()) || c4813v60 == null || !(!AbstractC2995aW.i(((C4352ps) c4813v60.d).b.i.d, ((KX) c4813v60.f).b.f4578a.i.d))) {
                    return null;
                }
                KX kx2 = (KX) c4813v60.f;
                synchronized (kx2) {
                    kx2.k = true;
                }
                return c5021xZ.f5227a;
            }
            if (i == 503) {
                C5021xZ c5021xZ2 = c5021xZ.j;
                if ((c5021xZ2 == null || c5021xZ2.d != 503) && c(c5021xZ, Integer.MAX_VALUE) == 0) {
                    return c5021xZ.f5227a;
                }
                return null;
            }
            if (i == 407) {
                AbstractC2995aW.n(c3834k00);
                if (c3834k00.b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((G7) this.f3408a.o).getClass();
                return null;
            }
            if (i == 408) {
                if (!this.f3408a.f) {
                    return null;
                }
                NY ny2 = hy.d;
                if (ny2 != null && ny2.isOneShot()) {
                    return null;
                }
                C5021xZ c5021xZ3 = c5021xZ.j;
                if ((c5021xZ3 == null || c5021xZ3.d != 408) && c(c5021xZ, 0) <= 0) {
                    return c5021xZ.f5227a;
                }
                return null;
            }
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        C4838vS c4838vS = this.f3408a;
        if (!c4838vS.h || (strI = C5021xZ.i(c5021xZ, HttpResponseHeader.Location)) == null) {
            return null;
        }
        HY hy2 = c5021xZ.f5227a;
        ZA za = hy2.f3175a;
        za.getClass();
        try {
            ya = new YA();
            ya.b(za, strI);
        } catch (IllegalArgumentException unused) {
            ya = null;
        }
        ZA zaA = ya == null ? null : ya.a();
        if (zaA == null) {
            return null;
        }
        if (!AbstractC2995aW.i(zaA.f4058a, hy2.f3175a.f4058a) && !c4838vS.i) {
            return null;
        }
        GY gyA = hy2.a();
        if (WD.K(str)) {
            boolean zI = AbstractC2995aW.i(str, "PROPFIND");
            int i2 = c5021xZ.d;
            boolean z = zI || i2 == 308 || i2 == 307;
            if (!(!AbstractC2995aW.i(str, "PROPFIND")) || i2 == 308 || i2 == 307) {
                gyA.e(str, z ? hy2.d : null);
            } else {
                gyA.e("GET", null);
            }
            if (!z) {
                gyA.c.j(HttpResponseHeader.TransferEncoding);
                gyA.c.j("Content-Length");
                gyA.c.j("Content-Type");
            }
        }
        if (!Vg0.a(hy2.f3175a, zaA)) {
            gyA.c.j(HttpRequestHeader.Authorization);
        }
        gyA.f3127a = zaA;
        return gyA.b();
    }

    public final boolean b(IOException iOException, IX ix, HY hy, boolean z) {
        C4010m00 c4010m00;
        KX kx;
        NY ny;
        if (!this.f3408a.f) {
            return false;
        }
        if ((z && (((ny = hy.d) != null && ny.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z)) {
            return false;
        }
        C4352ps c4352ps = ix.i;
        AbstractC2995aW.n(c4352ps);
        int i = c4352ps.g;
        if (i != 0 || c4352ps.h != 0 || c4352ps.i != 0) {
            if (c4352ps.j == null) {
                C3834k00 c3834k00 = null;
                if (i <= 1 && c4352ps.h <= 1 && c4352ps.i <= 0 && (kx = c4352ps.c.j) != null) {
                    synchronized (kx) {
                        if (kx.l == 0 && Vg0.a(kx.b.f4578a.i, c4352ps.b.i)) {
                            c3834k00 = kx.b;
                        }
                    }
                }
                if (c3834k00 != null) {
                    c4352ps.j = c3834k00;
                } else {
                    C2329Ca c2329Ca = c4352ps.e;
                    if ((c2329Ca != null && c2329Ca.g()) || (c4010m00 = c4352ps.f) == null || c4010m00.a()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JD
    public final C5021xZ intercept(ID id) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C4500rd c4500rd;
        MX mx = (MX) id;
        HY hy = mx.e;
        IX ix = mx.f3407a;
        boolean z = true;
        List listQ0 = C2812Uq.f3846a;
        C5021xZ c5021xZ = null;
        int i = 0;
        HY hyA = hy;
        boolean z2 = true;
        while (true) {
            ix.getClass();
            AbstractC2995aW.q(hyA, J0.REQUEST_KEY_EXTRA);
            if (ix.l != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
            synchronized (ix) {
                try {
                    if (!(ix.n ^ z)) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                    }
                    if (!(ix.m ^ z)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                LX lx = ix.d;
                ZA za = hyA.f3175a;
                boolean z3 = za.j;
                C4838vS c4838vS = ix.f3221a;
                if (z3) {
                    SSLSocketFactory sSLSocketFactory2 = c4838vS.q;
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("CLEARTEXT-only client");
                    }
                    HostnameVerifier hostnameVerifier2 = c4838vS.u;
                    c4500rd = c4838vS.v;
                    sSLSocketFactory = sSLSocketFactory2;
                    hostnameVerifier = hostnameVerifier2;
                } else {
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    c4500rd = null;
                }
                ix.i = new C4352ps(lx, new C3048b3(za.d, za.e, c4838vS.l, c4838vS.p, sSLSocketFactory, hostnameVerifier, c4500rd, c4838vS.o, c4838vS.m, c4838vS.t, c4838vS.s, c4838vS.n), ix, ix.e);
            }
            try {
                if (ix.p) {
                    throw new IOException("Canceled");
                }
                try {
                    try {
                        C5021xZ c5021xZB = mx.b(hyA);
                        if (c5021xZ != null) {
                            C4845vZ c4845vZM = c5021xZB.m();
                            C4845vZ c4845vZM2 = c5021xZ.m();
                            c4845vZM2.g = null;
                            C5021xZ c5021xZA = c4845vZM2.a();
                            if (c5021xZA.g != null) {
                                throw new IllegalArgumentException("priorResponse.body != null".toString());
                            }
                            c4845vZM.j = c5021xZA;
                            c5021xZB = c4845vZM.a();
                        }
                        c5021xZ = c5021xZB;
                        C4813v60 c4813v60 = ix.l;
                        hyA = a(c5021xZ, c4813v60);
                        if (hyA == null) {
                            if (c4813v60 != null && c4813v60.f5119a) {
                                if (!(!ix.k)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                ix.k = true;
                                ix.f.i();
                            }
                            ix.f(false);
                            return c5021xZ;
                        }
                        NY ny = hyA.d;
                        if (ny != null && ny.isOneShot()) {
                            ix.f(false);
                            return c5021xZ;
                        }
                        CZ cz = c5021xZ.g;
                        if (cz != null) {
                            Vg0.c(cz);
                        }
                        i++;
                        if (i > 20) {
                            throw new ProtocolException(AbstractC2995aW.v0(Integer.valueOf(i), "Too many follow-up requests: "));
                        }
                        ix.f(true);
                        listQ0 = listQ0;
                        z2 = true;
                        z = true;
                    } catch (C3922l00 e) {
                        List list = listQ0;
                        if (!b(e.b, ix, hyA, false)) {
                            IOException iOException = e.f4624a;
                            Vg0.z(iOException, list);
                            throw iOException;
                        }
                        listQ0 = AbstractC2853Wf.q0(e.f4624a, list);
                        ix.f(true);
                        i = i;
                        z2 = false;
                    }
                } catch (IOException e2) {
                    if (!b(e2, ix, hyA, !(e2 instanceof C3809jj))) {
                        Vg0.z(e2, listQ0);
                        throw e2;
                    }
                    listQ0 = AbstractC2853Wf.q0(e2, listQ0);
                    ix.f(true);
                    i = i;
                    z2 = false;
                }
            } catch (Throwable th2) {
                ix.f(true);
                throw th2;
            }
        }
    }
}
