package com.smartdigimkt.sdk.basead.exoplayer.scheduler;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.smartdigimkt.i4.a;
import com.smartdigimkt.i4.c;
import com.smartdigimkt.p4.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class PlatformScheduler implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f38250e = "PlatformScheduler";
    private static final String f = "service_action";
    private static final String g = "service_package";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f38251h = "requirements";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentName f38253c;
    private final JobScheduler d;

    public static final class PlatformSchedulerService extends JobService {
        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            PlatformScheduler.b("PlatformSchedulerService started");
            PersistableBundle extras = jobParameters.getExtras();
            if (!new a(extras.getInt("requirements")).d(this)) {
                PlatformScheduler.b("Requirements are not met");
                jobFinished(jobParameters, true);
                return false;
            }
            PlatformScheduler.b("Requirements are met");
            String string = extras.getString(PlatformScheduler.f);
            String string2 = extras.getString(PlatformScheduler.g);
            Intent intent = new Intent(string).setPackage(string2);
            PlatformScheduler.b("Starting service action: " + string + " package: " + string2);
            f0.a((Context) this, intent);
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    public PlatformScheduler(Context context, int i2) {
        this.f38252b = i2;
        this.f38253c = new ComponentName(context, (Class<?>) PlatformSchedulerService.class);
        this.d = (JobScheduler) context.getSystemService("jobscheduler");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str) {
    }

    @Override // com.smartdigimkt.i4.c
    public boolean cancel() {
        b("Canceling job: " + this.f38252b);
        this.d.cancel(this.f38252b);
        return true;
    }

    @Override // com.smartdigimkt.i4.c
    public boolean a(a aVar, String str, String str2) {
        int iSchedule = this.d.schedule(a(this.f38252b, this.f38253c, aVar, str2, str));
        b("Scheduling job: " + this.f38252b + " result: " + iSchedule);
        return iSchedule == 1;
    }

    private static JobInfo a(int i2, ComponentName componentName, a aVar, String str, String str2) {
        int i3;
        JobInfo.Builder builder = new JobInfo.Builder(i2, componentName);
        int iA = aVar.a();
        if (iA == 0) {
            i3 = 0;
        } else if (iA != 1) {
            i3 = 2;
            if (iA != 2) {
                i3 = 3;
                if (iA != 3) {
                    i3 = 4;
                    if (iA == 4) {
                        if (f0.f37540a < 26) {
                            throw new UnsupportedOperationException();
                        }
                    } else {
                        throw new UnsupportedOperationException();
                    }
                } else if (f0.f37540a < 24) {
                    throw new UnsupportedOperationException();
                }
            }
        } else {
            i3 = 1;
        }
        builder.setRequiredNetworkType(i3);
        builder.setRequiresDeviceIdle(aVar.d());
        builder.setRequiresCharging(aVar.c());
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f, str);
        persistableBundle.putString(g, str2);
        persistableBundle.putInt("requirements", aVar.b());
        builder.setExtras(persistableBundle);
        return builder.build();
    }
}
