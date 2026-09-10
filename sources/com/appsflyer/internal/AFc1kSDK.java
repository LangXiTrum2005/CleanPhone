package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1kSDK {
    private static final patroclinal.taiyuan getMediationNetwork = p002kotlin.saneness.saneness(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFc1kSDK.5
        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    });

    public static final ExecutorService getCurrencyIso4217Code() {
        AFc1jSDK aFc1jSDK = new AFc1jSDK(1, 4, 30L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
        aFc1jSDK.allowCoreThreadTimeOut(true);
        return aFc1jSDK;
    }

    public static final ExecutorService getMediationNetwork() {
        Object value = getMediationNetwork.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (ExecutorService) value;
    }

    public static final ScheduledExecutorService getMonetizationNetwork() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "");
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static final ScheduledExecutorService getRevenue() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "");
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }
}
