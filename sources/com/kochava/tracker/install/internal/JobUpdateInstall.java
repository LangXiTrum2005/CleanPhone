package com.kochava.tracker.install.internal;

import com.kochava.core.job.internal.Job;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.util.internal.TimeUtil;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.controller.internal.Controller;
import com.kochava.tracker.controller.internal.InstanceState;
import com.kochava.tracker.datapoint.internal.DataPointManager;
import com.kochava.tracker.init.internal.InitResponse;
import com.kochava.tracker.payload.internal.Payload;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.profile.internal.Profile;
import com.kochava.tracker.profile.internal.ProfileInstall;
import com.kochava.tracker.session.internal.SessionManager;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class JobUpdateInstall extends Job {
    public static final ClassLoggerApi s0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "JobUpdateInstall");
    public final Profile n0;
    public final InstanceState o0;
    public final SessionManager p0;
    public final DataPointManager q0;
    public final Boolean r0;

    public JobUpdateInstall(Controller controller, Profile profile, InstanceState instanceState, DataPointManager dataPointManager, SessionManager sessionManager, Boolean bool) {
        super("JobUpdateInstall", instanceState.f28117c, TaskQueue.Worker, controller);
        this.n0 = profile;
        this.o0 = instanceState;
        this.q0 = dataPointManager;
        this.p0 = sessionManager;
        this.r0 = bool;
    }

    @Override // com.kochava.core.job.internal.Job
    public final void p() {
        boolean z2;
        boolean z3;
        StringBuilder sb = new StringBuilder("Started at ");
        InstanceState instanceState = this.o0;
        sb.append(TimeUtil.c(instanceState.f28115a));
        sb.append(" seconds");
        String string = sb.toString();
        ClassLoggerApi classLoggerApi = s0;
        classLoggerApi.a(string);
        DataPointManager dataPointManager = this.q0;
        Profile profile = this.n0;
        Boolean bool = this.r0;
        if (bool != null) {
            if (profile.l().l() == bool.booleanValue()) {
                classLoggerApi.d("App Limit Ad Tracking value did not change, ignoring");
                return;
            }
            profile.l().n(bool.booleanValue());
            dataPointManager.b().h(bool);
            ProfileInstall profileInstallL = profile.l();
            synchronized (profileInstallL) {
                z3 = profileInstallL.m() || profileInstallL.g() != null;
            }
            if (!z3) {
                classLoggerApi.d("Install not yet sent, ignoring");
                return;
            }
        }
        JsonObjectApi jsonObjectApiK = profile.l().k();
        PayloadType payloadType = PayloadType.m0;
        long j = instanceState.f28115a;
        long jG = profile.m().g();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SessionManager sessionManager = this.p0;
        Payload payloadG = Payload.g(payloadType, j, jG, jCurrentTimeMillis, sessionManager.f(), sessionManager.h(), sessionManager.e());
        payloadG.d(instanceState.f28116b, dataPointManager);
        JsonObject jsonObjectC = payloadG.Z.c();
        jsonObjectC.remove("usertime");
        jsonObjectC.remove("uptime");
        jsonObjectC.remove("starttime");
        ProfileInstall profileInstallL2 = profile.l();
        synchronized (profileInstallL2) {
            z2 = profileInstallL2.f;
        }
        if (!z2) {
            profile.l().y(jsonObjectC);
            profile.l().z();
            classLoggerApi.d("Initialized with starting values");
            return;
        }
        if (jsonObjectApiK.equals(jsonObjectC)) {
            classLoggerApi.d("No watched values updated");
            return;
        }
        Iterator it = jsonObjectApiK.t(jsonObjectC).h().iterator();
        while (it.hasNext()) {
            classLoggerApi.d("Watched value " + ((String) it.next()) + " updated");
        }
        profile.l().y(jsonObjectC);
        if (((InitResponse) profile.k().b()).f.f28202b) {
            profile.r().c(payloadG);
        } else {
            classLoggerApi.d("Updates disabled, ignoring");
        }
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
        return (instanceState.f.f() && this.r0 == null) ? false : true;
    }
}
