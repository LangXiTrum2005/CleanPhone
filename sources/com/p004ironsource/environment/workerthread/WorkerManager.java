package com.p004ironsource.environment.workerthread;

import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.q9;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class WorkerManager<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<Callable<T>> f24934a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f24935b;

    public interface WorkEndedListener<T> {
        void onWorkCompleted(List<WorkerResult<T>> list, long j);

        void onWorkFailed(String str);
    }

    public WorkerManager(ExecutorService executorService) {
        this.f24935b = executorService;
    }

    public void addCallable(Callable<T> callable) {
        this.f24934a.add(callable);
    }

    public void startWork(WorkEndedListener<T> workEndedListener, long j, TimeUnit timeUnit) {
        WorkerResult.Canceled canceled;
        if (this.f24935b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
            return;
        }
        if (this.f24934a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            List<Future<T>> listInvokeAll = this.f24935b.invokeAll(this.f24934a, j, timeUnit);
            for (int i2 = 0; i2 < listInvokeAll.size(); i2++) {
                Future<T> future = listInvokeAll.get(i2);
                if (!future.isDone() || future.isCancelled()) {
                    canceled = new WorkerResult.Canceled(this.f24934a.get(i2));
                } else {
                    try {
                        arrayList.add(new WorkerResult.Completed(future.get()));
                    } catch (InterruptedException e2) {
                        e = e2;
                        q9.d().a(e);
                        arrayList.add(new WorkerResult.Failed(this.f24934a.get(i2), e));
                    } catch (CancellationException e3) {
                        q9.d().a(e3);
                        canceled = new WorkerResult.Canceled(this.f24934a.get(i2));
                        arrayList.add(canceled);
                    } catch (ExecutionException e4) {
                        e = e4;
                        q9.d().a(e);
                        arrayList.add(new WorkerResult.Failed(this.f24934a.get(i2), e));
                    }
                }
                arrayList.add(canceled);
            }
            workEndedListener.onWorkCompleted(arrayList, System.currentTimeMillis() - jCurrentTimeMillis);
            this.f24935b.shutdownNow();
        } catch (Exception e5) {
            q9.d().a(e5);
            IronLog.INTERNAL.error(e5.toString());
            workEndedListener.onWorkFailed("failed to invoke callables, error= " + e5.getMessage());
            this.f24935b.shutdownNow();
        }
    }
}
