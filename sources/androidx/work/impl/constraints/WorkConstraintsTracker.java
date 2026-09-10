package androidx.work.impl.constraints;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class WorkConstraintsTracker implements ConstraintController.OnConstraintUpdatedCallback {
    public static final String d = Logger.e("WorkConstraintsTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkConstraintsCallback f8724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintController[] f8725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8726c;

    public WorkConstraintsTracker(Context context, TaskExecutor taskExecutor, WorkConstraintsCallback workConstraintsCallback) {
        Context applicationContext = context.getApplicationContext();
        this.f8724a = workConstraintsCallback;
        this.f8725b = new ConstraintController[]{new BatteryChargingController(Trackers.a(applicationContext, taskExecutor).f8745a), new BatteryNotLowController(Trackers.a(applicationContext, taskExecutor).f8746b), new StorageNotLowController(Trackers.a(applicationContext, taskExecutor).d), new NetworkConnectedController(Trackers.a(applicationContext, taskExecutor).f8747c), new NetworkUnmeteredController(Trackers.a(applicationContext, taskExecutor).f8747c), new NetworkNotRoamingController(Trackers.a(applicationContext, taskExecutor).f8747c), new NetworkMeteredController(Trackers.a(applicationContext, taskExecutor).f8747c)};
        this.f8726c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f8726c) {
            try {
                for (ConstraintController constraintController : this.f8725b) {
                    Object obj = constraintController.f8728b;
                    if (obj != null && constraintController.c(obj) && constraintController.f8727a.contains(str)) {
                        Logger.c().a(d, "Work " + str + " constrained by " + constraintController.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Collection collection) {
        synchronized (this.f8726c) {
            try {
                for (ConstraintController constraintController : this.f8725b) {
                    if (constraintController.d != null) {
                        constraintController.d = null;
                        constraintController.e(null, constraintController.f8728b);
                    }
                }
                for (ConstraintController constraintController2 : this.f8725b) {
                    constraintController2.d(collection);
                }
                for (ConstraintController constraintController3 : this.f8725b) {
                    if (constraintController3.d != this) {
                        constraintController3.d = this;
                        constraintController3.e(this, constraintController3.f8728b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f8726c) {
            try {
                for (ConstraintController constraintController : this.f8725b) {
                    ArrayList arrayList = constraintController.f8727a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        constraintController.f8729c.b(constraintController);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
