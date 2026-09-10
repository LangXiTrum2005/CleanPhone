package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.metadata.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: LottieTask.java */
/* JADX INFO: loaded from: classes.dex */
public class walach<T> {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static Executor f16271marial;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Set<grimness<T>> f16272attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Handler f16273dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Set<grimness<Throwable>> f16274saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public volatile starveling<T> f16275wireman;

    /* JADX INFO: compiled from: LottieTask.java */
    public static class attabal<T> extends FutureTask<starveling<T>> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public walach<T> f16276kowloon;

        public attabal(walach<T> walachVar, Callable<starveling<T>> callable) {
            super(callable);
            this.f16276kowloon = walachVar;
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f16276kowloon.formularize(get());
                } catch (InterruptedException | ExecutionException e) {
                    this.f16276kowloon.formularize(new starveling(e));
                }
            } finally {
                this.f16276kowloon = null;
            }
        }
    }

    static {
        if (a.g.equals(System.getProperty("lottie.testing.directExecutor"))) {
            f16271marial = new androidx.privacysandbox.ads.adservices.measurement.cutely();
        } else {
            f16271marial = Executors.newCachedThreadPool(new utwa.competently());
        }
    }

    public walach(Callable<starveling<T>> callable) {
        this(callable, false);
    }

    public synchronized walach<T> apical(grimness<T> grimnessVar) {
        this.f16272attabal.remove(grimnessVar);
        return this;
    }

    public final synchronized void beachfront(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f16274saneness);
        if (arrayList.isEmpty()) {
            utwa.beachfront.wireman("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((grimness) it.next()).onResult(th);
        }
    }

    public final void competently() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            impromptu();
        } else {
            this.f16273dern.post(new Runnable() { // from class: com.airbnb.lottie.hydrovane
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15970kowloon.impromptu();
                }
            });
        }
    }

    public synchronized walach<T> cutely(grimness<Throwable> grimnessVar) {
        this.f16274saneness.remove(grimnessVar);
        return this;
    }

    public synchronized walach<T> dern(grimness<Throwable> grimnessVar) {
        try {
            starveling<T> starvelingVar = this.f16275wireman;
            if (starvelingVar != null && starvelingVar.attabal() != null) {
                grimnessVar.onResult(starvelingVar.attabal());
            }
            this.f16274saneness.add(grimnessVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final void formularize(starveling<T> starvelingVar) {
        if (this.f16275wireman != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f16275wireman = starvelingVar;
        competently();
    }

    public final void impromptu() {
        starveling<T> starvelingVar = this.f16275wireman;
        if (starvelingVar == null) {
            return;
        }
        if (starvelingVar.saneness() != null) {
            taiyuan(starvelingVar.saneness());
        } else {
            beachfront(starvelingVar.attabal());
        }
    }

    public starveling<T> marial() {
        return this.f16275wireman;
    }

    public final synchronized void taiyuan(T t) {
        Iterator it = new ArrayList(this.f16272attabal).iterator();
        while (it.hasNext()) {
            ((grimness) it.next()).onResult(t);
        }
    }

    public synchronized walach<T> wireman(grimness<T> grimnessVar) {
        try {
            starveling<T> starvelingVar = this.f16275wireman;
            if (starvelingVar != null && starvelingVar.saneness() != null) {
                grimnessVar.onResult(starvelingVar.saneness());
            }
            this.f16272attabal.add(grimnessVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public walach(T t) {
        this.f16272attabal = new LinkedHashSet(1);
        this.f16274saneness = new LinkedHashSet(1);
        this.f16273dern = new Handler(Looper.getMainLooper());
        this.f16275wireman = null;
        formularize(new starveling<>(t));
    }

    public walach(Callable<starveling<T>> callable, boolean z) {
        this.f16272attabal = new LinkedHashSet(1);
        this.f16274saneness = new LinkedHashSet(1);
        this.f16273dern = new Handler(Looper.getMainLooper());
        this.f16275wireman = null;
        if (z) {
            try {
                formularize(callable.call());
                return;
            } catch (Throwable th) {
                formularize(new starveling<>(th));
                return;
            }
        }
        f16271marial.execute(new attabal(this, callable));
    }
}
