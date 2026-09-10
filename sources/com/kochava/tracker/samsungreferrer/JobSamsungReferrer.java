package com.kochava.tracker.samsungreferrer;

import com.kochava.core.job.internal.Job;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.util.internal.ReflectionUtil;
import com.kochava.core.util.internal.TimeUtil;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.controller.internal.Controller;
import com.kochava.tracker.controller.internal.InstanceState;
import com.kochava.tracker.init.internal.InitResponse;
import com.kochava.tracker.init.internal.InitResponseSamsungReferrer;
import com.kochava.tracker.profile.internal.Profile;

/* JADX INFO: loaded from: classes5.dex */
public final class JobSamsungReferrer extends Job implements SamsungReferrerRetrievedListener {
    public static final ClassLoggerApi p0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "JobSamsungReferrer");
    public final Profile n0;
    public final InstanceState o0;

    public JobSamsungReferrer(Controller controller, Profile profile, InstanceState instanceState) {
        super("JobSamsungReferrer", instanceState.f28117c, TaskQueue.IO, controller);
        this.n0 = profile;
        this.o0 = instanceState;
    }

    @Override // com.kochava.tracker.samsungreferrer.SamsungReferrerRetrievedListener
    public final void e(SamsungReferrer samsungReferrer) {
        InitResponseSamsungReferrer initResponseSamsungReferrer = ((InitResponse) this.n0.k().b()).m;
        if (!w()) {
            n(true);
            return;
        }
        SamsungReferrerStatus samsungReferrerStatus = SamsungReferrerStatus.Ok;
        SamsungReferrerStatus samsungReferrerStatus2 = samsungReferrer.d;
        if (samsungReferrerStatus2 == samsungReferrerStatus || samsungReferrerStatus2 == SamsungReferrerStatus.NoData || samsungReferrerStatus2 == SamsungReferrerStatus.FeatureNotSupported || samsungReferrerStatus2 == SamsungReferrerStatus.MissingDependency || this.j0 >= initResponseSamsungReferrer.f28227b + 1) {
            this.n0.l().v(samsungReferrer);
            n(true);
            return;
        }
        p0.d("Gather failed, retrying in " + (TimeUtil.b(initResponseSamsungReferrer.f28228c) / 1000.0d) + " seconds");
        s(TimeUtil.b(initResponseSamsungReferrer.f28228c));
    }

    @Override // com.kochava.core.job.internal.Job
    public final void p() {
        ClassLoggerApi classLoggerApi = p0;
        classLoggerApi.a("Started at " + TimeUtil.c(this.o0.f28115a) + " seconds");
        if (!ReflectionUtil.b("com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerClient")) {
            classLoggerApi.d("Samsung Install Referrer library is missing from the app, skipping collection");
            this.n0.l().v(new SamsungReferrer(System.currentTimeMillis(), 1, 0.0d, SamsungReferrerStatus.MissingDependency, null, null, null));
            return;
        }
        InitResponseSamsungReferrer initResponseSamsungReferrer = ((InitResponse) this.n0.k().b()).m;
        InstanceState instanceState = this.o0;
        SamsungReferrerHelper samsungReferrerHelper = new SamsungReferrerHelper(instanceState.f28116b, instanceState.f28117c, this, this.j0, this.h0, TimeUtil.b(initResponseSamsungReferrer.d));
        u();
        synchronized (samsungReferrerHelper) {
            samsungReferrerHelper.g0.start();
            samsungReferrerHelper.h0.a(samsungReferrerHelper.f0);
        }
    }

    @Override // com.kochava.core.job.internal.Job
    public final long t() {
        return 0L;
    }

    @Override // com.kochava.core.job.internal.Job
    public final boolean v() {
        Profile profile = this.n0;
        InitResponseSamsungReferrer initResponseSamsungReferrer = ((InitResponse) profile.k().b()).m;
        InstanceState instanceState = this.o0;
        synchronized (instanceState.f) {
        }
        if (instanceState.f.f() || !initResponseSamsungReferrer.f28226a) {
            return false;
        }
        SamsungReferrerApi samsungReferrerApiH = profile.l().h();
        if (samsungReferrerApiH != null) {
            return ((SamsungReferrer) samsungReferrerApiH).d == SamsungReferrerStatus.NotGathered;
        }
        return true;
    }
}
