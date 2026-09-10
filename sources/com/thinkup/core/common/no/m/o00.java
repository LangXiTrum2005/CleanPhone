package com.thinkup.core.common.no.m;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class o00 {
    static final /* synthetic */ boolean o = true;
    private Runnable o0;
    private ExecutorService oo;
    private int m = 64;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42065n = 5;
    private final Deque<ono.o> om = new ArrayDeque();
    private final Deque<ono.o> on = new ArrayDeque();
    private final Deque<ono> m0 = new ArrayDeque();

    public o00(ExecutorService executorService) {
        this.oo = executorService;
    }

    private synchronized int m() {
        return this.m;
    }

    private synchronized int m0() {
        return this.om.size();
    }

    private synchronized int mo() {
        return this.on.size() + this.m0.size();
    }

    private synchronized int n() {
        return this.f42065n;
    }

    private synchronized ExecutorService o() {
        try {
            if (this.oo == null) {
                this.oo = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.thinkup.core.common.no.m.o.n.o(omn.o + "-HttpDispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.oo;
    }

    private synchronized void o0() {
        try {
            Iterator<ono.o> it = this.om.iterator();
            while (it.hasNext()) {
                ono.this.n();
            }
            Iterator<ono.o> it2 = this.on.iterator();
            while (it2.hasNext()) {
                ono.this.n();
            }
            Iterator<ono> it3 = this.m0.iterator();
            while (it3.hasNext()) {
                it3.next().n();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized List<oo> om() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator<ono.o> it = this.om.iterator();
            while (it.hasNext()) {
                arrayList.add(ono.this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized List<oo> on() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            arrayList.addAll(this.m0);
            Iterator<ono.o> it = this.on.iterator();
            while (it.hasNext()) {
                arrayList.add(ono.this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return Collections.unmodifiableList(arrayList);
    }

    private boolean oo() {
        int i2;
        boolean z2;
        if (!o && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<ono.o> it = this.om.iterator();
                while (it.hasNext()) {
                    ono.o next = it.next();
                    if (this.on.size() >= this.m) {
                        break;
                    }
                    if (next.o().get() < this.f42065n) {
                        it.remove();
                        next.o().incrementAndGet();
                        arrayList.add(next);
                        this.on.add(next);
                    }
                }
                z2 = mo() > 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i2 = 0; i2 < size; i2++) {
            ((ono.o) arrayList.get(i2)).o(o());
        }
        return z2;
    }

    private void m(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("max < 1: ".concat(String.valueOf(i2)));
        }
        synchronized (this) {
            this.f42065n = i2;
        }
        oo();
    }

    private void o(int i2) {
        if (i2 > 0) {
            synchronized (this) {
                this.m = i2;
            }
            oo();
            return;
        }
        throw new IllegalArgumentException("max < 1: ".concat(String.valueOf(i2)));
    }

    public o00() {
    }

    public final void m(ono.o oVar) {
        oVar.o().decrementAndGet();
        o(this.on, oVar);
    }

    public final void m(ono onoVar) {
        o(this.m0, onoVar);
    }

    private synchronized void o(Runnable runnable) {
        this.o0 = runnable;
    }

    public final void o(ono.o oVar) {
        ono.o next;
        synchronized (this) {
            try {
                this.om.add(oVar);
                if (!ono.this.f42079n) {
                    String strM = oVar.m();
                    Iterator<ono.o> it = this.on.iterator();
                    do {
                        if (!it.hasNext()) {
                            Iterator<ono.o> it2 = this.om.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (!next.m().equals(strM));
                        } else {
                            next = it.next();
                        }
                    } while (!next.m().equals(strM));
                    if (next != null) {
                        oVar.o(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        oo();
    }

    private ono.o o(String str) {
        for (ono.o oVar : this.on) {
            if (oVar.m().equals(str)) {
                return oVar;
            }
        }
        for (ono.o oVar2 : this.om) {
            if (oVar2.m().equals(str)) {
                return oVar2;
            }
        }
        return null;
    }

    public final synchronized void o(ono onoVar) {
        this.m0.add(onoVar);
    }

    private <T> void o(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.o0;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (oo() || runnable == null) {
            return;
        }
        runnable.run();
    }
}
