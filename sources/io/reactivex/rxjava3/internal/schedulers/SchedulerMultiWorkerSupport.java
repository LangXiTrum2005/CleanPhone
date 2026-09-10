package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes7.dex */
public interface SchedulerMultiWorkerSupport {

    public interface WorkerCallback {
        void onWorker(int i2, Scheduler.Worker worker);
    }

    void createWorkers(int i2, WorkerCallback workerCallback);
}
