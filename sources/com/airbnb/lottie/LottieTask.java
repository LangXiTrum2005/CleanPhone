package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public class LottieTask<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ExecutorService f9549e = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f9550a = new LinkedHashSet(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f9551b = new LinkedHashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f9552c = new Handler(Looper.getMainLooper());
    public volatile LottieResult d = null;

    public class LottieFutureTask extends FutureTask<LottieResult<T>> {
        public LottieFutureTask(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            LottieTask lottieTask = LottieTask.this;
            if (isCancelled()) {
                return;
            }
            try {
                LottieResult<T> lottieResult = get();
                ExecutorService executorService = LottieTask.f9549e;
                lottieTask.c(lottieResult);
            } catch (InterruptedException | ExecutionException e2) {
                LottieResult lottieResult2 = new LottieResult(e2);
                ExecutorService executorService2 = LottieTask.f9549e;
                lottieTask.c(lottieResult2);
            }
        }
    }

    public LottieTask(Callable callable, boolean z2) {
        if (!z2) {
            f9549e.execute(new LottieFutureTask(callable));
            return;
        }
        try {
            c((LottieResult) callable.call());
        } catch (Throwable th) {
            c(new LottieResult(th));
        }
    }

    public final synchronized void a(LottieListener lottieListener) {
        Throwable th;
        try {
            LottieResult lottieResult = this.d;
            if (lottieResult != null && (th = lottieResult.f9548b) != null) {
                lottieListener.onResult(th);
            }
            this.f9551b.add(lottieListener);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(LottieListener lottieListener) {
        Object obj;
        try {
            LottieResult lottieResult = this.d;
            if (lottieResult != null && (obj = lottieResult.f9547a) != null) {
                lottieListener.onResult(obj);
            }
            this.f9550a.add(lottieListener);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(LottieResult lottieResult) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = lottieResult;
        this.f9552c.post(new Runnable() { // from class: com.airbnb.lottie.o
            @Override // java.lang.Runnable
            public final void run() {
                LottieTask lottieTask = this.X;
                LottieResult lottieResult2 = lottieTask.d;
                if (lottieResult2 == null) {
                    return;
                }
                Object obj = lottieResult2.f9547a;
                if (obj != null) {
                    synchronized (lottieTask) {
                        Iterator it = new ArrayList(lottieTask.f9550a).iterator();
                        while (it.hasNext()) {
                            ((LottieListener) it.next()).onResult(obj);
                        }
                    }
                    return;
                }
                Throwable th = lottieResult2.f9548b;
                synchronized (lottieTask) {
                    ArrayList arrayList = new ArrayList(lottieTask.f9551b);
                    if (arrayList.isEmpty()) {
                        Logger.c("Lottie encountered an error but no failure listener was added:", th);
                        return;
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((LottieListener) it2.next()).onResult(th);
                    }
                }
            }
        });
    }
}
