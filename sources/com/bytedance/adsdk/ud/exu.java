package com.bytedance.adsdk.ud;

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

/* JADX INFO: loaded from: classes.dex */
public class exu<T> {
    public static Executor qdl = Executors.newCachedThreadPool();
    private final Set<rq<Throwable>> lnr;
    private final Handler mml;
    private volatile fs<T> mzz;
    private final Set<rq<T>> ud;

    public class qdl extends FutureTask<fs<T>> {
        public qdl(Callable<fs<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                exu.this.qdl((fs) get());
            } catch (InterruptedException | ExecutionException e2) {
                exu.this.qdl(new fs(e2));
            }
        }
    }

    public exu(Callable<fs<T>> callable) {
        this(callable, false);
    }

    public synchronized exu<T> lnr(rq<Throwable> rqVar) {
        try {
            fs<T> fsVar = this.mzz;
            if (fsVar != null && fsVar.ud() != null) {
                rqVar.qdl(fsVar.ud());
            }
            this.lnr.add(rqVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized exu<T> mml(rq<Throwable> rqVar) {
        this.lnr.remove(rqVar);
        return this;
    }

    public synchronized exu<T> ud(rq<T> rqVar) {
        this.ud.remove(rqVar);
        return this;
    }

    public exu(Callable<fs<T>> callable, boolean z2) {
        this.ud = new LinkedHashSet(1);
        this.lnr = new LinkedHashSet(1);
        this.mml = new Handler(Looper.getMainLooper());
        this.mzz = null;
        if (!z2) {
            qdl.execute(new qdl(callable));
            return;
        }
        try {
            qdl((fs) callable.call());
        } catch (Throwable th) {
            qdl((fs) new fs<>(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(fs<T> fsVar) {
        if (this.mzz == null) {
            this.mzz = fsVar;
            qdl();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized exu<T> qdl(rq<T> rqVar) {
        try {
            fs<T> fsVar = this.mzz;
            if (fsVar != null && fsVar.qdl() != null) {
                rqVar.qdl(fsVar.qdl());
            }
            this.ud.add(rqVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    private void qdl() {
        this.mml.post(new Runnable() { // from class: com.bytedance.adsdk.ud.exu.1
            @Override // java.lang.Runnable
            public void run() {
                fs fsVar = exu.this.mzz;
                if (fsVar == null) {
                    return;
                }
                if (fsVar.qdl() != null) {
                    exu.this.qdl(fsVar.qdl());
                } else {
                    exu.this.qdl(fsVar.ud());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void qdl(T t) {
        Iterator it = new ArrayList(this.ud).iterator();
        while (it.hasNext()) {
            ((rq) it.next()).qdl(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void qdl(Throwable th) {
        ArrayList arrayList = new ArrayList(this.lnr);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((rq) it.next()).qdl(th);
        }
    }
}
