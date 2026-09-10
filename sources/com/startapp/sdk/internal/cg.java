package com.startapp.sdk.internal;

import android.app.job.JobParameters;
import com.startapp.sdk.jobs.SchedulerService;

/* JADX INFO: loaded from: classes6.dex */
public final class cg implements bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JobParameters f40880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SchedulerService f40881b;

    public cg(SchedulerService schedulerService, JobParameters jobParameters) {
        this.f40881b = schedulerService;
        this.f40880a = jobParameters;
    }

    @Override // com.startapp.sdk.internal.bb
    public final void a() {
        this.f40881b.jobFinished(this.f40880a, false);
    }
}
