package com.kochava.tracker.identifiers.internal;

import android.content.Context;
import android.provider.Settings;
import android.util.Pair;
import com.kochava.core.job.internal.Job;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.util.internal.TimeUtil;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.controller.internal.Controller;
import com.kochava.tracker.controller.internal.InstanceState;
import com.kochava.tracker.datapoint.internal.DataPointManager;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.session.internal.SessionManager;

/* JADX INFO: loaded from: classes5.dex */
public class JobIdentifiers extends Job {
    public static final ClassLoggerApi s0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "JobIdentifiers");
    public final InstanceState n0;
    public final DataPointManager o0;
    public final SessionManager p0;
    public final Identifiers q0;
    public long r0;

    public JobIdentifiers(Controller controller, InstanceState instanceState, DataPointManager dataPointManager, SessionManager sessionManager) {
        super("JobIdentifiers", instanceState.f28117c, TaskQueue.IO, controller);
        this.q0 = new Identifiers();
        this.r0 = 0L;
        this.n0 = instanceState;
        this.o0 = dataPointManager;
        this.p0 = sessionManager;
    }

    @Override // com.kochava.core.job.internal.Job
    public final void p() {
        boolean z2;
        Identifiers identifiers = this.q0;
        DataPointManager dataPointManager = this.o0;
        StringBuilder sb = new StringBuilder("Started at ");
        InstanceState instanceState = this.n0;
        long j = instanceState.f28115a;
        Context context = instanceState.f28116b;
        sb.append(TimeUtil.c(j));
        sb.append(" seconds");
        String string = sb.toString();
        ClassLoggerApi classLoggerApi = s0;
        classLoggerApi.a(string);
        boolean z3 = true;
        try {
            if (dataPointManager.f(PayloadType.l0, "adid")) {
                Pair pairC = identifiers.c(context);
                dataPointManager.b().l((String) pairC.first, (Boolean) pairC.second);
                com.kochava.tracker.log.internal.Logger.a(classLoggerApi, "Collection of ADID succeeded");
                z2 = true;
            } else {
                com.kochava.tracker.log.internal.Logger.a(classLoggerApi, "Collection of ADID denied");
                dataPointManager.b().l(null, null);
                z2 = false;
            }
        } catch (Throwable th) {
            com.kochava.tracker.log.internal.Logger.a(classLoggerApi, "Collection of ADID failed");
            classLoggerApi.d(th.getMessage());
            dataPointManager.b().l(null, null);
        }
        try {
            if (dataPointManager.f(PayloadType.l0, "fire_adid")) {
                Pair pairB = identifiers.b(context);
                dataPointManager.b().k((String) pairB.first, (Boolean) pairB.second);
                classLoggerApi.a("Collection of FIRE ADID succeeded");
                z2 = true;
            } else {
                classLoggerApi.a("Collection of FIRE ADID denied");
                dataPointManager.b().k(null, null);
            }
        } catch (Throwable th2) {
            classLoggerApi.a("Collection of FIRE ADID failed");
            classLoggerApi.d(th2.getMessage());
            dataPointManager.b().k(null, null);
        }
        try {
            if (dataPointManager.f(PayloadType.l0, "oaid")) {
                Pair pairE = identifiers.e(context);
                dataPointManager.b().n((String) pairE.first, (Boolean) pairE.second);
                classLoggerApi.a("Collection of OAID succeeded");
            } else {
                classLoggerApi.a("Collection of OAID denied");
                dataPointManager.b().n(null, null);
                z3 = z2;
            }
        } catch (Throwable th3) {
            classLoggerApi.a("Collection of OAID failed");
            classLoggerApi.d(th3.getMessage());
            dataPointManager.b().n(null, null);
        }
        try {
            if (!dataPointManager.f(PayloadType.l0, "android_id") || z3) {
                if (z3) {
                    classLoggerApi.a("Collection of ANDROID ID denied as an advertising ID was already gathered");
                } else {
                    classLoggerApi.a("Collection of ANDROID ID denied");
                }
                dataPointManager.b().g(null);
            } else {
                identifiers.getClass();
                String string2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
                if (string2 == null) {
                    throw new Exception("Cannot retrieve Android ID");
                }
                dataPointManager.b().g(string2);
                classLoggerApi.a("Collection of ANDROID ID succeeded");
            }
        } catch (Throwable th4) {
            classLoggerApi.a("Collection of ANDROID ID failed");
            classLoggerApi.d(th4.getMessage());
            dataPointManager.b().g(null);
        }
        try {
            if (dataPointManager.f(PayloadType.l0, "fb_attribution_id")) {
                dataPointManager.b().j(identifiers.a(context));
                classLoggerApi.a("Collection of FB ATTRIBUTION ID succeeded");
            } else {
                classLoggerApi.a("Collection of FB ATTRIBUTION ID denied");
                dataPointManager.b().j(null);
            }
        } catch (Throwable th5) {
            classLoggerApi.a("Collection of FB ATTRIBUTION ID failed");
            classLoggerApi.d(th5.getMessage());
            dataPointManager.b().j(null);
        }
        try {
            if (dataPointManager.f(PayloadType.l0, "asid")) {
                Pair pairD = identifiers.d(context);
                dataPointManager.b().m((Integer) pairD.second, (String) pairD.first);
                classLoggerApi.a("Collection of ASID succeeded");
            } else {
                classLoggerApi.a("Collection of ASID denied");
                dataPointManager.b().m(null, null);
            }
        } catch (Throwable th6) {
            classLoggerApi.a("Collection of ASID failed");
            classLoggerApi.d(th6.getMessage());
            dataPointManager.b().m(null, null);
        }
        this.r0 = System.currentTimeMillis();
    }

    @Override // com.kochava.core.job.internal.Job
    public final long t() {
        return 0L;
    }

    @Override // com.kochava.core.job.internal.Job
    public final boolean v() {
        long j;
        SessionManager sessionManager = this.p0;
        synchronized (sessionManager) {
            j = sessionManager.f28324h;
        }
        InstanceState instanceState = this.n0;
        synchronized (instanceState.f) {
        }
        return !instanceState.f.f() && j >= this.r0;
    }
}
