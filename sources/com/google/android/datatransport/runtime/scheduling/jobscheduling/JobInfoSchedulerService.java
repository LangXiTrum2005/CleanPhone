package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import b9.a;
import com.applovin.impl.sdk.c0;
import com.google.android.gms.internal.consent_sdk.d;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.Executor;
import r1.s;
import r8.i;
import r8.p;
import w1.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10615a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        int i10 = jobParameters.getExtras().getInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        p.b(getApplicationContext());
        s sVarA = i.a();
        sVarA.n(string);
        sVarA.f49340d = a.b(i10);
        if (string2 != null) {
            sVarA.f49339c = Base64.decode(string2, 0);
        }
        d dVar = p.a().f49509d;
        ((Executor) dVar.f22985e).execute(new c0(dVar, sVarA.c(), i11, new b(2, this, jobParameters), 2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
