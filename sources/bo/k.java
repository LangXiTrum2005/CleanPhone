package bo;

import androidx.fragment.app.o;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.internal.consent_sdk.x;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.internal.play_billing.q1;
import com.mbridge.msdk.foundation.download.Command;
import fo.n;
import fo.v;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import qk.i0;
import xn.q;
import xn.r;
import xn.s;
import xn.w;
import xn.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends fo.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f5801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Socket f5802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Socket f5803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xn.k f5804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f5805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n f5806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public lo.n f5807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public lo.m f5808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5810k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5813o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f5814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f5815q;

    public k(l connectionPool, z route) {
        kotlin.jvm.internal.n.f(connectionPool, "connectionPool");
        kotlin.jvm.internal.n.f(route, "route");
        this.f5801b = route;
        this.f5813o = 1;
        this.f5814p = new ArrayList();
        this.f5815q = Long.MAX_VALUE;
    }

    public static void d(q qVar, z failedRoute, IOException failure) {
        kotlin.jvm.internal.n.f(failedRoute, "failedRoute");
        kotlin.jvm.internal.n.f(failure, "failure");
        if (failedRoute.f54096b.type() != Proxy.Type.DIRECT) {
            xn.a aVar = failedRoute.f54095a;
            aVar.f53916g.connectFailed(aVar.f53917h.g(), failedRoute.f54096b.address(), failure);
        }
        od.c cVar = qVar.f54051z;
        synchronized (cVar) {
            ((LinkedHashSet) cVar.f47386b).add(failedRoute);
        }
    }

    @Override // fo.h
    public final synchronized void a(n nVar, fo.z settings) {
        kotlin.jvm.internal.n.f(settings, "settings");
        this.f5813o = (settings.f41330a & 16) != 0 ? settings.f41331b[4] : Integer.MAX_VALUE;
    }

    @Override // fo.h
    public final void b(v vVar) {
        vVar.c(8, null);
    }

    public final void c(int i10, int i11, int i12, boolean z10, xn.d dVar) throws Throwable {
        if (this.f5805f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f5801b.f54095a.f53919j;
        b bVar = new b(list);
        xn.a aVar = this.f5801b.f54095a;
        if (aVar.f53912c == null) {
            if (!list.contains(xn.i.f53966f)) {
                throw new m(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f5801b.f54095a.f53917h.f53992d;
            go.m mVar = go.m.f42045a;
            if (!go.m.f42045a.f(str)) {
                throw new m(new UnknownServiceException(defpackage.e.o("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (aVar.f53918i.contains(r.H2_PRIOR_KNOWLEDGE)) {
            throw new m(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        m mVar2 = null;
        while (true) {
            try {
                z zVar = this.f5801b;
                if (zVar.f54095a.f53912c != null && zVar.f54096b.type() == Proxy.Type.HTTP) {
                    f(i10, i11, i12, dVar);
                    if (this.f5802c != null) {
                        break;
                    } else {
                        break;
                    }
                }
                e(i10, i11, dVar);
                g(bVar, dVar);
                InetSocketAddress inetSocketAddress = this.f5801b.f54097c;
                kotlin.jvm.internal.n.f(inetSocketAddress, "inetSocketAddress");
                break;
            } catch (IOException e10) {
                Socket socket = this.f5803d;
                if (socket != null) {
                    yn.a.e(socket);
                }
                Socket socket2 = this.f5802c;
                if (socket2 != null) {
                    yn.a.e(socket2);
                }
                this.f5803d = null;
                this.f5802c = null;
                this.f5807h = null;
                this.f5808i = null;
                this.f5804e = null;
                this.f5805f = null;
                this.f5806g = null;
                this.f5813o = 1;
                InetSocketAddress inetSocketAddress2 = this.f5801b.f54097c;
                kotlin.jvm.internal.n.f(inetSocketAddress2, "inetSocketAddress");
                if (mVar2 == null) {
                    mVar2 = new m(e10);
                } else {
                    i0.c(mVar2.f5822a, e10);
                    mVar2.f5823b = e10;
                }
                if (!z10) {
                    throw mVar2;
                }
                bVar.f5761c = true;
                if (!bVar.f5760b) {
                    throw mVar2;
                }
                if (e10 instanceof ProtocolException) {
                    throw mVar2;
                }
                if (e10 instanceof InterruptedIOException) {
                    throw mVar2;
                }
                if ((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) {
                    throw mVar2;
                }
                if (e10 instanceof SSLPeerUnverifiedException) {
                    throw mVar2;
                }
                if (!(e10 instanceof SSLException)) {
                    throw mVar2;
                }
            }
        }
        z zVar2 = this.f5801b;
        if (zVar2.f54095a.f53912c != null && zVar2.f54096b.type() == Proxy.Type.HTTP && this.f5802c == null) {
            throw new m(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f5815q = System.nanoTime();
    }

    public final void e(int i10, int i11, xn.d dVar) throws IOException {
        Socket socketCreateSocket;
        z zVar = this.f5801b;
        Proxy proxy = zVar.f54096b;
        xn.a aVar = zVar.f54095a;
        Proxy.Type type = proxy.type();
        int i12 = type == null ? -1 : j.f5800a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = aVar.f53911b.createSocket();
            kotlin.jvm.internal.n.c(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f5802c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f5801b.f54097c;
        kotlin.jvm.internal.n.f(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i11);
        try {
            go.m mVar = go.m.f42045a;
            go.m mVar2 = go.m.f42045a;
            InetSocketAddress address = this.f5801b.f54097c;
            mVar2.getClass();
            kotlin.jvm.internal.n.f(address, "address");
            socketCreateSocket.connect(address, i10);
            try {
                this.f5807h = new lo.n(q1.C(socketCreateSocket));
                this.f5808i = q1.b(q1.A(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (kotlin.jvm.internal.n.a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f5801b.f54097c);
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void f(int i10, int i11, int i12, xn.d dVar) throws IOException {
        nf nfVar = new nf(10);
        z zVar = this.f5801b;
        xn.m url = zVar.f54095a.f53917h;
        kotlin.jvm.internal.n.f(url, "url");
        nfVar.f23782b = url;
        nfVar.s("CONNECT", null);
        xn.a aVar = zVar.f54095a;
        nfVar.o("Host", yn.a.u(aVar.f53917h, true));
        nfVar.o("Proxy-Connection", "Keep-Alive");
        nfVar.o(Command.HTTP_HEADER_USER_AGENT, Util.userAgent);
        s sVarA = nfVar.a();
        h2.d dVar2 = new h2.d(4, false);
        com.bumptech.glide.d.h("Proxy-Authenticate");
        com.bumptech.glide.d.l("OkHttp-Preemptive", "Proxy-Authenticate");
        dVar2.k("Proxy-Authenticate");
        dVar2.g("Proxy-Authenticate", "OkHttp-Preemptive");
        dVar2.i();
        aVar.f53915f.getClass();
        xn.m mVar = sVarA.f54060a;
        e(i10, i11, dVar);
        String str = "CONNECT " + yn.a.u(mVar, true) + " HTTP/1.1";
        lo.n nVar = this.f5807h;
        kotlin.jvm.internal.n.c(nVar);
        lo.m mVar2 = this.f5808i;
        kotlin.jvm.internal.n.c(mVar2);
        eo.g gVar = new eo.g(null, this, nVar, mVar2);
        lo.v vVarTimeout = nVar.f45656a.timeout();
        long j10 = i11;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVarTimeout.g(j10);
        mVar2.f45653a.timeout().g(i12);
        gVar.f(sVarA.f54062c, str);
        gVar.finishRequest();
        xn.v responseHeaders = gVar.readResponseHeaders(false);
        kotlin.jvm.internal.n.c(responseHeaders);
        responseHeaders.f54069a = sVarA;
        w wVarA = responseHeaders.a();
        int i13 = wVarA.f54084d;
        long j11 = yn.a.j(wVarA);
        if (j11 != -1) {
            eo.d dVarE = gVar.e(j11);
            yn.a.s(dVarE, Integer.MAX_VALUE);
            dVarE.close();
        }
        if (i13 != 200) {
            if (i13 != 407) {
                throw new IOException(l1.d.e(i13, "Unexpected response code for CONNECT: "));
            }
            aVar.f53915f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!nVar.f45657b.exhausted() || !mVar2.f45654b.exhausted()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(b bVar, xn.d dVar) throws Throwable {
        r rVarG = r.HTTP_1_1;
        xn.a aVar = this.f5801b.f54095a;
        SSLSocketFactory sSLSocketFactory = aVar.f53912c;
        if (sSLSocketFactory == null) {
            List list = aVar.f53918i;
            r rVar = r.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(rVar)) {
                this.f5803d = this.f5802c;
                this.f5805f = rVarG;
                return;
            } else {
                this.f5803d = this.f5802c;
                this.f5805f = rVar;
                l();
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String strE = null;
        try {
            kotlin.jvm.internal.n.c(sSLSocketFactory);
            Socket socket = this.f5802c;
            xn.m mVar = aVar.f53917h;
            int i10 = 1;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, mVar.f53992d, mVar.f53993e, true);
            kotlin.jvm.internal.n.d(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                xn.i iVarA = bVar.a(sSLSocket2);
                if (iVarA.f53968b) {
                    go.m mVar2 = go.m.f42045a;
                    go.m.f42045a.d(sSLSocket2, aVar.f53917h.f53992d, aVar.f53918i);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                kotlin.jvm.internal.n.e(sslSocketSession, "sslSocketSession");
                xn.k kVarO = com.bumptech.glide.c.o(sslSocketSession);
                HostnameVerifier hostnameVerifier = aVar.f53913d;
                kotlin.jvm.internal.n.c(hostnameVerifier);
                if (hostnameVerifier.verify(aVar.f53917h.f53992d, sslSocketSession)) {
                    xn.f fVar = aVar.f53914e;
                    kotlin.jvm.internal.n.c(fVar);
                    this.f5804e = new xn.k(kVarO.f53983a, kVarO.f53984b, kVarO.f53985c, new o(fVar, kVarO, aVar, i10));
                    fVar.a(aVar.f53917h.f53992d, new al.l(this, 3));
                    if (iVarA.f53968b) {
                        go.m mVar3 = go.m.f42045a;
                        strE = go.m.f42045a.e(sSLSocket2);
                    }
                    this.f5803d = sSLSocket2;
                    this.f5807h = new lo.n(q1.C(sSLSocket2));
                    this.f5808i = q1.b(q1.A(sSLSocket2));
                    if (strE != null) {
                        rVarG = com.google.android.gms.internal.auth.o.g(strE);
                    }
                    this.f5805f = rVarG;
                    go.m mVar4 = go.m.f42045a;
                    go.m.f42045a.a(sSLSocket2);
                    if (this.f5805f == r.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List listA = kVarO.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar.f53917h.f53992d + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                sb2.append(aVar.f53917h.f53992d);
                sb2.append(" not verified:\n              |    certificate: ");
                xn.f fVar2 = xn.f.f53943c;
                sb2.append(android.support.v4.media.session.a.F(x509Certificate));
                sb2.append("\n              |    DN: ");
                sb2.append(x509Certificate.getSubjectDN().getName());
                sb2.append("\n              |    subjectAltNames: ");
                sb2.append(xj.n.B0(ko.c.a(x509Certificate, 2), ko.c.a(x509Certificate, 7)));
                sb2.append("\n              ");
                throw new SSLPeerUnverifiedException(an.i.b0(sb2.toString()));
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    go.m mVar5 = go.m.f42045a;
                    go.m.f42045a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    yn.a.e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean h(xn.a aVar, List list) {
        xn.k kVar;
        xn.m mVar = aVar.f53917h;
        byte[] bArr = yn.a.f54560a;
        if (this.f5814p.size() < this.f5813o && !this.f5809j) {
            z zVar = this.f5801b;
            xn.a aVar2 = zVar.f54095a;
            xn.a aVar3 = zVar.f54095a;
            if (aVar2.a(aVar)) {
                String str = mVar.f53992d;
                String hostname = mVar.f53992d;
                if (kotlin.jvm.internal.n.a(str, aVar3.f53917h.f53992d)) {
                    return true;
                }
                if (this.f5806g != null && list != null) {
                    List<z> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (z zVar2 : list2) {
                            Proxy.Type type = zVar2.f54096b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && zVar.f54096b.type() == type2 && kotlin.jvm.internal.n.a(zVar.f54097c, zVar2.f54097c)) {
                                if (aVar.f53913d != ko.c.f44753a) {
                                    break;
                                }
                                byte[] bArr2 = yn.a.f54560a;
                                xn.m mVar2 = aVar3.f53917h;
                                if (mVar.f53993e != mVar2.f53993e) {
                                    break;
                                }
                                if (!kotlin.jvm.internal.n.a(hostname, mVar2.f53992d)) {
                                    if (!this.f5810k && (kVar = this.f5804e) != null) {
                                        List listA = kVar.a();
                                        if (listA.isEmpty()) {
                                            break;
                                        }
                                        Object obj = listA.get(0);
                                        kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        if (!ko.c.c(hostname, (X509Certificate) obj)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    xn.f fVar = aVar.f53914e;
                                    kotlin.jvm.internal.n.c(fVar);
                                    xn.k kVar2 = this.f5804e;
                                    kotlin.jvm.internal.n.c(kVar2);
                                    List peerCertificates = kVar2.a();
                                    kotlin.jvm.internal.n.f(hostname, "hostname");
                                    kotlin.jvm.internal.n.f(peerCertificates, "peerCertificates");
                                    fVar.a(hostname, new o(fVar, peerCertificates, hostname, 6));
                                    return true;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z10) {
        long j10;
        byte[] bArr = yn.a.f54560a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f5802c;
        kotlin.jvm.internal.n.c(socket);
        Socket socket2 = this.f5803d;
        kotlin.jvm.internal.n.c(socket2);
        lo.n nVar = this.f5807h;
        kotlin.jvm.internal.n.c(nVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        n nVar2 = this.f5806g;
        if (nVar2 != null) {
            synchronized (nVar2) {
                if (nVar2.f41259f) {
                    return false;
                }
                return nVar2.f41266n >= nVar2.f41265m || jNanoTime < nVar2.f41267o;
            }
        }
        synchronized (this) {
            j10 = jNanoTime - this.f5815q;
        }
        if (j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS || !z10) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !nVar.exhausted();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final co.e j(q qVar, co.g gVar) {
        int i10 = gVar.f6801g;
        Socket socket = this.f5803d;
        kotlin.jvm.internal.n.c(socket);
        lo.n nVar = this.f5807h;
        kotlin.jvm.internal.n.c(nVar);
        lo.m mVar = this.f5808i;
        kotlin.jvm.internal.n.c(mVar);
        n nVar2 = this.f5806g;
        if (nVar2 != null) {
            return new fo.o(qVar, this, gVar, nVar2);
        }
        socket.setSoTimeout(i10);
        lo.v vVarTimeout = nVar.f45656a.timeout();
        long j10 = i10;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVarTimeout.g(j10);
        mVar.f45653a.timeout().g(gVar.f6802h);
        return new eo.g(qVar, this, nVar, mVar);
    }

    public final synchronized void k() {
        this.f5809j = true;
    }

    public final void l() throws SocketException {
        int i10;
        Socket socket = this.f5803d;
        kotlin.jvm.internal.n.c(socket);
        lo.n nVar = this.f5807h;
        kotlin.jvm.internal.n.c(nVar);
        lo.m mVar = this.f5808i;
        kotlin.jvm.internal.n.c(mVar);
        socket.setSoTimeout(0);
        ao.d taskRunner = ao.d.f5064i;
        kotlin.jvm.internal.n.f(taskRunner, "taskRunner");
        x xVar = new x();
        xVar.f23260a = taskRunner;
        xVar.f23265f = fo.h.f41234a;
        String peerName = this.f5801b.f54095a.f53917h.f53992d;
        kotlin.jvm.internal.n.f(peerName, "peerName");
        xVar.f23261b = socket;
        String str = yn.a.f54565f + ' ' + peerName;
        kotlin.jvm.internal.n.f(str, "<set-?>");
        xVar.f23262c = str;
        xVar.f23263d = nVar;
        xVar.f23264e = mVar;
        xVar.f23265f = this;
        n nVar2 = new n(xVar);
        this.f5806g = nVar2;
        fo.z zVar = n.f41253z;
        this.f5813o = (zVar.f41330a & 16) != 0 ? zVar.f41331b[4] : Integer.MAX_VALUE;
        fo.w wVar = nVar2.f41275w;
        synchronized (wVar) {
            try {
                if (wVar.f41324d) {
                    throw new IOException("closed");
                }
                Logger logger = fo.w.f41320f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(yn.a.h(">> CONNECTION " + fo.f.f41230a.g(), new Object[0]));
                }
                wVar.f41321a.g(fo.f.f41230a);
                wVar.f41321a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        fo.w wVar2 = nVar2.f41275w;
        fo.z settings = nVar2.f41268p;
        synchronized (wVar2) {
            try {
                kotlin.jvm.internal.n.f(settings, "settings");
                if (wVar2.f41324d) {
                    throw new IOException("closed");
                }
                wVar2.c(0, Integer.bitCount(settings.f41330a) * 6, 4, 0);
                int i11 = 0;
                while (i11 < 10) {
                    boolean z10 = true;
                    if (((1 << i11) & settings.f41330a) == 0) {
                        z10 = false;
                    }
                    if (z10) {
                        if (i11 != 4) {
                            i10 = i11 != 7 ? i11 : 4;
                        } else {
                            i10 = 3;
                        }
                        wVar2.f41321a.writeShort(i10);
                        wVar2.f41321a.writeInt(settings.f41331b[i11]);
                    }
                    i11++;
                }
                wVar2.f41321a.flush();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        int iA = nVar2.f41268p.a();
        if (iA != 65535) {
            nVar2.f41275w.n(0, iA - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        }
        taskRunner.e().c(new ao.b(0, nVar2.f41256c, nVar2.f41276x), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        z zVar = this.f5801b;
        sb2.append(zVar.f54095a.f53917h.f53992d);
        sb2.append(':');
        sb2.append(zVar.f54095a.f53917h.f53993e);
        sb2.append(", proxy=");
        sb2.append(zVar.f54096b);
        sb2.append(" hostAddress=");
        sb2.append(zVar.f54097c);
        sb2.append(" cipherSuite=");
        xn.k kVar = this.f5804e;
        if (kVar == null || (obj = kVar.f53984b) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f5805f);
        sb2.append('}');
        return sb2.toString();
    }
}
