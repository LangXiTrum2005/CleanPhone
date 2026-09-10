package com.appsflyer.internal;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.ironsource.Ie;
import com.ironsource.X3;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p002kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public class AFi1aSDK extends AFi1cSDK {
    final ExecutorService AFAdRevenueData;
    public final Map<String, Object> getMonetizationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1aSDK$3, reason: invalid class name */
    public class AnonymousClass3 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        public AnonymousClass3(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i) {
            AFi1aSDK.this.getMonetizationNetwork(installReferrerClient, context, i);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install Referrer service disconnected");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i) {
            ExecutorService executorService = AFi1aSDK.this.AFAdRevenueData;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.dovishness
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17374kowloon.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i);
                }
            });
        }
    }

    public AFi1aSDK(Runnable runnable, ExecutorService executorService, AFc1oSDK aFc1oSDK) {
        super(X3.i.U, AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, aFc1oSDK, runnable);
        this.getMonetizationNetwork = new HashMap();
        this.AFAdRevenueData = executorService;
    }

    private boolean getRevenue(Context context) {
        if (!getRevenue()) {
            return false;
        }
        try {
            if (AFj1kSDK.getMonetizationNetwork(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e);
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
            StringBuilder sb = new StringBuilder("Class ");
            sb.append("com.android.installreferrer.api.InstallReferrerClient");
            sb.append(" not found");
            aFLogger.v(aFg1cSDK, sb.toString());
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(Context context) {
        if (getRevenue(context)) {
            this.component1 = System.currentTimeMillis();
            this.component4 = AFj1tSDK.AFa1tSDK.STARTED;
            addObserver(new AFj1tSDK.AnonymousClass1());
            try {
                InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
                AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Connecting to Install Referrer Library...");
                installReferrerClientBuild.startConnection(new AnonymousClass3(installReferrerClientBuild, context));
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "referrerClient -> startConnection", th);
            }
        }
    }

    public final void getMonetizationNetwork(InstallReferrerClient installReferrerClient, Context context, int i) {
        this.getMonetizationNetwork.put("code", String.valueOf(i));
        Pair<Long, String> mediationNetwork = AFj1kSDK.getMediationNetwork(context, "com.android.vending");
        this.getMediationNetwork.put("api_ver", mediationNetwork.getFirst());
        this.getMediationNetwork.put("api_ver_name", mediationNetwork.getSecond());
        if (i == -1) {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.getMediationNetwork.put(Ie.n, "SERVICE_DISCONNECTED");
        } else if (i == 0) {
            this.getMediationNetwork.put(Ie.n, "OK");
            try {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
                aFLogger.d(aFg1cSDK, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.getMonetizationNetwork.put("val", installReferrer2);
                        this.getMediationNetwork.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    this.getMonetizationNetwork.put("clk", Long.toString(referrerClickTimestampSeconds));
                    this.getMediationNetwork.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    this.getMonetizationNetwork.put("install", Long.toString(installBeginTimestampSeconds));
                    this.getMediationNetwork.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap map = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        this.getMonetizationNetwork.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        map.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e);
                    }
                    try {
                        map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        map.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e2) {
                        AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "some method not exist", e2, false, false);
                    }
                    if (!map.isEmpty()) {
                        this.getMediationNetwork.put("google_custom", map);
                    }
                    installReferrerClient.endConnection();
                } else {
                    aFLogger.w(aFg1cSDK, "ReferrerClient: InstallReferrer is not ready");
                    this.getMonetizationNetwork.put(NotificationCompat.CATEGORY_ERROR, "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th) {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                StringBuilder sb = new StringBuilder("Failed to get install referrer: ");
                sb.append(th.getMessage());
                aFLogger2.w(aFg1cSDK2, sb.toString());
                this.getMonetizationNetwork.put(NotificationCompat.CATEGORY_ERROR, th.getMessage());
                aFLogger2.e(aFg1cSDK2, "Failed to get install referrer", th, false, false);
            }
        } else if (i == 1) {
            this.getMediationNetwork.put(Ie.n, "SERVICE_UNAVAILABLE");
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer not supported");
        } else if (i == 2) {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.getMediationNetwork.put(Ie.n, "FEATURE_NOT_SUPPORTED");
        } else if (i != 3) {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "responseCode not found.");
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.getMediationNetwork.put(Ie.n, "DEVELOPER_ERROR");
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install Referrer collected locally");
        getMediationNetwork();
    }
}
