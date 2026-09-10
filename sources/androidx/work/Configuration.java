package androidx.work;

import android.support.v4.media.a;
import androidx.work.impl.DefaultRunnableScheduler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class Configuration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f8599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f8600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkerFactory f8601c;
    public final InputMergerFactory d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DefaultRunnableScheduler f8602e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8603h;

    public static final class Builder {
    }

    public interface Provider {
        Configuration a();
    }

    public Configuration(Builder builder) {
        final boolean z2 = true;
        final boolean z3 = false;
        this.f8599a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: androidx.work.Configuration.1
            public final AtomicInteger X = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                StringBuilder sbW = a.w(z3 ? "WM.task-" : "androidx.work-");
                sbW.append(this.X.incrementAndGet());
                return new Thread(runnable, sbW.toString());
            }
        });
        this.f8600b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: androidx.work.Configuration.1
            public final AtomicInteger X = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                StringBuilder sbW = a.w(z2 ? "WM.task-" : "androidx.work-");
                sbW.append(this.X.incrementAndGet());
                return new Thread(runnable, sbW.toString());
            }
        });
        String str = WorkerFactory.f8650a;
        this.f8601c = new WorkerFactory.AnonymousClass1();
        this.d = new InputMergerFactory.AnonymousClass1();
        this.f8602e = new DefaultRunnableScheduler();
        this.f = 4;
        this.g = Integer.MAX_VALUE;
        this.f8603h = 20;
    }
}
