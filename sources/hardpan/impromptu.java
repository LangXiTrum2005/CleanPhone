package hardpan;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import technofreak.cutely;

/* JADX INFO: compiled from: RequestExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu {

    /* JADX INFO: compiled from: RequestExecutor.java */
    public static class attabal implements ThreadFactory {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f27514arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public String f27515kowloon;

        /* JADX INFO: renamed from: hardpan.impromptu$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RequestExecutor.java */
        public static class C0630attabal extends Thread {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final int f27516kowloon;

            public C0630attabal(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f27516kowloon = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f27516kowloon);
                super.run();
            }
        }

        public attabal(String str, int i) {
            this.f27515kowloon = str;
            this.f27514arytenoidectomy = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0630attabal(runnable, this.f27515kowloon, this.f27514arytenoidectomy);
        }
    }

    /* JADX INFO: compiled from: RequestExecutor.java */
    public static class dern<T> implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public technofreak.saneness<T> f27517arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public Callable<T> f27518kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public Handler f27519monoploid;

        /* JADX INFO: compiled from: RequestExecutor.java */
        public class attabal implements Runnable {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public final /* synthetic */ Object f27520arytenoidectomy;

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ technofreak.saneness f27521kowloon;

            public attabal(technofreak.saneness sanenessVar, Object obj) {
                this.f27521kowloon = sanenessVar;
                this.f27520arytenoidectomy = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f27521kowloon.accept(this.f27520arytenoidectomy);
            }
        }

        public dern(Handler handler, Callable<T> callable, technofreak.saneness<T> sanenessVar) {
            this.f27518kowloon = callable;
            this.f27517arytenoidectomy = sanenessVar;
            this.f27519monoploid = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f27518kowloon.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f27519monoploid.post(new attabal(this.f27517arytenoidectomy, tCall));
        }
    }

    /* JADX INFO: compiled from: RequestExecutor.java */
    public static class saneness implements Executor {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Handler f27523kowloon;

        public saneness(Handler handler) {
            this.f27523kowloon = (Handler) cutely.competently(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f27523kowloon.post((Runnable) cutely.competently(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f27523kowloon + " is shutting down");
        }
    }

    public static ThreadPoolExecutor attabal(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new attabal(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static <T> void dern(Executor executor, Callable<T> callable, technofreak.saneness<T> sanenessVar) {
        executor.execute(new dern(hardpan.saneness.attabal(), callable, sanenessVar));
    }

    public static Executor saneness(Handler handler) {
        return new saneness(handler);
    }

    public static <T> T wireman(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
