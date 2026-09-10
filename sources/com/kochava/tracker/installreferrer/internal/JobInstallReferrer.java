package com.kochava.tracker.installreferrer.internal;

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
import com.kochava.tracker.init.internal.InitResponseInstallReferrer;
import com.kochava.tracker.profile.internal.Profile;

/* JADX INFO: loaded from: classes5.dex */
public final class JobInstallReferrer extends Job implements InstallReferrerRetrievedListener {
    public static final ClassLoggerApi p0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "JobInstallReferrer");
    public final Profile n0;
    public final InstanceState o0;

    public JobInstallReferrer(Controller controller, Profile profile, InstanceState instanceState) {
        super("JobInstallReferrer", instanceState.f28117c, TaskQueue.IO, controller);
        this.n0 = profile;
        this.o0 = instanceState;
    }

    @Override // com.kochava.tracker.installreferrer.internal.InstallReferrerRetrievedListener
    public final void f(InstallReferrer installReferrer) {
        InitResponseInstallReferrer initResponseInstallReferrer = ((InitResponse) this.n0.k().b()).g;
        if (!w()) {
            n(true);
            return;
        }
        InstallReferrerStatus installReferrerStatus = InstallReferrerStatus.Ok;
        InstallReferrerStatus installReferrerStatus2 = installReferrer.f28239c;
        if (installReferrerStatus2 == installReferrerStatus || installReferrerStatus2 == InstallReferrerStatus.FeatureNotSupported || installReferrerStatus2 == InstallReferrerStatus.MissingDependency || this.j0 >= initResponseInstallReferrer.f28204b + 1) {
            this.n0.l().s(installReferrer);
            n(true);
            return;
        }
        p0.d("Gather failed, retrying in " + (TimeUtil.b(initResponseInstallReferrer.f28205c) / 1000.0d) + " seconds");
        s(TimeUtil.b(initResponseInstallReferrer.f28205c));
    }

    @Override // com.kochava.core.job.internal.Job
    public final void p() {
        ClassLoggerApi classLoggerApi = p0;
        classLoggerApi.a("Started at " + TimeUtil.c(this.o0.f28115a) + " seconds");
        if (!ReflectionUtil.b("com.android.installreferrer.api.InstallReferrerClient")) {
            classLoggerApi.d("Google Install Referrer library is missing from the app, skipping collection");
            this.n0.l().s(new InstallReferrer(1, 0.0d, InstallReferrerStatus.MissingDependency, null, null, null, null, null, null, null));
            return;
        }
        InitResponseInstallReferrer initResponseInstallReferrer = ((InitResponse) this.n0.k().b()).g;
        InstanceState instanceState = this.o0;
        InstallReferrerHelper installReferrerHelper = new InstallReferrerHelper(instanceState.f28116b, instanceState.f28117c, this, this.j0, this.h0, TimeUtil.b(initResponseInstallReferrer.d));
        u();
        synchronized (installReferrerHelper) {
            installReferrerHelper.g0.start();
            installReferrerHelper.h0.a(installReferrerHelper.f0);
        }
    }

    @Override // com.kochava.core.job.internal.Job
    public final long t() {
        return 0L;
    }

    @Override // com.kochava.core.job.internal.Job
    public final boolean v() {
        Profile profile = this.n0;
        InitResponseInstallReferrer initResponseInstallReferrer = ((InitResponse) profile.k().b()).g;
        InstanceState instanceState = this.o0;
        synchronized (instanceState.f) {
        }
        if (instanceState.f.f() || !initResponseInstallReferrer.f28203a) {
            return false;
        }
        InstallReferrerApi installReferrerApiE = profile.l().e();
        if (installReferrerApiE != null) {
            return ((InstallReferrer) installReferrerApiE).f28239c == InstallReferrerStatus.NotGathered;
        }
        return true;
    }
}
