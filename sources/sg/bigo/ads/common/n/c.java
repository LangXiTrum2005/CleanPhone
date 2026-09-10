package sg.bigo.ads.common.n;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f47325e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f47327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadFactory f47328c;
    private final boolean d;

    public c(String str) {
        this(str, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f47328c.newThread(runnable);
        threadNewThread.setName(this.f47326a + TokenBuilder.TOKEN_DELIMITER + this.f47327b.getAndIncrement());
        if (this.d) {
            threadNewThread.setPriority(10);
        }
        threadNewThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: sg.bigo.ads.common.n.c.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                if (c.f47325e != null) {
                    c.f47325e.a(th);
                }
            }
        });
        return threadNewThread;
    }

    public c(String str, boolean z2) {
        this.f47326a = "BGAd-".concat(String.valueOf(str));
        this.f47327b = new AtomicInteger(1);
        this.f47328c = Executors.defaultThreadFactory();
        this.d = z2;
    }

    public static void a(a aVar) {
        f47325e = aVar;
    }
}
