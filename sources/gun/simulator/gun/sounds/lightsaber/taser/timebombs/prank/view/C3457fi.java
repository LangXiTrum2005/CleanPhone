package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.internal.network.VungleApiClient;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3457fi {
    private static final int CONFIG_ALL_DATA = 2;
    private static final int CONFIG_LAST_VALIDATED_TIMESTAMP_ONLY = 1;
    public static final long CONFIG_LAST_VALIDATE_TS_DEFAULT = -1;
    private static final int CONFIG_NOT_AVAILABLE = 0;
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 900;
    private static final int DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS = 1800;
    public static final String TAG = "ConfigManager";
    private static String applicationId;
    private static C2622Ni config;
    private static String configExt;
    private static C4862vi endpoints;
    private static List<C4664tU> placements;
    public static final C3457fi INSTANCE = new C3457fi();
    private static final VE json = WD.b(C3281di.INSTANCE);

    private C3457fi() {
    }

    /* JADX INFO: renamed from: fetchConfigAsync$lambda-0, reason: not valid java name */
    private static final VungleApiClient m239fetchConfigAsync$lambda0(InterfaceC3069bH interfaceC3069bH) {
        return (VungleApiClient) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: initWithConfig$lambda-2, reason: not valid java name */
    private static final C2919Yt m240initWithConfig$lambda2(InterfaceC3069bH interfaceC3069bH) {
        return (C2919Yt) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: initWithConfig$lambda-5, reason: not valid java name */
    private static final C3080bS m241initWithConfig$lambda5(InterfaceC3069bH interfaceC3069bH) {
        return (C3080bS) interfaceC3069bH.getValue();
    }

    public static /* synthetic */ void initWithConfig$vungle_ads_release$default(C3457fi c3457fi, Context context, C2622Ni c2622Ni, boolean z, C3586h70 c3586h70, int i, Object obj) {
        if ((i & 8) != 0) {
            c3586h70 = null;
        }
        c3457fi.initWithConfig$vungle_ads_release(context, c2622Ni, z, c3586h70);
    }

    /* JADX INFO: renamed from: updateConfigExtension$lambda-1, reason: not valid java name */
    private static final C2919Yt m242updateConfigExtension$lambda1(InterfaceC3069bH interfaceC3069bH) {
        return (C2919Yt) interfaceC3069bH.getValue();
    }

    public static /* synthetic */ boolean validateEndpoints$vungle_ads_release$default(C3457fi c3457fi, C4862vi c4862vi, int i, Object obj) {
        if ((i & 1) != 0) {
            c4862vi = endpoints;
        }
        return c3457fi.validateEndpoints$vungle_ads_release(c4862vi);
    }

    public final long afterClickDuration() {
        C3983li autoRedirect;
        Long afterClickDuration;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (autoRedirect = c2622Ni.getAutoRedirect()) == null || (afterClickDuration = autoRedirect.getAfterClickDuration()) == null) {
            return Long.MAX_VALUE;
        }
        return afterClickDuration.longValue();
    }

    public final boolean allowAutoRedirects() {
        C3983li autoRedirect;
        Boolean allowAutoRedirect;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (autoRedirect = c2622Ni.getAutoRedirect()) == null || (allowAutoRedirect = autoRedirect.getAllowAutoRedirect()) == null) {
            return false;
        }
        return allowAutoRedirect.booleanValue();
    }

    @VisibleForTesting
    public final int checkConfigPayload$vungle_ads_release(C2622Ni c2622Ni) {
        if (c2622Ni == null || c2622Ni.getConfigLastValidatedTimestamp() == null) {
            return 0;
        }
        Long configLastValidatedTimestamp = c2622Ni.getConfigLastValidatedTimestamp();
        if (configLastValidatedTimestamp != null && configLastValidatedTimestamp.longValue() == -1) {
            return 0;
        }
        return c2622Ni.getEndpoints() == null ? 1 : 2;
    }

    @VisibleForTesting
    public final void clearConfig$vungle_ads_release() {
        endpoints = null;
        placements = null;
        config = null;
    }

    public final long configLastValidatedTimestamp() {
        Long configLastValidatedTimestamp;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (configLastValidatedTimestamp = c2622Ni.getConfigLastValidatedTimestamp()) == null) {
            return -1L;
        }
        return configLastValidatedTimestamp.longValue();
    }

    public final void fetchConfigAsync$vungle_ads_release(Context context, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(interfaceC2766Sw, "onComplete");
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        InterfaceC3069bH interfaceC3069bHH = AbstractC2340Cl.H(EnumC4124nH.f4736a, new C2933Zh(context));
        try {
            C5115yc0 c5115yc0 = new C5115yc0(B30.INIT_REQUEST_TO_RESPONSE_DURATION_MS);
            c5115yc0.markStart();
            InterfaceC2435Gc interfaceC2435GcConfig = m239fetchConfigAsync$lambda0(interfaceC3069bHH).config();
            if (interfaceC2435GcConfig != null) {
                ((C4662tS) interfaceC2435GcConfig).enqueue(new C3015ai(c5115yc0, context, interfaceC2766Sw));
            }
        } catch (Throwable th) {
            if ((th instanceof UnknownHostException) || (th instanceof SecurityException)) {
                new CR(AbstractC3888ke0.l(th, new StringBuilder("Config unknown: "))).logErrorNoReturnValue$vungle_ads_release();
            } else {
                new CR(AbstractC3888ke0.l(th, new StringBuilder("Config: "))).logErrorNoReturnValue$vungle_ads_release();
            }
            interfaceC2766Sw.invoke(Boolean.FALSE);
        }
    }

    public final boolean fpdEnabled() {
        Boolean fpdEnabled;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (fpdEnabled = c2622Ni.getFpdEnabled()) == null) {
            return true;
        }
        return fpdEnabled.booleanValue();
    }

    public final String getAdsEndpoint() {
        C4862vi c4862vi = endpoints;
        String str = null;
        String adsEndpoint = c4862vi != null ? c4862vi.getAdsEndpoint() : null;
        if (adsEndpoint != null && adsEndpoint.length() != 0) {
            str = adsEndpoint;
        }
        return str == null ? C2390Ej.DEFAULT_ADS_ENDPOINT : str;
    }

    public final C2622Ni getCachedConfig(C2919Yt c2919Yt, String str) {
        Long refreshTime;
        AbstractC2995aW.q(c2919Yt, "filePreferences");
        AbstractC2995aW.q(str, "appId");
        try {
            String string = c2919Yt.getString("config_app_id");
            if (string != null && string.length() != 0 && AbstractC3089ba0.o0(string, str)) {
                String string2 = c2919Yt.getString("config_response");
                if (string2 == null) {
                    return null;
                }
                long j = c2919Yt.getLong("config_update_time", 0L);
                VE ve = json;
                C2622Ni c2622Ni = (C2622Ni) ve.a(AbstractC3375el.V(ve.b, AbstractC3263dY.d(C2622Ni.class)), string2);
                C4598si configSettings = c2622Ni.getConfigSettings();
                if (((configSettings == null || (refreshTime = configSettings.getRefreshTime()) == null) ? -1L : refreshTime.longValue()) + j < System.currentTimeMillis()) {
                    C4917wJ.Companion.w(TAG, "cache config expired. re-config");
                    return null;
                }
                C4917wJ.Companion.w(TAG, "use cache config.");
                return c2622Ni;
            }
            C4917wJ.Companion.w(TAG, "app id mismatch, re-config");
            return null;
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "Error while parsing cached config: " + e.getMessage());
            return null;
        }
    }

    public final int getCleverCacheDiskPercentage() {
        C4247oi cleverCache;
        Integer diskPercentage;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (cleverCache = c2622Ni.getCleverCache()) == null || (diskPercentage = cleverCache.getDiskPercentage()) == null) {
            return 3;
        }
        return diskPercentage.intValue();
    }

    public final long getCleverCacheDiskSize() {
        C4247oi cleverCache;
        Long diskSize;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (cleverCache = c2622Ni.getCleverCache()) == null || (diskSize = cleverCache.getDiskSize()) == null) {
            return 1048576000L;
        }
        long j = 1024;
        return diskSize.longValue() * j * j;
    }

    public final String getConfigExtension() {
        String str = configExt;
        return str == null ? "" : str;
    }

    public final String getErrorLoggingEndpoint() {
        C4862vi c4862vi = endpoints;
        String str = null;
        String errorLogsEndpoint = c4862vi != null ? c4862vi.getErrorLogsEndpoint() : null;
        if (errorLogsEndpoint != null && errorLogsEndpoint.length() != 0) {
            str = errorLogsEndpoint;
        }
        return str == null ? C2390Ej.DEFAULT_ERROR_LOGS_ENDPOINT : str;
    }

    public final String getGDPRButtonAccept() {
        C2519Ji userPrivacy;
        C5126yi gdpr;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (userPrivacy = c2622Ni.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonAccept();
    }

    public final String getGDPRButtonDeny() {
        C2519Ji userPrivacy;
        C5126yi gdpr;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (userPrivacy = c2622Ni.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonDeny();
    }

    public final String getGDPRConsentMessage() {
        C2519Ji userPrivacy;
        C5126yi gdpr;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (userPrivacy = c2622Ni.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentMessage();
    }

    public final String getGDPRConsentMessageVersion() {
        C2519Ji userPrivacy;
        C5126yi gdpr;
        String consentMessageVersion;
        C2622Ni c2622Ni = config;
        return (c2622Ni == null || (userPrivacy = c2622Ni.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (consentMessageVersion = gdpr.getConsentMessageVersion()) == null) ? "" : consentMessageVersion;
    }

    public final String getGDPRConsentTitle() {
        C2519Ji userPrivacy;
        C5126yi gdpr;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (userPrivacy = c2622Ni.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentTitle();
    }

    public final boolean getGDPRIsCountryDataProtected() {
        C2519Ji userPrivacy;
        C5126yi gdpr;
        Boolean boolIsCountryDataProtected;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (userPrivacy = c2622Ni.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (boolIsCountryDataProtected = gdpr.isCountryDataProtected()) == null) {
            return false;
        }
        return boolIsCountryDataProtected.booleanValue();
    }

    public final int getLogLevel() {
        C2441Gi logMetricsSettings;
        Integer errorLogLevel;
        C2622Ni c2622Ni = config;
        return (c2622Ni == null || (logMetricsSettings = c2622Ni.getLogMetricsSettings()) == null || (errorLogLevel = logMetricsSettings.getErrorLogLevel()) == null) ? W3.ERROR_LOG_LEVEL_ERROR.getLevel() : errorLogLevel.intValue();
    }

    public final boolean getMetricsEnabled() {
        C2441Gi logMetricsSettings;
        Boolean metricsEnabled;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (logMetricsSettings = c2622Ni.getLogMetricsSettings()) == null || (metricsEnabled = logMetricsSettings.getMetricsEnabled()) == null) {
            return false;
        }
        return metricsEnabled.booleanValue();
    }

    public final String getMetricsEndpoint() {
        C4862vi c4862vi = endpoints;
        String str = null;
        String metricsEndpoint = c4862vi != null ? c4862vi.getMetricsEndpoint() : null;
        if (metricsEndpoint != null && metricsEndpoint.length() != 0) {
            str = metricsEndpoint;
        }
        return str == null ? C2390Ej.DEFAULT_METRICS_ENDPOINT : str;
    }

    public final String getMraidEndpoint() {
        C4862vi c4862vi = endpoints;
        if (c4862vi != null) {
            return c4862vi.getMraidEndpoint();
        }
        return null;
    }

    public final String getMraidJsVersion() {
        String mraidEndpoint = getMraidEndpoint();
        if (mraidEndpoint != null) {
            String str = "mraid_" + Uri.parse(mraidEndpoint).getLastPathSegment();
            if (str != null) {
                return str;
            }
        }
        return "mraid_1";
    }

    public final C4664tU getPlacement(String str) {
        List<C4664tU> list = placements;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (AbstractC2995aW.i(((C4664tU) obj2).getReferenceId(), str)) {
                obj = obj2;
                break;
            }
        }
        return (C4664tU) obj;
    }

    public final String getRiEndpoint() {
        C4862vi c4862vi = endpoints;
        if (c4862vi != null) {
            return c4862vi.getRiEndpoint();
        }
        return null;
    }

    public final long getSessionTimeout() {
        Integer sessionTimeout;
        C2622Ni c2622Ni = config;
        return ((long) ((c2622Ni == null || (sessionTimeout = c2622Ni.getSessionTimeout()) == null) ? 900 : sessionTimeout.intValue())) * 1000;
    }

    public final long getSignalsSessionTimeout() {
        Integer signalSessionTimeout;
        C2622Ni c2622Ni = config;
        return ((long) ((c2622Ni == null || (signalSessionTimeout = c2622Ni.getSignalSessionTimeout()) == null) ? DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS : signalSessionTimeout.intValue())) * 1000;
    }

    public final EnumC2337Ci getTcfStatus() {
        C2519Ji userPrivacy;
        C2363Di iab;
        C2311Bi c2311Bi = EnumC2337Ci.Companion;
        C2622Ni c2622Ni = config;
        return c2311Bi.fromRawValue((c2622Ni == null || (userPrivacy = c2622Ni.getUserPrivacy()) == null || (iab = userPrivacy.getIab()) == null) ? null : iab.getTcfStatus());
    }

    public final synchronized void initWithConfig$vungle_ads_release(Context context, C2622Ni c2622Ni, boolean z, C3586h70 c3586h70) {
        try {
            AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
            try {
                ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
                EnumC4124nH enumC4124nH = EnumC4124nH.f4736a;
                InterfaceC3069bH interfaceC3069bHH = AbstractC2340Cl.H(enumC4124nH, new C3104bi(context));
                int iCheckConfigPayload$vungle_ads_release = checkConfigPayload$vungle_ads_release(c2622Ni);
                if (iCheckConfigPayload$vungle_ads_release == 0) {
                    C4917wJ.Companion.e(TAG, "Config is not available.");
                    return;
                }
                if (iCheckConfigPayload$vungle_ads_release == 1) {
                    if (!z && c2622Ni != null) {
                        Long configLastValidatedTimestamp = c2622Ni.getConfigLastValidatedTimestamp();
                        long jLongValue = configLastValidatedTimestamp != null ? configLastValidatedTimestamp.longValue() : -1L;
                        C2622Ni c2622Ni2 = config;
                        if (c2622Ni2 != null) {
                            c2622Ni2.setConfigLastValidatedTimestamp(Long.valueOf(jLongValue));
                        }
                        C2622Ni c2622Ni3 = config;
                        if (c2622Ni3 != null) {
                            INSTANCE.updateCachedConfig(c2622Ni3, m240initWithConfig$lambda2(interfaceC3069bHH));
                        }
                    }
                    return;
                }
                config = c2622Ni;
                endpoints = c2622Ni != null ? c2622Ni.getEndpoints() : null;
                placements = c2622Ni != null ? c2622Ni.getPlacements() : null;
                C2961a4 c2961a4 = C2961a4.INSTANCE;
                c2961a4.updateErrorLevelAndMetricEnabled$vungle_ads_release(getLogLevel(), getMetricsEnabled());
                if (!z && c2622Ni != null) {
                    updateCachedConfig(c2622Ni, m240initWithConfig$lambda2(interfaceC3069bHH));
                    String configExtension = c2622Ni.getConfigExtension();
                    if (configExtension != null) {
                        INSTANCE.updateConfigExtension$vungle_ads_release(context, configExtension);
                    }
                }
                if (omEnabled()) {
                    m241initWithConfig$lambda5(AbstractC2340Cl.H(enumC4124nH, new C3192ci(context))).init();
                }
                if (c3586h70 != null) {
                    C2961a4.logMetric$vungle_ads_release$default(c2961a4, c3586h70, (C4126nJ) null, (String) null, 6, (Object) null);
                }
                OV.INSTANCE.updateDisableAdId(shouldDisableAdId());
            } catch (Exception e) {
                C4917wJ.Companion.e(TAG, "Error while validating config: " + e.getMessage());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean isCacheableAssetsRequired() {
        Boolean boolIsCacheableAssetsRequired;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (boolIsCacheableAssetsRequired = c2622Ni.isCacheableAssetsRequired()) == null) {
            return false;
        }
        return boolIsCacheableAssetsRequired.booleanValue();
    }

    public final boolean isCleverCacheEnabled() {
        C4247oi cleverCache;
        Boolean enabled;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (cleverCache = c2622Ni.getCleverCache()) == null || (enabled = cleverCache.getEnabled()) == null) {
            return false;
        }
        return enabled.booleanValue();
    }

    public final boolean isReportIncentivizedEnabled() {
        Boolean boolIsReportIncentivizedEnabled;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (boolIsReportIncentivizedEnabled = c2622Ni.isReportIncentivizedEnabled()) == null) {
            return false;
        }
        return boolIsReportIncentivizedEnabled.booleanValue();
    }

    public final boolean omEnabled() {
        C2596Mi viewAbility;
        Boolean om;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (viewAbility = c2622Ni.getViewAbility()) == null || (om = viewAbility.getOm()) == null) {
            return false;
        }
        return om.booleanValue();
    }

    public final List<C4664tU> placements() {
        return placements;
    }

    public final boolean rtaDebuggingEnabled() {
        Boolean rtaDebugging;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (rtaDebugging = c2622Ni.getRtaDebugging()) == null) {
            return false;
        }
        return rtaDebugging.booleanValue();
    }

    public final void setAppId$vungle_ads_release(String str) {
        AbstractC2995aW.q(str, "applicationId");
        applicationId = str;
    }

    public final boolean shouldDisableAdId() {
        Boolean disableAdId;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (disableAdId = c2622Ni.getDisableAdId()) == null) {
            return true;
        }
        return disableAdId.booleanValue();
    }

    public final boolean signalsDisabled() {
        Boolean signalsDisabled;
        C2622Ni c2622Ni = config;
        if (c2622Ni == null || (signalsDisabled = c2622Ni.getSignalsDisabled()) == null) {
            return false;
        }
        return signalsDisabled.booleanValue();
    }

    public final void updateCachedConfig(C2622Ni c2622Ni, C2919Yt c2919Yt) {
        AbstractC2995aW.q(c2622Ni, "config");
        AbstractC2995aW.q(c2919Yt, "filePreferences");
        try {
            String str = applicationId;
            if (str == null) {
                AbstractC2995aW.x0("applicationId");
                throw null;
            }
            c2919Yt.put("config_app_id", str);
            c2919Yt.put("config_update_time", System.currentTimeMillis());
            VE ve = json;
            c2919Yt.put("config_response", ve.b(AbstractC3375el.V(ve.b, AbstractC3263dY.d(C2622Ni.class)), c2622Ni));
            c2919Yt.apply();
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "Exception: " + e.getMessage() + " for updating cached config");
        }
    }

    @VisibleForTesting
    public final void updateConfigExtension$vungle_ads_release(Context context, String str) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(str, "ext");
        configExt = str;
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        m242updateConfigExtension$lambda1(AbstractC2340Cl.H(EnumC4124nH.f4736a, new C3369ei(context))).put("config_extension", str).apply();
    }

    @VisibleForTesting
    public final boolean validateConfig$vungle_ads_release(C2622Ni c2622Ni) {
        return ((c2622Ni != null ? c2622Ni.getEndpoints() : null) == null || !validateEndpoints$vungle_ads_release(c2622Ni.getEndpoints()) || c2622Ni.getPlacements() == null) ? false : true;
    }

    @VisibleForTesting
    public final boolean validateEndpoints$vungle_ads_release(C4862vi c4862vi) {
        boolean z;
        String adsEndpoint = c4862vi != null ? c4862vi.getAdsEndpoint() : null;
        boolean z2 = false;
        if (adsEndpoint == null || adsEndpoint.length() == 0) {
            new C3243dE(EnumC4719u30.INVALID_ADS_ENDPOINT, "The ads endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
            z = false;
        } else {
            z = true;
        }
        String riEndpoint = c4862vi != null ? c4862vi.getRiEndpoint() : null;
        if (riEndpoint == null || riEndpoint.length() == 0) {
            new C3243dE(EnumC4719u30.INVALID_RI_ENDPOINT, "The ri endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        String mraidEndpoint = c4862vi != null ? c4862vi.getMraidEndpoint() : null;
        if (mraidEndpoint == null || mraidEndpoint.length() == 0) {
            new C3243dE(EnumC4719u30.MRAID_DOWNLOAD_JS_ERROR, "The mraid endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        } else {
            z2 = z;
        }
        String metricsEndpoint = c4862vi != null ? c4862vi.getMetricsEndpoint() : null;
        if (metricsEndpoint == null || metricsEndpoint.length() == 0) {
            new C3243dE(EnumC4719u30.INVALID_METRICS_ENDPOINT, "The metrics endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        String errorLogsEndpoint = c4862vi != null ? c4862vi.getErrorLogsEndpoint() : null;
        if (errorLogsEndpoint == null || errorLogsEndpoint.length() == 0) {
            C4917wJ.Companion.e(TAG, "The error logging endpoint was not provided in the config.");
        }
        return z2;
    }
}
