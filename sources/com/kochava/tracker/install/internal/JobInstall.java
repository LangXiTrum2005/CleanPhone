package com.kochava.tracker.install.internal;

import com.kochava.core.job.internal.Job;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.network.internal.NetworkResponseApi;
import com.kochava.core.ratelimit.internal.RateLimit;
import com.kochava.core.ratelimit.internal.RateLimitAttempt;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.util.internal.TimeUtil;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.controller.internal.Controller;
import com.kochava.tracker.controller.internal.InstanceState;
import com.kochava.tracker.datapoint.internal.DataPointManager;
import com.kochava.tracker.init.internal.InitResponse;
import com.kochava.tracker.payload.internal.Payload;
import com.kochava.tracker.payload.internal.PayloadApi;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.profile.internal.Profile;
import com.kochava.tracker.profile.internal.ProfileInstall;
import com.kochava.tracker.profile.internal.ProfileMain;
import com.kochava.tracker.session.internal.SessionManager;
import com.smartdigimkt.b0.a;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class JobInstall extends Job {
    public static final ClassLoggerApi s0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "JobInstall");
    public final Profile n0;
    public final InstanceState o0;
    public final SessionManager p0;
    public final DataPointManager q0;
    public final RateLimit r0;

    public JobInstall(Controller controller, Profile profile, InstanceState instanceState, DataPointManager dataPointManager, SessionManager sessionManager, RateLimit rateLimit) {
        super("JobInstall", instanceState.f28117c, TaskQueue.IO, controller);
        this.n0 = profile;
        this.o0 = instanceState;
        this.q0 = dataPointManager;
        this.p0 = sessionManager;
        this.r0 = rateLimit;
    }

    @Override // com.kochava.core.job.internal.Job
    public final void p() {
        long j;
        this.o0.getClass();
        ClassLoggerApi classLoggerApi = s0;
        com.kochava.tracker.log.internal.Logger.a(classLoggerApi, "Sending install at " + TimeUtil.c(this.o0.f28115a) + " seconds");
        classLoggerApi.a("Started at " + TimeUtil.c(this.o0.f28115a) + " seconds");
        PayloadApi payloadApiG = this.n0.l().g();
        if (payloadApiG == null) {
            PayloadType payloadType = PayloadType.l0;
            long j2 = this.o0.f28115a;
            long jG = this.n0.m().g();
            long jCurrentTimeMillis = System.currentTimeMillis();
            ProfileMain profileMainM = this.n0.m();
            synchronized (profileMainM) {
                j = profileMainM.f28297c;
            }
            TimeUnit timeUnit = TimeUnit.DAYS;
            if (jCurrentTimeMillis < timeUnit.toMillis(30L) + j) {
                jCurrentTimeMillis = j;
            } else {
                long j3 = this.o0.f28115a;
                if (jCurrentTimeMillis < timeUnit.toMillis(30L) + j3) {
                    jCurrentTimeMillis = j3;
                }
            }
            payloadApiG = Payload.g(payloadType, j2, jG, jCurrentTimeMillis, this.p0.f(), this.p0.h(), this.p0.e());
        }
        payloadApiG.d(this.o0.f28116b, this.q0);
        this.n0.l().u(payloadApiG);
        RateLimitAttempt rateLimitAttemptA = this.r0.a();
        if (!rateLimitAttemptA.f28057a) {
            if (!rateLimitAttemptA.f28058b) {
                classLoggerApi.d("Rate limited, transmitting disabled");
                q();
                throw null;
            }
            classLoggerApi.d("Rate limited, transmitting after " + (rateLimitAttemptA.f28059c / 1000.0d) + " seconds");
            o(rateLimitAttemptA.f28059c);
            return;
        }
        long jI = 0;
        if (((InitResponse) this.n0.k().b()).f28180c.f28195a) {
            classLoggerApi.d("SDK disabled, aborting");
        } else {
            this.o0.getClass();
            if (payloadApiG.c(this.q0)) {
                NetworkResponseApi networkResponseApiA = payloadApiG.a(this.o0.f28116b, this.j0, ((InitResponse) this.n0.k().b()).f28183i.a());
                l();
                if (!networkResponseApiA.isSuccess()) {
                    classLoggerApi.d("Transmit failed, retrying after " + (networkResponseApiA.a() / 1000.0d) + " seconds");
                    r(networkResponseApiA.a());
                    throw null;
                }
                jI = networkResponseApiA.i();
            } else {
                classLoggerApi.d("Payload disabled, aborting");
            }
        }
        this.o0.getClass();
        this.n0.l().x(System.currentTimeMillis());
        this.n0.l().w(this.n0.l().i() + 1);
        ProfileInstall profileInstallL = this.n0.l();
        long jI2 = this.n0.l().i();
        boolean z2 = ((InitResponse) this.n0.k().b()).f28180c.f28195a;
        JsonObjectApi jsonObjectApiB = payloadApiG.b();
        String string = jsonObjectApiB.getString("kochava_device_id", null);
        String string2 = jsonObjectApiB.getString("kochava_app_id", null);
        String string3 = jsonObjectApiB.getString(a.s1, null);
        JsonObjectApi data = payloadApiG.getData();
        profileInstallL.t(new LastInstall(string, string2, string3, data.getString("app_version", null), data.getString(a.h1, null), Long.valueOf(System.currentTimeMillis() / 1000), z2 ? Boolean.TRUE : null, jI2));
        this.n0.l().u(null);
        com.kochava.tracker.log.internal.Logger.a(classLoggerApi, "Completed install at " + TimeUtil.c(this.o0.f28115a) + " seconds with a network duration of " + (jI / 1000.0d) + " seconds");
    }

    @Override // com.kochava.core.job.internal.Job
    public final long t() {
        return 0L;
    }

    @Override // com.kochava.core.job.internal.Job
    public final boolean v() {
        InstanceState instanceState = this.o0;
        synchronized (instanceState.f) {
        }
        if (instanceState.f.f()) {
            return false;
        }
        return !this.n0.l().m();
    }
}
