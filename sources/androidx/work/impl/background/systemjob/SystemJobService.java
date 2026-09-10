package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import d5.o;
import e5.a;
import e5.b;
import e5.l;
import java.util.Arrays;
import java.util.HashMap;
import v9.e;
import wi.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f5034c = o.i("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f5035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f5036b = new HashMap();

    @Override // e5.a
    public final void e(String str, boolean z10) {
        JobParameters jobParameters;
        o.g().e(f5034c, d.h(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.f5036b) {
            jobParameters = (JobParameters) this.f5036b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            l lVarB = l.b(getApplicationContext());
            this.f5035a = lVarB;
            lVarB.f39114f.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            o.g().k(f5034c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        l lVar = this.f5035a;
        if (lVar != null) {
            lVar.f39114f.d(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string;
        if (this.f5035a == null) {
            o.g().e(f5034c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
        }
        if (TextUtils.isEmpty(string)) {
            o.g().f(f5034c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f5036b) {
            try {
                if (this.f5036b.containsKey(string)) {
                    o.g().e(f5034c, "Job is already being executed by SystemJobService: " + string, new Throwable[0]);
                    return false;
                }
                o.g().e(f5034c, "onStartJob for " + string, new Throwable[0]);
                this.f5036b.put(string, jobParameters);
                e eVar = new e(9);
                if (jobParameters.getTriggeredContentUris() != null) {
                    eVar.f52504c = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    eVar.f52503b = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                eVar.f52505d = jobParameters.getNetwork();
                this.f5035a.f(string, eVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        String string;
        boolean zContains;
        if (this.f5035a == null) {
            o.g().e(f5034c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
        }
        if (TextUtils.isEmpty(string)) {
            o.g().f(f5034c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        o.g().e(f5034c, defpackage.e.n("onStopJob for ", string), new Throwable[0]);
        synchronized (this.f5036b) {
            this.f5036b.remove(string);
        }
        this.f5035a.g(string);
        b bVar = this.f5035a.f39114f;
        synchronized (bVar.f39085k) {
            zContains = bVar.f39083i.contains(string);
        }
        return !zContains;
    }
}
