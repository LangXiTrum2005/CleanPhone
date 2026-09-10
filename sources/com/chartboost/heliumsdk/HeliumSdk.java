package com.chartboost.heliumsdk;

import android.app.Activity;
import android.content.Context;
import com.chartboost.heliumsdk.ad.ChartboostMediationAdLoadRequest;
import com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAd;
import com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdListener;
import com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdLoadListener;
import com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdLoadResult;
import com.chartboost.heliumsdk.domain.AdapterInfo;
import com.chartboost.heliumsdk.utils.LifecycleStatusObserver;
import com.chartboost.heliumsdk.utils.LogController;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.d9;
import com.smartdigimkt.f3.b;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/HeliumSdk;", "", "()V", "ChartboostMediationInitializationStatus", "Companion", "HeliumSdkListener", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HeliumSdk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ChartboostMediationInternal chartboostMediationInternal = new ChartboostMediationInternal(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
    private static final LifecycleStatusObserver lifecycleStatusObserver = new LifecycleStatusObserver();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/HeliumSdk$ChartboostMediationInitializationStatus;", "", "(Ljava/lang/String;I)V", "IDLE", "INITIALIZING", "INITIALIZED", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ChartboostMediationInitializationStatus {
        IDLE,
        INITIALIZING,
        INITIALIZED
    }

    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0007J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u001b\u001a\u00020\u001cH\u0007J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0015H\u0007J\b\u0010\u001e\u001a\u00020\u0015H\u0007J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010!\u001a\u00020 H\u0007J)\u0010\"\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010(J(\u0010)\u001a\u00020*2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0007J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020 H\u0007J\u0010\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020 H\u0007J\u001c\u00101\u001a\u00020*2\b\u00102\u001a\u0004\u0018\u00010\u00152\b\u00103\u001a\u0004\u0018\u00010\u0015H\u0007J\u0010\u00104\u001a\u00020*2\u0006\u00105\u001a\u000206H\u0007J\u0010\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020 H\u0007J\u0010\u00109\u001a\u00020*2\u0006\u0010:\u001a\u00020 H\u0007J\u0010\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020 H\u0007J\u0010\u0010=\u001a\u00020*2\u0006\u0010>\u001a\u00020 H\u0007J\u0010\u0010?\u001a\u00020*2\u0006\u0010@\u001a\u00020 H\u0007J\u0012\u0010A\u001a\u00020*2\b\u0010B\u001a\u0004\u0018\u00010\u0015H\u0007J6\u0010C\u001a\u00020*2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\u00152\u0006\u0010E\u001a\u00020\u00152\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\b\u0010H\u001a\u0004\u0018\u00010IH\u0007J\u0010\u0010J\u001a\u00020*2\u0006\u0010K\u001a\u00020LH\u0007J\u0010\u0010M\u001a\u00020*2\u0006\u0010K\u001a\u00020NH\u0007J\u0010\u0010O\u001a\u00020*2\u0006\u0010K\u001a\u00020LH\u0007R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006P"}, d2 = {"Lcom/chartboost/heliumsdk/HeliumSdk$Companion;", "", "()V", "adapterInfo", "", "Lcom/chartboost/heliumsdk/domain/AdapterInfo;", "getAdapterInfo$annotations", "getAdapterInfo", "()Ljava/util/List;", "chartboostMediationInternal", "Lcom/chartboost/heliumsdk/ChartboostMediationInternal;", "getChartboostMediationInternal$Helium_release", "()Lcom/chartboost/heliumsdk/ChartboostMediationInternal;", "context", "Landroid/content/Context;", "getContext$annotations", "getContext", "()Landroid/content/Context;", "lifecycleStatusObserver", "Lcom/chartboost/heliumsdk/utils/LifecycleStatusObserver;", "getAppId", "", "getAppSignature", "getGameEngineName", "getGameEngineVersion", "getPartnerConsents", "Lcom/chartboost/heliumsdk/PartnerConsents;", "getTestMode", "", "getUserIdentifier", "getVersion", "isDebuggable", "", "isDiscardOversizedAdsEnabled", "loadFullscreenAd", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdLoadResult;", "request", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationAdLoadRequest;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdListener;", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/ad/ChartboostMediationAdLoadRequest;Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFullscreenAdFromJava", "", "adLoadListener", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdLoadListener;", "setCCPAConsent", "hasGivenCcpaConsent", "setDebugMode", "debugMode", "setGameEngine", "name", "version", "setLogLevel", "logLevel", "Lcom/chartboost/heliumsdk/utils/LogController$LogLevel;", "setShouldDiscardOversizedAds", "shouldDrop", "setSubjectToCoppa", "isSubject", "setSubjectToGDPR", "isSubjectToGdpr", "setTestMode", d9.a.t, "setUserHasGivenConsent", "hasGivenGdprConsent", "setUserIdentifier", "userIdentifier", "start", b.f35043u, "appSignature", "options", "Lcom/chartboost/heliumsdk/HeliumInitializationOptions;", "heliumSdkListener", "Lcom/chartboost/heliumsdk/HeliumSdk$HeliumSdkListener;", "subscribeIlrd", "observer", "Lcom/chartboost/heliumsdk/HeliumIlrdObserver;", "subscribeInitializationResults", "Lcom/chartboost/heliumsdk/PartnerInitializationResultsObserver;", "unsubscribeIlrd", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getAdapterInfo$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getContext$annotations() {
        }

        private final boolean isDebuggable(Context context) {
            return (context.getApplicationInfo().flags & 2) != 0;
        }

        public static /* synthetic */ void start$default(Companion companion, Context context, String str, String str2, HeliumInitializationOptions heliumInitializationOptions, HeliumSdkListener heliumSdkListener, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                heliumInitializationOptions = null;
            }
            companion.start(context, str, str2, heliumInitializationOptions, heliumSdkListener);
        }

        public final List<AdapterInfo> getAdapterInfo() {
            return getChartboostMediationInternal$Helium_release().getPartnerController().getAllAdapterInfo();
        }

        @JvmStatic
        public final String getAppId() {
            return getChartboostMediationInternal$Helium_release().getAppId();
        }

        @JvmStatic
        public final String getAppSignature() {
            return getChartboostMediationInternal$Helium_release().getAppSignature();
        }

        public final ChartboostMediationInternal getChartboostMediationInternal$Helium_release() {
            return HeliumSdk.chartboostMediationInternal;
        }

        public final Context getContext() {
            Activity activity = getChartboostMediationInternal$Helium_release().getWeakActivityContext$Helium_release().get();
            return activity != null ? activity : getChartboostMediationInternal$Helium_release().getAppContext();
        }

        @JvmStatic
        public final String getGameEngineName() {
            return getChartboostMediationInternal$Helium_release().getGameEngineName();
        }

        @JvmStatic
        public final String getGameEngineVersion() {
            return getChartboostMediationInternal$Helium_release().getGameEngineVersion();
        }

        @JvmStatic
        public final PartnerConsents getPartnerConsents(Context context) {
            Intrinsics.f(context, "context");
            return getChartboostMediationInternal$Helium_release().getPartnerConsents$Helium_release(context);
        }

        @JvmStatic
        public final int getTestMode() {
            return getChartboostMediationInternal$Helium_release().getTestMode() ? 1 : 0;
        }

        @JvmStatic
        public final String getUserIdentifier() {
            return getChartboostMediationInternal$Helium_release().getUserIdentifier();
        }

        @JvmStatic
        public final String getVersion() {
            return BuildConfig.CHARTBOOST_MEDIATION_VERSION;
        }

        @JvmStatic
        public final boolean isDiscardOversizedAdsEnabled() {
            return getChartboostMediationInternal$Helium_release().getShouldDiscardOversizedAds();
        }

        @JvmStatic
        public final Object loadFullscreenAd(Context context, ChartboostMediationAdLoadRequest chartboostMediationAdLoadRequest, ChartboostMediationFullscreenAdListener chartboostMediationFullscreenAdListener, Continuation<? super ChartboostMediationFullscreenAdLoadResult> continuation) {
            return ChartboostMediationFullscreenAd.Companion.loadFullscreenAd$Helium_release$default(ChartboostMediationFullscreenAd.INSTANCE, context, chartboostMediationAdLoadRequest, getChartboostMediationInternal$Helium_release().getAdController(), chartboostMediationFullscreenAdListener, null, continuation, 16, null);
        }

        @JvmStatic
        public final void loadFullscreenAdFromJava(Context context, ChartboostMediationAdLoadRequest request, ChartboostMediationFullscreenAdListener listener, ChartboostMediationFullscreenAdLoadListener adLoadListener) {
            Intrinsics.f(context, "context");
            Intrinsics.f(request, "request");
            Intrinsics.f(listener, "listener");
            Intrinsics.f(adLoadListener, "adLoadListener");
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new HeliumSdk$Companion$loadFullscreenAdFromJava$1(context, request, listener, adLoadListener, null), 3);
        }

        @JvmStatic
        public final void setCCPAConsent(boolean hasGivenCcpaConsent) {
            getChartboostMediationInternal$Helium_release().setCcpaConsent$Helium_release(hasGivenCcpaConsent);
        }

        @Deprecated
        @JvmStatic
        public final void setDebugMode(boolean debugMode) {
            if (debugMode) {
                LogController.INSTANCE.setLogLevel(LogController.LogLevel.VERBOSE);
            } else {
                LogController.INSTANCE.setLogLevel(LogController.LogLevel.INFO);
            }
        }

        @JvmStatic
        public final void setGameEngine(String name, String version) {
            getChartboostMediationInternal$Helium_release().setGameEngineName$Helium_release(name);
            getChartboostMediationInternal$Helium_release().setGameEngineVersion$Helium_release(version);
        }

        @JvmStatic
        public final void setLogLevel(LogController.LogLevel logLevel) {
            Intrinsics.f(logLevel, "logLevel");
            LogController.INSTANCE.setLogLevel(logLevel);
        }

        @JvmStatic
        public final void setShouldDiscardOversizedAds(boolean shouldDrop) {
            getChartboostMediationInternal$Helium_release().setShouldDiscardOversizedAds$Helium_release(shouldDrop);
        }

        @JvmStatic
        public final void setSubjectToCoppa(boolean isSubject) {
            getChartboostMediationInternal$Helium_release().setSubjectToCoppa$Helium_release(isSubject);
        }

        @JvmStatic
        public final void setSubjectToGDPR(boolean isSubjectToGdpr) {
            getChartboostMediationInternal$Helium_release().setSubjectToGdpr$Helium_release(isSubjectToGdpr);
        }

        @JvmStatic
        public final void setTestMode(boolean mode) {
            Context appContext$Helium_release = getChartboostMediationInternal$Helium_release().getAppContext();
            if (appContext$Helium_release == null) {
                LogController.INSTANCE.w("setTestMode() failed. Initialize the SDK first.");
                return;
            }
            if (!isDebuggable(appContext$Helium_release)) {
                LogController.INSTANCE.w("Set the application to debug mode to use setTestMode().");
                return;
            }
            getChartboostMediationInternal$Helium_release().setTestMode$Helium_release(mode);
            LogController logController = LogController.INSTANCE;
            StringBuilder sb = new StringBuilder("The Chartboost Mediation SDK is set to ONLY be requesting ");
            sb.append(mode ? "test" : "live");
            sb.append(" ads.");
            logController.w(sb.toString());
        }

        @JvmStatic
        public final void setUserHasGivenConsent(boolean hasGivenGdprConsent) {
            getChartboostMediationInternal$Helium_release().setUserHasGivenConsent$Helium_release(hasGivenGdprConsent);
        }

        @JvmStatic
        public final void setUserIdentifier(String userIdentifier) {
            getChartboostMediationInternal$Helium_release().setUserIdentifier$Helium_release(userIdentifier);
        }

        @JvmStatic
        public final void start(Context context, String appId, String appSignature, HeliumInitializationOptions options, HeliumSdkListener heliumSdkListener) {
            Intrinsics.f(context, "context");
            Intrinsics.f(appId, "appId");
            Intrinsics.f(appSignature, "appSignature");
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), new HeliumSdk$Companion$start$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.X, heliumSdkListener), null, new HeliumSdk$Companion$start$2(context, appId, appSignature, options, heliumSdkListener, null), 2);
        }

        @JvmStatic
        public final void subscribeIlrd(HeliumIlrdObserver observer) {
            Intrinsics.f(observer, "observer");
            getChartboostMediationInternal$Helium_release().getIlrd().subscribe(observer);
        }

        @JvmStatic
        public final void subscribeInitializationResults(PartnerInitializationResultsObserver observer) {
            Intrinsics.f(observer, "observer");
            getChartboostMediationInternal$Helium_release().getPartnerInitializationResults().subscribe(observer);
        }

        @JvmStatic
        public final void unsubscribeIlrd(HeliumIlrdObserver observer) {
            Intrinsics.f(observer, "observer");
            getChartboostMediationInternal$Helium_release().getIlrd().unsubscribe(observer);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/chartboost/heliumsdk/HeliumSdk$HeliumSdkListener;", "", "didInitialize", "", "error", "Ljava/lang/Error;", "Lkotlin/Error;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface HeliumSdkListener {
        void didInitialize(Error error);
    }

    private HeliumSdk() {
    }

    public static final List<AdapterInfo> getAdapterInfo() {
        return INSTANCE.getAdapterInfo();
    }

    @JvmStatic
    public static final String getAppId() {
        return INSTANCE.getAppId();
    }

    @JvmStatic
    public static final String getAppSignature() {
        return INSTANCE.getAppSignature();
    }

    public static final Context getContext() {
        return INSTANCE.getContext();
    }

    @JvmStatic
    public static final String getGameEngineName() {
        return INSTANCE.getGameEngineName();
    }

    @JvmStatic
    public static final String getGameEngineVersion() {
        return INSTANCE.getGameEngineVersion();
    }

    @JvmStatic
    public static final PartnerConsents getPartnerConsents(Context context) {
        return INSTANCE.getPartnerConsents(context);
    }

    @JvmStatic
    public static final int getTestMode() {
        return INSTANCE.getTestMode();
    }

    @JvmStatic
    public static final String getUserIdentifier() {
        return INSTANCE.getUserIdentifier();
    }

    @JvmStatic
    public static final String getVersion() {
        return INSTANCE.getVersion();
    }

    @JvmStatic
    public static final boolean isDiscardOversizedAdsEnabled() {
        return INSTANCE.isDiscardOversizedAdsEnabled();
    }

    @JvmStatic
    public static final Object loadFullscreenAd(Context context, ChartboostMediationAdLoadRequest chartboostMediationAdLoadRequest, ChartboostMediationFullscreenAdListener chartboostMediationFullscreenAdListener, Continuation<? super ChartboostMediationFullscreenAdLoadResult> continuation) {
        return INSTANCE.loadFullscreenAd(context, chartboostMediationAdLoadRequest, chartboostMediationFullscreenAdListener, continuation);
    }

    @JvmStatic
    public static final void loadFullscreenAdFromJava(Context context, ChartboostMediationAdLoadRequest chartboostMediationAdLoadRequest, ChartboostMediationFullscreenAdListener chartboostMediationFullscreenAdListener, ChartboostMediationFullscreenAdLoadListener chartboostMediationFullscreenAdLoadListener) {
        INSTANCE.loadFullscreenAdFromJava(context, chartboostMediationAdLoadRequest, chartboostMediationFullscreenAdListener, chartboostMediationFullscreenAdLoadListener);
    }

    @JvmStatic
    public static final void setCCPAConsent(boolean z2) {
        INSTANCE.setCCPAConsent(z2);
    }

    @Deprecated
    @JvmStatic
    public static final void setDebugMode(boolean z2) {
        INSTANCE.setDebugMode(z2);
    }

    @JvmStatic
    public static final void setGameEngine(String str, String str2) {
        INSTANCE.setGameEngine(str, str2);
    }

    @JvmStatic
    public static final void setLogLevel(LogController.LogLevel logLevel) {
        INSTANCE.setLogLevel(logLevel);
    }

    @JvmStatic
    public static final void setShouldDiscardOversizedAds(boolean z2) {
        INSTANCE.setShouldDiscardOversizedAds(z2);
    }

    @JvmStatic
    public static final void setSubjectToCoppa(boolean z2) {
        INSTANCE.setSubjectToCoppa(z2);
    }

    @JvmStatic
    public static final void setSubjectToGDPR(boolean z2) {
        INSTANCE.setSubjectToGDPR(z2);
    }

    @JvmStatic
    public static final void setTestMode(boolean z2) {
        INSTANCE.setTestMode(z2);
    }

    @JvmStatic
    public static final void setUserHasGivenConsent(boolean z2) {
        INSTANCE.setUserHasGivenConsent(z2);
    }

    @JvmStatic
    public static final void setUserIdentifier(String str) {
        INSTANCE.setUserIdentifier(str);
    }

    @JvmStatic
    public static final void start(Context context, String str, String str2, HeliumInitializationOptions heliumInitializationOptions, HeliumSdkListener heliumSdkListener) {
        INSTANCE.start(context, str, str2, heliumInitializationOptions, heliumSdkListener);
    }

    @JvmStatic
    public static final void subscribeIlrd(HeliumIlrdObserver heliumIlrdObserver) {
        INSTANCE.subscribeIlrd(heliumIlrdObserver);
    }

    @JvmStatic
    public static final void subscribeInitializationResults(PartnerInitializationResultsObserver partnerInitializationResultsObserver) {
        INSTANCE.subscribeInitializationResults(partnerInitializationResultsObserver);
    }

    @JvmStatic
    public static final void unsubscribeIlrd(HeliumIlrdObserver heliumIlrdObserver) {
        INSTANCE.unsubscribeIlrd(heliumIlrdObserver);
    }
}
