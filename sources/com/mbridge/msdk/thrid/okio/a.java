package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f36765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f36766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    static a f36767j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private a f36769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f36770g;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0189a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f36771a;

        public C0189a(r rVar) {
            this.f36771a = rVar;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            u.a(cVar.f36779b, 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                o oVar = cVar.f36778a;
                while (j11 < 65536) {
                    j11 += (long) (oVar.f36813c - oVar.f36812b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    }
                    oVar = oVar.f36816f;
                }
                a.this.h();
                try {
                    try {
                        this.f36771a.a(cVar, j11);
                        j10 -= j11;
                        a.this.a(true);
                    } catch (IOException e10) {
                        throw a.this.a(e10);
                    }
                } catch (Throwable th2) {
                    a.this.a(false);
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return a.this;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a.this.h();
            try {
                try {
                    this.f36771a.close();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            a.this.h();
            try {
                try {
                    this.f36771a.flush();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f36771a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c extends Thread {
        public c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0017, code lost:
        
            r0.j();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r2 = this;
            L0:
                java.lang.Class<com.mbridge.msdk.thrid.okio.a> r2 = com.mbridge.msdk.thrid.okio.a.class
                monitor-enter(r2)     // Catch: java.lang.InterruptedException -> L0
                com.mbridge.msdk.thrid.okio.a r0 = com.mbridge.msdk.thrid.okio.a.g()     // Catch: java.lang.Throwable -> Lb
                if (r0 != 0) goto Ld
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
                goto L0
            Lb:
                r0 = move-exception
                goto L1b
            Ld:
                com.mbridge.msdk.thrid.okio.a r1 = com.mbridge.msdk.thrid.okio.a.f36767j     // Catch: java.lang.Throwable -> Lb
                if (r0 != r1) goto L16
                r0 = 0
                com.mbridge.msdk.thrid.okio.a.f36767j = r0     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
                return
            L16:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
                r0.j()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L1b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
                throw r0     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f36765h = millis;
        f36766i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    private static synchronized void a(a aVar, long j10, boolean z10) {
        try {
            if (f36767j == null) {
                f36767j = new a();
                new c().start();
            }
            long jNanoTime = System.nanoTime();
            if (j10 != 0 && z10) {
                aVar.f36770g = Math.min(j10, aVar.c() - jNanoTime) + jNanoTime;
            } else if (j10 != 0) {
                aVar.f36770g = j10 + jNanoTime;
            } else {
                if (!z10) {
                    throw new AssertionError();
                }
                aVar.f36770g = aVar.c();
            }
            long jB = aVar.b(jNanoTime);
            a aVar2 = f36767j;
            while (true) {
                a aVar3 = aVar2.f36769f;
                if (aVar3 == null || jB < aVar3.b(jNanoTime)) {
                    break;
                    break;
                }
                aVar2 = aVar2.f36769f;
            }
            aVar.f36769f = aVar2.f36769f;
            aVar2.f36769f = aVar;
            if (aVar2 == f36767j) {
                a.class.notify();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private long b(long j10) {
        return this.f36770g - j10;
    }

    @Nullable
    public static a g() throws InterruptedException {
        a aVar = f36767j.f36769f;
        if (aVar == null) {
            long jNanoTime = System.nanoTime();
            a.class.wait(f36765h);
            if (f36767j.f36769f != null || System.nanoTime() - jNanoTime < f36766i) {
                return null;
            }
            return f36767j;
        }
        long jB = aVar.b(System.nanoTime());
        if (jB > 0) {
            long j10 = jB / 1000000;
            a.class.wait(j10, (int) (jB - (1000000 * j10)));
            return null;
        }
        f36767j.f36769f = aVar.f36769f;
        aVar.f36769f = null;
        return aVar;
    }

    public final void h() {
        if (this.f36768e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jF = f();
        boolean zD = d();
        if (jF != 0 || zD) {
            this.f36768e = true;
            a(this, jF, zD);
        }
    }

    public final boolean i() {
        if (!this.f36768e) {
            return false;
        }
        this.f36768e = false;
        return a(this);
    }

    public IOException b(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f36773a;

        public b(s sVar) {
            this.f36773a = sVar;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            a.this.h();
            try {
                try {
                    long jB = this.f36773a.b(cVar, j10);
                    a.this.a(true);
                    return jB;
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                try {
                    this.f36773a.close();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f36773a + ")";
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return a.this;
        }
    }

    private static synchronized boolean a(a aVar) {
        a aVar2 = f36767j;
        while (aVar2 != null) {
            a aVar3 = aVar2.f36769f;
            if (aVar3 == aVar) {
                aVar2.f36769f = aVar.f36769f;
                aVar.f36769f = null;
                return false;
            }
            aVar2 = aVar3;
        }
        return true;
    }

    public void j() {
    }

    public final r a(r rVar) {
        return new C0189a(rVar);
    }

    public final s a(s sVar) {
        return new b(sVar);
    }

    public final void a(boolean z10) throws IOException {
        if (i() && z10) {
            throw b((IOException) null);
        }
    }

    public final IOException a(IOException iOException) throws IOException {
        return !i() ? iOException : b(iOException);
    }
}
