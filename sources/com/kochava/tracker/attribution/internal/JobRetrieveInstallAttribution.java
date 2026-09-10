package com.kochava.tracker.attribution.internal;

import android.util.Pair;
import com.kochava.core.job.internal.Job;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.network.base.internal.NetworkBaseResponse;
import com.kochava.core.network.base.internal.NetworkBaseResponseApi;
import com.kochava.core.network.internal.NetworkResponse;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.util.internal.ObjectUtil;
import com.kochava.core.util.internal.TimeUtil;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.attribution.InstallAttributionApi;
import com.kochava.tracker.attribution.RetrievedInstallAttributionListener;
import com.kochava.tracker.controller.internal.Controller;
import com.kochava.tracker.controller.internal.InstanceState;
import com.kochava.tracker.datapoint.internal.DataPointManager;
import com.kochava.tracker.init.internal.InitResponse;
import com.kochava.tracker.payload.internal.Payload;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.profile.internal.Profile;
import com.kochava.tracker.profile.internal.ProfileInstall;
import com.kochava.tracker.session.internal.SessionManager;
import com.p004ironsource.e9;

/* JADX INFO: loaded from: classes5.dex */
public final class JobRetrieveInstallAttribution extends Job {
    public static final ClassLoggerApi s0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "JobRetrieveInstallAttribution");
    public final Profile n0;
    public final InstanceState o0;
    public final SessionManager p0;
    public final DataPointManager q0;
    public final RetrievedInstallAttributionListener r0;

    class a implements Runnable {
        public final /* synthetic */ InstallAttributionApi X;

        public a(InstallAttributionApi installAttributionApi) {
            this.X = installAttributionApi;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JobRetrieveInstallAttribution.this.r0.d();
        }
    }

    public JobRetrieveInstallAttribution(Controller controller, Profile profile, InstanceState instanceState, DataPointManager dataPointManager, SessionManager sessionManager, RetrievedInstallAttributionListener retrievedInstallAttributionListener) {
        super("JobRetrieveInstallAttribution", instanceState.f28117c, TaskQueue.Worker, controller);
        this.n0 = profile;
        this.o0 = instanceState;
        this.q0 = dataPointManager;
        this.p0 = sessionManager;
        this.r0 = retrievedInstallAttributionListener;
    }

    @Override // com.kochava.core.job.internal.Job
    public final void p() {
        InstallAttributionResponse installAttributionResponse;
        Pair pairCreate;
        ClassLoggerApi classLoggerApi = s0;
        com.kochava.tracker.log.internal.Logger.a(classLoggerApi, "Sending get_attribution at " + TimeUtil.c(this.o0.f28115a) + " seconds");
        classLoggerApi.a("Started at " + TimeUtil.c(this.o0.f28115a) + " seconds");
        ProfileInstall profileInstallL = this.n0.l();
        synchronized (profileInstallL) {
            installAttributionResponse = profileInstallL.k;
        }
        if (installAttributionResponse.c()) {
            classLoggerApi.d("Attribution results already retrieved, returning the cached value");
            z(installAttributionResponse.b(), 0L);
            return;
        }
        Payload payloadG = Payload.g(PayloadType.n0, this.o0.f28115a, this.n0.m().g(), System.currentTimeMillis(), this.p0.f(), this.p0.h(), this.p0.e());
        payloadG.d(this.o0.f28116b, this.q0);
        if (((InitResponse) this.n0.k().b()).f28180c.f28195a) {
            classLoggerApi.d("SDK disabled, aborting");
            pairCreate = Pair.create(0L, JsonObject.w());
        } else {
            this.o0.getClass();
            if (payloadG.c(this.q0)) {
                NetworkBaseResponseApi networkBaseResponseApiA = payloadG.a(this.o0.f28116b, this.j0, ((InitResponse) this.n0.k().b()).f28183i.a());
                l();
                NetworkBaseResponse networkBaseResponse = (NetworkBaseResponse) networkBaseResponseApiA;
                if (!networkBaseResponse.f28045b) {
                    long j = networkBaseResponse.d;
                    StringBuilder sb = new StringBuilder("Transmit failed, retrying after ");
                    double d = j / 1000.0d;
                    sb.append(d);
                    sb.append(" seconds");
                    classLoggerApi.a(sb.toString());
                    com.kochava.tracker.log.internal.Logger.a(classLoggerApi, "Attribution results not ready, retrying in " + d + " seconds");
                    r(j);
                    throw null;
                }
                pairCreate = Pair.create(Long.valueOf(networkBaseResponse.f28044a), ((NetworkResponse) networkBaseResponseApiA).b().b());
            } else {
                classLoggerApi.d("Payload disabled, aborting");
                pairCreate = Pair.create(0L, JsonObject.w());
            }
        }
        String strB = ObjectUtil.b(this.n0.m().f(), this.n0.m().e(), new String[0]);
        JsonObjectApi jsonObjectApiK = ((JsonObjectApi) pairCreate.second).k("data", true);
        JsonObjectApi jsonObjectApiK2 = jsonObjectApiK.k(e9.ATTRIBUTION, true);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String string = jsonObjectApiK.getString("kochava_device_id", "");
        InstallAttributionResponse installAttributionResponse2 = new InstallAttributionResponse(jsonObjectApiK2, jCurrentTimeMillis, string, !string.isEmpty() && strB.equals(string));
        this.n0.l().o(installAttributionResponse2);
        z(installAttributionResponse2.b(), ((Long) pairCreate.first).longValue());
    }

    @Override // com.kochava.core.job.internal.Job
    public final long t() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Profile profile = this.n0;
        long jB = TimeUtil.b(((InitResponse) profile.k().b()).f28178a.f28186b) + profile.l().j();
        long j = jB >= jCurrentTimeMillis ? jB - jCurrentTimeMillis : 0L;
        com.kochava.tracker.log.internal.Logger.a(s0, "Requesting attribution results in " + (j / 1000.0d) + " seconds");
        return j;
    }

    @Override // com.kochava.core.job.internal.Job
    public final boolean v() {
        InstanceState instanceState = this.o0;
        synchronized (instanceState.f) {
        }
        return !instanceState.f.f() && this.n0.l().m();
    }

    public final void z(InstallAttributionApi installAttributionApi, long j) {
        String strR = android.support.v4.media.a.r(new StringBuilder("Attribution response indicates this install "), installAttributionApi.b() ? "was" : "was not", " attributed");
        ClassLoggerApi classLoggerApi = s0;
        com.kochava.tracker.log.internal.Logger.a(classLoggerApi, strR);
        com.kochava.tracker.log.internal.Logger.a(classLoggerApi, "Attribution response indicates this was a ".concat(installAttributionApi.a() ? "new install" : "reinstall"));
        StringBuilder sb = new StringBuilder("Completed get_attribution at ");
        InstanceState instanceState = this.o0;
        sb.append(TimeUtil.c(instanceState.f28115a));
        sb.append(" seconds with a network duration of ");
        sb.append(j / 1000.0d);
        sb.append(" seconds");
        com.kochava.tracker.log.internal.Logger.a(classLoggerApi, sb.toString());
        instanceState.f28117c.i(new a(installAttributionApi));
    }
}
