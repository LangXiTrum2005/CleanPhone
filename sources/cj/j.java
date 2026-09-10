package cj;

import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f6457c;

    public /* synthetic */ j(m mVar, TaskCompletionSource taskCompletionSource) {
        this.f6455a = 2;
        this.f6457c = mVar;
        this.f6456b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Task taskForException;
        Task taskForException2;
        switch (this.f6455a) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.f6456b;
                try {
                    FirebaseAnalytics firebaseAnalytics = this.f6457c.f6466a;
                    if (firebaseAnalytics == null) {
                        n.l("analytics");
                        throw null;
                    }
                    try {
                        taskForException = Tasks.call(firebaseAnalytics.b(), new pb.d(firebaseAnalytics, 1));
                        break;
                    } catch (RuntimeException e10) {
                        c8 c8Var = firebaseAnalytics.f24659a;
                        c8Var.getClass();
                        c8Var.c(new s7(c8Var, "Failed to schedule task for getSessionId", (Object) null));
                        taskForException = Tasks.forException(e10);
                    }
                    taskCompletionSource.setResult(Tasks.await(taskForException));
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(e11);
                    return;
                }
            case 1:
                TaskCompletionSource taskCompletionSource2 = this.f6456b;
                try {
                    FirebaseAnalytics firebaseAnalytics2 = this.f6457c.f6466a;
                    if (firebaseAnalytics2 == null) {
                        n.l("analytics");
                        throw null;
                    }
                    try {
                        taskForException2 = Tasks.call(firebaseAnalytics2.b(), new pb.d(firebaseAnalytics2, 0));
                        break;
                    } catch (RuntimeException e12) {
                        c8 c8Var2 = firebaseAnalytics2.f24659a;
                        c8Var2.getClass();
                        c8Var2.c(new s7(c8Var2, "Failed to schedule task for getAppInstanceId", (Object) null));
                        taskForException2 = Tasks.forException(e12);
                    }
                    taskCompletionSource2.setResult(Tasks.await(taskForException2));
                    return;
                } catch (Exception e13) {
                    taskCompletionSource2.setException(e13);
                    return;
                }
            default:
                m mVar = this.f6457c;
                TaskCompletionSource taskCompletionSource3 = this.f6456b;
                try {
                    FirebaseAnalytics firebaseAnalytics3 = mVar.f6466a;
                    if (firebaseAnalytics3 == null) {
                        n.l("analytics");
                        throw null;
                    }
                    c8 c8Var3 = firebaseAnalytics3.f24659a;
                    c8Var3.getClass();
                    c8Var3.c(new q7(c8Var3));
                    taskCompletionSource3.setResult(null);
                    return;
                } catch (Exception e14) {
                    taskCompletionSource3.setException(e14);
                    return;
                }
        }
    }

    public /* synthetic */ j(TaskCompletionSource taskCompletionSource, m mVar, int i10) {
        this.f6455a = i10;
        this.f6456b = taskCompletionSource;
        this.f6457c = mVar;
    }
}
