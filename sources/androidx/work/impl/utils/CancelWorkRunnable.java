package androidx.work.impl.utils;

import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class CancelWorkRunnable implements Runnable {
    public final OperationImpl X = new OperationImpl();

    /* JADX INFO: renamed from: androidx.work.impl.utils.CancelWorkRunnable$4, reason: invalid class name */
    class AnonymousClass4 extends CancelWorkRunnable {
        @Override // androidx.work.impl.utils.CancelWorkRunnable
        public final void d() {
            throw null;
        }
    }

    public static void a(WorkManagerImpl workManagerImpl, String str) {
        WorkDatabase workDatabase = workManagerImpl.f8686c;
        WorkSpecDao workSpecDaoS = workDatabase.s();
        DependencyDao dependencyDaoN = workDatabase.n();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo.State stateH = workSpecDaoS.h(str2);
            if (stateH != WorkInfo.State.Z && stateH != WorkInfo.State.e0) {
                workSpecDaoS.b(WorkInfo.State.g0, str2);
            }
            linkedList.addAll(dependencyDaoN.b(str2));
        }
        Processor processor = workManagerImpl.f;
        synchronized (processor.l0) {
            try {
                Logger.c().a(Processor.m0, "Processor cancelling " + str, new Throwable[0]);
                processor.j0.add(str);
                WorkerWrapper workerWrapper = (WorkerWrapper) processor.g0.remove(str);
                boolean z2 = workerWrapper != null;
                if (workerWrapper == null) {
                    workerWrapper = (WorkerWrapper) processor.h0.remove(str);
                }
                Processor.b(str, workerWrapper);
                if (z2) {
                    processor.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = workManagerImpl.f8687e.iterator();
        while (it.hasNext()) {
            ((Scheduler) it.next()).a(str);
        }
    }

    public static CancelWorkRunnable b(final WorkManagerImpl workManagerImpl, final UUID uuid) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.1
            @Override // androidx.work.impl.utils.CancelWorkRunnable
            public final void d() {
                WorkManagerImpl workManagerImpl2 = workManagerImpl;
                WorkDatabase workDatabase = workManagerImpl2.f8686c;
                workDatabase.c();
                try {
                    CancelWorkRunnable.a(workManagerImpl2, uuid.toString());
                    workDatabase.l();
                    workDatabase.f();
                    Schedulers.a(workManagerImpl2.f8685b, workManagerImpl2.f8686c, workManagerImpl2.f8687e);
                } catch (Throwable th) {
                    workDatabase.f();
                    throw th;
                }
            }
        };
    }

    public static CancelWorkRunnable c(final WorkManagerImpl workManagerImpl) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.2
            @Override // androidx.work.impl.utils.CancelWorkRunnable
            public final void d() {
                WorkManagerImpl workManagerImpl2 = workManagerImpl;
                WorkDatabase workDatabase = workManagerImpl2.f8686c;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.s().n().iterator();
                    while (it.hasNext()) {
                        CancelWorkRunnable.a(workManagerImpl2, (String) it.next());
                    }
                    workDatabase.l();
                    workDatabase.f();
                    Schedulers.a(workManagerImpl2.f8685b, workManagerImpl2.f8686c, workManagerImpl2.f8687e);
                } catch (Throwable th) {
                    workDatabase.f();
                    throw th;
                }
            }
        };
    }

    public abstract void d();

    @Override // java.lang.Runnable
    public final void run() {
        OperationImpl operationImpl = this.X;
        try {
            d();
            operationImpl.a(Operation.f8633a);
        } catch (Throwable th) {
            operationImpl.a(new Operation.State.FAILURE(th));
        }
    }
}
