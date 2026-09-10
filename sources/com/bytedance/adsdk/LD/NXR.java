package com.bytedance.adsdk.LD;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public class NXR<T> {
    public static Executor Lxb = Executors.newCachedThreadPool();
    private volatile sLN<T> JXs;
    private final Set<JVA<T>> LD;
    private final Handler ZU;
    private final Set<JVA<Throwable>> lk;

    public class Lxb extends FutureTask<sLN<T>> {
        public Lxb(Callable<sLN<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                NXR.this.Lxb((sLN) get());
            } catch (InterruptedException | ExecutionException e) {
                NXR.this.Lxb(new sLN(e));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public NXR(Callable<sLN<T>> callable) {
        this(callable, false);
    }

    public synchronized NXR<T> LD(JVA<T> jva) {
        this.LD.remove(jva);
        return this;
    }

    public synchronized NXR<T> ZU(JVA<Throwable> jva) {
        this.lk.remove(jva);
        return this;
    }

    public synchronized NXR<T> lk(JVA<Throwable> jva) {
        try {
            sLN<T> sln = this.JXs;
            if (sln != null && sln.LD() != null) {
                jva.Lxb(sln.LD());
            }
            this.lk.add(jva);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public NXR(Callable<sLN<T>> callable, boolean z) {
        this.LD = new LinkedHashSet(1);
        this.lk = new LinkedHashSet(1);
        this.ZU = new Handler(Looper.getMainLooper());
        this.JXs = null;
        if (!z) {
            Lxb.execute(new Lxb(callable));
            return;
        }
        try {
            Lxb((sLN) callable.call());
        } catch (Throwable th) {
            Lxb((sLN) new sLN<>(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(sLN<T> sln) {
        if (this.JXs == null) {
            this.JXs = sln;
            Lxb();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized NXR<T> Lxb(JVA<T> jva) {
        try {
            sLN<T> sln = this.JXs;
            if (sln != null && sln.Lxb() != null) {
                jva.Lxb(sln.Lxb());
            }
            this.LD.add(jva);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    private void Lxb() {
        this.ZU.post(new Runnable() { // from class: com.bytedance.adsdk.LD.NXR.1
            @Override // java.lang.Runnable
            public void run() {
                sLN sln = NXR.this.JXs;
                if (sln == null) {
                    return;
                }
                if (sln.Lxb() != null) {
                    NXR.this.Lxb(sln.Lxb());
                } else {
                    NXR.this.Lxb(sln.LD());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void Lxb(T t) {
        Iterator it = new ArrayList(this.LD).iterator();
        while (it.hasNext()) {
            ((JVA) it.next()).Lxb(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void Lxb(Throwable th) {
        ArrayList arrayList = new ArrayList(this.lk);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((JVA) it.next()).Lxb(th);
        }
    }
}
