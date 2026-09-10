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
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0580t3 {

    /* JADX INFO: renamed from: com.ironsource.t3$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements WorkerManager.WorkEndedListener<C0598u3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f30722a;

        public a(b bVar) {
            this.f30722a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkCompleted(List<WorkerResult<C0598u3>> list, long j10) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (WorkerResult<C0598u3> workerResult : list) {
                if (workerResult instanceof WorkerResult.Completed) {
                    arrayList2.add((C0598u3) ((WorkerResult.Completed) workerResult).data);
                } else if (workerResult instanceof WorkerResult.Canceled) {
                    arrayList.add(((CallableC0527q3) ((WorkerResult.Canceled) workerResult).callable).c());
                } else if (workerResult instanceof WorkerResult.Failed) {
                    WorkerResult.Failed failed = (WorkerResult.Failed) workerResult;
                    CallableC0527q3 callableC0527q3 = (CallableC0527q3) failed.callable;
                    arrayList2.add(new C0598u3(callableC0527q3.d(), callableC0527q3.c(), null, 0L, failed.exception.getMessage()));
                }
            }
            C0580t3.this.a(arrayList2, arrayList, j10);
            this.f30722a.a(arrayList2, j10, arrayList);
        }

        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkFailed(String str) {
            String strN = defpackage.e.n("failed to collect bidding data, error= ", str);
            IronLog.INTERNAL.verbose(strN);
            this.f30722a.onFailure(strN);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t3$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        void a(List<C0598u3> list, long j10, List<String> list2);

        void onFailure(String str);
    }

    public void a(List<CallableC0527q3> list, b bVar, long j10, TimeUnit timeUnit) {
        try {
            if (list.isEmpty()) {
                IronLog.INTERNAL.verbose("BiddingDataCallable list is empty");
                return;
            }
            WorkerManager workerManager = new WorkerManager(IronSourceThreadManager.INSTANCE.getThreadPoolExecutor());
            Iterator<CallableC0527q3> it = list.iterator();
            while (it.hasNext()) {
                workerManager.addCallable(it.next());
            }
            IronLog.INTERNAL.verbose("instances=" + list.size() + ", timeout=" + j10 + " millis");
            workerManager.startWork(new a(bVar), j10, timeUnit);
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            String str = "Exception - failed to collect bidding data, error= " + th2.getMessage();
            IronLog.INTERNAL.error(str);
            bVar.onFailure(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<C0598u3> list, List<String> list2, long j10) {
        IronLog.INTERNAL.verbose("tokens received=" + list.size() + ", reached timeout=" + list2.size() + ", total duration=" + j10 + " millis");
        for (C0598u3 c0598u3 : list) {
            if (c0598u3.a() != null) {
                IronLog.INTERNAL.verbose(c0598u3.c() + " - success (" + c0598u3.e() + " millis)");
            } else {
                IronLog.INTERNAL.verbose(c0598u3.c() + " - failed (" + c0598u3.e() + " millis) error: " + c0598u3.b());
            }
        }
        for (String str : list2) {
            IronLog.INTERNAL.verbose(str + " reached timeout");
        }
    }
}
