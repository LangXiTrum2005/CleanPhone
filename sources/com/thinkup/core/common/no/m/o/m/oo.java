package com.thinkup.core.common.no.m.o.m;

import android.support.v4.media.a;
import com.smartdigimkt.o0.b;
import com.thinkup.core.common.no.m.m00;
import com.thinkup.core.common.no.m.m0m;
import com.thinkup.core.common.no.m.n0;
import com.thinkup.core.common.no.m.omm;
import com.thinkup.core.common.no.m.omn;
import com.thinkup.core.common.no.m.on0;
import com.thinkup.core.common.no.m.onm;
import com.thinkup.core.common.no.m.onn;
import com.thinkup.core.common.no.m.oo0;
import com.thinkup.core.common.no.m.oom;
import com.thinkup.core.common.no.m.oon;
import com.thinkup.core.common.no.n.nm;
import com.thinkup.core.common.no.n.om0;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class oo extends com.thinkup.core.common.no.m.o.oo.om.n implements com.thinkup.core.common.no.m.mm {
    private static final int mm = 21;
    private static final String mo = "throw with null exception";
    static final /* synthetic */ boolean on = true;
    boolean m;
    private final m0m mn;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f42015n;
    private Socket n0;
    private oo0 nm;
    private on0 nn;
    private Socket no;
    public final om o;
    int o0;
    private com.thinkup.core.common.no.m.o.oo.om o00;
    private com.thinkup.core.common.no.n.o0 o0m;
    private int o0n;
    private com.thinkup.core.common.no.n.oo o0o;
    private int oo0 = 1;
    final List<Reference<mm>> oo = new ArrayList();
    long om = Long.MAX_VALUE;

    public oo(om omVar, m0m m0mVar) {
        this.o = omVar;
        this.mn = m0mVar;
    }

    private onm m0() {
        onm onmVarM = new onm.o().o(this.mn.o().o()).o("CONNECT", (onn) null).o("Host", com.thinkup.core.common.no.m.o.n.o(this.mn.o().o(), true)).o("Proxy-Connection", b.f37292c).m();
        new m00.o().o(onmVarM).o(on0.HTTP_1_1).o(407).o("Preemptive Authenticate").o(com.thinkup.core.common.no.m.o.n.o0).o(-1L).m(-1L).o("Proxy-Authenticate", omn.o + "-Preemptive").o();
        onm onmVarO = this.mn.o().o0().o();
        return onmVarO != null ? onmVarO : onmVarM;
    }

    private static oo o(om omVar, m0m m0mVar, Socket socket, long j) {
        oo ooVar = new oo(omVar, m0mVar);
        ooVar.no = socket;
        ooVar.om = j;
        return ooVar;
    }

    @Override // com.thinkup.core.common.no.m.mm
    public final Socket m() {
        return this.no;
    }

    @Override // com.thinkup.core.common.no.m.mm
    public final oo0 n() {
        return this.nm;
    }

    @Override // com.thinkup.core.common.no.m.mm
    public final on0 o0() {
        return this.nn;
    }

    public final void om() {
        com.thinkup.core.common.no.m.o.n.o(this.n0);
    }

    public final boolean on() {
        return this.o00 != null;
    }

    public final void oo() {
        if (!on && Thread.holdsLock(this.o)) {
            throw new AssertionError();
        }
        synchronized (this.o) {
            this.m = true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.mn.o().o().om());
        sb.append(":");
        sb.append(this.mn.o().o().on());
        sb.append(", proxy=");
        sb.append(this.mn.m());
        sb.append(" hostAddress=");
        sb.append(this.mn.n());
        sb.append(" cipherSuite=");
        oo0 oo0Var = this.nm;
        sb.append(oo0Var != null ? oo0Var.m() : "none");
        sb.append(" protocol=");
        sb.append(this.nn);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final void o(int i2, int i3, int i4, int i5, boolean z2) throws Throwable {
        if (this.nn == null) {
            List<n0> listOm = this.mn.o().om();
            m mVar = new m(listOm);
            if (this.mn.o().mo() == null) {
                if (listOm.contains(n0.o0)) {
                    String strOm = this.mn.o().o().om();
                    if (!com.thinkup.core.common.no.m.o.on.n.oo().m(strOm)) {
                        throw new m0(new UnknownServiceException(a.n("CLEARTEXT communication to ", strOm, " not permitted by network security policy")));
                    }
                } else {
                    throw new m0(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (this.mn.o().oo().contains(on0.H2_PRIOR_KNOWLEDGE)) {
                throw new m0(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            m0 m0Var = null;
            while (true) {
                try {
                    if (this.mn.o0()) {
                        o(i2, i3, i4);
                        if (this.n0 != null) {
                            break;
                        } else {
                            break;
                        }
                    }
                    o(i2, i3);
                    if (this.mn.o().mo() == null) {
                        List<on0> listOo = this.mn.o().oo();
                        on0 on0Var = on0.H2_PRIOR_KNOWLEDGE;
                        if (listOo.contains(on0Var)) {
                            this.no = this.n0;
                            this.nn = on0Var;
                            o(i5);
                        } else {
                            this.no = this.n0;
                            this.nn = on0.HTTP_1_1;
                        }
                    } else {
                        o(mVar);
                        if (this.nn == on0.HTTP_2) {
                            o(i5);
                        }
                    }
                    this.mn.n();
                    this.mn.m();
                    break;
                } catch (IOException e2) {
                    com.thinkup.core.common.no.m.o.n.o(this.no);
                    com.thinkup.core.common.no.m.o.n.o(this.n0);
                    this.no = null;
                    this.n0 = null;
                    this.o0o = null;
                    this.o0m = null;
                    this.nm = null;
                    this.nn = null;
                    this.o00 = null;
                    this.mn.n();
                    this.mn.m();
                    if (m0Var == null) {
                        m0Var = new m0(e2);
                    } else {
                        m0Var.o(e2);
                    }
                    if (z2) {
                        if (!mVar.o(e2)) {
                            throw m0Var;
                        }
                    } else {
                        throw m0Var;
                    }
                }
            }
            if (this.mn.o0() && this.n0 == null) {
                throw new m0(new ProtocolException("Too many tunnel connections attempted: 21"));
            }
            if (this.o00 != null) {
                synchronized (this.o) {
                    this.oo0 = this.o00.o();
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("already connected");
    }

    private void o(int i2, int i3) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyM = this.mn.m();
        com.thinkup.core.common.no.m.o oVarO = this.mn.o();
        if (proxyM.type() != Proxy.Type.DIRECT && proxyM.type() != Proxy.Type.HTTP) {
            socketCreateSocket = new Socket(proxyM);
        } else {
            socketCreateSocket = oVarO.n().createSocket();
        }
        this.n0 = socketCreateSocket;
        this.mn.n();
        this.n0.setSoTimeout(i3);
        try {
            com.thinkup.core.common.no.m.o.on.n.oo().o(this.n0, this.mn.n(), i2);
            try {
                this.o0o = nm.o(nm.m(this.n0));
                this.o0m = nm.o(nm.o(this.n0));
            } catch (NullPointerException e2) {
                if (mo.equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.mn.n());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    private void o(m mVar, int i2) throws Throwable {
        if (this.mn.o().mo() == null) {
            List<on0> listOo = this.mn.o().oo();
            on0 on0Var = on0.H2_PRIOR_KNOWLEDGE;
            if (listOo.contains(on0Var)) {
                this.no = this.n0;
                this.nn = on0Var;
                o(i2);
                return;
            } else {
                this.no = this.n0;
                this.nn = on0.HTTP_1_1;
                return;
            }
        }
        o(mVar);
        if (this.nn == on0.HTTP_2) {
            o(i2);
        }
    }

    private void o(int i2) throws SocketException {
        this.no.setSoTimeout(0);
        com.thinkup.core.common.no.m.o.oo.om omVarO = new com.thinkup.core.common.no.m.o.oo.om.o().o(this.no, this.mn.o().o().om(), this.o0o, this.o0m).o(this).o(i2).o();
        this.o00 = omVarO;
        omVarO.m();
    }

    private void o(m mVar) throws Throwable {
        on0 on0VarO;
        com.thinkup.core.common.no.m.o oVarO = this.mn.o();
        SSLSocket sSLSocket = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) oVarO.mo().createSocket(this.n0, oVarO.o().om(), oVarO.o().on(), true);
                try {
                    n0 n0VarO = mVar.o(sSLSocket2);
                    if (n0VarO.o()) {
                        com.thinkup.core.common.no.m.o.on.n.oo().o(sSLSocket2, oVarO.o().om(), oVarO.oo());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    oo0 oo0VarO = oo0.o(session);
                    if (!oVarO.mm().verify(oVarO.o().om(), session)) {
                        List<Certificate> listN = oo0VarO.n();
                        if (!listN.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) listN.get(0);
                            throw new SSLPeerUnverifiedException("Hostname " + oVarO.o().om() + " not verified:\n    certificate: " + com.thinkup.core.common.no.m.on.o((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + com.thinkup.core.common.no.m.o.mm.oo.o(x509Certificate));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + oVarO.o().om() + " not verified (no certificates)");
                    }
                    oVarO.mn().o(oVarO.o().om(), oo0VarO.n());
                    String strO = n0VarO.o() ? com.thinkup.core.common.no.m.o.on.n.oo().o(sSLSocket2) : null;
                    this.no = sSLSocket2;
                    this.o0o = nm.o(nm.m(sSLSocket2));
                    this.o0m = nm.o(nm.o(this.no));
                    this.nm = oo0VarO;
                    if (strO != null) {
                        on0VarO = on0.o(strO);
                    } else {
                        on0VarO = on0.HTTP_1_1;
                    }
                    this.nn = on0VarO;
                    com.thinkup.core.common.no.m.o.on.n.oo();
                } catch (AssertionError e2) {
                    e = e2;
                    if (!com.thinkup.core.common.no.m.o.n.o(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        com.thinkup.core.common.no.m.o.on.n.oo();
                    }
                    com.thinkup.core.common.no.m.o.n.o((Socket) sSLSocket);
                    throw th;
                }
            } catch (AssertionError e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private onm o(int i2, int i3, onm onmVar, oom oomVar) throws IOException {
        String str = "CONNECT " + com.thinkup.core.common.no.m.o.n.o(oomVar, true) + " HTTP/1.1";
        while (true) {
            com.thinkup.core.common.no.m.o.o0.o oVar = new com.thinkup.core.common.no.m.o.o0.o(null, null, this.o0o, this.o0m);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.o0o.o().o(i2, timeUnit);
            this.o0m.o().o(i3, timeUnit);
            oVar.o(onmVar.n(), str);
            oVar.n();
            m00 m00VarO = oVar.o(false).o(onmVar).o();
            oVar.n(m00VarO);
            int iN = m00VarO.n();
            if (iN == 200) {
                if (this.o0o.o0().on() && this.o0m.n().on()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iN == 407) {
                onm onmVarO = this.mn.o().o0().o();
                if (onmVarO != null) {
                    if ("close".equalsIgnoreCase(m00VarO.o("Connection"))) {
                        return onmVarO;
                    }
                    onmVar = onmVarO;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + m00VarO.n());
            }
        }
    }

    public final boolean o(com.thinkup.core.common.no.m.o oVar, List<m0m> list) {
        if (this.oo.size() >= this.oo0 || this.m || !com.thinkup.core.common.no.m.o.o.o.o(this.mn.o(), oVar)) {
            return false;
        }
        if (oVar.o().om().equals(this.mn.o().o().om())) {
            return true;
        }
        if (this.o00 != null && list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                m0m m0mVar = list.get(i2);
                Proxy.Type type = m0mVar.m().type();
                Proxy.Type type2 = Proxy.Type.DIRECT;
                if (type == type2 && this.mn.m().type() == type2 && this.mn.n().equals(m0mVar.n())) {
                    if (oVar.mm() != com.thinkup.core.common.no.m.o.mm.oo.o || !o(oVar.o())) {
                        return false;
                    }
                    try {
                        oVar.mn().o(oVar.o().om(), this.nm.n());
                        return true;
                    } catch (SSLPeerUnverifiedException unused) {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    private boolean o(List<m0m> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            m0m m0mVar = list.get(i2);
            Proxy.Type type = m0mVar.m().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.mn.m().type() == type2 && this.mn.n().equals(m0mVar.n())) {
                return true;
            }
        }
        return false;
    }

    public final boolean o(oom oomVar) {
        if (oomVar.on() != this.mn.o().o().on()) {
            return false;
        }
        if (oomVar.om().equals(this.mn.o().o().om())) {
            return true;
        }
        if (this.nm != null) {
            com.thinkup.core.common.no.m.o.mm.oo ooVar = com.thinkup.core.common.no.m.o.mm.oo.o;
            if (com.thinkup.core.common.no.m.o.mm.oo.o(oomVar.om(), (X509Certificate) this.nm.n().get(0))) {
                return true;
            }
        }
        return false;
    }

    public final com.thinkup.core.common.no.m.o.n.n o(omm ommVar, oon.o oVar) throws SocketException {
        if (this.o00 != null) {
            return new com.thinkup.core.common.no.m.o.oo.on(ommVar, this, oVar, this.o00);
        }
        this.no.setSoTimeout(oVar.oo());
        om0 om0VarO = this.o0o.o();
        long jOo = oVar.oo();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        om0VarO.o(jOo, timeUnit);
        this.o0m.o().o(oVar.om(), timeUnit);
        return new com.thinkup.core.common.no.m.o.o0.o(ommVar, this, this.o0o, this.o0m);
    }

    public final com.thinkup.core.common.no.m.o.mn.o.oo o(final n nVar) throws SocketException {
        this.no.setSoTimeout(0);
        oo();
        return new com.thinkup.core.common.no.m.o.mn.o.oo(this.o0o, this.o0m) { // from class: com.thinkup.core.common.no.m.o.m.oo.1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                nVar.o(true, true, null);
            }
        };
    }

    @Override // com.thinkup.core.common.no.m.mm
    public final m0m o() {
        return this.mn;
    }

    public final boolean o(boolean z2) {
        if (this.no.isClosed() || this.no.isInputShutdown() || this.no.isOutputShutdown()) {
            return false;
        }
        com.thinkup.core.common.no.m.o.oo.om omVar = this.o00;
        if (omVar != null) {
            return omVar.m(System.nanoTime());
        }
        if (z2) {
            try {
                int soTimeout = this.no.getSoTimeout();
                try {
                    this.no.setSoTimeout(1);
                    if (this.o0o.on()) {
                        this.no.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.no.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th) {
                    this.no.setSoTimeout(soTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.thinkup.core.common.no.m.o.oo.om.n
    public final void o(com.thinkup.core.common.no.m.o.oo.mo moVar) {
        moVar.o(com.thinkup.core.common.no.m.o.oo.m.REFUSED_STREAM, (IOException) null);
    }

    @Override // com.thinkup.core.common.no.m.o.oo.om.n
    public final void o(com.thinkup.core.common.no.m.o.oo.om omVar) {
        synchronized (this.o) {
            this.oo0 = omVar.o();
        }
    }

    public final void o(IOException iOException) {
        if (!on && Thread.holdsLock(this.o)) {
            throw new AssertionError();
        }
        synchronized (this.o) {
            try {
                if (iOException instanceof com.thinkup.core.common.no.m.o.oo.nm) {
                    com.thinkup.core.common.no.m.o.oo.m mVar = ((com.thinkup.core.common.no.m.o.oo.nm) iOException).o;
                    if (mVar == com.thinkup.core.common.no.m.o.oo.m.REFUSED_STREAM) {
                        int i2 = this.o0n + 1;
                        this.o0n = i2;
                        if (i2 > 1) {
                            this.m = true;
                            this.f42015n++;
                        }
                    } else if (mVar != com.thinkup.core.common.no.m.o.oo.m.CANCEL) {
                        this.m = true;
                        this.f42015n++;
                    }
                } else if (!on() || (iOException instanceof com.thinkup.core.common.no.m.o.oo.o)) {
                    this.m = true;
                    if (this.o0 == 0) {
                        if (iOException != null) {
                            om omVar = this.o;
                            m0m m0mVar = this.mn;
                            if (m0mVar.m().type() != Proxy.Type.DIRECT) {
                                com.thinkup.core.common.no.m.o oVarO = m0mVar.o();
                                oVarO.on().connectFailed(oVarO.o().o(), m0mVar.m().address(), iOException);
                            }
                            omVar.o.o(m0mVar);
                        }
                        this.f42015n++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void o(int i2, int i3, int i4) throws IOException {
        onm onmVarM = new onm.o().o(this.mn.o().o()).o("CONNECT", (onn) null).o("Host", com.thinkup.core.common.no.m.o.n.o(this.mn.o().o(), true)).o("Proxy-Connection", b.f37292c).m();
        new m00.o().o(onmVarM).o(on0.HTTP_1_1).o(407).o("Preemptive Authenticate").o(com.thinkup.core.common.no.m.o.n.o0).o(-1L).m(-1L).o("Proxy-Authenticate", omn.o + "-Preemptive").o();
        onm onmVarO = this.mn.o().o0().o();
        if (onmVarO != null) {
            onmVarM = onmVarO;
        }
        oom oomVarO = onmVarM.o();
        for (int i5 = 0; i5 < 21; i5++) {
            o(i2, i3);
            onmVarM = o(i3, i4, onmVarM, oomVarO);
            if (onmVarM == null) {
                return;
            }
            com.thinkup.core.common.no.m.o.n.o(this.n0);
            this.n0 = null;
            this.o0m = null;
            this.o0o = null;
            this.mn.n();
            this.mn.m();
        }
    }
}
