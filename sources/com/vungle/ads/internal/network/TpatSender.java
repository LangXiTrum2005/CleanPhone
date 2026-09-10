package com.vungle.ads.internal.network;

import A.U;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.ErrorInfo;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0001-B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0007J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0002J(\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u001a\u0010&\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\r\u0010'\u001a\u00020\u001fH\u0000¢\u0006\u0002\b(J\u001c\u0010)\u001a\u00020\u001f2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0002J\u0018\u0010+\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010,\u001a\u00020\u001cR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006."}, d2 = {"Lcom/vungle/ads/internal/network/TpatSender;", "", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "ioExecutor", "Ljava/util/concurrent/Executor;", "jobExecutor", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "(Lcom/vungle/ads/internal/network/VungleApiClient;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/util/PathProvider;Lcom/vungle/ads/internal/signals/SignalManager;)V", "getJobExecutor", "()Ljava/util/concurrent/Executor;", "getSignalManager", "()Lcom/vungle/ads/internal/signals/SignalManager;", "tpatFilePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "tpatLock", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "getStoredTpats", "", "", "Lcom/vungle/ads/internal/network/FailedTpat;", "injectSessionIdToUrl", "url", "isPriorityTpat", "", "event", "logTpatError", "", "request", "Lcom/vungle/ads/internal/network/TpatRequest;", "error", "Lcom/vungle/ads/internal/model/ErrorInfo;", "reason", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;", "performPriorityRetry", "resendStoredTpats", "resendStoredTpats$vungle_ads_release", "saveStoredTpats", "tpats", "sendTpat", "fromFailedTpat", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TpatSender {
    private static final String FAILED_TPATS = "FAILED_TPATS";
    private static final String TAG = "TpatSender";
    private final Executor jobExecutor;
    private final SignalManager signalManager;
    private final FilePreferences tpatFilePreferences;
    private final Object tpatLock;
    private final VungleApiClient vungleApiClient;

    public TpatSender(VungleApiClient vungleApiClient, Executor ioExecutor, Executor jobExecutor, PathProvider pathProvider, SignalManager signalManager) {
        Intrinsics.f(vungleApiClient, "vungleApiClient");
        Intrinsics.f(ioExecutor, "ioExecutor");
        Intrinsics.f(jobExecutor, "jobExecutor");
        Intrinsics.f(pathProvider, "pathProvider");
        this.vungleApiClient = vungleApiClient;
        this.jobExecutor = jobExecutor;
        this.signalManager = signalManager;
        this.tpatFilePreferences = FilePreferences.INSTANCE.get(ioExecutor, pathProvider, FilePreferences.TPAT_FAILED_FILENAME);
        this.tpatLock = new Object();
    }

    private final Map<String, FailedTpat> getStoredTpats() {
        Object objA;
        String string = this.tpatFilePreferences.getString(FAILED_TPATS);
        if (string != null) {
            try {
                Json.Companion r1 = Json.INSTANCE;
                SerializersModule serializersModule = r1.getSerializersModule();
                KTypeProjection kTypeProjection = KTypeProjection.f43351c;
                KTypeProjection kTypeProjectionA = KTypeProjection.Companion.a(Reflection.b(String.class));
                KTypeProjection kTypeProjectionA2 = KTypeProjection.Companion.a(Reflection.b(FailedTpat.class));
                ReflectionFactory reflectionFactory = Reflection.f43333a;
                KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(serializersModule, reflectionFactory.d(reflectionFactory.m(reflectionFactory.b(Map.class), Arrays.asList(kTypeProjectionA, kTypeProjectionA2), false)));
                Intrinsics.d(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                objA = (Map) r1.decodeFromString(kSerializerSerializer, string);
            } catch (Throwable th) {
                objA = ResultKt.a(th);
            }
            Throwable thA = Result.a(objA);
            if (thA != null) {
                Logger.INSTANCE.e(TAG, "Failed to decode stored tpats: " + thA);
            }
            if (Result.a(objA) != null) {
                objA = new LinkedHashMap();
            }
            Map<String, FailedTpat> map = (Map) objA;
            if (map != null) {
                return map;
            }
        }
        return new LinkedHashMap();
    }

    private final boolean isPriorityTpat(String event) {
        return Intrinsics.a(event, Constants.CHECKPOINT_0) || Intrinsics.a(event, Constants.CLICK_URL) || Intrinsics.a(event, "impression") || Intrinsics.a(event, Constants.LOAD_AD);
    }

    private final void logTpatError(TpatRequest request, String url, ErrorInfo error, Sdk.SDKError.Reason reason) {
        StringBuilder sb = new StringBuilder("tpat key: ");
        sb.append(request.getTpatKey());
        sb.append(", error: ");
        sb.append(error.getDescription());
        sb.append(", errorIsTerminal: ");
        sb.append(error.getErrorIsTerminal());
        String strR = android.support.v4.media.a.r(sb, " url: ", url);
        Logger.INSTANCE.e(TAG, strR);
        new TpatError(reason, strR).setLogEntry$vungle_ads_release(request.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
    }

    private final ErrorInfo performPriorityRetry(TpatRequest request, String url) {
        String str;
        ErrorInfo errorInfoPingTPAT;
        Boolean priorityRetry = request.getPriorityRetry();
        int i2 = 0;
        boolean z2 = ConfigManager.INSTANCE.retryPriorityTPATs() && (priorityRetry != null ? priorityRetry.booleanValue() : isPriorityTpat(request.getTpatKey()));
        while (true) {
            str = url;
            errorInfoPingTPAT = this.vungleApiClient.pingTPAT(str, request.getHeaders(), request.getBody(), request.getMethod(), request.getLogEntry());
            if (!z2 || errorInfoPingTPAT == null || !errorInfoPingTPAT.isRetryCode() || (i2 = i2 + 1) >= request.getPriorityRetryCount()) {
                break;
            }
            url = str;
        }
        if (errorInfoPingTPAT != null) {
            logTpatError(request, str, errorInfoPingTPAT, i2 >= request.getPriorityRetryCount() ? Sdk.SDKError.Reason.TPAT_RETRY_FAILED : Sdk.SDKError.Reason.TPAT_ERROR);
        }
        return errorInfoPingTPAT;
    }

    private final void saveStoredTpats(Map<String, FailedTpat> tpats) {
        Object objA;
        try {
            FilePreferences filePreferences = this.tpatFilePreferences;
            Json.Companion r2 = Json.INSTANCE;
            SerializersModule serializersModule = r2.getSerializersModule();
            KTypeProjection kTypeProjection = KTypeProjection.f43351c;
            KTypeProjection kTypeProjectionA = KTypeProjection.Companion.a(Reflection.b(String.class));
            KTypeProjection kTypeProjectionA2 = KTypeProjection.Companion.a(Reflection.b(FailedTpat.class));
            ReflectionFactory reflectionFactory = Reflection.f43333a;
            KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(serializersModule, reflectionFactory.d(reflectionFactory.m(reflectionFactory.b(Map.class), Arrays.asList(kTypeProjectionA, kTypeProjectionA2), false)));
            Intrinsics.d(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            filePreferences.put(FAILED_TPATS, r2.encodeToString(kSerializerSerializer, tpats)).apply();
            objA = Unit.f43263a;
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        if (Result.a(objA) != null) {
            Logger.INSTANCE.e(TAG, "Failed to encode the about to storing tpats: " + tpats);
        }
    }

    public static /* synthetic */ void sendTpat$default(TpatSender tpatSender, TpatRequest tpatRequest, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        tpatSender.sendTpat(tpatRequest, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendTpat$lambda-1, reason: not valid java name */
    public static final void m3225sendTpat$lambda1(TpatSender this$0, TpatRequest request, String urlWithSessionId, boolean z2) {
        FailedTpat failedTpat;
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(request, "$request");
        Intrinsics.f(urlWithSessionId, "$urlWithSessionId");
        ErrorInfo errorInfoPerformPriorityRetry = this$0.performPriorityRetry(request, urlWithSessionId);
        if (request.getRegularRetry()) {
            if (errorInfoPerformPriorityRetry == null || !errorInfoPerformPriorityRetry.getErrorIsTerminal()) {
                if (errorInfoPerformPriorityRetry != null || z2) {
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
                                this$0.logTpatError(request, urlWithSessionId, errorInfoPerformPriorityRetry, Sdk.SDKError.Reason.TPAT_RETRY_FAILED);
                            } else if (errorInfoPerformPriorityRetry != null) {
                                FailedTpat failedTpat3 = storedTpats.get(request.getUrl());
                                if (failedTpat3 == null || (failedTpat = FailedTpat.copy$default(failedTpat3, null, null, null, retryAttempt + 1, 0, null, 55, null)) == null) {
                                    failedTpat = new FailedTpat(request.getMethod(), request.getHeaders(), request.getBody(), 1, request.getRegularRetryCount(), request.getTpatKey());
                                }
                                storedTpats.put(request.getUrl(), failedTpat);
                                this$0.saveStoredTpats(storedTpats);
                            }
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
        Intrinsics.f(url, "url");
        SignalManager signalManager = this.signalManager;
        String uuid = signalManager != null ? signalManager.getUuid() : null;
        if (uuid == null) {
            uuid = "";
        }
        if (uuid.length() <= 0) {
            return url;
        }
        String strQuote = Pattern.quote(Constants.SESSION_ID);
        Intrinsics.e(strQuote, "quote(Constants.SESSION_ID)");
        return new Regex(strQuote).c(uuid, url);
    }

    public final void resendStoredTpats$vungle_ads_release() {
        for (Map.Entry<String, FailedTpat> entry : getStoredTpats().entrySet()) {
            String key = entry.getKey();
            FailedTpat value = entry.getValue();
            sendTpat(new TpatRequest.Builder(key).regularRetry(true).priorityRetry(false).headers(value.getHeaders()).body(value.getBody()).regularRetryCount(value.getRetryCount()).method(value.getMethod()).tpatKey(value.getTpatKey()).build(), true);
        }
    }

    public final void sendTpat(TpatRequest request, boolean fromFailedTpat) {
        Intrinsics.f(request, "request");
        this.jobExecutor.execute(new U(this, request, injectSessionIdToUrl(request.getUrl()), fromFailedTpat, 10));
    }

    public /* synthetic */ TpatSender(VungleApiClient vungleApiClient, Executor executor, Executor executor2, PathProvider pathProvider, SignalManager signalManager, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(vungleApiClient, executor, executor2, pathProvider, (i2 & 16) != 0 ? null : signalManager);
    }
}
