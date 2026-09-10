package com.kochava.tracker.huaweireferrer.internal;

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
import com.kochava.tracker.init.internal.InitResponseHuaweiReferrer;
import com.kochava.tracker.profile.internal.Profile;

/* JADX INFO: loaded from: classes5.dex */
public final class JobHuaweiReferrer extends Job implements HuaweiReferrerRetrievedListener {
    public static final ClassLoggerApi p0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "JobHuaweiReferrer");
    public final Profile n0;
    public final InstanceState o0;

    public JobHuaweiReferrer(Controller controller, Profile profile, InstanceState instanceState) {
        super("JobHuaweiReferrer", instanceState.f28117c, TaskQueue.IO, controller);
        this.n0 = profile;
        this.o0 = instanceState;
    }

    @Override // com.kochava.tracker.huaweireferrer.internal.HuaweiReferrerRetrievedListener
    public final void a(HuaweiReferrer huaweiReferrer) {
        InitResponseHuaweiReferrer initResponseHuaweiReferrer = ((InitResponse) this.n0.k().b()).d;
        if (!w()) {
            n(true);
            return;
        }
        HuaweiReferrerStatus huaweiReferrerStatus = HuaweiReferrerStatus.Ok;
        HuaweiReferrerStatus huaweiReferrerStatus2 = huaweiReferrer.f28174c;
        if (huaweiReferrerStatus2 == huaweiReferrerStatus || huaweiReferrerStatus2 == HuaweiReferrerStatus.NoData || huaweiReferrerStatus2 == HuaweiReferrerStatus.FeatureNotSupported || huaweiReferrerStatus2 == HuaweiReferrerStatus.MissingDependency || this.j0 >= initResponseHuaweiReferrer.f28199b + 1) {
            this.n0.l().q(huaweiReferrer);
            n(true);
            return;
        }
        p0.d("Gather failed, retrying in " + (TimeUtil.b(initResponseHuaweiReferrer.f28200c) / 1000.0d) + " seconds");
        s(TimeUtil.b(initResponseHuaweiReferrer.f28200c));
    }

    @Override // com.kochava.core.job.internal.Job
    public final void p() {
        ClassLoggerApi classLoggerApi = p0;
        classLoggerApi.a("Started at " + TimeUtil.c(this.o0.f28115a) + " seconds");
        if (!ReflectionUtil.b("com.huawei.hms.ads.installreferrer.api.InstallReferrerClient")) {
            classLoggerApi.d("Huawei Install Referrer library is missing from the app, skipping collection");
            this.n0.l().q(new HuaweiReferrer(1, 0.0d, HuaweiReferrerStatus.MissingDependency, null, null, null));
            return;
        }
        InitResponseHuaweiReferrer initResponseHuaweiReferrer = ((InitResponse) this.n0.k().b()).d;
        InstanceState instanceState = this.o0;
        HuaweiReferrerHelper huaweiReferrerHelper = new HuaweiReferrerHelper(instanceState.f28116b, instanceState.f28117c, this, this.j0, this.h0, TimeUtil.b(initResponseHuaweiReferrer.d));
        u();
        synchronized (huaweiReferrerHelper) {
            huaweiReferrerHelper.g0.start();
            huaweiReferrerHelper.h0.a(huaweiReferrerHelper.f0);
        }
    }

    @Override // com.kochava.core.job.internal.Job
    public final long t() {
        return 0L;
    }

    @Override // com.kochava.core.job.internal.Job
    public final boolean v() {
        Profile profile = this.n0;
        InitResponseHuaweiReferrer initResponseHuaweiReferrer = ((InitResponse) profile.k().b()).d;
        InstanceState instanceState = this.o0;
        synchronized (instanceState.f) {
        }
        if (instanceState.f.f() || !initResponseHuaweiReferrer.f28198a) {
            return false;
        }
        HuaweiReferrerApi huaweiReferrerApiC = profile.l().c();
        if (huaweiReferrerApiC != null) {
            return ((HuaweiReferrer) huaweiReferrerApiC).f28174c == HuaweiReferrerStatus.NotGathered;
        }
        return true;
    }
}
