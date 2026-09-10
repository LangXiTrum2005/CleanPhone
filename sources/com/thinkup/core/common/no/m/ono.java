package com.thinkup.core.common.no.m;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
final class ono implements oo {
    final onm m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f42079n;
    final omm o;
    private com.thinkup.core.common.no.m.o.m.mm o0;
    private boolean oo;

    public final class o extends com.thinkup.core.common.no.m.o.m {
        static final /* synthetic */ boolean o = true;
        private final om o0;
        private volatile AtomicInteger oo;

        public o(om omVar) {
            super("%s %s", omn.o, ono.this.mo());
            this.oo = new AtomicInteger(0);
            this.o0 = omVar;
        }

        private onm o0() {
            return ono.this.m;
        }

        private ono oo() {
            return ono.this;
        }

        public final String m() {
            return ono.this.m.o.no;
        }

        @Override // com.thinkup.core.common.no.m.o.m
        public final void n() {
            boolean z2;
            Throwable th;
            IOException e2;
            o00 o00Var;
            ono.this.o0.m();
            try {
                try {
                    z2 = true;
                    try {
                        this.o0.o(ono.this.mm());
                        o00Var = ono.this.o.f42069n;
                    } catch (IOException e3) {
                        e2 = e3;
                        if (z2) {
                            com.thinkup.core.common.no.m.o.on.n.oo().o(4, "Callback failure for " + ono.this.m0(), e2);
                        } else {
                            this.o0.o(e2);
                        }
                        o00Var = ono.this.o.f42069n;
                    } catch (Throwable th2) {
                        th = th2;
                        ono.this.n();
                        if (!z2) {
                            IOException iOException = new IOException("canceled due to ".concat(String.valueOf(th)));
                            iOException.addSuppressed(th);
                            this.o0.o(iOException);
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    z2 = false;
                    e2 = e4;
                } catch (Throwable th3) {
                    z2 = false;
                    th = th3;
                }
                o00Var.m(this);
            } catch (Throwable th4) {
                ono.this.o.f42069n.m(this);
                throw th4;
            }
        }

        public final AtomicInteger o() {
            return this.oo;
        }

        public final void o(o oVar) {
            this.oo = oVar.oo;
        }

        public final void o(ExecutorService executorService) {
            if (!o && Thread.holdsLock(ono.this.o.f42069n)) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e2);
                    ono.this.o0.o(interruptedIOException);
                    this.o0.o(interruptedIOException);
                    ono.this.o.f42069n.m(this);
                }
            } catch (Throwable th) {
                ono.this.o.f42069n.m(this);
                throw th;
            }
        }
    }

    private ono(omm ommVar, onm onmVar, boolean z2) {
        this.o = ommVar;
        this.m = onmVar;
        this.f42079n = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.thinkup.core.common.no.m.oo
    /* JADX INFO: renamed from: mn, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ono on() {
        return o(this.o, this.m, this.f42079n);
    }

    @Override // com.thinkup.core.common.no.m.oo
    public final m00 m() {
        synchronized (this) {
            if (this.oo) {
                throw new IllegalStateException("Already Executed");
            }
            this.oo = true;
        }
        this.o0.m();
        this.o0.o0();
        try {
            this.o.f42069n.o(this);
            return mm();
        } finally {
            this.o.f42069n.m(this);
        }
    }

    public final String m0() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.o0.mm() ? "canceled " : "");
        sb.append(this.f42079n ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(mo());
        return sb.toString();
    }

    public final m00 mm() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.o.on);
        arrayList.add(new com.thinkup.core.common.no.m.o.n.mm(this.o));
        arrayList.add(new com.thinkup.core.common.no.m.o.n.o(this.o.mn));
        omm ommVar = this.o;
        n nVar = ommVar.n0;
        arrayList.add(new com.thinkup.core.common.no.m.o.o.o(nVar != null ? nVar.o : ommVar.no));
        arrayList.add(new com.thinkup.core.common.no.m.o.m.o(this.o));
        if (!this.f42079n) {
            arrayList.addAll(this.o.m0);
        }
        arrayList.add(new com.thinkup.core.common.no.m.o.n.m(this.f42079n));
        com.thinkup.core.common.no.m.o.m.mm mmVar = this.o0;
        onm onmVar = this.m;
        omm ommVar2 = this.o;
        try {
            try {
                m00 m00VarO = new com.thinkup.core.common.no.m.o.n.on(arrayList, mmVar, null, 0, onmVar, this, ommVar2.omn, ommVar2.on0, ommVar2.ono).o(this.m);
                if (this.o0.mm()) {
                    com.thinkup.core.common.no.m.o.n.o(m00VarO);
                    throw new IOException("Canceled");
                }
                this.o0.o((IOException) null);
                return m00VarO;
            } catch (IOException e2) {
                throw this.o0.o(e2);
            }
        } catch (Throwable th) {
            if (0 == 0) {
                this.o0.o((IOException) null);
            }
            throw th;
        }
    }

    public final String mo() {
        return this.m.o.n0();
    }

    @Override // com.thinkup.core.common.no.m.oo
    public final void n() {
        this.o0.mo();
    }

    @Override // com.thinkup.core.common.no.m.oo
    public final synchronized boolean o0() {
        return this.oo;
    }

    @Override // com.thinkup.core.common.no.m.oo
    public final com.thinkup.core.common.no.n.om0 om() {
        return this.o0.o();
    }

    @Override // com.thinkup.core.common.no.m.oo
    public final boolean oo() {
        return this.o0.mm();
    }

    public static ono o(omm ommVar, onm onmVar, boolean z2) {
        ono onoVar = new ono(ommVar, onmVar, z2);
        onoVar.o0 = new com.thinkup.core.common.no.m.o.m.mm(ommVar, onoVar);
        return onoVar;
    }

    @Override // com.thinkup.core.common.no.m.oo
    public final onm o() {
        return this.m;
    }

    @Override // com.thinkup.core.common.no.m.oo
    public final void o(om omVar) {
        synchronized (this) {
            if (!this.oo) {
                this.oo = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.o0.o0();
        this.o.f42069n.o(new o(omVar));
    }
}
