package com.adjust.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.adjust.sdk.network.ActivityPackageSender;
import com.adjust.sdk.network.UtilNetworking;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadExecutor;
import com.adjust.sdk.scheduler.TimerCycle;
import com.adjust.sdk.scheduler.TimerOnce;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.X3;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ActivityHandler implements IActivityHandler, SystemLifecycle.SystemLifecycleCallback {
    private static final String ACTIVITY_STATE_NAME = "Activity state";
    private static final String ATTRIBUTION_NAME = "Attribution";
    private static long BACKGROUND_TIMER_INTERVAL = 0;
    private static final String BACKGROUND_TIMER_NAME = "Background timer";
    private static final String DELAY_START_TIMER_NAME = "Delay Start timer";
    private static final String EVENT_METADATA_NAME = "Event metadata";
    private static long FOREGROUND_TIMER_INTERVAL = 0;
    private static final String FOREGROUND_TIMER_NAME = "Foreground timer";
    private static long FOREGROUND_TIMER_START = 0;
    private static final String GLOBAL_CALLBACK_PARAMETERS_NAME = "Global Callback parameters";
    private static final String GLOBAL_PARAMETERS_NAME = "Global parameters";
    private static final String GLOBAL_PARTNER_PARAMETERS_NAME = "Global Partner parameters";
    private static long SESSION_INTERVAL = 0;
    private static long SUBSESSION_INTERVAL = 0;
    private static final String TIME_TRAVEL = "Time travel!";
    private ActivityState activityState;
    private AdjustConfig adjustConfig;
    private AdjustAttribution attribution;
    private IAttributionHandler attributionHandler;
    private TimerOnce backgroundTimer;
    private String basePath;
    private List<AdjustThirdPartySharing> cachedAdjustThirdPartySharingArray;
    private OnDeeplinkResolvedListener cachedDeeplinkResolutionCallback;
    private Boolean cachedLastMeasurementConsentTrack;
    private DeviceInfo deviceInfo;
    ThreadExecutor executor;
    private q0 firstSessionDelayManager;
    private TimerCycle foregroundTimer;
    private String gdprPath;
    private GlobalParameters globalParameters;
    private InstallReferrer installReferrer;
    private InternalState internalState;
    private ILogger logger;
    private IPackageHandler packageHandler;
    private IPurchaseVerificationHandler purchaseVerificationHandler;
    private ISdkClickHandler sdkClickHandler;
    private String subscriptionPath;
    private SystemLifecycle systemLifecycle;
    private AdjustThirdPartySharingResult thirdPartySharingResult;
    private final ArrayList<OnAdidReadListener> cachedAdidReadCallbacks = new ArrayList<>();
    private final ArrayList<AdjustTimeoutCallback> cachedAdidReadTimeoutCallbacks = new ArrayList<>();
    private final ArrayList<OnAttributionReadListener> cachedAttributionReadCallbacks = new ArrayList<>();
    private final ArrayList<AdjustTimeoutCallback> cachedAttributionReadTimeoutCallbacks = new ArrayList<>();
    private final ArrayList<AdjustTimeoutCallback> cachedThirdPartySharingTimeoutCallbacks = new ArrayList<>();
    private EventMetadata eventMetadata = new EventMetadata();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class InternalState {
        boolean enabled;
        boolean firstLaunch;
        Boolean foregroundOrElseBackground;
        boolean offline;
        boolean preinstallHasBeenRead;
        boolean sessionResponseProcessed;

        public InternalState() {
        }

        public boolean hasPreinstallBeenRead() {
            return this.preinstallHasBeenRead;
        }

        public boolean hasSessionResponseNotBeenProcessed() {
            return !this.sessionResponseProcessed;
        }

        public boolean isDisabled() {
            return !this.enabled;
        }

        public boolean isEnabled() {
            return this.enabled;
        }

        public boolean isFirstLaunch() {
            return this.firstLaunch;
        }

        public boolean isInBackground() {
            Boolean bool = this.foregroundOrElseBackground;
            return (bool == null || bool.booleanValue()) ? false : true;
        }

        public boolean isInForeground() {
            Boolean bool = this.foregroundOrElseBackground;
            return bool != null && bool.booleanValue();
        }

        public boolean isOffline() {
            return this.offline;
        }

        public boolean isOnline() {
            return !this.offline;
        }
    }

    private ActivityHandler(AdjustConfig adjustConfig) {
        init(adjustConfig);
        ILogger logger = AdjustFactory.getLogger();
        this.logger = logger;
        logger.lockLogLevel();
        this.executor = new SingleThreadCachedScheduler("ActivityHandler");
        InternalState internalState = new InternalState();
        this.internalState = internalState;
        Boolean bool = adjustConfig.startEnabled;
        internalState.enabled = bool != null ? bool.booleanValue() : true;
        InternalState internalState2 = this.internalState;
        internalState2.offline = adjustConfig.startOffline;
        internalState2.sessionResponseProcessed = false;
        internalState2.preinstallHasBeenRead = false;
        this.cachedAdjustThirdPartySharingArray = null;
        this.cachedLastMeasurementConsentTrack = null;
        this.firstSessionDelayManager = new q0(this);
        this.executor.submit(new b2.o(3, this, adjustConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void backgroundTimerFiredI() {
        if (toSendI()) {
            this.packageHandler.sendFirstPackage();
        }
    }

    private void bootstrapLifecycleI() {
        SystemLifecycle singletonInstance = SystemLifecycle.getSingletonInstance();
        this.systemLifecycle = singletonInstance;
        Iterator<String> it = singletonInstance.logMessageList.iterator();
        while (it.hasNext()) {
            this.logger.debug("Lifecycle: %s", it.next());
        }
        this.systemLifecycle.overwriteCallback(this);
        if (AdjustFactory.isSystemLifecycleBootstrapIgnored()) {
            return;
        }
        this.internalState.foregroundOrElseBackground = this.systemLifecycle.foregroundOrElseBackgroundCached();
        if (this.internalState.isInForeground()) {
            onResumeI();
        }
    }

    private boolean canTrackMeasurementConsentI() {
        return checkActivityStateI(this.activityState) && isEnabledI() && !this.activityState.isGdprForgotten;
    }

    private boolean canTrackThirdPartySharingI() {
        if (!checkActivityStateI(this.activityState) || !isEnabledI() || this.activityState.isGdprForgotten) {
            return false;
        }
        if (!this.adjustConfig.coppaComplianceEnabled) {
            return true;
        }
        this.logger.warn("Calling third party sharing API not allowed when COPPA enabled", new Object[0]);
        return false;
    }

    private boolean checkActivityStateI(ActivityState activityState) {
        if (activityState != null) {
            return true;
        }
        this.logger.error("Sdk did not yet start", new Object[0]);
        return false;
    }

    private boolean checkAdjustAdRevenue(AdjustAdRevenue adjustAdRevenue) {
        if (adjustAdRevenue == null) {
            this.logger.error("Ad revenue object missing", new Object[0]);
            return false;
        }
        if (adjustAdRevenue.isValid()) {
            return true;
        }
        this.logger.error("Ad revenue object not initialized correctly", new Object[0]);
        return false;
    }

    private void checkAfterNewStartI() {
        checkAfterNewStartI(SharedPreferencesManager.getDefaultInstance(getContext()));
    }

    private void checkAttributionStateI() {
        if (checkActivityStateI(this.activityState)) {
            if (this.internalState.isFirstLaunch() && this.internalState.hasSessionResponseNotBeenProcessed()) {
                return;
            }
            if (this.attribution == null || this.activityState.askingAttribution) {
                this.attributionHandler.getAttribution();
            }
        }
    }

    private boolean checkEventI(AdjustEvent adjustEvent) {
        if (adjustEvent == null) {
            this.logger.error("Event missing", new Object[0]);
            return false;
        }
        if (adjustEvent.isValid()) {
            return true;
        }
        this.logger.error("Event not initialized correctly", new Object[0]);
        return false;
    }

    private void checkForInstallReferrerInfo(SdkClickResponseData sdkClickResponseData) {
        if (sdkClickResponseData.isInstallReferrer) {
            String str = sdkClickResponseData.referrerApi;
            if (str != null && str.equalsIgnoreCase(Constants.REFERRER_API_HUAWEI_ADS)) {
                ActivityState activityState = this.activityState;
                activityState.clickTimeHuawei = sdkClickResponseData.clickTime;
                activityState.installBeginHuawei = sdkClickResponseData.installBegin;
                activityState.installReferrerHuawei = sdkClickResponseData.installReferrer;
                writeActivityStateI();
                return;
            }
            String str2 = sdkClickResponseData.referrerApi;
            if (str2 != null && str2.equalsIgnoreCase(Constants.REFERRER_API_HUAWEI_APP_GALLERY)) {
                ActivityState activityState2 = this.activityState;
                activityState2.clickTimeHuawei = sdkClickResponseData.clickTime;
                activityState2.installBeginHuawei = sdkClickResponseData.installBegin;
                activityState2.installReferrerHuaweiAppGallery = sdkClickResponseData.installReferrer;
                writeActivityStateI();
                return;
            }
            String str3 = sdkClickResponseData.referrerApi;
            if (str3 != null && str3.equalsIgnoreCase(Constants.REFERRER_API_META)) {
                ActivityState activityState3 = this.activityState;
                activityState3.clickTimeMeta = sdkClickResponseData.clickTime;
                activityState3.installReferrerMeta = sdkClickResponseData.installReferrer;
                activityState3.isClickMeta = sdkClickResponseData.isClick;
                writeActivityStateI();
                return;
            }
            String str4 = sdkClickResponseData.referrerApi;
            if (str4 != null && str4.equalsIgnoreCase(Constants.REFERRER_API_SAMSUNG)) {
                ActivityState activityState4 = this.activityState;
                activityState4.clickTimeSamsung = sdkClickResponseData.clickTime;
                activityState4.installBeginSamsung = sdkClickResponseData.installBegin;
                activityState4.installReferrerSamsung = sdkClickResponseData.installReferrer;
                writeActivityStateI();
                return;
            }
            String str5 = sdkClickResponseData.referrerApi;
            if (str5 != null && str5.equalsIgnoreCase(Constants.REFERRER_API_XIAOMI)) {
                ActivityState activityState5 = this.activityState;
                activityState5.clickTimeXiaomi = sdkClickResponseData.clickTime;
                activityState5.installBeginXiaomi = sdkClickResponseData.installBegin;
                activityState5.installReferrerXiaomi = sdkClickResponseData.installReferrer;
                activityState5.clickTimeServerXiaomi = sdkClickResponseData.clickTimeServer;
                activityState5.installBeginServerXiaomi = sdkClickResponseData.installBeginServer;
                activityState5.installVersionXiaomi = sdkClickResponseData.installVersion;
                writeActivityStateI();
                return;
            }
            String str6 = sdkClickResponseData.referrerApi;
            if (str6 != null && str6.equalsIgnoreCase(Constants.REFERRER_API_VIVO)) {
                ActivityState activityState6 = this.activityState;
                activityState6.clickTimeVivo = sdkClickResponseData.clickTime;
                activityState6.installBeginVivo = sdkClickResponseData.installBegin;
                activityState6.installReferrerVivo = sdkClickResponseData.installReferrer;
                activityState6.installVersionVivo = sdkClickResponseData.installVersion;
                writeActivityStateI();
                return;
            }
            ActivityState activityState7 = this.activityState;
            activityState7.clickTime = sdkClickResponseData.clickTime;
            activityState7.installBegin = sdkClickResponseData.installBegin;
            activityState7.installReferrer = sdkClickResponseData.installReferrer;
            activityState7.clickTimeServer = sdkClickResponseData.clickTimeServer;
            activityState7.installBeginServer = sdkClickResponseData.installBeginServer;
            activityState7.installVersion = sdkClickResponseData.installVersion;
            activityState7.googlePlayInstant = sdkClickResponseData.googlePlayInstant;
            writeActivityStateI();
        }
    }

    private void checkForPreinstallI() {
        ActivityState activityState = this.activityState;
        if (activityState == null || !activityState.enabled || activityState.isGdprForgotten) {
            return;
        }
        lambda$sendPreinstallReferrer$18();
        if (this.adjustConfig.isPreinstallTrackingEnabled && !this.internalState.hasPreinstallBeenRead()) {
            String str = this.deviceInfo.packageName;
            if (str == null || str.isEmpty()) {
                this.logger.debug("Can't read preinstall payload, invalid package name", new Object[0]);
                return;
            }
            SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
            long preinstallPayloadReadStatus = defaultInstance.getPreinstallPayloadReadStatus();
            if (PreinstallUtil.hasAllLocationsBeenRead(preinstallPayloadReadStatus)) {
                this.internalState.preinstallHasBeenRead = true;
                return;
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.SYSTEM_PROPERTIES, preinstallPayloadReadStatus)) {
                String payloadFromSystemProperty = PreinstallUtil.getPayloadFromSystemProperty(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemProperty == null || payloadFromSystemProperty.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.SYSTEM_PROPERTIES, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemProperty, Constants.SYSTEM_PROPERTIES);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.SYSTEM_PROPERTIES_REFLECTION, preinstallPayloadReadStatus)) {
                String payloadFromSystemPropertyReflection = PreinstallUtil.getPayloadFromSystemPropertyReflection(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemPropertyReflection == null || payloadFromSystemPropertyReflection.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.SYSTEM_PROPERTIES_REFLECTION, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyReflection, Constants.SYSTEM_PROPERTIES_REFLECTION);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.SYSTEM_PROPERTIES_PATH, preinstallPayloadReadStatus)) {
                String payloadFromSystemPropertyFilePath = PreinstallUtil.getPayloadFromSystemPropertyFilePath(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemPropertyFilePath == null || payloadFromSystemPropertyFilePath.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.SYSTEM_PROPERTIES_PATH, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyFilePath, Constants.SYSTEM_PROPERTIES_PATH);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.SYSTEM_PROPERTIES_PATH_REFLECTION, preinstallPayloadReadStatus)) {
                String payloadFromSystemPropertyFilePathReflection = PreinstallUtil.getPayloadFromSystemPropertyFilePathReflection(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemPropertyFilePathReflection == null || payloadFromSystemPropertyFilePathReflection.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.SYSTEM_PROPERTIES_PATH_REFLECTION, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyFilePathReflection, Constants.SYSTEM_PROPERTIES_PATH_REFLECTION);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.CONTENT_PROVIDER, preinstallPayloadReadStatus)) {
                String payloadFromContentProviderDefault = PreinstallUtil.getPayloadFromContentProviderDefault(this.adjustConfig.context, this.deviceInfo.packageName, this.logger);
                if (payloadFromContentProviderDefault == null || payloadFromContentProviderDefault.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.CONTENT_PROVIDER, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromContentProviderDefault, Constants.CONTENT_PROVIDER);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.CONTENT_PROVIDER_INTENT_ACTION, preinstallPayloadReadStatus)) {
                List<String> payloadsFromContentProviderIntentAction = PreinstallUtil.getPayloadsFromContentProviderIntentAction(this.adjustConfig.context, this.deviceInfo.packageName, this.logger);
                if (payloadsFromContentProviderIntentAction == null || payloadsFromContentProviderIntentAction.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.CONTENT_PROVIDER_INTENT_ACTION, preinstallPayloadReadStatus);
                } else {
                    Iterator<String> it = payloadsFromContentProviderIntentAction.iterator();
                    while (it.hasNext()) {
                        this.sdkClickHandler.sendPreinstallPayload(it.next(), Constants.CONTENT_PROVIDER_INTENT_ACTION);
                    }
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.CONTENT_PROVIDER_NO_PERMISSION, preinstallPayloadReadStatus)) {
                List<String> payloadsFromContentProviderNoPermission = PreinstallUtil.getPayloadsFromContentProviderNoPermission(this.adjustConfig.context, this.deviceInfo.packageName, this.logger);
                if (payloadsFromContentProviderNoPermission == null || payloadsFromContentProviderNoPermission.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.CONTENT_PROVIDER_NO_PERMISSION, preinstallPayloadReadStatus);
                } else {
                    Iterator<String> it2 = payloadsFromContentProviderNoPermission.iterator();
                    while (it2.hasNext()) {
                        this.sdkClickHandler.sendPreinstallPayload(it2.next(), Constants.CONTENT_PROVIDER_NO_PERMISSION);
                    }
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.FILE_SYSTEM, preinstallPayloadReadStatus)) {
                String payloadFromFileSystem = PreinstallUtil.getPayloadFromFileSystem(this.deviceInfo.packageName, this.adjustConfig.preinstallFilePath, this.logger);
                if (payloadFromFileSystem == null || payloadFromFileSystem.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.FILE_SYSTEM, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromFileSystem, Constants.FILE_SYSTEM);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.CONTENT_PROVIDER_SAMSUNG_MAPS, preinstallPayloadReadStatus)) {
                String payloadFromContentProviderSamsungMaps = PreinstallUtil.getPayloadFromContentProviderSamsungMaps(this.adjustConfig.context, this.deviceInfo.packageName, this.logger);
                if (payloadFromContentProviderSamsungMaps == null || payloadFromContentProviderSamsungMaps.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.CONTENT_PROVIDER_SAMSUNG_MAPS, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromContentProviderSamsungMaps, Constants.CONTENT_PROVIDER_SAMSUNG_MAPS);
                }
            }
            defaultInstance.setPreinstallPayloadReadStatus(preinstallPayloadReadStatus);
            this.internalState.preinstallHasBeenRead = true;
        }
    }

    private Intent createDeeplinkIntentI(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        intent.setPackage(this.adjustConfig.context.getPackageName());
        return intent;
    }

    public static boolean deleteActivityState(Context context) {
        return context.deleteFile(Constants.ACTIVITY_STATE_FILENAME);
    }

    public static boolean deleteAttribution(Context context) {
        return context.deleteFile(Constants.ATTRIBUTION_FILENAME);
    }

    public static boolean deleteEventMetadata(Context context) {
        return context.deleteFile(Constants.EVENT_METADATA_FILENAME);
    }

    public static boolean deleteGlobalCallbackParameters(Context context) {
        return context.deleteFile(Constants.GLOBAL_CALLBACK_PARAMETERS_FILENAME);
    }

    public static boolean deleteGlobalPartnerParameters(Context context) {
        return context.deleteFile(Constants.GLOBAL_PARTNER_PARAMETERS_FILENAME);
    }

    public static void deleteState(Context context) {
        deleteActivityState(context);
        deleteAttribution(context);
        deleteGlobalCallbackParameters(context);
        deleteGlobalPartnerParameters(context);
        deleteEventMetadata(context);
        SharedPreferencesManager.getDefaultInstance(context).clear();
    }

    private void disableThirdPartySharingForCoppaEnabledI() {
        if (shouldDisableThirdPartySharingWhenCoppaEnabled()) {
            this.activityState.isThirdPartySharingDisabledForCoppa = true;
            writeActivityStateI();
            this.packageHandler.addPackage(new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis()).buildThirdPartySharingPackage(new AdjustThirdPartySharing(Boolean.FALSE)));
            this.packageHandler.sendFirstPackage();
        }
    }

    private void endI() {
        if (!toSendI()) {
            pauseSendingI();
        }
        if (updateActivityStateI(System.currentTimeMillis())) {
            writeActivityStateI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void foregroundTimerFiredI() {
        if (!isEnabledI()) {
            stopForegroundTimerI();
            return;
        }
        if (toSendI()) {
            this.packageHandler.sendFirstPackage();
        }
        if (updateActivityStateI(System.currentTimeMillis())) {
            writeActivityStateI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: gdprForgetMeI, reason: merged with bridge method [inline-methods] */
    public void lambda$gdprForgetMe$34() {
        if (checkActivityStateI(this.activityState) && isEnabledI()) {
            ActivityState activityState = this.activityState;
            if (activityState.isGdprForgotten) {
                return;
            }
            activityState.isGdprForgotten = true;
            writeActivityStateI();
            PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildGdprPackage());
            SharedPreferencesManager.getDefaultInstance(getContext()).removeGdprForgetMe();
            this.packageHandler.sendFirstPackage();
        }
    }

    public static ActivityHandler getInstance(AdjustConfig adjustConfig) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (adjustConfig == null) {
            AdjustFactory.getLogger().error("AdjustConfig missing", new Object[0]);
            return null;
        }
        if (!adjustConfig.isValid()) {
            AdjustFactory.getLogger().error("AdjustConfig not initialized correctly", new Object[0]);
            return null;
        }
        if (adjustConfig.processName != null) {
            int iMyPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) adjustConfig.context.getSystemService("activity");
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return null;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    if (runningAppProcessInfo.processName.equalsIgnoreCase(adjustConfig.processName)) {
                        break;
                    }
                    AdjustFactory.getLogger().info("Skipping initialization in background process (%s)", runningAppProcessInfo.processName);
                    return null;
                }
            }
        }
        return new ActivityHandler(adjustConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gotOptOutResponseI() {
        this.activityState.isGdprForgotten = true;
        writeActivityStateI();
        this.packageHandler.flush();
        lambda$setEnabled$5(false);
    }

    private void handleAdidCallbackI() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.cachedAdidReadCallbacks) {
            this.cachedAdidReadCallbacks.addAll(this.adjustConfig.cachedAdidReadCallbacks);
            this.adjustConfig.cachedAdidReadCallbacks.clear();
        }
        synchronized (this.cachedAdidReadTimeoutCallbacks) {
            this.cachedAdidReadTimeoutCallbacks.addAll(this.adjustConfig.cachedAdidReadTimeoutCallbacks);
            this.adjustConfig.cachedAdidReadTimeoutCallbacks.clear();
        }
        ActivityState activityState = this.activityState;
        if (activityState == null || activityState.adid == null) {
            return;
        }
        synchronized (this.cachedAdidReadCallbacks) {
            try {
                arrayList = null;
                if (this.cachedAdidReadCallbacks.isEmpty()) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList(this.cachedAdidReadCallbacks);
                    this.cachedAdidReadCallbacks.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList2 != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new t(2, this.activityState.adid, arrayList2));
        }
        synchronized (this.cachedAdidReadTimeoutCallbacks) {
            try {
                if (!this.cachedAdidReadTimeoutCallbacks.isEmpty()) {
                    arrayList = new ArrayList(this.cachedAdidReadTimeoutCallbacks);
                    this.cachedAdidReadTimeoutCallbacks.clear();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (arrayList != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new t(3, this.activityState.adid, arrayList));
        }
    }

    private void handleAttributionCallbackI() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.cachedAttributionReadCallbacks) {
            this.cachedAttributionReadCallbacks.addAll(this.adjustConfig.cachedAttributionReadCallbacks);
            this.adjustConfig.cachedAttributionReadCallbacks.clear();
        }
        synchronized (this.cachedAttributionReadTimeoutCallbacks) {
            this.cachedAttributionReadTimeoutCallbacks.addAll(this.adjustConfig.cachedAttributionReadTimeoutCallbacks);
            this.adjustConfig.cachedAttributionReadTimeoutCallbacks.clear();
        }
        if (this.attribution == null) {
            return;
        }
        synchronized (this.cachedAttributionReadCallbacks) {
            try {
                arrayList = null;
                if (this.cachedAttributionReadCallbacks.isEmpty()) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList(this.cachedAttributionReadCallbacks);
                    this.cachedAttributionReadCallbacks.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList2 != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new y(arrayList2, this.attribution, 0));
        }
        synchronized (this.cachedAttributionReadTimeoutCallbacks) {
            try {
                if (!this.cachedAttributionReadTimeoutCallbacks.isEmpty()) {
                    arrayList = new ArrayList(this.cachedAttributionReadTimeoutCallbacks);
                    this.cachedAttributionReadTimeoutCallbacks.clear();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (arrayList != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new y(arrayList, this.attribution, 1));
        }
    }

    private void handleThirdPartySharingCallbackI() {
        ArrayList arrayList;
        synchronized (this.cachedThirdPartySharingTimeoutCallbacks) {
            this.cachedThirdPartySharingTimeoutCallbacks.addAll(this.adjustConfig.cachedThirdPartySharingTimeoutCallbacks);
            this.adjustConfig.cachedThirdPartySharingTimeoutCallbacks.clear();
        }
        if (this.thirdPartySharingResult == null) {
            return;
        }
        synchronized (this.cachedThirdPartySharingTimeoutCallbacks) {
            try {
                if (this.cachedThirdPartySharingTimeoutCallbacks.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.cachedThirdPartySharingTimeoutCallbacks);
                    this.cachedThirdPartySharingTimeoutCallbacks.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new z(arrayList, this.thirdPartySharingResult, 0));
        }
    }

    private boolean hasChangedStateI(boolean z10, boolean z11, String str, String str2) {
        if (z10 != z11) {
            return true;
        }
        ILogger iLogger = this.logger;
        if (z10) {
            iLogger.debug(str, new Object[0]);
        } else {
            iLogger.debug(str2, new Object[0]);
        }
        return false;
    }

    private boolean isEnabledI() {
        ActivityState activityState = this.activityState;
        return activityState != null ? activityState.enabled : this.internalState.isEnabled();
    }

    private boolean isValidReferrerDetails(ReferrerDetails referrerDetails) {
        String str;
        return (referrerDetails == null || (str = referrerDetails.installReferrer) == null || str.length() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addGlobalCallbackParameter$21(String str, String str2) {
        this.firstSessionDelayManager.b("add global callback parameter", new k(str, str2, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addGlobalPartnerParameter$23(String str, String str2) {
        this.firstSessionDelayManager.b("add global partner parameter", new k(str, str2, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$endFirstSessionDelay$48() {
        q0 q0Var = this.firstSessionDelayManager;
        if (q0Var.f6909c != 3) {
            return;
        }
        q0Var.f6909c = 4;
        q0Var.f6907a.initI();
        ArrayList arrayList = q0Var.f6908b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$gdprForgetMe$35() {
        this.firstSessionDelayManager.a(new a(this, 6), "GDPR forget device");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isEnabled$10(OnIsEnabledListener onIsEnabledListener) {
        new Handler(this.adjustConfig.context.getMainLooper()).post(new i(this, onIsEnabledListener, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isEnabled$11(OnIsEnabledListener onIsEnabledListener) {
        this.firstSessionDelayManager.a(new i(this, onIsEnabledListener, 2), "is SDK enabled");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isEnabled$9(OnIsEnabledListener onIsEnabledListener) {
        onIsEnabledListener.onIsEnabledRead(isEnabledI());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$2(AdjustConfig adjustConfig) {
        readAttributionI(adjustConfig.context);
        readThirdPartySharingResultI(adjustConfig.context);
        readActivityStateI(adjustConfig.context);
        readEventMetadataI(adjustConfig.context);
        q0 q0Var = this.firstSessionDelayManager;
        ActivityHandler activityHandler = q0Var.f6907a;
        ActivityHandler activityHandler2 = q0Var.f6907a;
        if (activityHandler.getActivityState() == null && activityHandler2.getAdjustConfig().isFirstSessionDelayEnabled) {
            q0Var.f6909c = 3;
            return;
        }
        q0Var.f6909c = 2;
        activityHandler2.initI();
        ArrayList arrayList = q0Var.f6908b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityLifecycle$0(boolean z10) {
        Boolean bool = this.internalState.foregroundOrElseBackground;
        if (bool == null || bool.booleanValue() != z10) {
            this.internalState.foregroundOrElseBackground = Boolean.valueOf(z10);
            if (z10) {
                onResumeI();
            } else {
                onPauseI();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityLifecycle$1(boolean z10) {
        this.firstSessionDelayManager.a(new b(this, z10, 0), "activity state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processAndResolveDeeplink$15(AdjustDeeplink adjustDeeplink, long j10) {
        this.firstSessionDelayManager.a(new m(this, adjustDeeplink, j10, 2), "process and resolve deep link");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processDeeplink$13(AdjustDeeplink adjustDeeplink, long j10) {
        this.firstSessionDelayManager.a(new m(this, adjustDeeplink, j10, 1), "process deep link");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeGlobalCallbackParameter$25(String str) {
        this.firstSessionDelayManager.b("remove global callback parameter", new f(str, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeGlobalCallbackParameters$29() {
        this.firstSessionDelayManager.b("remove global callback parameters", new c(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeGlobalPartnerParameter$27(String str) {
        this.firstSessionDelayManager.b("remove global partner parameter", new f(str, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeGlobalPartnerParameters$31() {
        this.firstSessionDelayManager.b("remove global partner parameters", new c(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendPreinstallReferrer$19() {
        this.firstSessionDelayManager.a(new a(this, 3), "send preinstall referrer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendReftagReferrer$17() {
        this.firstSessionDelayManager.a(new a(this, 8), "send referrer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setCoppaComplianceInDelay$49(boolean z10) {
        q0 q0Var = this.firstSessionDelayManager;
        if (q0Var.f6909c != 3) {
            return;
        }
        q0Var.f6907a.getAdjustConfig().coppaComplianceEnabled = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setEnabled$6(boolean z10) {
        this.firstSessionDelayManager.a(new b(this, z10, 7), z10 ? com.ironsource.mediationsdk.metadata.a.f29613j : "disable");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setExternalDeviceIdInDelay$51(String str) {
        q0 q0Var = this.firstSessionDelayManager;
        if (q0Var.f6909c != 3) {
            return;
        }
        q0Var.f6907a.getAdjustConfig().externalDeviceId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOfflineMode$8(boolean z10) {
        this.firstSessionDelayManager.a(new b(this, z10, 3), z10 ? "put SDK in offline mode" : "put SDK back to online mode");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setPlayStoreKidsComplianceInDelay$50(boolean z10) {
        q0 q0Var = this.firstSessionDelayManager;
        if (q0Var.f6909c != 3) {
            return;
        }
        q0Var.f6907a.getAdjustConfig().playStoreKidsComplianceEnabled = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPushToken$32(boolean z10, String str) {
        if (!z10) {
            SharedPreferencesManager.getDefaultInstance(getContext()).savePushToken(str);
        }
        if (this.activityState == null) {
            return;
        }
        setPushTokenI(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPushToken$33(boolean z10, String str) {
        this.firstSessionDelayManager.a(new p(this, z10, str, 1), "set push token");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$trackAdRevenue$41(AdjustAdRevenue adjustAdRevenue) {
        this.firstSessionDelayManager.a(new d(this, adjustAdRevenue, 1), "track ad revenue");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$trackEvent$3(AdjustEvent adjustEvent) {
        if (this.activityState == null) {
            this.logger.warn("Event tracked before first activity resumed.\nIf it was triggered in the Application class, it might timestamp or even send an install long before the user opens the app.\nPlease check https://github.com/adjust/android_sdk#can-i-trigger-an-event-at-application-launch for more information.", new Object[0]);
            startI();
        }
        trackEventI(adjustEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$trackEvent$4(AdjustEvent adjustEvent) {
        this.firstSessionDelayManager.a(new e(this, adjustEvent, 0), "track event");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$trackMeasurementConsent$39(boolean z10) {
        this.firstSessionDelayManager.b("track measurement consent", new n(z10, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$trackPlayStoreSubscription$43(AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        this.firstSessionDelayManager.a(new h(this, adjustPlayStoreSubscription, 0), "track play store subscription");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$trackThirdPartySharing$37(AdjustThirdPartySharing adjustThirdPartySharing) {
        this.firstSessionDelayManager.b("track third party sharing", new l(adjustThirdPartySharing, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$verifyAndTrackPlayStorePurchase$47(AdjustEvent adjustEvent, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        this.firstSessionDelayManager.a(new q(this, adjustEvent, onPurchaseVerificationFinishedListener, 0), "verify and track play store purchase");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$verifyPlayStorePurchase$45(AdjustPlayStorePurchase adjustPlayStorePurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        this.firstSessionDelayManager.a(new j(this, adjustPlayStorePurchase, onPurchaseVerificationFinishedListener, 0), "verify play store purchase");
    }

    private void launchAttributionListenerI(Handler handler) {
        if (this.adjustConfig.onAttributionChangedListener == null) {
            return;
        }
        handler.post(new a0(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchAttributionResponseTasksI(AttributionResponseData attributionResponseData) {
        processRemoteTriggersI(attributionResponseData);
        updateAdidI(attributionResponseData.adid);
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(attributionResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
        prepareDeeplinkI(attributionResponseData.deeplink, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchDeeplinkMain(Intent intent, Uri uri) {
        int size = this.adjustConfig.context.getPackageManager().queryIntentActivities(intent, 0).size();
        ILogger iLogger = this.logger;
        if (size <= 0) {
            iLogger.error("Unable to open deferred deeplink (%s)", uri);
        } else {
            iLogger.info("Open deferred deeplink (%s)", uri);
            this.adjustConfig.context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchEventResponseTasksI(EventResponseData eventResponseData) {
        updateAdidI(eventResponseData.adid);
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        boolean z10 = eventResponseData.success;
        if (z10 && this.adjustConfig.onEventTrackingSucceededListener != null) {
            this.logger.debug("Launching success event tracking listener", new Object[0]);
            handler.post(new b0(this, eventResponseData, 0));
        } else {
            if (z10 || this.adjustConfig.onEventTrackingFailedListener == null) {
                return;
            }
            this.logger.debug("Launching failed event tracking listener", new Object[0]);
            handler.post(new b0(this, eventResponseData, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchPurchaseVerificationResponseTasksI(PurchaseVerificationResponseData purchaseVerificationResponseData) {
        AdjustEvent adjustEvent;
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        JSONObject jSONObject = purchaseVerificationResponseData.jsonResponse;
        handler.post(new d0(purchaseVerificationResponseData, false, jSONObject == null ? new AdjustPurchaseVerificationResult("not_verified", InterfaceC0435l1.d.b.f29105b, purchaseVerificationResponseData.message) : new AdjustPurchaseVerificationResult(UtilNetworking.extractJsonString(jSONObject, "verification_status"), UtilNetworking.extractJsonInt(jSONObject, "code"), UtilNetworking.extractJsonString(jSONObject, "message")), 8));
        ActivityPackage activityPackage = purchaseVerificationResponseData.activityPackage;
        if (activityPackage == null || (adjustEvent = activityPackage.event) == null) {
            return;
        }
        trackEventI(adjustEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchSdkClickResponseTasksI(SdkClickResponseData sdkClickResponseData) {
        updateAdidI(sdkClickResponseData.adid);
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(sdkClickResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
        if (TextUtils.isEmpty(sdkClickResponseData.resolvedDeeplink)) {
            return;
        }
        OnDeeplinkResolvedListener onDeeplinkResolvedListener = this.cachedDeeplinkResolutionCallback;
        this.cachedDeeplinkResolutionCallback = null;
        if (onDeeplinkResolvedListener != null) {
            handler.post(new d0(onDeeplinkResolvedListener, false, sdkClickResponseData, 7));
        }
    }

    private void launchSessionResponseListenerI(SessionResponseData sessionResponseData, Handler handler) {
        boolean z10 = sessionResponseData.success;
        if (z10 && this.adjustConfig.onSessionTrackingSucceededListener != null) {
            this.logger.debug("Launching success session tracking listener", new Object[0]);
            handler.post(new c0(this, sessionResponseData, 0));
        } else {
            if (z10 || this.adjustConfig.onSessionTrackingFailedListener == null) {
                return;
            }
            this.logger.debug("Launching failed session tracking listener", new Object[0]);
            handler.post(new c0(this, sessionResponseData, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchSessionResponseTasksI(SessionResponseData sessionResponseData) {
        this.logger.debug("Launching SessionResponse tasks", new Object[0]);
        updateAdidI(sessionResponseData.adid);
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(sessionResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
        if (this.attribution == null && !this.activityState.askingAttribution) {
            this.attributionHandler.getAttribution();
        }
        if (sessionResponseData.success) {
            SharedPreferencesManager.getDefaultInstance(getContext()).setInstallTracked();
        }
        launchSessionResponseListenerI(sessionResponseData, handler);
        prepareDeeplinkI(sessionResponseData.deeplink, handler);
        this.internalState.sessionResponseProcessed = true;
    }

    private void launchThirdPartySharingResponseTasks(ThirdPartySharingResponseData thirdPartySharingResponseData) {
        this.executor.submit(new d0(4, this, thirdPartySharingResponseData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchThirdPartySharingResponseTasksI(ThirdPartySharingResponseData thirdPartySharingResponseData) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = thirdPartySharingResponseData.jsonResponse;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("third_party_sharing")) == null || !updateThirdPartySharingSettingsI(new AdjustThirdPartySharingResult(jSONObjectOptJSONObject.toString()))) {
            return;
        }
        launchThirdPartySharingSettingsChangedListenerI(new Handler(this.adjustConfig.context.getMainLooper()));
    }

    private void launchThirdPartySharingSettingsChangedListenerI(Handler handler) {
        if (this.adjustConfig.onThirdPartySharingSettingsChangedListener == null) {
            return;
        }
        handler.post(new a0(this, 3));
    }

    private void pauseSendingI() {
        this.attributionHandler.pauseSending();
        this.packageHandler.pauseSending();
        boolean sendI = toSendI(true);
        ISdkClickHandler iSdkClickHandler = this.sdkClickHandler;
        if (sendI) {
            iSdkClickHandler.resumeSending();
            this.purchaseVerificationHandler.resumeSending();
        } else {
            iSdkClickHandler.pauseSending();
            this.purchaseVerificationHandler.pauseSending();
        }
    }

    private boolean pausedI() {
        return pausedI(false);
    }

    private void preLaunchActionsI(List<IRunActivityHandler> list) {
        if (list == null) {
            return;
        }
        Iterator<IRunActivityHandler> it = list.iterator();
        while (it.hasNext()) {
            it.next().run(this);
        }
    }

    private void prepareDeeplinkI(Uri uri, Handler handler) {
        if (uri == null) {
            return;
        }
        this.logger.info("Deferred deeplink received (%s)", uri);
        handler.post(new e0(this, uri, createDeeplinkIntentI(uri), 0));
    }

    private void processCachedDeeplinkI() {
        if (checkActivityStateI(this.activityState)) {
            SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
            String deeplinkUrl = defaultInstance.getDeeplinkUrl();
            String deeplinkReferrer = defaultInstance.getDeeplinkReferrer();
            long deeplinkClickTime = defaultInstance.getDeeplinkClickTime();
            if (deeplinkUrl == null || deeplinkClickTime == -1) {
                return;
            }
            AdjustDeeplink adjustDeeplink = new AdjustDeeplink(Uri.parse(deeplinkUrl));
            if (deeplinkReferrer != null) {
                adjustDeeplink.setReferrer(Uri.parse(deeplinkReferrer));
            }
            processDeeplink(adjustDeeplink, deeplinkClickTime);
            defaultInstance.removeDeeplink();
        }
    }

    private void processCoppaComplianceI() {
        if (this.adjustConfig.coppaComplianceEnabled) {
            disableThirdPartySharingForCoppaEnabledI();
        } else {
            resetThirdPartySharingCoppaActivityStateI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processDeeplinkI, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$processDeeplink$12(AdjustDeeplink adjustDeeplink, long j10) {
        if (isEnabledI() && adjustDeeplink != null) {
            if (Util.isUrlFilteredOut(adjustDeeplink.getUrl())) {
                if (adjustDeeplink.getUrl() != null) {
                    this.logger.debug("Deeplink (" + adjustDeeplink.getUrl().toString() + ") processing skipped", new Object[0]);
                    return;
                }
                return;
            }
            if (Util.isUrlWithTrackerQueryParam(adjustDeeplink.getUrl())) {
                String string = adjustDeeplink.getUrl().toString();
                Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
                OnDeeplinkResolvedListener onDeeplinkResolvedListener = this.cachedDeeplinkResolutionCallback;
                this.cachedDeeplinkResolutionCallback = null;
                if (onDeeplinkResolvedListener != null) {
                    handler.post(new d0(onDeeplinkResolvedListener, false, string, 9));
                }
            }
            ActivityPackage activityPackageBuildDeeplinkSdkClickPackage = PackageFactory.buildDeeplinkSdkClickPackage(adjustDeeplink.getUrl(), adjustDeeplink.getReferrer(), j10, this.activityState, this.adjustConfig, this.deviceInfo, this.globalParameters, this.firstSessionDelayManager, this.internalState);
            if (activityPackageBuildDeeplinkSdkClickPackage == null) {
                return;
            }
            this.sdkClickHandler.sendSdkClick(activityPackageBuildDeeplinkSdkClickPackage);
        }
    }

    private void processPreLaunchArraysI() {
        if (this.cachedAdjustThirdPartySharingArray != null && canTrackThirdPartySharingI()) {
            Iterator<AdjustThirdPartySharing> it = this.cachedAdjustThirdPartySharingArray.iterator();
            while (it.hasNext()) {
                trackThirdPartySharingI(it.next());
            }
        }
        this.cachedAdjustThirdPartySharingArray = null;
        if (this.cachedLastMeasurementConsentTrack != null && canTrackMeasurementConsentI()) {
            trackMeasurementConsentI(this.cachedLastMeasurementConsentTrack.booleanValue());
        }
        this.cachedLastMeasurementConsentTrack = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processRemoteTriggersI(ResponseData responseData) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObject = responseData.jsonResponse;
        if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("remote_triggers")) == null || jSONArrayOptJSONArray.length() == 0 || this.adjustConfig.onRemoteTriggerListener == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject == null) {
                this.logger.warn("Invalid remote trigger item, skipping", new Object[0]);
            } else {
                String strOptString = jSONObjectOptJSONObject.optString("label");
                if (strOptString.isEmpty()) {
                    this.logger.warn("Remote trigger missing or invalid label, skipping", new Object[0]);
                } else {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("payload");
                    if (jSONObjectOptJSONObject2 == null) {
                        this.logger.warn("Remote trigger missing or invalid payload, skipping", new Object[0]);
                    } else {
                        new Handler(this.adjustConfig.context.getMainLooper()).post(new d0(0, this, new AdjustRemoteTrigger(strOptString, jSONObjectOptJSONObject2)));
                    }
                }
            }
        }
    }

    private void processSessionI() {
        if (this.activityState.isGdprForgotten) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ActivityState activityState = this.activityState;
        long j10 = jCurrentTimeMillis - activityState.lastActivity;
        if (j10 < 0) {
            this.logger.error(TIME_TRAVEL, new Object[0]);
            this.activityState.lastActivity = jCurrentTimeMillis;
            writeActivityStateI();
            return;
        }
        if (j10 > SESSION_INTERVAL) {
            trackNewSessionI(jCurrentTimeMillis);
            checkAfterNewStartI();
            return;
        }
        if (j10 <= SUBSESSION_INTERVAL) {
            this.logger.verbose("Time span since last activity too short for a new subsession", new Object[0]);
            return;
        }
        int i10 = activityState.subsessionCount + 1;
        activityState.subsessionCount = i10;
        activityState.sessionLength += j10;
        activityState.lastActivity = jCurrentTimeMillis;
        this.logger.verbose("Started subsession %d of session %d", Integer.valueOf(i10), Integer.valueOf(this.activityState.sessionCount));
        writeActivityStateI();
        checkForPreinstallI();
        this.installReferrer.startConnection();
        readInstallReferrerMeta();
        readInstallReferrerHuaweiAds();
        readInstallReferrerHuaweiAppGallery();
        readInstallReferrerSamsung();
        readInstallReferrerXiaomi();
        readInstallReferrerVivo();
        readLicenseVerificationData();
    }

    public static void queueGetAdidWithTimeout(long j10, OnAdidReadListener onAdidReadListener, ArrayList<AdjustTimeoutCallback> arrayList, Context context) {
        AdjustTimeoutCallback adjustTimeoutCallback = new AdjustTimeoutCallback(onAdidReadListener);
        synchronized (arrayList) {
            arrayList.add(adjustTimeoutCallback);
        }
        TimerOnce timerOnce = new TimerOnce(new w(adjustTimeoutCallback, arrayList, context, 0), Constants.ADID_TIMEOUT_TIMER_NAME);
        adjustTimeoutCallback.setTimer(timerOnce);
        timerOnce.startIn(j10);
    }

    public static void queueGetAttributionWithTimeout(long j10, OnAttributionReadListener onAttributionReadListener, ArrayList<AdjustTimeoutCallback> arrayList, Context context) {
        AdjustTimeoutCallback adjustTimeoutCallback = new AdjustTimeoutCallback(onAttributionReadListener);
        synchronized (arrayList) {
            arrayList.add(adjustTimeoutCallback);
        }
        TimerOnce timerOnce = new TimerOnce(new w(adjustTimeoutCallback, arrayList, context, 1), Constants.ATTRIBUTION_TIMEOUT_TIMER_NAME);
        adjustTimeoutCallback.setTimer(timerOnce);
        timerOnce.startIn(j10);
    }

    public static void queueGetThirdPartySharingSettingsWithTimeout(long j10, OnThirdPartySharingSettingsReadListener onThirdPartySharingSettingsReadListener, ArrayList<AdjustTimeoutCallback> arrayList, Context context) {
        AdjustTimeoutCallback adjustTimeoutCallback = new AdjustTimeoutCallback(onThirdPartySharingSettingsReadListener);
        synchronized (arrayList) {
            arrayList.add(adjustTimeoutCallback);
        }
        TimerOnce timerOnce = new TimerOnce(new w(adjustTimeoutCallback, arrayList, context, 2), Constants.TPS_SETTINGS_TIMEOUT_TIMER_NAME);
        adjustTimeoutCallback.setTimer(timerOnce);
        timerOnce.startIn(j10);
    }

    private void readActivityStateI(Context context) {
        try {
            this.activityState = (ActivityState) Util.readObject(context, Constants.ACTIVITY_STATE_FILENAME, ACTIVITY_STATE_NAME, ActivityState.class);
        } catch (Exception e10) {
            this.logger.error("Failed to read %s file (%s)", ACTIVITY_STATE_NAME, e10.getMessage());
            this.activityState = null;
        }
    }

    private void readAttributionI(Context context) {
        try {
            this.attribution = (AdjustAttribution) Util.readObject(context, Constants.ATTRIBUTION_FILENAME, ATTRIBUTION_NAME, AdjustAttribution.class);
        } catch (Exception e10) {
            this.logger.error("Failed to read %s file (%s)", ATTRIBUTION_NAME, e10.getMessage());
            this.attribution = null;
        }
    }

    private void readConfigFile(Context context) {
        try {
            InputStream inputStreamOpen = context.getAssets().open("adjust_config.properties");
            Properties properties = new Properties();
            properties.load(inputStreamOpen);
            this.logger.verbose("adjust_config.properties file read and loaded", new Object[0]);
            String property = properties.getProperty("defaultTracker");
            if (property != null) {
                this.adjustConfig.defaultTracker = property;
            }
        } catch (Exception e10) {
            this.logger.debug("%s file not found in this app", e10.getMessage());
        }
    }

    private void readEventMetadataI(Context context) {
        try {
            this.eventMetadata = (EventMetadata) Util.readObject(context, Constants.EVENT_METADATA_FILENAME, EVENT_METADATA_NAME, EventMetadata.class);
        } catch (Exception e10) {
            this.logger.error("Failed to read %s file (%s)", EVENT_METADATA_NAME, e10.getMessage());
        }
        if (this.eventMetadata == null) {
            this.eventMetadata = new EventMetadata();
        }
    }

    private void readGlobalCallbackParametersI(Context context) {
        try {
            this.globalParameters.callbackParameters = (Map) Util.readObject(context, Constants.GLOBAL_CALLBACK_PARAMETERS_FILENAME, GLOBAL_CALLBACK_PARAMETERS_NAME, Map.class);
        } catch (Exception e10) {
            this.logger.error("Failed to read %s file (%s)", GLOBAL_CALLBACK_PARAMETERS_NAME, e10.getMessage());
            this.globalParameters.callbackParameters = null;
        }
    }

    private void readGlobalPartnerParametersI(Context context) {
        try {
            this.globalParameters.partnerParameters = (Map) Util.readObject(context, Constants.GLOBAL_PARTNER_PARAMETERS_FILENAME, GLOBAL_PARTNER_PARAMETERS_NAME, Map.class);
        } catch (Exception e10) {
            this.logger.error("Failed to read %s file (%s)", GLOBAL_PARTNER_PARAMETERS_NAME, e10.getMessage());
            this.globalParameters.partnerParameters = null;
        }
    }

    private void readInstallReferrerHuaweiAds() {
        this.executor.submit(new a0(this, 9));
    }

    private void readInstallReferrerHuaweiAppGallery() {
        this.executor.submit(new a0(this, 10));
    }

    private void readInstallReferrerMeta() {
        this.executor.submit(new a0(this, 0));
    }

    private void readInstallReferrerSamsung() {
        this.executor.submit(new a0(this, 11));
    }

    private void readInstallReferrerVivo() {
        this.executor.submit(new a0(this, 13));
    }

    private void readInstallReferrerXiaomi() {
        this.executor.submit(new a0(this, 12));
    }

    private void readLicenseVerificationData() {
        this.executor.submit(new a0(this, 1));
    }

    private void readThirdPartySharingResultI(Context context) {
        this.thirdPartySharingResult = SharedPreferencesManager.getDefaultInstance(context).getThirdPartySharingResult();
    }

    private void resetThirdPartySharingCoppaActivityStateI() {
        ActivityState activityState = this.activityState;
        if (activityState != null && activityState.isThirdPartySharingDisabledForCoppa) {
            activityState.isThirdPartySharingDisabledForCoppa = false;
            writeActivityStateI();
        }
    }

    private void resumeSendingI() {
        this.attributionHandler.resumeSending();
        this.packageHandler.resumeSending();
        this.sdkClickHandler.resumeSending();
        this.purchaseVerificationHandler.resumeSending();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendInstallReferrerI(ReferrerDetails referrerDetails, String str) {
        if (isEnabledI() && isValidReferrerDetails(referrerDetails) && !Util.isEqualReferrerDetails(referrerDetails, str, this.activityState)) {
            this.sdkClickHandler.sendSdkClick(PackageFactory.buildInstallReferrerSdkClickPackage(referrerDetails, str, this.activityState, this.adjustConfig, this.deviceInfo, this.globalParameters, this.firstSessionDelayManager, this.internalState));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendLicenseVerificationDataI(LicenseData licenseData) {
        if (isEnabledI() && licenseData != null && licenseData.isValid()) {
            this.sdkClickHandler.sendSdkClick(PackageFactory.buildLicenseVerificationSdkClickPackage(licenseData, this.activityState, this.adjustConfig, this.deviceInfo, this.globalParameters, this.firstSessionDelayManager, this.internalState));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendPreinstallReferrerI, reason: merged with bridge method [inline-methods] */
    public void lambda$sendPreinstallReferrer$18() {
        String preinstallReferrer;
        if (!isEnabledI() || this.activityState == null || (preinstallReferrer = SharedPreferencesManager.getDefaultInstance(getContext()).getPreinstallReferrer()) == null || preinstallReferrer.isEmpty()) {
            return;
        }
        this.sdkClickHandler.sendPreinstallPayload(preinstallReferrer, Constants.SYSTEM_INSTALLER_REFERRER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendReftagReferrerI, reason: merged with bridge method [inline-methods] */
    public void lambda$sendReftagReferrer$16() {
        if (isEnabledI() && this.activityState != null) {
            this.sdkClickHandler.sendReftagReferrers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAskingAttributionI(boolean z10) {
        this.activityState.askingAttribution = z10;
        writeActivityStateI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setEnabledI, reason: merged with bridge method [inline-methods] */
    public void lambda$setEnabled$5(boolean z10) {
        ActivityState activityState;
        if (hasChangedStateI(isEnabledI(), z10, "Adjust already enabled", "Adjust already disabled")) {
            if (z10 && (activityState = this.activityState) != null && activityState.isGdprForgotten) {
                this.logger.error("Re-enabling SDK not possible for forgotten user", new Object[0]);
                return;
            }
            this.internalState.enabled = z10;
            ActivityState activityState2 = this.activityState;
            if (activityState2 == null) {
                updateStatusI(!z10, "Handlers will start as paused due to the SDK being disabled", "Handlers will still start as paused", "Handlers will start as active due to the SDK being enabled");
                return;
            }
            activityState2.enabled = z10;
            writeActivityStateI();
            if (z10) {
                SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
                if (defaultInstance.getGdprForgetMe()) {
                    lambda$gdprForgetMe$34();
                } else {
                    processCoppaComplianceI();
                    processPreLaunchArraysI();
                }
                if (!defaultInstance.getInstallTracked()) {
                    this.logger.debug("Detected that install was not tracked at enable time", new Object[0]);
                    trackNewSessionI(System.currentTimeMillis());
                }
                checkAfterNewStartI(defaultInstance);
            }
            updateStatusI(!z10, "Pausing handlers due to SDK being disabled", "Handlers remain paused", "Resuming handlers due to SDK being enabled");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setOfflineModeI, reason: merged with bridge method [inline-methods] */
    public void lambda$setOfflineMode$7(boolean z10) {
        if (hasChangedStateI(this.internalState.isOffline(), z10, "Adjust already in offline mode", "Adjust already in online mode")) {
            this.internalState.offline = z10;
            if (this.activityState == null) {
                updateStatusI(z10, "Handlers will start paused due to SDK being offline", "Handlers will still start as paused", "Handlers will start as active due to SDK being online");
            } else {
                updateStatusI(z10, "Pausing handlers to put SDK offline mode", "Handlers remain paused", "Resuming handlers to put SDK in online mode");
            }
        }
    }

    private void setPushTokenI(String str) {
        if (checkActivityStateI(this.activityState) && isEnabledI()) {
            ActivityState activityState = this.activityState;
            if (activityState.isGdprForgotten || str == null || str.equals(activityState.pushToken)) {
                return;
            }
            this.activityState.pushToken = str;
            writeActivityStateI();
            PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildInfoPackage(Constants.PUSH));
            SharedPreferencesManager.getDefaultInstance(getContext()).removePushToken();
            this.packageHandler.sendFirstPackage();
        }
    }

    private boolean shouldDisableThirdPartySharingWhenCoppaEnabled() {
        if (this.activityState == null || !isEnabledI()) {
            return false;
        }
        ActivityState activityState = this.activityState;
        if (activityState.isGdprForgotten) {
            return false;
        }
        return !activityState.isThirdPartySharingDisabledForCoppa;
    }

    private boolean shouldProcessEventI(String str) {
        if (str != null && !str.isEmpty()) {
            if (this.activityState.eventDeduplicationIdExists(str)) {
                this.logger.info("Skipping duplicate event with deduplication ID '%s'", str);
                return false;
            }
            this.activityState.addDeduplicationId(str);
            this.logger.verbose("Added deduplication ID '%s'", str);
        }
        return true;
    }

    private void startBackgroundTimerI() {
        if (this.backgroundTimer != null && toSendI() && this.backgroundTimer.getFireIn() <= 0) {
            this.backgroundTimer.startIn(BACKGROUND_TIMER_INTERVAL);
        }
    }

    private void startFirstSessionI() {
        ActivityState activityState = new ActivityState();
        this.activityState = activityState;
        activityState.setEventDeduplicationIdsMaxSize(this.adjustConfig.getEventDeduplicationIdsMaxSize());
        updateHandlersStatusAndSendI();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
        this.activityState.pushToken = defaultInstance.getPushToken();
        if (this.internalState.isEnabled()) {
            if (defaultInstance.getGdprForgetMe()) {
                lambda$gdprForgetMe$34();
            } else {
                processCoppaComplianceI();
                processPreLaunchArraysI();
                this.activityState.sessionCount = 1;
                transferSessionPackageI(jCurrentTimeMillis);
                checkAfterNewStartI(defaultInstance);
            }
        }
        this.activityState.resetSessionAttributes(jCurrentTimeMillis);
        this.activityState.enabled = this.internalState.isEnabled();
        writeActivityStateI();
        defaultInstance.removePushToken();
        defaultInstance.removeGdprForgetMe();
        processCachedDeeplinkI();
    }

    private void startForegroundTimerI() {
        if (isEnabledI()) {
            this.foregroundTimer.start();
        }
    }

    private void startI() {
        if (this.activityState == null) {
            AdjustSigner.onResume(this.adjustConfig.logger);
            startFirstSessionI();
            return;
        }
        processPreLaunchArraysI();
        if (this.activityState.enabled) {
            AdjustSigner.onResume(this.adjustConfig.logger);
            updateHandlersStatusAndSendI();
            processCoppaComplianceI();
            processSessionI();
            checkAttributionStateI();
            processCachedDeeplinkI();
        }
    }

    private void stopBackgroundTimerI() {
        TimerOnce timerOnce = this.backgroundTimer;
        if (timerOnce == null) {
            return;
        }
        timerOnce.cancel();
    }

    private void stopForegroundTimerI() {
        this.foregroundTimer.suspend();
    }

    private void teardownActivityStateS() {
        synchronized (ActivityState.class) {
            try {
                if (this.activityState == null) {
                    return;
                }
                this.activityState = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void teardownAllGlobalParametersS() {
        synchronized (GlobalParameters.class) {
            try {
                if (this.globalParameters == null) {
                    return;
                }
                this.globalParameters = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void teardownAttributionS() {
        synchronized (AdjustAttribution.class) {
            try {
                if (this.attribution == null) {
                    return;
                }
                this.attribution = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void teardownEventMetadataS() {
        synchronized (EventMetadata.class) {
            try {
                if (this.eventMetadata == null) {
                    return;
                }
                this.eventMetadata = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean toSendI() {
        return toSendI(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: trackAdRevenueI, reason: merged with bridge method [inline-methods] */
    public void lambda$trackAdRevenue$40(AdjustAdRevenue adjustAdRevenue) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && checkAdjustAdRevenue(adjustAdRevenue) && !this.activityState.isGdprForgotten) {
            PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildAdRevenuePackage(adjustAdRevenue));
            this.packageHandler.sendFirstPackage();
        }
    }

    private void trackEventI(AdjustEvent adjustEvent) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && checkEventI(adjustEvent) && !this.activityState.isGdprForgotten && shouldProcessEventI(adjustEvent.deduplicationId)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iIncrementSequenceForEvent = this.eventMetadata.incrementSequenceForEvent(adjustEvent.eventToken);
            this.activityState.eventCount++;
            updateActivityStateI(jCurrentTimeMillis);
            PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, jCurrentTimeMillis);
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildEventPackage(adjustEvent, iIncrementSequenceForEvent));
            this.packageHandler.sendFirstPackage();
            if (this.adjustConfig.isSendingInBackgroundEnabled && this.internalState.isInBackground()) {
                startBackgroundTimerI();
            }
            writeActivityStateI();
            writeEventMetadataI();
        }
    }

    private void trackMeasurementConsentI(boolean z10) {
        PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis());
        packageBuilder.internalState = this.internalState;
        this.packageHandler.addPackage(packageBuilder.buildMeasurementConsentPackage(z10));
        this.packageHandler.sendFirstPackage();
    }

    private void trackNewSessionI(long j10) {
        ActivityState activityState = this.activityState;
        long j11 = j10 - activityState.lastActivity;
        activityState.sessionCount++;
        activityState.lastInterval = j11;
        transferSessionPackageI(j10);
        this.activityState.resetSessionAttributes(j10);
        writeActivityStateI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: trackPlayStoreSubscriptionI, reason: merged with bridge method [inline-methods] */
    public void lambda$trackPlayStoreSubscription$42(AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && !this.activityState.isGdprForgotten) {
            PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildSubscriptionPackage(adjustPlayStoreSubscription));
            this.packageHandler.sendFirstPackage();
        }
    }

    private void trackThirdPartySharingI(AdjustThirdPartySharing adjustThirdPartySharing) {
        PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis());
        packageBuilder.internalState = this.internalState;
        this.packageHandler.addPackage(packageBuilder.buildThirdPartySharingPackage(adjustThirdPartySharing));
        this.packageHandler.sendFirstPackage();
    }

    private void transferSessionPackageI(long j10) {
        PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, j10);
        packageBuilder.internalState = this.internalState;
        this.packageHandler.addPackage(packageBuilder.buildSessionPackage());
        this.packageHandler.sendFirstPackage();
    }

    private boolean updateActivityStateI(long j10) {
        if (!checkActivityStateI(this.activityState)) {
            return false;
        }
        ActivityState activityState = this.activityState;
        long j11 = j10 - activityState.lastActivity;
        if (j11 > SESSION_INTERVAL) {
            return false;
        }
        activityState.lastActivity = j10;
        if (j11 < 0) {
            this.logger.error(TIME_TRAVEL, new Object[0]);
            return true;
        }
        activityState.sessionLength += j11;
        activityState.timeSpent += j11;
        return true;
    }

    private void updateAdidI(String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (str == null) {
            return;
        }
        if (!str.equals(this.activityState.adid)) {
            this.activityState.adid = str;
            writeActivityStateI();
        }
        synchronized (this.cachedAdidReadCallbacks) {
            try {
                arrayList = null;
                if (this.cachedAdidReadCallbacks.isEmpty()) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList(this.cachedAdidReadCallbacks);
                    this.cachedAdidReadCallbacks.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList2 != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new t(0, str, arrayList2));
        }
        synchronized (this.cachedAdidReadTimeoutCallbacks) {
            try {
                if (!this.cachedAdidReadTimeoutCallbacks.isEmpty()) {
                    arrayList = new ArrayList(this.cachedAdidReadTimeoutCallbacks);
                    this.cachedAdidReadTimeoutCallbacks.clear();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (arrayList != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new t(1, str, arrayList));
        }
    }

    private void updateHandlersStatusAndSendI() {
        if (!toSendI()) {
            pauseSendingI();
        } else {
            resumeSendingI();
            this.packageHandler.sendFirstPackage();
        }
    }

    private void updateStatusI(boolean z10, String str, String str2, String str3) {
        if (z10) {
            this.logger.info(str, new Object[0]);
        } else if (pausedI(false)) {
            boolean zPausedI = pausedI(true);
            ILogger iLogger = this.logger;
            if (zPausedI) {
                iLogger.info(str2, new Object[0]);
            } else {
                iLogger.info(wi.d.h(str2, ", except the Sdk Click Handler"), new Object[0]);
            }
        } else {
            this.logger.info(str3, new Object[0]);
        }
        updateHandlersStatusAndSendI();
    }

    private boolean updateThirdPartySharingSettingsI(AdjustThirdPartySharingResult adjustThirdPartySharingResult) {
        ArrayList arrayList;
        if (adjustThirdPartySharingResult == null) {
            return false;
        }
        boolean zEquals = adjustThirdPartySharingResult.equals(this.thirdPartySharingResult);
        boolean z10 = !zEquals;
        this.thirdPartySharingResult = adjustThirdPartySharingResult;
        if (!zEquals) {
            SharedPreferencesManager.getDefaultInstance(getContext()).saveThirdPartySharingResult(this.thirdPartySharingResult);
        }
        synchronized (this.cachedThirdPartySharingTimeoutCallbacks) {
            try {
                if (this.cachedThirdPartySharingTimeoutCallbacks.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.cachedThirdPartySharingTimeoutCallbacks);
                    this.cachedThirdPartySharingTimeoutCallbacks.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new z(arrayList, this.thirdPartySharingResult, 1));
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: verifyAndTrackPlayStorePurchaseI, reason: merged with bridge method [inline-methods] */
    public void lambda$verifyAndTrackPlayStorePurchase$46(AdjustEvent adjustEvent, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        if (onPurchaseVerificationFinishedListener == null) {
            this.logger.warn("Purchase verification aborted because verification callback is null", new Object[0]);
            return;
        }
        if (this.adjustConfig.isDataResidency) {
            this.logger.warn("Purchase verification not available for data residency users right now", new Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", InterfaceC0435l1.d.b.f29110g, "Purchase verification not available for data residency users right now"));
            return;
        }
        if (!checkActivityStateI(this.activityState)) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", InterfaceC0435l1.d.b.f29106c, "Purchase verification aborted because SDK is still not initialized"));
            this.logger.warn("Purchase verification aborted because SDK is still not initialized", new Object[0]);
            return;
        }
        if (!isEnabledI()) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", InterfaceC0435l1.d.b.f29107d, "Purchase verification aborted because SDK is disabled"));
            this.logger.warn("Purchase verification aborted because SDK is disabled", new Object[0]);
            return;
        }
        if (this.activityState.isGdprForgotten) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", InterfaceC0435l1.d.b.f29108e, "Purchase verification aborted because user is GDPR forgotten"));
            this.logger.warn("Purchase verification aborted because user is GDPR forgotten", new Object[0]);
            return;
        }
        if (adjustEvent == null) {
            this.logger.warn("Purchase verification aborted because event instance is null", new Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 106, "Purchase verification aborted because event instance is null"));
            return;
        }
        ActivityPackage activityPackageBuildVerificationPackage = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis()).buildVerificationPackage(adjustEvent, onPurchaseVerificationFinishedListener);
        if (activityPackageBuildVerificationPackage == null) {
            this.logger.warn("Purchase verification aborted because verification package is null", new Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 107, "Purchase verification aborted because verification package is null"));
        } else {
            activityPackageBuildVerificationPackage.event = adjustEvent;
            this.purchaseVerificationHandler.sendPurchaseVerificationPackage(activityPackageBuildVerificationPackage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: verifyPlayStorePurchaseI, reason: merged with bridge method [inline-methods] */
    public void lambda$verifyPlayStorePurchase$44(AdjustPlayStorePurchase adjustPlayStorePurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        if (onPurchaseVerificationFinishedListener == null) {
            this.logger.warn("Purchase verification aborted because verification callback is null", new Object[0]);
            return;
        }
        if (this.adjustConfig.isDataResidency) {
            this.logger.warn("Purchase verification not available for data residency users right now", new Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", InterfaceC0435l1.d.b.f29110g, "Purchase verification not available for data residency users right now"));
            return;
        }
        if (!checkActivityStateI(this.activityState)) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", InterfaceC0435l1.d.b.f29106c, "Purchase verification aborted because SDK is still not initialized"));
            this.logger.warn("Purchase verification aborted because SDK is still not initialized", new Object[0]);
            return;
        }
        if (!isEnabledI()) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", InterfaceC0435l1.d.b.f29107d, "Purchase verification aborted because SDK is disabled"));
            this.logger.warn("Purchase verification aborted because SDK is disabled", new Object[0]);
            return;
        }
        if (this.activityState.isGdprForgotten) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", InterfaceC0435l1.d.b.f29108e, "Purchase verification aborted because user is GDPR forgotten"));
            this.logger.warn("Purchase verification aborted because user is GDPR forgotten", new Object[0]);
            return;
        }
        if (adjustPlayStorePurchase == null) {
            this.logger.warn("Purchase verification aborted because purchase instance is null", new Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", InterfaceC0435l1.d.b.f29109f, "Purchase verification aborted because purchase instance is null"));
            return;
        }
        PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis());
        packageBuilder.internalState = this.internalState;
        ActivityPackage activityPackageBuildVerificationPackage = packageBuilder.buildVerificationPackage(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
        if (activityPackageBuildVerificationPackage != null) {
            this.purchaseVerificationHandler.sendPurchaseVerificationPackage(activityPackageBuildVerificationPackage);
        } else {
            this.logger.warn("Purchase verification aborted because verification package is null", new Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 106, "Purchase verification aborted because verification package is null"));
        }
    }

    private void writeActivityStateI() {
        synchronized (ActivityState.class) {
            try {
                ActivityState activityState = this.activityState;
                if (activityState == null) {
                    return;
                }
                Util.writeObject(activityState, this.adjustConfig.context, Constants.ACTIVITY_STATE_FILENAME, ACTIVITY_STATE_NAME);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void writeAttributionI() {
        synchronized (AdjustAttribution.class) {
            try {
                AdjustAttribution adjustAttribution = this.attribution;
                if (adjustAttribution == null) {
                    return;
                }
                Util.writeObject(adjustAttribution, this.adjustConfig.context, Constants.ATTRIBUTION_FILENAME, ATTRIBUTION_NAME);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void writeEventMetadataI() {
        synchronized (EventMetadata.class) {
            try {
                EventMetadata eventMetadata = this.eventMetadata;
                if (eventMetadata == null) {
                    return;
                }
                Util.writeObject(eventMetadata, this.adjustConfig.context, Constants.EVENT_METADATA_FILENAME, EVENT_METADATA_NAME);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void writeGlobalCallbackParametersI() {
        synchronized (GlobalParameters.class) {
            try {
                GlobalParameters globalParameters = this.globalParameters;
                if (globalParameters == null) {
                    return;
                }
                Util.writeObject(globalParameters.callbackParameters, this.adjustConfig.context, Constants.GLOBAL_CALLBACK_PARAMETERS_FILENAME, GLOBAL_CALLBACK_PARAMETERS_NAME);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void writeGlobalPartnerParametersI() {
        synchronized (GlobalParameters.class) {
            try {
                GlobalParameters globalParameters = this.globalParameters;
                if (globalParameters == null) {
                    return;
                }
                Util.writeObject(globalParameters.partnerParameters, this.adjustConfig.context, Constants.GLOBAL_PARTNER_PARAMETERS_FILENAME, GLOBAL_PARTNER_PARAMETERS_NAME);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void addGlobalCallbackParameter(String str, String str2) {
        this.executor.submit(new o(this, str, str2, 1));
    }

    public void addGlobalCallbackParameterI(String str, String str2) {
        if (Util.isValidParameter(str, X3.i.W, "Global Callback") && Util.isValidParameter(str2, X3.i.X, "Global Callback")) {
            GlobalParameters globalParameters = this.globalParameters;
            if (globalParameters.callbackParameters == null) {
                globalParameters.callbackParameters = new LinkedHashMap();
            }
            String str3 = this.globalParameters.callbackParameters.get(str);
            if (str2.equals(str3)) {
                this.logger.verbose("Key %s already present with the same value", str);
                return;
            }
            if (str3 != null) {
                this.logger.warn("Key %s will be overwritten", str);
            }
            this.globalParameters.callbackParameters.put(str, str2);
            writeGlobalCallbackParametersI();
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void addGlobalPartnerParameter(String str, String str2) {
        this.executor.submit(new o(this, str, str2, 0));
    }

    public void addGlobalPartnerParameterI(String str, String str2) {
        if (Util.isValidParameter(str, X3.i.W, "Global Partner") && Util.isValidParameter(str2, X3.i.X, "Global Partner")) {
            GlobalParameters globalParameters = this.globalParameters;
            if (globalParameters.partnerParameters == null) {
                globalParameters.partnerParameters = new LinkedHashMap();
            }
            String str3 = this.globalParameters.partnerParameters.get(str);
            if (str2.equals(str3)) {
                this.logger.verbose("Key %s already present with the same value", str);
                return;
            }
            if (str3 != null) {
                this.logger.warn("Key %s will be overwritten", str);
            }
            this.globalParameters.partnerParameters.put(str, str2);
            writeGlobalPartnerParametersI();
        }
    }

    public void backgroundTimerFired() {
        this.executor.submit(new a0(this, 6));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void endFirstSessionDelay() {
        this.executor.submit(new a(this, 2));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void finishedTrackingActivity(ResponseData responseData) {
        processRemoteTriggers(responseData);
        if (responseData instanceof SessionResponseData) {
            this.logger.debug("Finished tracking session", new Object[0]);
            this.attributionHandler.checkSessionResponse((SessionResponseData) responseData);
            return;
        }
        if (responseData instanceof SdkClickResponseData) {
            SdkClickResponseData sdkClickResponseData = (SdkClickResponseData) responseData;
            checkForInstallReferrerInfo(sdkClickResponseData);
            this.attributionHandler.checkSdkClickResponse(sdkClickResponseData);
        } else {
            if (responseData instanceof EventResponseData) {
                launchEventResponseTasks((EventResponseData) responseData);
                return;
            }
            if (responseData instanceof PurchaseVerificationResponseData) {
                launchPurchaseVerificationResponseTasks((PurchaseVerificationResponseData) responseData);
            }
            if (responseData instanceof ThirdPartySharingResponseData) {
                launchThirdPartySharingResponseTasks((ThirdPartySharingResponseData) responseData);
            }
        }
    }

    public void foregroundTimerFired() {
        this.executor.submit(new a0(this, 5));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void gdprForgetMe() {
        this.executor.submit(new a(this, 7));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public ActivityState getActivityState() {
        return this.activityState;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void getAdid(OnAdidReadListener onAdidReadListener) {
        ActivityState activityState = this.activityState;
        if (activityState != null && activityState.adid != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new s(this, onAdidReadListener, 0));
            return;
        }
        if (activityState == null) {
            this.logger.warn("SDK needs to be initialized before getting adid", new Object[0]);
        }
        synchronized (this.cachedAdidReadCallbacks) {
            this.cachedAdidReadCallbacks.add(onAdidReadListener);
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void getAdidWithTimeout(long j10, OnAdidReadListener onAdidReadListener) {
        ActivityState activityState = this.activityState;
        if (activityState != null && activityState.adid != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new s(this, onAdidReadListener, 1));
            return;
        }
        if (activityState == null) {
            this.logger.warn("SDK needs to be initialized before getting adid", new Object[0]);
        }
        queueGetAdidWithTimeout(j10, onAdidReadListener, this.cachedAdidReadTimeoutCallbacks, getContext());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public AdjustConfig getAdjustConfig() {
        return this.adjustConfig;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void getAttribution(OnAttributionReadListener onAttributionReadListener) {
        if (this.attribution != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new u(this, onAttributionReadListener, 0));
            return;
        }
        synchronized (this.cachedAttributionReadCallbacks) {
            this.cachedAttributionReadCallbacks.add(onAttributionReadListener);
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void getAttributionWithTimeout(long j10, OnAttributionReadListener onAttributionReadListener) {
        if (this.attribution != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new u(this, onAttributionReadListener, 1));
        } else {
            queueGetAttributionWithTimeout(j10, onAttributionReadListener, this.cachedAttributionReadTimeoutCallbacks, getContext());
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public Context getContext() {
        return this.adjustConfig.context;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public q0 getFirstSessionDelayManager() {
        return this.firstSessionDelayManager;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public GlobalParameters getGlobalParameters() {
        return this.globalParameters;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public InternalState getInternalState() {
        return this.internalState;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void getThirdPartySharingSettingsWithTimeout(long j10, OnThirdPartySharingSettingsReadListener onThirdPartySharingSettingsReadListener) {
        if (this.thirdPartySharingResult != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new d0(6, this, onThirdPartySharingSettingsReadListener));
        } else {
            queueGetThirdPartySharingSettingsWithTimeout(j10, onThirdPartySharingSettingsReadListener, this.cachedThirdPartySharingTimeoutCallbacks, getContext());
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void gotOptOutResponse() {
        this.executor.submit(new a0(this, 4));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void init(AdjustConfig adjustConfig) {
        this.adjustConfig = adjustConfig;
    }

    public void initI() {
        String pushToken;
        SESSION_INTERVAL = AdjustFactory.getSessionInterval();
        SUBSESSION_INTERVAL = AdjustFactory.getSubsessionInterval();
        FOREGROUND_TIMER_INTERVAL = AdjustFactory.getTimerInterval();
        FOREGROUND_TIMER_START = AdjustFactory.getTimerStart();
        BACKGROUND_TIMER_INTERVAL = AdjustFactory.getTimerInterval();
        this.globalParameters = new GlobalParameters();
        readGlobalCallbackParametersI(this.adjustConfig.context);
        readGlobalPartnerParametersI(this.adjustConfig.context);
        ActivityState activityState = this.activityState;
        if (activityState != null) {
            activityState.setEventDeduplicationIdsMaxSize(this.adjustConfig.getEventDeduplicationIdsMaxSize());
        }
        AdjustConfig adjustConfig = this.adjustConfig;
        if (adjustConfig.startEnabled != null) {
            adjustConfig.preLaunchActions.preLaunchActionsArray.add(new m0(this, 2));
        }
        ActivityState activityState2 = this.activityState;
        InternalState internalState = this.internalState;
        if (activityState2 != null) {
            internalState.enabled = activityState2.enabled;
            internalState.firstLaunch = false;
        } else {
            internalState.firstLaunch = true;
        }
        readConfigFile(this.adjustConfig.context);
        DeviceInfo deviceInfo = new DeviceInfo(this.adjustConfig);
        this.deviceInfo = deviceInfo;
        deviceInfo.reloadGoogleAdId(this.adjustConfig);
        if (this.deviceInfo.googleAdId == null) {
            boolean zIsGoogleAdIdReadingEnabled = Util.isGoogleAdIdReadingEnabled(this.adjustConfig);
            ILogger iLogger = this.logger;
            if (zIsGoogleAdIdReadingEnabled) {
                iLogger.warn("Unable to get Google Advertising ID at start time", new Object[0]);
            } else {
                iLogger.info("Cannot read Google Advertising ID with COPPA or play store kids app enabled or reading disabled", new Object[0]);
            }
            if (this.deviceInfo.androidId == null) {
                boolean zIsAndroidIdReadingEnabled = Util.isAndroidIdReadingEnabled(this.adjustConfig);
                ILogger iLogger2 = this.logger;
                if (zIsAndroidIdReadingEnabled) {
                    iLogger2.error("Unable to get Android Id. Please check if Proguard is correctly set with Adjust SDK", new Object[0]);
                } else {
                    iLogger2.info("Cannot read Android ID with COPPA or play store kids app enabled or reading disabled", new Object[0]);
                }
            }
        } else {
            this.logger.info("Google Play Services Advertising ID read correctly at start time", new Object[0]);
        }
        String str = this.adjustConfig.defaultTracker;
        if (str != null) {
            this.logger.info("Default tracker: '%s'", str);
        }
        String str2 = this.adjustConfig.pushToken;
        if (str2 != null) {
            this.logger.info("Push token: '%s'", str2);
            if (this.activityState != null) {
                setPushToken(this.adjustConfig.pushToken, false);
            } else {
                SharedPreferencesManager.getDefaultInstance(getContext()).savePushToken(this.adjustConfig.pushToken);
            }
        } else if (this.activityState != null && (pushToken = SharedPreferencesManager.getDefaultInstance(getContext()).getPushToken()) != null) {
            setPushToken(pushToken, true);
        }
        if (this.cachedDeeplinkResolutionCallback == null) {
            this.cachedDeeplinkResolutionCallback = this.adjustConfig.cachedDeeplinkResolutionCallback;
        }
        handleAdidCallbackI();
        handleAttributionCallbackI();
        handleThirdPartySharingCallbackI();
        if (this.activityState != null && SharedPreferencesManager.getDefaultInstance(getContext()).getGdprForgetMe()) {
            gdprForgetMe();
        }
        this.foregroundTimer = new TimerCycle(new a0(this, 7), FOREGROUND_TIMER_START, FOREGROUND_TIMER_INTERVAL, FOREGROUND_TIMER_NAME);
        if (this.adjustConfig.isSendingInBackgroundEnabled) {
            this.logger.info("Send in background configured", new Object[0]);
            this.backgroundTimer = new TimerOnce(new a0(this, 8), BACKGROUND_TIMER_NAME);
        }
        AdjustConfig adjustConfig2 = this.adjustConfig;
        this.packageHandler = AdjustFactory.getPackageHandler(this, this.adjustConfig.context, toSendI(false), new ActivityPackageSender(adjustConfig2.urlStrategyDomains, adjustConfig2.useSubdomains, adjustConfig2.basePath, adjustConfig2.gdprPath, adjustConfig2.subscriptionPath, adjustConfig2.purchaseVerificationPath, this.deviceInfo.clientSdk, 60000, adjustConfig2.context));
        AdjustConfig adjustConfig3 = this.adjustConfig;
        this.attributionHandler = AdjustFactory.getAttributionHandler(this, toSendI(false), new ActivityPackageSender(adjustConfig3.urlStrategyDomains, adjustConfig3.useSubdomains, adjustConfig3.basePath, adjustConfig3.gdprPath, adjustConfig3.subscriptionPath, adjustConfig3.purchaseVerificationPath, this.deviceInfo.clientSdk, 60000, adjustConfig3.context));
        AdjustConfig adjustConfig4 = this.adjustConfig;
        this.sdkClickHandler = AdjustFactory.getSdkClickHandler(this, toSendI(true), new ActivityPackageSender(adjustConfig4.urlStrategyDomains, adjustConfig4.useSubdomains, adjustConfig4.basePath, adjustConfig4.gdprPath, adjustConfig4.subscriptionPath, adjustConfig4.purchaseVerificationPath, this.deviceInfo.clientSdk, 60000, adjustConfig4.context));
        AdjustConfig adjustConfig5 = this.adjustConfig;
        this.purchaseVerificationHandler = AdjustFactory.getPurchaseVerificationHandler(this, toSendI(true), new ActivityPackageSender(adjustConfig5.urlStrategyDomains, adjustConfig5.useSubdomains, adjustConfig5.basePath, adjustConfig5.gdprPath, adjustConfig5.subscriptionPath, adjustConfig5.purchaseVerificationPath, this.deviceInfo.clientSdk, 30000, adjustConfig5.context));
        this.installReferrer = new InstallReferrer(this.adjustConfig.context, new x(this, 0));
        preLaunchActionsI(this.adjustConfig.preLaunchActions.preLaunchActionsArray);
        lambda$sendReftagReferrer$16();
        bootstrapLifecycleI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public boolean isEnabled() {
        return isEnabledI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchAttributionResponseTasks(AttributionResponseData attributionResponseData) {
        this.executor.submit(new d0(2, this, attributionResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchEventResponseTasks(EventResponseData eventResponseData) {
        this.executor.submit(new b0(this, eventResponseData, 2));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchPurchaseVerificationResponseTasks(PurchaseVerificationResponseData purchaseVerificationResponseData) {
        this.executor.submit(new d0(3, this, purchaseVerificationResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchSdkClickResponseTasks(SdkClickResponseData sdkClickResponseData) {
        this.executor.submit(new d0(1, this, sdkClickResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchSessionResponseTasks(SessionResponseData sessionResponseData) {
        this.executor.submit(new c0(this, sessionResponseData, 2));
    }

    @Override // com.adjust.sdk.SystemLifecycle.SystemLifecycleCallback
    public void onActivityLifecycle(boolean z10) {
        try {
            this.executor.submit(new b(this, z10, 8));
        } catch (Exception unused) {
            ILogger iLogger = this.logger;
            if (iLogger != null) {
                iLogger.error("Exception while executing onActivityLifecycle task", new Object[0]);
            }
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void onPause() {
        onActivityLifecycle(false);
    }

    public void onPauseI() {
        stopForegroundTimerI();
        startBackgroundTimerI();
        this.logger.verbose("Subsession end", new Object[0]);
        endI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void onResume() {
        onActivityLifecycle(true);
    }

    public void onResumeI() {
        stopBackgroundTimerI();
        startForegroundTimerI();
        this.logger.verbose("Subsession start", new Object[0]);
        startI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void processAndResolveDeeplink(AdjustDeeplink adjustDeeplink, long j10, OnDeeplinkResolvedListener onDeeplinkResolvedListener) {
        this.cachedDeeplinkResolutionCallback = onDeeplinkResolvedListener;
        this.executor.submit(new m(this, adjustDeeplink, j10, 3));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void processDeeplink(AdjustDeeplink adjustDeeplink, long j10) {
        this.executor.submit(new m(this, adjustDeeplink, j10, 0));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void processRemoteTriggers(ResponseData responseData) {
        this.executor.submit(new d0(5, this, responseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeGlobalCallbackParameter(String str) {
        this.executor.submit(new g(this, str, 2));
    }

    public void removeGlobalCallbackParameterI(String str) {
        if (Util.isValidParameter(str, X3.i.W, "Session Callback")) {
            Map<String, String> map = this.globalParameters.callbackParameters;
            if (map == null) {
                this.logger.warn("Session Callback parameters are not set", new Object[0]);
                return;
            }
            String strRemove = map.remove(str);
            ILogger iLogger = this.logger;
            if (strRemove == null) {
                iLogger.warn("Key %s does not exist", str);
            } else {
                iLogger.debug("Key %s will be removed", str);
                writeGlobalCallbackParametersI();
            }
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeGlobalCallbackParameters() {
        this.executor.submit(new a(this, 5));
    }

    public void removeGlobalCallbackParametersI() {
        if (this.globalParameters.callbackParameters == null) {
            this.logger.warn("Session Callback parameters are not set", new Object[0]);
        }
        this.globalParameters.callbackParameters = null;
        writeGlobalCallbackParametersI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeGlobalPartnerParameter(String str) {
        this.executor.submit(new g(this, str, 1));
    }

    public void removeGlobalPartnerParameterI(String str) {
        if (Util.isValidParameter(str, X3.i.W, "Session Partner")) {
            Map<String, String> map = this.globalParameters.partnerParameters;
            if (map == null) {
                this.logger.warn("Session Partner parameters are not set", new Object[0]);
                return;
            }
            String strRemove = map.remove(str);
            ILogger iLogger = this.logger;
            if (strRemove == null) {
                iLogger.warn("Key %s does not exist", str);
            } else {
                iLogger.debug("Key %s will be removed", str);
                writeGlobalPartnerParametersI();
            }
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeGlobalPartnerParameters() {
        this.executor.submit(new a(this, 1));
    }

    public void removeGlobalPartnerParametersI() {
        if (this.globalParameters.partnerParameters == null) {
            this.logger.warn("Session Partner parameters are not set", new Object[0]);
        }
        this.globalParameters.partnerParameters = null;
        writeGlobalPartnerParametersI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendInstallReferrer(ReferrerDetails referrerDetails, String str) {
        this.executor.submit(new e0(this, referrerDetails, str, 1));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendLicenseVerificationData(LicenseData licenseData) {
        this.executor.submit(new d0(10, this, licenseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendPreinstallReferrer() {
        this.executor.submit(new a(this, 0));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendReftagReferrer() {
        this.executor.submit(new a(this, 4));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setAskingAttribution(boolean z10) {
        this.executor.submit(new f0(z10, this));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setCoppaComplianceInDelay(boolean z10) {
        this.executor.submit(new b(this, z10, 2));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setEnabled(boolean z10) {
        this.executor.submit(new b(this, z10, 5));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setExternalDeviceIdInDelay(String str) {
        this.executor.submit(new g(this, str, 0));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setOfflineMode(boolean z10) {
        this.executor.submit(new b(this, z10, 4));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setPlayStoreKidsComplianceInDelay(boolean z10) {
        this.executor.submit(new b(this, z10, 6));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setPushToken(String str, boolean z10) {
        this.executor.submit(new p(this, z10, str, 0));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void teardown() {
        TimerOnce timerOnce = this.backgroundTimer;
        if (timerOnce != null) {
            timerOnce.teardown();
        }
        TimerCycle timerCycle = this.foregroundTimer;
        if (timerCycle != null) {
            timerCycle.teardown();
        }
        ThreadExecutor threadExecutor = this.executor;
        if (threadExecutor != null) {
            threadExecutor.teardown();
        }
        IPackageHandler iPackageHandler = this.packageHandler;
        if (iPackageHandler != null) {
            iPackageHandler.teardown();
        }
        IAttributionHandler iAttributionHandler = this.attributionHandler;
        if (iAttributionHandler != null) {
            iAttributionHandler.teardown();
        }
        ISdkClickHandler iSdkClickHandler = this.sdkClickHandler;
        if (iSdkClickHandler != null) {
            iSdkClickHandler.teardown();
        }
        IPurchaseVerificationHandler iPurchaseVerificationHandler = this.purchaseVerificationHandler;
        if (iPurchaseVerificationHandler != null) {
            iPurchaseVerificationHandler.teardown();
        }
        GlobalParameters globalParameters = this.globalParameters;
        if (globalParameters != null) {
            Map<String, String> map = globalParameters.callbackParameters;
            if (map != null) {
                map.clear();
            }
            Map<String, String> map2 = this.globalParameters.partnerParameters;
            if (map2 != null) {
                map2.clear();
            }
        }
        teardownActivityStateS();
        teardownAttributionS();
        teardownAllGlobalParametersS();
        teardownEventMetadataS();
        this.packageHandler = null;
        this.logger = null;
        this.foregroundTimer = null;
        this.executor = null;
        this.backgroundTimer = null;
        this.internalState = null;
        this.deviceInfo = null;
        this.adjustConfig = null;
        this.attributionHandler = null;
        this.sdkClickHandler = null;
        this.purchaseVerificationHandler = null;
        this.globalParameters = null;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackAdRevenue(AdjustAdRevenue adjustAdRevenue) {
        this.executor.submit(new d(this, adjustAdRevenue, 0));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackEvent(AdjustEvent adjustEvent) {
        this.executor.submit(new e(this, adjustEvent, 1));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackMeasurementConsent(boolean z10) {
        this.executor.submit(new b(this, z10, 1));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackPlayStoreSubscription(AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        this.executor.submit(new h(this, adjustPlayStoreSubscription, 1));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackThirdPartySharing(AdjustThirdPartySharing adjustThirdPartySharing) {
        this.executor.submit(new b2.o(2, this, adjustThirdPartySharing));
    }

    public void tryTrackMeasurementConsentI(boolean z10) {
        if (canTrackMeasurementConsentI()) {
            trackMeasurementConsentI(z10);
        } else {
            this.cachedLastMeasurementConsentTrack = Boolean.valueOf(z10);
        }
    }

    public void tryTrackThirdPartySharingI(AdjustThirdPartySharing adjustThirdPartySharing) {
        if (canTrackThirdPartySharingI()) {
            trackThirdPartySharingI(adjustThirdPartySharing);
            return;
        }
        if (this.cachedAdjustThirdPartySharingArray == null) {
            this.cachedAdjustThirdPartySharingArray = new ArrayList();
        }
        this.cachedAdjustThirdPartySharingArray.add(adjustThirdPartySharing);
    }

    @Override // com.adjust.sdk.IActivityHandler
    public boolean updateAttributionI(AdjustAttribution adjustAttribution) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (adjustAttribution == null || this.activityState.askingAttribution) {
            return false;
        }
        synchronized (this.cachedAttributionReadCallbacks) {
            try {
                arrayList = null;
                if (this.cachedAttributionReadCallbacks.isEmpty()) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList(this.cachedAttributionReadCallbacks);
                    this.cachedAttributionReadCallbacks.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList2 != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new y(arrayList2, adjustAttribution, 2));
        }
        synchronized (this.cachedAttributionReadTimeoutCallbacks) {
            try {
                if (!this.cachedAttributionReadTimeoutCallbacks.isEmpty()) {
                    arrayList = new ArrayList(this.cachedAttributionReadTimeoutCallbacks);
                    this.cachedAttributionReadTimeoutCallbacks.clear();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (arrayList != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new y(arrayList, adjustAttribution, 3));
        }
        if (adjustAttribution.equals(this.attribution)) {
            return false;
        }
        this.attribution = adjustAttribution;
        writeAttributionI();
        return true;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void verifyAndTrackPlayStorePurchase(AdjustEvent adjustEvent, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        this.executor.submit(new q(this, adjustEvent, onPurchaseVerificationFinishedListener, 1));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void verifyPlayStorePurchase(AdjustPlayStorePurchase adjustPlayStorePurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        this.executor.submit(new j(this, adjustPlayStorePurchase, onPurchaseVerificationFinishedListener, 1));
    }

    private void checkAfterNewStartI(SharedPreferencesManager sharedPreferencesManager) {
        String pushToken = sharedPreferencesManager.getPushToken();
        if (pushToken != null && !pushToken.equals(this.activityState.pushToken)) {
            setPushToken(pushToken, true);
        }
        if (sharedPreferencesManager.getRawReferrerArray() != null) {
            sendReftagReferrer();
        }
        checkForPreinstallI();
        this.installReferrer.startConnection();
        readInstallReferrerMeta();
        readInstallReferrerHuaweiAds();
        readInstallReferrerHuaweiAppGallery();
        readInstallReferrerSamsung();
        readInstallReferrerXiaomi();
        readInstallReferrerVivo();
        readLicenseVerificationData();
    }

    private boolean pausedI(boolean z10) {
        InternalState internalState = this.internalState;
        if (z10) {
            return internalState.isOffline() || !isEnabledI();
        }
        return internalState.isOffline() || !isEnabledI();
    }

    private boolean toSendI(boolean z10) {
        if (pausedI(z10)) {
            return false;
        }
        if (this.adjustConfig.isSendingInBackgroundEnabled) {
            return true;
        }
        return this.internalState.isInForeground();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void isEnabled(OnIsEnabledListener onIsEnabledListener) {
        this.executor.submit(new i(this, onIsEnabledListener, 1));
    }
}
