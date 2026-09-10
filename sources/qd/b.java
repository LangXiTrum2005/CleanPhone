package qd;

import android.util.Log;
import com.applovin.impl.da;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f48939d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final da f48940e = new da(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f48941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f48942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Task f48943c = null;

    public b(Executor executor, n nVar) {
        this.f48941a = executor;
        this.f48942b = nVar;
    }

    public static Object a(Task task) throws ExecutionException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        na.g gVar = new na.g(6);
        Executor executor = f48940e;
        task.addOnSuccessListener(executor, gVar);
        task.addOnFailureListener(executor, gVar);
        task.addOnCanceledListener(executor, gVar);
        if (!((CountDownLatch) gVar.f46631b).await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public final synchronized Task b() {
        try {
            Task task = this.f48943c;
            if (task == null || (task.isComplete() && !this.f48943c.isSuccessful())) {
                this.f48943c = Tasks.call(this.f48941a, new hc.c(this.f48942b, 2));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f48943c;
    }

    public final c c() {
        synchronized (this) {
            try {
                Task task = this.f48943c;
                if (task != null && task.isSuccessful()) {
                    return (c) this.f48943c.getResult();
                }
                try {
                    Task taskB = b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (c) a(taskB);
                } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e10);
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
