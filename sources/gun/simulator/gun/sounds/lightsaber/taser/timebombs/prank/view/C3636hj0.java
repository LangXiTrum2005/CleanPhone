package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3636hj0 implements JE {
    private final BE creator;
    private final Executor executor;
    private long nextCheck;
    private final List<C3460fj0> pendingJobs;
    private final Runnable pendingRunnable;
    private final InterfaceC3358ec0 threadPriorityHelper;
    public static final C3372ej0 Companion = new C3372ej0(null);
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final String TAG = C3636hj0.class.getSimpleName();

    public C3636hj0(BE be, Executor executor, InterfaceC3358ec0 interfaceC3358ec0) {
        AbstractC2995aW.q(be, "creator");
        AbstractC2995aW.q(executor, "executor");
        this.creator = be;
        this.executor = executor;
        this.threadPriorityHelper = interfaceC3358ec0;
        this.nextCheck = Long.MAX_VALUE;
        this.pendingJobs = new CopyOnWriteArrayList();
        this.pendingRunnable = new RunnableC3548gj0(new WeakReference(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executePendingJobs() {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jMin = Long.MAX_VALUE;
            for (C3460fj0 c3460fj0 : this.pendingJobs) {
                if (jUptimeMillis >= c3460fj0.getUptimeMillis()) {
                    this.pendingJobs.remove(c3460fj0);
                    EE info = c3460fj0.getInfo();
                    if (info != null) {
                        this.executor.execute(new IE(info, this.creator, this, this.threadPriorityHelper));
                    }
                } else {
                    jMin = Math.min(jMin, c3460fj0.getUptimeMillis());
                }
            }
            if (jMin != Long.MAX_VALUE && jMin != this.nextCheck) {
                Handler handler2 = handler;
                handler2.removeCallbacks(this.pendingRunnable);
                handler2.postAtTime(this.pendingRunnable, TAG, jMin);
            }
            this.nextCheck = jMin;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JE
    public synchronized void cancelPendingJob(String str) {
        try {
            AbstractC2995aW.q(str, "tag");
            ArrayList arrayList = new ArrayList();
            for (C3460fj0 c3460fj0 : this.pendingJobs) {
                EE info = c3460fj0.getInfo();
                if (AbstractC2995aW.i(info != null ? info.getJobTag() : null, str)) {
                    arrayList.add(c3460fj0);
                }
            }
            this.pendingJobs.removeAll(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JE
    public synchronized void execute(EE ee) {
        try {
            AbstractC2995aW.q(ee, "jobInfo");
            EE eeCopy = ee.copy();
            if (eeCopy != null) {
                String jobTag = eeCopy.getJobTag();
                long delay = eeCopy.getDelay();
                eeCopy.setDelay(0L);
                if (eeCopy.getUpdateCurrent()) {
                    for (C3460fj0 c3460fj0 : this.pendingJobs) {
                        EE info = c3460fj0.getInfo();
                        if (AbstractC2995aW.i(info != null ? info.getJobTag() : null, jobTag)) {
                            C4829vJ c4829vJ = C4917wJ.Companion;
                            String str = TAG;
                            AbstractC2995aW.p(str, "TAG");
                            c4829vJ.d(str, "replacing pending job with new " + jobTag);
                            this.pendingJobs.remove(c3460fj0);
                        }
                    }
                }
                this.pendingJobs.add(new C3460fj0(SystemClock.uptimeMillis() + delay, eeCopy));
                executePendingJobs();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    public final int getPendingJobSize$vungle_ads_release() {
        return this.pendingJobs.size();
    }
}
