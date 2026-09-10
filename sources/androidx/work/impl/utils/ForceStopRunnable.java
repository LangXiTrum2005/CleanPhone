package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BuildCompat;
import androidx.media3.exoplayer.source.mediaparser.b;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabasePathHelper;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {
    public static final String e0 = Logger.e("ForceStopRunnable");
    public static final long f0 = TimeUnit.DAYS.toMillis(3650);
    public final Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final WorkManagerImpl f8804Y;
    public int Z = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f8805a = Logger.e("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            if (((Logger.LogcatLogger) Logger.c()).f8631b <= 2) {
                Log.v(f8805a, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.d(context);
        }
    }

    public ForceStopRunnable(Context context, WorkManagerImpl workManagerImpl) {
        this.X = context.getApplicationContext();
        this.f8804Y = workManagerImpl;
    }

    public static void d(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        int i2 = BuildCompat.b() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
        long jCurrentTimeMillis = System.currentTimeMillis() + f0;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b3  */
    public final void b() {
        boolean z2;
        String string;
        String str = SystemJobScheduler.f0;
        Context context = this.X;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList<JobInfo> arrayListE = SystemJobScheduler.e(context, jobScheduler);
        WorkManagerImpl workManagerImpl = this.f8804Y;
        ArrayList arrayListB = workManagerImpl.f8686c.p().b();
        HashSet hashSet = new HashSet(arrayListE != null ? arrayListE.size() : 0);
        if (arrayListE != null && !arrayListE.isEmpty()) {
            for (JobInfo jobInfo : arrayListE) {
                PersistableBundle extras = jobInfo.getExtras();
                if (extras != null) {
                    try {
                        if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                            string = extras.getString("EXTRA_WORK_SPEC_ID");
                        } else {
                            string = null;
                        }
                    } catch (NullPointerException unused) {
                    }
                } else {
                    string = null;
                }
                if (TextUtils.isEmpty(string)) {
                    SystemJobScheduler.b(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(string);
                }
            }
        }
        Iterator it = arrayListB.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    Logger.c().a(SystemJobScheduler.f0, "Reconciling jobs", new Throwable[0]);
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            WorkDatabase workDatabase = workManagerImpl.f8686c;
            workDatabase.c();
            try {
                WorkSpecDao workSpecDaoS = workDatabase.s();
                Iterator it2 = arrayListB.iterator();
                while (it2.hasNext()) {
                    workSpecDaoS.c(-1L, (String) it2.next());
                }
                workDatabase.l();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        WorkDatabase workDatabase2 = workManagerImpl.f8686c;
        WorkSpecDao workSpecDaoS2 = workDatabase2.s();
        WorkProgressDao workProgressDaoR = workDatabase2.r();
        workDatabase2.c();
        try {
            ArrayList<WorkSpec> arrayListR = workSpecDaoS2.r();
            boolean zIsEmpty = arrayListR.isEmpty();
            if (!zIsEmpty) {
                for (WorkSpec workSpec : arrayListR) {
                    workSpecDaoS2.b(WorkInfo.State.X, workSpec.f8776a);
                    workSpecDaoS2.c(-1L, workSpec.f8776a);
                }
            }
            workProgressDaoR.b();
            workDatabase2.l();
            workDatabase2.f();
            boolean z3 = !zIsEmpty || z2;
            Long lB = workManagerImpl.g.f8808a.o().b("reschedule_needed");
            String str2 = e0;
            if (lB != null && lB.longValue() == 1) {
                Logger.c().a(str2, "Rescheduling Workers.", new Throwable[0]);
                workManagerImpl.e();
                PreferenceUtils preferenceUtils = workManagerImpl.g;
                preferenceUtils.getClass();
                preferenceUtils.f8808a.o().a(new Preference("reschedule_needed", 0L));
                return;
            }
            try {
                int i2 = BuildCompat.b() ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
                if (Build.VERSION.SDK_INT < 30) {
                    if (broadcast == null) {
                        d(context);
                        Logger.c().a(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                        workManagerImpl.e();
                        return;
                    }
                    if (z3) {
                        Logger.c().a(str2, "Found unfinished work, scheduling it.", new Throwable[0]);
                        Schedulers.a(workManagerImpl.f8685b, workManagerImpl.f8686c, workManagerImpl.f8687e);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i3 = 0; i3 < historicalProcessExitReasons.size(); i3++) {
                        if (b.f(historicalProcessExitReasons.get(i3)).getReason() == 10) {
                            Logger.c().a(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                            workManagerImpl.e();
                            return;
                        }
                    }
                }
                if (z3) {
                    Logger.c().a(str2, "Found unfinished work, scheduling it.", new Throwable[0]);
                    Schedulers.a(workManagerImpl.f8685b, workManagerImpl.f8686c, workManagerImpl.f8687e);
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                Logger.c().f(str2, "Ignoring exception", e);
            } catch (SecurityException e3) {
                e = e3;
                Logger.c().f(str2, "Ignoring exception", e);
            }
        } catch (Throwable th2) {
            workDatabase2.f();
            throw th2;
        }
    }

    public final boolean c() {
        Configuration configuration = this.f8804Y.f8685b;
        configuration.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = e0;
        if (zIsEmpty) {
            Logger.c().a(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zA = ProcessUtils.a(this.X, configuration);
        Logger.c().a(str, "Is default app process = " + zA, new Throwable[0]);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = e0;
        WorkManagerImpl workManagerImpl = this.f8804Y;
        try {
            if (!c()) {
                workManagerImpl.d();
                return;
            }
            while (true) {
                WorkDatabasePathHelper.a(this.X);
                Logger.c().a(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    b();
                    workManagerImpl.d();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e2) {
                    int i2 = this.Z + 1;
                    this.Z = i2;
                    if (i2 >= 3) {
                        Logger.c().b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                        workManagerImpl.f8685b.getClass();
                        throw illegalStateException;
                    }
                    Logger.c().a(str, "Retrying after " + (((long) i2) * 300), e2);
                    try {
                        Thread.sleep(((long) this.Z) * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            workManagerImpl.d();
            throw th;
        }
    }
}
