package com.ironsource.environment.workerthread;

import com.ironsource.C0474n4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class WorkerManager<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<Callable<T>> f28598a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f28599b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface WorkEndedListener<T> {
        void onWorkCompleted(List<WorkerResult<T>> list, long j10);

        void onWorkFailed(String str);
    }

    public WorkerManager(ExecutorService executorService) {
        this.f28599b = executorService;
    }

    public void addCallable(Callable<T> callable) {
        this.f28598a.add(callable);
    }

    public void startWork(WorkEndedListener<T> workEndedListener, long j10, TimeUnit timeUnit) {
        if (this.f28599b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
            return;
        }
        if (this.f28598a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            List<Future<T>> listInvokeAll = this.f28599b.invokeAll(this.f28598a, j10, timeUnit);
            for (int i10 = 0; i10 < listInvokeAll.size(); i10++) {
                Future<T> future = listInvokeAll.get(i10);
                if (!future.isDone() || future.isCancelled()) {
                    arrayList.add(new WorkerResult.Canceled(this.f28598a.get(i10)));
                } else {
                    try {
                        arrayList.add(new WorkerResult.Completed(future.get()));
                    } catch (InterruptedException | ExecutionException e10) {
                        C0474n4.d().a(e10);
                        arrayList.add(new WorkerResult.Failed(this.f28598a.get(i10), e10));
                    } catch (CancellationException e11) {
                        C0474n4.d().a(e11);
                        arrayList.add(new WorkerResult.Canceled(this.f28598a.get(i10)));
                    }
                }
            }
            workEndedListener.onWorkCompleted(arrayList, System.currentTimeMillis() - jCurrentTimeMillis);
            this.f28599b.shutdownNow();
        } catch (Exception e12) {
            C0474n4.d().a(e12);
            IronLog.INTERNAL.error(e12.toString());
            workEndedListener.onWorkFailed("failed to invoke callables, error= " + e12.getMessage());
            this.f28599b.shutdownNow();
        }
    }
}
