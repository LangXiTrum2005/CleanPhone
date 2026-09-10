package androidx.media3.exoplayer.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;
import decarock.attabal;
import decarock.grimness;
import decarock.triweekly;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformScheduler$PlatformSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        int iSaneness = new Requirements(extras.getInt("requirements")).saneness(this);
        if (iSaneness == 0) {
            grimness.microchemistry(this, new Intent((String) attabal.marial(extras.getString("service_action"))).setPackage((String) attabal.marial(extras.getString("service_package"))));
            return false;
        }
        triweekly.impromptu("PlatformScheduler", "Requirements not met: " + iSaneness);
        jobFinished(jobParameters, true);
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
