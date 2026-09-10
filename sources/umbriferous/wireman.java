package umbriferous;

import android.os.Process;

/* JADX INFO: compiled from: BackgroundPriorityRunnable.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wireman implements Runnable {
    public abstract void attabal();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        attabal();
    }
}
