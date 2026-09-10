package umbriferous;

import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.ironsource.Ua;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class peridotite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ExecutorService f39180attabal = oilcan.dern("awaitEvenIfOnMainThread task continuation executor");

    public static /* synthetic */ Object attabal(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    public static boolean dern(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        boolean zAwait;
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    @Deprecated
    public static <T> T saneness(Task<T> task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f39180attabal, new Continuation() { // from class: umbriferous.walach
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return peridotite.attabal(countDownLatch, task2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(Ua.C, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }
}
