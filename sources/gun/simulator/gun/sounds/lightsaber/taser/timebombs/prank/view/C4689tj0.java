package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4689tj0 extends ThreadPoolExecutor {
    public static final C4426qj0 Companion = new C4426qj0(null);
    private static final String TAG = "VungleThreadPool";
    private final AQ threadFactory;

    public C4689tj0(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, AQ aq) {
        super(i, i2, j, timeUnit, blockingQueue, aq);
        this.threadFactory = aq;
        allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: execute$lambda-0, reason: not valid java name */
    public static final void m279execute$lambda0(C4689tj0 c4689tj0) {
        AbstractC2995aW.q(c4689tj0, "this$0");
        new C3258dT("execute error in " + c4689tj0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String executorName() {
        String name;
        AQ aq = this.threadFactory;
        return (aq == null || (name = aq.getName()) == null) ? "VungleThreadPoolExecutor" : name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: submit$lambda-1, reason: not valid java name */
    public static final void m280submit$lambda1(C4689tj0 c4689tj0) {
        AbstractC2995aW.q(c4689tj0, "this$0");
        new C3258dT("submit error in " + c4689tj0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: submit$lambda-2, reason: not valid java name */
    public static final void m281submit$lambda2(C4689tj0 c4689tj0) {
        AbstractC2995aW.q(c4689tj0, "this$0");
        new C3258dT("submit error with result in " + c4689tj0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        AbstractC2995aW.q(runnable, "command");
        try {
            super.execute(Companion.getWrappedRunnableWithFail(runnable, new U3(this, 2)));
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "execute exception", e);
        } catch (OutOfMemoryError e2) {
            String str = "execute error in " + executorName() + ": " + e2.getLocalizedMessage();
            C4917wJ.Companion.e(TAG, str, e2);
            new C3258dT(str).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final AQ getThreadFactory() {
        return this.threadFactory;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        AbstractC2995aW.q(runnable, "task");
        try {
            Future<?> futureSubmit = super.submit(Companion.getWrappedRunnableWithFail(runnable, new U3(this, 3)));
            AbstractC2995aW.p(futureSubmit, "{\n            super.subm…\n            })\n        }");
            return futureSubmit;
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "submit exception", e);
            return new FutureC4796ux(null);
        } catch (OutOfMemoryError e2) {
            String str = "submit error in " + executorName() + ": " + e2.getLocalizedMessage();
            C4917wJ.Companion.e(TAG, str, e2);
            new C3258dT(str).logErrorNoReturnValue$vungle_ads_release();
            return new FutureC4796ux(null);
        }
    }

    public final Future<?> submit$vungle_ads_release(Runnable runnable, Runnable runnable2) {
        AbstractC2995aW.q(runnable, "task");
        AbstractC2995aW.q(runnable2, "fail");
        try {
            Future<?> futureSubmit = super.submit(Companion.getWrappedRunnableWithFail(runnable, runnable2));
            AbstractC2995aW.p(futureSubmit, "{\n            super.subm…il(task, fail))\n        }");
            return futureSubmit;
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "submit exception with fail", e);
            runnable2.run();
            return new FutureC4796ux(null);
        } catch (OutOfMemoryError e2) {
            String str = "submit error with fail in " + executorName() + ": " + e2.getLocalizedMessage();
            C4917wJ.Companion.e(TAG, str, e2);
            new C3258dT(str).logErrorNoReturnValue$vungle_ads_release();
            runnable2.run();
            return new FutureC4796ux(null);
        }
    }

    public final void execute(Runnable runnable, Runnable runnable2) {
        AbstractC2995aW.q(runnable, "command");
        AbstractC2995aW.q(runnable2, "fail");
        try {
            super.execute(Companion.getWrappedRunnableWithFail(runnable, runnable2));
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "execute exception with fail", e);
            runnable2.run();
        } catch (OutOfMemoryError e2) {
            String str = "execute error with fail in " + executorName() + ": " + e2.getLocalizedMessage();
            C4917wJ.Companion.e(TAG, str, e2);
            new C3258dT(str).logErrorNoReturnValue$vungle_ads_release();
            runnable2.run();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        AbstractC2995aW.q(runnable, "task");
        try {
            Future<T> futureSubmit = super.submit(Companion.getWrappedRunnableWithFail(runnable, new U3(this, 1)), t);
            AbstractC2995aW.p(futureSubmit, "{\n            super.subm…     }, result)\n        }");
            return futureSubmit;
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "submit exception with result", e);
            return new FutureC4796ux(null);
        } catch (OutOfMemoryError e2) {
            String str = "submit error with result in " + executorName() + ": " + e2.getLocalizedMessage();
            C4917wJ.Companion.e(TAG, str, e2);
            new C3258dT(str).logErrorNoReturnValue$vungle_ads_release();
            return new FutureC4796ux(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        AbstractC2995aW.q(callable, "task");
        try {
            Future<T> futureSubmit = super.submit(Companion.getWrappedCallableWithFallback(callable, new C4601sj0(this)));
            AbstractC2995aW.p(futureSubmit, "override fun <T> submit(…Future<T>\n        }\n    }");
            return futureSubmit;
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "submit exception callable: " + e);
            return new FutureC4796ux(null);
        } catch (OutOfMemoryError e2) {
            String str = "submit error callable in " + executorName() + ": " + e2.getLocalizedMessage();
            C4917wJ.Companion.e(TAG, str, e2);
            new C3258dT(str).logErrorNoReturnValue$vungle_ads_release();
            return new FutureC4796ux(null);
        }
    }
}
