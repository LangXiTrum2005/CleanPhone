package com.kochava.tracker.init.internal;

import android.net.Uri;
import com.kochava.core.job.internal.Job;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.network.base.internal.NetworkBaseResponse;
import com.kochava.core.network.base.internal.NetworkBaseResponseApi;
import com.kochava.core.network.internal.NetworkResponse;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.util.internal.TextUtil;
import com.kochava.core.util.internal.TimeUtil;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.attribution.internal.InstallAttributionResponse;
import com.kochava.tracker.controller.internal.Controller;
import com.kochava.tracker.controller.internal.InstanceState;
import com.kochava.tracker.datapoint.internal.DataPointManager;
import com.kochava.tracker.payload.internal.Payload;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.payload.internal.url.RotationUrl;
import com.kochava.tracker.profile.internal.Profile;
import com.kochava.tracker.profile.internal.ProfileInit;
import com.kochava.tracker.session.internal.SessionManager;

/* JADX INFO: loaded from: classes5.dex */
public final class JobInit extends Job {
    public static final ClassLoggerApi r0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "JobInit");
    public final Profile n0;
    public final InstanceState o0;
    public final SessionManager p0;
    public final DataPointManager q0;

    class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public JobInit(Controller controller, Profile profile, InstanceState instanceState, DataPointManager dataPointManager, SessionManager sessionManager) {
        super("JobInit", instanceState.f28117c, TaskQueue.IO, controller);
        this.n0 = profile;
        this.o0 = instanceState;
        this.q0 = dataPointManager;
        this.p0 = sessionManager;
    }

    @Override // com.kochava.core.job.internal.Job
    public final void p() {
        Uri uriB;
        int i2;
        boolean z2;
        PayloadType payloadType = PayloadType.k0;
        synchronized (payloadType) {
            uriB = payloadType.b("");
        }
        String string = uriB.toString();
        ClassLoggerApi classLoggerApi = r0;
        com.kochava.tracker.log.internal.Logger.a(classLoggerApi, "Sending kvinit at " + TimeUtil.c(this.o0.f28115a) + " seconds to " + string);
        StringBuilder sb = new StringBuilder("Started at ");
        sb.append(TimeUtil.c(this.o0.f28115a));
        sb.append(" seconds");
        classLoggerApi.a(sb.toString());
        JsonObject jsonObjectW = JsonObject.w();
        jsonObjectW.g("url", string);
        Payload payloadH = Payload.h(payloadType, this.o0.f28115a, this.n0.m().g(), System.currentTimeMillis(), this.p0.f(), this.p0.h(), this.p0.e(), jsonObjectW);
        payloadH.d(this.o0.f28116b, this.q0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        NetworkBaseResponseApi networkBaseResponseApiA = payloadH.a(this.o0.f28116b, this.j0, ((InitResponse) this.n0.k().b()).f28183i.a());
        l();
        NetworkBaseResponse networkBaseResponse = (NetworkBaseResponse) networkBaseResponseApiA;
        if (!networkBaseResponse.f28045b) {
            synchronized (payloadType) {
                payloadType.i0++;
                RotationUrl rotationUrl = payloadType.e0;
                if (rotationUrl == null) {
                    rotationUrl = new RotationUrl();
                }
                payloadType.a(rotationUrl);
            }
            synchronized (payloadType) {
                z2 = payloadType.j0;
            }
            if (!z2) {
                classLoggerApi.d("Transmit failed, retrying immediately with rotated URL");
                o(1L);
                return;
            }
            this.n0.k().j(true);
            classLoggerApi.d("Transmit failed, retrying after " + (networkBaseResponse.d / 1000.0d) + " seconds");
            r(networkBaseResponse.d);
            throw null;
        }
        InitResponseApi initResponseApiB = this.n0.k().b();
        InitResponse initResponseA = InitResponse.a(((NetworkResponse) networkBaseResponseApiA).b().b());
        ProfileInit profileInitK = this.n0.k();
        synchronized (payloadType) {
            i2 = payloadType.i0;
        }
        profileInitK.i(i2);
        this.n0.k().g(initResponseA);
        this.n0.k().k(jCurrentTimeMillis);
        this.n0.k().f(System.currentTimeMillis());
        this.n0.k().e();
        String str = initResponseA.f.f28201a;
        boolean zB = TextUtil.b(str);
        Profile profile = this.n0;
        if (!zB && !str.equals(((InitResponse) initResponseApiB).f.f28201a)) {
            classLoggerApi.d("Install resend ID changed");
            profile.l().x(0L);
            profile.l().o(new InstallAttributionResponse());
        }
        String str2 = initResponseA.k.f28225b;
        if (!TextUtil.b(str2) && !str2.equals(((InitResponse) initResponseApiB).k.f28225b)) {
            classLoggerApi.d("Push Token resend ID changed");
            profile.h().d(0L);
        }
        String str3 = initResponseA.f28180c.f28197c;
        if (!TextUtil.b(str3)) {
            classLoggerApi.d("Applying App GUID override");
            profile.m().i(str3);
        }
        String str4 = initResponseA.f28180c.d;
        if (!TextUtil.b(str4)) {
            classLoggerApi.d("Applying KDID override");
            profile.m().l(str4);
        }
        classLoggerApi.d("Init Configuration");
        classLoggerApi.d(initResponseA.b());
        synchronized (this.o0.f) {
        }
        StringBuilder sb2 = new StringBuilder("Intelligent Consent is ");
        sb2.append(initResponseA.j.f.f28222a ? "Enabled" : "Disabled");
        sb2.append(" and ");
        sb2.append(initResponseA.j.f.f28223b ? "applies" : "does not apply");
        sb2.append(" to this user");
        com.kochava.tracker.log.internal.Logger.a(classLoggerApi, sb2.toString());
        if (initResponseA.j.f.f28222a) {
            classLoggerApi.a("Intelligent Consent status is ".concat(this.n0.n().b().X));
        }
        com.kochava.tracker.log.internal.Logger.a(classLoggerApi, "Completed kvinit at " + TimeUtil.c(this.o0.f28115a) + " seconds with a network duration of " + (networkBaseResponse.f28044a / 1000.0d) + " seconds");
    }

    @Override // com.kochava.core.job.internal.Job
    public final long t() {
        return 0L;
    }

    @Override // com.kochava.core.job.internal.Job
    public final boolean v() {
        long j;
        Profile profile = this.n0;
        InitResponseApi initResponseApiB = profile.k().b();
        ProfileInit profileInitK = profile.k();
        synchronized (profileInitK) {
            j = profileInitK.d;
        }
        return j + TimeUtil.b(((InitResponse) initResponseApiB).f28181e.f28187a) <= System.currentTimeMillis() || !((j > this.o0.f28115a ? 1 : (j == this.o0.f28115a ? 0 : -1)) >= 0);
    }
}
