package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.support.v4.media.a;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DelayMetCommandHandler implements WorkConstraintsCallback, ExecutionListener, WorkTimer.TimeLimitExceededListener {
    public static final String k0 = Logger.e("DelayMetCommandHandler");
    public final Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f8711Y;
    public final String Z;
    public final SystemAlarmDispatcher e0;
    public final WorkConstraintsTracker f0;
    public PowerManager.WakeLock i0;
    public boolean j0 = false;
    public int h0 = 0;
    public final Object g0 = new Object();

    public DelayMetCommandHandler(Context context, int i2, String str, SystemAlarmDispatcher systemAlarmDispatcher) {
        this.X = context;
        this.f8711Y = i2;
        this.e0 = systemAlarmDispatcher;
        this.Z = str;
        this.f0 = new WorkConstraintsTracker(context, systemAlarmDispatcher.f8713Y, this);
    }

    @Override // androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener
    public final void a(String str) {
        Logger.c().a(k0, a.C("Exceeded time limits on execution for ", str), new Throwable[0]);
        g();
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public final void b(ArrayList arrayList) {
        g();
    }

    public final void c() {
        synchronized (this.g0) {
            try {
                this.f0.c();
                this.e0.Z.b(this.Z);
                PowerManager.WakeLock wakeLock = this.i0;
                if (wakeLock != null && wakeLock.isHeld()) {
                    Logger.c().a(k0, "Releasing wakelock " + this.i0 + " for WorkSpec " + this.Z, new Throwable[0]);
                    this.i0.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        StringBuilder sb = new StringBuilder();
        String str = this.Z;
        sb.append(str);
        sb.append(" (");
        this.i0 = WakeLocks.a(this.X, a.i(this.f8711Y, ")", sb));
        Logger loggerC = Logger.c();
        PowerManager.WakeLock wakeLock = this.i0;
        String str2 = k0;
        loggerC.a(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.i0.acquire();
        WorkSpec workSpecI = this.e0.f0.f8686c.s().i(str);
        if (workSpecI == null) {
            g();
            return;
        }
        boolean zB = workSpecI.b();
        this.j0 = zB;
        if (zB) {
            this.f0.b(Collections.singletonList(workSpecI));
        } else {
            Logger.c().a(str2, a.C("No constraints for ", str), new Throwable[0]);
            f(Collections.singletonList(str));
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void e(String str, boolean z2) {
        Logger.c().a(k0, "onExecuted " + str + ", " + z2, new Throwable[0]);
        c();
        int i2 = this.f8711Y;
        SystemAlarmDispatcher systemAlarmDispatcher = this.e0;
        Context context = this.X;
        if (z2) {
            systemAlarmDispatcher.d(new SystemAlarmDispatcher.AddRunnable(i2, CommandHandler.b(context, this.Z), systemAlarmDispatcher));
        }
        if (this.j0) {
            String str2 = CommandHandler.e0;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            systemAlarmDispatcher.d(new SystemAlarmDispatcher.AddRunnable(i2, intent, systemAlarmDispatcher));
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public final void f(List list) {
        if (list.contains(this.Z)) {
            synchronized (this.g0) {
                try {
                    if (this.h0 == 0) {
                        this.h0 = 1;
                        Logger.c().a(k0, "onAllConstraintsMet for " + this.Z, new Throwable[0]);
                        if (this.e0.e0.g(this.Z, null)) {
                            this.e0.Z.a(this.Z, this);
                        } else {
                            c();
                        }
                    } else {
                        Logger.c().a(k0, "Already started work for " + this.Z, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.g0) {
            try {
                if (this.h0 < 2) {
                    this.h0 = 2;
                    Logger loggerC = Logger.c();
                    String str = k0;
                    loggerC.a(str, "Stopping work for WorkSpec " + this.Z, new Throwable[0]);
                    Context context = this.X;
                    String str2 = this.Z;
                    String str3 = CommandHandler.e0;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    SystemAlarmDispatcher systemAlarmDispatcher = this.e0;
                    systemAlarmDispatcher.d(new SystemAlarmDispatcher.AddRunnable(this.f8711Y, intent, systemAlarmDispatcher));
                    if (this.e0.e0.c(this.Z)) {
                        Logger.c().a(str, "WorkSpec " + this.Z + " needs to be rescheduled", new Throwable[0]);
                        Intent intentB = CommandHandler.b(this.X, this.Z);
                        SystemAlarmDispatcher systemAlarmDispatcher2 = this.e0;
                        systemAlarmDispatcher2.d(new SystemAlarmDispatcher.AddRunnable(this.f8711Y, intentB, systemAlarmDispatcher2));
                    } else {
                        Logger.c().a(str, "Processor does not have WorkSpec " + this.Z + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    Logger.c().a(k0, "Already stopped work for " + this.Z, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
