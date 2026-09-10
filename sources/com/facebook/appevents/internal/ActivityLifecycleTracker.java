package com.facebook.appevents.internal;

import an.h;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import cj.l;
import com.applovin.impl.sdk.b0;
import com.applovin.impl.sdk.x;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.codeless.CodelessManager;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.g0;
import l7.s;
import q7.e0;
import q7.p;
import q7.r;
import q7.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010$\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010&\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u001c\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0016\u00105\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010!R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010\u001dR\u0014\u0010?\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/facebook/appevents/internal/ActivityLifecycleTracker;", "", "<init>", "()V", "Landroid/app/Application;", "application", "", "appId", "Lwj/r;", "startTracking", "(Landroid/app/Application;Ljava/lang/String;)V", "", "isInBackground", "()Z", "isTracking", "Ljava/util/UUID;", "getCurrentSessionGuid", "()Ljava/util/UUID;", "Landroid/app/Activity;", "activity", "onActivityCreated", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityDestroyed", "cancelCurrentTask", "getCurrentActivity", "()Landroid/app/Activity;", "TAG", "Ljava/lang/String;", "INCORRECT_IMPL_WARNING", "", "INTERRUPTION_THRESHOLD_MILLISECONDS", "J", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "singleThreadExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "iapExecutor", "Ljava/util/concurrent/ScheduledFuture;", "currentFuture", "Ljava/util/concurrent/ScheduledFuture;", "currentFutureLock", "Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicInteger;", "foregroundActivityCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lcom/facebook/appevents/internal/SessionInfo;", "currentSession", "Lcom/facebook/appevents/internal/SessionInfo;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "tracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "currentActivityAppearTime", "", "activityReferences", "I", "Ljava/lang/ref/WeakReference;", "currActivity", "Ljava/lang/ref/WeakReference;", "previousActivityName", "getSessionTimeoutInSeconds", "()I", "sessionTimeoutInSeconds", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ActivityLifecycleTracker {
    private static final String INCORRECT_IMPL_WARNING = "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method";
    public static final ActivityLifecycleTracker INSTANCE = new ActivityLifecycleTracker();
    private static final long INTERRUPTION_THRESHOLD_MILLISECONDS = 1000;
    private static final String TAG;
    private static int activityReferences;
    private static String appId;
    private static WeakReference<Activity> currActivity;
    private static long currentActivityAppearTime;
    private static volatile ScheduledFuture<?> currentFuture;
    private static final Object currentFutureLock;
    private static volatile SessionInfo currentSession;
    private static final AtomicInteger foregroundActivityCount;
    private static final ScheduledExecutorService iapExecutor;
    private static String previousActivityName;
    private static final ScheduledExecutorService singleThreadExecutor;
    private static final AtomicBoolean tracking;

    static {
        String canonicalName = ActivityLifecycleTracker.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        TAG = canonicalName;
        singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
        iapExecutor = Executors.newSingleThreadScheduledExecutor();
        currentFutureLock = new Object();
        foregroundActivityCount = new AtomicInteger(0);
        tracking = new AtomicBoolean(false);
    }

    private ActivityLifecycleTracker() {
    }

    private final void cancelCurrentTask() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (currentFutureLock) {
            try {
                if (currentFuture != null && (scheduledFuture = currentFuture) != null) {
                    scheduledFuture.cancel(false);
                }
                currentFuture = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = currActivity;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static final UUID getCurrentSessionGuid() {
        SessionInfo sessionInfo;
        if (currentSession == null || (sessionInfo = currentSession) == null) {
            return null;
        }
        return sessionInfo.getSessionId();
    }

    private final int getSessionTimeoutInSeconds() {
        r rVarB = u.b(s.c());
        return rVarB == null ? Constants.getDefaultAppEventsSessionTimeoutInSeconds() : rVarB.f48758b;
    }

    public static final boolean isInBackground() {
        return activityReferences == 0;
    }

    public static final boolean isTracking() {
        return tracking.get();
    }

    public static final void onActivityCreated(Activity activity) {
        singleThreadExecutor.execute(new x(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityCreated$lambda$1() {
        if (currentSession == null) {
            currentSession = SessionInfo.INSTANCE.getStoredSessionInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActivityDestroyed(Activity activity) {
        CodelessManager.onActivityDestroyed(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActivityPaused(Activity activity) {
        AtomicInteger atomicInteger = foregroundActivityCount;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(TAG, INCORRECT_IMPL_WARNING);
        }
        cancelCurrentTask();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strK = e0.k(activity);
        CodelessManager.onActivityPaused(activity);
        singleThreadExecutor.execute(new a(0, jCurrentTimeMillis, strK));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityPaused$lambda$7(long j10, String activityName) {
        n.f(activityName, "$activityName");
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j10), null, null, 4, null);
        }
        SessionInfo sessionInfo = currentSession;
        if (sessionInfo != null) {
            sessionInfo.setSessionLastEventTime(Long.valueOf(j10));
        }
        if (foregroundActivityCount.get() <= 0) {
            a aVar = new a(1, j10, activityName);
            synchronized (currentFutureLock) {
                currentFuture = singleThreadExecutor.schedule(aVar, INSTANCE.getSessionTimeoutInSeconds(), TimeUnit.SECONDS);
            }
        }
        long j11 = currentActivityAppearTime;
        AutomaticAnalyticsLogger.logActivityTimeSpentEvent(activityName, j11 > 0 ? (j10 - j11) / ((long) 1000) : 0L);
        SessionInfo sessionInfo2 = currentSession;
        if (sessionInfo2 != null) {
            sessionInfo2.writeSessionToDisk();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityPaused$lambda$7$lambda$5(long j10, String activityName) {
        n.f(activityName, "$activityName");
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j10), null, null, 4, null);
        }
        if (foregroundActivityCount.get() <= 0) {
            SessionLogger.logDeactivateApp(activityName, currentSession, appId);
            SessionInfo.INSTANCE.clearSavedSessionFromDisk();
            currentSession = null;
        }
        synchronized (currentFutureLock) {
            currentFuture = null;
        }
    }

    public static final void onActivityResumed(Activity activity) {
        n.f(activity, "activity");
        currActivity = new WeakReference<>(activity);
        foregroundActivityCount.incrementAndGet();
        INSTANCE.cancelCurrentTask();
        long jCurrentTimeMillis = System.currentTimeMillis();
        currentActivityAppearTime = jCurrentTimeMillis;
        String strK = e0.k(activity);
        CodelessManager.onActivityResumed(activity);
        MetadataIndexer.onActivityResumed(activity);
        SuggestedEventsManager.trackActivity(activity);
        String str = previousActivityName;
        if (str != null && h.q0(str, "ProxyBillingActivity", false) && !strK.equals("ProxyBillingActivity")) {
            iapExecutor.execute(new x(8));
        }
        singleThreadExecutor.execute(new l(jCurrentTimeMillis, strK, activity.getApplicationContext()));
        previousActivityName = strK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityResumed$lambda$3(long j10, String activityName, Context appContext) {
        SessionInfo sessionInfo;
        n.f(activityName, "$activityName");
        SessionInfo sessionInfo2 = currentSession;
        Long sessionLastEventTime = sessionInfo2 != null ? sessionInfo2.getSessionLastEventTime() : null;
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j10), null, null, 4, null);
            String str = appId;
            n.e(appContext, "appContext");
            SessionLogger.logActivateApp(activityName, null, str, appContext);
        } else if (sessionLastEventTime != null) {
            long jLongValue = j10 - sessionLastEventTime.longValue();
            if (jLongValue > INSTANCE.getSessionTimeoutInSeconds() * 1000) {
                SessionLogger.logDeactivateApp(activityName, currentSession, appId);
                String str2 = appId;
                n.e(appContext, "appContext");
                SessionLogger.logActivateApp(activityName, null, str2, appContext);
                currentSession = new SessionInfo(Long.valueOf(j10), null, null, 4, null);
            } else if (jLongValue > 1000 && (sessionInfo = currentSession) != null) {
                sessionInfo.incrementInterruptionCount();
            }
        }
        SessionInfo sessionInfo3 = currentSession;
        if (sessionInfo3 != null) {
            sessionInfo3.setSessionLastEventTime(Long.valueOf(j10));
        }
        SessionInfo sessionInfo4 = currentSession;
        if (sessionInfo4 != null) {
            sessionInfo4.writeSessionToDisk();
        }
    }

    public static final void startTracking(Application application, String appId2) {
        n.f(application, "application");
        if (tracking.compareAndSet(false, true)) {
            p.a(new b0(21), q7.n.CodelessEvents);
            appId = appId2;
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.appevents.internal.ActivityLifecycleTracker.startTracking.2
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                    n.f(activity, "activity");
                    q7.x.f48792c.s(g0.f45136d, ActivityLifecycleTracker.TAG, "onActivityCreated");
                    AppEventUtility.assertIsMainThread();
                    ActivityLifecycleTracker.onActivityCreated(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    n.f(activity, "activity");
                    q7.x.f48792c.s(g0.f45136d, ActivityLifecycleTracker.TAG, "onActivityDestroyed");
                    ActivityLifecycleTracker.INSTANCE.onActivityDestroyed(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    n.f(activity, "activity");
                    q7.x.f48792c.s(g0.f45136d, ActivityLifecycleTracker.TAG, "onActivityPaused");
                    AppEventUtility.assertIsMainThread();
                    ActivityLifecycleTracker.INSTANCE.onActivityPaused(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    n.f(activity, "activity");
                    q7.x.f48792c.s(g0.f45136d, ActivityLifecycleTracker.TAG, "onActivityResumed");
                    AppEventUtility.assertIsMainThread();
                    ActivityLifecycleTracker.onActivityResumed(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                    n.f(activity, "activity");
                    n.f(outState, "outState");
                    q7.x.f48792c.s(g0.f45136d, ActivityLifecycleTracker.TAG, "onActivitySaveInstanceState");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    n.f(activity, "activity");
                    ActivityLifecycleTracker.activityReferences++;
                    q7.x.f48792c.s(g0.f45136d, ActivityLifecycleTracker.TAG, "onActivityStarted");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    n.f(activity, "activity");
                    q7.x.f48792c.s(g0.f45136d, ActivityLifecycleTracker.TAG, "onActivityStopped");
                    AppEventsLogger.INSTANCE.onContextStop();
                    ActivityLifecycleTracker.activityReferences--;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTracking$lambda$0(boolean z10) {
        if (z10) {
            CodelessManager.enable();
        } else {
            CodelessManager.disable();
        }
    }
}
