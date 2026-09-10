package com.unity3d.ads;

import ak.f;
import android.app.Activity;
import android.content.Context;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import com.ironsource.ph;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.h;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b*\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004STUVB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\t\u0010\rJ+\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\t\u0010\u0010J5\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\t\u0010\u0011J#\u0010\u0015\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0015\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0015\u0010\u0019J-\u0010\u0015\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u0015\u0010\u001cJ7\u0010\u0015\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0015\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u001e\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b\u001e\u0010\"J-\u0010\u001e\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b\u001e\u0010%J\u0019\u0010'\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b'\u0010(J\u001f\u0010'\u001a\u00020\b2\u0006\u0010*\u001a\u00020)2\u0006\u0010!\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010+J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010*\u001a\u00020,2\u0006\u0010!\u001a\u00020-H\u0007¢\u0006\u0004\b\t\u0010.R*\u0010/\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b/\u00100\u0012\u0004\b4\u0010\u0003\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u001fR*\u00105\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b5\u00106\u0012\u0004\b;\u0010\u0003\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010<\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b<\u00106\u0012\u0004\b?\u0010\u0003\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R*\u0010@\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b@\u00106\u0012\u0004\bC\u0010\u0003\u001a\u0004\bA\u00108\"\u0004\bB\u0010:R\u001a\u0010D\u001a\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bF\u0010\u0003\u001a\u0004\bD\u0010ER\u001a\u0010G\u001a\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010\u0003\u001a\u0004\bG\u0010ER\u001a\u0010K\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\bJ\u0010\u0003\u001a\u0004\bI\u00102R*\u0010L\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\u000e8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bP\u0010\u0003\u001a\u0004\bM\u0010E\"\u0004\bN\u0010OR\u001c\u0010R\u001a\u0004\u0018\u00010\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\bQ\u0010\u0003\u001a\u0004\b'\u00102¨\u0006W"}, d2 = {"Lcom/unity3d/ads/UnityAds;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "Lwj/r;", MobileAdsBridgeBase.initializeMethodName, "(Landroid/content/Context;Ljava/lang/String;)V", "Lcom/unity3d/ads/IUnityAdsInitializationListener;", "initializationListener", "(Landroid/content/Context;Ljava/lang/String;Lcom/unity3d/ads/IUnityAdsInitializationListener;)V", "", "testMode", "(Landroid/content/Context;Ljava/lang/String;Z)V", "(Landroid/content/Context;Ljava/lang/String;ZLcom/unity3d/ads/IUnityAdsInitializationListener;)V", "Landroid/app/Activity;", "activity", "placementId", "show", "(Landroid/app/Activity;Ljava/lang/String;)V", "Lcom/unity3d/ads/IUnityAdsShowListener;", "showListener", "(Landroid/app/Activity;Ljava/lang/String;Lcom/unity3d/ads/IUnityAdsShowListener;)V", "Lcom/unity3d/ads/UnityAdsShowOptions;", "options", "(Landroid/app/Activity;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;)V", "(Landroid/app/Activity;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;Lcom/unity3d/ads/IUnityAdsShowListener;)V", "load", "(Ljava/lang/String;)V", "Lcom/unity3d/ads/IUnityAdsLoadListener;", "listener", "(Ljava/lang/String;Lcom/unity3d/ads/IUnityAdsLoadListener;)V", "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/unity3d/ads/IUnityAdsLoadListener;)V", "Lcom/unity3d/ads/IUnityAdsTokenListener;", "getToken", "(Lcom/unity3d/ads/IUnityAdsTokenListener;)V", "Lcom/unity3d/ads/TokenConfiguration;", "configuration", "(Lcom/unity3d/ads/TokenConfiguration;Lcom/unity3d/ads/IUnityAdsTokenListener;)V", "Lcom/unity3d/ads/InitializationConfiguration;", "Lcom/unity3d/ads/InitializationListener;", "(Lcom/unity3d/ads/InitializationConfiguration;Lcom/unity3d/ads/InitializationListener;)V", "userIdentifier", "Ljava/lang/String;", "getUserIdentifier", "()Ljava/lang/String;", "setUserIdentifier", "getUserIdentifier$annotations", "userConsent", "Ljava/lang/Boolean;", "getUserConsent", "()Ljava/lang/Boolean;", "setUserConsent", "(Ljava/lang/Boolean;)V", "getUserConsent$annotations", "userOptOut", "getUserOptOut", "setUserOptOut", "getUserOptOut$annotations", "nonBehavioral", "getNonBehavioral", "setNonBehavioral", "getNonBehavioral$annotations", "isInitialized", "()Z", "isInitialized$annotations", "isSupported", "isSupported$annotations", "getVersion", "getVersion$annotations", "version", "debugMode", "getDebugMode", "setDebugMode", "(Z)V", "getDebugMode$annotations", "getToken$annotations", "token", "UnityAdsInitializationError", "UnityAdsLoadError", "UnityAdsShowCompletionState", "UnityAdsShowError", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class UnityAds {
    public static final UnityAds INSTANCE = new UnityAds();
    private static Boolean nonBehavioral;
    private static Boolean userConsent;
    private static String userIdentifier;
    private static Boolean userOptOut;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsInitializationError;", "", "(Ljava/lang/String;I)V", "INTERNAL_ERROR", "INVALID_ARGUMENT", "AD_BLOCKER_DETECTED", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsLoadError;", "", "(Ljava/lang/String;I)V", "INITIALIZE_FAILED", "INTERNAL_ERROR", "INVALID_ARGUMENT", "NO_FILL", "TIMEOUT", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "", "(Ljava/lang/String;I)V", "SKIPPED", "COMPLETED", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "", "(Ljava/lang/String;I)V", "NOT_INITIALIZED", "NOT_READY", "VIDEO_PLAYER_ERROR", "INVALID_ARGUMENT", "NO_CONNECTION", "ALREADY_SHOWING", "INTERNAL_ERROR", "TIMEOUT", "EXPIRED", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT,
        EXPIRED
    }

    /* JADX INFO: renamed from: com.unity3d.ads.UnityAds$initialize$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.UnityAds$initialize$7", f = "UnityAds.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass7 extends i implements jk.c {
        final /* synthetic */ InitializationConfiguration $configuration;
        final /* synthetic */ InitializationListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(InitializationConfiguration initializationConfiguration, InitializationListener initializationListener, f fVar) {
            super(2, fVar);
            this.$configuration = initializationConfiguration;
            this.$listener = initializationListener;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass7(this.$configuration, this.$listener, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass7) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            if (this.$configuration.getMediationInfo() != null) {
                MediationMetaData mediationMetaData = new MediationMetaData(ClientProperties.getApplicationContext());
                InitializationConfiguration initializationConfiguration = this.$configuration;
                mediationMetaData.setName(initializationConfiguration.getMediationInfo().getName());
                mediationMetaData.setVersion(initializationConfiguration.getMediationInfo().getVersion());
                mediationMetaData.set("adapter_version", initializationConfiguration.getMediationInfo().getAdapterVersion());
                mediationMetaData.commit();
            }
            UnityServices.initialize(ClientProperties.getApplicationContext(), this.$configuration.getGameId(), this.$configuration.getIsTestModeEnabled(), this.$configuration, this.$listener);
            return r.f53297a;
        }
    }

    private UnityAds() {
    }

    public static final boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    public static final Boolean getNonBehavioral() {
        return nonBehavioral;
    }

    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$26$lambda$25$lambda$24(IUnityAdsTokenListener tokenListener) {
        n.f(tokenListener, "$tokenListener");
        tokenListener.onUnityAdsTokenReady(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$29$lambda$28(IUnityAdsTokenListener listener) {
        n.f(listener, "$listener");
        listener.onUnityAdsTokenReady(null);
    }

    public static final Boolean getUserConsent() {
        return userConsent;
    }

    public static final String getUserIdentifier() {
        return userIdentifier;
    }

    public static final Boolean getUserOptOut() {
        return userOptOut;
    }

    public static final String getVersion() {
        String version = UnityAdsImplementation.getInstance().getVersion();
        n.e(version, "getInstance().version");
        return version;
    }

    public static final void initialize(Context context, String gameId) {
        try {
            UnityAdsImplementation.getInstance().initialize(context, gameId, false, null);
        } catch (Throwable th2) {
            t9.e.c(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$4$lambda$3$lambda$2(IUnityAdsInitializationListener listener, Throwable exception) {
        n.f(listener, "$listener");
        n.f(exception, "$exception");
        listener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + exception.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$9$lambda$8$lambda$7(IUnityAdsInitializationListener listener, Throwable exception) {
        n.f(listener, "$listener");
        n.f(exception, "$exception");
        listener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + exception.getMessage());
    }

    public static final boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    public static final boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    public static final void load(String placementId) {
        try {
            load(placementId, new IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds$load$1$1
                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsAdLoaded(String placementId2) {
                    n.f(placementId2, "placementId");
                }

                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsFailedToLoad(String placementId2, UnityAds.UnityAdsLoadError error, String message) {
                    n.f(placementId2, "placementId");
                    n.f(error, "error");
                    n.f(message, "message");
                }
            });
        } catch (Throwable th2) {
            t9.e.c(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$22$lambda$21$lambda$20(IUnityAdsLoadListener loadListener, String str, Throwable exception) {
        n.f(loadListener, "$loadListener");
        n.f(exception, "$exception");
        if (str == null) {
            str = "unknown";
        }
        loadListener.onUnityAdsFailedToLoad(str, UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + exception.getMessage());
    }

    public static final void setDebugMode(boolean z10) {
        try {
            UnityAdsImplementation.getInstance().setDebugMode(z10);
        } catch (Throwable th2) {
            t9.e.c(th2);
        }
    }

    public static final void setNonBehavioral(Boolean bool) {
        nonBehavioral = bool;
    }

    public static final void setUserConsent(Boolean bool) {
        userConsent = bool;
    }

    public static final void setUserIdentifier(String str) {
        userIdentifier = str;
    }

    public static final void setUserOptOut(Boolean bool) {
        userOptOut = bool;
    }

    public static final void show(Activity activity, String placementId) {
        try {
            UnityAdsImplementation.getInstance().show(activity, placementId, new UnityAdsShowOptions(), null);
        } catch (Throwable th2) {
            t9.e.c(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$16$lambda$15$lambda$14(IUnityAdsShowListener listener, String str, Throwable exception) {
        n.f(listener, "$listener");
        n.f(exception, "$exception");
        if (str == null) {
            str = "unknown";
        }
        listener.onUnityAdsShowFailure(str, UnityAdsShowError.INTERNAL_ERROR, "Unity Ads SDK show failed due to unexpected error: " + exception.getMessage());
    }

    public static final void getToken(IUnityAdsTokenListener listener) {
        Object objC;
        try {
            UnityAdsImplementation.getInstance().getToken(listener);
            objC = r.f53297a;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        if (h.a(objC) == null || listener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new b(listener, 0));
    }

    public static final void initialize(Context context, String gameId, IUnityAdsInitializationListener initializationListener) {
        Object objC;
        try {
            UnityAdsImplementation.getInstance().initialize(context, gameId, false, initializationListener);
            objC = r.f53297a;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        Throwable thA = h.a(objC);
        if (thA == null || initializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new c(initializationListener, thA, 1));
    }

    public static final void load(String placementId, IUnityAdsLoadListener listener) {
        load(placementId, new UnityAdsLoadOptions(), listener);
    }

    public static final void show(Activity activity, String placementId, IUnityAdsShowListener showListener) {
        try {
            UnityAdsImplementation.getInstance().show(activity, placementId, new UnityAdsShowOptions(), showListener);
        } catch (Throwable th2) {
            t9.e.c(th2);
        }
    }

    public static final void load(String placementId, UnityAdsLoadOptions loadOptions, IUnityAdsLoadListener listener) {
        Object objC;
        try {
            IUnityAds unityAdsImplementation = UnityAdsImplementation.getInstance();
            if (loadOptions == null) {
                loadOptions = new UnityAdsLoadOptions();
            }
            unityAdsImplementation.load(placementId, loadOptions, listener);
            objC = r.f53297a;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        Throwable thA = h.a(objC);
        if (thA == null || listener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new ph(listener, placementId, thA, 20));
    }

    public static final void show(Activity activity, String placementId, UnityAdsShowOptions options) {
        try {
            UnityAdsImplementation.getInstance().show(activity, placementId, options, null);
        } catch (Throwable th2) {
            t9.e.c(th2);
        }
    }

    public static final void getToken(TokenConfiguration configuration, IUnityAdsTokenListener listener) {
        Object objC;
        n.f(configuration, "configuration");
        n.f(listener, "listener");
        try {
            UnityAdsImplementation.getInstance().getToken(configuration, listener);
            objC = r.f53297a;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        if (h.a(objC) != null) {
            Utilities.wrapCustomerListener(new b(listener, 1));
        }
    }

    public static final void show(Activity activity, String placementId, UnityAdsShowOptions options, IUnityAdsShowListener showListener) {
        Object objC;
        try {
            UnityAdsImplementation.getInstance().show(activity, placementId, options, showListener);
            objC = r.f53297a;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        Throwable thA = h.a(objC);
        if (thA == null || showListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new ph(showListener, placementId, thA, 19));
    }

    public static final void initialize(Context context, String gameId, boolean testMode) {
        try {
            UnityAdsImplementation.getInstance().initialize(context, gameId, testMode, null);
        } catch (Throwable th2) {
            t9.e.c(th2);
        }
    }

    public static final void initialize(Context context, String gameId, boolean testMode, IUnityAdsInitializationListener initializationListener) {
        Object objC;
        try {
            UnityAdsImplementation.getInstance().initialize(context, gameId, testMode, initializationListener);
            objC = r.f53297a;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        Throwable thA = h.a(objC);
        if (thA == null || initializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new c(initializationListener, thA, 0));
    }

    @UnityAdsExperimental
    public static final void initialize(InitializationConfiguration configuration, InitializationListener listener) {
        n.f(configuration, "configuration");
        n.f(listener, "listener");
        d0.w((a0) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, kotlin.jvm.internal.d0.f44761a.b(a0.class))), null, new AnonymousClass7(configuration, listener, null), 3);
    }

    public static /* synthetic */ void getDebugMode$annotations() {
    }

    @UnityAdsExperimental
    public static /* synthetic */ void getNonBehavioral$annotations() {
    }

    public static /* synthetic */ void getToken$annotations() {
    }

    @UnityAdsExperimental
    public static /* synthetic */ void getUserConsent$annotations() {
    }

    @UnityAdsExperimental
    public static /* synthetic */ void getUserIdentifier$annotations() {
    }

    @UnityAdsExperimental
    public static /* synthetic */ void getUserOptOut$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static /* synthetic */ void isSupported$annotations() {
    }
}
