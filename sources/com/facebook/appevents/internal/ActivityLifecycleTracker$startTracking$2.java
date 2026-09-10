package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.aam.MetadataRule;
import com.facebook.appevents.aam.MetadataViewObserver;
import com.facebook.appevents.codeless.CodelessManager;
import com.facebook.appevents.codeless.CodelessMatcher;
import com.facebook.appevents.codeless.ViewIndexer;
import com.facebook.appevents.codeless.ViewIndexingTrigger;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/facebook/appevents/internal/ActivityLifecycleTracker$startTracking$2", "Landroid/app/Application$ActivityLifecycleCallbacks;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ActivityLifecycleTracker$startTracking$2 implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.f(activity, "activity");
        HashMap map = Logger.d;
        Logger.Companion.a(LoggingBehavior.f0, ActivityLifecycleTracker.f16128a, "onActivityCreated");
        ActivityLifecycleTracker.f16129b.execute(ActivityLifecycleTracker$onActivityCreated$1.X);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.f(activity, "activity");
        HashMap map = Logger.d;
        Logger.Companion.a(LoggingBehavior.f0, ActivityLifecycleTracker.f16128a, "onActivityDestroyed");
        ViewIndexingTrigger viewIndexingTrigger = CodelessManager.f16049a;
        if (CrashShieldHandler.b(CodelessManager.class)) {
            return;
        }
        try {
            CodelessMatcher codelessMatcherA = CodelessMatcher.g.a();
            if (CrashShieldHandler.b(codelessMatcherA)) {
                return;
            }
            try {
                codelessMatcherA.f16058e.remove(Integer.valueOf(activity.hashCode()));
            } catch (Throwable th) {
                CrashShieldHandler.a(codelessMatcherA, th);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.a(CodelessManager.class, th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007b A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:8:0x0039, B:11:0x0042, B:13:0x004f, B:29:0x0078, B:30:0x007b, B:32:0x007f, B:16:0x0056, B:18:0x0060, B:20:0x0064, B:25:0x006c, B:27:0x0070), top: B:38:0x0039, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007f A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #0 {all -> 0x0085, blocks: (B:8:0x0039, B:11:0x0042, B:13:0x004f, B:29:0x0078, B:30:0x007b, B:32:0x007f, B:16:0x0056, B:18:0x0060, B:20:0x0064, B:25:0x006c, B:27:0x0070), top: B:38:0x0039, inners: #2 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        SensorManager sensorManager;
        Intrinsics.f(activity, "activity");
        HashMap map = Logger.d;
        LoggingBehavior loggingBehavior = LoggingBehavior.f0;
        String str = ActivityLifecycleTracker.f16128a;
        String str2 = ActivityLifecycleTracker.f16128a;
        Logger.Companion.a(loggingBehavior, str2, "onActivityPaused");
        AtomicInteger atomicInteger = ActivityLifecycleTracker.f16131e;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(str2, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        ActivityLifecycleTracker.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM = Utility.m(activity);
        ViewIndexingTrigger viewIndexingTrigger = CodelessManager.f16049a;
        if (!CrashShieldHandler.b(CodelessManager.class)) {
            try {
                if (CodelessManager.f16052e.get()) {
                    CodelessMatcher.g.a().c(activity);
                    ViewIndexer viewIndexer = CodelessManager.f16051c;
                    if (viewIndexer == null || CrashShieldHandler.b(viewIndexer)) {
                        sensorManager = CodelessManager.f16050b;
                        if (sensorManager != null) {
                            sensorManager.unregisterListener(CodelessManager.f16049a);
                        }
                    } else {
                        try {
                            if (((Activity) viewIndexer.f16065b.get()) != null) {
                                try {
                                    Timer timer = viewIndexer.f16066c;
                                    if (timer != null) {
                                        timer.cancel();
                                    }
                                    viewIndexer.f16066c = null;
                                } catch (Exception e2) {
                                    Log.e(ViewIndexer.f16063e, "Error unscheduling indexing job", e2);
                                }
                                sensorManager = CodelessManager.f16050b;
                                if (sensorManager != null) {
                                    sensorManager.unregisterListener(CodelessManager.f16049a);
                                }
                            } else {
                                sensorManager = CodelessManager.f16050b;
                                if (sensorManager != null) {
                                    sensorManager.unregisterListener(CodelessManager.f16049a);
                                }
                            }
                        } catch (Throwable th) {
                            CrashShieldHandler.a(viewIndexer, th);
                        }
                    }
                }
            } catch (Throwable th2) {
                CrashShieldHandler.a(CodelessManager.class, th2);
            }
        }
        ActivityLifecycleTracker.f16129b.execute(new ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1(jCurrentTimeMillis, strM));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.f(activity, "activity");
        HashMap map = Logger.d;
        LoggingBehavior loggingBehavior = LoggingBehavior.f0;
        String str = ActivityLifecycleTracker.f16128a;
        Logger.Companion.a(loggingBehavior, ActivityLifecycleTracker.f16128a, "onActivityResumed");
        ActivityLifecycleTracker.k = new WeakReference(activity);
        ActivityLifecycleTracker.f16131e.incrementAndGet();
        ActivityLifecycleTracker.a();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ActivityLifecycleTracker.f16133i = jCurrentTimeMillis;
        final String strM = Utility.m(activity);
        CodelessManager.b(activity);
        if (!CrashShieldHandler.b(MetadataIndexer.class)) {
            try {
                if (MetadataIndexer.f16037a) {
                    CopyOnWriteArraySet copyOnWriteArraySet = MetadataRule.d;
                    if (!new HashSet(MetadataRule.a()).isEmpty()) {
                        HashMap map2 = MetadataViewObserver.f0;
                        MetadataViewObserver.Companion.b(activity);
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                CrashShieldHandler.a(MetadataIndexer.class, th);
            }
        }
        SuggestedEventsManager.d(activity);
        InAppPurchaseManager.a();
        final Context applicationContext = activity.getApplicationContext();
        ActivityLifecycleTracker.f16129b.execute(new Runnable() { // from class: com.facebook.appevents.internal.ActivityLifecycleTracker$onActivityResumed$handleActivityResume$1
            @Override // java.lang.Runnable
            public final void run() {
                SessionInfo sessionInfo;
                if (CrashShieldHandler.b(this)) {
                    return;
                }
                try {
                    String str2 = ActivityLifecycleTracker.f16128a;
                    SessionInfo sessionInfo2 = ActivityLifecycleTracker.f;
                    Long l2 = sessionInfo2 != null ? sessionInfo2.f16153e : null;
                    if (ActivityLifecycleTracker.f == null) {
                        ActivityLifecycleTracker.f = new SessionInfo(Long.valueOf(jCurrentTimeMillis), null);
                        String str3 = strM;
                        String str4 = ActivityLifecycleTracker.f16132h;
                        Context appContext = applicationContext;
                        Intrinsics.e(appContext, "appContext");
                        SessionLogger.b(appContext, str3, str4);
                    } else if (l2 != null) {
                        long jLongValue = jCurrentTimeMillis - l2.longValue();
                        FetchedAppSettings fetchedAppSettingsB = FetchedAppSettingsManager.b(FacebookSdk.c());
                        if (jLongValue > (fetchedAppSettingsB != null ? fetchedAppSettingsB.d : 60) * 1000) {
                            SessionLogger.d(strM, ActivityLifecycleTracker.f, ActivityLifecycleTracker.f16132h);
                            String str5 = strM;
                            String str6 = ActivityLifecycleTracker.f16132h;
                            Context appContext2 = applicationContext;
                            Intrinsics.e(appContext2, "appContext");
                            SessionLogger.b(appContext2, str5, str6);
                            ActivityLifecycleTracker.f = new SessionInfo(Long.valueOf(jCurrentTimeMillis), null);
                        } else if (jLongValue > 1000 && (sessionInfo = ActivityLifecycleTracker.f) != null) {
                            sessionInfo.f16150a++;
                        }
                    }
                    SessionInfo sessionInfo3 = ActivityLifecycleTracker.f;
                    if (sessionInfo3 != null) {
                        sessionInfo3.f16153e = Long.valueOf(jCurrentTimeMillis);
                    }
                    SessionInfo sessionInfo4 = ActivityLifecycleTracker.f;
                    if (sessionInfo4 != null) {
                        sessionInfo4.a();
                    }
                } catch (Throwable th2) {
                    CrashShieldHandler.a(this, th2);
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(outState, "outState");
        HashMap map = Logger.d;
        Logger.Companion.a(LoggingBehavior.f0, ActivityLifecycleTracker.f16128a, "onActivitySaveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.f(activity, "activity");
        ActivityLifecycleTracker.j++;
        HashMap map = Logger.d;
        Logger.Companion.a(LoggingBehavior.f0, ActivityLifecycleTracker.f16128a, "onActivityStarted");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.f(activity, "activity");
        HashMap map = Logger.d;
        Logger.Companion.a(LoggingBehavior.f0, ActivityLifecycleTracker.f16128a, "onActivityStopped");
        AppEventsLogger.Companion.d();
        ActivityLifecycleTracker.j--;
    }
}
