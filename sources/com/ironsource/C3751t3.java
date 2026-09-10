package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.environment.workerthread.WorkerManager;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.ironsource.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3751t3 {

    /* JADX INFO: renamed from: com.ironsource.t3$a */
    public class a implements WorkerManager.WorkEndedListener<C3768u3> {
        final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkCompleted(List<WorkerResult<C3768u3>> list, long j) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (WorkerResult<C3768u3> workerResult : list) {
                if (workerResult instanceof WorkerResult.Completed) {
                    arrayList2.add((C3768u3) ((WorkerResult.Completed) workerResult).data);
                } else if (workerResult instanceof WorkerResult.Canceled) {
                    arrayList.add(((CallableC3701q3) ((WorkerResult.Canceled) workerResult).callable).c());
                } else if (workerResult instanceof WorkerResult.Failed) {
                    WorkerResult.Failed failed = (WorkerResult.Failed) workerResult;
                    CallableC3701q3 callableC3701q3 = (CallableC3701q3) failed.callable;
                    arrayList2.add(new C3768u3(callableC3701q3.d(), callableC3701q3.c(), null, 0L, failed.exception.getMessage()));
                }
            }
            C3751t3.this.a(arrayList2, arrayList, j);
            this.a.a(arrayList2, j, arrayList);
        }

        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkFailed(String str) {
            String str2 = "failed to collect bidding data, error= " + str;
            IronLog.INTERNAL.verbose(str2);
            this.a.onFailure(str2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t3$b */
    public interface b {
        void a(List<C3768u3> list, long j, List<String> list2);

        void onFailure(String str);
    }

    public void a(List<CallableC3701q3> list, b bVar, long j, TimeUnit timeUnit) {
        try {
            if (list.isEmpty()) {
                IronLog.INTERNAL.verbose("BiddingDataCallable list is empty");
                return;
            }
            WorkerManager workerManager = new WorkerManager(IronSourceThreadManager.INSTANCE.getThreadPoolExecutor());
            Iterator<CallableC3701q3> it = list.iterator();
            while (it.hasNext()) {
                workerManager.addCallable(it.next());
            }
            IronLog.INTERNAL.verbose("instances=" + list.size() + ", timeout=" + j + " millis");
            workerManager.startWork(new a(bVar), j, timeUnit);
        } catch (Throwable th) {
            C3631m4.d().a(th);
            String str = "Exception - failed to collect bidding data, error= " + th.getMessage();
            IronLog.INTERNAL.error(str);
            bVar.onFailure(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<C3768u3> list, List<String> list2, long j) {
        IronLog.INTERNAL.verbose("tokens received=" + list.size() + ", reached timeout=" + list2.size() + ", total duration=" + j + " millis");
        for (C3768u3 c3768u3 : list) {
            if (c3768u3.a() != null) {
                IronLog.INTERNAL.verbose(c3768u3.c() + " - success (" + c3768u3.e() + " millis)");
            } else {
                IronLog.INTERNAL.verbose(c3768u3.c() + " - failed (" + c3768u3.e() + " millis) error: " + c3768u3.b());
            }
        }
        for (String str : list2) {
            IronLog.INTERNAL.verbose(str + " reached timeout");
        }
    }
}
