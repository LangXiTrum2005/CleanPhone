package com.google.firebase.crashlytics.internal.concurrency;

import A.C0880a0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public class CrashlyticsWorker implements Executor {
    public final ExecutorService X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Object f20375Y = new Object();
    public Task Z = Tasks.forResult(null);

    public CrashlyticsWorker(ExecutorService executorService) {
        this.X = executorService;
    }

    public final Task a(Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.f20375Y) {
            taskContinueWithTask = this.Z.continueWithTask(this.X, new C0880a0(runnable, 21));
            this.Z = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.X.execute(runnable);
    }
}
