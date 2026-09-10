package talweg;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: WorkTimer.java */
/* JADX INFO: loaded from: classes.dex */
public class kowloon {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final String f38638beachfront = androidx.work.apical.beachfront("WorkTimer");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ThreadFactory f38639attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<String, dern> f38640dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Object f38641marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ScheduledExecutorService f38642saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Map<String, saneness> f38643wireman;

    /* JADX INFO: compiled from: WorkTimer.java */
    public class attabal implements ThreadFactory {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f38645kowloon = 0;

        public attabal() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f38645kowloon);
            this.f38645kowloon = this.f38645kowloon + 1;
            return threadNewThread;
        }
    }

    /* JADX INFO: compiled from: WorkTimer.java */
    public static class dern implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final String f38646arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final kowloon f38647kowloon;

        public dern(kowloon kowloonVar, String str) {
            this.f38647kowloon = kowloonVar;
            this.f38646arytenoidectomy = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f38647kowloon.f38641marial) {
                try {
                    if (this.f38647kowloon.f38640dern.remove(this.f38646arytenoidectomy) != null) {
                        saneness sanenessVarRemove = this.f38647kowloon.f38643wireman.remove(this.f38646arytenoidectomy);
                        if (sanenessVarRemove != null) {
                            sanenessVarRemove.attabal(this.f38646arytenoidectomy);
                        }
                    } else {
                        androidx.work.apical.dern().attabal("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f38646arytenoidectomy), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: WorkTimer.java */
    public interface saneness {
        void attabal(String str);
    }

    public kowloon() {
        attabal attabalVar = new attabal();
        this.f38639attabal = attabalVar;
        this.f38640dern = new HashMap();
        this.f38643wireman = new HashMap();
        this.f38641marial = new Object();
        this.f38642saneness = Executors.newSingleThreadScheduledExecutor(attabalVar);
    }

    public void attabal() {
        if (this.f38642saneness.isShutdown()) {
            return;
        }
        this.f38642saneness.shutdownNow();
    }

    public void dern(String str) {
        synchronized (this.f38641marial) {
            try {
                if (this.f38640dern.remove(str) != null) {
                    androidx.work.apical.dern().attabal(f38638beachfront, String.format("Stopping timer for %s", str), new Throwable[0]);
                    this.f38643wireman.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void saneness(String str, long j, saneness sanenessVar) {
        synchronized (this.f38641marial) {
            androidx.work.apical.dern().attabal(f38638beachfront, String.format("Starting timer for %s", str), new Throwable[0]);
            dern(str);
            dern dernVar = new dern(this, str);
            this.f38640dern.put(str, dernVar);
            this.f38643wireman.put(str, sanenessVar);
            this.f38642saneness.schedule(dernVar, j, TimeUnit.MILLISECONDS);
        }
    }
}
