package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes3.dex */
public class JobInfoScheduler implements WorkScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EventStore f16919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SchedulerConfig f16920c;

    public JobInfoScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig) {
        this.f16918a = context;
        this.f16919b = eventStore;
        this.f16920c = schedulerConfig;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public final void a(TransportContext transportContext, int i2) {
        b(transportContext, i2, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public final void b(TransportContext transportContext, int i2, boolean z2) {
        Context context = this.f16918a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(transportContext.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(PriorityMapping.a(transportContext.d())).array());
        if (transportContext.c() != null) {
            adler32.update(transportContext.c());
        }
        int value = (int) adler32.getValue();
        if (!z2) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i3 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i3 < i2) {
                        break;
                    }
                    Logging.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", transportContext);
                    return;
                }
            }
        }
        long jX = this.f16919b.X(transportContext);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        Priority priorityD = transportContext.d();
        SchedulerConfig schedulerConfig = this.f16920c;
        builder.setMinimumLatency(schedulerConfig.c(priorityD, jX, i2));
        Set setB = ((SchedulerConfig.ConfigValue) schedulerConfig.d().get(priorityD)).b();
        if (setB.contains(SchedulerConfig.Flag.X)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (setB.contains(SchedulerConfig.Flag.Z)) {
            builder.setRequiresCharging(true);
        }
        if (setB.contains(SchedulerConfig.Flag.f16923Y)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i2);
        persistableBundle.putString("backendName", transportContext.b());
        persistableBundle.putInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, PriorityMapping.a(transportContext.d()));
        if (transportContext.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(transportContext.c(), 0));
        }
        builder.setExtras(persistableBundle);
        Logging.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Integer.valueOf(value), Long.valueOf(schedulerConfig.c(transportContext.d(), jX, i2)), Long.valueOf(jX), Integer.valueOf(i2));
        jobScheduler.schedule(builder.build());
    }
}
