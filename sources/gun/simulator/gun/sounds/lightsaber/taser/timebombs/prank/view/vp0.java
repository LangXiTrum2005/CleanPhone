package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vp0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f5157a;

    public vp0() {
        this.f5157a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            TaskCompletionSource taskCompletionSource = this.f5157a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e);
            }
        }
    }

    public vp0(TaskCompletionSource taskCompletionSource) {
        this.f5157a = taskCompletionSource;
    }
}
