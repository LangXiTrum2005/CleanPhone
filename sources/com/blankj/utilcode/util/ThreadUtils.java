package com.blankj.utilcode.util;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.C3676od;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class ThreadUtils {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Handler f17432attabal = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Map<Integer, Map<Integer, ExecutorService>> f17435saneness = new HashMap();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Map<Object, ExecutorService> f17433dern = new ConcurrentHashMap();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int f17436wireman = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Timer f17434marial = new Timer();

    public static final class LinkedBlockingQueue4Util extends LinkedBlockingQueue<Runnable> {
        private int mCapacity;
        private volatile attabal mPool;

        public LinkedBlockingQueue4Util() {
            this.mCapacity = Integer.MAX_VALUE;
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        public boolean offer(Runnable runnable) {
            if (this.mCapacity > size() || this.mPool == null || this.mPool.getPoolSize() >= this.mPool.getMaximumPoolSize()) {
                return super.offer(runnable);
            }
            return false;
        }

        public LinkedBlockingQueue4Util(boolean z) {
            this.mCapacity = Integer.MAX_VALUE;
            if (z) {
                this.mCapacity = 0;
            }
        }

        public LinkedBlockingQueue4Util(int i) {
            this.mCapacity = i;
        }
    }

    public static final class UtilsThreadFactory extends AtomicLong implements ThreadFactory {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final AtomicInteger f17437kowloon = new AtomicInteger(1);
        private static final long serialVersionUID = -9209200509960368598L;
        private final boolean isDaemon;
        private final String namePrefix;
        private final int priority;

        public class attabal extends Thread {
            public attabal(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    super.run();
                } catch (Throwable unused) {
                }
            }
        }

        public class saneness implements Thread.UncaughtExceptionHandler {
            public saneness() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                System.out.getClass();
            }
        }

        public UtilsThreadFactory(String str, int i) {
            this(str, i, false);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            attabal attabalVar = new attabal(runnable, this.namePrefix + getAndIncrement());
            attabalVar.setDaemon(this.isDaemon);
            attabalVar.setUncaughtExceptionHandler(new saneness());
            attabalVar.setPriority(this.priority);
            return attabalVar;
        }

        public UtilsThreadFactory(String str, int i, boolean z) {
            this.namePrefix = str + "-pool-" + f17437kowloon.getAndIncrement() + "-thread-";
            this.priority = i;
            this.isDaemon = z;
        }
    }

    public static final class attabal extends ThreadPoolExecutor implements AutoCloseable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public LinkedBlockingQueue4Util f17440arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final AtomicInteger f17441kowloon;

        public attabal(int i, int i2, long j, TimeUnit timeUnit, LinkedBlockingQueue4Util linkedBlockingQueue4Util, ThreadFactory threadFactory) {
            super(i, i2, j, timeUnit, linkedBlockingQueue4Util, threadFactory);
            this.f17441kowloon = new AtomicInteger();
            linkedBlockingQueue4Util.mPool = this;
            this.f17440arytenoidectomy = linkedBlockingQueue4Util;
        }

        public static ExecutorService saneness(int i, int i2) {
            if (i == -8) {
                return new attabal(ThreadUtils.f17436wireman + 1, (ThreadUtils.f17436wireman * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cpu", i2));
            }
            if (i == -4) {
                return new attabal((ThreadUtils.f17436wireman * 2) + 1, (ThreadUtils.f17436wireman * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("io", i2));
            }
            if (i == -2) {
                return new attabal(0, 128, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cached", i2));
            }
            if (i == -1) {
                return new attabal(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory(C3676od.d, i2));
            }
            return new attabal(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("fixed(" + i + ")", i2));
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            this.f17441kowloon.decrementAndGet();
            super.afterExecute(runnable, th);
        }

        @Override // java.lang.AutoCloseable
        public /* synthetic */ void close() {
            demilitarize.impromptu.attabal(this);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (isShutdown()) {
                return;
            }
            this.f17441kowloon.incrementAndGet();
            try {
                super.execute(runnable);
            } catch (RejectedExecutionException unused) {
                this.f17440arytenoidectomy.offer(runnable);
            } catch (Throwable unused2) {
                this.f17441kowloon.decrementAndGet();
            }
        }
    }

    public static void beachfront(Runnable runnable, long j) {
        f17432attabal.postDelayed(runnable, j);
    }

    public static ExecutorService dern(int i) {
        return wireman(i, 5);
    }

    public static void marial(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f17432attabal.post(runnable);
        }
    }

    public static ExecutorService saneness() {
        return dern(-2);
    }

    public static ExecutorService wireman(int i, int i2) {
        ExecutorService executorServiceSaneness;
        Map<Integer, Map<Integer, ExecutorService>> map = f17435saneness;
        synchronized (map) {
            try {
                Map<Integer, ExecutorService> map2 = map.get(Integer.valueOf(i));
                if (map2 == null) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    executorServiceSaneness = attabal.saneness(i, i2);
                    concurrentHashMap.put(Integer.valueOf(i2), executorServiceSaneness);
                    map.put(Integer.valueOf(i), concurrentHashMap);
                } else {
                    executorServiceSaneness = map2.get(Integer.valueOf(i2));
                    if (executorServiceSaneness == null) {
                        executorServiceSaneness = attabal.saneness(i, i2);
                        map2.put(Integer.valueOf(i2), executorServiceSaneness);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorServiceSaneness;
    }
}
