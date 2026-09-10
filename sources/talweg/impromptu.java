package talweg;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: SerialExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu implements Executor {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Executor f38632arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final ArrayDeque<attabal> f38633kowloon = new ArrayDeque<>();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final Object f38634monoploid = new Object();

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public volatile Runnable f38635polloi;

    /* JADX INFO: compiled from: SerialExecutor.java */
    public static class attabal implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final Runnable f38636arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final impromptu f38637kowloon;

        public attabal(impromptu impromptuVar, Runnable runnable) {
            this.f38637kowloon = impromptuVar;
            this.f38636arytenoidectomy = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f38636arytenoidectomy.run();
            } finally {
                this.f38637kowloon.saneness();
            }
        }
    }

    public impromptu(Executor executor) {
        this.f38632arytenoidectomy = executor;
    }

    public boolean attabal() {
        boolean z;
        synchronized (this.f38634monoploid) {
            z = !this.f38633kowloon.isEmpty();
        }
        return z;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f38634monoploid) {
            try {
                this.f38633kowloon.add(new attabal(this, runnable));
                if (this.f38635polloi == null) {
                    saneness();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void saneness() {
        synchronized (this.f38634monoploid) {
            try {
                attabal attabalVarPoll = this.f38633kowloon.poll();
                this.f38635polloi = attabalVarPoll;
                if (attabalVarPoll != null) {
                    this.f38632arytenoidectomy.execute(this.f38635polloi);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
