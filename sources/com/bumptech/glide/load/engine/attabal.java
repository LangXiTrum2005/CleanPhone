package com.bumptech.glide.load.engine;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: ActiveResources.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f17674attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public volatile boolean f17675beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<maggot.saneness, dern> f17676dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public impromptu.attabal f17677marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Executor f17678saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ReferenceQueue<impromptu<?>> f17679wireman;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActiveResources.java */
    public class ThreadFactoryC0175attabal implements ThreadFactory {

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.attabal$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ActiveResources.java */
        public class RunnableC0176attabal implements Runnable {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ Runnable f17681kowloon;

            public RunnableC0176attabal(Runnable runnable) {
                this.f17681kowloon = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f17681kowloon.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0176attabal(runnable), "glide-active-resources");
        }
    }

    /* JADX INFO: compiled from: ActiveResources.java */
    public static final class dern extends WeakReference<impromptu<?>> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final maggot.saneness f17682attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public endosteum.cutely<?> f17683dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f17684saneness;

        public dern(maggot.saneness sanenessVar, impromptu<?> impromptuVar, ReferenceQueue<? super impromptu<?>> referenceQueue, boolean z) {
            super(impromptuVar, referenceQueue);
            this.f17682attabal = (maggot.saneness) com.bumptech.glide.util.apical.wireman(sanenessVar);
            this.f17683dern = (impromptuVar.marial() && z) ? (endosteum.cutely) com.bumptech.glide.util.apical.wireman(impromptuVar.wireman()) : null;
            this.f17684saneness = impromptuVar.marial();
        }

        public void attabal() {
            this.f17683dern = null;
            clear();
        }
    }

    /* JADX INFO: compiled from: ActiveResources.java */
    public class saneness implements Runnable {
        public saneness() {
        }

        @Override // java.lang.Runnable
        public void run() {
            attabal.this.saneness();
        }
    }

    public attabal(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactoryC0175attabal()));
    }

    public synchronized void attabal(maggot.saneness sanenessVar, impromptu<?> impromptuVar) {
        dern dernVarPut = this.f17676dern.put(sanenessVar, new dern(sanenessVar, impromptuVar, this.f17679wireman, this.f17674attabal));
        if (dernVarPut != null) {
            dernVarPut.attabal();
        }
    }

    public void beachfront(impromptu.attabal attabalVar) {
        synchronized (attabalVar) {
            synchronized (this) {
                this.f17677marial = attabalVar;
            }
        }
    }

    public void dern(dern dernVar) {
        endosteum.cutely<?> cutelyVar;
        synchronized (this) {
            this.f17676dern.remove(dernVar.f17682attabal);
            if (dernVar.f17684saneness && (cutelyVar = dernVar.f17683dern) != null) {
                this.f17677marial.attabal(dernVar.f17682attabal, new impromptu<>(cutelyVar, true, false, dernVar.f17682attabal, this.f17677marial));
            }
        }
    }

    public synchronized impromptu<?> marial(maggot.saneness sanenessVar) {
        dern dernVar = this.f17676dern.get(sanenessVar);
        if (dernVar == null) {
            return null;
        }
        impromptu<?> impromptuVar = dernVar.get();
        if (impromptuVar == null) {
            dern(dernVar);
        }
        return impromptuVar;
    }

    public void saneness() {
        while (!this.f17675beachfront) {
            try {
                dern((dern) this.f17679wireman.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public synchronized void wireman(maggot.saneness sanenessVar) {
        dern dernVarRemove = this.f17676dern.remove(sanenessVar);
        if (dernVarRemove != null) {
            dernVarRemove.attabal();
        }
    }

    public attabal(boolean z, Executor executor) {
        this.f17676dern = new HashMap();
        this.f17679wireman = new ReferenceQueue<>();
        this.f17674attabal = z;
        this.f17678saneness = executor;
        executor.execute(new saneness());
    }
}
