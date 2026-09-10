package gj;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends JobServiceEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.flutter.plugins.firebase.messaging.a f41951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f41952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JobParameters f41953c;

    public m(io.flutter.plugins.firebase.messaging.a aVar) {
        super(aVar);
        this.f41952b = new Object();
        this.f41951a = aVar;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.f41953c = jobParameters;
        this.f41951a.a(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        v9.e eVar = this.f41951a.f43408c;
        if (eVar != null) {
            ((io.flutter.plugins.firebase.messaging.a) eVar.f52504c).c();
        }
        synchronized (this.f41952b) {
            this.f41953c = null;
        }
        return true;
    }
}
