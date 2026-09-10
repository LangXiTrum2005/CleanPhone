package n5;

import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f46516d = d5.o.i("ForceStopRunnable");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f46517e = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e5.l f46519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46520c = 0;

    public e(Context context, e5.l lVar) {
        this.f46518a = context.getApplicationContext();
        this.f46519b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    public final void a() {
        boolean z10;
        String string;
        String str = h5.b.f42211e;
        Context context = this.f46518a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList<JobInfo> arrayListE = h5.b.e(context, jobScheduler);
        e5.l lVar = this.f46519b;
        g9.k kVarK = lVar.f39111c.k();
        kVarK.getClass();
        g4.h hVarB = g4.h.b(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) kVarK.f41770b;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(hVarB);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            hVarB.k();
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
                        h5.b.c(jobScheduler, jobInfo.getId());
                    } else {
                        hashSet.add(string);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!hashSet.contains((String) it.next())) {
                        d5.o.g().e(h5.b.f42211e, "Reconciling jobs", new Throwable[0]);
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                WorkDatabase workDatabase = lVar.f39111c;
                workDatabase.c();
                try {
                    com.google.android.gms.internal.consent_sdk.d dVarN = workDatabase.n();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        dVarN.p(-1L, (String) it2.next());
                    }
                    workDatabase.h();
                    workDatabase.f();
                } catch (Throwable th2) {
                    workDatabase.f();
                    throw th2;
                }
            }
            WorkDatabase workDatabase2 = lVar.f39111c;
            com.google.android.gms.internal.consent_sdk.d dVarN2 = workDatabase2.n();
            u uVarM = workDatabase2.m();
            workDatabase2.c();
            try {
                ArrayList<m5.i> arrayListF = dVarN2.f();
                boolean zIsEmpty = arrayListF.isEmpty();
                if (!zIsEmpty) {
                    for (m5.i iVar : arrayListF) {
                        dVarN2.t(1, iVar.f45882a);
                        dVarN2.p(-1L, iVar.f45882a);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) uVarM.f54879b;
                workDatabase_Impl2.b();
                m5.e eVar = (m5.e) uVarM.f54882e;
                l4.f fVarA = eVar.a();
                workDatabase_Impl2.c();
                try {
                    fVarA.t();
                    workDatabase_Impl2.h();
                    workDatabase_Impl2.f();
                    eVar.c(fVarA);
                    workDatabase2.h();
                    workDatabase2.f();
                    boolean z11 = !zIsEmpty || z10;
                    Long lN = ((WorkDatabase) lVar.f39115g.f50111a).j().n("reschedule_needed");
                    String str2 = f46516d;
                    if (lN != null && lN.longValue() == 1) {
                        d5.o.g().e(str2, "Rescheduling Workers.", new Throwable[0]);
                        lVar.e();
                        s4.i iVar2 = lVar.f39115g;
                        iVar2.getClass();
                        ((WorkDatabase) iVar2.f50111a).j().r(new m5.c("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        int i10 = i0.c.b() ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                                if (historicalProcessExitReasons.get(i11).getReason() == 10) {
                                    d5.o.g().e(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                                    lVar.e();
                                    return;
                                }
                            }
                        }
                        if (z11) {
                            d5.o.g().e(str2, "Found unfinished work, scheduling it.", new Throwable[0]);
                            e5.d.a(lVar.f39110b, lVar.f39111c, lVar.f39113e);
                        }
                    } catch (IllegalArgumentException | SecurityException e10) {
                        d5.o.g().k(str2, "Ignoring exception", e10);
                    }
                } catch (Throwable th3) {
                    workDatabase_Impl2.f();
                    eVar.c(fVarA);
                    throw th3;
                }
            } catch (Throwable th4) {
                workDatabase2.f();
                throw th4;
            }
        } catch (Throwable th5) {
            cursorG.close();
            hVarB.k();
            throw th5;
        }
    }

    public final boolean b() {
        this.f46519b.f39110b.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f46516d;
        if (zIsEmpty) {
            d5.o.g().e(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        int i10 = h.f46525a;
        String processName = Application.getProcessName();
        boolean zEquals = !TextUtils.isEmpty(null) ? TextUtils.equals(processName, null) : TextUtils.equals(processName, this.f46518a.getApplicationInfo().processName);
        d5.o.g().e(str, "Is default app process = " + zEquals, new Throwable[0]);
        return zEquals;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f46516d;
        e5.l lVar = this.f46519b;
        try {
            if (!b()) {
                lVar.d();
                return;
            }
            while (true) {
                e5.k.a(this.f46518a);
                d5.o.g().e(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    lVar.d();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                    int i10 = this.f46520c + 1;
                    this.f46520c = i10;
                    if (i10 >= 3) {
                        d5.o.g().f(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        lVar.f39110b.getClass();
                        throw illegalStateException;
                    }
                    long j10 = ((long) i10) * 300;
                    d5.o.g().e(str, "Retrying after " + j10, e10);
                    try {
                        Thread.sleep(((long) this.f46520c) * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (Throwable th2) {
            lVar.d();
            throw th2;
        }
    }
}
