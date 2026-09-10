package com.kochava.tracker.payload.internal;

import android.support.v4.media.a;
import com.kochava.core.job.internal.Job;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.network.base.internal.NetworkBaseResponse;
import com.kochava.core.ratelimit.internal.RateLimit;
import com.kochava.core.ratelimit.internal.RateLimitAttempt;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.util.internal.TimeUtil;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.controller.internal.Controller;
import com.kochava.tracker.controller.internal.InstanceState;
import com.kochava.tracker.datapoint.internal.DataPointManager;
import com.kochava.tracker.init.internal.InitResponse;
import com.kochava.tracker.profile.internal.Profile;
import com.kochava.tracker.session.internal.SessionManager;

/* JADX INFO: loaded from: classes5.dex */
public final class JobPayloadQueue extends Job {
    public static final ClassLoggerApi s0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "JobPayloadQueue");
    public final Profile n0;
    public final InstanceState o0;
    public final DataPointManager p0;
    public final SessionManager q0;
    public final RateLimit r0;

    public JobPayloadQueue(Controller controller, Profile profile, InstanceState instanceState, DataPointManager dataPointManager, SessionManager sessionManager, RateLimit rateLimit) {
        super("JobPayloadQueue", instanceState.f28117c, TaskQueue.IO, controller);
        this.n0 = profile;
        this.o0 = instanceState;
        this.p0 = dataPointManager;
        this.q0 = sessionManager;
        this.r0 = rateLimit;
    }

    public final boolean A(PayloadQueueApi payloadQueueApi) {
        Payload payload = payloadQueueApi.get();
        if (payload == null) {
            s0.d("failed to retrieve payload from the queue, dropping");
            payloadQueueApi.remove();
            x();
            return false;
        }
        if (((InitResponse) this.n0.k().b()).f28180c.f28195a) {
            s0.d("SDK disabled, marking payload complete without sending");
            payloadQueueApi.remove();
            x();
            return false;
        }
        payload.d(this.o0.f28116b, this.p0);
        this.o0.getClass();
        if (!payload.c(this.p0)) {
            s0.d("payload is disabled, dropping");
            payloadQueueApi.remove();
            x();
            return false;
        }
        RateLimitAttempt rateLimitAttemptA = this.r0.a();
        if (!rateLimitAttemptA.f28057a) {
            if (!rateLimitAttemptA.f28058b) {
                s0.d("Rate limited, transmitting disabled");
                q();
                throw null;
            }
            s0.d("Rate limited, transmitting after " + (rateLimitAttemptA.f28059c / 1000.0d) + " seconds");
            o(rateLimitAttemptA.f28059c);
            return true;
        }
        NetworkBaseResponse networkBaseResponse = (NetworkBaseResponse) payload.a(this.o0.f28116b, this.j0, ((InitResponse) this.n0.k().b()).f28183i.a());
        if (networkBaseResponse.f28045b) {
            payloadQueueApi.remove();
            x();
            return false;
        }
        if (networkBaseResponse.f28046c) {
            s0.d("Transmit failed, retrying after " + (networkBaseResponse.d / 1000.0d) + " seconds");
            payloadQueueApi.b(payload);
            r(networkBaseResponse.d);
            throw null;
        }
        s0.d("Transmit failed, out of attempts after " + this.j0 + " attempts");
        payloadQueueApi.remove();
        x();
        return false;
    }

    @Override // com.kochava.core.job.internal.Job
    public final void p() {
        String str = "Started at " + TimeUtil.c(this.o0.f28115a) + " seconds";
        ClassLoggerApi classLoggerApi = s0;
        classLoggerApi.a(str);
        while (v()) {
            l();
            Profile profile = this.n0;
            if (z("Install", profile.l().j())) {
                return;
            }
            if (profile.g().f() > 0) {
                classLoggerApi.d("Transmitting clicks");
                if (A(profile.g()) || !v()) {
                    return;
                }
            }
            if (z("Click", profile.g().e())) {
                return;
            }
            if (profile.r().f() > 0) {
                classLoggerApi.d("Transmitting updates");
                if (A(profile.r()) || !v()) {
                    return;
                }
            }
            if (profile.j().f() > 0) {
                classLoggerApi.d("Transmitting identity links");
                if (A(profile.j()) || !v()) {
                    return;
                }
            }
            if (z("IdentityLink", profile.j().e())) {
                return;
            }
            if (profile.q().f() > 0) {
                classLoggerApi.d("Transmitting tokens");
                if (A(profile.q()) || !v()) {
                    return;
                }
            }
            if (profile.p().f() > 0) {
                classLoggerApi.d("Transmitting sessions");
                if (A(profile.p()) || !v()) {
                    return;
                }
            }
            if (profile.i().f() > 0) {
                classLoggerApi.d("Transmitting events");
                if (A(profile.i()) || !v()) {
                    return;
                }
            }
        }
    }

    @Override // com.kochava.core.job.internal.Job
    public final long t() {
        return 0L;
    }

    @Override // com.kochava.core.job.internal.Job
    public final boolean v() {
        Profile profile = this.n0;
        boolean zM = profile.l().m();
        InstanceState instanceState = this.o0;
        synchronized (instanceState.f) {
        }
        return !instanceState.f.f() && zM && ((profile.g().f() > 0) || (profile.r().f() > 0) || (profile.j().f() > 0) || (profile.q().f() > 0) || (profile.p().f() > 0) || (profile.i().f() > 0));
    }

    public final boolean z(String str, long j) {
        boolean z2;
        SessionManager sessionManager = this.q0;
        synchronized (sessionManager) {
            z2 = sessionManager.f;
        }
        if (z2) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jB = TimeUtil.b(((InitResponse) this.n0.k().b()).f28183i.f28208a) + j;
        if (jCurrentTimeMillis >= jB) {
            return false;
        }
        long j2 = jB - jCurrentTimeMillis;
        StringBuilder sbX = a.x(str, " Tracking wait, transmitting after ");
        sbX.append(j2 / 1000.0d);
        sbX.append(" seconds");
        s0.d(sbX.toString());
        o(j2);
        return true;
    }
}
