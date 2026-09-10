package gj;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JobWorkItem f41949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f41950b;

    public l(m mVar, JobWorkItem jobWorkItem) {
        this.f41950b = mVar;
        this.f41949a = jobWorkItem;
    }

    @Override // gj.k
    public final void a() {
        synchronized (this.f41950b.f41952b) {
            JobParameters jobParameters = this.f41950b.f41953c;
            if (jobParameters != null) {
                try {
                    jobParameters.completeWork(this.f41949a);
                } catch (IllegalArgumentException e10) {
                    Log.e("JobServiceEngineImpl", "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!", e10);
                } catch (SecurityException e11) {
                    Log.e("JobServiceEngineImpl", "SecurityException: Failed to run mParams.completeWork(mJobWork)!", e11);
                }
            }
        }
    }

    @Override // gj.k
    public final Intent getIntent() {
        return this.f41949a.getIntent();
    }
}
