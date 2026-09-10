package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFe1fSDK<Result> extends AFe1mSDK<AFe1wSDK<Result>> {
    public AFe1wSDK<Result> areAllFieldsValid;
    public final AFf1eSDK component1;
    private AFc1tSDK component2;
    protected final AFd1oSDK component3;
    protected final AFd1nSDK component4;
    private String hashCode;

    private AFe1fSDK(AFe1pSDK aFe1pSDK, AFe1pSDK[] aFe1pSDKArr, AFd1nSDK aFd1nSDK, AFf1eSDK aFf1eSDK, AFd1oSDK aFd1oSDK, AFc1tSDK aFc1tSDK, String str) {
        super(aFe1pSDK, aFe1pSDKArr, str);
        this.component4 = aFd1nSDK;
        this.component1 = aFf1eSDK;
        this.component3 = aFd1oSDK;
        this.component2 = aFc1tSDK;
    }

    private void getCurrencyIso4217Code(AFd1bSDK aFd1bSDK) {
        String str = this.hashCode;
        this.hashCode = this.component2.getMediationNetwork(new AFc1uSDK(aFd1bSDK.getMediationNetwork, aFd1bSDK.getRevenue(), "6.17.5", this.getRevenue, aFd1bSDK.AFAdRevenueData));
        if (str != null) {
            this.component2.getRevenue(str);
        }
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public long AFAdRevenueData() {
        return ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
    }

    public abstract AFd1hSDK<Result> AFAdRevenueData(String str);

    public boolean a_() {
        return true;
    }

    public abstract AppsFlyerRequestListener component2();

    public abstract boolean copydefault();

    @Override // com.appsflyer.internal.AFe1mSDK
    public final void getMediationNetwork() {
        String mediationNetwork;
        super.getMediationNetwork();
        if (!copydefault() || (mediationNetwork = this.component1.getMediationNetwork()) == null || mediationNetwork.trim().isEmpty()) {
            return;
        }
        AFd1hSDK<Result> aFd1hSDKAFAdRevenueData = AFAdRevenueData(mediationNetwork);
        if (aFd1hSDKAFAdRevenueData != null) {
            getCurrencyIso4217Code(aFd1hSDKAFAdRevenueData.getMonetizationNetwork);
        } else {
            AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, "Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"), false, false);
        }
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public boolean getMonetizationNetwork() {
        if (component1() instanceof AFe1iSDK) {
            return false;
        }
        if (this.getMonetizationNetwork == AFe1uSDK.TIMEOUT) {
            return true;
        }
        Throwable thComponent1 = component1();
        return (thComponent1 instanceof IOException) && !(thComponent1 instanceof ParsingException);
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public AFe1uSDK getRevenue() throws Exception {
        if (a_() && this.component1.getCurrencyIso4217Code()) {
            AppsFlyerRequestListener appsFlyerRequestListenerComponent2 = component2();
            if (appsFlyerRequestListenerComponent2 != null) {
                appsFlyerRequestListenerComponent2.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFe1iSDK();
        }
        String mediationNetwork = this.component1.getMediationNetwork();
        if (mediationNetwork == null || mediationNetwork.trim().isEmpty()) {
            AppsFlyerRequestListener appsFlyerRequestListenerComponent3 = component2();
            if (appsFlyerRequestListenerComponent3 != null) {
                appsFlyerRequestListenerComponent3.onError(41, "No dev key");
            }
            throw new AFe1nSDK();
        }
        AFd1hSDK<Result> aFd1hSDKAFAdRevenueData = AFAdRevenueData(mediationNetwork);
        if (aFd1hSDKAFAdRevenueData == null) {
            AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, "Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"), false, false);
            return AFe1uSDK.FAILURE;
        }
        if (copydefault()) {
            getCurrencyIso4217Code(aFd1hSDKAFAdRevenueData.getMonetizationNetwork);
        }
        AFe1wSDK<Result> currencyIso4217Code = aFd1hSDKAFAdRevenueData.getCurrencyIso4217Code();
        this.areAllFieldsValid = currencyIso4217Code;
        this.component3.AFAdRevenueData(aFd1hSDKAFAdRevenueData.getMonetizationNetwork.getMediationNetwork, currencyIso4217Code.getStatusCode(), currencyIso4217Code.getBody().toString());
        AppsFlyerRequestListener appsFlyerRequestListenerComponent4 = component2();
        if (appsFlyerRequestListenerComponent4 != null) {
            if (currencyIso4217Code.isSuccessful()) {
                appsFlyerRequestListenerComponent4.onSuccess();
            } else {
                StringBuilder sb = new StringBuilder("Status code failure ");
                sb.append(currencyIso4217Code.getStatusCode());
                appsFlyerRequestListenerComponent4.onError(50, sb.toString());
            }
        }
        return currencyIso4217Code.isSuccessful() ? AFe1uSDK.SUCCESS : AFe1uSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final void AFAdRevenueData(Throwable th) {
        Throwable th2;
        boolean z = !(th instanceof HttpException);
        if (th instanceof AFe1iSDK) {
            th2 = th;
            AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th2, true, false);
        } else {
            th2 = th;
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
            aFLogger.e(aFg1cSDK, "Error while sending request to server: ".concat(String.valueOf(th2)), th2, false, false, z);
            aFLogger.w(aFg1cSDK, "Error while sending request to server: ".concat(String.valueOf(th2)));
        }
        AppsFlyerRequestListener appsFlyerRequestListenerComponent2 = component2();
        if (appsFlyerRequestListenerComponent2 != null) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            appsFlyerRequestListenerComponent2.onError(40, message);
        }
    }

    public AFe1fSDK(AFe1pSDK aFe1pSDK, AFe1pSDK[] aFe1pSDKArr, AFd1zSDK aFd1zSDK, String str) {
        this(aFe1pSDK, aFe1pSDKArr, aFd1zSDK.getRevenue(), aFd1zSDK.AFInAppEventType(), aFd1zSDK.copy(), aFd1zSDK.registerClient(), str);
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public void getCurrencyIso4217Code() {
        String str;
        if (this.getMonetizationNetwork == AFe1uSDK.SUCCESS) {
            String str2 = this.hashCode;
            if (str2 != null) {
                this.component2.getRevenue(str2);
                return;
            }
            return;
        }
        if (getMonetizationNetwork() || (str = this.hashCode) == null) {
            return;
        }
        this.component2.getRevenue(str);
    }

    public AFe1fSDK(AFe1pSDK aFe1pSDK, AFe1pSDK[] aFe1pSDKArr, AFd1zSDK aFd1zSDK, String str, String str2) {
        this(aFe1pSDK, aFe1pSDKArr, aFd1zSDK.getRevenue(), aFd1zSDK.AFInAppEventType(), aFd1zSDK.copy(), aFd1zSDK.registerClient(), str);
        this.hashCode = str2;
    }
}
