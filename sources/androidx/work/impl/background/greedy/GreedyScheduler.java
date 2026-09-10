package androidx.work.impl.background.greedy;

import android.content.Context;
import android.support.v4.media.a;
import android.text.TextUtils;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.DefaultRunnableScheduler;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.ProcessUtils;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GreedyScheduler implements Scheduler, WorkConstraintsCallback, ExecutionListener {
    public static final String j0 = Logger.e("GreedyScheduler");
    public final Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final WorkManagerImpl f8702Y;
    public final WorkConstraintsTracker Z;
    public final DelayedWorkTracker f0;
    public boolean g0;
    public Boolean i0;
    public final HashSet e0 = new HashSet();
    public final Object h0 = new Object();

    public GreedyScheduler(Context context, Configuration configuration, WorkManagerTaskExecutor workManagerTaskExecutor, WorkManagerImpl workManagerImpl) {
        this.X = context;
        this.f8702Y = workManagerImpl;
        this.Z = new WorkConstraintsTracker(context, workManagerTaskExecutor, this);
        this.f0 = new DelayedWorkTracker(this, configuration.f8602e);
    }

    @Override // androidx.work.impl.Scheduler
    public final void a(String str) {
        Runnable runnable;
        Boolean bool = this.i0;
        WorkManagerImpl workManagerImpl = this.f8702Y;
        if (bool == null) {
            this.i0 = Boolean.valueOf(ProcessUtils.a(this.X, workManagerImpl.f8685b));
        }
        boolean zBooleanValue = this.i0.booleanValue();
        String str2 = j0;
        if (!zBooleanValue) {
            Logger.c().d(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.g0) {
            workManagerImpl.f.a(this);
            this.g0 = true;
        }
        Logger.c().a(str2, a.C("Cancelling work ID ", str), new Throwable[0]);
        DelayedWorkTracker delayedWorkTracker = this.f0;
        if (delayedWorkTracker != null && (runnable = (Runnable) delayedWorkTracker.f8700c.remove(str)) != null) {
            delayedWorkTracker.f8699b.a(runnable);
        }
        workManagerImpl.d.b(new StopWorkRunnable(workManagerImpl, str, false));
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public final void b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Logger.c().a(j0, a.C("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            WorkManagerImpl workManagerImpl = this.f8702Y;
            workManagerImpl.d.b(new StopWorkRunnable(workManagerImpl, str, false));
        }
    }

    @Override // androidx.work.impl.Scheduler
    public final void c(WorkSpec... workSpecArr) {
        if (this.i0 == null) {
            this.i0 = Boolean.valueOf(ProcessUtils.a(this.X, this.f8702Y.f8685b));
        }
        if (!this.i0.booleanValue()) {
            Logger.c().d(j0, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.g0) {
            this.f8702Y.f.a(this);
            this.g0 = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (final WorkSpec workSpec : workSpecArr) {
            long jA = workSpec.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (workSpec.f8777b == WorkInfo.State.X) {
                if (jCurrentTimeMillis < jA) {
                    final DelayedWorkTracker delayedWorkTracker = this.f0;
                    if (delayedWorkTracker != null) {
                        HashMap map = delayedWorkTracker.f8700c;
                        Runnable runnable = (Runnable) map.remove(workSpec.f8776a);
                        DefaultRunnableScheduler defaultRunnableScheduler = delayedWorkTracker.f8699b;
                        if (runnable != null) {
                            defaultRunnableScheduler.a(runnable);
                        }
                        Runnable runnable2 = new Runnable() { // from class: androidx.work.impl.background.greedy.DelayedWorkTracker.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Logger loggerC = Logger.c();
                                String str = DelayedWorkTracker.d;
                                WorkSpec workSpec2 = workSpec;
                                loggerC.a(str, a.C("Scheduling work ", workSpec2.f8776a), new Throwable[0]);
                                DelayedWorkTracker.this.f8698a.c(workSpec2);
                            }
                        };
                        map.put(workSpec.f8776a, runnable2);
                        defaultRunnableScheduler.f8660a.postDelayed(runnable2, workSpec.a() - System.currentTimeMillis());
                    }
                } else if (workSpec.b()) {
                    Constraints constraints = workSpec.j;
                    if (constraints.f8608c) {
                        Logger.c().a(j0, "Ignoring WorkSpec " + workSpec + ", Requires device idle.", new Throwable[0]);
                    } else if (constraints.f8610h.f8613a.size() > 0) {
                        Logger.c().a(j0, "Ignoring WorkSpec " + workSpec + ", Requires ContentUri triggers.", new Throwable[0]);
                    } else {
                        hashSet.add(workSpec);
                        hashSet2.add(workSpec.f8776a);
                    }
                } else {
                    Logger.c().a(j0, a.C("Starting work for ", workSpec.f8776a), new Throwable[0]);
                    this.f8702Y.f(workSpec.f8776a, null);
                }
            }
        }
        synchronized (this.h0) {
            try {
                if (!hashSet.isEmpty()) {
                    Logger.c().a(j0, "Starting tracking for [" + TextUtils.join(",", hashSet2) + d9.i.f24752e, new Throwable[0]);
                    this.e0.addAll(hashSet);
                    this.Z.b(this.e0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.Scheduler
    public final boolean d() {
        return false;
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void e(String str, boolean z2) {
        synchronized (this.h0) {
            try {
                for (WorkSpec workSpec : this.e0) {
                    if (workSpec.f8776a.equals(str)) {
                        Logger.c().a(j0, "Stopping tracking for " + str, new Throwable[0]);
                        this.e0.remove(workSpec);
                        this.Z.b(this.e0);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public final void f(List list) {
        for (String str : (ArrayList) list) {
            Logger.c().a(j0, a.C("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f8702Y.f(str, null);
        }
    }
}
