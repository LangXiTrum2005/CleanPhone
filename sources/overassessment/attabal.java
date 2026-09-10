package overassessment;

import android.os.Handler;
import android.os.Looper;
import androidx.work.arytenoidectomy;

/* JADX INFO: compiled from: DefaultRunnableScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal implements arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Handler f34850attabal = claque.impromptu.attabal(Looper.getMainLooper());

    @Override // androidx.work.arytenoidectomy
    public void attabal(Runnable runnable) {
        this.f34850attabal.removeCallbacks(runnable);
    }

    @Override // androidx.work.arytenoidectomy
    public void saneness(long j, Runnable runnable) {
        this.f34850attabal.postDelayed(runnable, j);
    }
}
