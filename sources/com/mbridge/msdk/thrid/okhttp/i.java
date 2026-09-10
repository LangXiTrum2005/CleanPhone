package com.mbridge.msdk.thrid.okhttp;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Executor f36247g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f36248h = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f36250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f36251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Deque<com.mbridge.msdk.thrid.okhttp.internal.connection.c> f36252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.connection.d f36253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f36254f;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long jA = i.this.a(System.nanoTime());
                if (jA == -1) {
                    return;
                }
                if (jA > 0) {
                    long j10 = jA / 1000000;
                    long j11 = jA - (1000000 * j10);
                    synchronized (i.this) {
                        try {
                            i.this.wait(j10, (int) j11);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public i() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public com.mbridge.msdk.thrid.okhttp.internal.connection.c a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c0 c0Var) {
        if (!f36248h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar : this.f36252d) {
            if (cVar.a(aVar, c0Var)) {
                gVar.a(cVar, true);
                return cVar;
            }
        }
        return null;
    }

    public void b(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
        if (!f36248h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.f36254f) {
            this.f36254f = true;
            f36247g.execute(this.f36251c);
        }
        this.f36252d.add(cVar);
    }

    public i(int i10, long j10, TimeUnit timeUnit) {
        this.f36251c = new a();
        this.f36252d = new ArrayDeque();
        this.f36253e = new com.mbridge.msdk.thrid.okhttp.internal.connection.d();
        this.f36249a = i10;
        this.f36250b = timeUnit.toNanos(j10);
        if (j10 <= 0) {
            throw new IllegalArgumentException(defpackage.e.i(j10, "keepAliveDuration <= 0: "));
        }
    }

    public Socket a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar) {
        if (!f36248h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar : this.f36252d) {
            if (cVar.a(aVar, null) && cVar.f() && cVar != gVar.c()) {
                return gVar.b(cVar);
            }
        }
        return null;
    }

    public boolean a(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
        if (!f36248h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!cVar.f36305k && this.f36249a != 0) {
            notifyAll();
            return false;
        }
        this.f36252d.remove(cVar);
        return true;
    }

    public long a(long j10) {
        synchronized (this) {
            try {
                com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar = null;
                long j11 = Long.MIN_VALUE;
                int i10 = 0;
                int i11 = 0;
                for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2 : this.f36252d) {
                    if (a(cVar2, j10) > 0) {
                        i11++;
                    } else {
                        i10++;
                        long j12 = j10 - cVar2.f36308o;
                        if (j12 > j11) {
                            cVar = cVar2;
                            j11 = j12;
                        }
                    }
                }
                long j13 = this.f36250b;
                if (j11 < j13 && i10 <= this.f36249a) {
                    if (i10 > 0) {
                        return j13 - j11;
                    }
                    if (i11 > 0) {
                        return j13;
                    }
                    this.f36254f = false;
                    return -1L;
                }
                this.f36252d.remove(cVar);
                com.mbridge.msdk.thrid.okhttp.internal.c.a(cVar.g());
                return 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private int a(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar, long j10) {
        List<Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g>> list = cVar.f36307n;
        int i10 = 0;
        while (i10 < list.size()) {
            Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g> reference = list.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a("A connection to " + cVar.c().a().k() + " was leaked. Did you forget to close a response body?", ((com.mbridge.msdk.thrid.okhttp.internal.connection.g.a) reference).f36336a);
                list.remove(i10);
                cVar.f36305k = true;
                if (list.isEmpty()) {
                    cVar.f36308o = j10 - this.f36250b;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
