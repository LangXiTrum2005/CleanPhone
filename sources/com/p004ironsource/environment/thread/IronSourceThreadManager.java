package com.p004ironsource.environment.thread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.p004ironsource.gk;
import com.p004ironsource.ls;
import com.p004ironsource.q9;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.y4.g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b6\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J$\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nJ\u001a\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007R\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010$\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010,\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u0005\u00100R\u001b\u00105\u001a\u00020%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/ironsource/environment/thread/IronSourceThreadManager;", "", "Ljava/lang/Runnable;", "action", "", "a", "Ljava/util/concurrent/ThreadPoolExecutor;", "getThreadPoolExecutor", "shouldExecuteAsync", "shouldWaitUntilAllOperationsCompleted", "", "tasks", "", "executeTasks", "", "delay", "postOnUiThreadTask", "removeUiThreadTask", "postMediationBackgroundTask", "removeMediationBackgroundTask", "postAdapterBackgroundTask", "removeAdapterBackgroundTask", "postPublisherCallback", "Z", "getUseSharedExecutorService", "()Z", "setUseSharedExecutorService", "(Z)V", "useSharedExecutorService", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "uiHandler", "c", "getInitHandler", "()Landroid/os/Handler;", "initHandler", "Lcom/ironsource/gk;", "d", "Lcom/ironsource/gk;", "mediationBackgroundHandler", "e", "adapterBackgroundHandler", f.j, "publisherCallbackHandler", "Lcom/ironsource/ls;", g.f40227p, "Lkotlin/Lazy;", "()Lcom/ironsource/ls;", "executorService", h.f36614b, "getSharedManagersThread", "()Lcom/ironsource/gk;", "sharedManagersThread", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class IronSourceThreadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static boolean useSharedExecutorService;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Handler initHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final gk mediationBackgroundHandler;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final gk adapterBackgroundHandler;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final gk publisherCallbackHandler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final Lazy executorService;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final Lazy sharedManagersThread;
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Handler uiHandler = new Handler(Looper.getMainLooper());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/ls;", "a", "()Lcom/ironsource/ls;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<ls> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24932a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ls invoke() {
            return new ls(0, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/gk;", "a", "()Lcom/ironsource/gk;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends Lambda implements Function0<gk> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f24933a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gk invoke() {
            gk gkVar = new gk("managersThread");
            gkVar.start();
            gkVar.a();
            return gkVar;
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        handlerThread.start();
        initHandler = new Handler(handlerThread.getLooper());
        gk gkVar = new gk("mediationBackground");
        gkVar.start();
        gkVar.a();
        mediationBackgroundHandler = gkVar;
        gk gkVar2 = new gk("adapterBackground");
        gkVar2.start();
        gkVar2.a();
        adapterBackgroundHandler = gkVar2;
        gk gkVar3 = new gk("publisher-callbacks");
        gkVar3.start();
        gkVar3.a();
        publisherCallbackHandler = gkVar3;
        executorService = LazyKt.b(a.f24932a);
        sharedManagersThread = LazyKt.b(b.f24933a);
    }

    private IronSourceThreadManager() {
    }

    private final ls a() {
        return (ls) executorService.getX();
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postOnUiThreadTask(runnable, j);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j);
    }

    public final void executeTasks(boolean shouldExecuteAsync, boolean shouldWaitUntilAllOperationsCompleted, List<? extends Runnable> tasks) {
        Intrinsics.f(tasks, "tasks");
        if (!shouldExecuteAsync) {
            Iterator<? extends Runnable> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        if (!shouldWaitUntilAllOperationsCompleted) {
            Iterator<? extends Runnable> it2 = tasks.iterator();
            while (it2.hasNext()) {
                postMediationBackgroundTask$default(INSTANCE, it2.next(), 0L, 2, null);
            }
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(tasks.size());
        Iterator<? extends Runnable> it3 = tasks.iterator();
        while (it3.hasNext()) {
            postMediationBackgroundTask$default(INSTANCE, new com.google.android.exoplayer2.video.a(3, it3.next(), countDownLatch), 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            q9.d().a(e2);
        }
    }

    public final Handler getInitHandler() {
        return initHandler;
    }

    public final gk getSharedManagersThread() {
        return (gk) sharedManagersThread.getX();
    }

    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return useSharedExecutorService;
    }

    public final void postAdapterBackgroundTask(Runnable action) {
        Intrinsics.f(action, "action");
        postAdapterBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(Runnable action) {
        Intrinsics.f(action, "action");
        postMediationBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postOnUiThreadTask(Runnable action) {
        Intrinsics.f(action, "action");
        postOnUiThreadTask$default(this, action, 0L, 2, null);
    }

    public final void postPublisherCallback(Runnable action) {
        Intrinsics.f(action, "action");
        postPublisherCallback$default(this, action, 0L, 2, null);
    }

    public final void removeAdapterBackgroundTask(Runnable action) {
        Intrinsics.f(action, "action");
        if (a(action)) {
            a().remove(action);
        } else {
            adapterBackgroundHandler.b(action);
        }
    }

    public final void removeMediationBackgroundTask(Runnable action) {
        Intrinsics.f(action, "action");
        if (a(action)) {
            a().remove(action);
        } else {
            mediationBackgroundHandler.b(action);
        }
    }

    public final void removeUiThreadTask(Runnable action) {
        Intrinsics.f(action, "action");
        uiHandler.removeCallbacks(action);
    }

    public final void setUseSharedExecutorService(boolean z2) {
        useSharedExecutorService = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable it, CountDownLatch latch) {
        Intrinsics.f(it, "$it");
        Intrinsics.f(latch, "$latch");
        it.run();
        a(latch);
    }

    public final void postAdapterBackgroundTask(Runnable action, long delay) {
        Intrinsics.f(action, "action");
        if (useSharedExecutorService) {
            a().schedule(action, delay, TimeUnit.MILLISECONDS);
        } else {
            adapterBackgroundHandler.a(action, delay);
        }
    }

    public final void postMediationBackgroundTask(Runnable action, long delay) {
        Intrinsics.f(action, "action");
        if (useSharedExecutorService) {
            a().schedule(action, delay, TimeUnit.MILLISECONDS);
        } else {
            mediationBackgroundHandler.a(action, delay);
        }
    }

    public final void postOnUiThreadTask(Runnable action, long delay) {
        Intrinsics.f(action, "action");
        uiHandler.postDelayed(action, delay);
    }

    public final void postPublisherCallback(Runnable action, long delay) {
        Intrinsics.f(action, "action");
        publisherCallbackHandler.a(action, delay);
    }

    private static final void a(CountDownLatch latch) {
        Intrinsics.f(latch, "$latch");
        latch.countDown();
    }

    private final boolean a(Runnable action) {
        return useSharedExecutorService && a().getQueue().contains(action);
    }
}
