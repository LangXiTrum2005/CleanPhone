package sakeen;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ConcurrencyHelpers.java */
/* JADX INFO: loaded from: classes.dex */
public class dern {

    /* JADX INFO: compiled from: ConcurrencyHelpers.java */
    public static class attabal {
        public static Handler attabal(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static /* synthetic */ Thread attabal(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    public static Handler dern() {
        return Build.VERSION.SDK_INT >= 28 ? attabal.attabal(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }

    public static ThreadPoolExecutor saneness(final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: sakeen.attabal
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return dern.attabal(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
