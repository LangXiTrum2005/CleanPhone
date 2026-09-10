package com.adjust.sdk;

import android.content.Context;
import com.adjust.sdk.network.IActivityPackageSender;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadScheduler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class PackageHandler implements IPackageHandler, IActivityPackageSender.ResponseDataCallbackSubscriber {
    private static final String PACKAGE_QUEUE_FILENAME = "AdjustIoPackageQueue";
    private static final String PACKAGE_QUEUE_NAME = "Package queue";
    private WeakReference<IActivityHandler> activityHandlerWeakRef;
    private IActivityPackageSender activityPackageSender;
    private Context context;
    private AtomicBoolean isSending;
    private List<ActivityPackage> packageQueue;
    private boolean paused;
    private long retryStartedAtTimeMilliSeconds;
    private ThreadScheduler scheduler = new SingleThreadCachedScheduler("PackageHandler");
    private ILogger logger = AdjustFactory.getLogger();
    private BackoffStrategy backoffStrategy = AdjustFactory.getPackageHandlerBackoffStrategy();
    private BackoffStrategy backoffStrategyForInstallSession = AdjustFactory.getInstallSessionBackoffStrategy();
    private boolean isRetrying = false;
    private double totalWaitTimeSeconds = 0.0d;

    public PackageHandler(IActivityHandler iActivityHandler, Context context, boolean z10, IActivityPackageSender iActivityPackageSender) {
        init(iActivityHandler, context, z10, iActivityPackageSender);
        this.scheduler.submit(new v0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addI(ActivityPackage activityPackage) {
        if (this.isRetrying) {
            activityPackage.setWaitBeforeSendTimeSeconds(this.totalWaitTimeSeconds - ((System.currentTimeMillis() - this.retryStartedAtTimeMilliSeconds) / 1000.0d));
        }
        PackageBuilder.addLong(activityPackage.getParameters(), "enqueue_size", this.packageQueue.size());
        this.packageQueue.add(activityPackage);
        this.logger.debug("Added package %d (%s)", Integer.valueOf(this.packageQueue.size()), activityPackage);
        this.logger.verbose("%s", activityPackage.getExtendedString());
        writePackageQueueI();
    }

    public static Boolean deletePackageQueue(Context context) {
        return Boolean.valueOf(context.deleteFile(PACKAGE_QUEUE_FILENAME));
    }

    public static void deleteState(Context context) {
        deletePackageQueue(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flushI() {
        this.packageQueue.clear();
        writePackageQueueI();
    }

    private Map<String, String> generateSendingParametersI() {
        HashMap map = new HashMap();
        int size = this.packageQueue.size() - 1;
        if (size > 0) {
            PackageBuilder.addLong(map, "queue_size", size);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initI() {
        this.isSending = new AtomicBoolean();
        readPackageQueueI();
    }

    private void readPackageQueueI() {
        try {
            this.packageQueue = (List) Util.readObject(this.context, PACKAGE_QUEUE_FILENAME, PACKAGE_QUEUE_NAME, List.class);
        } catch (Exception e10) {
            this.logger.error("Failed to read %s file (%s)", PACKAGE_QUEUE_NAME, e10.getMessage());
            this.packageQueue = null;
        }
        List<ActivityPackage> list = this.packageQueue;
        if (list != null) {
            this.logger.debug("Package handler read %d packages", Integer.valueOf(list.size()));
        } else {
            this.packageQueue = new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendFirstI() {
        if (this.packageQueue.isEmpty()) {
            return;
        }
        if (this.paused) {
            this.logger.debug("Package handler is paused", new Object[0]);
            return;
        }
        if (this.isSending.getAndSet(true)) {
            this.logger.verbose("Package handler is already sending", new Object[0]);
            return;
        }
        Map<String, String> mapGenerateSendingParametersI = generateSendingParametersI();
        ActivityPackage activityPackage = this.packageQueue.get(0);
        PackageBuilder.addLong(mapGenerateSendingParametersI, "retry_count", activityPackage.getRetryCount());
        PackageBuilder.addLong(mapGenerateSendingParametersI, "first_error", activityPackage.getFirstErrorCode());
        PackageBuilder.addLong(mapGenerateSendingParametersI, "last_error", activityPackage.getLastErrorCode());
        PackageBuilder.addDouble(mapGenerateSendingParametersI, "wait_total", this.totalWaitTimeSeconds);
        PackageBuilder.addDouble(mapGenerateSendingParametersI, "wait_time", activityPackage.getWaitBeforeSendTimeSeconds());
        this.activityPackageSender.sendActivityPackage(activityPackage, mapGenerateSendingParametersI, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextI(Long l) {
        this.isRetrying = false;
        this.retryStartedAtTimeMilliSeconds = 0L;
        if (this.packageQueue.isEmpty()) {
            this.totalWaitTimeSeconds = 0.0d;
            return;
        }
        this.packageQueue.remove(0);
        writePackageQueueI();
        if (l == null || l.longValue() <= 0) {
            this.logger.verbose("Package handler can send", new Object[0]);
            this.isSending.set(false);
            sendFirstI();
        } else {
            v0 v0Var = new v0(this, 4);
            this.logger.verbose("Waiting for %d seconds before continuing for next package in continue_in", Double.valueOf(l.longValue() / 1000.0d));
            this.scheduler.schedule(v0Var, l.longValue());
        }
    }

    private void writePackageQueueI() {
        Util.writeObject(this.packageQueue, this.context, PACKAGE_QUEUE_FILENAME, PACKAGE_QUEUE_NAME);
        this.logger.debug("Package handler wrote %d packages", Integer.valueOf(this.packageQueue.size()));
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void addPackage(ActivityPackage activityPackage) {
        this.scheduler.submit(new d0(18, this, activityPackage));
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void flush() {
        this.scheduler.submit(new v0(this, 3));
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void init(IActivityHandler iActivityHandler, Context context, boolean z10, IActivityPackageSender iActivityPackageSender) {
        this.activityHandlerWeakRef = new WeakReference<>(iActivityHandler);
        this.context = context;
        this.paused = !z10;
        this.activityPackageSender = iActivityPackageSender;
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender.ResponseDataCallbackSubscriber
    public void onResponseDataCallback(ResponseData responseData) {
        this.logger.debug("Got response in PackageHandler", new Object[0]);
        IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        if (iActivityHandler != null && responseData.trackingState == TrackingState.OPTED_OUT) {
            iActivityHandler.gotOptOutResponse();
        }
        if (!responseData.willRetry) {
            this.scheduler.submit(new d0(19, this, responseData));
            if (iActivityHandler != null) {
                iActivityHandler.finishedTrackingActivity(responseData);
                return;
            }
            return;
        }
        if (!this.isRetrying) {
            this.isRetrying = true;
            this.retryStartedAtTimeMilliSeconds = System.currentTimeMillis();
        }
        writePackageQueueI();
        if (iActivityHandler != null) {
            iActivityHandler.finishedTrackingActivity(responseData);
        }
        v0 v0Var = new v0(this, 2);
        Long l = responseData.retryIn;
        if (l != null && l.longValue() > 0) {
            this.scheduler.schedule(v0Var, responseData.retryIn.longValue());
            return;
        }
        int iIncreaseRetries = responseData.activityPackage.increaseRetries();
        long waitingTime = (responseData.activityPackage.getActivityKind() != ActivityKind.SESSION || SharedPreferencesManager.getDefaultInstance(this.context).getInstallTracked()) ? Util.getWaitingTime(iIncreaseRetries, this.backoffStrategy) : Util.getWaitingTime(iIncreaseRetries, this.backoffStrategyForInstallSession);
        double d10 = waitingTime / 1000.0d;
        String str = Util.SecondsDisplayFormat.format(d10);
        this.totalWaitTimeSeconds += d10;
        this.logger.verbose("Waiting for %s seconds before retrying %s for the %d time", str, responseData.activityPackage.getActivityKind().toString(), Integer.valueOf(iIncreaseRetries));
        this.scheduler.schedule(v0Var, waitingTime);
        ActivityPackage activityPackage = responseData.activityPackage;
        activityPackage.setWaitBeforeSendTimeSeconds(activityPackage.getWaitBeforeSendTimeSeconds() + d10);
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void pauseSending() {
        this.paused = true;
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void resumeSending() {
        this.paused = false;
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void sendFirstPackage() {
        this.scheduler.submit(new v0(this, 1));
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void teardown() {
        this.logger.verbose("PackageHandler teardown", new Object[0]);
        ThreadScheduler threadScheduler = this.scheduler;
        if (threadScheduler != null) {
            threadScheduler.teardown();
        }
        WeakReference<IActivityHandler> weakReference = this.activityHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        List<ActivityPackage> list = this.packageQueue;
        if (list != null) {
            list.clear();
        }
        this.scheduler = null;
        this.activityHandlerWeakRef = null;
        this.packageQueue = null;
        this.isSending = null;
        this.context = null;
        this.logger = null;
        this.backoffStrategy = null;
    }
}
