package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Configuration.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final boolean f14020apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Executor f14021attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final String f14022beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f14023competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final int f14024cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final graveside f14025dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final int f14026impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final arytenoidectomy f14027marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Executor f14028saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final int f14029taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final taiyuan f14030wireman;

    /* JADX INFO: renamed from: androidx.work.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Configuration.java */
    public class ThreadFactoryC0109attabal implements ThreadFactory {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ boolean f14031arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final AtomicInteger f14032kowloon = new AtomicInteger(0);

        public ThreadFactoryC0109attabal(boolean z) {
            this.f14031arytenoidectomy = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f14031arytenoidectomy ? "WM.task-" : "androidx.work-") + this.f14032kowloon.incrementAndGet());
        }
    }

    /* JADX INFO: compiled from: Configuration.java */
    public interface dern {
        attabal attabal();
    }

    /* JADX INFO: compiled from: Configuration.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Executor f14034attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public String f14035beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public taiyuan f14038dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public arytenoidectomy f14040marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public graveside f14041saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public Executor f14043wireman;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f14036competently = 4;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public int f14039impromptu = 0;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public int f14042taiyuan = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public int f14037cutely = 20;

        public attabal attabal() {
            return new attabal(this);
        }
    }

    public attabal(saneness sanenessVar) {
        Executor executor = sanenessVar.f14034attabal;
        if (executor == null) {
            this.f14021attabal = attabal(false);
        } else {
            this.f14021attabal = executor;
        }
        Executor executor2 = sanenessVar.f14043wireman;
        if (executor2 == null) {
            this.f14020apical = true;
            this.f14028saneness = attabal(true);
        } else {
            this.f14020apical = false;
            this.f14028saneness = executor2;
        }
        graveside gravesideVar = sanenessVar.f14041saneness;
        if (gravesideVar == null) {
            this.f14025dern = graveside.dern();
        } else {
            this.f14025dern = gravesideVar;
        }
        taiyuan taiyuanVar = sanenessVar.f14038dern;
        if (taiyuanVar == null) {
            this.f14030wireman = taiyuan.dern();
        } else {
            this.f14030wireman = taiyuanVar;
        }
        arytenoidectomy arytenoidectomyVar = sanenessVar.f14040marial;
        if (arytenoidectomyVar == null) {
            this.f14027marial = new overassessment.attabal();
        } else {
            this.f14027marial = arytenoidectomyVar;
        }
        this.f14023competently = sanenessVar.f14036competently;
        this.f14026impromptu = sanenessVar.f14039impromptu;
        this.f14029taiyuan = sanenessVar.f14042taiyuan;
        this.f14024cutely = sanenessVar.f14037cutely;
        this.f14022beachfront = sanenessVar.f14035beachfront;
    }

    public arytenoidectomy apical() {
        return this.f14027marial;
    }

    public final Executor attabal(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), saneness(z));
    }

    public taiyuan beachfront() {
        return this.f14030wireman;
    }

    public int competently() {
        return this.f14029taiyuan;
    }

    public int cutely() {
        return this.f14023competently;
    }

    public String dern() {
        return this.f14022beachfront;
    }

    public Executor formularize() {
        return this.f14028saneness;
    }

    public graveside impassible() {
        return this.f14025dern;
    }

    public int impromptu() {
        return this.f14024cutely;
    }

    public Executor marial() {
        return this.f14021attabal;
    }

    public final ThreadFactory saneness(boolean z) {
        return new ThreadFactoryC0109attabal(z);
    }

    public int taiyuan() {
        return this.f14026impromptu;
    }

    public competently wireman() {
        return null;
    }
}
