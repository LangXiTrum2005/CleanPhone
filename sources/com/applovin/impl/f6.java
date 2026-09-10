package com.applovin.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class f6 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ExecutorService f7905r = Executors.newFixedThreadPool(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f7907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f7908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f7909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f7910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f7911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f7912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f7913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f7914i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ExecutorService f7916k;
    private ExecutorService l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f7919o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f7920p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f7921q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f7915j = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f7917m = new ArrayList(5);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f7918n = new Object();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7922a;

        static {
            int[] iArr = new int[b.values().length];
            f7922a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7922a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7922a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7922a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f7929f;

        public c(com.applovin.impl.sdk.l lVar, k5 k5Var, b bVar, long j10) {
            super(lVar, k5Var, bVar);
            this.f7929f = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7930a;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Thread.UncaughtExceptionHandler {
            public a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                com.applovin.impl.sdk.p unused = f6.this.f7907b;
                if (com.applovin.impl.sdk.p.a()) {
                    f6.this.f7907b.a("TaskManager", "Caught unhandled exception", th2);
                }
            }
        }

        public d(String str) {
            this.f7930a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f7930a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) f6.this.f7906a.a(z4.Q)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.l f7933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f7934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.applovin.impl.sdk.p f7935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final k5 f7936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final b f7937e;

        public e(com.applovin.impl.sdk.l lVar, k5 k5Var, b bVar) {
            this.f7933a = lVar;
            this.f7935c = lVar.Q();
            this.f7934b = k5Var.c();
            this.f7936d = k5Var;
            this.f7937e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p0.a();
                if (!this.f7933a.G0() || this.f7936d.d()) {
                    ScheduledFuture scheduledFutureB = this.f7936d.b(Thread.currentThread(), ((Long) this.f7933a.a(z4.f10265v)).longValue());
                    this.f7936d.run();
                    if (scheduledFutureB != null) {
                        scheduledFutureB.cancel(false);
                    }
                } else {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f7935c.d(this.f7934b, "Task re-scheduled...");
                    }
                    this.f7933a.s0().a(this.f7936d, this.f7937e, 2000L);
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7935c.d(this.f7934b, this.f7937e + " queue finished task " + this.f7936d.c());
                }
            } catch (Throwable th2) {
                try {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f7935c.a(this.f7934b, "Task failed execution", th2);
                    }
                    this.f7936d.a(th2);
                } finally {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f7935c.d(this.f7934b, this.f7937e + " queue finished task " + this.f7936d.c());
                    }
                }
            }
        }
    }

    public f6(com.applovin.impl.sdk.l lVar) {
        this.f7906a = lVar;
        this.f7907b = lVar.Q();
        this.f7920p = ((Boolean) lVar.a(z4.T)).booleanValue();
        this.f7921q = ((Boolean) lVar.a(z4.W6)).booleanValue();
        this.f7908c = b("auxiliary_operations", ((Integer) lVar.a(z4.O)).intValue());
        this.f7909d = b("shared_thread_pool", ((Integer) lVar.a(z4.N)).intValue());
        this.f7910e = b("core", ((Integer) lVar.a(z4.U)).intValue());
        this.f7912g = b("caching", ((Integer) lVar.a(z4.V)).intValue());
        this.f7913h = b("mediation", ((Integer) lVar.a(z4.W)).intValue());
        this.f7911f = b("timeout", ((Integer) lVar.a(z4.X)).intValue());
        this.f7914i = b("other", ((Integer) lVar.a(z4.Y)).intValue());
        if (((Boolean) lVar.a(z4.J0)).booleanValue() && ((Boolean) lVar.a(z4.K0)).booleanValue()) {
            this.f7916k = Executors.newFixedThreadPool(((Integer) lVar.a(z4.L0)).intValue(), new d("com.applovin.sdk.caching.shared"));
            this.l = Executors.newFixedThreadPool(((Integer) lVar.a(z4.M0)).intValue(), new d("com.applovin.sdk.caching.html.shared"));
        }
    }

    public ExecutorService d() {
        return this.l;
    }

    public boolean e() {
        return (a() == null || d() == null) ? false : true;
    }

    public boolean f() {
        return this.f7919o;
    }

    public void g() {
        synchronized (this.f7918n) {
            try {
                this.f7919o = true;
                for (e eVar : this.f7917m) {
                    if (this.f7921q) {
                        c cVar = (c) eVar;
                        a(cVar.f7936d, cVar.f7937e, cVar.f7929f);
                    } else {
                        a(eVar.f7936d, eVar.f7937e);
                    }
                }
                this.f7917m.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h() {
        synchronized (this.f7918n) {
            this.f7919o = false;
        }
    }

    public ExecutorService a() {
        return this.f7916k;
    }

    public Executor c() {
        return this.f7920p ? this.f7910e : this.f7909d;
    }

    public void a(k5 k5Var, b bVar) {
        a(k5Var, bVar, 0L);
    }

    public ScheduledFuture b(k5 k5Var, b bVar, long j10) {
        if (this.f7920p) {
            return a(new e(this.f7906a, k5Var, bVar)).schedule(k5Var, j10, TimeUnit.MILLISECONDS);
        }
        return this.f7908c.schedule(k5Var, j10, TimeUnit.MILLISECONDS);
    }

    public void a(k5 k5Var, b bVar, long j10) {
        a(k5Var, bVar, j10, false);
    }

    public void a(k5 k5Var, b bVar, long j10, boolean z10) {
        k5 k5Var2;
        long j11;
        e eVar;
        if (k5Var == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j10 >= 0) {
            if (this.f7921q) {
                k5Var2 = k5Var;
                j11 = j10;
                eVar = new c(this.f7906a, k5Var2, bVar, j11);
            } else {
                k5Var2 = k5Var;
                j11 = j10;
                eVar = new e(this.f7906a, k5Var2, bVar);
            }
            if (!b(eVar)) {
                a(eVar, j11, z10);
                return;
            } else {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7907b.d(k5Var2.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException(defpackage.e.i(j10, "Invalid delay (millis) specified: "));
    }

    public ExecutorService b() {
        return this.f7920p ? this.f7912g : f7905r;
    }

    private boolean b(e eVar) {
        if (eVar.f7936d.d()) {
            return false;
        }
        synchronized (this.f7918n) {
            try {
                if (this.f7919o) {
                    return false;
                }
                this.f7917m.add(eVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private ScheduledThreadPoolExecutor b(String str, int i10) {
        return new ScheduledThreadPoolExecutor(i10, new d(str));
    }

    public void a(Runnable runnable, b bVar) {
        if (this.f7920p) {
            com.applovin.impl.sdk.l lVar = this.f7906a;
            e eVar = new e(lVar, new u6(lVar, "auxiliaryOperation", runnable), bVar);
            a(eVar).submit(eVar);
            return;
        }
        this.f7908c.submit(runnable);
    }

    public Executor a(final String str) {
        return new Executor() { // from class: com.applovin.impl.d9
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f7762a.a(str, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        a(new u6(this.f7906a, str, runnable));
    }

    public void a(k5 k5Var) {
        if (k5Var != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f7920p ? this.f7910e : this.f7909d;
            try {
                if (q7.i()) {
                    scheduledThreadPoolExecutor.submit(new e(this.f7906a, k5Var, b.CORE));
                    return;
                }
                ScheduledFuture scheduledFutureB = k5Var.b(Thread.currentThread(), ((Long) this.f7906a.a(z4.f10265v)).longValue());
                k5Var.run();
                if (scheduledFutureB != null) {
                    scheduledFutureB.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7907b.a(k5Var.c(), "Task failed execution", th2);
                }
                k5Var.a(th2);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    public void a(k5 k5Var, m3 m3Var) {
        String strB = m3Var.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = (ScheduledThreadPoolExecutor) this.f7915j.get(strB);
        if (scheduledThreadPoolExecutorB == null) {
            scheduledThreadPoolExecutorB = b(strB, 1);
            this.f7915j.put(strB, scheduledThreadPoolExecutorB);
        }
        scheduledThreadPoolExecutorB.submit(new e(this.f7906a, k5Var, b.MEDIATION));
    }

    private void a(e eVar, long j10, boolean z10) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = this.f7920p ? a(eVar) : this.f7909d;
        if (j10 <= 0) {
            scheduledThreadPoolExecutorA.submit(eVar);
        } else if (z10) {
            i0.a(j10, this.f7906a, new x8(1, scheduledThreadPoolExecutorA, eVar));
        } else {
            scheduledThreadPoolExecutorA.schedule(eVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(e eVar) {
        int i10 = a.f7922a[eVar.f7937e.ordinal()];
        if (i10 == 1) {
            return this.f7910e;
        }
        if (i10 == 2) {
            return this.f7912g;
        }
        if (i10 == 3) {
            return this.f7913h;
        }
        if (i10 != 4) {
            return this.f7914i;
        }
        return this.f7911f;
    }

    public ExecutorService a(String str, int i10) {
        return Executors.newFixedThreadPool(i10, new d(str));
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7907b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.p.a()) {
                return null;
            }
            this.f7907b.a("TaskManager", "Awaiting tasks were interrupted", th2);
            return null;
        }
    }
}
