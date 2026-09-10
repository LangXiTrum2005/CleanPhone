package la;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f45250a;

    public f() {
        this.f45250a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            TaskCompletionSource taskCompletionSource = this.f45250a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e10);
            }
        }
    }

    public f(TaskCompletionSource taskCompletionSource) {
        this.f45250a = taskCompletionSource;
    }
}
