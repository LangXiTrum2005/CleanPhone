package com.thinkup.core.common.no.m.o.m;

import com.thinkup.core.common.no.m.o0m;
import com.thinkup.core.common.no.m.omm;
import com.thinkup.core.common.no.m.onm;
import com.thinkup.core.common.no.m.oom;
import com.thinkup.core.common.no.m.oon;
import com.thinkup.core.common.no.n.om0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes6.dex */
public final class mm {
    static final /* synthetic */ boolean m = true;
    private Object m0;
    private o0 mm;
    private n mn;
    private onm mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final omm f42008n;
    private boolean n0;
    private boolean nm;
    private boolean nn;
    private boolean no;
    public oo o;
    private final om o0;
    private boolean o00;
    private final o0m om;
    private final com.thinkup.core.common.no.n.o on;
    private final com.thinkup.core.common.no.m.oo oo;

    public static final class o extends WeakReference<mm> {
        final Object o;

        public o(mm mmVar, Object obj) {
            super(mmVar);
            this.o = obj;
        }
    }

    public mm(omm ommVar, com.thinkup.core.common.no.m.oo ooVar) {
        com.thinkup.core.common.no.n.o oVar = new com.thinkup.core.common.no.n.o() { // from class: com.thinkup.core.common.no.m.o.m.mm.1
            @Override // com.thinkup.core.common.no.n.o
            public final void o() {
                mm.this.mo();
            }
        };
        this.on = oVar;
        this.f42008n = ommVar;
        this.o0 = com.thinkup.core.common.no.m.o.o.o.o(ommVar.no());
        this.oo = ooVar;
        this.om = ommVar.o0n().o();
        oVar.o(ommVar.o(), TimeUnit.MILLISECONDS);
    }

    public final void m() {
        this.on.n();
    }

    public final boolean m0() {
        boolean z2;
        synchronized (this.o0) {
            z2 = this.mn != null;
        }
        return z2;
    }

    public final boolean mm() {
        boolean z2;
        synchronized (this.o0) {
            z2 = this.nm;
        }
        return z2;
    }

    public final void mo() {
        n nVar;
        oo ooVarO;
        synchronized (this.o0) {
            try {
                this.nm = true;
                nVar = this.mn;
                o0 o0Var = this.mm;
                ooVarO = (o0Var == null || o0Var.o() == null) ? this.o : this.mm.o();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (nVar != null) {
            nVar.oo.oo();
        } else if (ooVarO != null) {
            ooVarO.om();
        }
    }

    public final void n() {
        if (this.nn) {
            throw new IllegalStateException();
        }
        this.nn = true;
        this.on.o0();
    }

    public final om0 o() {
        return this.on;
    }

    public final void o0() {
        this.m0 = com.thinkup.core.common.no.m.o.on.n.oo().o("response.body().close()");
    }

    public final void om() {
        synchronized (this.o0) {
            try {
                if (this.o00) {
                    throw new IllegalStateException();
                }
                this.mn = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean on() {
        return this.mm.n() && this.mm.o0();
    }

    public final Socket oo() {
        if (!m && !Thread.holdsLock(this.o0)) {
            throw new AssertionError();
        }
        int size = this.o.oo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            if (this.o.oo.get(i2).get() == this) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        oo ooVar = this.o;
        ooVar.oo.remove(i2);
        this.o = null;
        if (ooVar.oo.isEmpty()) {
            ooVar.om = System.nanoTime();
            if (this.o0.m(ooVar)) {
                return ooVar.m();
            }
        }
        return null;
    }

    private IOException m(IOException iOException) {
        if (this.nn || !this.on.o0()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final void o(onm onmVar) {
        SSLSocketFactory sSLSocketFactoryM0;
        HostnameVerifier hostnameVerifierMo;
        com.thinkup.core.common.no.m.on onVarMm;
        onm onmVar2 = this.mo;
        if (onmVar2 != null) {
            if (com.thinkup.core.common.no.m.o.n.o(onmVar2.o(), onmVar.o()) && this.mm.o0()) {
                return;
            }
            if (this.mn != null) {
                throw new IllegalStateException();
            }
            if (this.mm != null) {
                o((IOException) null, true);
                this.mm = null;
            }
        }
        this.mo = onmVar;
        om omVar = this.o0;
        oom oomVarO = onmVar.o();
        if (oomVarO.n()) {
            sSLSocketFactoryM0 = this.f42008n.m0();
            hostnameVerifierMo = this.f42008n.mo();
            onVarMm = this.f42008n.mm();
        } else {
            sSLSocketFactoryM0 = null;
            hostnameVerifierMo = null;
            onVarMm = null;
        }
        this.mm = new o0(this, omVar, new com.thinkup.core.common.no.m.o(oomVarO.om(), oomVarO.on(), this.f42008n.om(), this.f42008n.on(), sSLSocketFactoryM0, hostnameVerifierMo, onVarMm, this.f42008n.n0(), this.f42008n.n(), this.f42008n.o0o(), this.f42008n.o0m(), this.f42008n.o0()), this.oo, this.om);
    }

    private com.thinkup.core.common.no.m.o o(oom oomVar) {
        SSLSocketFactory sSLSocketFactoryM0;
        HostnameVerifier hostnameVerifierMo;
        com.thinkup.core.common.no.m.on onVarMm;
        if (oomVar.n()) {
            sSLSocketFactoryM0 = this.f42008n.m0();
            hostnameVerifierMo = this.f42008n.mo();
            onVarMm = this.f42008n.mm();
        } else {
            sSLSocketFactoryM0 = null;
            hostnameVerifierMo = null;
            onVarMm = null;
        }
        return new com.thinkup.core.common.no.m.o(oomVar.om(), oomVar.on(), this.f42008n.om(), this.f42008n.on(), sSLSocketFactoryM0, hostnameVerifierMo, onVarMm, this.f42008n.n0(), this.f42008n.n(), this.f42008n.o0o(), this.f42008n.o0m(), this.f42008n.o0());
    }

    public final n o(oon.o oVar, boolean z2) throws Throwable {
        synchronized (this.o0) {
            try {
                try {
                    if (!this.o00) {
                        if (this.mn == null) {
                            n nVar = new n(this, this.oo, this.om, this.mm, this.mm.o(this.f42008n, oVar, z2));
                            synchronized (this.o0) {
                                this.mn = nVar;
                                this.n0 = false;
                                this.no = false;
                            }
                            return nVar;
                        }
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                    }
                    throw new IllegalStateException("released");
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            throw th;
        }
    }

    public final void o(oo ooVar) {
        if (!m && !Thread.holdsLock(this.o0)) {
            throw new AssertionError();
        }
        if (this.o == null) {
            this.o = ooVar;
            ooVar.oo.add(new o(this, this.m0));
            return;
        }
        throw new IllegalStateException();
    }

    public final IOException o(n nVar, boolean z2, boolean z3, IOException iOException) {
        boolean z4;
        synchronized (this.o0) {
            try {
                n nVar2 = this.mn;
                if (nVar != nVar2) {
                    return iOException;
                }
                boolean z5 = true;
                if (z2) {
                    z4 = !this.n0;
                    this.n0 = true;
                } else {
                    z4 = false;
                }
                if (z3) {
                    if (!this.no) {
                        z4 = true;
                    }
                    this.no = true;
                }
                if (this.n0 && this.no && z4) {
                    nVar2.o().o0++;
                    this.mn = null;
                } else {
                    z5 = false;
                }
                return z5 ? o(iOException, false) : iOException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final IOException o(IOException iOException) {
        synchronized (this.o0) {
            this.o00 = true;
        }
        return o(iOException, false);
    }

    private IOException o(IOException iOException, boolean z2) {
        Socket socketOo;
        boolean z3;
        synchronized (this.o0) {
            if (z2) {
                try {
                    if (this.mn != null) {
                        throw new IllegalStateException("cannot release connection while it is in use");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            socketOo = (this.o != null && this.mn == null && (z2 || this.o00)) ? oo() : null;
            z3 = this.o00 && this.mn == null;
        }
        com.thinkup.core.common.no.m.o.n.o(socketOo);
        if (!z3 || this.nn || !this.on.o0()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
