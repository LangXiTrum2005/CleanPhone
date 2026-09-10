package com.adjust.sdk;

import com.adjust.sdk.network.IActivityPackageSender;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadScheduler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class SdkClickHandler implements ISdkClickHandler {
    private static final double MILLISECONDS_TO_SECONDS_DIVISOR = 1000.0d;
    private static final String SCHEDULED_EXECUTOR_SOURCE = "SdkClickHandler";
    private static final String SOURCE_INSTALL_REFERRER = "install_referrer";
    private static final String SOURCE_REFTAG = "reftag";
    private WeakReference<IActivityHandler> activityHandlerWeakRef;
    private IActivityPackageSender activityPackageSender;
    private BackoffStrategy backoffStrategy;
    private long lastPackageRetryInMilli = 0;
    private ILogger logger;
    private List<ActivityPackage> packageQueue;
    private boolean paused;
    private ThreadScheduler scheduler;

    public SdkClickHandler(IActivityHandler iActivityHandler, boolean z10, IActivityPackageSender iActivityPackageSender) {
        init(iActivityHandler, z10, iActivityPackageSender);
        this.logger = AdjustFactory.getLogger();
        this.backoffStrategy = AdjustFactory.getSdkClickBackoffStrategy();
        this.scheduler = new SingleThreadCachedScheduler(SCHEDULED_EXECUTOR_SOURCE);
    }

    private Map<String, String> generateSendingParametersI() {
        HashMap map = new HashMap();
        int size = this.packageQueue.size() - 1;
        if (size > 0) {
            PackageBuilder.addLong(map, "queue_size", size);
        }
        return map;
    }

    private void logErrorMessageI(ActivityPackage activityPackage, String str, Throwable th2) {
        this.logger.error(Util.formatString("%s. (%s)", activityPackage.getFailureMessage(), Util.getReasonString(str, th2)), new Object[0]);
    }

    private void retrySendingI(ActivityPackage activityPackage, Long l) {
        if (l == null || l.longValue() <= 0) {
            this.logger.error("Retrying sdk_click package for the %d time", Integer.valueOf(activityPackage.increaseRetries()));
        } else {
            this.lastPackageRetryInMilli = l.longValue();
        }
        sendSdkClick(activityPackage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextSdkClick() {
        this.scheduler.submit(new v(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextSdkClickI() {
        IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        if (iActivityHandler.getActivityState() == null || iActivityHandler.getActivityState().isGdprForgotten || this.paused || this.packageQueue.isEmpty()) {
            return;
        }
        ActivityPackage activityPackageRemove = this.packageQueue.remove(0);
        int retries = activityPackageRemove.getRetries();
        y0 y0Var = new y0(this, activityPackageRemove, 1);
        long jWaitTime = waitTime(retries);
        if (jWaitTime > 0) {
            this.scheduler.schedule(y0Var, jWaitTime);
        } else {
            y0Var.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSdkClickI(ActivityPackage activityPackage) {
        long clickTimeInSeconds;
        String str;
        long j10;
        long installBeginTimeInSeconds;
        long clickTimeServerInSeconds;
        Boolean bool;
        Boolean bool2;
        String str2;
        String str3;
        String str4;
        IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        String str5 = activityPackage.getParameters().get("source");
        boolean z10 = str5 != null && str5.equals("reftag");
        String str6 = activityPackage.getParameters().get("raw_referrer");
        if (z10 && SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext()).getRawReferrer(str6, activityPackage.getClickTimeInMilliseconds()) == null) {
            return;
        }
        boolean z11 = str5 != null && str5.equals("install_referrer");
        if (z11) {
            clickTimeInSeconds = activityPackage.getClickTimeInSeconds();
            installBeginTimeInSeconds = activityPackage.getInstallBeginTimeInSeconds();
            str = activityPackage.getParameters().get(Constants.REFERRER);
            clickTimeServerInSeconds = activityPackage.getClickTimeServerInSeconds();
            long installBeginTimeServerInSeconds = activityPackage.getInstallBeginTimeServerInSeconds();
            String installVersion = activityPackage.getInstallVersion();
            Boolean googlePlayInstant = activityPackage.getGooglePlayInstant();
            Boolean isClick = activityPackage.getIsClick();
            j10 = installBeginTimeServerInSeconds;
            str2 = installVersion;
            bool = googlePlayInstant;
            str3 = activityPackage.getParameters().get("referrer_api");
            bool2 = isClick;
        } else {
            clickTimeInSeconds = -1;
            str = null;
            j10 = -1;
            installBeginTimeInSeconds = -1;
            clickTimeServerInSeconds = -1;
            bool = null;
            bool2 = null;
            str2 = null;
            str3 = null;
        }
        Boolean bool3 = bool2;
        boolean z12 = str5 != null && str5.equals(Constants.PREINSTALL);
        boolean z13 = str5 != null && str5.equals(Constants.LICENSE_VERIFICATION);
        ResponseData responseDataSendActivityPackageSync = this.activityPackageSender.sendActivityPackageSync(activityPackage, generateSendingParametersI());
        if (responseDataSendActivityPackageSync instanceof SdkClickResponseData) {
            SdkClickResponseData sdkClickResponseData = (SdkClickResponseData) responseDataSendActivityPackageSync;
            if (sdkClickResponseData.willRetry) {
                retrySendingI(activityPackage, sdkClickResponseData.retryIn);
                return;
            }
            Boolean bool4 = bool;
            this.lastPackageRetryInMilli = 0L;
            if (iActivityHandler == 0) {
                return;
            }
            if (sdkClickResponseData.trackingState == TrackingState.OPTED_OUT) {
                iActivityHandler.gotOptOutResponse();
                return;
            }
            if (z10) {
                SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext()).removeRawReferrer(str6, activityPackage.getClickTimeInMilliseconds());
            }
            if (z11) {
                sdkClickResponseData.clickTime = clickTimeInSeconds;
                sdkClickResponseData.installBegin = installBeginTimeInSeconds;
                sdkClickResponseData.installReferrer = str;
                sdkClickResponseData.clickTimeServer = clickTimeServerInSeconds;
                sdkClickResponseData.installBeginServer = j10;
                sdkClickResponseData.installVersion = str2;
                sdkClickResponseData.googlePlayInstant = bool4;
                sdkClickResponseData.isClick = bool3;
                sdkClickResponseData.referrerApi = str3;
                sdkClickResponseData.isInstallReferrer = true;
            }
            if (z12 && (str4 = activityPackage.getParameters().get("found_location")) != null && !str4.isEmpty()) {
                SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext());
                if (Constants.SYSTEM_INSTALLER_REFERRER.equalsIgnoreCase(str4)) {
                    defaultInstance.removePreinstallReferrer();
                } else {
                    defaultInstance.setPreinstallPayloadReadStatus(PreinstallUtil.markAsRead(str4, defaultInstance.getPreinstallPayloadReadStatus()));
                }
            }
            if (z13) {
                SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext()).setLicenseVerificationTracked();
            }
            iActivityHandler.finishedTrackingActivity(sdkClickResponseData);
        }
    }

    private long waitTime(int i10) {
        long j10 = this.lastPackageRetryInMilli;
        if (j10 > 0) {
            return j10;
        }
        if (i10 <= 0) {
            return 0L;
        }
        long waitingTime = Util.getWaitingTime(i10, this.backoffStrategy);
        this.logger.verbose("Waiting for %s seconds before retrying sdk_click for the %d time", Util.SecondsDisplayFormat.format(waitingTime / MILLISECONDS_TO_SECONDS_DIVISOR), Integer.valueOf(i10));
        return waitingTime;
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void init(IActivityHandler iActivityHandler, boolean z10, IActivityPackageSender iActivityPackageSender) {
        this.paused = !z10;
        this.packageQueue = new ArrayList();
        this.activityHandlerWeakRef = new WeakReference<>(iActivityHandler);
        this.activityPackageSender = iActivityPackageSender;
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void pauseSending() {
        this.paused = true;
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void resumeSending() {
        this.paused = false;
        sendNextSdkClick();
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void sendPreinstallPayload(String str, String str2) {
        this.scheduler.submit(new e0(this, str, str2, 2));
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void sendReftagReferrers() {
        this.scheduler.submit(new z0(this));
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void sendSdkClick(ActivityPackage activityPackage) {
        this.scheduler.submit(new y0(this, activityPackage, 0));
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void teardown() {
        this.logger.verbose("SdkClickHandler teardown", new Object[0]);
        ThreadScheduler threadScheduler = this.scheduler;
        if (threadScheduler != null) {
            threadScheduler.teardown();
        }
        List<ActivityPackage> list = this.packageQueue;
        if (list != null) {
            list.clear();
        }
        WeakReference<IActivityHandler> weakReference = this.activityHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.logger = null;
        this.packageQueue = null;
        this.backoffStrategy = null;
        this.scheduler = null;
    }
}
