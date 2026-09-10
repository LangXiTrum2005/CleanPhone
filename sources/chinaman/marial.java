package chinaman;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: CrashlyticsWorker.java */
/* JADX INFO: loaded from: classes3.dex */
public class marial implements Executor {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final ExecutorService f15393kowloon;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Object f15392arytenoidectomy = new Object();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public Task<?> f15394monoploid = Tasks.forResult(null);

    public marial(ExecutorService executorService) {
        this.f15393kowloon = executorService;
    }

    public static /* synthetic */ Task attabal(Runnable runnable, Task task) {
        runnable.run();
        return Tasks.forResult(null);
    }

    public static /* synthetic */ Task saneness(Callable callable, Task task) {
        return (Task) callable.call();
    }

    public <T> Task<T> beachfront(final Callable<Task<T>> callable) {
        zzw zzwVar;
        synchronized (this.f15392arytenoidectomy) {
            zzwVar = (Task<T>) this.f15394monoploid.continueWithTask(this.f15393kowloon, new Continuation() { // from class: chinaman.dern
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return marial.saneness(callable, task);
                }
            });
            this.f15394monoploid = zzwVar;
        }
        return zzwVar;
    }

    public ExecutorService dern() {
        return this.f15393kowloon;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f15393kowloon.execute(runnable);
    }

    public Task<Void> wireman(final Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.f15392arytenoidectomy) {
            taskContinueWithTask = this.f15394monoploid.continueWithTask(this.f15393kowloon, new Continuation() { // from class: chinaman.wireman
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return marial.attabal(runnable, task);
                }
            });
            this.f15394monoploid = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }
}
