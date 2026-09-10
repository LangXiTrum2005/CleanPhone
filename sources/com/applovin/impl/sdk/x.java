package com.applovin.impl.sdk;

import android.app.ActivityManager;
import com.applovin.impl.q7;
import com.facebook.appevents.AnalyticsUserIDStore;
import com.facebook.appevents.AppEventQueue;
import com.facebook.appevents.AppEventsLoggerImpl;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import io.flutter.plugins.firebase.crashlytics.FirebaseCrashlyticsTestCrash;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9715a;

    public /* synthetic */ x(int i10) {
        this.f9715a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9715a) {
            case 0:
                q7.c();
                return;
            case 1:
                AnalyticsUserIDStore.initStore$lambda$0();
                return;
            case 2:
                AppEventQueue.persistToDisk$lambda$1();
                return;
            case 3:
                AppEventQueue.flushRunnable$lambda$0();
                return;
            case 4:
                AppEventsLoggerImpl.Companion.initializeTimersIfNeeded$lambda$6();
                return;
            case 5:
                UserDataStore.clear$lambda$2();
                return;
            case 6:
                InAppPurchaseActivityLifecycleTracker.AnonymousClass2.onActivityStopped$lambda$1();
                return;
            case 7:
                InAppPurchaseActivityLifecycleTracker.AnonymousClass2.onActivityResumed$lambda$0();
                return;
            case 8:
                InAppPurchaseManager.startTracking();
                return;
            case 9:
                ActivityLifecycleTracker.onActivityCreated$lambda$1();
                return;
            case 10:
                throw new FirebaseCrashlyticsTestCrash();
            case 11:
                com.mbridge.msdk.config.component.common.util.d.b();
                return;
            case 12:
                AppEventQueue.flushAndWait(FlushReason.EAGER_FLUSHING_EVENT);
                return;
            case 13:
                MetadataIndexer.enable$lambda$0();
                return;
            case 14:
                ModelManager.enableMTML$lambda$1();
                return;
            case 15:
                ModelManager.enableMTML$lambda$2();
                return;
            case 16:
                ModelManager.enable$lambda$0();
                return;
            case 17:
                SuggestedEventsManager.enable$lambda$0();
                return;
            case 18:
                AtomicBoolean atomicBoolean = q7.z.f48800c;
                if (v7.a.b(q7.z.class)) {
                    return;
                }
                try {
                    try {
                        Iterator it = q7.z.f48799b.iterator();
                        while (it.hasNext()) {
                            ((q7.y) it.next()).a(true);
                        }
                        atomicBoolean.set(false);
                        return;
                    } catch (Throwable th2) {
                        atomicBoolean.set(false);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    v7.a.a(q7.z.class, th3);
                    return;
                }
            case 19:
                if (v7.a.b(t7.a.class)) {
                    return;
                }
                try {
                    Object systemService = l7.s.b().getSystemService("activity");
                    kotlin.jvm.internal.n.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                    t7.a.a((ActivityManager) systemService);
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th4) {
                    v7.a.a(t7.a.class, th4);
                    return;
                }
            default:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.f10614a;
                return;
        }
    }
}
