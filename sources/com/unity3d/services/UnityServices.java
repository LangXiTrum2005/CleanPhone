package com.unity3d.services;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.InitializationConfiguration;
import com.unity3d.ads.InitializationListener;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u000f\u0010\u0012R \u0010\u0013\u001a\u00020\b8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0019\u0010\u001aR*\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/unity3d/services/UnityServices;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "", "testMode", "Lcom/unity3d/ads/InitializationConfiguration;", "initializationConfiguration", "Lcom/unity3d/ads/IUnityAdsInitializationListener;", "initializationListener", "Lwj/r;", MobileAdsBridgeBase.initializeMethodName, "(Landroid/content/Context;Ljava/lang/String;ZLcom/unity3d/ads/InitializationConfiguration;Lcom/unity3d/ads/IUnityAdsInitializationListener;)V", "Lcom/unity3d/ads/InitializationListener;", "(Landroid/content/Context;Ljava/lang/String;ZLcom/unity3d/ads/InitializationConfiguration;Lcom/unity3d/ads/InitializationListener;)V", "isSupported", "Z", "()Z", "isSupported$annotations", "isInitialized", "isInitialized$annotations", "getVersion", "()Ljava/lang/String;", "getVersion$annotations", "version", "debugMode", "getDebugMode", "setDebugMode", "(Z)V", "getDebugMode$annotations", "UnityServicesError", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class UnityServices {
    public static final UnityServices INSTANCE = new UnityServices();
    private static final boolean isSupported = true;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/services/UnityServices$UnityServicesError;", "", "(Ljava/lang/String;I)V", "INVALID_ARGUMENT", "INIT_SANITY_CHECK_FAIL", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public enum UnityServicesError {
        INVALID_ARGUMENT,
        INIT_SANITY_CHECK_FAIL
    }

    private UnityServices() {
    }

    public static final boolean getDebugMode() {
        return SdkProperties.getDebugMode();
    }

    public static final String getVersion() {
        String versionName = SdkProperties.getVersionName();
        n.e(versionName, "getVersionName()");
        return versionName;
    }

    public static final synchronized void initialize(Context context, String gameId, boolean testMode, InitializationConfiguration initializationConfiguration, IUnityAdsInitializationListener initializationListener) {
        DeviceLog.entered();
        SdkProperties.addInitializationListener(initializationListener);
        SdkProperties.setTestMode(testMode);
        SdkProperties.setDebugMode(SdkProperties.getDebugMode());
        CachedLifecycle.register();
        UnityAdsSDK.initialize$default(new UnityAdsSDK(null, 1, 0 == true ? 1 : 0), gameId, null, initializationConfiguration, 2, null);
    }

    public static final boolean isInitialized() {
        return SdkProperties.isInitialized();
    }

    public static final boolean isSupported() {
        return isSupported;
    }

    public static final void setDebugMode(boolean z10) {
        SdkProperties.setDebugMode(z10);
    }

    public static final synchronized void initialize(Context context, String gameId, boolean testMode, InitializationConfiguration initializationConfiguration, InitializationListener initializationListener) {
        DeviceLog.entered();
        SdkProperties.addInitializationListener(initializationListener);
        SdkProperties.setTestMode(testMode);
        SdkProperties.setDebugMode(SdkProperties.getDebugMode());
        CachedLifecycle.register();
        UnityAdsSDK.initialize$default(new UnityAdsSDK(null, 1, 0 == true ? 1 : 0), gameId, null, initializationConfiguration, 2, null);
    }

    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static /* synthetic */ void isSupported$annotations() {
    }
}
