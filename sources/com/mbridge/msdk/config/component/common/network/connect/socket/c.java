package com.mbridge.msdk.config.component.common.network.connect.socket;

import androidx.fragment.app.n;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.foundation.tools.m0;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile c f31990d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f31991a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ThreadPoolExecutor f31992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f31993c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f31994a = new AtomicInteger(1);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Socket-Thread-" + this.f31994a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    private c() {
        int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        this.f31992b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f31993c = new AtomicBoolean(false);
    }

    private boolean b() {
        int iX;
        try {
            int iH = m0.h();
            return iH > 0 && (iX = m0.x()) > 0 && (((double) iH) / ((double) iX)) * 100.0d <= 5.0d;
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("Memory check failed: "), "SocketThreadPoolManager");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        while (!this.f31991a.isEmpty()) {
            try {
                Runnable runnablePoll = this.f31991a.poll();
                if (runnablePoll != null) {
                    if ((runnablePoll instanceof b) && ((b) runnablePoll).e() != null) {
                        ((b) runnablePoll).e().callStart();
                    }
                    runnablePoll.run();
                }
            } catch (Throwable th2) {
                this.f31993c.set(false);
                if (!this.f31991a.isEmpty()) {
                    d();
                }
                throw th2;
            }
        }
        this.f31993c.set(false);
        if (this.f31991a.isEmpty()) {
            return;
        }
        d();
    }

    private void d() {
        if (this.f31993c.compareAndSet(false, true)) {
            this.f31992b.execute(new n(this, 29));
        }
    }

    public static c a() {
        if (f31990d == null) {
            synchronized (c.class) {
                try {
                    if (f31990d == null) {
                        f31990d = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f31990d;
    }

    public void a(Runnable runnable, com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        if (runnable == null) {
            return;
        }
        if (b()) {
            if (aVar != null) {
                aVar.a("Memory low");
            }
        } else if (this.f31991a.offer(runnable)) {
            if (aVar != null) {
                aVar.m();
                a(aVar);
            }
            d();
        }
    }

    private void a(com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        ThreadPoolExecutor threadPoolExecutor;
        if (aVar == null || (threadPoolExecutor = this.f31992b) == null) {
            return;
        }
        aVar.a(threadPoolExecutor.getPoolSize(), this.f31992b.getActiveCount(), this.f31992b.getQueue().size());
    }
}
