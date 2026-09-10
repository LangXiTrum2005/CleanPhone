package com.kochava.tracker.modules.events.internal;

import com.kochava.core.job.internal.Job;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.util.internal.TimeUtil;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.controller.internal.Controller;
import com.kochava.tracker.controller.internal.InstanceState;
import com.kochava.tracker.datapoint.internal.DataPointManager;
import com.kochava.tracker.payload.internal.Payload;
import com.kochava.tracker.payload.internal.PayloadQueue;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.profile.internal.Profile;
import com.kochava.tracker.session.internal.SessionManager;
import com.smartdigimkt.q0.b;

/* JADX INFO: loaded from: classes5.dex */
public final class JobEvent extends Job {
    public static final ClassLoggerApi t0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "JobEvent");
    public final Profile n0;
    public final InstanceState o0;
    public final SessionManager p0;
    public final DataPointManager q0;
    public final JsonObjectApi r0;
    public final long s0;

    public JobEvent(Controller controller, Profile profile, InstanceState instanceState, DataPointManager dataPointManager, SessionManager sessionManager, JsonObjectApi jsonObjectApi) {
        super("JobEvent", instanceState.f28117c, TaskQueue.Worker, controller);
        this.n0 = profile;
        this.o0 = instanceState;
        this.p0 = sessionManager;
        this.q0 = dataPointManager;
        this.r0 = jsonObjectApi;
        this.s0 = System.currentTimeMillis();
    }

    @Override // com.kochava.core.job.internal.Job
    public final void p() {
        boolean zE;
        StringBuilder sb = new StringBuilder("Started at ");
        InstanceState instanceState = this.o0;
        sb.append(TimeUtil.c(instanceState.f28115a));
        sb.append(" seconds");
        String string = sb.toString();
        ClassLoggerApi classLoggerApi = t0;
        classLoggerApi.a(string);
        Profile profile = this.n0;
        PayloadQueue payloadQueueI = profile.i();
        synchronized (payloadQueueI) {
            zE = payloadQueueI.f28263a.e();
        }
        if (zE) {
            classLoggerApi.d("Event queue is full. dropping incoming event");
            return;
        }
        String string2 = this.r0.getString(b.S0, "");
        DataPointManager dataPointManager = this.q0;
        if (!dataPointManager.d(string2)) {
            classLoggerApi.d("Event name is denied, dropping incoming event with name " + string2);
            return;
        }
        PayloadType payloadType = PayloadType.t0;
        long j = instanceState.f28115a;
        long jG = profile.m().g();
        SessionManager sessionManager = this.p0;
        Payload payloadH = Payload.h(payloadType, j, jG, this.s0, sessionManager.f(), sessionManager.h(), sessionManager.e(), this.r0);
        payloadH.d(instanceState.f28116b, dataPointManager);
        profile.i().c(payloadH);
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
