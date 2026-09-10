package com.p004ironsource;

import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.environment.workerthread.WorkerManager;
import com.p004ironsource.environment.workerthread.WorkerResult;
import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class b8 {

    public class a implements WorkerManager.WorkEndedListener<c8> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f24410a;

        public a(b bVar) {
            this.f24410a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkCompleted(List<WorkerResult<c8>> list, long j) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (WorkerResult<c8> workerResult : list) {
                if (workerResult instanceof WorkerResult.Completed) {
                    arrayList2.add((c8) ((WorkerResult.Completed) workerResult).data);
                } else if (workerResult instanceof WorkerResult.Canceled) {
                    arrayList.add(((y7) ((WorkerResult.Canceled) workerResult).callable).c());
                } else if (workerResult instanceof WorkerResult.Failed) {
                    WorkerResult.Failed failed = (WorkerResult.Failed) workerResult;
                    y7 y7Var = (y7) failed.callable;
                    arrayList2.add(new c8(y7Var.d(), y7Var.c(), null, 0L, failed.exception.getMessage()));
                }
            }
            b8.this.a(arrayList2, arrayList, j);
            this.f24410a.a(arrayList2, j, arrayList);
        }

        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkFailed(String str) {
            String strC = android.support.v4.media.a.C("failed to collect bidding data, error= ", str);
            IronLog.INTERNAL.verbose(strC);
            this.f24410a.onFailure(strC);
        }
    }

    public interface b {
        void a(List<c8> list, long j, List<String> list2);

        void onFailure(String str);
    }

    public void a(List<y7> list, b bVar, long j, TimeUnit timeUnit) {
        try {
            if (list.isEmpty()) {
                IronLog.INTERNAL.verbose("BiddingDataCallable list is empty");
                return;
            }
            WorkerManager workerManager = new WorkerManager(IronSourceThreadManager.INSTANCE.getThreadPoolExecutor());
            Iterator<y7> it = list.iterator();
            while (it.hasNext()) {
                workerManager.addCallable(it.next());
            }
            IronLog.INTERNAL.verbose("instances=" + list.size() + ", timeout=" + j + " millis");
            workerManager.startWork(new a(bVar), j, timeUnit);
        } catch (Throwable th) {
            String strO = androidx.datastore.preferences.protobuf.a.o(th, com.google.firebase.crashlytics.internal.model.a.p("Exception - failed to collect bidding data, error= ", th));
            IronLog.INTERNAL.error(strO);
            bVar.onFailure(strO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<c8> list, List<String> list2, long j) {
        IronLog ironLog;
        StringBuilder sb;
        String strB;
        IronLog.INTERNAL.verbose("tokens received=" + list.size() + ", reached timeout=" + list2.size() + ", total duration=" + j + " millis");
        for (c8 c8Var : list) {
            if (c8Var.a() != null) {
                ironLog = IronLog.INTERNAL;
                sb = new StringBuilder();
                sb.append(c8Var.c());
                sb.append(" - success (");
                sb.append(c8Var.e());
                strB = " millis)";
            } else {
                ironLog = IronLog.INTERNAL;
                sb = new StringBuilder();
                sb.append(c8Var.c());
                sb.append(" - failed (");
                sb.append(c8Var.e());
                sb.append(" millis) error: ");
                strB = c8Var.b();
            }
            sb.append(strB);
            ironLog.verbose(sb.toString());
        }
        for (String str : list2) {
            IronLog.INTERNAL.verbose(str + " reached timeout");
        }
    }
}
