package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
abstract class ModernAsyncTask<Params, Progress, Result> {
    public static final ThreadPoolExecutor g0;
    public static InternalHandler h0;
    public static volatile ThreadPoolExecutor i0;
    public final AnonymousClass2 X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final FutureTask f5308Y;
    public volatile Status Z = Status.X;
    public final AtomicBoolean e0 = new AtomicBoolean();
    public final AtomicBoolean f0 = new AtomicBoolean();

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5309a;

        static {
            int[] iArr = new int[Status.values().length];
            f5309a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5309a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class AsyncTaskResult<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ModernAsyncTask f5310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object[] f5311b;

        public AsyncTaskResult(ModernAsyncTask modernAsyncTask, Object... objArr) {
            this.f5310a = modernAsyncTask;
            this.f5311b = objArr;
        }
    }

    public static class InternalHandler extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            AsyncTaskResult asyncTaskResult = (AsyncTaskResult) message.obj;
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                asyncTaskResult.f5310a.getClass();
            } else {
                ModernAsyncTask modernAsyncTask = asyncTaskResult.f5310a;
                Object obj = asyncTaskResult.f5311b[0];
                if (modernAsyncTask.e0.get()) {
                    modernAsyncTask.c(obj);
                } else {
                    modernAsyncTask.d(obj);
                }
                modernAsyncTask.Z = Status.Z;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        public static final Status X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Status f5312Y;
        public static final Status Z;
        public static final /* synthetic */ Status[] e0;

        static {
            Status status = new Status("PENDING", 0);
            X = status;
            Status status2 = new Status("RUNNING", 1);
            f5312Y = status2;
            Status status3 = new Status("FINISHED", 2);
            Z = status3;
            e0 = new Status[]{status, status2, status3};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) e0.clone();
        }
    }

    public static abstract class WorkerRunnable<Params, Result> implements Callable<Result> {
    }

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: androidx.loader.content.ModernAsyncTask.1
            public final AtomicInteger X = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "ModernAsyncTask #" + this.X.getAndIncrement());
            }
        };
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), threadFactory);
        g0 = threadPoolExecutor;
        i0 = threadPoolExecutor;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.loader.content.ModernAsyncTask$2, java.util.concurrent.Callable] */
    public ModernAsyncTask() {
        ?? r0 = new WorkerRunnable<Object, Object>() { // from class: androidx.loader.content.ModernAsyncTask.2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
                modernAsyncTask.f0.set(true);
                Object objB = null;
                try {
                    Process.setThreadPriority(10);
                    objB = modernAsyncTask.b();
                    Binder.flushPendingCommands();
                    modernAsyncTask.e(objB);
                    return objB;
                } catch (Throwable th) {
                    try {
                        modernAsyncTask.e0.set(true);
                        throw th;
                    } catch (Throwable th2) {
                        modernAsyncTask.e(objB);
                        throw th2;
                    }
                }
            }
        };
        this.X = r0;
        this.f5308Y = new FutureTask<Object>(r0) { // from class: androidx.loader.content.ModernAsyncTask.3
            @Override // java.util.concurrent.FutureTask
            public final void done() {
                ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
                try {
                    Object obj = get();
                    if (modernAsyncTask.f0.get()) {
                        return;
                    }
                    modernAsyncTask.e(obj);
                } catch (InterruptedException e2) {
                    Log.w("AsyncTask", e2);
                } catch (CancellationException unused) {
                    if (modernAsyncTask.f0.get()) {
                        return;
                    }
                    modernAsyncTask.e(null);
                } catch (ExecutionException e3) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
                } catch (Throwable th) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th);
                }
            }
        };
    }

    public abstract Object b();

    public void c(Object obj) {
    }

    public void d(Object obj) {
    }

    public final void e(Object obj) {
        InternalHandler internalHandler;
        synchronized (ModernAsyncTask.class) {
            try {
                if (h0 == null) {
                    h0 = new InternalHandler(Looper.getMainLooper());
                }
                internalHandler = h0;
            } catch (Throwable th) {
                throw th;
            }
        }
        internalHandler.obtainMessage(1, new AsyncTaskResult(this, obj)).sendToTarget();
    }
}
