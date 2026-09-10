package androidx.arch.core.executor;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class DefaultTaskExecutor extends TaskExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3677a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f3678b = Executors.newFixedThreadPool(4, new ThreadFactory() { // from class: androidx.arch.core.executor.DefaultTaskExecutor.1
        public final AtomicInteger X = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.X.getAndIncrement());
            return thread;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Handler f3679c;

    public static class Api28Impl {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
