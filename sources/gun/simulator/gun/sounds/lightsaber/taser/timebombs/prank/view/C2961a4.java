package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2961a4 {
    private static final int MAX_BATCH_SIZE = 20;
    private static final long REFRESH_TIME_MILLIS = 5000;
    private static final String TAG = "AnalyticsClient";
    private static C4689tj0 executor;
    private static boolean metricsEnabled;
    private static VungleApiClient vungleApiClient;
    public static final C2961a4 INSTANCE = new C2961a4();
    private static final BlockingQueue<C4455r30> errors = new LinkedBlockingQueue();
    private static final BlockingQueue<C5071y30> metrics = new LinkedBlockingQueue();
    private static final BlockingQueue<C4455r30> pendingErrors = new LinkedBlockingQueue();
    private static final BlockingQueue<C5071y30> pendingMetrics = new LinkedBlockingQueue();
    private static W3 logLevel = W3.ERROR_LOG_LEVEL_ERROR;
    private static boolean refreshEnabled = true;

    private C2961a4() {
    }

    @WorkerThread
    private final void flushErrors() {
        VungleApiClient vungleApiClient2;
        C4829vJ c4829vJ = C4917wJ.Companion;
        StringBuilder sb = new StringBuilder("Sending ");
        BlockingQueue<C4455r30> blockingQueue = errors;
        sb.append(blockingQueue.size());
        sb.append(" errors");
        c4829vJ.d(TAG, sb.toString());
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (linkedBlockingQueue.isEmpty() || (vungleApiClient2 = vungleApiClient) == null) {
            return;
        }
        vungleApiClient2.reportErrors(linkedBlockingQueue, new Y3(linkedBlockingQueue));
    }

    @WorkerThread
    private final void flushMetrics() {
        VungleApiClient vungleApiClient2;
        C4829vJ c4829vJ = C4917wJ.Companion;
        StringBuilder sb = new StringBuilder("Sending ");
        BlockingQueue<C5071y30> blockingQueue = metrics;
        sb.append(blockingQueue.size());
        sb.append(" metrics");
        c4829vJ.d(TAG, sb.toString());
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (linkedBlockingQueue.isEmpty() || (vungleApiClient2 = vungleApiClient) == null) {
            return;
        }
        vungleApiClient2.reportMetrics(linkedBlockingQueue, new Z3(linkedBlockingQueue));
    }

    private final C5071y30 genMetric(B30 b30, long j, C4126nJ c4126nJ, String str) {
        String placementRefId$vungle_ads_release;
        String creativeId$vungle_ads_release;
        String eventId$vungle_ads_release;
        String adSource$vungle_ads_release;
        C5071y30 value = Sdk$SDKMetric.newBuilder().setType(b30).setValue(j);
        String str2 = Build.MANUFACTURER;
        C5071y30 osVersion = value.setMake(str2).setModel(Build.MODEL).setOs(AbstractC2995aW.i("Amazon", str2) ? "amazon" : "android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT));
        String str3 = "";
        if (c4126nJ == null || (placementRefId$vungle_ads_release = c4126nJ.getPlacementRefId$vungle_ads_release()) == null) {
            placementRefId$vungle_ads_release = "";
        }
        C5071y30 placementReferenceId = osVersion.setPlacementReferenceId(placementRefId$vungle_ads_release);
        if (c4126nJ == null || (creativeId$vungle_ads_release = c4126nJ.getCreativeId$vungle_ads_release()) == null) {
            creativeId$vungle_ads_release = "";
        }
        C5071y30 creativeId = placementReferenceId.setCreativeId(creativeId$vungle_ads_release);
        if (c4126nJ == null || (eventId$vungle_ads_release = c4126nJ.getEventId$vungle_ads_release()) == null) {
            eventId$vungle_ads_release = "";
        }
        C5071y30 eventId = creativeId.setEventId(eventId$vungle_ads_release);
        if (str == null) {
            str = "";
        }
        C5071y30 meta = eventId.setMeta(str);
        if (c4126nJ != null && (adSource$vungle_ads_release = c4126nJ.getAdSource$vungle_ads_release()) != null) {
            str3 = adSource$vungle_ads_release;
        }
        C5071y30 adSource = meta.setAdSource(str3);
        AbstractC2995aW.p(adSource, "newBuilder()\n           …logEntry?.adSource ?: \"\")");
        return adSource;
    }

    public static /* synthetic */ C5071y30 genMetric$default(C2961a4 c2961a4, B30 b30, long j, C4126nJ c4126nJ, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return c2961a4.genMetric(b30, j, (i & 4) != 0 ? null : c4126nJ, (i & 8) != 0 ? null : str);
    }

    private final C4455r30 genSDKError(EnumC4719u30 enumC4719u30, String str, C4126nJ c4126nJ) {
        String placementRefId$vungle_ads_release;
        String creativeId$vungle_ads_release;
        String eventId$vungle_ads_release;
        String adSource$vungle_ads_release;
        C4455r30 c4455r30NewBuilder = Sdk$SDKError.newBuilder();
        String str2 = Build.MANUFACTURER;
        C4455r30 at = c4455r30NewBuilder.setOs(AbstractC2995aW.i("Amazon", str2) ? "amazon" : "android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT)).setMake(str2).setModel(Build.MODEL).setReason(enumC4719u30).setMessage(str).setAt(System.currentTimeMillis());
        String str3 = "";
        if (c4126nJ == null || (placementRefId$vungle_ads_release = c4126nJ.getPlacementRefId$vungle_ads_release()) == null) {
            placementRefId$vungle_ads_release = "";
        }
        C4455r30 placementReferenceId = at.setPlacementReferenceId(placementRefId$vungle_ads_release);
        if (c4126nJ == null || (creativeId$vungle_ads_release = c4126nJ.getCreativeId$vungle_ads_release()) == null) {
            creativeId$vungle_ads_release = "";
        }
        C4455r30 creativeId = placementReferenceId.setCreativeId(creativeId$vungle_ads_release);
        if (c4126nJ == null || (eventId$vungle_ads_release = c4126nJ.getEventId$vungle_ads_release()) == null) {
            eventId$vungle_ads_release = "";
        }
        C4455r30 eventId = creativeId.setEventId(eventId$vungle_ads_release);
        if (c4126nJ != null && (adSource$vungle_ads_release = c4126nJ.getAdSource$vungle_ads_release()) != null) {
            str3 = adSource$vungle_ads_release;
        }
        C4455r30 adSource = eventId.setAdSource(str3);
        AbstractC2995aW.p(adSource, "newBuilder()\n           …ce(entry?.adSource ?: \"\")");
        return adSource;
    }

    public static /* synthetic */ C4455r30 genSDKError$default(C2961a4 c2961a4, EnumC4719u30 enumC4719u30, String str, C4126nJ c4126nJ, int i, Object obj) {
        if ((i & 4) != 0) {
            c4126nJ = null;
        }
        return c2961a4.genSDKError(enumC4719u30, str, c4126nJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-1, reason: not valid java name */
    public static final void m226init$lambda1(C4689tj0 c4689tj0) {
        AbstractC2995aW.q(c4689tj0, "$executor");
        c4689tj0.execute(new B80(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-1$lambda-0, reason: not valid java name */
    public static final void m227init$lambda1$lambda0() {
        INSTANCE.report();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: logError$lambda-2, reason: not valid java name */
    public static final void m228logError$lambda2(EnumC4719u30 enumC4719u30, String str, C4126nJ c4126nJ) {
        AbstractC2995aW.q(enumC4719u30, "$reason");
        AbstractC2995aW.q(str, "$message");
        INSTANCE.logErrorInSameThread(enumC4719u30, str, c4126nJ);
    }

    public static /* synthetic */ void logError$vungle_ads_release$default(C2961a4 c2961a4, EnumC4719u30 enumC4719u30, String str, C4126nJ c4126nJ, int i, Object obj) {
        if ((i & 4) != 0) {
            c4126nJ = null;
        }
        c2961a4.logError$vungle_ads_release(enumC4719u30, str, c4126nJ);
    }

    private final synchronized void logErrorInSameThread(EnumC4719u30 enumC4719u30, String str, C4126nJ c4126nJ) {
        if (logLevel == W3.ERROR_LOG_LEVEL_OFF) {
            return;
        }
        try {
            C4455r30 c4455r30GenSDKError = genSDKError(enumC4719u30, str, c4126nJ);
            BlockingQueue<C4455r30> blockingQueue = errors;
            blockingQueue.put(c4455r30GenSDKError);
            C4917wJ.Companion.w(TAG, "Logging error: " + enumC4719u30 + " with message: " + str);
            if (blockingQueue.size() >= 20) {
                report();
            }
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "Cannot logError", e);
        }
    }

    public static /* synthetic */ void logErrorInSameThread$default(C2961a4 c2961a4, EnumC4719u30 enumC4719u30, String str, C4126nJ c4126nJ, int i, Object obj) {
        if ((i & 4) != 0) {
            c4126nJ = null;
        }
        c2961a4.logErrorInSameThread(enumC4719u30, str, c4126nJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: logMetric$lambda-3, reason: not valid java name */
    public static final void m229logMetric$lambda3(B30 b30, long j, C4126nJ c4126nJ, String str) {
        AbstractC2995aW.q(b30, "$metricType");
        INSTANCE.logMetricInSameThread(b30, j, c4126nJ, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(C2961a4 c2961a4, PS ps, C4126nJ c4126nJ, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            c4126nJ = null;
        }
        if ((i & 4) != 0) {
            str = ps.getMeta();
        }
        c2961a4.logMetric$vungle_ads_release(ps, c4126nJ, str);
    }

    private final synchronized void logMetricInSameThread(B30 b30, long j, C4126nJ c4126nJ, String str) {
        try {
            if (metricsEnabled) {
                try {
                    C5071y30 c5071y30GenMetric = genMetric(b30, j, c4126nJ, str);
                    BlockingQueue<C5071y30> blockingQueue = metrics;
                    blockingQueue.put(c5071y30GenMetric);
                    C4829vJ c4829vJ = C4917wJ.Companion;
                    StringBuilder sb = new StringBuilder("Logging Metric ");
                    sb.append(b30);
                    sb.append(" with value ");
                    sb.append(j);
                    sb.append(" for placement ");
                    sb.append(c4126nJ != null ? c4126nJ.getPlacementRefId$vungle_ads_release() : null);
                    c4829vJ.d(TAG, sb.toString());
                    if (blockingQueue.size() >= 20) {
                        report();
                    }
                } catch (Exception e) {
                    C4917wJ.Companion.e(TAG, "Cannot logMetrics", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void logMetricInSameThread$default(C2961a4 c2961a4, B30 b30, long j, C4126nJ c4126nJ, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c2961a4.logMetricInSameThread(b30, j, (i & 4) != 0 ? null : c4126nJ, (i & 8) != 0 ? null : str);
    }

    private final synchronized void report() {
        try {
            if (logLevel != W3.ERROR_LOG_LEVEL_OFF && errors.size() > 0) {
                flushErrors();
            }
            if (metricsEnabled && metrics.size() > 0) {
                flushMetrics();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final BlockingQueue<C4455r30> getErrors$vungle_ads_release() {
        return errors;
    }

    public final C4689tj0 getExecutor$vungle_ads_release() {
        return executor;
    }

    public final BlockingQueue<C5071y30> getMetrics$vungle_ads_release() {
        return metrics;
    }

    public final boolean getMetricsEnabled$vungle_ads_release() {
        return metricsEnabled;
    }

    public final BlockingQueue<C4455r30> getPendingErrors$vungle_ads_release() {
        return pendingErrors;
    }

    public final BlockingQueue<C5071y30> getPendingMetrics$vungle_ads_release() {
        return pendingMetrics;
    }

    public final boolean getRefreshEnabled$vungle_ads_release() {
        return refreshEnabled;
    }

    public final VungleApiClient getVungleApiClient$vungle_ads_release() {
        return vungleApiClient;
    }

    public final void init$vungle_ads_release(VungleApiClient vungleApiClient2, C4689tj0 c4689tj0, int i, boolean z) {
        AbstractC2995aW.q(vungleApiClient2, "vungleApiClient");
        AbstractC2995aW.q(c4689tj0, "executor");
        executor = c4689tj0;
        vungleApiClient = vungleApiClient2;
        try {
            BlockingQueue<C4455r30> blockingQueue = pendingErrors;
            if (!blockingQueue.isEmpty()) {
                blockingQueue.drainTo(errors);
            }
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "Failed to add pendingErrors to errors queue.", e);
        }
        try {
            BlockingQueue<C5071y30> blockingQueue2 = pendingMetrics;
            if (!blockingQueue2.isEmpty()) {
                blockingQueue2.drainTo(metrics);
            }
        } catch (Exception e2) {
            C4917wJ.Companion.e(TAG, "Failed to add pendingMetrics to metrics queue.", e2);
        }
        int i2 = 0;
        if (refreshEnabled) {
            Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new U3(c4689tj0, i2), 0L, 5000L, TimeUnit.MILLISECONDS);
        }
        updateErrorLevelAndMetricEnabled$vungle_ads_release(i, z);
        if (i == W3.ERROR_LOG_LEVEL_DEBUG.getLevel()) {
            C4917wJ.Companion.enable(true);
        } else if (i == W3.ERROR_LOG_LEVEL_ERROR.getLevel()) {
            C4917wJ.Companion.enable(false);
        } else if (i == W3.ERROR_LOG_LEVEL_OFF.getLevel()) {
            C4917wJ.Companion.enable(false);
        }
    }

    public final synchronized void logError$vungle_ads_release(EnumC4719u30 enumC4719u30, String str, C4126nJ c4126nJ) {
        try {
            AbstractC2995aW.q(enumC4719u30, "reason");
            AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
            try {
                C4689tj0 c4689tj0 = executor;
                if (c4689tj0 == null) {
                    pendingErrors.put(genSDKError(enumC4719u30, str, c4126nJ));
                } else {
                    if (c4689tj0 != null) {
                        c4689tj0.execute(new RunnableC4746uO(enumC4719u30, str, c4126nJ, 14));
                    }
                }
            } catch (Exception e) {
                C4917wJ.Companion.e(TAG, "Cannot logError " + enumC4719u30 + ", " + str + ", " + c4126nJ, e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void logMetric$vungle_ads_release(PS ps, C4126nJ c4126nJ, String str) {
        AbstractC2995aW.q(ps, "oneShotTimeIntervalMetric");
        if (!ps.isLogged()) {
            logMetric$vungle_ads_release((C5115yc0) ps, c4126nJ, str);
            ps.markLogged();
        }
    }

    public final void setExecutor$vungle_ads_release(C4689tj0 c4689tj0) {
        executor = c4689tj0;
    }

    public final void setMetricsEnabled$vungle_ads_release(boolean z) {
        metricsEnabled = z;
    }

    public final void setRefreshEnabled$vungle_ads_release(boolean z) {
        refreshEnabled = z;
    }

    public final void setVungleApiClient$vungle_ads_release(VungleApiClient vungleApiClient2) {
        vungleApiClient = vungleApiClient2;
    }

    public final synchronized void updateErrorLevelAndMetricEnabled$vungle_ads_release(int i, boolean z) {
        logLevel = W3.Companion.fromValue(i);
        metricsEnabled = z;
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(C2961a4 c2961a4, B30 b30, long j, C4126nJ c4126nJ, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c2961a4.logMetric$vungle_ads_release(b30, j, (i & 4) != 0 ? null : c4126nJ, (i & 8) != 0 ? null : str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(C2961a4 c2961a4, C3586h70 c3586h70, C4126nJ c4126nJ, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            c4126nJ = null;
        }
        if ((i & 4) != 0) {
            str = c3586h70.getMeta();
        }
        c2961a4.logMetric$vungle_ads_release(c3586h70, c4126nJ, str);
    }

    public final synchronized void logMetric$vungle_ads_release(final B30 b30, final long j, final C4126nJ c4126nJ, final String str) {
        AbstractC2995aW.q(b30, "metricType");
        try {
            C4689tj0 c4689tj0 = executor;
            if (c4689tj0 == null) {
                pendingMetrics.put(genMetric(b30, j, c4126nJ, str));
            } else {
                if (c4689tj0 != null) {
                    c4689tj0.execute(new Runnable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.T3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2961a4.m229logMetric$lambda3(b30, j, c4126nJ, str);
                        }
                    });
                }
            }
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "Cannot logMetric " + b30 + ", " + j + ", " + c4126nJ + ", " + str, e);
        }
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(C2961a4 c2961a4, C5115yc0 c5115yc0, C4126nJ c4126nJ, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            c4126nJ = null;
        }
        if ((i & 4) != 0) {
            str = c5115yc0.getMeta();
        }
        c2961a4.logMetric$vungle_ads_release(c5115yc0, c4126nJ, str);
    }

    public final synchronized void logMetric$vungle_ads_release(C3586h70 c3586h70, C4126nJ c4126nJ, String str) {
        AbstractC2995aW.q(c3586h70, "singleValueMetric");
        logMetric$vungle_ads_release(c3586h70.getMetricType(), c3586h70.getValue(), c4126nJ, str);
    }

    public final synchronized void logMetric$vungle_ads_release(C5115yc0 c5115yc0, C4126nJ c4126nJ, String str) {
        AbstractC2995aW.q(c5115yc0, "timeIntervalMetric");
        logMetric$vungle_ads_release(c5115yc0.getMetricType(), c5115yc0.getValue(), c4126nJ, str);
    }

    @VisibleForTesting
    public static /* synthetic */ void getErrors$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExecutor$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMetrics$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMetricsEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPendingErrors$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPendingMetrics$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getVungleApiClient$vungle_ads_release$annotations() {
    }
}
