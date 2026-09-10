package com.lzh.easythread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: EasyThread.java */
/* JADX INFO: loaded from: classes4.dex */
public final class competently implements Executor {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public String f23526arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public ExecutorService f23527kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public ThreadLocal<marial> f23528molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public com.lzh.easythread.dern f23529monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public Executor f23530polloi;

    /* JADX INFO: compiled from: EasyThread.java */
    public static class dern implements ThreadFactory {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f23531kowloon;

        public dern(int i) {
            this.f23531kowloon = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(this.f23531kowloon);
            return thread;
        }
    }

    /* JADX INFO: compiled from: EasyThread.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f23532attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public ExecutorService f23533beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f23534dern = 5;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public Executor f23535marial;
        String name;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f23536saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public com.lzh.easythread.dern f23537wireman;

        public saneness(int i, int i2, ExecutorService executorService) {
            this.f23536saneness = Math.max(1, i);
            this.f23532attabal = i2;
            this.f23533beachfront = executorService;
        }

        public static saneness saneness(int i) {
            return new saneness(i, 1, null);
        }

        public competently attabal() {
            int iMax = Math.max(1, this.f23534dern);
            this.f23534dern = iMax;
            this.f23534dern = Math.min(10, iMax);
            this.f23536saneness = Math.max(1, this.f23536saneness);
            if (cutely.attabal(this.name)) {
                int i = this.f23532attabal;
                if (i == 0) {
                    this.name = "CACHEABLE";
                } else if (i == 1) {
                    this.name = "FIXED";
                } else if (i != 2) {
                    this.name = "EasyThread";
                } else {
                    this.name = "SINGLE";
                }
            }
            if (this.f23535marial == null) {
                if (cutely.f23538attabal) {
                    this.f23535marial = com.lzh.easythread.attabal.attabal();
                } else {
                    this.f23535marial = impromptu.attabal();
                }
            }
            return new competently(this.f23532attabal, this.f23536saneness, this.f23534dern, this.name, this.f23537wireman, this.f23535marial, this.f23533beachfront);
        }

        public saneness dern(com.lzh.easythread.dern dernVar) {
            this.f23537wireman = dernVar;
            return this;
        }

        public saneness marial(int i) {
            this.f23534dern = i;
            return this;
        }

        public saneness wireman(String str) {
            if (!cutely.attabal(str)) {
                this.name = str;
            }
            return this;
        }
    }

    public final ExecutorService attabal(int i, int i2, int i3) {
        if (i == 0) {
            return Executors.newCachedThreadPool(new dern(i3));
        }
        if (i != 1) {
            return i != 3 ? Executors.newSingleThreadExecutor(new dern(i3)) : Executors.newScheduledThreadPool(i2, new dern(i3));
        }
        return Executors.newFixedThreadPool(i2, new dern(i3));
    }

    public final synchronized void dern() {
        this.f23528molybdenite.set(null);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        marial marialVarSaneness = saneness();
        beachfront.attabal().saneness(marialVarSaneness.f23544saneness, this.f23527kowloon, new taiyuan(marialVarSaneness).attabal(runnable));
        dern();
    }

    public final synchronized marial saneness() {
        marial marialVar;
        marialVar = this.f23528molybdenite.get();
        if (marialVar == null) {
            marialVar = new marial();
            marialVar.name = this.f23526arytenoidectomy;
            marialVar.f23542attabal = this.f23529monoploid;
            marialVar.f23543dern = this.f23530polloi;
            this.f23528molybdenite.set(marialVar);
        }
        return marialVar;
    }

    public competently(int i, int i2, int i3, String str, com.lzh.easythread.dern dernVar, Executor executor, ExecutorService executorService) {
        this.f23527kowloon = executorService == null ? attabal(i, i2, i3) : executorService;
        this.f23526arytenoidectomy = str;
        this.f23529monoploid = dernVar;
        this.f23530polloi = executor;
        this.f23528molybdenite = new ThreadLocal<>();
    }
}
