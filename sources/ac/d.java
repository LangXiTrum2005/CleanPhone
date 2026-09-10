package ac;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f3457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3458b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Task f3459c = Tasks.forResult(null);

    public d(ExecutorService executorService) {
        this.f3457a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.f3458b) {
            taskContinueWithTask = this.f3459c.continueWithTask(this.f3457a, new c(runnable));
            this.f3459c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public final Task b(Callable callable) {
        Task taskContinueWithTask;
        synchronized (this.f3458b) {
            taskContinueWithTask = this.f3459c.continueWithTask(this.f3457a, new a4.a(callable, 2));
            this.f3459c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3457a.execute(runnable);
    }
}
