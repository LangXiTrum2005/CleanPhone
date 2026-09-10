package com.kochava.tracker.modules.engagement.internal;

import com.kochava.core.job.internal.Job;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.util.internal.TextUtil;
import com.kochava.core.util.internal.TimeUtil;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.controller.internal.Controller;
import com.kochava.tracker.controller.internal.InstanceState;
import com.kochava.tracker.datapoint.internal.DataPointManager;
import com.kochava.tracker.init.internal.InitResponse;
import com.kochava.tracker.payload.internal.Payload;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.profile.internal.Profile;
import com.kochava.tracker.profile.internal.ProfileEngagement;
import com.kochava.tracker.session.internal.SessionManager;

/* JADX INFO: loaded from: classes5.dex */
public final class JobUpdatePush extends Job {
    public static final ClassLoggerApi r0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "JobUpdatePush");
    public final Profile n0;
    public final InstanceState o0;
    public final DataPointManager p0;
    public final SessionManager q0;

    public JobUpdatePush(Controller controller, Profile profile, InstanceState instanceState, DataPointManager dataPointManager, SessionManager sessionManager) {
        super("JobUpdatePush", instanceState.f28117c, TaskQueue.IO, controller);
        this.n0 = profile;
        this.o0 = instanceState;
        this.p0 = dataPointManager;
        this.q0 = sessionManager;
    }

    @Override // com.kochava.core.job.internal.Job
    public final void p() {
        boolean z2;
        boolean z3;
        boolean z4;
        StringBuilder sb = new StringBuilder("Started at ");
        InstanceState instanceState = this.o0;
        sb.append(TimeUtil.c(instanceState.f28115a));
        sb.append(" seconds");
        String string = sb.toString();
        ClassLoggerApi classLoggerApi = r0;
        classLoggerApi.a(string);
        Profile profile = this.n0;
        ProfileEngagement profileEngagementH = profile.h();
        synchronized (profileEngagementH) {
            z2 = profileEngagementH.f > 0;
        }
        ProfileEngagement profileEngagementH2 = profile.h();
        synchronized (profileEngagementH2) {
            z3 = profileEngagementH2.f28281b;
        }
        boolean zB = TextUtil.b(profile.h().b());
        boolean z5 = ((InitResponse) profile.k().b()).k.f28224a;
        ProfileEngagement profileEngagementH3 = profile.h();
        synchronized (profileEngagementH3) {
            z4 = profileEngagementH3.f28283e;
        }
        PayloadType payloadType = z4 ? PayloadType.p0 : PayloadType.q0;
        long j = instanceState.f28115a;
        long jG = profile.m().g();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SessionManager sessionManager = this.q0;
        Payload payloadG = Payload.g(payloadType, j, jG, jCurrentTimeMillis, sessionManager.f(), sessionManager.h(), sessionManager.e());
        payloadG.d(instanceState.f28116b, this.p0);
        JsonObject jsonObjectW = JsonObject.w();
        JsonObject jsonObjectC = payloadG.Z.c();
        Boolean boolJ = jsonObjectC.j("notifications_enabled", null);
        if (boolJ != null) {
            jsonObjectW.o("notifications_enabled", boolJ.booleanValue());
        }
        Boolean boolJ2 = jsonObjectC.j("background_location", null);
        if (boolJ2 != null) {
            jsonObjectW.o("background_location", boolJ2.booleanValue());
        }
        boolean zEquals = profile.h().c().equals(jsonObjectW);
        if (!z3) {
            classLoggerApi.d("Initialized with starting values");
            profile.h().e(jsonObjectW);
            profile.h().f();
            if (z2) {
                classLoggerApi.d("Already up to date");
                return;
            }
        } else if (!zEquals) {
            classLoggerApi.d("Saving updated watchlist");
            profile.h().e(jsonObjectW);
            profile.h().d(0L);
        } else if (z2) {
            classLoggerApi.d("Already up to date");
            return;
        }
        if (!z5) {
            classLoggerApi.d("Disabled for this app");
        } else if (zB) {
            classLoggerApi.d("No token");
        } else {
            profile.q().c(payloadG);
            profile.h().d(System.currentTimeMillis());
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
        return !instanceState.f.f();
    }
}
