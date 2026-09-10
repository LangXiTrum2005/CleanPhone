package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.q7;
import com.applovin.impl.z4;
import com.ironsource.X3;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final l f9316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9317b = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f9318c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f9319d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicInteger f9320e = new AtomicInteger();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicLong f9321f = new AtomicLong();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicLong f9322g = new AtomicLong();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicLong f9323h = new AtomicLong();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Date f9324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Date f9325j;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends com.applovin.impl.b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (q7.h()) {
                    SessionTracker.this.b();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                SessionTracker.this.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9329a;

        static {
            int[] iArr = new int[e.values().length];
            f9329a = iArr;
            try {
                iArr[e.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9329a[e.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9329a[e.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum e {
        STARTED(X3.i.f27787d0),
        PAUSED(X3.i.f27789e0),
        RESUMED("resumed");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9334a;

        e(String str) {
            this.f9334a = str;
        }

        public String b() {
            return this.f9334a;
        }
    }

    public SessionTracker(l lVar) {
        this.f9316a = lVar;
        Application application = (Application) l.p();
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new c(), intentFilter);
    }

    private void d() {
        this.f9316a.Q();
        if (p.a()) {
            this.f9316a.Q().a("SessionTracker", "Application Resumed");
        }
        this.f9322g.set(System.currentTimeMillis());
        this.f9323h.addAndGet(this.f9322g.get() - this.f9321f.get());
        boolean zBooleanValue = ((Boolean) this.f9316a.a(z4.A3)).booleanValue();
        long jLongValue = ((Long) this.f9316a.a(z4.B3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f9318c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(jLongValue);
        if (this.f9325j == null || System.currentTimeMillis() - this.f9325j.getTime() >= millis) {
            this.f9316a.G().trackEvent("resumed");
            if (zBooleanValue) {
                this.f9325j = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f9325j = new Date();
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f9321f.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f9322g.get();
    }

    public e getCurrentApplicationState() {
        if (this.f9319d.get()) {
            return e.PAUSED;
        }
        return this.f9321f.get() != 0 ? e.RESUMED : e.STARTED;
    }

    public long getCurrentApplicationStateDurationMillis() {
        long jO;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = d.f9329a[getCurrentApplicationState().ordinal()];
        if (i10 == 1) {
            jO = l.o();
        } else if (i10 == 2) {
            jO = this.f9321f.get();
        } else {
            if (i10 != 3) {
                return -1L;
            }
            jO = this.f9322g.get();
        }
        return jCurrentTimeMillis - jO;
    }

    public int getLastTrimMemoryLevel() {
        return this.f9320e.get();
    }

    public String getSessionId() {
        return this.f9317b;
    }

    public long getTotalBackgroundDurationMillis() {
        if (getCurrentApplicationState() != e.PAUSED) {
            return this.f9323h.get();
        }
        return getCurrentApplicationStateDurationMillis() + this.f9323h.get();
    }

    public boolean isApplicationPaused() {
        return this.f9319d.get();
    }

    public void pauseForClick() {
        this.f9318c.set(true);
    }

    public void resumeForClick() {
        this.f9318c.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f9319d.compareAndSet(false, true)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f9319d.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.f9316a.Q();
        if (p.a()) {
            this.f9316a.Q().a("SessionTracker", "Application Paused");
        }
        this.f9321f.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f9318c.get()) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.f9316a.a(z4.A3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f9316a.a(z4.C3)).longValue());
        if (this.f9324i == null || System.currentTimeMillis() - this.f9324i.getTime() >= millis) {
            this.f9316a.G().trackEvent(X3.i.f27789e0);
            if (zBooleanValue) {
                this.f9324i = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f9324i = new Date();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements ComponentCallbacks2 {
        public b() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            SessionTracker.this.f9320e.set(i10);
            if (i10 == 20) {
                SessionTracker.this.a();
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }
    }
}
