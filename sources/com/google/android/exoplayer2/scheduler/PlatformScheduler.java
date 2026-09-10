package com.google.android.exoplayer2.scheduler;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.applovin.impl.Z;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class PlatformScheduler implements Scheduler {
    public static final int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f18304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JobScheduler f18305c;

    public static final class PlatformSchedulerService extends JobService {
        @Override // android.app.job.JobService
        public final boolean onStartJob(JobParameters jobParameters) {
            PersistableBundle extras = jobParameters.getExtras();
            int iA = new Requirements(extras.getInt(DownloadService.KEY_REQUIREMENTS)).a(this);
            if (iA != 0) {
                Z.s(iA, "Requirements not met: ", "PlatformScheduler");
                jobFinished(jobParameters, true);
                return false;
            }
            String string = extras.getString("service_action");
            string.getClass();
            String string2 = extras.getString("service_package");
            string2.getClass();
            Util.H(this, new Intent(string).setPackage(string2));
            return false;
        }

        @Override // android.app.job.JobService
        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    static {
        d = (Util.f18979a >= 26 ? 16 : 0) | 15;
    }

    public PlatformScheduler(Context context, int i2) {
        Context applicationContext = context.getApplicationContext();
        this.f18303a = i2;
        this.f18304b = new ComponentName(applicationContext, (Class<?>) PlatformSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) applicationContext.getSystemService("jobscheduler");
        jobScheduler.getClass();
        this.f18305c = jobScheduler;
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public final boolean a(Requirements requirements, String str) {
        int i2 = requirements.X;
        int i3 = d & i2;
        Requirements requirements2 = i3 == i2 ? requirements : new Requirements(i3);
        boolean zEquals = requirements2.equals(requirements);
        int i4 = requirements.X;
        if (!zEquals) {
            Log.g("PlatformScheduler", "Ignoring unsupported requirements: " + (requirements2.X ^ i4));
        }
        JobInfo.Builder builder = new JobInfo.Builder(this.f18303a, this.f18304b);
        if ((i4 & 2) != 0) {
            builder.setRequiredNetworkType(2);
        } else if ((i4 & 1) != 0) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle((i4 & 4) != 0);
        builder.setRequiresCharging((i4 & 8) != 0);
        if (Util.f18979a >= 26 && (i4 & 16) != 0) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("service_action", "com.google.android.exoplayer.downloadService.action.RESTART");
        persistableBundle.putString("service_package", str);
        persistableBundle.putInt(DownloadService.KEY_REQUIREMENTS, i4);
        builder.setExtras(persistableBundle);
        return this.f18305c.schedule(builder.build()) == 1;
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public final Requirements b(Requirements requirements) {
        int i2 = requirements.X;
        int i3 = d & i2;
        return i3 == i2 ? requirements : new Requirements(i3);
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public final void cancel() {
        this.f18305c.cancel(this.f18303a);
    }
}
