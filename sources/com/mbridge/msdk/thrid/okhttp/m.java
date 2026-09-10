package com.mbridge.msdk.thrid.okhttp;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f36635h = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f36638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f36639d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36636a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36637b = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Deque<x.b> f36640e = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Deque<x.b> f36641f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Deque<x> f36642g = new ArrayDeque();

    public m(ExecutorService executorService) {
        this.f36639d = executorService;
    }

    private int c(x.b bVar) {
        int i10 = 0;
        for (x.b bVar2 : this.f36641f) {
            if (!bVar2.c().f36744f && bVar2.d().equals(bVar.d())) {
                i10++;
            }
        }
        return i10;
    }

    public synchronized ExecutorService a() {
        try {
            if (this.f36639d == null) {
                this.f36639d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f36639d;
    }

    public void b(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(l1.d.e(i10, "max < 1: "));
        }
        synchronized (this) {
            this.f36637b = i10;
        }
        b();
    }

    public synchronized int c() {
        return this.f36641f.size() + this.f36642g.size();
    }

    public void a(int i10) {
        if (i10 >= 1) {
            synchronized (this) {
                this.f36636a = i10;
            }
            b();
            return;
        }
        throw new IllegalArgumentException(l1.d.e(i10, "max < 1: "));
    }

    public m() {
    }

    private boolean b() {
        int i10;
        boolean z10;
        if (!f36635h && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<x.b> it = this.f36640e.iterator();
                while (it.hasNext()) {
                    x.b next = it.next();
                    if (this.f36641f.size() >= this.f36636a) {
                        break;
                    }
                    if (c(next) < this.f36637b) {
                        it.remove();
                        arrayList.add(next);
                        this.f36641f.add(next);
                    }
                }
                z10 = c() > 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((x.b) arrayList.get(i10)).a(a());
        }
        return z10;
    }

    public void a(x.b bVar) {
        synchronized (this) {
            this.f36640e.add(bVar);
        }
        b();
    }

    public synchronized void a(x xVar) {
        this.f36642g.add(xVar);
    }

    private <T> void a(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t10)) {
                runnable = this.f36638c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (b() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void b(x.b bVar) {
        a(this.f36641f, bVar);
    }

    public void b(x xVar) {
        a(this.f36642g, xVar);
    }
}
