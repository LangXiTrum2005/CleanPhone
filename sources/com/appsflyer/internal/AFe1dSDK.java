package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1dSDK extends AFe1fSDK<String> {
    private final String component2;
    private final AFc1oSDK equals;
    private final AFk1vSDK toString;

    public AFe1dSDK(AFd1zSDK aFd1zSDK, String str, AFk1vSDK aFk1vSDK) {
        super(AFe1pSDK.IMPRESSIONS, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, str);
        this.component2 = str;
        this.toString = aFk1vSDK;
        this.equals = aFd1zSDK.AFAdRevenueData();
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AFd1hSDK<String> AFAdRevenueData(String str) {
        AFd1nSDK aFd1nSDK = ((AFe1fSDK) this).component4;
        String strAreAllFieldsValid = this.equals.areAllFieldsValid();
        return (AFd1hSDK) AFd1nSDK.getMediationNetwork(new Object[]{aFd1nSDK, AFk1wSDK.getMonetizationNetwork(strAreAllFieldsValid) ? this.component2 : Uri.parse(this.component2).buildUpon().appendQueryParameter("advertising_id", strAreAllFieldsValid).build().toString()}, 1535622589, -1535622589, System.identityHashCode(aFd1nSDK));
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFe1wSDK<Result> aFe1wSDK = ((AFe1fSDK) this).areAllFieldsValid;
        if (aFe1wSDK != 0) {
            int statusCode = aFe1wSDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb = new StringBuilder("Cross promotion impressions success: ");
                sb.append(this.component2);
                AFLogger.afInfoLog(sb.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                StringBuilder sb2 = new StringBuilder("call to ");
                sb2.append(this.component2);
                sb2.append(" failed: ");
                sb2.append(statusCode);
                AFLogger.afInfoLog(sb2.toString());
                return;
            }
            StringBuilder sb3 = new StringBuilder("Cross promotion redirection success: ");
            sb3.append(this.component2);
            AFLogger.afInfoLog(sb3.toString(), false);
            String revenue = aFe1wSDK.getRevenue("Location");
            AFk1vSDK aFk1vSDK = this.toString;
            if (aFk1vSDK == null || revenue == null) {
                return;
            }
            aFk1vSDK.getCurrencyIso4217Code = revenue;
            Context context = aFk1vSDK.getMonetizationNetwork.get();
            if (context != null) {
                try {
                    if (aFk1vSDK.getCurrencyIso4217Code != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFk1vSDK.getCurrencyIso4217Code)).setFlags(268435456));
                    }
                } catch (Exception e) {
                    AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e)), e);
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }
}
