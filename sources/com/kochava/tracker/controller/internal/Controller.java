package com.kochava.tracker.controller.internal;

import android.content.Context;
import com.kochava.core.activity.internal.ActivityMonitor;
import com.kochava.core.activity.internal.ActivityMonitorChangedListener;
import com.kochava.core.identity.internal.IdentityChangedListener;
import com.kochava.core.job.internal.Job;
import com.kochava.core.job.internal.JobApi;
import com.kochava.core.job.internal.JobCompletedListener;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.module.internal.ModuleDetails;
import com.kochava.core.module.internal.ModuleDetailsApi;
import com.kochava.core.profile.internal.ProfileLoadedListener;
import com.kochava.core.ratelimit.internal.RateLimit;
import com.kochava.core.storage.queue.internal.StorageQueueChangedAction;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.task.manager.internal.TaskManagerApi;
import com.kochava.core.task.manager.internal.UncaughtExceptionHandler;
import com.kochava.core.util.internal.ObjectUtil;
import com.kochava.core.util.internal.TextUtil;
import com.kochava.core.util.internal.TimeUtil;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.attribution.internal.JobRetrieveInstallAttribution;
import com.kochava.tracker.datapoint.internal.DataPointCollectionInstance;
import com.kochava.tracker.datapoint.internal.DataPointManager;
import com.kochava.tracker.deeplinks.internal.JobProcessDeferredDeeplink;
import com.kochava.tracker.deeplinks.internal.JobProcessStandardDeeplink;
import com.kochava.tracker.huaweireferrer.internal.JobHuaweiReferrer;
import com.kochava.tracker.identifiers.internal.JobIdentifiers;
import com.kochava.tracker.init.internal.InitResponse;
import com.kochava.tracker.init.internal.InitResponseApi;
import com.kochava.tracker.init.internal.InitResponsePrivacy;
import com.kochava.tracker.init.internal.JobInit;
import com.kochava.tracker.install.internal.JobInstall;
import com.kochava.tracker.install.internal.JobUpdateIdentityLink;
import com.kochava.tracker.install.internal.JobUpdateInstall;
import com.kochava.tracker.installreferrer.internal.JobInstallReferrer;
import com.kochava.tracker.modules.engagement.internal.EngagementModuleApi;
import com.kochava.tracker.modules.engagement.internal.JobPush;
import com.kochava.tracker.modules.engagement.internal.JobUpdatePush;
import com.kochava.tracker.modules.events.internal.EventsModuleApi;
import com.kochava.tracker.modules.events.internal.JobEvent;
import com.kochava.tracker.modules.internal.Modules;
import com.kochava.tracker.payload.internal.JobPayloadQueue;
import com.kochava.tracker.payload.internal.PayloadQueueChangedListener;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.payload.internal.url.RotationUrl;
import com.kochava.tracker.payload.internal.url.RotationUrlVariationApi;
import com.kochava.tracker.privacy.internal.ConsentState;
import com.kochava.tracker.privacy.internal.PrivacyDenyListChangedListener;
import com.kochava.tracker.privacy.internal.PrivacyProfileApi;
import com.kochava.tracker.privacy.internal.PrivacyProfileManager;
import com.kochava.tracker.profile.internal.Profile;
import com.kochava.tracker.profile.internal.ProfileInit;
import com.kochava.tracker.profile.internal.ProfileMain;
import com.kochava.tracker.profile.internal.ProfilePrivacy;
import com.kochava.tracker.samsungreferrer.JobSamsungReferrer;
import com.kochava.tracker.session.internal.SessionManager;
import com.p004ironsource.d9;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class Controller implements ControllerApi, ProfileLoadedListener, JobCompletedListener, UncaughtExceptionHandler, ActivityMonitorChangedListener, PayloadQueueChangedListener, HostSleepChangedListener, ConsentStateChangedListener, AppLimitAdTrackingChangedListener, IdentityChangedListener, PrivacyProfileListener, PrivacyDenyListChangedListener {
    public static final ClassLoggerApi y = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "Controller");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RateLimit f28104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataPointManager f28105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActivityMonitor f28106c;
    public final Profile d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SessionManager f28107e;
    public final PrivacyProfileManager f;
    public final JobController g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JobInit f28108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final JobInstallReferrer f28109i;
    public final JobHuaweiReferrer j;
    public final JobSamsungReferrer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final JobIdentifiers f28110l;
    public final JobInstall m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final JobUpdateInstall f28111n;
    public final JobUpdatePush o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final JobPayloadQueue f28112p;
    public final ArrayDeque q = new ArrayDeque();
    public final ArrayDeque r = new ArrayDeque();
    public final ArrayDeque s = new ArrayDeque();
    public final ArrayDeque t = new ArrayDeque();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayDeque f28113u = new ArrayDeque();
    public final ArrayDeque v = new ArrayDeque();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayDeque f28114w = new ArrayDeque();
    public final InstanceState x;

    class a implements Runnable {
        public final /* synthetic */ Job X;

        public a(Job job) {
            this.X = job;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.X.start();
        }
    }

    public Controller(InstanceState instanceState) {
        EngagementModuleApi engagementModuleApi;
        this.x = instanceState;
        List list = instanceState.f28117c.d;
        list.remove(this);
        list.add(this);
        RateLimit rateLimit = new RateLimit();
        rateLimit.f28054a = 0L;
        rateLimit.f28055b = 0L;
        rateLimit.f28056c = false;
        this.f28104a = rateLimit;
        DataPointManager dataPointManager = new DataPointManager();
        this.f28105b = dataPointManager;
        ActivityMonitor activityMonitor = new ActivityMonitor(instanceState.f28116b, instanceState.f28117c);
        this.f28106c = activityMonitor;
        Profile profile = new Profile(instanceState.f28116b, instanceState.f28117c, instanceState.f28115a);
        this.d = profile;
        SessionManager sessionManager = new SessionManager(profile, instanceState, activityMonitor, dataPointManager);
        this.f28107e = sessionManager;
        this.f = new PrivacyProfileManager(instanceState.f28117c);
        Context context = instanceState.f28116b;
        Modules modules = new Modules(context);
        this.g = new JobController("JobController", instanceState.f28117c, TaskQueue.IO, this);
        this.f28108h = new JobInit(this, profile, instanceState, dataPointManager, sessionManager);
        this.f28109i = new JobInstallReferrer(this, profile, instanceState);
        this.j = new JobHuaweiReferrer(this, profile, instanceState);
        this.k = new JobSamsungReferrer(this, profile, instanceState);
        this.f28110l = new JobIdentifiers(this, instanceState, dataPointManager, sessionManager);
        this.m = new JobInstall(this, profile, instanceState, dataPointManager, sessionManager, rateLimit);
        this.f28111n = new JobUpdateInstall(this, profile, instanceState, dataPointManager, sessionManager, null);
        this.o = new JobUpdatePush(this, profile, instanceState, dataPointManager, sessionManager);
        this.f28112p = new JobPayloadQueue(this, profile, instanceState, dataPointManager, sessionManager, rateLimit);
        DataPointCollectionInstance dataPointCollectionInstanceC = dataPointManager.c();
        synchronized (dataPointCollectionInstanceC) {
            engagementModuleApi = null;
            dataPointCollectionInstanceC.d = null;
        }
        DataPointCollectionInstance dataPointCollectionInstanceC2 = dataPointManager.c();
        String str = instanceState.f28118e;
        synchronized (dataPointCollectionInstanceC2) {
            dataPointCollectionInstanceC2.f28146n = str;
        }
        DataPointCollectionInstance dataPointCollectionInstanceC3 = dataPointManager.c();
        synchronized (dataPointCollectionInstanceC3) {
            dataPointCollectionInstanceC3.f = "AndroidTracker 4.3.0";
        }
        dataPointManager.c().o();
        dataPointManager.c().j(instanceState.d);
        ModuleDetailsApi moduleDetailsApi = instanceState.g;
        if (moduleDetailsApi != null) {
            synchronized (modules) {
                if (moduleDetailsApi.isValid()) {
                    modules.f28251b = moduleDetailsApi;
                }
            }
        }
        synchronized (modules) {
            ModuleDetails moduleDetailsA = ModuleDetails.a(context, "com.kochava.core.BuildConfig");
            if (moduleDetailsA.f28032a) {
                modules.f28252c = moduleDetailsA;
            }
        }
        synchronized (modules) {
            ModuleDetails moduleDetailsA2 = ModuleDetails.a(context, "com.kochava.tracker.BuildConfig");
            if (moduleDetailsA2.f28032a) {
                modules.d = moduleDetailsA2;
            }
        }
        synchronized (modules) {
            ModuleDetails moduleDetailsA3 = ModuleDetails.a(context, "com.kochava.tracker.datapointnetwork.BuildConfig");
            if (moduleDetailsA3.f28032a) {
                modules.f28253e = moduleDetailsA3;
            }
        }
        synchronized (modules) {
            ModuleDetails moduleDetailsA4 = ModuleDetails.a(context, "com.kochava.tracker.legacyreferrer.BuildConfig");
            if (moduleDetailsA4.f28032a) {
                modules.f = moduleDetailsA4;
            }
        }
        synchronized (modules) {
            Object objA = Modules.a("com.kochava.tracker.events.Events");
            EventsModuleApi eventsModuleApi = !(objA instanceof EventsModuleApi) ? null : (EventsModuleApi) objA;
            if (eventsModuleApi != null) {
                eventsModuleApi.setController(this);
            }
            ModuleDetails moduleDetailsA5 = ModuleDetails.a(context, "com.kochava.tracker.events.BuildConfig");
            if (moduleDetailsA5.f28032a) {
                modules.g = moduleDetailsA5;
            }
        }
        synchronized (modules) {
            Object objA2 = Modules.a("com.kochava.tracker.engagement.Engagement");
            if (objA2 instanceof EngagementModuleApi) {
                engagementModuleApi = (EngagementModuleApi) objA2;
            }
            if (engagementModuleApi != null) {
                engagementModuleApi.a();
            }
            ModuleDetails moduleDetailsA6 = ModuleDetails.a(context, "com.kochava.tracker.engagement.BuildConfig");
            if (moduleDetailsA6.f28032a) {
                modules.f28254h = moduleDetailsA6;
            }
        }
        dataPointManager.c().m(modules.b());
        ClassLoggerApi classLoggerApi = y;
        classLoggerApi.d("Registered Modules");
        classLoggerApi.d(modules.b());
    }

    @Override // com.kochava.tracker.privacy.internal.PrivacyDenyListChangedListener
    public final synchronized void a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        DataPointManager dataPointManager = this.f28105b;
        PrivacyProfileManager privacyProfileManager = this.f;
        synchronized (privacyProfileManager) {
            arrayList = privacyProfileManager.f;
        }
        synchronized (dataPointManager) {
            dataPointManager.k = arrayList;
        }
        DataPointManager dataPointManager2 = this.f28105b;
        PrivacyProfileManager privacyProfileManager2 = this.f;
        synchronized (privacyProfileManager2) {
            arrayList2 = privacyProfileManager2.g;
        }
        synchronized (dataPointManager2) {
            dataPointManager2.f28155l = arrayList2;
        }
    }

    @Override // com.kochava.tracker.controller.internal.ConsentStateChangedListener
    public final void b(ConsentState consentState) {
        Profile profile = this.d;
        profile.n().c(consentState);
        profile.n().d(System.currentTimeMillis());
        o();
    }

    @Override // com.kochava.tracker.controller.internal.AppLimitAdTrackingChangedListener
    public final synchronized void c(boolean z2) throws Throwable {
        try {
            try {
                this.v.offer(new JobUpdateInstall(this, this.d, this.x, this.f28105b, this.f28107e, Boolean.valueOf(z2)));
                m(this.v);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.kochava.core.activity.internal.ActivityMonitorChangedListener
    public final synchronized void d(boolean z2) {
        try {
            if (z2) {
                this.g.start();
            } else {
                n(true);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.kochava.core.task.manager.internal.UncaughtExceptionHandler
    public final void e(Thread thread, Throwable th) {
        String str = "UncaughtException, " + thread.getName();
        ClassLoggerApi classLoggerApi = y;
        classLoggerApi.b(str);
        classLoggerApi.b(th);
    }

    @Override // com.kochava.tracker.modules.internal.ModuleControllerApi
    public final TaskManagerApi f() {
        return this.x.f28117c;
    }

    @Override // com.kochava.core.activity.internal.ActivityMonitorChangedListener
    public final synchronized void g() {
    }

    @Override // com.kochava.tracker.payload.internal.PayloadQueueChangedListener
    public final synchronized void h(StorageQueueChangedAction storageQueueChangedAction) {
        if (storageQueueChangedAction != StorageQueueChangedAction.X) {
            return;
        }
        n(false);
    }

    @Override // com.kochava.tracker.modules.events.internal.EventsControllerApi
    public final synchronized void i(JsonObjectApi jsonObjectApi) throws Throwable {
        try {
            try {
                this.t.offer(new JobEvent(this, this.d, this.x, this.f28105b, this.f28107e, jsonObjectApi));
                m(this.t);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.kochava.core.job.internal.JobCompletedListener
    public final synchronized void j(JobApi jobApi, boolean z2) {
        try {
            ClassLoggerApi classLoggerApi = y;
            StringBuilder sb = new StringBuilder();
            sb.append(jobApi.getId());
            sb.append(" ");
            sb.append(z2 ? "succeeded" : d9.h.t);
            sb.append(" at ");
            sb.append(TimeUtil.c(this.x.f28115a));
            sb.append(" seconds with a duration of ");
            sb.append(jobApi.i() / 1000.0d);
            sb.append(" seconds");
            classLoggerApi.a(sb.toString());
            if (!z2) {
                classLoggerApi.d("Job failed, aborting");
                return;
            }
            if (jobApi == this.g) {
                s();
                t();
                return;
            }
            if (jobApi == this.f28108h) {
                q();
                s();
                l(this.f28109i);
                l(this.j);
                l(this.k);
                l(this.f28110l);
                return;
            }
            JobInstallReferrer jobInstallReferrer = this.f28109i;
            if (jobApi != jobInstallReferrer && jobApi != this.j && jobApi != this.k && jobApi != this.f28110l) {
                if (jobApi == this.m) {
                    m(this.q);
                    l(this.f28111n);
                    return;
                }
                if (jobApi == this.f28111n) {
                    l(this.o);
                }
                if (jobApi == this.o) {
                    n(false);
                    return;
                }
                if (!(jobApi instanceof JobProcessStandardDeeplink) && !jobApi.getId().equals("JobProcessStandardDeeplink")) {
                    if (!(jobApi instanceof JobProcessDeferredDeeplink) && !jobApi.getId().equals("JobProcessDeferredDeeplink")) {
                        if (!(jobApi instanceof JobRetrieveInstallAttribution) && !jobApi.getId().equals("JobRetrieveInstallAttribution")) {
                            if (!(jobApi instanceof JobEvent) && !jobApi.getId().equals("JobEvent")) {
                                if (!(jobApi instanceof JobUpdateInstall) && !jobApi.getId().equals("JobUpdateInstall")) {
                                    if (!(jobApi instanceof JobUpdateIdentityLink) && !jobApi.getId().equals("JobUpdateIdentityLink")) {
                                        if ((jobApi instanceof JobPush) || jobApi.getId().equals("JobPush")) {
                                            p(this.f28113u);
                                            return;
                                        }
                                        return;
                                    }
                                    p(this.f28114w);
                                    return;
                                }
                                q();
                                p(this.v);
                                return;
                            }
                            p(this.t);
                            return;
                        }
                        p(this.q);
                        return;
                    }
                    p(this.s);
                    return;
                }
                p(this.r);
                return;
            }
            if (jobInstallReferrer.h() && this.j.h() && this.k.h() && this.f28110l.h()) {
                q();
                StringBuilder sb2 = new StringBuilder("The install ");
                sb2.append(this.d.l().m() ? "has already" : "has not yet");
                sb2.append(" been sent");
                com.kochava.tracker.log.internal.Logger.a(classLoggerApi, sb2.toString());
                l(this.m);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.kochava.tracker.privacy.internal.PrivacyDenyListChangedListener
    public final synchronized void k() {
        boolean z2;
        PrivacyProfileManager privacyProfileManager = this.f;
        synchronized (privacyProfileManager) {
            z2 = privacyProfileManager.f28279h;
        }
        this.x.f.h(z2);
        if (!z2) {
            this.g.start();
        }
    }

    public final void l(Job job) {
        this.x.f28117c.b(new a(job));
    }

    public final void m(ArrayDeque arrayDeque) {
        JobApi jobApi = (JobApi) arrayDeque.peek();
        if (!this.d.a() || jobApi == null || jobApi.h() || !jobApi.j()) {
            return;
        }
        jobApi.start();
    }

    public final void n(boolean z2) {
        if (this.d.a()) {
            JobInit jobInit = this.f28108h;
            if (jobInit.h()) {
                JobPayloadQueue jobPayloadQueue = this.f28112p;
                if (z2 && jobPayloadQueue.w()) {
                    jobPayloadQueue.m();
                }
                if (jobPayloadQueue.j() && !jobInit.w()) {
                    if (jobInit.j()) {
                        t();
                    } else {
                        jobPayloadQueue.start();
                    }
                }
            }
        }
    }

    public final void o() {
        long j;
        Profile profile = this.d;
        ConsentState consentStateB = profile.n().b();
        ProfilePrivacy profilePrivacyN = profile.n();
        synchronized (profilePrivacyN) {
            j = profilePrivacyN.d;
        }
        boolean z2 = ((InitResponse) profile.k().b()).j.f.f28222a;
        boolean z3 = ((InitResponse) profile.k().b()).j.f.f28223b;
        DataPointManager dataPointManager = this.f28105b;
        if (z2) {
            JsonObject jsonObjectW = JsonObject.w();
            jsonObjectW.o("required", z3);
            if (consentStateB == ConsentState.GRANTED) {
                jsonObjectW.B(j / 1000, "time");
            }
            dataPointManager.c().e(jsonObjectW);
        } else {
            dataPointManager.c().e(null);
        }
        PrivacyProfileManager privacyProfileManager = this.f;
        if (z2 && z3 && (consentStateB == ConsentState.DECLINED || consentStateB == ConsentState.NOT_ANSWERED)) {
            privacyProfileManager.f("_gdpr", true);
        } else {
            privacyProfileManager.f("_gdpr", false);
        }
    }

    public final void p(ArrayDeque arrayDeque) {
        arrayDeque.poll();
        m(arrayDeque);
    }

    public final void q() {
        String strB;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        InitResponseApi initResponseApiB = this.d.k().b();
        String strD = this.d.m().d();
        this.x.getClass();
        this.f28105b.c().d(ObjectUtil.b(strD, "kom21-ani4k-anime-wallpaper-hd-2zca3", new String[0]));
        DataPointCollectionInstance dataPointCollectionInstanceC = this.f28105b.c();
        synchronized (this) {
            strB = ObjectUtil.b(this.d.m().f(), this.d.m().e(), new String[0]);
        }
        dataPointCollectionInstanceC.g(strB);
        DataPointCollectionInstance dataPointCollectionInstanceC2 = this.f28105b.c();
        String str = ((InitResponse) initResponseApiB).f28181e.f28188b;
        if (TextUtil.b(str)) {
            str = null;
        }
        dataPointCollectionInstanceC2.i(str);
        this.f28105b.c().l(this.d.l().f());
        DataPointManager dataPointManager = this.f28105b;
        InitResponse initResponse = (InitResponse) initResponseApiB;
        InitResponsePrivacy initResponsePrivacy = initResponse.j;
        initResponsePrivacy.getClass();
        ArrayList arrayList3 = new ArrayList(Arrays.asList(initResponsePrivacy.f28220c));
        synchronized (dataPointManager) {
            dataPointManager.g = arrayList3;
        }
        DataPointManager dataPointManager2 = this.f28105b;
        InitResponsePrivacy initResponsePrivacy2 = initResponse.j;
        initResponsePrivacy2.getClass();
        ArrayList arrayList4 = new ArrayList(Arrays.asList(initResponsePrivacy2.f28219b));
        synchronized (dataPointManager2) {
            dataPointManager2.f = new ArrayList(arrayList4);
        }
        DataPointManager dataPointManager3 = this.f28105b;
        ArrayList arrayList5 = new ArrayList();
        if (!initResponse.f28184l.f28229a) {
            arrayList5.add(PayloadType.r0);
            arrayList5.add(PayloadType.s0);
        }
        if (!initResponse.k.f28224a) {
            arrayList5.add(PayloadType.p0);
            arrayList5.add(PayloadType.q0);
        }
        if (!initResponse.f.f28202b) {
            arrayList5.add(PayloadType.m0);
        }
        if (!initResponse.f28178a.f28185a) {
            arrayList5.add(PayloadType.n0);
        }
        synchronized (dataPointManager3) {
            dataPointManager3.f28153h = arrayList5;
        }
        DataPointManager dataPointManager4 = this.f28105b;
        InitResponsePrivacy initResponsePrivacy3 = initResponse.j;
        initResponsePrivacy3.getClass();
        dataPointManager4.g(new ArrayList(Arrays.asList(initResponsePrivacy3.d)));
        DataPointManager dataPointManager5 = this.f28105b;
        InitResponsePrivacy initResponsePrivacy4 = initResponse.j;
        initResponsePrivacy4.getClass();
        dataPointManager5.i(new ArrayList(Arrays.asList(initResponsePrivacy4.f28221e)));
        this.f28105b.c().p(this.d.m().g());
        this.f28105b.c().n(this.d.h().b());
        this.f28105b.c().h(this.d.l().d());
        this.f28105b.c().k(this.d.l().o);
        this.f28105b.b().p(this.d.l().e());
        this.f28105b.b().o(this.d.l().c());
        this.f28105b.b().q(this.d.l().h());
        this.f28105b.b().i(this.d.l().b());
        this.f28105b.b().h(Boolean.valueOf(this.d.l().l()));
        RateLimit rateLimit = this.f28104a;
        double d = initResponse.f28183i.f28209b;
        rateLimit.b(d < 0.0d ? -1L : TimeUtil.b(d));
        PayloadType.f(initResponse.f28183i.f28210c);
        PrivacyProfileManager privacyProfileManager = this.f;
        InitResponsePrivacy initResponsePrivacy5 = initResponse.j;
        initResponsePrivacy5.getClass();
        privacyProfileManager.e(new ArrayList(Arrays.asList(initResponsePrivacy5.f28218a)));
        this.f.f("_alat", this.d.l().l());
        this.f.f("_dlat", this.f28105b.b().f());
        DataPointManager dataPointManager6 = this.f28105b;
        PrivacyProfileManager privacyProfileManager2 = this.f;
        synchronized (privacyProfileManager2) {
            arrayList = privacyProfileManager2.f;
        }
        synchronized (dataPointManager6) {
            dataPointManager6.k = arrayList;
        }
        DataPointManager dataPointManager7 = this.f28105b;
        PrivacyProfileManager privacyProfileManager3 = this.f;
        synchronized (privacyProfileManager3) {
            arrayList2 = privacyProfileManager3.g;
        }
        synchronized (dataPointManager7) {
            dataPointManager7.f28155l = arrayList2;
        }
        MutableState mutableState = this.x.f;
        PrivacyProfileManager privacyProfileManager4 = this.f;
        synchronized (privacyProfileManager4) {
            z2 = privacyProfileManager4.f28279h;
        }
        mutableState.h(z2);
        o();
        if (this.d.k().d()) {
            this.f28105b.c().f(((InitResponse) this.d.k().b()).f28179b.d);
        }
        this.f28105b.h(this.d.k().c());
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0135 A[Catch: all -> 0x0031, LOOP:1: B:46:0x012f->B:48:0x0135, LOOP_END, TryCatch #1 {all -> 0x0031, blocks: (B:4:0x0005, B:6:0x0019, B:9:0x0034, B:10:0x0050, B:16:0x0059, B:18:0x005c, B:20:0x0062, B:22:0x0082, B:24:0x00a2, B:25:0x00bc, B:27:0x00c2, B:30:0x00d1, B:31:0x00e5, B:33:0x0101, B:34:0x010f, B:36:0x0112, B:40:0x0116, B:41:0x0117, B:42:0x0122, B:44:0x012a, B:45:0x012b, B:46:0x012f, B:48:0x0135, B:49:0x0141, B:51:0x0149, B:52:0x014a, B:53:0x0152, B:55:0x0158, B:56:0x0174, B:57:0x0186, B:58:0x0187, B:59:0x0188, B:61:0x01b3, B:62:0x01d1, B:63:0x01df, B:66:0x01e4, B:73:0x0200, B:74:0x020c, B:72:0x01ff, B:78:0x0210, B:81:0x0213, B:84:0x0216, B:21:0x007f, B:87:0x0219, B:50:0x0142, B:43:0x0123, B:35:0x0110, B:11:0x0051, B:64:0x01e0, B:68:0x01e6, B:71:0x01f5), top: B:92:0x0005, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0158 A[Catch: all -> 0x0031, LOOP:2: B:53:0x0152->B:55:0x0158, LOOP_END, TryCatch #1 {all -> 0x0031, blocks: (B:4:0x0005, B:6:0x0019, B:9:0x0034, B:10:0x0050, B:16:0x0059, B:18:0x005c, B:20:0x0062, B:22:0x0082, B:24:0x00a2, B:25:0x00bc, B:27:0x00c2, B:30:0x00d1, B:31:0x00e5, B:33:0x0101, B:34:0x010f, B:36:0x0112, B:40:0x0116, B:41:0x0117, B:42:0x0122, B:44:0x012a, B:45:0x012b, B:46:0x012f, B:48:0x0135, B:49:0x0141, B:51:0x0149, B:52:0x014a, B:53:0x0152, B:55:0x0158, B:56:0x0174, B:57:0x0186, B:58:0x0187, B:59:0x0188, B:61:0x01b3, B:62:0x01d1, B:63:0x01df, B:66:0x01e4, B:73:0x0200, B:74:0x020c, B:72:0x01ff, B:78:0x0210, B:81:0x0213, B:84:0x0216, B:21:0x007f, B:87:0x0219, B:50:0x0142, B:43:0x0123, B:35:0x0110, B:11:0x0051, B:64:0x01e0, B:68:0x01e6, B:71:0x01f5), top: B:92:0x0005, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0187 A[Catch: all -> 0x0031, DONT_GENERATE, TryCatch #1 {all -> 0x0031, blocks: (B:4:0x0005, B:6:0x0019, B:9:0x0034, B:10:0x0050, B:16:0x0059, B:18:0x005c, B:20:0x0062, B:22:0x0082, B:24:0x00a2, B:25:0x00bc, B:27:0x00c2, B:30:0x00d1, B:31:0x00e5, B:33:0x0101, B:34:0x010f, B:36:0x0112, B:40:0x0116, B:41:0x0117, B:42:0x0122, B:44:0x012a, B:45:0x012b, B:46:0x012f, B:48:0x0135, B:49:0x0141, B:51:0x0149, B:52:0x014a, B:53:0x0152, B:55:0x0158, B:56:0x0174, B:57:0x0186, B:58:0x0187, B:59:0x0188, B:61:0x01b3, B:62:0x01d1, B:63:0x01df, B:66:0x01e4, B:73:0x0200, B:74:0x020c, B:72:0x01ff, B:78:0x0210, B:81:0x0213, B:84:0x0216, B:21:0x007f, B:87:0x0219, B:50:0x0142, B:43:0x0123, B:35:0x0110, B:11:0x0051, B:64:0x01e0, B:68:0x01e6, B:71:0x01f5), top: B:92:0x0005, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01b3 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:4:0x0005, B:6:0x0019, B:9:0x0034, B:10:0x0050, B:16:0x0059, B:18:0x005c, B:20:0x0062, B:22:0x0082, B:24:0x00a2, B:25:0x00bc, B:27:0x00c2, B:30:0x00d1, B:31:0x00e5, B:33:0x0101, B:34:0x010f, B:36:0x0112, B:40:0x0116, B:41:0x0117, B:42:0x0122, B:44:0x012a, B:45:0x012b, B:46:0x012f, B:48:0x0135, B:49:0x0141, B:51:0x0149, B:52:0x014a, B:53:0x0152, B:55:0x0158, B:56:0x0174, B:57:0x0186, B:58:0x0187, B:59:0x0188, B:61:0x01b3, B:62:0x01d1, B:63:0x01df, B:66:0x01e4, B:73:0x0200, B:74:0x020c, B:72:0x01ff, B:78:0x0210, B:81:0x0213, B:84:0x0216, B:21:0x007f, B:87:0x0219, B:50:0x0142, B:43:0x0123, B:35:0x0110, B:11:0x0051, B:64:0x01e0, B:68:0x01e6, B:71:0x01f5), top: B:92:0x0005, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01e4 A[Catch: all -> 0x0031, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:4:0x0005, B:6:0x0019, B:9:0x0034, B:10:0x0050, B:16:0x0059, B:18:0x005c, B:20:0x0062, B:22:0x0082, B:24:0x00a2, B:25:0x00bc, B:27:0x00c2, B:30:0x00d1, B:31:0x00e5, B:33:0x0101, B:34:0x010f, B:36:0x0112, B:40:0x0116, B:41:0x0117, B:42:0x0122, B:44:0x012a, B:45:0x012b, B:46:0x012f, B:48:0x0135, B:49:0x0141, B:51:0x0149, B:52:0x014a, B:53:0x0152, B:55:0x0158, B:56:0x0174, B:57:0x0186, B:58:0x0187, B:59:0x0188, B:61:0x01b3, B:62:0x01d1, B:63:0x01df, B:66:0x01e4, B:73:0x0200, B:74:0x020c, B:72:0x01ff, B:78:0x0210, B:81:0x0213, B:84:0x0216, B:21:0x007f, B:87:0x0219, B:50:0x0142, B:43:0x0123, B:35:0x0110, B:11:0x0051, B:64:0x01e0, B:68:0x01e6, B:71:0x01f5), top: B:92:0x0005, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01e6 A[Catch: all -> 0x020e, TRY_ENTER, TryCatch #5 {, blocks: (B:64:0x01e0, B:68:0x01e6, B:71:0x01f5), top: B:99:0x01e0, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f5 A[Catch: all -> 0x020e, TRY_LEAVE, TryCatch #5 {, blocks: (B:64:0x01e0, B:68:0x01e6, B:71:0x01f5), top: B:99:0x01e0, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void r() {
        boolean zL;
        boolean z2;
        Iterator it;
        MutableState mutableState;
        ConsentState consentStateB;
        ArrayList arrayListQ;
        MutableState mutableState2 = this.x.f;
        synchronized (mutableState2) {
            try {
                JsonObjectApi jsonObjectApiB = this.d.l().b();
                if (mutableState2.b().c()) {
                    JsonObject jsonObject = (JsonObject) jsonObjectApiB;
                    jsonObject.b(mutableState2.b().b());
                    this.d.l().p(jsonObject);
                }
                mutableState2.b().d(jsonObjectApiB);
                this.x.f.b().a(this);
                zL = this.d.l().l();
                synchronized (mutableState2) {
                    z2 = mutableState2.k != null;
                }
                it = new ArrayList(mutableState2.f28124i).iterator();
                while (it.hasNext()) {
                    this.f.d((PrivacyProfileApi) it.next());
                }
                synchronized (mutableState2) {
                    HashMap map = new HashMap(mutableState2.j);
                }
                for (Map.Entry entry : map.entrySet()) {
                    this.f.f((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
                List list = this.x.f.g;
                list.remove(this);
                list.add(this);
                synchronized (this.d.m()) {
                }
                ProfileMain profileMainM = this.d.m();
                this.x.getClass();
                profileMainM.m(false);
                this.x.getClass();
                List list2 = this.x.f.f28122e;
                list2.remove(this);
                list2.add(this);
                if (this.x.f.a() != ConsentState.NOT_ANSWERED) {
                    this.d.n().c(this.x.f.a());
                    this.d.n().d(System.currentTimeMillis());
                }
                mutableState = this.x.f;
                consentStateB = this.d.n().b();
                synchronized (mutableState) {
                    if (mutableState.m == consentStateB) {
                        mutableState.m = consentStateB;
                        arrayListQ = ObjectUtil.q(mutableState.f28123h);
                        if (arrayListQ.isEmpty()) {
                            mutableState.f28119a.b(new MutableState.e(arrayListQ, consentStateB));
                        }
                    }
                }
                List list3 = this.x.f.f28123h;
                list3.remove(this);
                list3.add(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2 || mutableState2.e() == zL) {
            mutableState2.g(zL);
        } else {
            this.v.offer(new JobUpdateInstall(this, this.d, this.x, this.f28105b, this.f28107e, Boolean.valueOf(mutableState2.e())));
        }
        List list4 = this.x.f.f;
        list4.remove(this);
        list4.add(this);
        JsonObjectApi jsonObjectApiD = this.d.l().d();
        if (mutableState2.d().c()) {
            JsonObjectApi jsonObjectApiB2 = mutableState2.d().b();
            JsonObject jsonObject2 = (JsonObject) jsonObjectApiD;
            JsonObject jsonObjectT = jsonObject2.t(jsonObjectApiB2);
            jsonObject2.b(jsonObjectApiB2);
            for (String str : jsonObjectT.h()) {
                String string = jsonObjectT.getString(str, null);
                if (string != null) {
                    this.f28114w.offer(new JobUpdateIdentityLink(this, this.d, this.x, this.f28105b, this.f28107e, str, string));
                }
            }
        }
        mutableState2.d().d(jsonObjectApiD);
        this.x.f.d().a(this);
        if (mutableState2.c().c()) {
            DataPointCollectionInstance dataPointCollectionInstanceC = this.f28105b.c();
            JsonObjectApi jsonObjectApiB3 = mutableState2.c().b();
            synchronized (dataPointCollectionInstanceC) {
                dataPointCollectionInstanceC.k = jsonObjectApiB3;
            }
        }
        this.x.f.c().a(this);
        synchronized (mutableState2) {
            it = new ArrayList(mutableState2.f28124i).iterator();
            while (it.hasNext()) {
                this.f.d((PrivacyProfileApi) it.next());
            }
            synchronized (mutableState2) {
                HashMap map2 = new HashMap(mutableState2.j);
                while (r0.hasNext()) {
                    this.f.f((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
                List list5 = this.x.f.g;
                list5.remove(this);
                list5.add(this);
                synchronized (this.d.m()) {
                    ProfileMain profileMainM2 = this.d.m();
                    this.x.getClass();
                    profileMainM2.m(false);
                    this.x.getClass();
                    List list6 = this.x.f.f28122e;
                    list6.remove(this);
                    list6.add(this);
                    if (this.x.f.a() != ConsentState.NOT_ANSWERED) {
                        this.d.n().c(this.x.f.a());
                        this.d.n().d(System.currentTimeMillis());
                    }
                    mutableState = this.x.f;
                    consentStateB = this.d.n().b();
                    synchronized (mutableState) {
                        if (mutableState.m == consentStateB) {
                            mutableState.m = consentStateB;
                            arrayListQ = ObjectUtil.q(mutableState.f28123h);
                            if (arrayListQ.isEmpty()) {
                                mutableState.f28119a.b(new MutableState.e(arrayListQ, consentStateB));
                            }
                        }
                        List list7 = this.x.f.f28123h;
                        list7.remove(this);
                        list7.add(this);
                    }
                }
            }
        }
    }

    public final void s() {
        m(this.r);
        m(this.s);
        m(this.q);
        m(this.v);
        m(this.f28114w);
        m(this.f28113u);
        m(this.t);
    }

    public final void t() {
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        if (!this.f28108h.w()) {
            PayloadType payloadType = PayloadType.k0;
            ProfileInit profileInitK = this.d.k();
            synchronized (profileInitK) {
                i2 = profileInitK.f;
            }
            ProfileInit profileInitK2 = this.d.k();
            synchronized (profileInitK2) {
                i3 = profileInitK2.g;
            }
            ProfileInit profileInitK3 = this.d.k();
            synchronized (profileInitK3) {
                z2 = profileInitK3.f28287h;
            }
            synchronized (payloadType) {
                payloadType.h0 = i2;
                payloadType.i0 = i3;
                payloadType.j0 = z2;
                Date date = new Date(System.currentTimeMillis());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                Integer numH = ObjectUtil.h(simpleDateFormat.format(date));
                int iIntValue = (numH != null ? numH : 0).intValue();
                RotationUrl rotationUrl = payloadType.e0;
                if (rotationUrl == null) {
                    rotationUrl = new RotationUrl();
                }
                RotationUrlVariationApi rotationUrlVariationApiA = rotationUrl.a(iIntValue);
                if (rotationUrlVariationApiA == null) {
                    payloadType.h0 = 0;
                    payloadType.i0 = 0;
                    payloadType.j0 = false;
                } else {
                    int iA = rotationUrlVariationApiA.a();
                    if (i2 != iA) {
                        payloadType.h0 = iA;
                        payloadType.i0 = 0;
                        payloadType.j0 = false;
                    }
                    if (payloadType.i0 >= rotationUrlVariationApiA.b().length) {
                        payloadType.i0 = 0;
                    }
                }
            }
            ProfileInit profileInitK4 = this.d.k();
            synchronized (payloadType) {
                i4 = payloadType.h0;
            }
            profileInitK4.h(i4);
            ProfileInit profileInitK5 = this.d.k();
            synchronized (payloadType) {
                i5 = payloadType.i0;
            }
            profileInitK5.i(i5);
            ProfileInit profileInitK6 = this.d.k();
            synchronized (payloadType) {
                z3 = payloadType.j0;
            }
            profileInitK6.j(z3);
        }
        l(this.f28108h);
    }

    public final synchronized void u() {
        this.d.d(this);
    }

    public final synchronized void v() {
        this.d.i().d(this);
        this.d.r().d(this);
        this.d.j().d(this);
        this.d.q().d(this);
        this.d.p().d(this);
        this.d.g().d(this);
        List list = this.f.f28276b;
        list.remove(this);
        list.add(this);
        this.f28106c.a(this);
    }
}
