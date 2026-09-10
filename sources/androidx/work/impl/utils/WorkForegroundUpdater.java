package androidx.work.impl.utils;

import android.content.Context;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class WorkForegroundUpdater implements ForegroundUpdater {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkManagerTaskExecutor f8819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Processor f8820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkSpecDao f8821c;

    static {
        Logger.e("WMFgUpdater");
    }

    public WorkForegroundUpdater(WorkDatabase workDatabase, Processor processor, WorkManagerTaskExecutor workManagerTaskExecutor) {
        this.f8820b = processor;
        this.f8819a = workManagerTaskExecutor;
        this.f8821c = workDatabase.s();
    }

    public final SettableFuture a(final Context context, final UUID uuid, final ForegroundInfo foregroundInfo) {
        final SettableFuture settableFuture = new SettableFuture();
        this.f8819a.b(new Runnable() { // from class: androidx.work.impl.utils.WorkForegroundUpdater.1
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                ForegroundInfo foregroundInfo2 = foregroundInfo;
                WorkForegroundUpdater workForegroundUpdater = WorkForegroundUpdater.this;
                SettableFuture settableFuture2 = settableFuture;
                try {
                    if (!settableFuture2.isCancelled()) {
                        String string = uuid.toString();
                        WorkInfo.State stateH = workForegroundUpdater.f8821c.h(string);
                        if (stateH == null || stateH.d()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        workForegroundUpdater.f8820b.f(string, foregroundInfo2);
                        context2.startService(SystemForegroundDispatcher.a(context2, string, foregroundInfo2));
                    }
                    settableFuture2.i(null);
                } catch (Throwable th) {
                    settableFuture2.j(th);
                }
            }
        });
        return settableFuture;
    }
}
