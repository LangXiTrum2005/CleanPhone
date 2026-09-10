package com.kochava.tracker.install.internal;

import com.kochava.core.job.internal.Job;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.util.internal.TimeUtil;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.controller.internal.Controller;
import com.kochava.tracker.controller.internal.InstanceState;
import com.kochava.tracker.datapoint.internal.DataPointManager;
import com.kochava.tracker.payload.internal.Payload;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.profile.internal.Profile;
import com.kochava.tracker.session.internal.SessionManager;

/* JADX INFO: loaded from: classes5.dex */
public final class JobUpdateIdentityLink extends Job {
    public static final ClassLoggerApi t0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "JobUpdateIdentityLink");
    public final Profile n0;
    public final InstanceState o0;
    public final SessionManager p0;
    public final DataPointManager q0;
    public final String r0;
    public final String s0;

    public JobUpdateIdentityLink(Controller controller, Profile profile, InstanceState instanceState, DataPointManager dataPointManager, SessionManager sessionManager, String str, String str2) {
        super("JobUpdateIdentityLink", instanceState.f28117c, TaskQueue.Worker, controller);
        this.n0 = profile;
        this.o0 = instanceState;
        this.q0 = dataPointManager;
        this.p0 = sessionManager;
        this.r0 = str;
        this.s0 = str2;
    }

    @Override // com.kochava.core.job.internal.Job
    public final void p() {
        StringBuilder sb = new StringBuilder("Started at ");
        InstanceState instanceState = this.o0;
        sb.append(TimeUtil.c(instanceState.f28115a));
        sb.append(" seconds");
        String string = sb.toString();
        ClassLoggerApi classLoggerApi = t0;
        classLoggerApi.a(string);
        Profile profile = this.n0;
        JsonObject jsonObject = (JsonObject) profile.l().d();
        String str = this.r0;
        String str2 = this.s0;
        if (jsonObject.y(str2, str)) {
            classLoggerApi.d("Identity link already exists, ignoring");
            return;
        }
        jsonObject.g(str, str2);
        profile.l().r(jsonObject);
        DataPointManager dataPointManager = this.q0;
        dataPointManager.c().h(jsonObject);
        if (!dataPointManager.e(str)) {
            classLoggerApi.d("Identity link is denied. dropping with name " + str);
            return;
        }
        if (profile.l().g() == null && !profile.l().m()) {
            com.kochava.tracker.log.internal.Logger.a(classLoggerApi, "Identity link to be sent within install");
            return;
        }
        com.kochava.tracker.log.internal.Logger.a(classLoggerApi, "Identity link to be sent as stand alone");
        PayloadType payloadType = PayloadType.o0;
        long jG = profile.m().g();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SessionManager sessionManager = this.p0;
        long jF = sessionManager.f();
        boolean zH = sessionManager.h();
        int iE = sessionManager.e();
        JsonObject jsonObjectW = JsonObject.w();
        JsonObject jsonObjectW2 = JsonObject.w();
        jsonObjectW2.g(str, str2);
        jsonObjectW.r("identity_link", jsonObjectW2);
        Payload payloadH = Payload.h(payloadType, instanceState.f28115a, jG, jCurrentTimeMillis, jF, zH, iE, jsonObjectW);
        payloadH.d(instanceState.f28116b, dataPointManager);
        profile.j().c(payloadH);
    }

    @Override // com.kochava.core.job.internal.Job
    public final long t() {
        return 0L;
    }

    @Override // com.kochava.core.job.internal.Job
    public final boolean v() {
        return true;
    }
}
