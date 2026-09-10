package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.app.NotificationCompat;
import com.badlogic.gdx.net.HttpRequestHeader;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.efs.sdk.base.Constants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
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

/* JADX INFO: loaded from: classes4.dex */
public final class KX extends AbstractC4908wA implements InterfaceC3722ij {
    public final C3834k00 b;
    public Socket c;
    public Socket d;
    public C3657hz e;
    public EnumC5106yW f;
    public GA g;
    public EX h;
    public DX i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public KX(LX lx, C3834k00 c3834k00) {
        AbstractC2995aW.q(lx, "connectionPool");
        AbstractC2995aW.q(c3834k00, "route");
        this.b = c3834k00;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(C4838vS c4838vS, C3834k00 c3834k00, IOException iOException) {
        AbstractC2995aW.q(c4838vS, "client");
        AbstractC2995aW.q(c3834k00, "failedRoute");
        AbstractC2995aW.q(iOException, "failure");
        if (c3834k00.b.type() != Proxy.Type.DIRECT) {
            C3048b3 c3048b3 = c3834k00.f4578a;
            c3048b3.h.connectFailed(c3048b3.i.h(), c3834k00.b.address(), iOException);
        }
        C3830jy c3830jy = c4838vS.D;
        synchronized (c3830jy) {
            c3830jy.f4577a.add(c3834k00);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4908wA
    public final synchronized void a(GA ga, R50 r50) {
        AbstractC2995aW.q(ga, "connection");
        AbstractC2995aW.q(r50, "settings");
        this.o = (r50.f3643a & 16) != 0 ? r50.b[4] : Integer.MAX_VALUE;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4908wA
    public final void b(MA ma) {
        AbstractC2995aW.q(ma, "stream");
        ma.c(EnumC2502Ir.REFUSED_STREAM, null);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:59:0x011b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0121  */
    /* JADX WARN: Code duplicated, block: B:62:0x012a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0130  */
    /* JADX WARN: Code duplicated, block: B:66:0x0134  */
    /* JADX WARN: Code duplicated, block: B:68:0x0138  */
    /* JADX WARN: Code duplicated, block: B:74:0x0148  */
    /* JADX WARN: Code duplicated, block: B:76:0x014c A[LOOP:0: B:86:0x006e->B:76:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x014f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DX, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EX, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GA, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hz, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yW, java.net.Socket] */
    /* JADX WARN: Type inference failed for: r11v3 */
    public final void c(int i, int i2, int i3, int i4, boolean z, IX ix, AbstractC2865Wr abstractC2865Wr) throws Throwable {
        Socket socket;
        Socket socket2;
        AbstractC2995aW.q(ix, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(abstractC2865Wr, "eventListener");
        if (this.f != null) {
            throw new IllegalStateException("already connected".toString());
        }
        List list = this.b.f4578a.k;
        C4073mj c4073mj = new C4073mj(list);
        C3048b3 c3048b3 = this.b.f4578a;
        if (c3048b3.c == null) {
            if (!list.contains(C3985lj.f)) {
                throw new C3922l00(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.f4578a.i.d;
            C5104yU c5104yU = C5104yU.f5278a;
            if (!C5104yU.f5278a.h(str)) {
                throw new C3922l00(new UnknownServiceException(DM.B("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c3048b3.j.contains(EnumC5106yW.H2_PRIOR_KNOWLEDGE)) {
            throw new C3922l00(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        ?? r11 = 0;
        C3922l00 c3922l00 = null;
        while (true) {
            try {
                C3834k00 c3834k00 = this.b;
                if (c3834k00.f4578a.c == null || c3834k00.b.type() != Proxy.Type.HTTP) {
                    try {
                        e(i, i2, ix, abstractC2865Wr);
                    } catch (IOException e) {
                        e = e;
                        socket = this.d;
                        if (socket != null) {
                            Vg0.d(socket);
                        }
                        socket2 = this.c;
                        if (socket2 != null) {
                            Vg0.d(socket2);
                        }
                        this.d = r11;
                        this.c = r11;
                        this.h = r11;
                        this.i = r11;
                        this.e = r11;
                        this.f = r11;
                        this.g = r11;
                        this.o = 1;
                        C3834k00 c3834k01 = this.b;
                        abstractC2865Wr.connectFailed(ix, c3834k01.c, c3834k01.b, null, e);
                        if (c3922l00 == null) {
                            c3922l00 = new C3922l00(e);
                        } else {
                            AbstractC2995aW.h(c3922l00.f4624a, e);
                            c3922l00.b = e;
                        }
                        if (z) {
                            throw c3922l00;
                        }
                        c4073mj.d = true;
                        if (c4073mj.c) {
                            throw c3922l00;
                        }
                        if (!(e instanceof ProtocolException)) {
                            throw c3922l00;
                        }
                        if (!(e instanceof InterruptedIOException)) {
                            throw c3922l00;
                        }
                        if (!(e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                            throw c3922l00;
                        }
                        if (!(e instanceof SSLPeerUnverifiedException)) {
                            throw c3922l00;
                        }
                        if (e instanceof SSLException) {
                            throw c3922l00;
                        }
                        r11 = 0;
                    }
                } else {
                    f(i, i2, i3, ix, abstractC2865Wr);
                    if (this.c == null) {
                        break;
                    }
                }
                try {
                    g(c4073mj, i4, ix, abstractC2865Wr);
                    C3834k00 c3834k02 = this.b;
                    abstractC2865Wr.connectEnd(ix, c3834k02.c, c3834k02.b, this.f);
                    break;
                } catch (IOException e2) {
                    e = e2;
                    socket = this.d;
                    if (socket != null) {
                        Vg0.d(socket);
                    }
                    socket2 = this.c;
                    if (socket2 != null) {
                        Vg0.d(socket2);
                    }
                    this.d = r11;
                    this.c = r11;
                    this.h = r11;
                    this.i = r11;
                    this.e = r11;
                    this.f = r11;
                    this.g = r11;
                    this.o = 1;
                    C3834k00 c3834k03 = this.b;
                    abstractC2865Wr.connectFailed(ix, c3834k03.c, c3834k03.b, null, e);
                    if (c3922l00 == null) {
                        c3922l00 = new C3922l00(e);
                    } else {
                        AbstractC2995aW.h(c3922l00.f4624a, e);
                        c3922l00.b = e;
                    }
                    if (z) {
                        throw c3922l00;
                    }
                    c4073mj.d = true;
                    if (c4073mj.c) {
                        throw c3922l00;
                    }
                    if (!(e instanceof ProtocolException)) {
                        throw c3922l00;
                    }
                    if (!(e instanceof InterruptedIOException)) {
                        throw c3922l00;
                    }
                    if (!(e instanceof SSLHandshakeException)) {
                    }
                    if (!(e instanceof SSLPeerUnverifiedException)) {
                        throw c3922l00;
                    }
                    if (e instanceof SSLException) {
                        throw c3922l00;
                    }
                    r11 = 0;
                }
            } catch (IOException e3) {
                e = e3;
            }
            r11 = 0;
        }
        C3834k00 c3834k04 = this.b;
        if (c3834k04.f4578a.c != null && c3834k04.b.type() == Proxy.Type.HTTP && this.c == null) {
            throw new C3922l00(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.q = System.nanoTime();
    }

    public final void e(int i, int i2, IX ix, AbstractC2865Wr abstractC2865Wr) throws IOException {
        Socket socketCreateSocket;
        C3834k00 c3834k00 = this.b;
        Proxy proxy = c3834k00.b;
        C3048b3 c3048b3 = c3834k00.f4578a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : JX.f3269a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            socketCreateSocket = c3048b3.b.createSocket();
            AbstractC2995aW.n(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.c = socketCreateSocket;
        abstractC2865Wr.connectStart(ix, this.b.c, proxy);
        socketCreateSocket.setSoTimeout(i2);
        try {
            C5104yU c5104yU = C5104yU.f5278a;
            C5104yU.f5278a.e(socketCreateSocket, this.b.c, i);
            try {
                this.h = AbstractC4496rb.f(AbstractC4496rb.y(socketCreateSocket));
                this.i = AbstractC4496rb.e(AbstractC4496rb.v(socketCreateSocket));
            } catch (NullPointerException e) {
                if (AbstractC2995aW.i(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException(AbstractC2995aW.v0(this.b.c, "Failed to connect to "));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, IX ix, AbstractC2865Wr abstractC2865Wr) throws IOException {
        GY gy = new GY();
        C3834k00 c3834k00 = this.b;
        ZA za = c3834k00.f4578a.i;
        AbstractC2995aW.q(za, "url");
        gy.f3127a = za;
        gy.e("CONNECT", null);
        C3048b3 c3048b3 = c3834k00.f4578a;
        gy.c(HttpRequestHeader.Host, Vg0.v(c3048b3.i, true));
        gy.c("Proxy-Connection", "Keep-Alive");
        gy.c("User-Agent", "okhttp/4.10.0");
        HY hyB = gy.b();
        C5036xh c5036xh = new C5036xh();
        C3336eJ.e(HttpResponseHeader.ProxyAuthenticate);
        C3336eJ.f("OkHttp-Preemptive", HttpResponseHeader.ProxyAuthenticate);
        c5036xh.j(HttpResponseHeader.ProxyAuthenticate);
        c5036xh.c(HttpResponseHeader.ProxyAuthenticate, "OkHttp-Preemptive");
        c5036xh.e();
        ((G7) c3048b3.f).getClass();
        e(i, i2, ix, abstractC2865Wr);
        String str = "CONNECT " + Vg0.v(hyB.f3175a, true) + " HTTP/1.1";
        EX ex = this.h;
        AbstractC2995aW.n(ex);
        DX dx = this.i;
        AbstractC2995aW.n(dx);
        C4556sA c4556sA = new C4556sA(null, this, ex, dx);
        Ic0 ic0Timeout = ex.f3026a.timeout();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ic0Timeout.g(j, timeUnit);
        dx.f2973a.timeout().g(i3, timeUnit);
        c4556sA.j(hyB.c, str);
        c4556sA.a();
        C4845vZ c4845vZF = c4556sA.f(false);
        AbstractC2995aW.n(c4845vZF);
        c4845vZF.f5136a = hyB;
        C5021xZ c5021xZA = c4845vZF.a();
        long j2 = Vg0.j(c5021xZA);
        if (j2 != -1) {
            C4293pA c4293pAI = c4556sA.i(j2);
            Vg0.t(c4293pAI, Integer.MAX_VALUE, timeUnit);
            c4293pAI.close();
        }
        int i4 = c5021xZA.d;
        if (i4 != 200) {
            if (i4 != 407) {
                throw new IOException(AbstractC2995aW.v0(Integer.valueOf(i4), "Unexpected response code for CONNECT: "));
            }
            ((G7) c3048b3.f).getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!ex.b.K() || !dx.b.K()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(C4073mj c4073mj, int i, IX ix, AbstractC2865Wr abstractC2865Wr) throws Throwable {
        SSLSocket sSLSocket;
        String strF;
        C3048b3 c3048b3 = this.b.f4578a;
        SSLSocketFactory sSLSocketFactory = c3048b3.c;
        EnumC5106yW enumC5106yWN = EnumC5106yW.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c3048b3.j;
            EnumC5106yW enumC5106yW = EnumC5106yW.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(enumC5106yW)) {
                this.d = this.c;
                this.f = enumC5106yWN;
                return;
            } else {
                this.d = this.c;
                this.f = enumC5106yW;
                m(i);
                return;
            }
        }
        abstractC2865Wr.secureConnectStart(ix);
        C3048b3 c3048b4 = this.b.f4578a;
        SSLSocketFactory sSLSocketFactory2 = c3048b4.c;
        try {
            AbstractC2995aW.n(sSLSocketFactory2);
            Socket socket = this.c;
            ZA za = c3048b4.i;
            Socket socketCreateSocket = sSLSocketFactory2.createSocket(socket, za.d, za.e, true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                C3985lj c3985ljA = c4073mj.a(sSLSocket2);
                if (c3985ljA.b) {
                    C5104yU c5104yU = C5104yU.f5278a;
                    C5104yU.f5278a.d(sSLSocket2, c3048b4.i.d, c3048b4.j);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                AbstractC2995aW.p(session, "sslSocketSession");
                C3657hz c3657hzL = C3887ke.l(session);
                HostnameVerifier hostnameVerifier = c3048b4.d;
                AbstractC2995aW.n(hostnameVerifier);
                if (hostnameVerifier.verify(c3048b4.i.d, session)) {
                    C4500rd c4500rd = c3048b4.e;
                    AbstractC2995aW.n(c4500rd);
                    this.e = new C3657hz(c3657hzL.f4481a, c3657hzL.b, c3657hzL.c, new C2379Dy(c4500rd, c3657hzL, c3048b4, 6));
                    c4500rd.a(c3048b4.i.d, new X9(this, 15));
                    if (c3985ljA.b) {
                        C5104yU c5104yU2 = C5104yU.f5278a;
                        strF = C5104yU.f5278a.f(sSLSocket2);
                    } else {
                        strF = null;
                    }
                    this.d = sSLSocket2;
                    this.h = AbstractC4496rb.f(AbstractC4496rb.y(sSLSocket2));
                    this.i = AbstractC4496rb.e(AbstractC4496rb.v(sSLSocket2));
                    if (strF != null) {
                        enumC5106yWN = C3887ke.n(strF);
                    }
                    this.f = enumC5106yWN;
                    C5104yU c5104yU3 = C5104yU.f5278a;
                    C5104yU.f5278a.a(sSLSocket2);
                    abstractC2865Wr.secureConnectEnd(ix, this.e);
                    if (this.f == EnumC5106yW.HTTP_2) {
                        m(i);
                        return;
                    }
                    return;
                }
                List listA = c3657hzL.a();
                if (!(!listA.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + c3048b4.i.d + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) listA.get(0);
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(c3048b4.i.d);
                sb.append(" not verified:\n              |    certificate: ");
                C4500rd c4500rd2 = C4500rd.c;
                AbstractC2995aW.q(x509Certificate, "certificate");
                C3971lc c3971lc = C3971lc.d;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                AbstractC2995aW.p(encoded, "publicKey.encoded");
                sb.append(AbstractC2995aW.v0(G7.D(encoded).b("SHA-256").a(), "sha256/"));
                sb.append("\n              |    DN: ");
                sb.append((Object) x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(AbstractC2853Wf.p0(C4135nS.a(x509Certificate, 2), C4135nS.a(x509Certificate, 7)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(AbstractC3375el.e0(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    C5104yU c5104yU4 = C5104yU.f5278a;
                    C5104yU.f5278a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    Vg0.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket = null;
        }
    }

    public final synchronized void h() {
        this.m++;
    }

    public final boolean i(C3048b3 c3048b3, List list) {
        C3657hz c3657hz;
        AbstractC2995aW.q(c3048b3, "address");
        byte[] bArr = Vg0.f3884a;
        if (this.p.size() < this.o && !this.j) {
            C3834k00 c3834k00 = this.b;
            if (!c3834k00.f4578a.a(c3048b3)) {
                return false;
            }
            ZA za = c3048b3.i;
            String str = za.d;
            C3048b3 c3048b4 = c3834k00.f4578a;
            if (AbstractC2995aW.i(str, c3048b4.i.d)) {
                return true;
            }
            if (this.g != null && list != null) {
                List<C3834k00> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (C3834k00 c3834k01 : list2) {
                        Proxy.Type type = c3834k01.b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && c3834k00.b.type() == type2) {
                            if (AbstractC2995aW.i(c3834k00.c, c3834k01.c)) {
                                if (c3048b3.d == C4135nS.f4744a) {
                                    byte[] bArr2 = Vg0.f3884a;
                                    ZA za2 = c3048b4.i;
                                    if (za.e != za2.e) {
                                        break;
                                    }
                                    String str2 = za2.d;
                                    String str3 = za.d;
                                    if (!AbstractC2995aW.i(str3, str2)) {
                                        if (!this.k && (c3657hz = this.e) != null) {
                                            List listA = c3657hz.a();
                                            if (!(!listA.isEmpty()) || !C4135nS.c(str3, (X509Certificate) listA.get(0))) {
                                                break;
                                                break;
                                            }
                                        } else {
                                            break;
                                            break;
                                        }
                                    }
                                    try {
                                        C4500rd c4500rd = c3048b3.e;
                                        AbstractC2995aW.n(c4500rd);
                                        C3657hz c3657hz2 = this.e;
                                        AbstractC2995aW.n(c3657hz2);
                                        List listA2 = c3657hz2.a();
                                        AbstractC2995aW.q(str3, "hostname");
                                        AbstractC2995aW.q(listA2, "peerCertificates");
                                        c4500rd.a(str3, new C2379Dy(c4500rd, listA2, str3, 5));
                                        return true;
                                    } catch (SSLPeerUnverifiedException unused) {
                                        break;
                                    }
                                }
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean j(boolean z) {
        long j;
        byte[] bArr = Vg0.f3884a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.c;
        AbstractC2995aW.n(socket);
        Socket socket2 = this.d;
        AbstractC2995aW.n(socket2);
        EX ex = this.h;
        AbstractC2995aW.n(ex);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        GA ga = this.g;
        if (ga != null) {
            return ga.f(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !ex.K();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final InterfaceC4264os k(C4838vS c4838vS, MX mx) throws SocketException {
        Socket socket = this.d;
        AbstractC2995aW.n(socket);
        EX ex = this.h;
        AbstractC2995aW.n(ex);
        DX dx = this.i;
        AbstractC2995aW.n(dx);
        GA ga = this.g;
        if (ga != null) {
            return new HA(c4838vS, this, mx, ga);
        }
        int i = mx.g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ex.f3026a.timeout().g(i, timeUnit);
        dx.f2973a.timeout().g(mx.h, timeUnit);
        return new C4556sA(c4838vS, this, ex, dx);
    }

    public final synchronized void l() {
        this.j = true;
    }

    public final void m(int i) throws SocketException {
        String strV0;
        Socket socket = this.d;
        AbstractC2995aW.n(socket);
        EX ex = this.h;
        AbstractC2995aW.n(ex);
        DX dx = this.i;
        AbstractC2995aW.n(dx);
        int i2 = 0;
        socket.setSoTimeout(0);
        C4497rb0 c4497rb0 = C4497rb0.h;
        C4732uA c4732uA = new C4732uA(c4497rb0);
        String str = this.b.f4578a.i.d;
        AbstractC2995aW.q(str, "peerName");
        c4732uA.c = socket;
        if (c4732uA.f5069a) {
            strV0 = Vg0.g + ' ' + str;
        } else {
            strV0 = AbstractC2995aW.v0(str, "MockWebServer ");
        }
        AbstractC2995aW.q(strV0, "<set-?>");
        c4732uA.d = strV0;
        c4732uA.e = ex;
        c4732uA.f = dx;
        c4732uA.g = this;
        c4732uA.i = i;
        GA ga = new GA(c4732uA);
        this.g = ga;
        R50 r50 = GA.B;
        this.o = (r50.f3643a & 16) != 0 ? r50.b[4] : Integer.MAX_VALUE;
        NA na = ga.y;
        synchronized (na) {
            try {
                if (na.e) {
                    throw new IOException("closed");
                }
                if (na.b) {
                    Logger logger = NA.g;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(Vg0.h(AbstractC2995aW.v0(AbstractC4644tA.f5023a.d(), ">> CONNECTION "), new Object[0]));
                    }
                    na.f3445a.I(AbstractC4644tA.f5023a);
                    na.f3445a.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ga.y.i(ga.r);
        int iA = ga.r.a();
        if (iA != 65535) {
            ga.y.k(0, iA - 65535);
        }
        c4497rb0.f().c(new C4146nb0(ga.z, ga.d, i2), 0L);
    }

    public final String toString() {
        C2800Ue c2800Ue;
        StringBuilder sb = new StringBuilder("Connection{");
        C3834k00 c3834k00 = this.b;
        sb.append(c3834k00.f4578a.i.d);
        sb.append(':');
        sb.append(c3834k00.f4578a.i.e);
        sb.append(", proxy=");
        sb.append(c3834k00.b);
        sb.append(" hostAddress=");
        sb.append(c3834k00.c);
        sb.append(" cipherSuite=");
        C3657hz c3657hz = this.e;
        Object obj = Constants.CP_NONE;
        if (c3657hz != null && (c2800Ue = c3657hz.b) != null) {
            obj = c2800Ue;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
