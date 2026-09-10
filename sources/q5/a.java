package q5;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import cj.h;
import com.adjust.sdk.scheduler.TimerCycle;
import com.adjust.sdk.scheduler.TimerOnce;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import com.storage.androidcleaner.R;
import d5.k;
import d5.o;
import defpackage.e;
import e5.l;
import i5.c;
import java.util.Collections;
import java.util.Date;
import m5.i;
import t.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f48656b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f48655a = i10;
        this.f48656b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        switch (this.f48655a) {
            case 0:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f48656b;
                String strB = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (TextUtils.isEmpty(strB)) {
                    o.g().f(ConstraintTrackingWorker.f5044f, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.f5048d.h(new k());
                    return;
                }
                ListenableWorker listenableWorkerA = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), strB, constraintTrackingWorker.f5045a);
                constraintTrackingWorker.f5049e = listenableWorkerA;
                if (listenableWorkerA == null) {
                    o.g().e(ConstraintTrackingWorker.f5044f, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.f5048d.h(new k());
                    return;
                }
                i iVarL = l.b(constraintTrackingWorker.getApplicationContext()).f39111c.n().l(constraintTrackingWorker.getId().toString());
                if (iVarL == null) {
                    constraintTrackingWorker.f5048d.h(new k());
                    return;
                }
                c cVar = new c(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
                cVar.b(Collections.singletonList(iVarL));
                if (!cVar.a(constraintTrackingWorker.getId().toString())) {
                    o.g().e(ConstraintTrackingWorker.f5044f, e.o("Constraints not met for delegate ", strB, ". Requesting retry."), new Throwable[0]);
                    constraintTrackingWorker.f5048d.h(new d5.l());
                    return;
                }
                o.g().e(ConstraintTrackingWorker.f5044f, e.n("Constraints met for delegate ", strB), new Throwable[0]);
                try {
                    ListenableFuture listenableFutureStartWork = constraintTrackingWorker.f5049e.startWork();
                    listenableFutureStartWork.addListener(new n5.i(constraintTrackingWorker, false, listenableFutureStartWork, 1), constraintTrackingWorker.getBackgroundExecutor());
                    return;
                } catch (Throwable th2) {
                    o oVarG = o.g();
                    String str = ConstraintTrackingWorker.f5044f;
                    oVarG.e(str, e.o("Delegated worker ", strB, " threw exception in startWork."), th2);
                    synchronized (constraintTrackingWorker.f5046b) {
                        try {
                            if (constraintTrackingWorker.f5047c) {
                                o.g().e(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                                constraintTrackingWorker.f5048d.h(new d5.l());
                            } else {
                                constraintTrackingWorker.f5048d.h(new k());
                            }
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            case 1:
                qd.k kVar = (qd.k) this.f48656b;
                synchronized (kVar) {
                    zA = kVar.a();
                    if (zA) {
                        synchronized (kVar) {
                            kVar.f48987b = true;
                        }
                    }
                }
                if (zA) {
                    qd.l lVarC = kVar.f49001q.c();
                    kVar.f49000p.getClass();
                    if (new Date(System.currentTimeMillis()).before(lVarC.f49004b)) {
                        kVar.h();
                        return;
                    }
                    uc.c cVar2 = (uc.c) kVar.f48996k;
                    Task taskD = cVar2.d();
                    Task taskC = cVar2.c();
                    Task<TContinuationResult> taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskD, taskC}).continueWithTask(kVar.f48993h, new ac.a(kVar, taskD, taskC, 11));
                    Tasks.whenAllComplete((Task<?>[]) new Task[]{taskContinueWithTask}).continueWith(kVar.f48993h, new h(28, kVar, taskContinueWithTask));
                    return;
                }
                return;
            case 2:
                ((th.c) this.f48656b).a(null);
                return;
            case 3:
                z zVar = (z) this.f48656b;
                Context context = zVar.getContext();
                if (context == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                } else {
                    zVar.f50324s.e(1);
                    zVar.f50324s.d(context.getString(R.string.fingerprint_dialog_touch_sensor));
                    return;
                }
            case 4:
                Context context2 = (Context) ((v9.e) this.f48656b).f52503b;
                long j10 = v9.e.O(context2).getLong("app_set_id_last_used_time", -1L);
                long j11 = j10 != -1 ? j10 + 33696000000L : -1L;
                if (j11 == -1 || System.currentTimeMillis() <= j11) {
                    return;
                }
                if (!v9.e.O(context2).edit().remove("app_set_id").commit()) {
                    String strValueOf = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context2.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String strValueOf2 = String.valueOf(context2.getPackageName());
                Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 5:
                ((xh.a) this.f48656b).a(null);
                return;
            case 6:
                TimerCycle timerCycle = (TimerCycle) this.f48656b;
                timerCycle.logger.verbose("%s fired", timerCycle.name);
                timerCycle.command.run();
                return;
            default:
                TimerOnce timerOnce = (TimerOnce) this.f48656b;
                timerOnce.logger.verbose("%s fired", timerOnce.name);
                timerOnce.command.run();
                timerOnce.waitingTask = null;
                return;
        }
    }
}
