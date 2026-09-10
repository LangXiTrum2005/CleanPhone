package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.os.BuildCompat;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.ContentUriTriggers;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.IdGenerator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobScheduler implements Scheduler {
    public static final String f0 = Logger.e("SystemJobScheduler");
    public final Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final JobScheduler f8719Y;
    public final WorkManagerImpl Z;
    public final SystemJobInfoConverter e0;

    public SystemJobScheduler(Context context, WorkManagerImpl workManagerImpl) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        SystemJobInfoConverter systemJobInfoConverter = new SystemJobInfoConverter(context);
        this.X = context;
        this.Z = workManagerImpl;
        this.f8719Y = jobScheduler;
        this.e0 = systemJobInfoConverter;
    }

    public static void b(JobScheduler jobScheduler, int i2) {
        try {
            jobScheduler.cancel(i2);
        } catch (Throwable th) {
            Logger.c().b(f0, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i2)), th);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            Logger.c().b(f0, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    @Override // androidx.work.impl.Scheduler
    public final void a(String str) {
        String string;
        Context context = this.X;
        JobScheduler jobScheduler = this.f8719Y;
        ArrayList<JobInfo> arrayListE = e(context, jobScheduler);
        ArrayList arrayList = null;
        if (arrayListE != null) {
            ArrayList arrayList2 = new ArrayList(2);
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
                if (str.equals(string)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.Z.f8686c.p().d(str);
    }

    @Override // androidx.work.impl.Scheduler
    public final void c(WorkSpec... workSpecArr) {
        int i2;
        WorkManagerImpl workManagerImpl = this.Z;
        WorkDatabase workDatabase = workManagerImpl.f8686c;
        IdGenerator idGenerator = new IdGenerator(workDatabase);
        for (WorkSpec workSpec : workSpecArr) {
            workDatabase.c();
            try {
                WorkSpec workSpecI = workDatabase.s().i(workSpec.f8776a);
                String str = f0;
                if (workSpecI == null) {
                    Logger.c().f(str, "Skipping scheduling " + workSpec.f8776a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.l();
                } else if (workSpecI.f8777b != WorkInfo.State.X) {
                    Logger.c().f(str, "Skipping scheduling " + workSpec.f8776a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.l();
                } else {
                    SystemIdInfo systemIdInfoA = workDatabase.p().a(workSpec.f8776a);
                    if (systemIdInfoA != null) {
                        i2 = systemIdInfoA.f8764b;
                    } else {
                        workManagerImpl.f8685b.getClass();
                        int i3 = workManagerImpl.f8685b.g;
                        synchronized (IdGenerator.class) {
                            int iA = idGenerator.a("next_job_scheduler_id");
                            if (iA < 0 || iA > i3) {
                                idGenerator.f8806a.o().a(new Preference("next_job_scheduler_id", 1));
                                i2 = 0;
                            } else {
                                i2 = iA;
                            }
                        }
                    }
                    if (systemIdInfoA == null) {
                        workManagerImpl.f8686c.p().c(new SystemIdInfo(workSpec.f8776a, i2));
                    }
                    f(workSpec, i2);
                    workDatabase.l();
                }
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.Scheduler
    public final boolean d() {
        return true;
    }

    public final void f(WorkSpec workSpec, int i2) {
        int i3;
        JobScheduler jobScheduler = this.f8719Y;
        SystemJobInfoConverter systemJobInfoConverter = this.e0;
        systemJobInfoConverter.getClass();
        Constraints constraints = workSpec.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", workSpec.f8776a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", workSpec.c());
        JobInfo.Builder extras = new JobInfo.Builder(i2, systemJobInfoConverter.f8717a).setRequiresCharging(constraints.f8607b).setRequiresDeviceIdle(constraints.f8608c).setExtras(persistableBundle);
        NetworkType networkType = constraints.f8606a;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 || networkType != NetworkType.g0) {
            int iOrdinal = networkType.ordinal();
            if (iOrdinal == 0) {
                i3 = 0;
            } else if (iOrdinal != 1) {
                i3 = 2;
                if (iOrdinal != 2) {
                    i3 = 3;
                    if (iOrdinal != 3) {
                        i3 = 4;
                        if (iOrdinal != 4 || i4 < 26) {
                            Logger.c().a(SystemJobInfoConverter.f8716b, "API version too low. Cannot convert network type value " + networkType, new Throwable[0]);
                            i3 = 1;
                        }
                    }
                }
            } else {
                i3 = 1;
            }
            extras.setRequiredNetworkType(i3);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!constraints.f8608c) {
            extras.setBackoffCriteria(workSpec.m, workSpec.f8782l == BackoffPolicy.f8598Y ? 0 : 1);
        }
        long jMax = Math.max(workSpec.a() - System.currentTimeMillis(), 0L);
        if (i4 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!workSpec.q) {
            extras.setImportantWhileForeground(true);
        }
        if (constraints.f8610h.f8613a.size() > 0) {
            for (ContentUriTriggers.Trigger trigger : constraints.f8610h.f8613a) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(trigger.f8614a, trigger.f8615b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(constraints.f);
            extras.setTriggerContentMaxDelay(constraints.g);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(constraints.d);
            extras.setRequiresStorageNotLow(constraints.f8609e);
        }
        boolean z2 = workSpec.k > 0;
        if (BuildCompat.b() && workSpec.q && !z2) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        Logger loggerC = Logger.c();
        String str = workSpec.f8776a;
        String str2 = f0;
        loggerC.a(str2, "Scheduling work ID " + str + " Job ID " + i2, new Throwable[0]);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                Logger.c().f(str2, "Unable to schedule work ID " + workSpec.f8776a, new Throwable[0]);
                if (workSpec.q && workSpec.r == OutOfQuotaPolicy.X) {
                    workSpec.q = false;
                    Logger.c().a(str2, "Scheduling a non-expedited job (work ID " + workSpec.f8776a + ")", new Throwable[0]);
                    f(workSpec, i2);
                }
            }
        } catch (IllegalStateException e2) {
            ArrayList arrayListE = e(this.X, jobScheduler);
            int size = arrayListE != null ? arrayListE.size() : 0;
            Locale locale = Locale.getDefault();
            Integer numValueOf = Integer.valueOf(size);
            WorkManagerImpl workManagerImpl = this.Z;
            String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", numValueOf, Integer.valueOf(workManagerImpl.f8686c.s().g().size()), Integer.valueOf(workManagerImpl.f8685b.f8603h));
            Logger.c().b(str2, str3, new Throwable[0]);
            throw new IllegalStateException(str3, e2);
        } catch (Throwable th) {
            Logger.c().b(str2, "Unable to schedule " + workSpec, th);
        }
    }
}
