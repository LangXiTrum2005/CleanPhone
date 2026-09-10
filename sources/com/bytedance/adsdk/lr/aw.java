package com.bytedance.adsdk.lr;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public class aw<T> {
    public static Executor ri = Executors.newCachedThreadPool();
    private volatile co<T> fi;
    private final Set<sf<Throwable>> ik;
    private final Handler ka;
    private final Set<sf<T>> lr;

    public class ri extends FutureTask<co<T>> {
        public ri(Callable<co<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                aw.this.ri((co) get());
            } catch (InterruptedException | ExecutionException e) {
                aw.this.ri(new co(e));
            }
        }
    }

    public aw(Callable<co<T>> callable) {
        this(callable, false);
    }

    public synchronized aw<T> ik(sf<Throwable> sfVar) {
        try {
            co<T> coVar = this.fi;
            if (coVar != null && coVar.lr() != null) {
                sfVar.ri(coVar.lr());
            }
            this.ik.add(sfVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized aw<T> ka(sf<Throwable> sfVar) {
        this.ik.remove(sfVar);
        return this;
    }

    public synchronized aw<T> lr(sf<T> sfVar) {
        this.lr.remove(sfVar);
        return this;
    }

    public aw(Callable<co<T>> callable, boolean z) {
        this.lr = new LinkedHashSet(1);
        this.ik = new LinkedHashSet(1);
        this.ka = new Handler(Looper.getMainLooper());
        this.fi = null;
        if (!z) {
            ri.execute(new ri(callable));
            return;
        }
        try {
            ri((co) callable.call());
        } catch (Throwable th) {
            ri((co) new co<>(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(co<T> coVar) {
        if (this.fi == null) {
            this.fi = coVar;
            ri();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized aw<T> ri(sf<T> sfVar) {
        try {
            co<T> coVar = this.fi;
            if (coVar != null && coVar.ri() != null) {
                sfVar.ri(coVar.ri());
            }
            this.lr.add(sfVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    private void ri() {
        this.ka.post(new Runnable() { // from class: com.bytedance.adsdk.lr.aw.1
            @Override // java.lang.Runnable
            public void run() {
                co coVar = aw.this.fi;
                if (coVar == null) {
                    return;
                }
                if (coVar.ri() != null) {
                    aw.this.ri(coVar.ri());
                } else {
                    aw.this.ri(coVar.lr());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ri(T t) {
        Iterator it = new ArrayList(this.lr).iterator();
        while (it.hasNext()) {
            ((sf) it.next()).ri(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ri(Throwable th) {
        ArrayList arrayList = new ArrayList(this.ik);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((sf) it.next()).ri(th);
        }
    }
}
