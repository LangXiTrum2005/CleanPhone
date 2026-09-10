package gj;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JobInfo f41954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JobScheduler f41955e;

    public n(Context context, ComponentName componentName, int i10) {
        super(componentName);
        b(i10);
        this.f41954d = new JobInfo.Builder(i10, componentName).setOverrideDeadline(0L).build();
        this.f41955e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }

    @Override // gj.o
    public final void a(Intent intent) {
        this.f41955e.enqueue(this.f41954d, new JobWorkItem(intent));
    }
}
