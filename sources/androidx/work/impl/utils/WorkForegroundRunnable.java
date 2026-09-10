package androidx.work.impl.utils;

import android.content.Context;
import androidx.core.os.BuildCompat;
import androidx.work.ForegroundInfo;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;

/* JADX INFO: loaded from: classes.dex */
public class WorkForegroundRunnable implements Runnable {
    public static final String h0 = Logger.e("WorkForegroundRunnable");
    public final SettableFuture X = new SettableFuture();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Context f8816Y;
    public final WorkSpec Z;
    public final ListenableWorker e0;
    public final WorkForegroundUpdater f0;
    public final WorkManagerTaskExecutor g0;

    public WorkForegroundRunnable(Context context, WorkSpec workSpec, ListenableWorker listenableWorker, WorkForegroundUpdater workForegroundUpdater, WorkManagerTaskExecutor workManagerTaskExecutor) {
        this.f8816Y = context;
        this.Z = workSpec;
        this.e0 = listenableWorker;
        this.f0 = workForegroundUpdater;
        this.g0 = workManagerTaskExecutor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.Z.q || BuildCompat.b()) {
            this.X.i(null);
            return;
        }
        final SettableFuture settableFuture = new SettableFuture();
        WorkManagerTaskExecutor workManagerTaskExecutor = this.g0;
        workManagerTaskExecutor.f8852c.execute(new Runnable() { // from class: androidx.work.impl.utils.WorkForegroundRunnable.1
            @Override // java.lang.Runnable
            public final void run() {
                settableFuture.k(WorkForegroundRunnable.this.e0.getForegroundInfoAsync());
            }
        });
        settableFuture.addListener(new Runnable() { // from class: androidx.work.impl.utils.WorkForegroundRunnable.2
            @Override // java.lang.Runnable
            public final void run() {
                WorkForegroundRunnable workForegroundRunnable = WorkForegroundRunnable.this;
                SettableFuture settableFuture2 = workForegroundRunnable.X;
                ListenableWorker listenableWorker = workForegroundRunnable.e0;
                try {
                    ForegroundInfo foregroundInfo = (ForegroundInfo) settableFuture.get();
                    WorkSpec workSpec = workForegroundRunnable.Z;
                    if (foregroundInfo == null) {
                        throw new IllegalStateException("Worker was marked important (" + workSpec.f8778c + ") but did not provide ForegroundInfo");
                    }
                    Logger.c().a(WorkForegroundRunnable.h0, "Updating notification for " + workSpec.f8778c, new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    settableFuture2.k(workForegroundRunnable.f0.a(workForegroundRunnable.f8816Y, listenableWorker.getId(), foregroundInfo));
                } catch (Throwable th) {
                    settableFuture2.j(th);
                }
            }
        }, workManagerTaskExecutor.f8852c);
    }
}
