package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.a;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.StopWorkRunnable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class CommandHandler implements ExecutionListener {
    public static final String e0 = Logger.e("CommandHandler");
    public final Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final HashMap f8704Y = new HashMap();
    public final Object Z = new Object();

    public CommandHandler(Context context) {
        this.X = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public final void c(int i2, Intent intent, SystemAlarmDispatcher systemAlarmDispatcher) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            Logger.c().a(e0, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            ConstraintsCommandHandler constraintsCommandHandler = new ConstraintsCommandHandler(this.X, i2, systemAlarmDispatcher);
            ArrayList<WorkSpec> arrayListG = systemAlarmDispatcher.f0.f8686c.s().g();
            String str = ConstraintProxy.f8705a;
            Iterator it = arrayListG.iterator();
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            while (it.hasNext()) {
                Constraints constraints = ((WorkSpec) it.next()).j;
                z2 |= constraints.d;
                z3 |= constraints.f8607b;
                z4 |= constraints.f8609e;
                z5 |= constraints.f8606a != NetworkType.X;
                if (z2 && z3 && z4 && z5) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f8706a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = constraintsCommandHandler.f8708a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z5);
            context.sendBroadcast(intent2);
            WorkConstraintsTracker workConstraintsTracker = constraintsCommandHandler.f8710c;
            workConstraintsTracker.b(arrayListG);
            ArrayList arrayList = new ArrayList(arrayListG.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (WorkSpec workSpec : arrayListG) {
                String str3 = workSpec.f8776a;
                if (jCurrentTimeMillis >= workSpec.a() && (!workSpec.b() || workConstraintsTracker.a(str3))) {
                    arrayList.add(workSpec);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str4 = ((WorkSpec) it2.next()).f8776a;
                Intent intentA = a(context, str4);
                Logger.c().a(ConstraintsCommandHandler.d, a.n("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                systemAlarmDispatcher.d(new SystemAlarmDispatcher.AddRunnable(constraintsCommandHandler.f8709b, intentA, systemAlarmDispatcher));
            }
            workConstraintsTracker.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            Logger.c().a(e0, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i2)), new Throwable[0]);
            systemAlarmDispatcher.f0.e();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            Logger.c().b(e0, a.n("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if (!"ACTION_SCHEDULE_WORK".equals(action)) {
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.Z) {
                    try {
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        Logger loggerC = Logger.c();
                        String str5 = e0;
                        loggerC.a(str5, "Handing delay met for " + string, new Throwable[0]);
                        if (this.f8704Y.containsKey(string)) {
                            Logger.c().a(str5, "WorkSpec " + string + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                        } else {
                            DelayMetCommandHandler delayMetCommandHandler = new DelayMetCommandHandler(this.X, i2, string, systemAlarmDispatcher);
                            this.f8704Y.put(string, delayMetCommandHandler);
                            delayMetCommandHandler.d();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            if (!"ACTION_STOP_WORK".equals(action)) {
                if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                    Logger.c().f(e0, String.format("Ignoring intent %s", intent), new Throwable[0]);
                    return;
                }
                Bundle extras3 = intent.getExtras();
                String string2 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z6 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                Logger.c().a(e0, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i2)), new Throwable[0]);
                e(string2, z6);
                return;
            }
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            Logger.c().a(e0, a.C("Handing stopWork work for ", string3), new Throwable[0]);
            WorkManagerImpl workManagerImpl = systemAlarmDispatcher.f0;
            workManagerImpl.d.b(new StopWorkRunnable(workManagerImpl, string3, false));
            String str6 = Alarms.f8703a;
            SystemIdInfoDao systemIdInfoDaoP = systemAlarmDispatcher.f0.f8686c.p();
            SystemIdInfo systemIdInfoA = systemIdInfoDaoP.a(string3);
            if (systemIdInfoA != null) {
                Alarms.a(systemIdInfoA.f8764b, this.X, string3);
                Logger.c().a(Alarms.f8703a, a.n("Removing SystemIdInfo for workSpecId (", string3, ")"), new Throwable[0]);
                systemIdInfoDaoP.d(string3);
            }
            systemAlarmDispatcher.e(string3, false);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        String str7 = e0;
        Logger.c().a(str7, a.C("Handling schedule work for ", string4), new Throwable[0]);
        WorkDatabase workDatabase = systemAlarmDispatcher.f0.f8686c;
        workDatabase.c();
        try {
            WorkSpec workSpecI = workDatabase.s().i(string4);
            if (workSpecI == null) {
                Logger.c().f(str7, "Skipping scheduling " + string4 + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (workSpecI.f8777b.d()) {
                Logger.c().f(str7, "Skipping scheduling " + string4 + "because it is finished.", new Throwable[0]);
                return;
            }
            long jA = workSpecI.a();
            boolean zB = workSpecI.b();
            Context context2 = this.X;
            WorkManagerImpl workManagerImpl2 = systemAlarmDispatcher.f0;
            if (zB) {
                Logger.c().a(str7, "Opportunistically setting an alarm for " + string4 + " at " + jA, new Throwable[0]);
                Alarms.b(context2, workManagerImpl2, string4, jA);
                Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                systemAlarmDispatcher.d(new SystemAlarmDispatcher.AddRunnable(i2, intent3, systemAlarmDispatcher));
            } else {
                Logger.c().a(str7, "Setting up Alarms for " + string4 + " at " + jA, new Throwable[0]);
                Alarms.b(context2, workManagerImpl2, string4, jA);
            }
            workDatabase.l();
        } finally {
            workDatabase.f();
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void e(String str, boolean z2) {
        synchronized (this.Z) {
            try {
                ExecutionListener executionListener = (ExecutionListener) this.f8704Y.remove(str);
                if (executionListener != null) {
                    executionListener.e(str, z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
