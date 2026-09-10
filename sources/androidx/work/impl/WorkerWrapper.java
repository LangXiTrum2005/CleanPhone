package androidx.work.impl;

import android.content.Context;
import android.support.v4.media.a;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.InputMerger;
import androidx.work.InputMergerFactory;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.WorkForegroundRunnable;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class WorkerWrapper implements Runnable {
    public static final String u0 = Logger.e("WorkerWrapper");
    public Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f8690Y;
    public List Z;
    public WorkerParameters.RuntimeExtras e0;
    public WorkSpec f0;
    public ListenableWorker g0;
    public WorkManagerTaskExecutor h0;
    public ListenableWorker.Result i0;
    public Configuration j0;
    public Processor k0;
    public WorkDatabase l0;
    public WorkSpecDao m0;
    public DependencyDao n0;
    public WorkTagDao o0;
    public List p0;
    public String q0;
    public SettableFuture r0;
    public ListenableFuture s0;
    public volatile boolean t0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f8693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Processor f8694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WorkManagerTaskExecutor f8695c;
        public Configuration d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public WorkDatabase f8696e;
        public String f;
        public List g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public WorkerParameters.RuntimeExtras f8697h;

        public final WorkerWrapper a() {
            WorkerWrapper workerWrapper = new WorkerWrapper();
            workerWrapper.i0 = new ListenableWorker.Result.Failure();
            workerWrapper.r0 = new SettableFuture();
            workerWrapper.s0 = null;
            workerWrapper.X = this.f8693a;
            workerWrapper.h0 = this.f8695c;
            workerWrapper.k0 = this.f8694b;
            workerWrapper.f8690Y = this.f;
            workerWrapper.Z = this.g;
            workerWrapper.e0 = this.f8697h;
            workerWrapper.g0 = null;
            workerWrapper.j0 = this.d;
            WorkDatabase workDatabase = this.f8696e;
            workerWrapper.l0 = workDatabase;
            workerWrapper.m0 = workDatabase.s();
            workerWrapper.n0 = workDatabase.n();
            workerWrapper.o0 = workDatabase.t();
            return workerWrapper;
        }
    }

    public final void a(ListenableWorker.Result result) {
        boolean z2 = result instanceof ListenableWorker.Result.Success;
        String str = u0;
        if (!z2) {
            if (result instanceof ListenableWorker.Result.Retry) {
                Logger.c().d(str, a.C("Worker result RETRY for ", this.q0), new Throwable[0]);
                d();
                return;
            }
            Logger.c().d(str, a.C("Worker result FAILURE for ", this.q0), new Throwable[0]);
            if (this.f0.c()) {
                e();
                return;
            } else {
                h();
                return;
            }
        }
        Logger.c().d(str, a.C("Worker result SUCCESS for ", this.q0), new Throwable[0]);
        if (this.f0.c()) {
            e();
            return;
        }
        DependencyDao dependencyDao = this.n0;
        String str2 = this.f8690Y;
        WorkSpecDao workSpecDao = this.m0;
        WorkDatabase workDatabase = this.l0;
        workDatabase.c();
        try {
            workSpecDao.b(WorkInfo.State.Z, str2);
            workSpecDao.q(str2, ((ListenableWorker.Result.Success) this.i0).f8629a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str3 : dependencyDao.b(str2)) {
                if (workSpecDao.h(str3) == WorkInfo.State.f0 && dependencyDao.c(str3)) {
                    Logger.c().d(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                    workSpecDao.b(WorkInfo.State.X, str3);
                    workSpecDao.f(jCurrentTimeMillis, str3);
                }
            }
            workDatabase.l();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkSpecDao workSpecDao = this.m0;
            if (workSpecDao.h(str2) != WorkInfo.State.g0) {
                workSpecDao.b(WorkInfo.State.e0, str2);
            }
            linkedList.addAll(this.n0.b(str2));
        }
    }

    public final void c() {
        boolean zI = i();
        String str = this.f8690Y;
        WorkDatabase workDatabase = this.l0;
        if (!zI) {
            workDatabase.c();
            try {
                WorkInfo.State stateH = this.m0.h(str);
                workDatabase.r().a(str);
                if (stateH == null) {
                    f(false);
                } else if (stateH == WorkInfo.State.f8642Y) {
                    a(this.i0);
                } else if (!stateH.d()) {
                    d();
                }
                workDatabase.l();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        List list = this.Z;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Scheduler) it.next()).a(str);
            }
            Schedulers.a(this.j0, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.f8690Y;
        WorkSpecDao workSpecDao = this.m0;
        WorkDatabase workDatabase = this.l0;
        workDatabase.c();
        try {
            workSpecDao.b(WorkInfo.State.X, str);
            workSpecDao.f(System.currentTimeMillis(), str);
            workSpecDao.c(-1L, str);
            workDatabase.l();
        } finally {
            workDatabase.f();
            f(true);
        }
    }

    public final void e() {
        String str = this.f8690Y;
        WorkSpecDao workSpecDao = this.m0;
        WorkDatabase workDatabase = this.l0;
        workDatabase.c();
        try {
            workSpecDao.f(System.currentTimeMillis(), str);
            workSpecDao.b(WorkInfo.State.X, str);
            workSpecDao.t(str);
            workSpecDao.c(-1L, str);
            workDatabase.l();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final void f(boolean z2) {
        ListenableWorker listenableWorker;
        WorkSpecDao workSpecDao = this.m0;
        WorkDatabase workDatabase = this.l0;
        workDatabase.c();
        try {
            if (!workDatabase.s().s()) {
                PackageManagerHelper.a(this.X, RescheduleReceiver.class, false);
            }
            String str = this.f8690Y;
            if (z2) {
                workSpecDao.b(WorkInfo.State.X, str);
                workSpecDao.c(-1L, str);
            }
            if (this.f0 != null && (listenableWorker = this.g0) != null && listenableWorker.isRunInForeground()) {
                Processor processor = this.k0;
                synchronized (processor.l0) {
                    processor.g0.remove(str);
                    processor.h();
                }
            }
            workDatabase.l();
            workDatabase.f();
            this.r0.i(Boolean.valueOf(z2));
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }

    public final void g() {
        WorkSpecDao workSpecDao = this.m0;
        String str = this.f8690Y;
        WorkInfo.State stateH = workSpecDao.h(str);
        WorkInfo.State state = WorkInfo.State.f8642Y;
        String str2 = u0;
        if (stateH == state) {
            Logger.c().a(str2, a.n("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            f(true);
            return;
        }
        Logger.c().a(str2, "Status for " + str + " is " + stateH + "; not doing any work", new Throwable[0]);
        f(false);
    }

    public final void h() {
        String str = this.f8690Y;
        WorkDatabase workDatabase = this.l0;
        workDatabase.c();
        try {
            b(str);
            this.m0.q(str, ((ListenableWorker.Result.Failure) this.i0).f8628a);
            workDatabase.l();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.t0) {
            return false;
        }
        Logger.c().a(u0, a.C("Work interrupted for ", this.q0), new Throwable[0]);
        WorkInfo.State stateH = this.m0.h(this.f8690Y);
        if (stateH == null) {
            f(false);
            return true;
        }
        f(!stateH.d());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c1 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:14:0x0052, B:17:0x005c, B:22:0x007e, B:25:0x0084, B:28:0x00ac, B:30:0x00b2, B:32:0x00b8, B:45:0x0100, B:37:0x00c1, B:40:0x00d0, B:42:0x00d8), top: B:88:0x0052 }] */
    @Override // java.lang.Runnable
    public final void run() {
        WorkSpec workSpec;
        InputMerger inputMerger;
        Data dataA;
        boolean z2;
        WorkTagDao workTagDao = this.o0;
        String str = this.f8690Y;
        ArrayList<String> arrayListA = workTagDao.a(str);
        this.p0 = arrayListA;
        StringBuilder sbY = a.y("Work [ id=", str, ", tags={ ");
        boolean z3 = true;
        for (String str2 : arrayListA) {
            if (z3) {
                z3 = false;
            } else {
                sbY.append(", ");
            }
            sbY.append(str2);
        }
        sbY.append(" } ]");
        this.q0 = sbY.toString();
        WorkSpecDao workSpecDao = this.m0;
        if (i()) {
            return;
        }
        WorkDatabase workDatabase = this.l0;
        workDatabase.c();
        try {
            WorkSpec workSpecI = workSpecDao.i(str);
            this.f0 = workSpecI;
            String str3 = u0;
            if (workSpecI == null) {
                Logger.c().b(str3, "Didn't find WorkSpec for id " + str, new Throwable[0]);
                f(false);
                workDatabase.l();
                workDatabase.f();
                return;
            }
            WorkInfo.State state = workSpecI.f8777b;
            WorkInfo.State state2 = WorkInfo.State.X;
            if (state != state2) {
                g();
                workDatabase.l();
                Logger.c().a(str3, this.f0.f8778c + " is not in ENQUEUED state. Nothing more to do.", new Throwable[0]);
                workDatabase.f();
                return;
            }
            if (workSpecI.c()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                workSpec = this.f0;
                if (workSpec.f8783n != 0) {
                    Logger.c().a(str3, "Delaying execution for " + this.f0.f8778c + " because it is being executed before schedule.", new Throwable[0]);
                    f(true);
                    workDatabase.l();
                    workDatabase.f();
                    return;
                }
            } else {
                WorkSpec workSpec2 = this.f0;
                if (workSpec2.f8777b == state2 && workSpec2.k > 0) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    workSpec = this.f0;
                    if (workSpec.f8783n != 0 && jCurrentTimeMillis2 < workSpec.a()) {
                        Logger.c().a(str3, "Delaying execution for " + this.f0.f8778c + " because it is being executed before schedule.", new Throwable[0]);
                        f(true);
                        workDatabase.l();
                        workDatabase.f();
                        return;
                    }
                }
            }
            workDatabase.l();
            workDatabase.f();
            boolean zC = this.f0.c();
            Configuration configuration = this.j0;
            if (zC) {
                dataA = this.f0.f8779e;
            } else {
                InputMergerFactory inputMergerFactory = configuration.d;
                String str4 = this.f0.d;
                inputMergerFactory.getClass();
                String str5 = InputMerger.f8626a;
                try {
                    inputMerger = (InputMerger) Class.forName(str4).newInstance();
                } catch (Exception e2) {
                    Logger.c().b(InputMerger.f8626a, a.C("Trouble instantiating + ", str4), e2);
                    inputMerger = null;
                }
                if (inputMerger == null) {
                    Logger.c().b(str3, a.C("Could not create Input Merger ", this.f0.d), new Throwable[0]);
                    h();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f0.f8779e);
                    arrayList.addAll(workSpecDao.j(str));
                    dataA = inputMerger.a(arrayList);
                }
            }
            UUID uuidFromString = UUID.fromString(str);
            List list = this.p0;
            int i2 = this.f0.k;
            ExecutorService executorService = configuration.f8599a;
            WorkerFactory workerFactory = configuration.f8601c;
            WorkManagerTaskExecutor workManagerTaskExecutor = this.h0;
            WorkProgressUpdater workProgressUpdater = new WorkProgressUpdater(workDatabase, workManagerTaskExecutor);
            WorkForegroundUpdater workForegroundUpdater = new WorkForegroundUpdater(workDatabase, this.k0, workManagerTaskExecutor);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.f8651a = uuidFromString;
            workerParameters.f8652b = dataA;
            workerParameters.f8653c = new HashSet(list);
            workerParameters.d = this.e0;
            workerParameters.f8654e = i2;
            workerParameters.f = executorService;
            workerParameters.g = workManagerTaskExecutor;
            workerParameters.f8655h = workerFactory;
            workerParameters.f8656i = workProgressUpdater;
            workerParameters.j = workForegroundUpdater;
            if (this.g0 == null) {
                this.g0 = workerFactory.b(this.X, this.f0.f8778c, workerParameters);
            }
            ListenableWorker listenableWorker = this.g0;
            if (listenableWorker == null) {
                Logger.c().b(str3, a.C("Could not create Worker ", this.f0.f8778c), new Throwable[0]);
                h();
                return;
            }
            if (listenableWorker.isUsed()) {
                Logger.c().b(str3, a.n("Received an already-used Worker ", this.f0.f8778c, "; WorkerFactory should return new instances"), new Throwable[0]);
                h();
                return;
            }
            this.g0.setUsed();
            workDatabase.c();
            try {
                if (workSpecDao.h(str) == state2) {
                    workSpecDao.b(WorkInfo.State.f8642Y, str);
                    workSpecDao.u(str);
                    z2 = true;
                } else {
                    z2 = false;
                }
                workDatabase.l();
                workDatabase.f();
                if (!z2) {
                    g();
                    return;
                }
                if (i()) {
                    return;
                }
                final SettableFuture settableFuture = new SettableFuture();
                WorkForegroundRunnable workForegroundRunnable = new WorkForegroundRunnable(this.X, this.f0, this.g0, workForegroundUpdater, this.h0);
                workManagerTaskExecutor.f8852c.execute(workForegroundRunnable);
                final SettableFuture settableFuture2 = workForegroundRunnable.X;
                settableFuture2.addListener(new Runnable() { // from class: androidx.work.impl.WorkerWrapper.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettableFuture settableFuture3 = settableFuture;
                        WorkerWrapper workerWrapper = WorkerWrapper.this;
                        try {
                            settableFuture2.get();
                            Logger.c().a(WorkerWrapper.u0, "Starting work for " + workerWrapper.f0.f8778c, new Throwable[0]);
                            ListenableFuture listenableFutureStartWork = workerWrapper.g0.startWork();
                            workerWrapper.s0 = listenableFutureStartWork;
                            settableFuture3.k(listenableFutureStartWork);
                        } catch (Throwable th) {
                            settableFuture3.j(th);
                        }
                    }
                }, workManagerTaskExecutor.f8852c);
                final String str6 = this.q0;
                settableFuture.addListener(new Runnable() { // from class: androidx.work.impl.WorkerWrapper.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str7 = str6;
                        WorkerWrapper workerWrapper = WorkerWrapper.this;
                        try {
                            try {
                                ListenableWorker.Result result = (ListenableWorker.Result) settableFuture.get();
                                if (result == null) {
                                    Logger.c().b(WorkerWrapper.u0, workerWrapper.f0.f8778c + " returned a null result. Treating it as a failure.", new Throwable[0]);
                                } else {
                                    Logger.c().a(WorkerWrapper.u0, String.format("%s returned a %s result.", workerWrapper.f0.f8778c, result), new Throwable[0]);
                                    workerWrapper.i0 = result;
                                }
                                workerWrapper.c();
                            } catch (InterruptedException e3) {
                                e = e3;
                                Logger.c().b(WorkerWrapper.u0, str7 + " failed because it threw an exception/error", e);
                                workerWrapper.c();
                            } catch (CancellationException e4) {
                                Logger.c().d(WorkerWrapper.u0, str7 + " was cancelled", e4);
                                workerWrapper.c();
                            } catch (ExecutionException e5) {
                                e = e5;
                                Logger.c().b(WorkerWrapper.u0, str7 + " failed because it threw an exception/error", e);
                                workerWrapper.c();
                            }
                        } catch (Throwable th) {
                            workerWrapper.c();
                            throw th;
                        }
                    }
                }, workManagerTaskExecutor.f8850a);
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase.f();
            throw th2;
        }
    }
}
