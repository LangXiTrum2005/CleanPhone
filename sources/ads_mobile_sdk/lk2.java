package ads_mobile_sdk;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class lk2 implements Runnable {
    public final TaskCompletionSource a;

    public lk2() {
        this.a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            TaskCompletionSource taskCompletionSource = this.a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e);
            }
        }
    }

    public lk2(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }
}
