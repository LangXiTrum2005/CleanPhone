package co;

import bo.i;
import bo.k;
import com.applovin.shadow.okhttp3.internal.Util;
import com.google.android.gms.internal.ads.kj1;
import com.google.android.gms.internal.ads.ws;
import com.google.android.gms.internal.measurement.nf;
import com.ironsource.C0375hc;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import lo.j;
import qk.i0;
import xn.l;
import xn.m;
import xn.n;
import xn.o;
import xn.q;
import xn.s;
import xn.t;
import xn.u;
import xn.v;
import xn.w;
import xn.y;
import xn.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6791a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6792b;

    public a(xn.b cookieJar) {
        kotlin.jvm.internal.n.f(cookieJar, "cookieJar");
        this.f6792b = cookieJar;
    }

    public static int d(w wVar, int i10) {
        String strA = w.a(CommonGatewayClient.HEADER_RETRY_AFTER, wVar);
        if (strA == null) {
            return i10;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        kotlin.jvm.internal.n.e(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strA).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        kotlin.jvm.internal.n.e(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // xn.n
    public final w a(g gVar) {
        long j10;
        y yVar;
        w wVarB;
        SSLSocketFactory sSLSocketFactory;
        ko.c cVar;
        xn.f fVar;
        switch (this.f6791a) {
            case 0:
                xn.b bVar = (xn.b) this.f6792b;
                s sVar = gVar.f6799e;
                l lVar = sVar.f54062c;
                nf nfVarA = sVar.a();
                m url = sVar.f54060a;
                u uVar = sVar.f54063d;
                if (uVar != null) {
                    t tVar = (t) uVar;
                    j10 = -1;
                    o oVar = tVar.f54066a;
                    if (oVar != null) {
                        nfVarA.o("Content-Type", oVar.f54000a);
                    }
                    long j11 = tVar.f54067b;
                    if (j11 != -1) {
                        nfVarA.o("Content-Length", String.valueOf(j11));
                        ((h2.d) nfVarA.f23784d).k("Transfer-Encoding");
                    } else {
                        nfVarA.o("Transfer-Encoding", "chunked");
                        ((h2.d) nfVarA.f23784d).k("Content-Length");
                    }
                } else {
                    j10 = -1;
                }
                boolean z10 = false;
                if (lVar.b("Host") == null) {
                    nfVarA.o("Host", yn.a.u(url, false));
                }
                if (lVar.b("Connection") == null) {
                    nfVarA.o("Connection", "Keep-Alive");
                }
                if (lVar.b("Accept-Encoding") == null && lVar.b(Command.HTTP_HEADER_RANGE) == null) {
                    nfVarA.o("Accept-Encoding", "gzip");
                    z10 = true;
                }
                bVar.getClass();
                kotlin.jvm.internal.n.f(url, "url");
                if (lVar.b(Command.HTTP_HEADER_USER_AGENT) == null) {
                    nfVarA.o(Command.HTTP_HEADER_USER_AGENT, Util.userAgent);
                }
                w wVarB2 = gVar.b(nfVarA.a());
                l lVar2 = wVarB2.f54086f;
                f.b(bVar, url, lVar2);
                v vVarD = wVarB2.d();
                vVarD.f54069a = sVar;
                if (z10 && "gzip".equalsIgnoreCase(w.a("Content-Encoding", wVarB2)) && f.a(wVarB2) && (yVar = wVarB2.f54087g) != null) {
                    j jVar = new j(yVar.n());
                    h2.d dVarM = lVar2.m();
                    dVarM.k("Content-Encoding");
                    dVarM.k("Content-Length");
                    vVarD.f54074f = dVarM.i().m();
                    vVarD.f54075g = new h(w.a("Content-Type", wVarB2), j10, new lo.n(jVar));
                }
                return vVarD.a();
            default:
                s sVar2 = gVar.f6799e;
                i iVar = gVar.f6795a;
                List listD0 = xj.v.f53866a;
                w wVar = null;
                int i10 = 0;
                s sVarB = sVar2;
                while (true) {
                    boolean z11 = true;
                    while (true) {
                        if (iVar.f5794i != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (iVar) {
                            try {
                                if (iVar.f5796k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (iVar.f5795j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (z11) {
                            bo.l lVar3 = iVar.f5788c;
                            m mVar = sVarB.f54060a;
                            q qVar = iVar.f5786a;
                            if (mVar.f53997i) {
                                SSLSocketFactory sSLSocketFactory2 = qVar.f54040o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                ko.c cVar2 = qVar.f54044s;
                                fVar = qVar.f54045t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                fVar = null;
                            }
                            iVar.f5792g = new b2.a(lVar3, new xn.a(mVar.f53992d, mVar.f53993e, qVar.f54037k, qVar.f54039n, sSLSocketFactory, cVar, fVar, qVar.f54038m, qVar.f54043r, qVar.f54042q, qVar.l), iVar);
                        }
                        try {
                            if (iVar.f5797m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                wVarB = gVar.b(sVarB);
                            } catch (bo.m e10) {
                                if (!c(e10.f5823b, iVar, sVarB, false)) {
                                    IOException iOException = e10.f5822a;
                                    kotlin.jvm.internal.n.f(iOException, "<this>");
                                    Iterator it = listD0.iterator();
                                    while (it.hasNext()) {
                                        i0.c(iOException, (Exception) it.next());
                                    }
                                    throw iOException;
                                }
                                listD0 = xj.n.D0(listD0, e10.f5822a);
                                iVar.h(true);
                                z11 = false;
                            } catch (IOException e11) {
                                if (!c(e11, iVar, sVarB, !(e11 instanceof fo.a))) {
                                    Iterator it2 = listD0.iterator();
                                    while (it2.hasNext()) {
                                        i0.c(e11, (Exception) it2.next());
                                    }
                                    throw e11;
                                }
                                listD0 = xj.n.D0(listD0, e11);
                                iVar.h(true);
                                z11 = false;
                            }
                        } catch (Throwable th3) {
                            iVar.h(true);
                            throw th3;
                        }
                        break;
                    }
                    if (wVar != null) {
                        v vVarD2 = wVarB.d();
                        v vVarD3 = wVar.d();
                        vVarD3.f54075g = null;
                        w wVarA = vVarD3.a();
                        if (wVarA.f54087g != null) {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                        vVarD2.f54078j = wVarA;
                        wVarB = vVarD2.a();
                    }
                    wVar = wVarB;
                    sVarB = b(wVar, iVar.f5794i);
                    if (sVarB == null) {
                        iVar.h(false);
                        return wVar;
                    }
                    y yVar2 = wVar.f54087g;
                    if (yVar2 != null) {
                        yn.a.d(yVar2);
                    }
                    i10++;
                    if (i10 > 20) {
                        throw new ProtocolException("Too many follow-up requests: " + i10);
                    }
                    iVar.h(true);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0134  */
    /* JADX WARN: Code duplicated, block: B:105:0x0157  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x010e  */
    /* JADX WARN: Code duplicated, block: B:92:0x011a  */
    /* JADX WARN: Code duplicated, block: B:98:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d  */
    public s b(w wVar, bo.e eVar) throws ProtocolException {
        q qVar;
        String strA;
        s sVar;
        ws wsVar;
        m mVarA;
        nf nfVarA;
        boolean z10;
        w wVar2;
        k kVar;
        z zVar = (eVar == null || (kVar = (k) eVar.f5780e) == null) ? null : kVar.f5801b;
        int i10 = wVar.f54084d;
        String str = wVar.f54081a.f54061b;
        if (i10 == 307 || i10 == 308) {
            qVar = (q) this.f6792b;
            if (qVar.f54034h) {
                strA = w.a("Location", wVar);
                sVar = wVar.f54081a;
                if (strA != null) {
                    m mVar = sVar.f54060a;
                    mVar.getClass();
                    try {
                        wsVar = new ws();
                        wsVar.c(mVar, strA);
                    } catch (IllegalArgumentException unused) {
                        wsVar = null;
                    }
                    if (wsVar != null) {
                        mVarA = wsVar.a();
                    } else {
                        mVarA = null;
                    }
                    if (mVarA != null && (kotlin.jvm.internal.n.a(mVarA.f53989a, sVar.f54060a.f53989a) || qVar.f54035i)) {
                        nfVarA = sVar.a();
                        if (com.bumptech.glide.d.G(str)) {
                            int i11 = wVar.f54084d;
                            z10 = !str.equals("PROPFIND") || i11 == 308 || i11 == 307;
                            if (!str.equals("PROPFIND") || i11 == 308 || i11 == 307) {
                                nfVarA.s(str, z10 ? sVar.f54063d : null);
                            } else {
                                nfVarA.s(C0375hc.f28788a, null);
                            }
                            if (!z10) {
                                ((h2.d) nfVarA.f23784d).k("Transfer-Encoding");
                                ((h2.d) nfVarA.f23784d).k("Content-Length");
                                ((h2.d) nfVarA.f23784d).k("Content-Type");
                            }
                        }
                        if (!yn.a.a(sVar.f54060a, mVarA)) {
                            ((h2.d) nfVarA.f23784d).k("Authorization");
                        }
                        nfVarA.f23782b = mVarA;
                        return nfVarA.a();
                    }
                }
            }
        } else {
            if (i10 == 401) {
                ((q) this.f6792b).f54033g.getClass();
                return null;
            }
            if (i10 != 421) {
                if (i10 == 503) {
                    w wVar3 = wVar.f54090j;
                    if ((wVar3 == null || wVar3.f54084d != 503) && d(wVar, Integer.MAX_VALUE) == 0) {
                        return wVar.f54081a;
                    }
                } else {
                    if (i10 == 407) {
                        kotlin.jvm.internal.n.c(zVar);
                        if (zVar.f54096b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((q) this.f6792b).f54038m.getClass();
                        return null;
                    }
                    if (i10 != 408) {
                        switch (i10) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                qVar = (q) this.f6792b;
                                if (qVar.f54034h) {
                                    strA = w.a("Location", wVar);
                                    sVar = wVar.f54081a;
                                    if (strA != null) {
                                        m mVar2 = sVar.f54060a;
                                        mVar2.getClass();
                                        wsVar = new ws();
                                        wsVar.c(mVar2, strA);
                                        if (wsVar != null) {
                                            mVarA = wsVar.a();
                                        } else {
                                            mVarA = null;
                                        }
                                        if (mVarA != null) {
                                            nfVarA = sVar.a();
                                            if (com.bumptech.glide.d.G(str)) {
                                                int i12 = wVar.f54084d;
                                                if (str.equals("PROPFIND")) {
                                                }
                                                if (str.equals("PROPFIND")) {
                                                    nfVarA.s(str, z10 ? sVar.f54063d : null);
                                                } else {
                                                    nfVarA.s(str, z10 ? sVar.f54063d : null);
                                                }
                                                if (!z10) {
                                                    ((h2.d) nfVarA.f23784d).k("Transfer-Encoding");
                                                    ((h2.d) nfVarA.f23784d).k("Content-Length");
                                                    ((h2.d) nfVarA.f23784d).k("Content-Type");
                                                }
                                            }
                                            if (!yn.a.a(sVar.f54060a, mVarA)) {
                                                ((h2.d) nfVarA.f23784d).k("Authorization");
                                            }
                                            nfVarA.f23782b = mVarA;
                                            return nfVarA.a();
                                        }
                                    }
                                }
                            default:
                                return null;
                        }
                    } else if (((q) this.f6792b).f54032f && (((wVar2 = wVar.f54090j) == null || wVar2.f54084d != 408) && d(wVar, 0) <= 0)) {
                        return wVar.f54081a;
                    }
                }
            } else if (eVar != null && !kotlin.jvm.internal.n.a(((xn.a) ((b2.a) eVar.f5778c).f5215e).f53917h.f53992d, ((k) eVar.f5780e).f5801b.f54095a.f53917h.f53992d)) {
                k kVar2 = (k) eVar.f5780e;
                synchronized (kVar2) {
                    kVar2.f5810k = true;
                }
                return wVar.f54081a;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0049  */
    /* JADX WARN: Code duplicated, block: B:36:0x0050  */
    /* JADX WARN: Code duplicated, block: B:38:0x0053  */
    /* JADX WARN: Code duplicated, block: B:49:0x006a A[ADDED_TO_REGION, DONT_GENERATE, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:51:0x006c A[Catch: all -> 0x0084, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:47:0x0066, B:51:0x006c, B:55:0x0080), top: B:76:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0089  */
    /* JADX WARN: Code duplicated, block: B:63:0x008b  */
    /* JADX WARN: Code duplicated, block: B:64:0x008d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0093  */
    /* JADX WARN: Code duplicated, block: B:69:0x009a  */
    /* JADX WARN: Code duplicated, block: B:75:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public boolean c(IOException iOException, i iVar, s sVar, boolean z10) {
        b2.a aVar;
        int i10;
        boolean zP;
        z zVar;
        bc.q qVar;
        kj1 kj1Var;
        k kVar;
        if (!((q) this.f6792b).f54032f || ((z10 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (!(iOException instanceof InterruptedIOException)) {
            if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                return false;
            }
            aVar = iVar.f5792g;
            kotlin.jvm.internal.n.c(aVar);
            i10 = aVar.f5211a;
            if (i10 != 0) {
                if (((z) aVar.f5219i) != null) {
                    zP = true;
                } else {
                    zVar = null;
                    if (i10 <= 1) {
                        synchronized (kVar) {
                            if (kVar.l != 0) {
                                zVar = kVar.f5801b;
                            }
                        }
                    }
                    if (zVar != null) {
                        aVar.f5219i = zVar;
                    } else {
                        qVar = (bc.q) aVar.f5217g;
                        zP = qVar != null ? kj1Var.p() : kj1Var.p();
                    }
                    zP = true;
                }
            } else if (((z) aVar.f5219i) != null) {
                zP = true;
            } else {
                zVar = null;
                if (i10 <= 1) {
                    synchronized (kVar) {
                        if (kVar.l != 0) {
                            zVar = kVar.f5801b;
                        }
                    }
                }
                if (zVar != null) {
                    aVar.f5219i = zVar;
                } else {
                    qVar = (bc.q) aVar.f5217g;
                    if (qVar != null) {
                    }
                }
                zP = true;
            }
            if (!zP) {
                return true;
            }
        } else if ((iOException instanceof SocketTimeoutException) && !z10) {
            aVar = iVar.f5792g;
            kotlin.jvm.internal.n.c(aVar);
            i10 = aVar.f5211a;
            if (i10 != 0 && aVar.f5212b == 0 && aVar.f5213c == 0) {
                zP = false;
            } else if (((z) aVar.f5219i) != null) {
                zP = true;
            } else {
                zVar = null;
                if (i10 <= 1 && aVar.f5212b <= 1 && aVar.f5213c <= 0 && (kVar = ((i) aVar.f5216f).f5793h) != null) {
                    synchronized (kVar) {
                        if (kVar.l != 0 && yn.a.a(kVar.f5801b.f54095a.f53917h, ((xn.a) aVar.f5215e).f53917h)) {
                            zVar = kVar.f5801b;
                        }
                    }
                }
                if (zVar != null) {
                    aVar.f5219i = zVar;
                } else {
                    qVar = (bc.q) aVar.f5217g;
                    if ((qVar != null || !qVar.b()) && (kj1Var = (kj1) aVar.f5218h) != null) {
                    }
                }
                zP = true;
            }
            if (!zP) {
                return true;
            }
        }
        return false;
    }

    public a(q qVar) {
        this.f6792b = qVar;
    }
}
