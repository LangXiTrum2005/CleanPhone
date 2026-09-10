package com.thinkup.core.common.no.m;

import android.os.Build;
import j$.time.Duration;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes6.dex */
public class omm implements mo0.o, oo.o, Cloneable {
    final List<oon> m0;
    final ProxySelector mm;
    final nm mn;
    final o0m.o mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final o00 f42069n;
    final n n0;
    final SocketFactory nm;
    final SSLSocketFactory nn;
    final com.thinkup.core.common.no.m.o.o.om no;
    final Proxy o0;
    final com.thinkup.core.common.no.m.o.mm.n o00;
    final on o0m;
    final m o0n;
    final HostnameVerifier o0o;
    final List<n0> om;
    final boolean om0;
    final int omm;
    final int omn;
    final boolean omo;
    final List<oon> on;
    final int on0;
    final int onm;
    final int ono;
    final List<on0> oo;
    final m oo0;
    final o0o oom;
    final boolean oon;
    final mn ooo;
    static final List<on0> o = com.thinkup.core.common.no.m.o.n.o(on0.HTTP_2, on0.HTTP_1_1);
    static final List<n0> m = com.thinkup.core.common.no.m.o.n.o(n0.m, n0.o0);

    public static final class o {
        Proxy m;
        ProxySelector m0;
        n mm;
        com.thinkup.core.common.no.m.o.o.om mn;
        nm mo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        List<on0> f42070n;
        SocketFactory n0;
        com.thinkup.core.common.no.m.o.mm.n nm;
        HostnameVerifier nn;
        SSLSocketFactory no;
        o00 o;
        List<n0> o0;
        on o00;
        m o0m;
        mn o0n;
        m o0o;
        final List<oon> om;
        int om0;
        int omm;
        int omn;
        int omo;
        o0m.o on;
        int on0;
        final List<oon> oo;
        o0o oo0;
        boolean oom;
        boolean oon;
        boolean ooo;

        public o() {
            this.oo = new ArrayList();
            this.om = new ArrayList();
            this.o = new o00();
            this.f42070n = omm.o;
            this.o0 = omm.m;
            this.on = o0m.o(o0m.o);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.m0 = proxySelector;
            if (proxySelector == null) {
                this.m0 = new com.thinkup.core.common.no.m.o.m0.o();
            }
            this.mo = nm.o;
            this.n0 = SocketFactory.getDefault();
            this.nn = com.thinkup.core.common.no.m.o.mm.oo.o;
            this.o00 = on.o;
            m mVar = m.o;
            this.o0o = mVar;
            this.o0m = mVar;
            this.o0n = new mn();
            this.oo0 = o0o.o;
            this.ooo = true;
            this.oom = true;
            this.oon = true;
            this.om0 = 0;
            this.omo = 10000;
            this.omm = 10000;
            this.omn = 10000;
            this.on0 = 0;
        }

        private o m(Duration duration) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.omo = com.thinkup.core.common.no.m.o.n.o("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            }
            return this;
        }

        private o n(Duration duration) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.omm = com.thinkup.core.common.no.m.o.n.o("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            }
            return this;
        }

        private o o(Duration duration) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.om0 = com.thinkup.core.common.no.m.o.n.o("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            }
            return this;
        }

        private o o0(long j, TimeUnit timeUnit) {
            this.om0 = com.thinkup.core.common.no.m.o.n.o("timeout", j, timeUnit);
            return this;
        }

        private o oo(long j, TimeUnit timeUnit) {
            this.on0 = com.thinkup.core.common.no.m.o.n.o("interval", j, timeUnit);
            return this;
        }

        private o o0(Duration duration) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.omn = com.thinkup.core.common.no.m.o.n.o("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            }
            return this;
        }

        private o oo(Duration duration) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.on0 = com.thinkup.core.common.no.m.o.n.o("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            }
            return this;
        }

        public final o m(long j, TimeUnit timeUnit) {
            this.omm = com.thinkup.core.common.no.m.o.n.o("timeout", j, timeUnit);
            return this;
        }

        public final o n(long j, TimeUnit timeUnit) {
            this.omn = com.thinkup.core.common.no.m.o.n.o("timeout", j, timeUnit);
            return this;
        }

        public final o o(long j, TimeUnit timeUnit) {
            this.omo = com.thinkup.core.common.no.m.o.n.o("timeout", j, timeUnit);
            return this;
        }

        private o m(m mVar) {
            if (mVar != null) {
                this.o0o = mVar;
                return this;
            }
            throw new NullPointerException("proxyAuthenticator == null");
        }

        private o n(boolean z2) {
            this.oon = z2;
            return this;
        }

        private o o(Proxy proxy) {
            this.m = proxy;
            return this;
        }

        private List<oon> n() {
            return this.om;
        }

        private o o(ProxySelector proxySelector) {
            if (proxySelector != null) {
                this.m0 = proxySelector;
                return this;
            }
            throw new NullPointerException("proxySelector == null");
        }

        private o m(boolean z2) {
            this.oom = z2;
            return this;
        }

        private o m(List<n0> list) {
            this.o0 = com.thinkup.core.common.no.m.o.n.o(list);
            return this;
        }

        private o o(nm nmVar) {
            if (nmVar != null) {
                this.mo = nmVar;
                return this;
            }
            throw new NullPointerException("cookieJar == null");
        }

        private List<oon> m() {
            return this.oo;
        }

        private o m(oon oonVar) {
            if (oonVar != null) {
                this.om.add(oonVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        private o o(n nVar) {
            this.mm = nVar;
            this.mn = null;
            return this;
        }

        public final o o(o0o o0oVar) {
            this.oo0 = o0oVar;
            return this;
        }

        private o o(SocketFactory socketFactory) {
            if (socketFactory != null) {
                if (!(socketFactory instanceof SSLSocketFactory)) {
                    this.n0 = socketFactory;
                    return this;
                }
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            throw new NullPointerException("socketFactory == null");
        }

        private o o(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory != null) {
                this.no = sSLSocketFactory;
                this.nm = com.thinkup.core.common.no.m.o.on.n.oo().m(sSLSocketFactory);
                return this;
            }
            throw new NullPointerException("sslSocketFactory == null");
        }

        private o o(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            }
            if (x509TrustManager != null) {
                this.no = sSLSocketFactory;
                this.nm = com.thinkup.core.common.no.m.o.on.n.oo().o(x509TrustManager);
                return this;
            }
            throw new NullPointerException("trustManager == null");
        }

        private o o(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.nn = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        public o(omm ommVar) {
            ArrayList arrayList = new ArrayList();
            this.oo = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.om = arrayList2;
            this.o = ommVar.f42069n;
            this.m = ommVar.o0;
            this.f42070n = ommVar.oo;
            this.o0 = ommVar.om;
            arrayList.addAll(ommVar.on);
            arrayList2.addAll(ommVar.m0);
            this.on = ommVar.mo;
            this.m0 = ommVar.mm;
            this.mo = ommVar.mn;
            this.mn = ommVar.no;
            this.mm = ommVar.n0;
            this.n0 = ommVar.nm;
            this.no = ommVar.nn;
            this.nm = ommVar.o00;
            this.nn = ommVar.o0o;
            this.o00 = ommVar.o0m;
            this.o0o = ommVar.o0n;
            this.o0m = ommVar.oo0;
            this.o0n = ommVar.ooo;
            this.oo0 = ommVar.oom;
            this.ooo = ommVar.oon;
            this.oom = ommVar.om0;
            this.oon = ommVar.omo;
            this.om0 = ommVar.omm;
            this.omo = ommVar.omn;
            this.omm = ommVar.on0;
            this.omn = ommVar.ono;
            this.on0 = ommVar.onm;
        }

        private o o(on onVar) {
            if (onVar != null) {
                this.o00 = onVar;
                return this;
            }
            throw new NullPointerException("certificatePinner == null");
        }

        private o o(m mVar) {
            if (mVar != null) {
                this.o0m = mVar;
                return this;
            }
            throw new NullPointerException("authenticator == null");
        }

        public final o o(mn mnVar) {
            if (mnVar != null) {
                this.o0n = mnVar;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        private o o(boolean z2) {
            this.ooo = z2;
            return this;
        }

        public final o o(o00 o00Var) {
            this.o = o00Var;
            return this;
        }

        public final o o(List<on0> list) {
            ArrayList arrayList = new ArrayList(list);
            on0 on0Var = on0.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(on0Var) && !arrayList.contains(on0.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: ".concat(String.valueOf(arrayList)));
            }
            if (arrayList.contains(on0Var) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: ".concat(String.valueOf(arrayList)));
            }
            if (!arrayList.contains(on0.HTTP_1_0)) {
                if (!arrayList.contains(null)) {
                    arrayList.remove(on0.SPDY_3);
                    this.f42070n = Collections.unmodifiableList(arrayList);
                    return this;
                }
                throw new IllegalArgumentException("protocols must not contain null");
            }
            throw new IllegalArgumentException("protocols must not contain http/1.0: ".concat(String.valueOf(arrayList)));
        }

        private o o(oon oonVar) {
            if (oonVar != null) {
                this.oo.add(oonVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public final o o(o0m o0mVar) {
            if (o0mVar != null) {
                this.on = o0m.o(o0mVar);
                return this;
            }
            throw new NullPointerException("eventListener == null");
        }

        private o o(o0m.o oVar) {
            if (oVar != null) {
                this.on = oVar;
                return this;
            }
            throw new NullPointerException("eventListenerFactory == null");
        }

        public final omm o() {
            return new omm(this);
        }
    }

    static {
        com.thinkup.core.common.no.m.o.o.o = new com.thinkup.core.common.no.m.o.o() { // from class: com.thinkup.core.common.no.m.omm.1
            @Override // com.thinkup.core.common.no.m.o.o
            public final void o(ooo.o oVar, String str) {
                oVar.o(str);
            }

            @Override // com.thinkup.core.common.no.m.o.o
            public final void o(ooo.o oVar, String str, String str2) {
                oVar.n(str, str2);
            }

            @Override // com.thinkup.core.common.no.m.o.o
            public final com.thinkup.core.common.no.m.o.m.om o(mn mnVar) {
                return mnVar.o;
            }

            @Override // com.thinkup.core.common.no.m.o.o
            public final boolean o(com.thinkup.core.common.no.m.o oVar, com.thinkup.core.common.no.m.o oVar2) {
                return oVar.o(oVar2);
            }

            @Override // com.thinkup.core.common.no.m.o.o
            public final int o(m00.o oVar) {
                return oVar.f41989n;
            }

            @Override // com.thinkup.core.common.no.m.o.o
            public final oo o(omm ommVar, onm onmVar) {
                return ono.o(ommVar, onmVar, true);
            }

            @Override // com.thinkup.core.common.no.m.o.o
            public final com.thinkup.core.common.no.m.o.m.n o(m00 m00Var) {
                return m00Var.no;
            }

            @Override // com.thinkup.core.common.no.m.o.o
            public final void o(n0 n0Var, SSLSocket sSLSocket, boolean z2) {
                String[] enabledCipherSuites;
                String[] enabledProtocols;
                if (n0Var.on != null) {
                    enabledCipherSuites = com.thinkup.core.common.no.m.o.n.o(mo.o, sSLSocket.getEnabledCipherSuites(), n0Var.on);
                } else {
                    enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                }
                if (n0Var.m0 != null) {
                    enabledProtocols = com.thinkup.core.common.no.m.o.n.o(com.thinkup.core.common.no.m.o.n.on, sSLSocket.getEnabledProtocols(), n0Var.m0);
                } else {
                    enabledProtocols = sSLSocket.getEnabledProtocols();
                }
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                int iO = com.thinkup.core.common.no.m.o.n.o(mo.o, supportedCipherSuites, "TLS_FALLBACK_SCSV");
                if (z2 && iO != -1) {
                    enabledCipherSuites = com.thinkup.core.common.no.m.o.n.o(enabledCipherSuites, supportedCipherSuites[iO]);
                }
                n0 n0VarM = new n0.o(n0Var).o(enabledCipherSuites).m(enabledProtocols).m();
                String[] strArr = n0VarM.m0;
                if (strArr != null) {
                    sSLSocket.setEnabledProtocols(strArr);
                }
                String[] strArr2 = n0VarM.on;
                if (strArr2 != null) {
                    sSLSocket.setEnabledCipherSuites(strArr2);
                }
            }

            @Override // com.thinkup.core.common.no.m.o.o
            public final void o(m00.o oVar, com.thinkup.core.common.no.m.o.m.n nVar) {
                oVar.no = nVar;
            }
        };
    }

    public omm() {
        this(new o());
    }

    private static SSLSocketFactory o(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextN = com.thinkup.core.common.no.m.o.on.n.oo().n();
            sSLContextN.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextN.getSocketFactory();
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS", e2);
        }
    }

    private n om0() {
        return this.n0;
    }

    private o00 omm() {
        return this.f42069n;
    }

    private List<oon> omn() {
        return this.on;
    }

    private com.thinkup.core.common.no.m.o.o.om omo() {
        n nVar = this.n0;
        return nVar != null ? nVar.o : this.no;
    }

    private List<oon> on0() {
        return this.m0;
    }

    private int oom() {
        return this.on0;
    }

    private int oon() {
        return this.ono;
    }

    private int ooo() {
        return this.omn;
    }

    public final int m() {
        return this.onm;
    }

    public final SSLSocketFactory m0() {
        return this.nn;
    }

    public final on mm() {
        return this.o0m;
    }

    public final m mn() {
        return this.oo0;
    }

    public final HostnameVerifier mo() {
        return this.o0o;
    }

    public final Proxy n() {
        return this.o0;
    }

    public final m n0() {
        return this.o0n;
    }

    public final boolean nm() {
        return this.oon;
    }

    public final boolean nn() {
        return this.om0;
    }

    public final mn no() {
        return this.ooo;
    }

    public final ProxySelector o0() {
        return this.mm;
    }

    public final boolean o00() {
        return this.omo;
    }

    public final List<n0> o0m() {
        return this.om;
    }

    public final o0m.o o0n() {
        return this.mo;
    }

    public final List<on0> o0o() {
        return this.oo;
    }

    public final o0o om() {
        return this.oom;
    }

    public final SocketFactory on() {
        return this.nm;
    }

    public final nm oo() {
        return this.mn;
    }

    public final o oo0() {
        return new o(this);
    }

    public omm(o oVar) {
        boolean z2;
        this.f42069n = oVar.o;
        this.o0 = oVar.m;
        this.oo = oVar.f42070n;
        List<n0> list = oVar.o0;
        this.om = list;
        this.on = com.thinkup.core.common.no.m.o.n.o(oVar.oo);
        this.m0 = com.thinkup.core.common.no.m.o.n.o(oVar.om);
        this.mo = oVar.on;
        this.mm = oVar.m0;
        this.mn = oVar.mo;
        this.n0 = oVar.mm;
        this.no = oVar.mn;
        this.nm = oVar.n0;
        Iterator<n0> it = list.iterator();
        loop0: while (true) {
            z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    z2 = (z2 || it.next().oo) ? true : z2;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = oVar.no;
        if (sSLSocketFactory == null && z2) {
            X509TrustManager x509TrustManagerO = com.thinkup.core.common.no.m.o.n.o();
            this.nn = o(x509TrustManagerO);
            this.o00 = com.thinkup.core.common.no.m.o.on.n.oo().o(x509TrustManagerO);
        } else {
            this.nn = sSLSocketFactory;
            this.o00 = oVar.nm;
        }
        if (this.nn != null) {
            com.thinkup.core.common.no.m.o.on.n.oo();
        }
        this.o0o = oVar.nn;
        this.o0m = oVar.o00.o(this.o00);
        this.o0n = oVar.o0o;
        this.oo0 = oVar.o0m;
        this.ooo = oVar.o0n;
        this.oom = oVar.oo0;
        this.oon = oVar.ooo;
        this.om0 = oVar.oom;
        this.omo = oVar.oon;
        this.omm = oVar.om0;
        this.omn = oVar.omo;
        this.on0 = oVar.omm;
        this.ono = oVar.omn;
        this.onm = oVar.on0;
        if (this.on.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.on);
        }
        if (this.m0.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.m0);
        }
    }

    public final int o() {
        return this.omm;
    }

    @Override // com.thinkup.core.common.no.m.oo.o
    public final oo o(onm onmVar) {
        return ono.o(this, onmVar, false);
    }

    @Override // com.thinkup.core.common.no.m.mo0.o
    public final mo0 o(onm onmVar, moo mooVar) {
        com.thinkup.core.common.no.m.o.mn.o oVar = new com.thinkup.core.common.no.m.o.mn.o(onmVar, mooVar, new Random(), this.onm);
        oVar.o(this);
        return oVar;
    }
}
