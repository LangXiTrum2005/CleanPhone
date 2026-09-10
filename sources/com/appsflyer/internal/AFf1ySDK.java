package com.appsflyer.internal;

import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFPurchaseType;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001*BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u0017\u001a\u000e\u0012\b\u0012\u0006*\u00020\t0\t\u0018\u00010\u00162\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00020\t2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0019\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0019\u0010\u001eR\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFf1ySDK;", "Lcom/appsflyer/internal/AFe1jSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "p0", "Lcom/appsflyer/AppsFlyerProperties;", "p1", "Lcom/appsflyer/AFPurchaseDetails;", "p2", "", "", "p3", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "p4", "Lcom/appsflyer/internal/AFj1iSDK;", "p5", "<init>", "(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;Lcom/appsflyer/internal/AFj1iSDK;)V", "", "", "", "getMonetizationNetwork", "(Ljava/util/Map;Ljava/lang/String;)V", "Lcom/appsflyer/internal/AFd1hSDK;", "getRevenue", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1hSDK;", "getCurrencyIso4217Code", "(Ljava/util/Map;)Ljava/lang/String;", "", "getMediationNetwork", "(Ljava/lang/String;I)V", "()V", "hashCode", "Ljava/util/Map;", "copydefault", "Lcom/appsflyer/internal/AFj1iSDK;", "equals", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "AFAdRevenueData", "component2", "Lcom/appsflyer/AppsFlyerProperties;", "toString", "Lcom/appsflyer/AFPurchaseDetails;", "AFa1tSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFf1ySDK extends AFe1jSDK {

    /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
    private final AppsFlyerProperties getRevenue;

    /* JADX INFO: renamed from: copydefault, reason: from kotlin metadata */
    private final AFj1iSDK getMonetizationNetwork;

    /* JADX INFO: renamed from: equals, reason: from kotlin metadata */
    private final AppsFlyerInAppPurchaseValidationCallback AFAdRevenueData;

    /* JADX INFO: renamed from: hashCode, reason: from kotlin metadata */
    private final Map<String, String> getCurrencyIso4217Code;

    /* JADX INFO: renamed from: toString, reason: from kotlin metadata */
    private final AFPurchaseDetails getMediationNetwork;

    public static final class AFa1tSDK extends RuntimeException {
    }

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFPurchaseType.values().length];
            try {
                iArr[AFPurchaseType.SUBSCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFPurchaseType.ONE_TIME_PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getRevenue = iArr;
        }
    }

    public /* synthetic */ AFf1ySDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1iSDK aFj1iSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i & 32) != 0 ? new AFj1hSDK() : aFj1iSDK);
    }

    private final void getMediationNetwork(String p0, int p1) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.AFAdRevenueData;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(p002kotlin.collections.seminary.impassible(patroclinal.formularize.attabal("error_code", Integer.valueOf(p1)), patroclinal.formularize.attabal("error_message", p0)));
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        Object objM3351constructorimpl;
        Unit unit;
        super.getCurrencyIso4217Code();
        Throwable thComponent1 = component1();
        if (thComponent1 != null && !(thComponent1 instanceof AFe1iSDK)) {
            if (thComponent1 instanceof AFe1nSDK) {
                getMediationNetwork("No dev key", -1);
            } else if (thComponent1 instanceof AFa1tSDK) {
                getMediationNetwork("One or more of provided arguments is empty", -1);
            } else {
                getMediationNetwork("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.AFAdRevenueData;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(p002kotlin.collections.seminary.impassible(patroclinal.formularize.attabal("error_code", Integer.valueOf(responseNetwork.getStatusCode())), patroclinal.formularize.attabal("error_message", responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.AFAdRevenueData;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(AFj1bSDK.getMonetizationNetwork(new JSONObject((String) responseNetwork.getBody())));
                    unit = Unit.f29295attabal;
                } else {
                    unit = null;
                }
                objM3351constructorimpl = Result.m3351constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
            if (Result.m3354exceptionOrNullimpl(objM3351constructorimpl) != null) {
                getMediationNetwork("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
            Result.m3350boximpl(objM3351constructorimpl);
        }
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    public final void getMonetizationNetwork(Map<String, Object> p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.getMonetizationNetwork(p0, p1);
        List listKowloon = p002kotlin.collections.adultoid.kowloon(this.getMediationNetwork.getPurchaseToken(), this.getMediationNetwork.getProductId());
        if (!(listKowloon instanceof Collection) || !listKowloon.isEmpty()) {
            Iterator it = listKowloon.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1tSDK();
                }
            }
        }
        p0.put("purchase_token", this.getMediationNetwork.getPurchaseToken());
        p0.put("product_id", this.getMediationNetwork.getProductId());
        p0.put("purchase_type", this.getMediationNetwork.getPurchaseType().getValue());
        Map<String, String> map = this.getCurrencyIso4217Code;
        if (map != null && !map.isEmpty()) {
            p0.put("purchase_additional_details", this.getCurrencyIso4217Code);
        }
        String string = this.getRevenue.getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        p0.put("custom_data", (string == null || string.length() == 0) ? p002kotlin.collections.seminary.taiyuan() : AFj1bSDK.getMonetizationNetwork(new JSONObject(string)));
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    public final AFd1hSDK<String> getRevenue(Map<String, Object> p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        int i = AFa1ySDK.getRevenue[this.getMediationNetwork.getPurchaseType().ordinal()];
        if (i == 1) {
            return ((AFe1fSDK) this).component4.getCurrencyIso4217Code(p0, p1);
        }
        if (i == 2) {
            return ((AFe1fSDK) this).component4.getMonetizationNetwork(p0, p1);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFf1ySDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1iSDK aFj1iSDK) {
        super(AFe1pSDK.MANUAL_PURCHASE_VALIDATION, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, null, p002kotlin.collections.seminary.taiyuan());
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
        Intrinsics.checkNotNullParameter(aFj1iSDK, "");
        this.getRevenue = appsFlyerProperties;
        this.getMediationNetwork = aFPurchaseDetails;
        this.getCurrencyIso4217Code = map;
        this.AFAdRevenueData = appsFlyerInAppPurchaseValidationCallback;
        this.getMonetizationNetwork = aFj1iSDK;
        this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFf1ySDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    public final String getCurrencyIso4217Code(Map<String, Object> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.getMonetizationNetwork.getMediationNetwork();
    }
}
