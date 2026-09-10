package com.thinkup.core.common.no.n;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class o extends om0 {
    static o m = null;
    private static final int o = 65536;
    private static final long o0;
    private static final long oo;
    private long m0;
    private boolean om;
    private o on;

    /* JADX INFO: renamed from: com.thinkup.core.common.no.n.o$2, reason: invalid class name */
    public class AnonymousClass2 implements oon {
        final /* synthetic */ oon o;

        public AnonymousClass2(oon oonVar) {
            this.o = oonVar;
        }

        @Override // com.thinkup.core.common.no.n.oon
        public final long a_(n nVar, long j) throws IOException {
            o.this.n();
            try {
                try {
                    long jA_ = this.o.a_(nVar, j);
                    o.this.o(true);
                    return jA_;
                } catch (IOException e2) {
                    throw o.this.m(e2);
                }
            } catch (Throwable th) {
                o.this.o(false);
                throw th;
            }
        }

        @Override // com.thinkup.core.common.no.n.oon, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            o.this.n();
            try {
                try {
                    this.o.close();
                    o.this.o(true);
                } catch (IOException e2) {
                    throw o.this.m(e2);
                }
            } catch (Throwable th) {
                o.this.o(false);
                throw th;
            }
        }

        @Override // com.thinkup.core.common.no.n.oon
        public final om0 o() {
            return o.this;
        }

        public final String toString() {
            return "AsyncTimeout.source(" + this.o + ")";
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.no.n.o$o, reason: collision with other inner class name */
    public static final class C0676o extends Thread {
        public C0676o() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0017, code lost:
        
            r1.o();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<com.thinkup.core.common.no.n.o> r0 = com.thinkup.core.common.no.n.o.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                com.thinkup.core.common.no.n.o r1 = com.thinkup.core.common.no.n.o.oo()     // Catch: java.lang.Throwable -> Lb
                if (r1 != 0) goto Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                goto L0
            Lb:
                r1 = move-exception
                goto L1b
            Ld:
                com.thinkup.core.common.no.n.o r2 = com.thinkup.core.common.no.n.o.m     // Catch: java.lang.Throwable -> Lb
                if (r1 != r2) goto L16
                r1 = 0
                com.thinkup.core.common.no.n.o.m = r1     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return
            L16:
                monitor-exit(r0)     // Catch: java.lang.InterruptedException -> L0
                r1.o()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L1b:
                monitor-exit(r0)     // Catch: java.lang.InterruptedException -> L0
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.thinkup.core.common.no.n.o.C0676o.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        o0 = millis;
        oo = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    private long m(long j) {
        return this.m0 - j;
    }

    public static o oo() throws InterruptedException {
        o oVar = m.on;
        if (oVar == null) {
            long jNanoTime = System.nanoTime();
            o.class.wait(o0);
            if (m.on != null || System.nanoTime() - jNanoTime < oo) {
                return null;
            }
            return m;
        }
        long jNanoTime2 = oVar.m0 - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j = jNanoTime2 / 1000000;
            o.class.wait(j, (int) (jNanoTime2 - (1000000 * j)));
            return null;
        }
        m.on = oVar.on;
        oVar.on = null;
        return oVar;
    }

    public final void n() {
        if (this.om) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jG_ = g_();
        boolean zD_ = d_();
        if (jG_ != 0 || zD_) {
            this.om = true;
            o(this, jG_, zD_);
        }
    }

    public void o() {
    }

    public final boolean o0() {
        if (!this.om) {
            return false;
        }
        this.om = false;
        return o(this);
    }

    private static synchronized void o(o oVar, long j, boolean z2) {
        o oVar2;
        try {
            if (m == null) {
                m = new o();
                new C0676o().start();
            }
            long jNanoTime = System.nanoTime();
            if (j != 0 && z2) {
                oVar.m0 = Math.min(j, oVar.e_() - jNanoTime) + jNanoTime;
            } else if (j != 0) {
                oVar.m0 = j + jNanoTime;
            } else {
                if (!z2) {
                    throw new AssertionError();
                }
                oVar.m0 = oVar.e_();
            }
            long j2 = oVar.m0 - jNanoTime;
            o oVar3 = m;
            while (true) {
                oVar2 = oVar3.on;
                if (oVar2 == null || j2 < oVar2.m0 - jNanoTime) {
                    break;
                    break;
                }
                oVar3 = oVar2;
            }
            oVar.on = oVar2;
            oVar3.on = oVar;
            if (oVar3 == m) {
                o.class.notify();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final IOException m(IOException iOException) {
        return !o0() ? iOException : o(iOException);
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.no.n.o$1, reason: invalid class name */
    public class AnonymousClass1 implements oom {
        final /* synthetic */ oom o;

        public AnonymousClass1(oom oomVar) {
            this.o = oomVar;
        }

        @Override // com.thinkup.core.common.no.n.oom, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            o.this.n();
            try {
                try {
                    this.o.close();
                    o.this.o(true);
                } catch (IOException e2) {
                    throw o.this.m(e2);
                }
            } catch (Throwable th) {
                o.this.o(false);
                throw th;
            }
        }

        @Override // com.thinkup.core.common.no.n.oom, java.io.Flushable
        public final void flush() throws IOException {
            o.this.n();
            try {
                try {
                    this.o.flush();
                    o.this.o(true);
                } catch (IOException e2) {
                    throw o.this.m(e2);
                }
            } catch (Throwable th) {
                o.this.o(false);
                throw th;
            }
        }

        @Override // com.thinkup.core.common.no.n.oom
        public final void o(n nVar, long j) throws IOException {
            omo.o(nVar.f42084n, 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                o0n o0nVar = nVar.m;
                while (j2 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    j2 += (long) (o0nVar.oo - o0nVar.o0);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    o0nVar = o0nVar.m0;
                }
                o.this.n();
                try {
                    try {
                        this.o.o(nVar, j2);
                        j -= j2;
                        o.this.o(true);
                    } catch (IOException e2) {
                        throw o.this.m(e2);
                    }
                } catch (Throwable th) {
                    o.this.o(false);
                    throw th;
                }
            }
        }

        public final String toString() {
            return "AsyncTimeout.sink(" + this.o + ")";
        }

        @Override // com.thinkup.core.common.no.n.oom
        public final om0 o() {
            return o.this;
        }
    }

    private static synchronized boolean o(o oVar) {
        o oVar2 = m;
        while (oVar2 != null) {
            o oVar3 = oVar2.on;
            if (oVar3 == oVar) {
                oVar2.on = oVar.on;
                oVar.on = null;
                return false;
            }
            oVar2 = oVar3;
        }
        return true;
    }

    private oom o(oom oomVar) {
        return new AnonymousClass1(oomVar);
    }

    private oon o(oon oonVar) {
        return new AnonymousClass2(oonVar);
    }

    public final void o(boolean z2) throws IOException {
        if (o0() && z2) {
            throw o((IOException) null);
        }
    }

    public IOException o(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
