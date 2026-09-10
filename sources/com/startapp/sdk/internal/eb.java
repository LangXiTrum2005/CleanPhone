package com.startapp.sdk.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.startapp.sdk.jobs.JobRequest$Network;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class eb implements bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JobScheduler f40932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f40933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40934c;

    public eb(Context context, Class cls) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            throw new IllegalStateException();
        }
        this.f40932a = jobScheduler;
        this.f40933b = new ComponentName(context, (Class<?>) cls);
        this.f40934c = q0.a(context, "android.permission.RECEIVE_BOOT_COMPLETED");
    }

    @Override // com.startapp.sdk.internal.bg
    public final boolean a(ge geVar, long j) {
        int i2;
        JobInfo.Builder builder = new JobInfo.Builder(Math.abs(Arrays.hashCode(geVar.f41011a)), this.f40933b);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("extraKeyUuid", geVar.f41012b.toString());
        persistableBundle.putStringArray("extraKeyTags", geVar.f41011a);
        builder.setExtras(persistableBundle);
        JobRequest$Network jobRequest$Network = geVar.f41013c;
        if (jobRequest$Network != null) {
            if (jobRequest$Network == JobRequest$Network.UNMETERED) {
                i2 = 2;
            } else {
                i2 = jobRequest$Network == JobRequest$Network.ANY ? 1 : 0;
            }
            builder.setRequiredNetworkType(i2);
        }
        if (this.f40934c) {
            builder.setPersisted(true);
        }
        try {
            return this.f40932a.schedule(builder.setPeriodic(j, JobInfo.getMinFlexMillis()).build()) == 1;
        } catch (Throwable unused) {
        }
    }

    public final ArrayList a() {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = this.f40932a.getAllPendingJobs();
        } catch (Throwable unused) {
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        for (JobInfo jobInfo : allPendingJobs) {
            if (this.f40933b.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // com.startapp.sdk.internal.bg
    public final boolean a(int i2) {
        ArrayList arrayListA = a();
        if (arrayListA == null) {
            return false;
        }
        try {
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                if (((JobInfo) it.next()).getId() == i2) {
                    this.f40932a.cancel(i2);
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
