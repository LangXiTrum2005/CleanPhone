package com.ironsource.environment.thread;

import android.os.Handler;
import android.os.Looper;
import com.applovin.impl.sdk.b0;
import com.ironsource.C0361gg;
import com.ironsource.C0448le;
import com.ironsource.C0474n4;
import com.ironsource.Ef;
import com.ironsource.Ff;
import com.ironsource.Hf;
import com.ironsource.Kb;
import com.ironsource.S9;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class IronSourceThreadManager {
    public static final IronSourceThreadManager INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f28575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final wj.d f28576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final wj.d f28577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicReference<Ff> f28578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final wj.d f28579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final wj.d f28580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final wj.d f28581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final wj.d f28582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final wj.d f28583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final wj.d f28584j;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28585a = new a();

        public a() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S9 invoke() {
            S9 s10 = new S9("adapterBackground");
            s10.start();
            s10.a();
            return s10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b extends o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f28586a = new b();

        public b() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0448le invoke() {
            return new C0448le(0, null, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c extends o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f28587a = new c();

        public c() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            S9 s10 = new S9("IronSourceInitiatorHandler");
            s10.start();
            s10.a();
            return new Handler(s10.getLooper());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class e extends o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f28588a = new e();

        public e() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.environment.thread.a invoke() {
            return com.ironsource.environment.thread.a.f28593c.a("LevelPlayThread");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class f extends o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f28589a = new f();

        public f() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S9 invoke() {
            S9 s10 = new S9("mediationBackground");
            s10.start();
            s10.a();
            return s10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class g extends o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f28590a = new g();

        public g() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S9 invoke() {
            S9 s10 = new S9("publisher-callbacks");
            s10.start();
            s10.a();
            return s10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class h extends o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f28591a = new h();

        public h() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S9 invoke() {
            S9 s10 = new S9("managersThread");
            s10.start();
            s10.a();
            return s10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class i extends o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f28592a = new i();

        public i() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static {
        IronSourceThreadManager ironSourceThreadManager = new IronSourceThreadManager();
        INSTANCE = ironSourceThreadManager;
        f28576b = r9.b.u(i.f28592a);
        f28577c = r9.b.u(e.f28588a);
        f28578d = new AtomicReference<>(ironSourceThreadManager.f());
        f28579e = r9.b.u(c.f28587a);
        f28580f = r9.b.u(h.f28591a);
        f28581g = r9.b.u(f.f28589a);
        f28582h = r9.b.u(a.f28585a);
        f28583i = r9.b.u(g.f28590a);
        f28584j = r9.b.u(b.f28586a);
    }

    private IronSourceThreadManager() {
    }

    private final S9 a() {
        return (S9) f28582h.getValue();
    }

    private final S9 d() {
        return (S9) f28583i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler e() {
        return (Handler) f28576b.getValue();
    }

    private final Ef f() {
        return new Ef(new d(), new b0(27));
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j10);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j10);
    }

    public static /* synthetic */ Ff.a postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return ironSourceThreadManager.postOnUiThreadTask(runnable, j10);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j10);
    }

    public final void changeToUISchedulerIfNeeded() {
        if (Kb.f26413u.d().h().z()) {
            f28578d.set(new Ef(null, C0361gg.a(e()), 1, 0 == true ? 1 : 0));
        }
    }

    public final void executeTasks(boolean z10, boolean z11, List<? extends Runnable> tasks) {
        n.f(tasks, "tasks");
        if (!z10) {
            Iterator<? extends Runnable> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        if (!z11) {
            Iterator<? extends Runnable> it2 = tasks.iterator();
            while (it2.hasNext()) {
                postMediationBackgroundTask$default(INSTANCE, it2.next(), 0L, 2, null);
            }
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(tasks.size());
        Iterator<? extends Runnable> it3 = tasks.iterator();
        while (it3.hasNext()) {
            postMediationBackgroundTask$default(INSTANCE, new b2.o(17, it3.next(), countDownLatch), 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            C0474n4.d().a(e10);
        }
    }

    public final Handler getInitHandler() {
        return (Handler) f28579e.getValue();
    }

    public final com.ironsource.environment.thread.a getLevelPlayThread() {
        return (com.ironsource.environment.thread.a) f28577c.getValue();
    }

    public final S9 getSharedManagersThread() {
        return (S9) f28580f.getValue();
    }

    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return f28575a;
    }

    public final void postAdapterBackgroundTask(Runnable action) {
        n.f(action, "action");
        postAdapterBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(Runnable action) {
        n.f(action, "action");
        postMediationBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final Ff.a postOnUiThreadTask(Runnable action) {
        n.f(action, "action");
        return postOnUiThreadTask$default(this, action, 0L, 2, null);
    }

    public final void postPublisherCallback(Runnable action) {
        n.f(action, "action");
        postPublisherCallback$default(this, action, 0L, 2, null);
    }

    public final void removeAdapterBackgroundTask(Runnable action) {
        n.f(action, "action");
        if (a(action)) {
            b().remove(action);
        } else {
            a().b(action);
        }
    }

    public final void removeMediationBackgroundTask(Runnable action) {
        n.f(action, "action");
        if (a(action)) {
            b().remove(action);
        } else {
            c().b(action);
        }
    }

    public final void setUseSharedExecutorService(boolean z10) {
        f28575a = z10;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class d implements Hf {
        @Override // com.ironsource.Hf
        public Hf.a a(long j10, Runnable runnable) {
            n.f(runnable, "runnable");
            IronSourceThreadManager.INSTANCE.e().postDelayed(runnable, j10);
            return new ac.c(runnable);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Runnable runnable) {
            n.f(runnable, "$runnable");
            IronSourceThreadManager.INSTANCE.e().removeCallbacks(runnable);
        }
    }

    private final boolean a(Runnable runnable) {
        return f28575a && b().getQueue().contains(runnable);
    }

    private final C0448le b() {
        return (C0448le) f28584j.getValue();
    }

    private final S9 c() {
        return (S9) f28581g.getValue();
    }

    public final void postAdapterBackgroundTask(Runnable action, long j10) {
        n.f(action, "action");
        if (f28575a) {
            b().schedule(action, j10, TimeUnit.MILLISECONDS);
        } else {
            a().a(action, j10);
        }
    }

    public final void postMediationBackgroundTask(Runnable action, long j10) {
        n.f(action, "action");
        if (f28575a) {
            b().schedule(action, j10, TimeUnit.MILLISECONDS);
        } else {
            c().a(action, j10);
        }
    }

    public final Ff.a postOnUiThreadTask(Runnable action, long j10) {
        n.f(action, "action");
        Ff ff = f28578d.get();
        int i10 = bn.a.f5743d;
        return ff.a(action, d0.c.P(j10, bn.c.MILLISECONDS));
    }

    public final void postPublisherCallback(Runnable action, long j10) {
        n.f(action, "action");
        d().a(action, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable it, CountDownLatch latch) {
        n.f(it, "$it");
        n.f(latch, "$latch");
        it.run();
        a(latch);
    }

    private static final void a(CountDownLatch latch) {
        n.f(latch, "$latch");
        latch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(jk.a it) {
        n.f(it, "it");
        it.invoke();
    }
}
