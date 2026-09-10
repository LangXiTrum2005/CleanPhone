package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class q0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Callable<T>> f9335a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9336b = false;

    public interface a<T> extends Callable<T> {
        T a();
    }

    public void a(Callable<T> callable) {
        if (this.f9336b) {
            return;
        }
        this.f9335a.add(callable);
    }

    public boolean b() {
        return this.f9335a.isEmpty();
    }

    public List<T> a() {
        return a(-1L);
    }

    public List<T> a(long j) {
        List<Future<T>> listInvokeAll;
        this.f9336b = true;
        ArrayList arrayList = new ArrayList();
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(this.f9335a.size());
        ArrayList arrayList2 = new ArrayList();
        try {
            if (j > 0) {
                listInvokeAll = executorServiceNewFixedThreadPool.invokeAll(this.f9335a, j, TimeUnit.MILLISECONDS);
            } else {
                listInvokeAll = executorServiceNewFixedThreadPool.invokeAll(this.f9335a);
            }
            arrayList2.addAll(listInvokeAll);
            executorServiceNewFixedThreadPool.shutdownNow();
        } catch (Exception unused) {
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            Future future = (Future) arrayList2.get(i2);
            if (!future.isCancelled()) {
                try {
                    arrayList.add(future.get());
                } catch (Exception unused2) {
                }
            } else if (this.f9335a.get(i2) instanceof a) {
                arrayList.add(((a) this.f9335a.get(i2)).a());
            }
        }
        return arrayList;
    }
}
