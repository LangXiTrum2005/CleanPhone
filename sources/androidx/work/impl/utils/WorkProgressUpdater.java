package androidx.work.impl.utils;

import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.ProgressUpdater;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class WorkProgressUpdater implements ProgressUpdater {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f8823c = Logger.e("WorkProgressUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f8824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkManagerTaskExecutor f8825b;

    public WorkProgressUpdater(WorkDatabase workDatabase, WorkManagerTaskExecutor workManagerTaskExecutor) {
        this.f8824a = workDatabase;
        this.f8825b = workManagerTaskExecutor;
    }

    public final SettableFuture a(final UUID uuid, final Data data) {
        final SettableFuture settableFuture = new SettableFuture();
        this.f8825b.b(new Runnable() { // from class: androidx.work.impl.utils.WorkProgressUpdater.1
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture2 = settableFuture;
                UUID uuid2 = uuid;
                String string = uuid2.toString();
                Logger loggerC = Logger.c();
                String str = WorkProgressUpdater.f8823c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid2);
                sb.append(" (");
                Data data2 = data;
                sb.append(data2);
                sb.append(")");
                loggerC.a(str, sb.toString(), new Throwable[0]);
                WorkProgressUpdater workProgressUpdater = WorkProgressUpdater.this;
                WorkDatabase workDatabase = workProgressUpdater.f8824a;
                WorkDatabase workDatabase2 = workProgressUpdater.f8824a;
                workDatabase.c();
                try {
                    WorkSpec workSpecI = workDatabase2.s().i(string);
                    if (workSpecI == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (workSpecI.f8777b == WorkInfo.State.f8642Y) {
                        workDatabase2.r().c(new WorkProgress(string, data2));
                    } else {
                        Logger.c().f(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.", new Throwable[0]);
                    }
                    settableFuture2.i(null);
                    workDatabase2.l();
                    workDatabase2.f();
                } catch (Throwable th) {
                    try {
                        Logger.c().b(WorkProgressUpdater.f8823c, "Error updating Worker progress", th);
                        settableFuture2.j(th);
                    } finally {
                        workDatabase2.f();
                    }
                }
            }
        });
        return settableFuture;
    }
}
