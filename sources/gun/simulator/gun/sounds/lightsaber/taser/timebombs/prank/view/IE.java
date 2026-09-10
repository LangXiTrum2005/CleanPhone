package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
public final class IE extends KV {
    public static final HE Companion = new HE(null);
    private static final String TAG = IE.class.getSimpleName();
    private final BE creator;
    private final JE jobRunner;
    private final EE jobinfo;
    private final InterfaceC3358ec0 threadPriorityHelper;

    public IE(EE ee, BE be, JE je, InterfaceC3358ec0 interfaceC3358ec0) {
        AbstractC2995aW.q(ee, "jobinfo");
        AbstractC2995aW.q(be, "creator");
        AbstractC2995aW.q(je, "jobRunner");
        this.jobinfo = ee;
        this.creator = be;
        this.jobRunner = je;
        this.threadPriorityHelper = interfaceC3358ec0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KV
    public int getPriority() {
        return this.jobinfo.getPriority();
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC3358ec0 interfaceC3358ec0 = this.threadPriorityHelper;
        if (interfaceC3358ec0 != null) {
            try {
                int iMakeAndroidThreadPriority = ((KE) interfaceC3358ec0).makeAndroidThreadPriority(this.jobinfo);
                Process.setThreadPriority(iMakeAndroidThreadPriority);
                C4829vJ c4829vJ = C4917wJ.Companion;
                String str = TAG;
                AbstractC2995aW.p(str, "TAG");
                c4829vJ.d(str, "Setting process thread prio = " + iMakeAndroidThreadPriority + " for " + this.jobinfo.getJobTag());
            } catch (Throwable unused) {
                C4829vJ c4829vJ2 = C4917wJ.Companion;
                String str2 = TAG;
                AbstractC2995aW.p(str2, "TAG");
                c4829vJ2.e(str2, "Error on setting process thread priority");
            }
        }
        try {
            String jobTag = this.jobinfo.getJobTag();
            Bundle extras = this.jobinfo.getExtras();
            C4829vJ c4829vJ3 = C4917wJ.Companion;
            String str3 = TAG;
            AbstractC2995aW.p(str3, "TAG");
            c4829vJ3.d(str3, "Start job " + jobTag + "Thread " + Thread.currentThread().getName());
            int iOnRunJob = ((C3284dj0) this.creator).create(jobTag).onRunJob(extras, this.jobRunner);
            AbstractC2995aW.p(str3, "TAG");
            c4829vJ3.d(str3, "On job finished " + jobTag + " with result " + iOnRunJob);
            if (iOnRunJob == 2) {
                long jMakeNextRescedule = this.jobinfo.makeNextRescedule();
                if (jMakeNextRescedule > 0) {
                    this.jobinfo.setDelay(jMakeNextRescedule);
                    ((C3636hj0) this.jobRunner).execute(this.jobinfo);
                    AbstractC2995aW.p(str3, "TAG");
                    c4829vJ3.d(str3, "Rescheduling " + jobTag + " in " + jMakeNextRescedule);
                }
            }
        } catch (Exception e) {
            C4829vJ c4829vJ4 = C4917wJ.Companion;
            String str4 = TAG;
            AbstractC2995aW.p(str4, "TAG");
            c4829vJ4.e(str4, "Cannot create job" + e.getLocalizedMessage());
        }
    }

    public static /* synthetic */ void getPriority$annotations() {
    }
}
