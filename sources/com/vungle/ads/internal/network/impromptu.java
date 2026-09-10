package com.vungle.ads.internal.network;

import androidx.core.app.NotificationCompat;
import asosan.adultoid;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.util.arytenoidectomy;
import com.vungle.ads.internal.util.polloi;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import monacal.ErrorInfo;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.KTypeProjection;
import p002kotlin.text.Regex;

/* JADX INFO: compiled from: TpatSender.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001<B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b \u0010!J#\u0010#\u001a\u00020\u001b2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'J\u000f\u0010*\u001a\u00020\u001bH\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/vungle/ads/internal/network/impromptu;", "", "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "Ljava/util/concurrent/Executor;", "ioExecutor", "jobExecutor", "Lcom/vungle/ads/internal/util/polloi;", "pathProvider", "Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager", "<init>", "(Lcom/vungle/ads/internal/network/VungleApiClient;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/util/polloi;Lcom/vungle/ads/internal/signals/SignalManager;)V", "", NotificationCompat.CATEGORY_EVENT, "", "isPriorityTpat", "(Ljava/lang/String;)Z", "Lcom/vungle/ads/internal/network/beachfront;", AdActivity.REQUEST_KEY_EXTRA, "url", "Lmonacal/beachfront;", "performPriorityRetry", "(Lcom/vungle/ads/internal/network/beachfront;Ljava/lang/String;)Lmonacal/beachfront;", "error", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;", "reason", "", "logTpatError", "(Lcom/vungle/ads/internal/network/beachfront;Ljava/lang/String;Lmonacal/beachfront;Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;)V", "", "Lcom/vungle/ads/internal/network/dern;", "getStoredTpats", "()Ljava/util/Map;", "tpats", "saveStoredTpats", "(Ljava/util/Map;)V", "fromFailedTpat", "sendTpat", "(Lcom/vungle/ads/internal/network/beachfront;Z)V", "resendStoredTpats$vungle_ads_release", "()V", "resendStoredTpats", "injectSessionIdToUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/vungle/ads/internal/network/VungleApiClient;", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "Ljava/util/concurrent/Executor;", "getJobExecutor", "()Ljava/util/concurrent/Executor;", "Lcom/vungle/ads/internal/signals/SignalManager;", "getSignalManager", "()Lcom/vungle/ads/internal/signals/SignalManager;", "Lresplend/saneness;", "tpatFilePreferences", "Lresplend/saneness;", "tpatLock", "Ljava/lang/Object;", "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class impromptu {
    private static final String FAILED_TPATS = "FAILED_TPATS";
    private static final String TAG = "TpatSender";
    private final Executor jobExecutor;
    private final SignalManager signalManager;
    private final resplend.saneness tpatFilePreferences;
    private final Object tpatLock;
    private final VungleApiClient vungleApiClient;

    public impromptu(VungleApiClient vungleApiClient, Executor ioExecutor, Executor jobExecutor, polloi pathProvider, SignalManager signalManager) {
        Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
        Intrinsics.checkNotNullParameter(jobExecutor, "jobExecutor");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.vungleApiClient = vungleApiClient;
        this.jobExecutor = jobExecutor;
        this.signalManager = signalManager;
        this.tpatFilePreferences = resplend.saneness.INSTANCE.get(ioExecutor, pathProvider, resplend.saneness.TPAT_FAILED_FILENAME);
        this.tpatLock = new Object();
    }

    private final Map<String, FailedTpat> getStoredTpats() {
        Object objM3351constructorimpl;
        String string = this.tpatFilePreferences.getString(FAILED_TPATS);
        if (string != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                cutwater.attabal.Companion c0579attabal = cutwater.attabal.INSTANCE;
                cerebral.dern dernVarAttabal = c0579attabal.getSerializersModule();
                KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
                asosan.wireman<Object> wiremanVarSaneness = adultoid.saneness(dernVarAttabal, p002kotlin.jvm.internal.polloi.marial(p002kotlin.jvm.internal.polloi.arytenoidectomy(Map.class, companion2.wireman(p002kotlin.jvm.internal.polloi.triweekly(String.class)), companion2.wireman(p002kotlin.jvm.internal.polloi.triweekly(FailedTpat.class)))));
                Intrinsics.competently(wiremanVarSaneness, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                objM3351constructorimpl = Result.m3351constructorimpl((Map) c0579attabal.dern(wiremanVarSaneness, string));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
            Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
            if (thM3354exceptionOrNullimpl != null) {
                arytenoidectomy.INSTANCE.e(TAG, "Failed to decode stored tpats: " + thM3354exceptionOrNullimpl);
            }
            if (Result.m3354exceptionOrNullimpl(objM3351constructorimpl) != null) {
                objM3351constructorimpl = new LinkedHashMap();
            }
            Map<String, FailedTpat> map = (Map) objM3351constructorimpl;
            if (map != null) {
                return map;
            }
        }
        return new LinkedHashMap();
    }

    private final boolean isPriorityTpat(String event) {
        return Intrinsics.wireman(event, com.vungle.ads.internal.saneness.CHECKPOINT_0) || Intrinsics.wireman(event, com.vungle.ads.internal.saneness.CLICK_URL) || Intrinsics.wireman(event, "impression") || Intrinsics.wireman(event, com.vungle.ads.internal.saneness.LOAD_AD);
    }

    private final void logTpatError(beachfront request, String url, ErrorInfo error, Sdk$SDKError.Reason reason) throws InterruptedException {
        String str = "tpat key: " + request.getTpatKey() + ", error: " + error.getDescription() + ", errorIsTerminal: " + error.getErrorIsTerminal() + " url: " + url;
        arytenoidectomy.INSTANCE.e(TAG, str);
        new TpatError(reason, str).setLogEntry$vungle_ads_release(request.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
    }

    private final ErrorInfo performPriorityRetry(beachfront request, String url) throws InterruptedException {
        String str;
        ErrorInfo errorInfoPingTPAT;
        Boolean priorityRetry = request.getPriorityRetry();
        boolean zBooleanValue = priorityRetry != null ? priorityRetry.booleanValue() : isPriorityTpat(request.getTpatKey());
        int i = 0;
        while (true) {
            str = url;
            errorInfoPingTPAT = this.vungleApiClient.pingTPAT(str, request.getHeaders(), request.getBody(), request.getMethod(), request.getLogEntry());
            if (!zBooleanValue || errorInfoPingTPAT == null || !errorInfoPingTPAT.isRetryCode() || (i = i + 1) >= request.getPriorityRetryCount()) {
                break;
            }
            url = str;
        }
        if (errorInfoPingTPAT != null) {
            logTpatError(request, str, errorInfoPingTPAT, i >= request.getPriorityRetryCount() ? Sdk$SDKError.Reason.TPAT_RETRY_FAILED : Sdk$SDKError.Reason.TPAT_ERROR);
        }
        return errorInfoPingTPAT;
    }

    private final void saveStoredTpats(Map<String, FailedTpat> tpats) {
        Object objM3351constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            resplend.saneness sanenessVar = this.tpatFilePreferences;
            cutwater.attabal.Companion c0579attabal = cutwater.attabal.INSTANCE;
            cerebral.dern dernVarAttabal = c0579attabal.getSerializersModule();
            KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
            asosan.wireman<Object> wiremanVarSaneness = adultoid.saneness(dernVarAttabal, p002kotlin.jvm.internal.polloi.marial(p002kotlin.jvm.internal.polloi.arytenoidectomy(Map.class, companion2.wireman(p002kotlin.jvm.internal.polloi.triweekly(String.class)), companion2.wireman(p002kotlin.jvm.internal.polloi.triweekly(FailedTpat.class)))));
            Intrinsics.competently(wiremanVarSaneness, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            sanenessVar.put(FAILED_TPATS, c0579attabal.saneness(wiremanVarSaneness, tpats)).apply();
            objM3351constructorimpl = Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        if (Result.m3354exceptionOrNullimpl(objM3351constructorimpl) != null) {
            arytenoidectomy.INSTANCE.e(TAG, "Failed to encode the about to storing tpats: " + tpats);
        }
    }

    public static /* synthetic */ void sendTpat$default(impromptu impromptuVar, beachfront beachfrontVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        impromptuVar.sendTpat(beachfrontVar, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendTpat$lambda-1, reason: not valid java name */
    public static final void m3234sendTpat$lambda1(impromptu this$0, beachfront request, String urlWithSessionId, boolean z) throws InterruptedException {
        FailedTpat failedTpat;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(urlWithSessionId, "$urlWithSessionId");
        ErrorInfo errorInfoPerformPriorityRetry = this$0.performPriorityRetry(request, urlWithSessionId);
        if (request.getRegularRetry()) {
            if (errorInfoPerformPriorityRetry == null || !errorInfoPerformPriorityRetry.getErrorIsTerminal()) {
                if (errorInfoPerformPriorityRetry != null || z) {
                    synchronized (this$0.tpatLock) {
                        try {
                            Map<String, FailedTpat> storedTpats = this$0.getStoredTpats();
                            FailedTpat failedTpat2 = storedTpats.get(request.getUrl());
                            int retryAttempt = failedTpat2 != null ? failedTpat2.getRetryAttempt() : 0;
                            if (errorInfoPerformPriorityRetry == null && retryAttempt > 0) {
                                storedTpats.remove(request.getUrl());
                                this$0.saveStoredTpats(storedTpats);
                            } else if (errorInfoPerformPriorityRetry != null && retryAttempt >= request.getRegularRetryCount()) {
                                storedTpats.remove(request.getUrl());
                                this$0.saveStoredTpats(storedTpats);
                                this$0.logTpatError(request, urlWithSessionId, errorInfoPerformPriorityRetry, Sdk$SDKError.Reason.TPAT_RETRY_FAILED);
                            } else if (errorInfoPerformPriorityRetry != null) {
                                FailedTpat failedTpat3 = storedTpats.get(request.getUrl());
                                if (failedTpat3 == null || (failedTpat = FailedTpat.copy$default(failedTpat3, null, null, null, retryAttempt + 1, 0, null, 55, null)) == null) {
                                    failedTpat = new FailedTpat(request.getMethod(), request.getHeaders(), request.getBody(), 1, request.getRegularRetryCount(), request.getTpatKey());
                                }
                                storedTpats.put(request.getUrl(), failedTpat);
                                this$0.saveStoredTpats(storedTpats);
                            }
                            Unit unit = Unit.f29295attabal;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final Executor getJobExecutor() {
        return this.jobExecutor;
    }

    public final SignalManager getSignalManager() {
        return this.signalManager;
    }

    public final VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final String injectSessionIdToUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        SignalManager signalManager = this.signalManager;
        String uuid = signalManager != null ? signalManager.getUuid() : null;
        if (uuid == null) {
            uuid = "";
        }
        if (uuid.length() <= 0) {
            return url;
        }
        String strQuote = Pattern.quote(com.vungle.ads.internal.saneness.SESSION_ID);
        Intrinsics.checkNotNullExpressionValue(strQuote, "quote(Constants.SESSION_ID)");
        return new Regex(strQuote).replace(url, uuid);
    }

    public final void resendStoredTpats$vungle_ads_release() {
        for (Map.Entry<String, FailedTpat> entry : getStoredTpats().entrySet()) {
            String key = entry.getKey();
            FailedTpat value = entry.getValue();
            sendTpat(new beachfront.attabal(key).regularRetry(true).priorityRetry(false).headers(value.getHeaders()).body(value.getBody()).regularRetryCount(value.getRetryCount()).method(value.getMethod()).tpatKey(value.getTpatKey()).build(), true);
        }
    }

    public final void sendTpat(final beachfront request, final boolean fromFailedTpat) {
        Intrinsics.checkNotNullParameter(request, "request");
        final String strInjectSessionIdToUrl = injectSessionIdToUrl(request.getUrl());
        this.jobExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.network.competently
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                impromptu.m3234sendTpat$lambda1(this.f23759kowloon, request, strInjectSessionIdToUrl, fromFailedTpat);
            }
        });
    }

    public /* synthetic */ impromptu(VungleApiClient vungleApiClient, Executor executor, Executor executor2, polloi polloiVar, SignalManager signalManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(vungleApiClient, executor, executor2, polloiVar, (i & 16) != 0 ? null : signalManager);
    }
}
