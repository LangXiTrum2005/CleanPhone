package h5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import d5.o;
import e5.c;
import e5.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m5.d;
import m5.i;
import n5.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f42211e = o.i("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f42212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JobScheduler f42213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f42214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f42215d;

    public b(Context context, l lVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f42212a = context;
        this.f42214c = lVar;
        this.f42213b = jobScheduler;
        this.f42215d = aVar;
    }

    public static void c(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            o.g().f(f42211e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            o.g().f(f42211e, "getAllPendingJobs() is not reliable on this device.", th2);
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

    @Override // e5.c
    public final void a(i... iVarArr) {
        int iT;
        l lVar = this.f42214c;
        WorkDatabase workDatabase = lVar.f39111c;
        f fVar = new f(workDatabase, 0);
        for (i iVar : iVarArr) {
            workDatabase.c();
            try {
                i iVarL = workDatabase.n().l(iVar.f45882a);
                String str = f42211e;
                if (iVarL == null) {
                    o.g().k(str, "Skipping scheduling " + iVar.f45882a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.h();
                } else if (iVarL.f45883b != 1) {
                    o.g().k(str, "Skipping scheduling " + iVar.f45882a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.h();
                } else {
                    d dVarW = workDatabase.k().w(iVar.f45882a);
                    if (dVarW != null) {
                        iT = dVarW.f45875b;
                    } else {
                        lVar.f39110b.getClass();
                        iT = fVar.t(lVar.f39110b.f15994b);
                    }
                    if (dVarW == null) {
                        lVar.f39111c.k().y(new d(iVar.f45882a, iT));
                    }
                    f(iVar, iT);
                    workDatabase.h();
                }
                workDatabase.f();
            } catch (Throwable th2) {
                workDatabase.f();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    @Override // e5.c
    public final void b(String str) {
        String string;
        Context context = this.f42212a;
        JobScheduler jobScheduler = this.f42213b;
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
            c(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.f42214c.f39111c.k().C(str);
    }

    @Override // e5.c
    public final boolean d() {
        return true;
    }

    public final void f(i iVar, int i10) {
        JobScheduler jobScheduler = this.f42213b;
        JobInfo jobInfoA = this.f42215d.a(iVar, i10);
        o oVarG = o.g();
        String str = iVar.f45882a;
        String str2 = f42211e;
        oVarG.e(str2, "Scheduling work ID " + str + " Job ID " + i10, new Throwable[0]);
        try {
            if (jobScheduler.schedule(jobInfoA) == 0) {
                o.g().k(str2, "Unable to schedule work ID " + iVar.f45882a, new Throwable[0]);
                if (iVar.f45897q && iVar.f45898r == 1) {
                    iVar.f45897q = false;
                    o.g().e(str2, "Scheduling a non-expedited job (work ID " + iVar.f45882a + ")", new Throwable[0]);
                    f(iVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList arrayListE = e(this.f42212a, jobScheduler);
            int size = arrayListE != null ? arrayListE.size() : 0;
            Locale locale = Locale.getDefault();
            Integer numValueOf = Integer.valueOf(size);
            l lVar = this.f42214c;
            String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", numValueOf, Integer.valueOf(lVar.f39111c.n().g().size()), Integer.valueOf(lVar.f39110b.f15995c));
            o.g().f(str2, str3, new Throwable[0]);
            throw new IllegalStateException(str3, e10);
        } catch (Throwable th2) {
            o.g().f(str2, "Unable to schedule " + iVar, th2);
        }
    }
}
