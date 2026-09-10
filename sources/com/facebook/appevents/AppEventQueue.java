package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import b2.o;
import com.adjust.sdk.Constants;
import com.applovin.impl.sdk.x;
import com.facebook.appevents.cloudbridge.AppEventsCAPIManager;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import com.ironsource.Ve;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import go.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.b0;
import l7.e0;
import l7.g0;
import l7.q;
import l7.s;
import org.json.JSONArray;
import org.json.JSONException;
import q7.r;
import q7.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\tJ!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010#\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0016H\u0007¢\u0006\u0004\b#\u0010$J7\u0010(\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0016H\u0007¢\u0006\u0004\b(\u0010)R\u001c\u0010,\u001a\n +*\u0004\u0018\u00010*0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082D¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020.8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00103R\u001c\u00105\u001a\n +*\u0004\u0018\u000104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00108\u001a\b\u0012\u0002\b\u0003\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lcom/facebook/appevents/AppEventQueue;", "", "<init>", "()V", "Lwj/r;", "persistToDisk", "Lcom/facebook/appevents/FlushReason;", "reason", "flush", "(Lcom/facebook/appevents/FlushReason;)V", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppId", "Lcom/facebook/appevents/AppEvent;", "appEvent", "add", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Lcom/facebook/appevents/AppEvent;)V", "", "getKeySet", "()Ljava/util/Set;", "flushAndWait", "Lcom/facebook/appevents/AppEventCollection;", "appEventCollection", "Lcom/facebook/appevents/FlushStatistics;", "sendEventsToServer", "(Lcom/facebook/appevents/FlushReason;Lcom/facebook/appevents/AppEventCollection;)Lcom/facebook/appevents/FlushStatistics;", "flushResults", "", "Ll7/b0;", "buildRequests", "(Lcom/facebook/appevents/AppEventCollection;Lcom/facebook/appevents/FlushStatistics;)Ljava/util/List;", "Lcom/facebook/appevents/SessionEventsState;", "appEvents", "", "limitEventUsage", "flushState", "buildRequestForSession", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Lcom/facebook/appevents/SessionEventsState;ZLcom/facebook/appevents/FlushStatistics;)Ll7/b0;", "request", "Ll7/e0;", Ve.f27442n, "handleResponse", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Ll7/b0;Ll7/e0;Lcom/facebook/appevents/SessionEventsState;Lcom/facebook/appevents/FlushStatistics;)V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "", "NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER", "I", "FLUSH_PERIOD_IN_SECONDS", "NO_CONNECTIVITY_ERROR_CODE", "Lcom/facebook/appevents/AppEventCollection;", "Ljava/util/concurrent/ScheduledExecutorService;", "singleThreadExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledFuture;", "scheduledFuture", "Ljava/util/concurrent/ScheduledFuture;", "Ljava/lang/Runnable;", "flushRunnable", "Ljava/lang/Runnable;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AppEventQueue {
    private static final int FLUSH_PERIOD_IN_SECONDS = 15;
    private static final int NO_CONNECTIVITY_ERROR_CODE = -1;
    private static ScheduledFuture<?> scheduledFuture;
    public static final AppEventQueue INSTANCE = new AppEventQueue();
    private static final String TAG = AppEventQueue.class.getName();
    private static final int NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER = 100;
    private static volatile AppEventCollection appEventCollection = new AppEventCollection();
    private static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
    private static final Runnable flushRunnable = new x(3);

    private AppEventQueue() {
    }

    public static final void add(AccessTokenAppIdPair accessTokenAppId, AppEvent appEvent) {
        if (v7.a.b(AppEventQueue.class)) {
            return;
        }
        try {
            n.f(accessTokenAppId, "accessTokenAppId");
            n.f(appEvent, "appEvent");
            singleThreadExecutor.execute(new o(11, accessTokenAppId, appEvent));
        } catch (Throwable th2) {
            v7.a.a(AppEventQueue.class, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void add$lambda$3(AccessTokenAppIdPair accessTokenAppId, AppEvent appEvent) {
        if (v7.a.b(AppEventQueue.class)) {
            return;
        }
        try {
            n.f(accessTokenAppId, "$accessTokenAppId");
            n.f(appEvent, "$appEvent");
            appEventCollection.addEvent(accessTokenAppId, appEvent);
            if (AppEventsLogger.INSTANCE.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY && appEventCollection.getEventCount() > NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER) {
                flushAndWait(FlushReason.EVENT_THRESHOLD);
            } else if (scheduledFuture == null) {
                scheduledFuture = singleThreadExecutor.schedule(flushRunnable, 15L, TimeUnit.SECONDS);
            }
        } catch (Throwable th2) {
            v7.a.a(AppEventQueue.class, th2);
        }
    }

    public static final b0 buildRequestForSession(AccessTokenAppIdPair accessTokenAppId, SessionEventsState appEvents, boolean limitEventUsage, FlushStatistics flushState) {
        if (!v7.a.b(AppEventQueue.class)) {
            try {
                n.f(accessTokenAppId, "accessTokenAppId");
                n.f(appEvents, "appEvents");
                n.f(flushState, "flushState");
                String applicationId = accessTokenAppId.getApplicationId();
                r rVarK = u.k(applicationId, false);
                String str = b0.f45085j;
                b0 b0VarA = j2.n.A(null, String.format("%s/activities", Arrays.copyOf(new Object[]{applicationId}, 1)), null, null);
                b0VarA.f45095i = true;
                Bundle bundle = b0VarA.f45090d;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                String accessTokenString = accessTokenAppId.getAccessTokenString();
                if (accessTokenString == null) {
                    Date date = l7.a.l;
                    l7.a aVarD = k.D();
                    accessTokenString = aVarD != null ? aVarD.f45075e : null;
                }
                if (accessTokenString != null) {
                    bundle.putString("access_token", accessTokenString);
                }
                String pushNotificationsRegistrationId = InternalAppEventsLogger.INSTANCE.getPushNotificationsRegistrationId();
                if (pushNotificationsRegistrationId != null) {
                    bundle.putString("device_token", pushNotificationsRegistrationId);
                }
                String installReferrer = AppEventsLoggerImpl.INSTANCE.getInstallReferrer();
                if (installReferrer != null) {
                    bundle.putString(Constants.INSTALL_REFERRER, installReferrer);
                }
                b0VarA.f45090d = bundle;
                int iPopulateRequest = appEvents.populateRequest(b0VarA, s.b(), rVarK != null ? rVarK.f48757a : false, limitEventUsage);
                if (iPopulateRequest != 0) {
                    flushState.setNumEvents(flushState.getNumEvents() + iPopulateRequest);
                    b0VarA.j(new b(accessTokenAppId, b0VarA, appEvents, flushState, 0));
                    return b0VarA;
                }
            } catch (Throwable th2) {
                v7.a.a(AppEventQueue.class, th2);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildRequestForSession$lambda$4(AccessTokenAppIdPair accessTokenAppId, b0 postRequest, SessionEventsState appEvents, FlushStatistics flushState, e0 response) {
        if (v7.a.b(AppEventQueue.class)) {
            return;
        }
        try {
            n.f(accessTokenAppId, "$accessTokenAppId");
            n.f(postRequest, "$postRequest");
            n.f(appEvents, "$appEvents");
            n.f(flushState, "$flushState");
            n.f(response, "response");
            handleResponse(accessTokenAppId, postRequest, response, appEvents, flushState);
        } catch (Throwable th2) {
            v7.a.a(AppEventQueue.class, th2);
        }
    }

    public static final List<b0> buildRequests(AppEventCollection appEventCollection2, FlushStatistics flushResults) {
        if (v7.a.b(AppEventQueue.class)) {
            return null;
        }
        try {
            n.f(appEventCollection2, "appEventCollection");
            n.f(flushResults, "flushResults");
            boolean zG = s.g(s.b());
            ArrayList arrayList = new ArrayList();
            for (AccessTokenAppIdPair accessTokenAppIdPair : appEventCollection2.keySet()) {
                SessionEventsState sessionEventsState = appEventCollection2.get(accessTokenAppIdPair);
                if (sessionEventsState == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                b0 b0VarBuildRequestForSession = buildRequestForSession(accessTokenAppIdPair, sessionEventsState, zG, flushResults);
                if (b0VarBuildRequestForSession != null) {
                    arrayList.add(b0VarBuildRequestForSession);
                    if (AppEventsCAPIManager.INSTANCE.isEnabled$facebook_core_release()) {
                        AppEventsConversionsAPITransformerWebRequests.transformGraphRequestAndSendToCAPIGEndPoint(b0VarBuildRequestForSession);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            v7.a.a(AppEventQueue.class, th2);
            return null;
        }
    }

    public static final void flush(FlushReason reason) {
        if (v7.a.b(AppEventQueue.class)) {
            return;
        }
        try {
            n.f(reason, "reason");
            singleThreadExecutor.execute(new androidx.fragment.app.n(reason, 14));
        } catch (Throwable th2) {
            v7.a.a(AppEventQueue.class, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flush$lambda$2(FlushReason reason) {
        if (v7.a.b(AppEventQueue.class)) {
            return;
        }
        try {
            n.f(reason, "$reason");
            flushAndWait(reason);
        } catch (Throwable th2) {
            v7.a.a(AppEventQueue.class, th2);
        }
    }

    public static final void flushAndWait(FlushReason reason) {
        if (v7.a.b(AppEventQueue.class)) {
            return;
        }
        try {
            n.f(reason, "reason");
            appEventCollection.addPersistedEvents(AppEventDiskStore.readAndClearStore());
            try {
                FlushStatistics flushStatisticsSendEventsToServer = sendEventsToServer(reason, appEventCollection);
                if (flushStatisticsSendEventsToServer != null) {
                    Intent intent = new Intent(AppEventsLogger.ACTION_APP_EVENTS_FLUSHED);
                    intent.putExtra(AppEventsLogger.APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED, flushStatisticsSendEventsToServer.getNumEvents());
                    intent.putExtra(AppEventsLogger.APP_EVENTS_EXTRA_FLUSH_RESULT, flushStatisticsSendEventsToServer.getResult());
                    LocalBroadcastManager.getInstance(s.b()).sendBroadcast(intent);
                }
            } catch (Exception e10) {
                Log.w(TAG, "Caught unexpected exception while flushing app events: ", e10);
            }
        } catch (Throwable th2) {
            v7.a.a(AppEventQueue.class, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flushRunnable$lambda$0() {
        if (v7.a.b(AppEventQueue.class)) {
            return;
        }
        try {
            scheduledFuture = null;
            if (AppEventsLogger.INSTANCE.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                flushAndWait(FlushReason.TIMER);
            }
        } catch (Throwable th2) {
            v7.a.a(AppEventQueue.class, th2);
        }
    }

    public static final Set<AccessTokenAppIdPair> getKeySet() {
        if (v7.a.b(AppEventQueue.class)) {
            return null;
        }
        try {
            return appEventCollection.keySet();
        } catch (Throwable th2) {
            v7.a.a(AppEventQueue.class, th2);
            return null;
        }
    }

    public static final void handleResponse(AccessTokenAppIdPair accessTokenAppId, b0 request, e0 response, SessionEventsState appEvents, FlushStatistics flushState) {
        String string;
        g0 g0Var = g0.f45136d;
        if (v7.a.b(AppEventQueue.class)) {
            return;
        }
        try {
            n.f(accessTokenAppId, "accessTokenAppId");
            n.f(request, "request");
            n.f(response, "response");
            n.f(appEvents, "appEvents");
            n.f(flushState, "flushState");
            q qVar = response.f45111c;
            String str = "Success";
            FlushResult flushResult = FlushResult.SUCCESS;
            if (qVar != null) {
                if (qVar.f45203b == -1) {
                    str = "Failed: No Connectivity";
                    flushResult = FlushResult.NO_CONNECTIVITY;
                } else {
                    str = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), qVar.toString()}, 2));
                    flushResult = FlushResult.SERVER_ERROR;
                }
            }
            if (s.i(g0Var)) {
                try {
                    string = new JSONArray(request.f45091e).toString(2);
                    n.e(string, "{\n            val jsonAr…y.toString(2)\n          }");
                } catch (JSONException unused) {
                    string = "<Can't encode events for debug logging>";
                }
                ne.a aVar = q7.x.f48792c;
                String TAG2 = TAG;
                n.e(TAG2, "TAG");
                aVar.t(g0Var, TAG2, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(request.f45089c), str, string);
            }
            appEvents.clearInFlightAndStats(qVar != null);
            FlushResult flushResult2 = FlushResult.NO_CONNECTIVITY;
            if (flushResult == flushResult2) {
                s.d().execute(new o(12, accessTokenAppId, appEvents));
            }
            if (flushResult == FlushResult.SUCCESS || flushState.getResult() == flushResult2) {
                return;
            }
            flushState.setResult(flushResult);
        } catch (Throwable th2) {
            v7.a.a(AppEventQueue.class, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$5(AccessTokenAppIdPair accessTokenAppId, SessionEventsState appEvents) {
        if (v7.a.b(AppEventQueue.class)) {
            return;
        }
        try {
            n.f(accessTokenAppId, "$accessTokenAppId");
            n.f(appEvents, "$appEvents");
            AppEventStore.persistEvents(accessTokenAppId, appEvents);
        } catch (Throwable th2) {
            v7.a.a(AppEventQueue.class, th2);
        }
    }

    public static final void persistToDisk() {
        if (v7.a.b(AppEventQueue.class)) {
            return;
        }
        try {
            singleThreadExecutor.execute(new x(2));
        } catch (Throwable th2) {
            v7.a.a(AppEventQueue.class, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void persistToDisk$lambda$1() {
        if (v7.a.b(AppEventQueue.class)) {
            return;
        }
        try {
            AppEventStore.persistEvents(appEventCollection);
            appEventCollection = new AppEventCollection();
        } catch (Throwable th2) {
            v7.a.a(AppEventQueue.class, th2);
        }
    }

    public static final FlushStatistics sendEventsToServer(FlushReason reason, AppEventCollection appEventCollection2) {
        if (v7.a.b(AppEventQueue.class)) {
            return null;
        }
        try {
            n.f(reason, "reason");
            n.f(appEventCollection2, "appEventCollection");
            FlushStatistics flushStatistics = new FlushStatistics();
            List<b0> listBuildRequests = buildRequests(appEventCollection2, flushStatistics);
            if (listBuildRequests.isEmpty()) {
                return null;
            }
            ne.a aVar = q7.x.f48792c;
            g0 g0Var = g0.f45136d;
            String TAG2 = TAG;
            n.e(TAG2, "TAG");
            aVar.t(g0Var, TAG2, "Flushing %d events due to %s.", Integer.valueOf(flushStatistics.getNumEvents()), reason.toString());
            Iterator<b0> it = listBuildRequests.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            return flushStatistics;
        } catch (Throwable th2) {
            v7.a.a(AppEventQueue.class, th2);
            return null;
        }
    }
}
