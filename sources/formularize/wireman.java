package formularize;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: DefaultTaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman extends marial {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public volatile Handler f26529dern;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Object f26528attabal = new Object();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ExecutorService f26530saneness = Executors.newFixedThreadPool(4, new attabal());

    /* JADX INFO: compiled from: DefaultTaskExecutor.java */
    public class attabal implements ThreadFactory {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final AtomicInteger f26532kowloon = new AtomicInteger(0);

        public attabal() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f26532kowloon.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: compiled from: DefaultTaskExecutor.java */
    public static class saneness {
        public static Handler attabal(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static Handler wireman(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return saneness.attabal(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // formularize.marial
    public void attabal(Runnable runnable) {
        this.f26530saneness.execute(runnable);
    }

    @Override // formularize.marial
    public void dern(Runnable runnable) {
        if (this.f26529dern == null) {
            synchronized (this.f26528attabal) {
                try {
                    if (this.f26529dern == null) {
                        this.f26529dern = wireman(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f26529dern.post(runnable);
    }

    @Override // formularize.marial
    public boolean saneness() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
