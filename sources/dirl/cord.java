package dirl;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cord implements Runnable {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final TaskCompletionSource f25264kowloon;

    public cord() {
        this.f25264kowloon = null;
    }

    public void attabal(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f25264kowloon;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public final TaskCompletionSource dern() {
        return this.f25264kowloon;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            saneness();
        } catch (Exception e) {
            attabal(e);
        }
    }

    public abstract void saneness();

    public cord(TaskCompletionSource taskCompletionSource) {
        this.f25264kowloon = taskCompletionSource;
    }
}
