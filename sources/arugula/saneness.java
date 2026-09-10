package arugula;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import talweg.impromptu;

/* JADX INFO: compiled from: WorkManagerTaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness implements arugula.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final impromptu f14347attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Handler f14349saneness = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Executor f14348dern = new attabal();

    /* JADX INFO: compiled from: WorkManagerTaskExecutor.java */
    public class attabal implements Executor {
        public attabal() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            saneness.this.dern(runnable);
        }
    }

    public saneness(Executor executor) {
        this.f14347attabal = new impromptu(executor);
    }

    @Override // arugula.attabal
    public Executor attabal() {
        return this.f14348dern;
    }

    public void dern(Runnable runnable) {
        this.f14349saneness.post(runnable);
    }

    @Override // arugula.attabal
    public impromptu getBackgroundExecutor() {
        return this.f14347attabal;
    }

    @Override // arugula.attabal
    public void saneness(Runnable runnable) {
        this.f14347attabal.execute(runnable);
    }
}
