package transitional;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.apical;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ocellation.arytenoidectomy;
import ocellation.monoploid;
import overassessment.taiyuan;

/* JADX INFO: compiled from: SystemJobScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public class competently implements overassessment.marial {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final String f38919molybdenite = apical.beachfront("SystemJobScheduler");

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final JobScheduler f38920arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Context f38921kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final taiyuan f38922monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final beachfront f38923polloi;

    public competently(Context context, taiyuan taiyuanVar) {
        this(context, taiyuanVar, (JobScheduler) context.getSystemService("jobscheduler"), new beachfront(context));
    }

    public static List<JobInfo> competently(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            apical.dern().saneness(f38919molybdenite, "getAllPendingJobs() is not reliable on this device.", th);
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

    public static String impromptu(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static List<Integer> marial(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listCompetently = competently(context, jobScheduler);
        if (listCompetently == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listCompetently) {
            if (str.equals(impromptu(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static void saneness(Context context) {
        List<JobInfo> listCompetently;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listCompetently = competently(context, jobScheduler)) == null || listCompetently.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = listCompetently.iterator();
        while (it.hasNext()) {
            wireman(jobScheduler, it.next().getId());
        }
    }

    public static boolean taiyuan(Context context, taiyuan taiyuanVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listCompetently = competently(context, jobScheduler);
        List<String> listDern = taiyuanVar.kowloon().preprohormone().dern();
        boolean z = false;
        HashSet hashSet = new HashSet(listCompetently != null ? listCompetently.size() : 0);
        if (listCompetently != null && !listCompetently.isEmpty()) {
            for (JobInfo jobInfo : listCompetently) {
                String strImpromptu = impromptu(jobInfo);
                if (TextUtils.isEmpty(strImpromptu)) {
                    wireman(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(strImpromptu);
                }
            }
        }
        Iterator<String> it = listDern.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                apical.dern().attabal(f38919molybdenite, "Reconciling jobs", new Throwable[0]);
                z = true;
                break;
            }
        }
        if (!z) {
            return z;
        }
        WorkDatabase workDatabaseKowloon = taiyuanVar.kowloon();
        workDatabaseKowloon.dern();
        try {
            monoploid monoploidVarStratoscope = workDatabaseKowloon.stratoscope();
            Iterator<String> it2 = listDern.iterator();
            while (it2.hasNext()) {
                monoploidVarStratoscope.formularize(it2.next(), -1L);
            }
            workDatabaseKowloon.polloi();
            return z;
        } finally {
            workDatabaseKowloon.competently();
        }
    }

    public static void wireman(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            apical.dern().saneness(f38919molybdenite, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Override // overassessment.marial
    public void attabal(String str) {
        List<Integer> listMarial = marial(this.f38921kowloon, this.f38920arytenoidectomy, str);
        if (listMarial == null || listMarial.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listMarial.iterator();
        while (it.hasNext()) {
            wireman(this.f38920arytenoidectomy, it.next().intValue());
        }
        this.f38922monoploid.kowloon().preprohormone().wireman(str);
    }

    @Override // overassessment.marial
    public void beachfront(arytenoidectomy... arytenoidectomyVarArr) {
        WorkDatabase workDatabaseKowloon = this.f38922monoploid.kowloon();
        talweg.dern dernVar = new talweg.dern(workDatabaseKowloon);
        for (arytenoidectomy arytenoidectomyVar : arytenoidectomyVarArr) {
            workDatabaseKowloon.dern();
            try {
                arytenoidectomy arytenoidectomyVarCompetently = workDatabaseKowloon.stratoscope().competently(arytenoidectomyVar.f33999attabal);
                if (arytenoidectomyVarCompetently == null) {
                    apical.dern().impromptu(f38919molybdenite, "Skipping scheduling " + arytenoidectomyVar.f33999attabal + " because it's no longer in the DB", new Throwable[0]);
                    workDatabaseKowloon.polloi();
                } else if (arytenoidectomyVarCompetently.f34011saneness != WorkInfo.State.ENQUEUED) {
                    apical.dern().impromptu(f38919molybdenite, "Skipping scheduling " + arytenoidectomyVar.f33999attabal + " because it is no longer enqueued", new Throwable[0]);
                    workDatabaseKowloon.polloi();
                } else {
                    ocellation.competently competentlyVarSaneness = workDatabaseKowloon.preprohormone().saneness(arytenoidectomyVar.f33999attabal);
                    int iWireman = competentlyVarSaneness != null ? competentlyVarSaneness.f34029saneness : dernVar.wireman(this.f38922monoploid.taiyuan().taiyuan(), this.f38922monoploid.taiyuan().competently());
                    if (competentlyVarSaneness == null) {
                        this.f38922monoploid.kowloon().preprohormone().attabal(new ocellation.competently(arytenoidectomyVar.f33999attabal, iWireman));
                    }
                    cutely(arytenoidectomyVar, iWireman);
                    workDatabaseKowloon.polloi();
                }
                workDatabaseKowloon.competently();
            } catch (Throwable th) {
                workDatabaseKowloon.competently();
                throw th;
            }
        }
    }

    public void cutely(arytenoidectomy arytenoidectomyVar, int i) {
        JobInfo jobInfoAttabal = this.f38923polloi.attabal(arytenoidectomyVar, i);
        apical apicalVarDern = apical.dern();
        String str = f38919molybdenite;
        apicalVarDern.attabal(str, String.format("Scheduling work ID %s Job ID %s", arytenoidectomyVar.f33999attabal, Integer.valueOf(i)), new Throwable[0]);
        try {
            if (this.f38920arytenoidectomy.schedule(jobInfoAttabal) == 0) {
                apical.dern().impromptu(str, String.format("Unable to schedule work ID %s", arytenoidectomyVar.f33999attabal), new Throwable[0]);
                if (arytenoidectomyVar.f34009monoploid && arytenoidectomyVar.f34010polloi == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    arytenoidectomyVar.f34009monoploid = false;
                    apical.dern().attabal(str, String.format("Scheduling a non-expedited job (work ID %s)", arytenoidectomyVar.f33999attabal), new Throwable[0]);
                    cutely(arytenoidectomyVar, i);
                }
            }
        } catch (IllegalStateException e) {
            List<JobInfo> listCompetently = competently(this.f38921kowloon, this.f38920arytenoidectomy);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listCompetently != null ? listCompetently.size() : 0), Integer.valueOf(this.f38922monoploid.kowloon().stratoscope().wireman().size()), Integer.valueOf(this.f38922monoploid.taiyuan().impromptu()));
            apical.dern().saneness(f38919molybdenite, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e);
        } catch (Throwable th) {
            apical.dern().saneness(f38919molybdenite, String.format("Unable to schedule %s", arytenoidectomyVar), th);
        }
    }

    @Override // overassessment.marial
    public boolean dern() {
        return true;
    }

    public competently(Context context, taiyuan taiyuanVar, JobScheduler jobScheduler, beachfront beachfrontVar) {
        this.f38921kowloon = context;
        this.f38922monoploid = taiyuanVar;
        this.f38920arytenoidectomy = jobScheduler;
        this.f38923polloi = beachfrontVar;
    }
}
