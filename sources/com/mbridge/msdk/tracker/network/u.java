package com.mbridge.msdk.tracker.network;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ThreadPoolExecutor f37023a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f37027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.mbridge.msdk.tracker.network.b f37028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m f37029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f37030h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f37024b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<t<?>> f37025c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<t<?>> f37026d = new PriorityBlockingQueue<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<c> f37031i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f37032j = false;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "NetworkDispatcher");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                new n(u.this.f37026d, u.this.f37029g, u.this.f37028f, u.this.f37030h).run();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface c {
        void a(t<?> tVar, int i10);
    }

    public u(m mVar, w wVar, int i10, com.mbridge.msdk.tracker.network.b bVar) {
        this.f37027e = i10;
        this.f37028f = bVar;
        this.f37029g = mVar;
        this.f37030h = wVar;
    }

    private void a(int i10) {
        if (this.f37023a != null) {
            return;
        }
        try {
            b(i10);
        } catch (Throwable unused) {
            try {
                b(5);
            } catch (Exception unused2) {
                this.f37023a = null;
            }
        }
    }

    public void b() {
        if (!this.f37032j || this.f37023a == null) {
            a(this.f37027e);
            this.f37032j = true;
        }
    }

    public <T> void c(t<T> tVar) {
        synchronized (this.f37025c) {
            this.f37025c.remove(tVar);
        }
        a(tVar, 5);
    }

    public <T> void d(t<T> tVar) {
        this.f37026d.add(tVar);
    }

    private void b(int i10) {
        this.f37023a = new ThreadPoolExecutor(i10, i10, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public int a() {
        return this.f37024b.incrementAndGet();
    }

    public <T> void b(t<T> tVar) {
        d(tVar);
    }

    public <T> t<T> a(t<T> tVar) {
        tVar.a(this);
        synchronized (this.f37025c) {
            this.f37025c.add(tVar);
        }
        tVar.b(a());
        tVar.a("add-to-queue");
        a(tVar, 0);
        b(tVar);
        if (this.f37023a == null) {
            a(this.f37027e);
        }
        if (!this.f37023a.isShutdown()) {
            this.f37023a.execute(new b());
        }
        return tVar;
    }

    public void a(t<?> tVar, int i10) {
        synchronized (this.f37031i) {
            try {
                Iterator<c> it = this.f37031i.iterator();
                while (it.hasNext()) {
                    it.next().a(tVar, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
