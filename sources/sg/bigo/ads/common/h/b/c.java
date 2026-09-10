package sg.bigo.ads.common.h.b;

import com.smartdigimkt.u2.m;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
class c extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f47283a;

    private c(TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(5, 8, m.D0, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }

    public static synchronized c a(boolean z2) {
        try {
            if (f47283a == null) {
                synchronized (c.class) {
                    try {
                        if (f47283a == null) {
                            b(z2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f47283a;
    }

    private static synchronized void b(boolean z2) {
        f47283a = new c(TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new sg.bigo.ads.common.n.c("Download", z2), new ThreadPoolExecutor.AbortPolicy());
    }
}
