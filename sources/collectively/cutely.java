package collectively;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cutely implements Runnable {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final TaskCompletionSource f15810kowloon;

    public cutely() {
        this.f15810kowloon = null;
    }

    public abstract void attabal();

    public final void dern(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f15810kowloon;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            attabal();
        } catch (Exception e) {
            dern(e);
        }
    }

    public final TaskCompletionSource saneness() {
        return this.f15810kowloon;
    }

    public cutely(TaskCompletionSource taskCompletionSource) {
        this.f15810kowloon = taskCompletionSource;
    }
}
