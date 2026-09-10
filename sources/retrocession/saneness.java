package retrocession;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: compiled from: JobInfoScheduler.java */
/* JADX INFO: loaded from: classes2.dex */
public class saneness implements adultoid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f36427attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final SchedulerConfig f36428dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.persistence.wireman f36429saneness;

    public saneness(Context context, com.google.android.datatransport.runtime.scheduling.persistence.wireman wiremanVar, SchedulerConfig schedulerConfig) {
        this.f36427attabal = context;
        this.f36429saneness = wiremanVar;
        this.f36428dern = schedulerConfig;
    }

    @Override // retrocession.adultoid
    public void attabal(lehua.arytenoidectomy arytenoidectomyVar, int i) {
        saneness(arytenoidectomyVar, i, false);
    }

    public int dern(lehua.arytenoidectomy arytenoidectomyVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f36427attabal.getPackageName().getBytes(Charset.forName(C.UTF8_NAME)));
        adler32.update(arytenoidectomyVar.saneness().getBytes(Charset.forName(C.UTF8_NAME)));
        adler32.update(ByteBuffer.allocate(4).putInt(delphology.attabal.attabal(arytenoidectomyVar.wireman())).array());
        if (arytenoidectomyVar.dern() != null) {
            adler32.update(arytenoidectomyVar.dern());
        }
        return (int) adler32.getValue();
    }

    @Override // retrocession.adultoid
    public void saneness(lehua.arytenoidectomy arytenoidectomyVar, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f36427attabal, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f36427attabal.getSystemService("jobscheduler");
        int iDern = dern(arytenoidectomyVar);
        if (!z && wireman(jobScheduler, iDern, i)) {
            unliveable.attabal.saneness("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", arytenoidectomyVar);
            return;
        }
        long jGrimness = this.f36429saneness.grimness(arytenoidectomyVar);
        JobInfo.Builder builderDern = this.f36428dern.dern(new JobInfo.Builder(iDern, componentName), arytenoidectomyVar.wireman(), jGrimness, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", arytenoidectomyVar.saneness());
        persistableBundle.putInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, delphology.attabal.attabal(arytenoidectomyVar.wireman()));
        if (arytenoidectomyVar.dern() != null) {
            persistableBundle.putString(HandleInvocationsFromAdViewer.KEY_EXTRAS, Base64.encodeToString(arytenoidectomyVar.dern(), 0));
        }
        builderDern.setExtras(persistableBundle);
        unliveable.attabal.dern("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", arytenoidectomyVar, Integer.valueOf(iDern), Long.valueOf(this.f36428dern.competently(arytenoidectomyVar.wireman(), jGrimness, i)), Long.valueOf(jGrimness), Integer.valueOf(i));
        jobScheduler.schedule(builderDern.build());
    }

    public final boolean wireman(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
            }
        }
        return false;
    }
}
