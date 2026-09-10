package com.mbridge.msdk.config.component.common.network.retry;

import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ScheduledFuture<?> f32007d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f32009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.nori.model.a f32010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.network.a f32011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f32012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.b f32013j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.socket.a f32004a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.okhttp.a f32005b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f32006c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ScheduledExecutorService f32008e = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f32014k = new AtomicInteger(0);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f32015a = new AtomicInteger(1);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Retry-InstanceScheduler-" + System.currentTimeMillis() + "-" + this.f32015a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements com.mbridge.msdk.config.component.common.network.retry.a {
        public b() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void a() {
            c.this.a();
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void b() {
            c.this.g();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.retry.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0104c implements com.mbridge.msdk.config.component.common.network.retry.b {
        public C0104c() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.b
        public void a() {
            c.this.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements com.mbridge.msdk.config.component.common.network.retry.a {
        public d() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void a() {
            c.this.a();
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void b() {
            c.this.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements com.mbridge.msdk.config.component.common.network.retry.b {
        public e() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.b
        public void a() {
            c.this.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final f f32021b = new f();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f32022a = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(100), new a(), new ThreadPoolExecutor.DiscardOldestPolicy());

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements ThreadFactory {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final AtomicInteger f32023a = new AtomicInteger(1);

            public a() {
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "Retry-NetworkThread-" + this.f32023a.getAndIncrement());
                thread.setDaemon(true);
                return thread;
            }
        }

        private f() {
        }

        public static f a() {
            return f32021b;
        }

        public ThreadPoolExecutor b() {
            return this.f32022a;
        }
    }

    public c(String str, com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.a aVar2, com.mbridge.msdk.config.component.common.network.result.a aVar3) {
        this.f32009f = str;
        this.f32010g = aVar;
        this.f32011h = aVar2;
        this.f32012i = aVar3;
        this.f32013j = aVar3.a();
        b();
    }

    private void d() {
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar;
        try {
            try {
                this.f32005b = new com.mbridge.msdk.config.component.common.network.connect.okhttp.a(this.f32010g, this.f32012i, this.f32011h);
                h();
                this.f32005b.a(this.f32009f);
                aVar = this.f32005b;
                if (aVar == null) {
                    return;
                }
            } catch (Exception e10) {
                this.f32012i.c(0);
                this.f32012i.b(0);
                this.f32012i.a(e10.getMessage());
                g();
                aVar = this.f32005b;
                if (aVar == null) {
                    return;
                }
            }
            aVar.a();
        } catch (Throwable th2) {
            com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar2 = this.f32005b;
            if (aVar2 != null) {
                aVar2.a();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f32006c) {
            q0.c("RequestRetry", "重试任务已被取消，停止执行");
        } else if (this.f32010g.i().equals(com.mbridge.msdk.config.component.common.util.c.c("340"))) {
            f();
        } else if (this.f32010g.i().equals(com.mbridge.msdk.config.component.common.util.c.c("341"))) {
            d();
        }
    }

    private void f() {
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar;
        try {
            try {
                this.f32004a = new com.mbridge.msdk.config.component.common.network.connect.socket.a(this.f32010g, this.f32012i, this.f32011h);
                i();
                this.f32004a.a(this.f32009f);
                aVar = this.f32004a;
                if (aVar == null) {
                    return;
                }
            } catch (Exception e10) {
                this.f32012i.c(0);
                this.f32012i.b(0);
                this.f32012i.a(e10.getMessage());
                g();
                aVar = this.f32004a;
                if (aVar == null) {
                    return;
                }
            }
            aVar.a();
        } catch (Throwable th2) {
            com.mbridge.msdk.config.component.common.network.connect.socket.a aVar2 = this.f32004a;
            if (aVar2 != null) {
                aVar2.a();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f32006c) {
            q0.c("RequestRetry", "重试任务已被取消，停止调度重试");
            return;
        }
        this.f32014k.incrementAndGet();
        if (this.f32014k.get() >= this.f32010g.g()) {
            q0.c("RequestRetry", "重试次数已达上限: " + this.f32014k.get());
            com.mbridge.msdk.config.component.common.network.a aVar = this.f32011h;
            if (aVar != null) {
                aVar.d(this.f32012i);
            }
            a();
            return;
        }
        q0.b("RequestRetry", "重试 次数 " + this.f32014k.get());
        try {
            ScheduledExecutorService scheduledExecutorService = this.f32008e;
            if (scheduledExecutorService != null) {
                this.f32007d = scheduledExecutorService.schedule(new com.mbridge.msdk.config.component.common.network.retry.d(this, 0), this.f32010g.h(), TimeUnit.SECONDS);
                q0.c("RequestRetry", "已调度第 " + this.f32014k.get() + " 次重试");
            }
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("调度重试任务失败: "), "RequestRetry");
            com.mbridge.msdk.config.component.common.network.a aVar2 = this.f32011h;
            if (aVar2 != null) {
                aVar2.d(this.f32012i);
            }
            a();
        }
    }

    private void h() {
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar = this.f32005b;
        if (aVar != null) {
            aVar.a(new d());
        }
        com.mbridge.msdk.config.component.nori.monitor.b bVar = this.f32013j;
        if (bVar != null) {
            bVar.a(new e());
        }
    }

    private void i() {
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = this.f32004a;
        if (aVar != null) {
            aVar.a(new b());
        }
        com.mbridge.msdk.config.component.nori.monitor.b bVar = this.f32013j;
        if (bVar != null) {
            bVar.a(new C0104c());
        }
    }

    private void j() {
        ScheduledExecutorService scheduledExecutorService = this.f32008e;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            return;
        }
        try {
            q0.c("RequestRetry", "正在关闭独立调度器");
            this.f32008e.shutdown();
            if (this.f32008e.awaitTermination(5L, TimeUnit.SECONDS)) {
                q0.c("RequestRetry", "独立调度器已成功关闭");
            } else {
                q0.d("RequestRetry", "独立调度器未能在5秒内关闭，强制关闭");
                this.f32008e.shutdownNow();
            }
        } catch (InterruptedException e10) {
            q0.b("RequestRetry", "关闭独立调度器时被中断: " + e10.getMessage());
            this.f32008e.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f32006c) {
            return;
        }
        q0.c("RequestRetry", "取消所有重试任务");
        this.f32006c = true;
        ScheduledFuture<?> scheduledFuture = this.f32007d;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f32007d.cancel(true);
            q0.c("RequestRetry", "已取消当前重试调度任务");
        }
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = this.f32004a;
        if (aVar != null) {
            aVar.a();
            q0.c("RequestRetry", "已取消TCP连接");
        }
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar2 = this.f32005b;
        if (aVar2 != null) {
            aVar2.a();
            q0.c("RequestRetry", "已取消HTTP连接");
        }
        j();
    }

    private void b() {
        try {
            this.f32008e = Executors.newSingleThreadScheduledExecutor(new a());
            q0.c("RequestRetry", "创建独立调度器成功");
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("创建独立调度器失败: "), "RequestRetry");
        }
    }

    public void c() {
        if (this.f32006c) {
            q0.c("RequestRetry", "重试任务已被取消，跳过执行");
        } else {
            f.a().b().execute(new com.mbridge.msdk.config.component.common.network.retry.d(this, 1));
        }
    }
}
