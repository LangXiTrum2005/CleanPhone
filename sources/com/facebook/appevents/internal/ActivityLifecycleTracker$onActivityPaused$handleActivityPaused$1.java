package com.facebook.appevents.internal;

import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
final class ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1 implements Runnable {
    public final /* synthetic */ long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ String f16134Y;

    public ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1(long j, String str) {
        this.X = j;
        this.f16134Y = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            String str = ActivityLifecycleTracker.f16128a;
            if (ActivityLifecycleTracker.f == null) {
                ActivityLifecycleTracker.f = new SessionInfo(Long.valueOf(this.X), null);
            }
            SessionInfo sessionInfo = ActivityLifecycleTracker.f;
            if (sessionInfo != null) {
                sessionInfo.f16153e = Long.valueOf(this.X);
            }
            if (ActivityLifecycleTracker.f16131e.get() <= 0) {
                Runnable runnable = new Runnable() { // from class: com.facebook.appevents.internal.ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1$task$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (CrashShieldHandler.b(this)) {
                            return;
                        }
                        try {
                            String str2 = ActivityLifecycleTracker.f16128a;
                            if (ActivityLifecycleTracker.f == null) {
                                ActivityLifecycleTracker.f = new SessionInfo(Long.valueOf(this.X.X), null);
                            }
                            if (ActivityLifecycleTracker.f16131e.get() <= 0) {
                                SessionLogger.d(this.X.f16134Y, ActivityLifecycleTracker.f, ActivityLifecycleTracker.f16132h);
                                SessionInfo.Companion.a();
                                ActivityLifecycleTracker.f = null;
                            }
                            synchronized (ActivityLifecycleTracker.d) {
                                ActivityLifecycleTracker.f16130c = null;
                            }
                        } catch (Throwable th) {
                            CrashShieldHandler.a(this, th);
                        }
                    }
                };
                synchronized (ActivityLifecycleTracker.d) {
                    ScheduledExecutorService scheduledExecutorService = ActivityLifecycleTracker.f16129b;
                    FetchedAppSettings fetchedAppSettingsB = FetchedAppSettingsManager.b(FacebookSdk.c());
                    ActivityLifecycleTracker.f16130c = scheduledExecutorService.schedule(runnable, fetchedAppSettingsB != null ? fetchedAppSettingsB.d : 60, TimeUnit.SECONDS);
                }
            }
            long j = ActivityLifecycleTracker.f16133i;
            AutomaticAnalyticsLogger.a(j > 0 ? (this.X - j) / ((long) 1000) : 0L, this.f16134Y);
            SessionInfo sessionInfo2 = ActivityLifecycleTracker.f;
            if (sessionInfo2 != null) {
                sessionInfo2.a();
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }
}
