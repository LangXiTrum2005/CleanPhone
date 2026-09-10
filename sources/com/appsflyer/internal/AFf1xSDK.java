package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.ironsource.L6;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1xSDK extends AFe1fSDK<DdlResponse> {
    private int AFInAppEventParameterName;
    private final CountDownLatch AFInAppEventType;
    private int AFKeystoreWrapper;
    private final List<AFj1tSDK> AFLogger;
    private final AFa1rSDK component2;
    private final AFh1xSDK copy;
    private final AFc1oSDK copydefault;
    private final AFj1sSDK equals;
    private final AFa1mSDK hashCode;
    private int registerClient;
    private final AFc1eSDK toString;

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getMonetizationNetwork;
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFe1uSDK.values().length];
            try {
                iArr[AFe1uSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1uSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getRevenue = iArr;
            int[] iArr2 = new int[AFj1tSDK.AFa1tSDK.values().length];
            try {
                iArr2[AFj1tSDK.AFa1tSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1tSDK.AFa1tSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            getMonetizationNetwork = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1xSDK(AFa1rSDK aFa1rSDK, AFd1zSDK aFd1zSDK) {
        super(AFe1pSDK.DLSDK, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.component2 = aFa1rSDK;
        this.AFInAppEventType = new CountDownLatch(1);
        this.AFLogger = new ArrayList();
        AFc1oSDK aFc1oSDKAFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(aFc1oSDKAFAdRevenueData, "");
        this.copydefault = aFc1oSDKAFAdRevenueData;
        AFc1eSDK aFc1eSDKForce = aFd1zSDK.force();
        Intrinsics.checkNotNullExpressionValue(aFc1eSDKForce, "");
        this.toString = aFc1eSDKForce;
        AFa1mSDK aFa1mSDKI = aFd1zSDK.i();
        Intrinsics.checkNotNullExpressionValue(aFa1mSDKI, "");
        this.hashCode = aFa1mSDKI;
        AFh1xSDK aFh1xSDKAreAllFieldsValid = aFd1zSDK.areAllFieldsValid();
        Intrinsics.checkNotNullExpressionValue(aFh1xSDKAreAllFieldsValid, "");
        this.copy = aFh1xSDKAreAllFieldsValid;
        AFj1sSDK aFj1sSDKAFLogger = aFd1zSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(aFj1sSDKAFLogger, "");
        this.equals = aFj1sSDKAFLogger;
        AFj1tSDK[] aFj1tSDKArr = (AFj1tSDK[]) aFj1sSDKAFLogger.getRevenue.toArray(new AFj1tSDK[0]);
        Intrinsics.checkNotNullExpressionValue(aFj1tSDKArr, "");
        ArrayList<AFj1tSDK> arrayList = new ArrayList();
        for (AFj1tSDK aFj1tSDK : aFj1tSDKArr) {
            if (aFj1tSDK != null && aFj1tSDK.component4 != AFj1tSDK.AFa1tSDK.NOT_STARTED) {
                arrayList.add(aFj1tSDK);
            }
        }
        this.AFInAppEventParameterName = arrayList.size();
        for (final AFj1tSDK aFj1tSDK2 : arrayList) {
            AFj1tSDK.AFa1tSDK aFa1tSDK = aFj1tSDK2.component4;
            int i = aFa1tSDK == null ? -1 : AFa1uSDK.getMonetizationNetwork[aFa1tSDK.ordinal()];
            if (i == 1) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1tSDK2.getMediationNetwork.get("source") + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFj1tSDK2, "");
                getCurrencyIso4217Code(aFj1tSDK2);
            } else if (i == 2) {
                aFj1tSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.adultoid
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFf1xSDK.getRevenue(aFj1tSDK2, this, observable, obj);
                    }
                });
            }
        }
    }

    private final boolean equals() {
        Object obj = this.component2.AFAdRevenueData.get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.AFInAppEventParameterName && !this.component2.AFAdRevenueData.containsKey("referrers");
    }

    private final void getCurrencyIso4217Code(AFj1tSDK aFj1tSDK) {
        if (!getRevenue(aFj1tSDK)) {
            int i = this.AFKeystoreWrapper + 1;
            this.AFKeystoreWrapper = i;
            if (i == this.AFInAppEventParameterName) {
                this.AFInAppEventType.countDown();
                return;
            }
            return;
        }
        this.AFLogger.add(aFj1tSDK);
        this.AFInAppEventType.countDown();
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Added non-organic " + aFj1tSDK.getClass().getSimpleName(), false, 4, null);
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return this.hashCode.component2;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() {
        AFe1uSDK aFe1uSDK = AFe1uSDK.FAILURE;
        try {
            AFe1uSDK revenue = super.getRevenue();
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            try {
                AFh1xSDK aFh1xSDK = this.copy;
                int i = this.registerClient;
                if (i <= 0 || i > 2) {
                    AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
                } else {
                    int i2 = i - 1;
                    aFh1xSDK.component2[i2] = System.currentTimeMillis();
                    long j = aFh1xSDK.component3[i2];
                    if (j != 0) {
                        long[] jArr = aFh1xSDK.component1;
                        jArr[i2] = aFh1xSDK.component2[i2] - j;
                        aFh1xSDK.getMediationNetwork.put("net", jArr);
                    } else {
                        StringBuilder sb = new StringBuilder("Metrics: ddlStart[");
                        sb.append(i2);
                        sb.append("] ts is missing");
                        AFLogger.afInfoLog(sb.toString());
                    }
                }
                int i3 = AFa1uSDK.getRevenue[revenue.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        return revenue;
                    }
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
                    ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
                    AFh1ySDK.d$default(aFLogger, aFg1cSDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                    DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                    this.copy.getCurrencyIso4217Code(deepLinkResult, this.hashCode.component2);
                    this.hashCode.getRevenue(deepLinkResult);
                    return revenue;
                }
                ResponseNetwork responseNetwork2 = ((AFe1fSDK) this).areAllFieldsValid;
                Intrinsics.beachfront(responseNetwork2);
                Object body = responseNetwork2.getBody();
                Intrinsics.checkNotNullExpressionValue(body, "");
                DdlResponse ddlResponse = (DdlResponse) body;
                DeepLink deepLink = ddlResponse.deepLink;
                if (deepLink != null) {
                    DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                    this.copy.getCurrencyIso4217Code(deepLinkResult2, this.hashCode.component2);
                    this.hashCode.getRevenue(deepLinkResult2);
                    return revenue;
                }
                if (this.registerClient > 1 || !ddlResponse.getSecondPing() || !equals()) {
                    DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                    this.copy.getCurrencyIso4217Code(deepLinkResult3, this.hashCode.component2);
                    this.hashCode.getRevenue(deepLinkResult3);
                    return revenue;
                }
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Waiting for referrers...", false, 4, null);
                this.AFInAppEventType.await();
                AFh1xSDK aFh1xSDK2 = this.copy;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = aFh1xSDK2.component2[0];
                if (j2 != 0) {
                    aFh1xSDK2.getMediationNetwork.put("rfr_wait", Long.valueOf(jCurrentTimeMillis - j2));
                } else {
                    AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                }
                if (this.AFKeystoreWrapper != this.AFInAppEventParameterName) {
                    return getRevenue();
                }
                DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
                this.copy.getCurrencyIso4217Code(deepLinkResult4, this.hashCode.component2);
                this.hashCode.getRevenue(deepLinkResult4);
                return AFe1uSDK.SUCCESS;
            } catch (Exception e) {
                e = e;
                aFe1uSDK = revenue;
                Throwable cause = e.getCause();
                if (cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException) {
                    AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.registerClient + " attempt(s) within " + this.hashCode.component2 + " milliseconds", false, 4, null);
                    DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                    this.copy.getCurrencyIso4217Code(deepLinkResult5, this.hashCode.component2);
                    this.hashCode.getRevenue(deepLinkResult5);
                    return AFe1uSDK.TIMEOUT;
                }
                if (cause instanceof IOException) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                    DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                    this.copy.getCurrencyIso4217Code(deepLinkResult6, this.hashCode.component2);
                    this.hashCode.getRevenue(deepLinkResult6);
                    return aFe1uSDK;
                }
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Unexpected Exception: " + e, false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                this.copy.getCurrencyIso4217Code(deepLinkResult7, this.hashCode.component2);
                this.hashCode.getRevenue(deepLinkResult7);
                return aFe1uSDK;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0150  */
    @Override // com.appsflyer.internal.AFe1fSDK
    public final AFd1hSDK<DdlResponse> AFAdRevenueData(String str) {
        Map mapImpassible;
        String[] strArr;
        Intrinsics.checkNotNullParameter(str, "");
        int i = this.registerClient + 1;
        this.registerClient = i;
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Preparing request " + i, false, 4, null);
        Map<String, Object> map = this.component2.AFAdRevenueData;
        if (this.registerClient == 1) {
            map.put("is_first", Boolean.valueOf(this.copydefault.getMediationNetwork.getRevenue("appsFlyerCount", 0) == 0));
            map.put(L6.q, Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry());
            map.put(L6.F, Build.VERSION.RELEASE);
            map.put("type", Build.MODEL);
            map.put("request_id", AFb1kSDK.getCurrencyIso4217Code(this.copydefault.getMediationNetwork));
            AFb1tSDK aFb1tSDK = this.toString.getRevenue;
            if (aFb1tSDK != null && (strArr = aFb1tSDK.AFAdRevenueData) != null) {
                Intrinsics.checkNotNullExpressionValue(strArr, "");
                map.put("sharing_filter", strArr);
            }
            AdvertisingIdData advertisingIdData = this.copydefault.getMonetizationNetwork.component3;
            Map<String, String> currencyIso4217Code = getCurrencyIso4217Code(advertisingIdData != null ? new AFb1jSDK(advertisingIdData.advertisingId, advertisingIdData.isLimited) : null);
            if (currencyIso4217Code != null) {
                map.put(L6.V0, currencyIso4217Code);
            }
            Map<String, String> currencyIso4217Code2 = getCurrencyIso4217Code(AFb1lSDK.getMediationNetwork(this.copydefault.getCurrencyIso4217Code.getMonetizationNetwork));
            if (currencyIso4217Code2 != null) {
                map.put("oaid", currencyIso4217Code2);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map.put("timestamp", simpleDateFormat.format(new Date(jCurrentTimeMillis)));
        map.put("request_count", Integer.valueOf(this.registerClient));
        List<AFj1tSDK> list = this.AFLogger;
        ArrayList arrayList = new ArrayList();
        for (AFj1tSDK aFj1tSDK : list) {
            if (aFj1tSDK.component4 == AFj1tSDK.AFa1tSDK.FINISHED) {
                Object obj = aFj1tSDK.getMediationNetwork.get("referrer");
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    Object obj2 = aFj1tSDK.getMediationNetwork.get("source");
                    Intrinsics.competently(obj2, "");
                    mapImpassible = p002kotlin.collections.seminary.impassible(patroclinal.formularize.attabal("source", (String) obj2), patroclinal.formularize.attabal("value", str2));
                } else {
                    mapImpassible = null;
                }
            } else {
                mapImpassible = null;
            }
            if (mapImpassible != null) {
                arrayList.add(mapImpassible);
            }
        }
        if (!arrayList.isEmpty()) {
            map.put("referrers", arrayList);
        }
        AFa1rSDK aFa1rSDK = this.component2;
        AFj1cSDK aFj1cSDK = new AFj1cSDK(this.copydefault, null, 2, null);
        String mediationNetwork = ((AFe1fSDK) this).component1.getMediationNetwork();
        Object obj3 = this.component2.AFAdRevenueData.get("timestamp");
        Intrinsics.competently(obj3, "");
        aFa1rSDK.component2 = aFj1cSDK.getMonetizationNetwork(mediationNetwork, (String) obj3);
        AFh1xSDK aFh1xSDK = this.copy;
        int i2 = this.registerClient;
        if (i2 > 0 && i2 <= 2) {
            int i3 = i2 - 1;
            aFh1xSDK.component3[i3] = System.currentTimeMillis();
            if (i3 == 0) {
                long j = aFh1xSDK.component4;
                if (j != 0) {
                    aFh1xSDK.getMediationNetwork.put("from_fg", Long.valueOf(aFh1xSDK.component3[i3] - j));
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
            }
        } else {
            AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i2))));
        }
        AFd1hSDK<DdlResponse> monetizationNetwork = ((AFe1fSDK) this).component4.getMonetizationNetwork(this.component2);
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        return monetizationNetwork;
    }

    private static Map<String, String> getCurrencyIso4217Code(AFb1jSDK aFb1jSDK) {
        String str;
        if (aFb1jSDK == null || (str = aFb1jSDK.getRevenue) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1jSDK.getCurrencyIso4217Code;
        if (bool == null || !bool.booleanValue()) {
            return p002kotlin.collections.seminary.impassible(patroclinal.formularize.attabal("type", "unhashed"), patroclinal.formularize.attabal("value", str));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFj1tSDK aFj1tSDK, AFf1xSDK aFf1xSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1xSDK, "");
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1tSDK.getMediationNetwork.get("source") + " referrer collected via observer", false, 4, null);
        Intrinsics.competently(observable, "");
        aFf1xSDK.getCurrencyIso4217Code((AFj1tSDK) observable);
    }

    private static boolean getRevenue(AFj1tSDK aFj1tSDK) {
        Object obj = aFj1tSDK.getMediationNetwork.get("click_ts");
        Long l = obj instanceof Long ? (Long) obj : null;
        if (l != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }
}
