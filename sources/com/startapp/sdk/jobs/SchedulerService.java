package com.startapp.sdk.jobs;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.startapp.sdk.internal.cg;
import com.startapp.sdk.internal.v5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class SchedulerService extends JobService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ExecutorService f41789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f41790b = new a(this);

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f41789a = Executors.newSingleThreadExecutor(new v5("scheduler"));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.f41789a;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        Bundle bundle;
        if (this.f41789a == null) {
            return false;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras.containsKey("extraKeyDuplicate")) {
            return false;
        }
        PersistableBundle persistableBundle = extras.getPersistableBundle("extraKeyBundle");
        if (persistableBundle != null) {
            bundle = new Bundle();
            bundle.putAll(persistableBundle);
        } else {
            bundle = null;
        }
        return this.f41790b.a(this, extras.getStringArray("extraKeyTags"), new cg(this, jobParameters), bundle);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
