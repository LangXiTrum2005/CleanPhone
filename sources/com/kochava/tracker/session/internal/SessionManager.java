package com.kochava.tracker.session.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.kochava.core.activity.internal.ActivityMonitor;
import com.kochava.core.activity.internal.ActivityMonitorChangedListener;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.util.internal.TimeUtil;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.controller.internal.InstanceState;
import com.kochava.tracker.datapoint.internal.DataPointManager;
import com.kochava.tracker.init.internal.InitResponse;
import com.kochava.tracker.payload.internal.Payload;
import com.kochava.tracker.payload.internal.PayloadApi;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.profile.internal.Profile;
import com.kochava.tracker.profile.internal.ProfileSession;

/* JADX INFO: loaded from: classes5.dex */
public final class SessionManager implements SessionManagerApi, ActivityMonitorChangedListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ClassLoggerApi f28319i = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "SessionManager");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Profile f28320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstanceState f28321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActivityMonitor f28322c;
    public final DataPointManager d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f28323e = null;
    public boolean f = false;
    public boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f28324h = 0;

    class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (SessionManager.this.f28320a.o()) {
                try {
                    PayloadApi payloadApiB = SessionManager.this.f28320a.o().b();
                    if (payloadApiB == null) {
                        return;
                    }
                    SessionManager sessionManager = SessionManager.this;
                    payloadApiB.d(sessionManager.f28321b.f28116b, sessionManager.d);
                    SessionManager.this.f28320a.o().g(payloadApiB);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    class b implements Runnable {
        public final /* synthetic */ Payload X;

        public b(Payload payload) {
            this.X = payload;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SessionManager sessionManager = SessionManager.this;
            InstanceState instanceState = sessionManager.f28321b;
            DataPointManager dataPointManager = sessionManager.d;
            Payload payload = this.X;
            payload.d(instanceState.f28116b, dataPointManager);
            sessionManager.f28320a.p().c(payload);
        }
    }

    public SessionManager(Profile profile, InstanceState instanceState, ActivityMonitor activityMonitor, DataPointManager dataPointManager) {
        this.f28321b = instanceState;
        this.f28320a = profile;
        this.f28322c = activityMonitor;
        this.d = dataPointManager;
    }

    public final Payload a(long j, boolean z2) {
        InstanceState instanceState = this.f28321b;
        Profile profile = this.f28320a;
        if (z2) {
            return Payload.g(PayloadType.r0, instanceState.f28115a, profile.m().g(), j, 0L, true, 1);
        }
        return Payload.g(PayloadType.s0, instanceState.f28115a, profile.m().g(), j, profile.o().f(), true, profile.o().e());
    }

    public final void b() {
        boolean z2 = ((InitResponse) this.f28320a.k().b()).f28184l.f28229a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f28324h = jCurrentTimeMillis;
        if (jCurrentTimeMillis <= TimeUtil.b(((InitResponse) this.f28320a.k().b()).f28184l.f28231c) + this.f28320a.o().d()) {
            f28319i.d("Within session window, incrementing active count");
            this.f28320a.o().k(this.f28320a.o().e() + 1);
            return;
        }
        this.f28320a.o().j(jCurrentTimeMillis);
        this.f28320a.o().i(false);
        this.f28320a.o().l(0L);
        this.f28320a.o().k(1);
        this.f28320a.o().h(this.f28320a.o().c() + 1);
        synchronized (this.f28320a.o()) {
            try {
                PayloadApi payloadApiB = this.f28320a.o().b();
                if (payloadApiB != null) {
                    f28319i.d("Queuing deferred session end to send");
                    this.f28320a.p().c(payloadApiB);
                    this.f28320a.o().g(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            f28319i.d("Sessions disabled, not creating session");
            return;
        }
        f28319i.d("Queuing session begin to send");
        Payload payloadA = a(jCurrentTimeMillis, true);
        InstanceState instanceState = this.f28321b;
        instanceState.f28117c.h(new b(payloadA));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0087  */
    /* JADX WARN: Code duplicated, block: B:19:0x008e  */
    public final void c() {
        boolean z2;
        Profile profile = this.f28320a;
        boolean z3 = ((InitResponse) profile.k().b()).f28184l.f28229a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        profile.o().l(profile.o().f() + (jCurrentTimeMillis - this.f28324h));
        ProfileSession profileSessionO = profile.o();
        synchronized (profileSessionO) {
            z2 = profileSessionO.f28311e;
        }
        ClassLoggerApi classLoggerApi = f28319i;
        if (z2) {
            classLoggerApi.d("Session end already sent this window, aborting");
            return;
        }
        if (profile.o().c() > 1) {
            if (jCurrentTimeMillis <= TimeUtil.b(((InitResponse) profile.k().b()).f28184l.f28230b) + profile.o().d()) {
                classLoggerApi.d("Updating cached session end");
                if (z3) {
                    profile.o().g(a(jCurrentTimeMillis, false));
                    this.f28321b.f28117c.h(new a());
                }
            } else {
                classLoggerApi.d("Queuing session end to send");
                if (z3) {
                    Payload payloadA = a(jCurrentTimeMillis, false);
                    InstanceState instanceState = this.f28321b;
                    instanceState.f28117c.h(new b(payloadA));
                }
                profile.o().i(true);
                profile.o().g(null);
            }
        } else {
            classLoggerApi.d("Queuing session end to send");
            if (z3) {
                Payload payloadA2 = a(jCurrentTimeMillis, false);
                InstanceState instanceState2 = this.f28321b;
                instanceState2.f28117c.h(new b(payloadA2));
            }
            profile.o().i(true);
            profile.o().g(null);
        }
        if (z3) {
            return;
        }
        classLoggerApi.d("Sessions disabled, not creating session");
    }

    @Override // com.kochava.core.activity.internal.ActivityMonitorChangedListener
    public final synchronized void d(boolean z2) {
        try {
            ClassLoggerApi classLoggerApi = f28319i;
            classLoggerApi.d("Active state has changed to ".concat(z2 ? AppMeasurementSdk.ConditionalUserProperty.ACTIVE : "inactive"));
            if (this.f28324h == 0) {
                classLoggerApi.d("Not started yet, setting initial active state");
                this.f28323e = Boolean.valueOf(z2);
            } else {
                if (this.g == z2) {
                    classLoggerApi.d("Duplicate state, ignoring");
                    return;
                }
                this.g = z2;
                if (z2) {
                    this.f = false;
                    b();
                } else {
                    this.f = true;
                    c();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized int e() {
        return this.f28320a.o().e();
    }

    public final synchronized long f() {
        if (!this.g) {
            return System.currentTimeMillis() - this.f28321b.f28115a;
        }
        return this.f28320a.o().f() + (System.currentTimeMillis() - this.f28324h);
    }

    @Override // com.kochava.core.activity.internal.ActivityMonitorChangedListener
    public final synchronized void g() {
    }

    public final synchronized boolean h() {
        return this.g;
    }

    public final synchronized void i() {
        try {
            this.f28324h = this.f28321b.f28115a;
            if (this.f28320a.o().c() <= 0) {
                f28319i.d("Starting and initializing the first launch");
                this.g = true;
                this.f28320a.o().h(1L);
                this.f28320a.o().j(this.f28321b.f28115a);
                this.f28320a.o().l(System.currentTimeMillis() - this.f28321b.f28115a);
                this.f28320a.o().k(1);
            } else {
                Boolean bool = this.f28323e;
                if (bool != null ? bool.booleanValue() : this.f28322c.f0) {
                    f28319i.d("Starting when state is active");
                    d(true);
                } else {
                    f28319i.d("Starting when state is inactive");
                }
            }
            this.f28322c.a(this);
        } catch (Throwable th) {
            throw th;
        }
    }
}
